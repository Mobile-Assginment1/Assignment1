package edu.birzeit.example.project.Model;

import java.util.ArrayList;

public class tourData implements Itours{
    @Override
    public ArrayList<tours> getAvailableToursList() {
        ArrayList<tours> availableToursList= new ArrayList<>();
        availableToursList.add(new tours("مسار محمية القرن","p4","يبـدأ هـذا المسـار مـن شـرقي قريـة بيـت أمـر الواقعـة الـى الشـمال مـن مدينـة الخليـل ، وذلـك بالقـرب مـن مسـجد القريـة الكبيـر. ويتحرك الزائــر شــرقا نحــو محميــة القــرن، مــن نقطــة جنــوب غــرب المحميــة، ليمـر عنـد شـجرة الخـروب الوحيـدة فـي المحميـة، وتغطـي النبـات حوالـي %68 مـن مسـاحة المحميـة، بينمـا الباقـي مناطقـة صخريـة وعـرة متكشـفة.","مناسب للمجموعات."));
        availableToursList.add(new tours("مسار دير رازح ","p5","يبــدأ المســار مــن غــرب القريــة، بالقــرب مــن طريــق 60 ،الممتــد عنــد بدايــة الــوادي الفاصــل بيــن قمتــي ديــر رازح وحــدب الفــوار، ويقــوم الزائــر بالصعــود التدريجــي عبــر طــرق مهدتهــا خطــوات كثيــرة مــرت بالمــكان، وفــي بدايــة هــذا المســار يــرى الزائــر الســفح الغربــي تكســوه أشــجار الســرو، والصنوبــر، وال يخلــو المشــهد مــن أشــجار أخــرى أصيلــة فــي حــوض البحــر األبيــض المتوســط، كالبلــوط، والســويد، والخــروب وغيرهــا.\n","يوجد موقف للسيارات."));
        availableToursList.add(new tours("مسار بتير","p1", " يبدأ من منطقة \"المخرور\" في بيت جالا وينتهي في بلدة بتير، مروراً بالمناظر الطبيعية وعيون المياه والمدرجات المائية، وصولاً إلى سكة الحديد، وهم من المسارات العائلية السهلة ومسافته 5 كم.","مناسب للأطفال والمجموعات."));
        availableToursList.add(new tours("مسار برقين","p2"," يبدأ هذا المسار من قرية برقين في محافظة جنين، ويمر بكنيسة برقين رابع أقدم كنيسة في العالم، مروراً بسهل مرج بني عامر، وسهل صانور، وحتى بلدة عرابة، وهو مسار متوسط الصعوبة على مسافة 15 كم، وهو جزء من المسار الشهير \"مسار إبراهيم الخليل\".", "مناسب للأطفال والمجموعات، يوجد موقف للسيارات."));
        availableToursList.add(new tours(" مسار وادي القلط","p3","مسار طويل إلا أن أجمل مقطع منه يبدأ من السفوح الشرقية لجبال القدس بالتحديد عند عين الفوار مروراً في ثنايا الوادي، ونزولاً برفقة المياه الجارية والطبيعة الخلابة والكهوف الأثرية في أعالي الجبال المجاورة حتى دير القلط الأثري، وهو مسار متوسط إلى صعب ومسافته تصل إلى نحو 18 كم.","مناسب للأطفال والمجموعات."));

        return availableToursList;
    }

    @Override
    public ArrayList<tours> getSuggestedToursList() {
        ArrayList<tours> suggestedToursList= new ArrayList<>();
        suggestedToursList.add(new tours("مسار بتير","p1", " يبدأ من منطقة \"المخرور\" في بيت جالا وينتهي في بلدة بتير، مروراً بالمناظر الطبيعية وعيون المياه والمدرجات المائية، وصولاً إلى سكة الحديد، وهم من المسارات العائلية السهلة ومسافته 5 كم.","مناسب للأطفال والمجموعات."));
        suggestedToursList.add(new tours("مسار برقين","p2"," يبدأ هذا المسار من قرية برقين في محافظة جنين، ويمر بكنيسة برقين رابع أقدم كنيسة في العالم، مروراً بسهل مرج بني عامر، وسهل صانور، وحتى بلدة عرابة، وهو مسار متوسط الصعوبة على مسافة 15 كم، وهو جزء من المسار الشهير \"مسار إبراهيم الخليل\".", "مناسب للأطفال والمجموعات، يوجد موقف للسيارات."));
        suggestedToursList.add(new tours(" مسار وادي القلط","p3","مسار طويل إلا أن أجمل مقطع منه يبدأ من السفوح الشرقية لجبال القدس بالتحديد عند عين الفوار مروراً في ثنايا الوادي، ونزولاً برفقة المياه الجارية والطبيعة الخلابة والكهوف الأثرية في أعالي الجبال المجاورة حتى دير القلط الأثري، وهو مسار متوسط إلى صعب ومسافته تصل إلى نحو 18 كم.","مناسب للأطفال والمجموعات."));
        return suggestedToursList;
    }
}
