package edu.birzeit.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.airbnb.lottie.LottieAnimationView;
import com.airbnb.lottie.LottieDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

import java.util.ArrayList;

import edu.birzeit.example.project.Model.IUsersData;
import edu.birzeit.example.project.Model.Itours;
import edu.birzeit.example.project.Model.Users;
import edu.birzeit.example.project.Model.UsersData;
import edu.birzeit.example.project.Model.tourData;
import edu.birzeit.example.project.Model.tours;
import edu.birzeit.example.project.MyAdabter.availableAdapter;
import edu.birzeit.example.project.MyAdabter.suggestedAdapter;

public class toursActivity extends AppCompatActivity {
    private RecyclerView.Adapter adapter,adapter1;
    private RecyclerView suggestedRecycler, availableRecycler;
    LottieAnimationView walkLottie;

    public static Users userInApp = new Users() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tours);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.drawable.logo);
        BottomNavigationView bottom_nav=findViewById(R.id.navBar);
        bottom_nav.setSelectedItemId(R.id.mainMenu);
        bottom_nav.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.mainMenu:
                        return true;
                    case R.id.fav:
                        startActivity(new Intent(getApplicationContext(), Favourite.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.account:
                        startActivity(new Intent(getApplicationContext(), ProfileActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });
        walkLottie=findViewById(R.id.walkLottie);
        walkLottie.setRepeatCount(LottieDrawable.INFINITE);
        walkLottie.playAnimation();

        recyclerViewSuggested();
        recyclerViewAvailable();


        if(userInApp.getId()==-1) {
            //InProfile ................................//
            //Users Who LoginIn || Sign Up  From LoginActivity :
            IUsersData userData = new UsersData();
            Intent intent = getIntent();
            String user_email = intent.getStringExtra("Users");
            Users user_login = userData.SearchForUserByEmail(user_email);
            Log.i("name Email is ", "From Login -->" + user_login.toString());


            if (user_login.getId() == -1) {//User is New
                Users newUser = (Users) intent.getSerializableExtra("NewUser");
                Log.i("name Email is", " From SginUp--> " + newUser.toString());
                userInApp = newUser;
                //AddAllUser ......
                //userData.AddNewUser(newUser);
            } else {
                Log.i("name Email is ", "From Login -->" + user_login.toString());
                userInApp = user_login;
            }
        }


    }

    private void recyclerViewAvailable() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        availableRecycler=findViewById(R.id.rv2);
        availableRecycler.setLayoutManager(linearLayoutManager);
        Itours tours1=new tourData();
        ArrayList<tours> toursList= tours1.getAvailableToursList();
        adapter1=new availableAdapter(toursList);
        availableRecycler.setAdapter(adapter1);
    }


    private void recyclerViewSuggested() {
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        suggestedRecycler=findViewById(R.id.rv1);
        suggestedRecycler.setLayoutManager(linearLayoutManager);
        Itours tours2=new tourData();
        ArrayList<tours> toursList= tours2.getSuggestedToursList();
        adapter=new suggestedAdapter(toursList);
        suggestedRecycler.setAdapter(adapter);
    }

}
