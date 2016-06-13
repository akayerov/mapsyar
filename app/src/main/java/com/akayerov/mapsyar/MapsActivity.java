package com.akayerov.mapsyar;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;


import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.MarkerOptions;

import java.util.ArrayList;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {
    private GoogleMap mMap;
    private Sdate sdate;
    ArrayList<Location> mesto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);

    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;
/*
        AssetManager am = getAssets();
        Sdate fdate = new Sdate(am);
        String s = fdate.ReadData();
*/
        mesto = new ArrayList();
        // Yaroslavl start point
        Location yaroslavl = new Location("Ярославль", "Ярославль", 0, 39.8922, 57.6259);

        setLocation(mesto);

        setMarkers(mesto,0);



        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(yaroslavl.getPosition(), 14.0f));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setZoomControlsEnabled(true);
        CameraUpdateFactory.zoomTo(14.0f);

        setMarkers(mesto,1);

    }

    private void setLocation(ArrayList<Location> mesto) {
        mesto.add(new Location("Церковь Петра Митрополита","1657 г.",3,39.87930468,57.62031176));
        mesto.add(new Location("Церковь Параскевы Пятницы на Туговой горе","1692 г.",3,39.89190028,57.60479612));
        mesto.add(new Location("Церковь Иоанна Предтечи в Толчкове Колокольня","1690-е гг.",3,39.8564954,57.61062485));
        mesto.add(new Location("Церковь Богоявления","1684-1697 гг.",3,39.88635575,57.62162095));
        mesto.add(new Location("Монастырь Спасо-Преображенский Собор Спасо-Преображенский","1506-1516 гг., 17 в.",3,39.88934386,57.62150394));
        mesto.add(new Location("Храмовый комплекс 'в Коровниках' Церковь Владимирская","1669 г.",3,39.90640388,57.61118026));
        mesto.add(new Location("Храмовый комплекс: церковь Вознесения Господня","1677-1682 гг.",3,39.87104569,57.62648631));
        mesto.add(new Location("Монастырь Толгский Башня святых ворот южная","17 в.",3,39.82655677,57.69636524));
        mesto.add(new Location("Храмовый комплекс Церковь Рождества Христова","1636-1644 гг., 1750-е гг., 1831-1832 гг.",3,39.89429027,57.63050763));
        mesto.add(new Location("Церковь Иоанна Предтечи в Толчкове Святые ворота","1690-е гг.",3,39.85606784,57.61083415));
        mesto.add(new Location("Церковь Спаса Нерукотворного ('Спасо-Пробоинская')","1696-1705 гг.",3,39.89555925,57.62504097));
        mesto.add(new Location("Дом Масленникова","кон. 17 - нач. 18 вв., 19 в.",2,39.89393508,57.6312813));
        mesto.add(new Location("Монастырь Толгский Башня западная","17 в.",3,39.82621225,57.696815));
        mesto.add(new Location("Дом Иванова","2-я пoл. 17 в.",2,39.87122225,57.62111139));
        mesto.add(new Location("Палаты митрополичьи","1670-е-1680 гг.",3,39.9021903,57.62335042));
        mesto.add(new Location("Монастырь Толгский Башня северо-западная","17 в.",3,39.82585316,57.69720791));
        mesto.add(new Location("Башня Волжская (Арсенальная)","1658-1669 гг., 1842 г.",2,39.90158888,57.62499849));
        mesto.add(new Location("Монастырь Спасо-Преображенский Трапезная с церковью Рождества Христова (Крестовой) и с настоятельскими покоями","1-я треть 16 в., кон. 16 в., 1-я пол. 17 в., 1809 г., 1890 г.",3,39.88851664,57.62116553));
        mesto.add(new Location("Храмовый комплекс Церковь-колокольня мучениковГурия, Самона и священномученика Авива","1650-е-1660-е гг.",3,39.8937981,57.63033972));
        mesto.add(new Location("Монастырь Толгский Башня западная воротная","17 в.",3,39.82698939,57.69594277));
        mesto.add(new Location("Монастырь Толгский Башня северо-восточная","17 в.",3,39.8277374,57.69769288));
        mesto.add(new Location("Церковь Николая Чудотворца ('Николы Надеина')","1620-1622 гг., 1695 г., 1836 г., 1873 г.",3,39.89590094,57.62882114));
        mesto.add(new Location("Церковь Илии Пророка","1647-1650 гг.",3,39.89433349,57.62680378));
        mesto.add(new Location("Монастырь Толгский Колокольня","1683-1685 гг., 1826 г.",3,39.82767845,57.69681001));
        mesto.add(new Location("Церковь Николая Чудотворца в Тропино","1660 г., 1722 г., 1883 г.",3,39.89155945,57.61305454));
        mesto.add(new Location("Монастырь Толгский Святые ворота с церковью Николая Чудотворца","1672 г., кон. 17 в., 18 в.",3,39.82674563,57.69646934));
        mesto.add(new Location("Дом Работнова","кoн. 17-18 вв.",2,39.8495133,57.61013761));
        mesto.add(new Location("Монастырь Толгский Собор Введенский","1681-1683 гг.",3,39.82809532,57.69668605));
        mesto.add(new Location("Монастырь Толгский Корпус у восточных ворот","кон. 17 в., 18 в.",3,39.82875255,57.69667938));
        mesto.add(new Location("Храмовый комплекс Церковь Воздвижения","1675-1688 гг.",3,39.88627877,57.63543525));
        mesto.add(new Location("Церковь Иоанна Предтечи в Толчкове: церковь","1671-1687 гг., 1750 г., 1792-1794 гг.",3,39.85681354,57.61088505));
        mesto.add(new Location("Церковь Успения Богоматери","1683 г.",3,39.8335307,57.61042475));
        mesto.add(new Location("Храмовый комплекс в Коровниках: Святые ворота с оградой","1690-е гг.",3,39.90631172,57.61143673));
        mesto.add(new Location("Монастырь Толгский Церковь Воздвижения","кон. 17 в.",3,39.82820608,57.69632053));
        mesto.add(new Location("Монастырь Спасо-Преображенский Стены","17 в., 19 в.",3,39.88893099,57.62181402));
        mesto.add(new Location("Башня Власьевская (Знаменская)","1658-1669 гг., 1861 г., 1884 г., 1890-е гг.",2,39.88505668,57.62536875));
        mesto.add(new Location("Монастырь Толгский Кельи Спасские","кон. 17 в.",3,39.82825003,57.69715603));
        mesto.add(new Location("Церковь Владимирская ('на Божедомке')","1678 г.",3,39.85219095,57.62550021));
        mesto.add(new Location("Монастырь Толгский Башня восточная воротная","17 в.",3,39.82885949,57.69656978));
        mesto.add(new Location("Церковь Николая Чудотворца ('Николы Рубленого')","1695 г., кон. 18 - нач. 19 вв.",3,39.8982226,57.62253302));
        mesto.add(new Location("Колокольня церкви Никиты Мученика","кон. 17 - нач. 18 вв.",3,39.86897384,57.62359549));
        mesto.add(new Location("Монастырь Толгский Башня юго-западная","17 в.",3,39.82727553,57.69563265));
        mesto.add(new Location("Монастырь Спасо-Преображенский Церковь Ярославских Чудотворцев (Входа Господня в Иерусалим)","1617-1618 гг., 17-18 вв., 1825-1831 гг.",3,39.88953942,57.62134781));
        mesto.add(new Location("Монастырь Толгский Стены","17-19 вв.",3,39.82685158,57.69706918));
        mesto.add(new Location("Монастырь Спасо-Преображенский Звонница с церковью Богоматери Печерской","16-17 вв., 1808-1809 гг., 1823-1824 гг.",3,39.88978302,57.62116414));
        mesto.add(new Location("Церковь Михаила Архангела","1657-1682 гг.",3,39.89253535,57.62208756));
        mesto.add(new Location("Дом жилой Кирпичевых-Соболевых","кон. 17 -  нач. 18 вв., кон. 18 в., 1830-е г., кон. 19 в.",2,39.89482485,57.63033657));
        mesto.add(new Location("Храмовый комплекс: церковь Благовещения","1670-1688 гг., 1702 г., сер. 18 в.",3,39.89141562,57.63446805));
        mesto.add(new Location("Храмовый комплекс 'в Коровниках' Церковь Иоанна Златоуста","1649-1654 гг., 1690-е гг.",3,39.90584752,57.61158168));
        mesto.add(new Location("Монастырь Толгский Башня северная воротная","17 в.",3,39.82693452,57.69749539));
        mesto.add(new Location("Храмовый комплекс 'в Коровниках' Колокольня","1680-е гг.",3,39.9056864,57.61117711));
        mesto.add(new Location("Монастырь Спасо-Преображенский Святые ворота с церковью Введения","1516 г., 1621 г., 1810 г.",3,39.88980538,57.62086191));
        mesto.add(new Location("Монастырь Спасо-Преображенский Семинарский корпус","кон. 17 в., 18 в., 1897 г.",3,39.89045176,57.62130851));
        mesto.add(new Location("Дом Корытова","кон. 17 - нач. 18 вв.",2,39.84336171,57.60987623));
        mesto.add(new Location("Дом Общества врачей","кон. 17 - нач. 18 вв., 1-я треть 19 в.",2,39.89923509,57.62644839));
        mesto.add(new Location("Храмовый комплекс Церковь Тихвинская","1686 г., 1694 г.",3,39.87053939,57.61960331));
        mesto.add(new Location("Монастырь Спасо-Преображенский Башня Угличская","1630-е гг.",3,39.88926475,57.62262294));
        mesto.add(new Location("Храмовый комплекс: Церковь Димитрия Солунского (Смоленская)","1671-1673 гг., 1700 г., 1-я треть 19 в.",3,39.88136772,57.62163189));
        mesto.add(new Location("Церковь Зосимы и Савватия","1693 г.",3,39.90314247,57.63693744));
        mesto.add(new Location("Храмовый комплекс Церковь Николая Чудотворца ('Николы Пенского')","1689-1690 гг., 1890 г.",3,39.86518606,57.61028504));
        mesto.add(new Location("Дом Кудасова","кoн. 17 - нaч. 19 вв.",2,39.89086784,57.63297297));
        mesto.add(new Location("Монастырь Толгский Башня святых ворот северная","17 в.",3,39.82647243,57.6964535));
        mesto.add(new Location("Монастырь Спасо-Преображенский Кельи (северо-восточный корпус)","1670-е гг., 1690-е гг.",3,39.88979904,57.62187834));
        mesto.add(new Location("Монастырь Афанасьевский: церковь Афанасия и Кирилла","1664 г., 1676 г., 19 в.",3,39.89512006,57.62529484));
        mesto.add(new Location("Монастырь Спасо-Преображенский Башня Богородицкая","1623 г.",3,39.88724209,57.62206254));
        mesto.add(new Location("Монастырь Толгский Корпус Никольский","1670-е - 1680-е гг.",3,39.82709197,57.6961794));
        mesto.add(new Location("Церковь Спаса 'на Городу'","1672 г., 1694 г.",3,39.89549748,57.62256187));
        mesto.add(new Location("Храмовый комплекс Церковь Николая Чудотворца ('Николы Мокрого')","1665-1671гг., 1680-е гг., 1690-е гг.",3,39.87045663,57.62009307));
        mesto.add(new Location("Храмовый комплекс: церковь Федоровская","1682-1687 гг., 1736 г., 1776 г.",3,39.86532729,57.60964502));
        mesto.add(new Location("Церковь Николая Чудотворца ('Николы в Меленках')","1668-1672 гг.",3,39.83441613,57.60991536));
        mesto.add(new Location("Монастырь Спасо-Преображенский Ворота водяные","1-я треть 17 в.",3,39.88820392,57.62067644));
        mesto.add(new Location("Храмовый комплекс","",3,39.86483717,57.61033415));
        mesto.add(new Location("Мануфактура Большая Ярославская (Полотняный двор)","",2,39.84489182,57.60241774));
        mesto.add(new Location("Поселок Бутусова'. Ансамбль жилых домов","1927-1929 гг.",2,39.87619498,57.62906959));
        mesto.add(new Location("Усадьба Вахрамеева","",2,39.8851038,57.62955215));
        mesto.add(new Location("Памятник Г. Димитрову","1985 г.",1,39.87373225,57.63485334));
        mesto.add(new Location("Усадьба Лопатиных (Совет попечительства бедных)","",2,39.87862816,57.62829331));
        mesto.add(new Location("Присутственные места","",2,39.89403843,57.62567017));
        mesto.add(new Location("Усадьба Гнуздева","",2,39.88880272,57.63254435));
        mesto.add(new Location("Памятник Ленину В.И.","1939 г.",1,39.8867612,57.63218966));
        mesto.add(new Location("Усадьба Пастухова","",2,39.88127028,57.62740356));
        mesto.add(new Location("Церковь Ризоположения (Крестобогородская)","",3,39.84960814,57.57901172));
        mesto.add(new Location("Усадьба Матвеевских","",2,39.89734685,57.62629767));
        mesto.add(new Location("Усадьба Тихомирова","",2,39.88897639,57.63781214));
        mesto.add(new Location("Губернская земская больница","",2,39.86345731,57.63946843));
        mesto.add(new Location("Усадьба Макиных-Кропиных","",2,39.87777238,57.62180036));
        mesto.add(new Location("Усадьба Бибикова","",2,39.8703443,57.62469871));
        mesto.add(new Location("Училище епархиальное Ионафановское","",2,39.87638463,57.6226315));
        mesto.add(new Location("Усадьба Соболева","",2,39.88474851,57.62420399));
        mesto.add(new Location("Ярославское губернское акцизное управление (казенный винный склад)","",2,39.87737652,57.63828442));
        mesto.add(new Location("Монастырь Казанский","",3,39.8866278,57.6277382));
        mesto.add(new Location("Церковь Иоанна Предтечи в Толчкове","",3,39.85644769,57.61068775));
        mesto.add(new Location("Усадьба Полетаева (Консистория)","1871 г., кон. 19 в.",2,39.88208562,57.62263811));
        mesto.add(new Location("Храмовый комплекс","",2,39.8812258,57.62182987));
        mesto.add(new Location("Усадьба Друженкова","",2,39.88224201,57.62289483));
        mesto.add(new Location("Храмовый комплекс","",2,39.87001398,57.61985888));
        mesto.add(new Location("Памятник Трефолеву Л.Н.","1960 г.",1,39.88791088,57.62754252));
        mesto.add(new Location("Усадьба Вахрамеева","",2,39.89779103,57.62580734));
        mesto.add(new Location("Храмовый комплекс","",2,39.88870991,57.62514494));
        mesto.add(new Location("Монастырь Спасо-Преображенский","",3,39.88865213,57.62153349));
        mesto.add(new Location("Усадьба Пастухова","",2,39.88114247,57.62661204));
        mesto.add(new Location("Двор конюшенный Прохорова","",2,39.77611259,57.71298922));
        mesto.add(new Location("Памятник Толбухину Ф.И.","1972 г.",1,39.85888603,57.63295533));
        mesto.add(new Location("Обелиск в честь 30-летия Победы в Великой Отечественной войне 1941-1945 гг.","1975 г.",1,39.87138857,57.62514869));
        mesto.add(new Location("Памятник Фрунзе М.В.","1986 г.",1,39.87350704,57.59839389));
        mesto.add(new Location("Усадьба Лопатиных","",2,39.88566309,57.63084393));
        mesto.add(new Location("Монастырь Афанасьевский","",3,39.89540134,57.62528402));
        mesto.add(new Location("Подворье Оловянишниковых","",2,39.88265102,57.62816198));
        mesto.add(new Location("Храмовый комплекс 'в Коровниках'","",2,39.90616794,57.61136156));
        mesto.add(new Location("Казармы жандармские","",2,39.88015935,57.60696407));
        mesto.add(new Location("Памятник борцам за Советскую власть","1958 г.",1,39.89571941,57.62582167));
        mesto.add(new Location("Ансамбль губернаторского дома","",2,39.89648929,57.62812735));
        mesto.add(new Location("Памятник Волкову Ф.Г.","1973 г.",1,39.88335851,57.62645746));
        mesto.add(new Location("Склады Ярославской Большой Мануфактуры","",2,39.83031246,57.60954708));
        mesto.add(new Location("Монастырь Казанский","",3,39.88731104,57.62793413));
        mesto.add(new Location("Подворье Толгского монастыря","",3,39.89921774,57.62298964));
        mesto.add(new Location("Монастырь Казанский","",3,39.88695783,57.62847573));
        mesto.add(new Location("Усадьба Щербакова","",2,39.88545375,57.63020223));
        mesto.add(new Location("Памятник Некрасову Н.А.","1958 г.",1,39.8929714,57.63263386));
        mesto.add(new Location("Усадьба Урусовой-Чистякова","",2,39.89533777,57.6298146));
        mesto.add(new Location("Храмовый комплекс","",2,39.89398206,57.63037296));
        mesto.add(new Location("Мануфактура Малая Ярославская (казармы Николо-Мокринские)","",2,39.86784399,57.61990493));
        mesto.add(new Location("Больница городская им. братьев Голодухиных-Ярославская хирургическая  больница","",2,39.85533844,57.64028662));
        mesto.add(new Location("Семинария духовная","1860-е - 1870-е гг.",2,39.87567956,57.61998502));
        mesto.add(new Location("Усадьба Шапулиных-Сорокиных","",2,39.88350113,57.62187387));
        mesto.add(new Location("Памятник К. Марксу","1972 г.",1,39.86631926,57.63607097));
        mesto.add(new Location("Усадьба Полушкина (Колмогоровых)","",2,39.89256225,57.62774762));
        mesto.add(new Location("Монастырь Толгский","",2,39.82743111,57.69649436));
        mesto.add(new Location("Усадьба Панова-Горбуновой","",2,39.88640818,57.63343844));
        mesto.add(new Location("Усадьба Коковцевых","",2,39.87479773,57.56688621));
        mesto.add(new Location("Усадьба Андронова","",2,39.88818828,57.6382421));
        mesto.add(new Location("Усадьба Шишкина-Праведниковой","",2,39.87967191,57.63297171));
        mesto.add(new Location("Усадьба Узденникова-Пошехонова","",2,39.89450745,57.62858282));
        mesto.add(new Location("Усадьба Вахрамеева","",2,39.87347982,57.63200321));
        mesto.add(new Location("Кадетский корпус","",2,39.87807996,57.60667103));
        mesto.add(new Location("Храмовый комплекс","",3,39.88636115,57.63525901));
        mesto.add(new Location("Памятник-монумент в честь боевой и трудовой славы ярославцев в годы Великой Отечественной войны 1941-1945 гг.","1968 г.",1,39.8989175,57.62394284));
        mesto.add(new Location("Усадьба Цвелева","",2,39.8794574,57.62511442));
        mesto.add(new Location("Гостиный двор (старый)","",2,39.89029592,57.62357226));
        mesto.add(new Location("Церковь Благовещения в Яковлевской слободе","",3,39.95652557,57.6587755));
        mesto.add(new Location("Усадьба Иконникова-Оловянишникова","",2,39.87743515,57.62788062));
        mesto.add(new Location("Усадьба Успенского","",2,39.88841553,57.63356042));
        mesto.add(new Location("Усадьба Шишонкова","",2,39.89293208,57.62512039));
        mesto.add(new Location("Гостиный двор","",2,39.88672842,57.62405287));
        mesto.add(new Location("Усадьба Викулина (Сорокина)","",2,39.88563432,57.63722143));
        mesto.add(new Location("Усадьба Холщевниковых-управа Ярославская уездная земская","",2,39.88344394,57.63049484));
        mesto.add(new Location("Сквер Демидовский","сер. 19 в.",4,39.89702799,57.62517053));
        mesto.add(new Location("Ансамбль губернаторского дома Парк","1-я треть 19 в., нач. 20 в.",4,39.89578871,57.62785683));
        mesto.add(new Location("Мануфактура Большая Ярославская (Полотняный двор) Парк","18-19 вв.",4,39.84427042,57.60038545));
        mesto.add(new Location("Решетка и откосы Волжской набережной","1830-е гг., 1985 г.",4,39.89597096,57.63068967));
        mesto.add(new Location("Монастырь Толгский Сад","16-19 вв.",4,39.82922868,57.69529838));

        mesto.add(new Location("Успенский кафедральный собор","",3,39.902146,57.622508));
        mesto.add(new Location("Остров Даманский","",4,39.899657,57.618404));
        mesto.add(new Location("Бутусовский парк","",4,39.871902,57.6289891));
        mesto.add(new Location("Парк тысячелетия","",4,39.871065,57.616763));
    }

    private void setMarkers(ArrayList<Location> mesto, int groupMarker) {
        mMap.clear();
        for(int i=0; i<mesto.size(); i++)
            if(groupMarker == 0 || groupMarker == mesto.get(i).getIdIcon() )
                mMap.addMarker(new MarkerOptions().position(mesto.get(i).getPosition())
                        .title(mesto.get(i).getTitle())
                        .snippet(mesto.get(i).getName())
                        .icon(BitmapDescriptorFactory.fromAsset(mesto.get(i).getIcon())
                        ));

    }

    public void onGoToMarker0(View view) {
        setMarkers(mesto,0);
        return;
    }
    public void onGoToMarker1(View view) {
        setMarkers(mesto,1);
        return;
    }
    public void onGoToMarker2(View view) {
        setMarkers(mesto,2);
        return;
    }
    public void onGoToMarker3(View view) {
        setMarkers(mesto,3);
        return;
    }
    public void onGoToMarker4(View view) {
        setMarkers(mesto,4);
        return;
    }
    public void onGoToMarker5(View view) {
        setMarkers(mesto,5);
        return;
    }
    public void onGoToMarker6(View view) {
        setMarkers(mesto,6);
        return;
    }

}