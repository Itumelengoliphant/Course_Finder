package com.example.demoapp;

import android.app.Application;

import java.util.ArrayList;
import java.util.List;

public class ApplicationClass extends Application {

    public static List<College> CollegeList;
    @Override
    public void onCreate() {
        super.onCreate();

        setUpArrayList();
    }

    public void setUpArrayList(){

        CollegeList = new ArrayList<>();

        CollegeList.add(new College("Boland TVET College","Western Cape","Stellenbosch","10111","BLN","www.bolandcollege.com","hq@bolandcollege.com","(021)8867111/2",""));
        CollegeList.add(new College("Buffalo City TVET College","Eastern Cape","East London","10111","BCC","www.bccollege.co.za","","043 704 9262",""));
        CollegeList.add(new College("Capricorn TVET College","Limpopo","Polokwane","10111","CC","www.capricorncollege.co.za/","enquiries@capricorncollege.edu.za","015 230 1800",""));
        CollegeList.add(new College("Central Johannesburg TVET College","Gauteng","Johannesburg","10111","CJC","www.cjc.edu.za","","011 351 6000",""));
        CollegeList.add(new College("Coastal KZN TVET College","KwaZulu-Natal","Amanzimtoti","10111","","www.coastalkzn.co.za",""," 031 905 7000/1",""));
        CollegeList.add(new College("College of Cape Town TVET College","Western Cape","Cape Town","10111","CCTN","http://www.cct.edu.za/","lgroenewald@cct.edu.za","+27 21 464 3874",""));
        CollegeList.add(new College("Eastcape Midlands TVET College","Eastern Cape","Uitenhage","Cuyler St & Durban St, Uitenhage Upper Central, Uitenhage, 6229","ICM","www.emcol.co.za","","041 995 2000",""));
        CollegeList.add(new College("Ehlanzeni TVET College TVET College","Mpumalanga","Nelspruit","10111","","www.ehlanzenicollege.co.za","info@ehlanzenicollege.co.za","(0)13 752 7105",""));
        CollegeList.add(new College("Ekurhuleni East TVET College","Gauteng","Ekurhuleni","Sam Ngema Rd, 700 Scheme, Springs, 1559","EEC","www.eec.edu.za/","","011 730 6600",""));
        CollegeList.add(new College("Ekurhuleni West TVET College","Gauteng","Ekurhuleni","10111","","www.ewc.edu.za/","thifhuriwam@ewc.edu.za","011 323 1600",""));
        CollegeList.add(new College("Elangeni TVET College","KwaZulu-Natal","Durban","15 Portsmouth Rd, New Germany, Durban, 3600","","www.elangeni.edu.za","","031 716 6700",""));
        CollegeList.add(new College("Esayidi TVET College","KwaZulu-Natal","Port Shepstone"," 5 Escombe Street, Port Shepstone, 4240","","www.esayidifet.co.za","","039 684 0110",""));
        CollegeList.add(new College("False Bay TVET College","Western Cape","Cape Town","Westlake Dr, Westlake, Cape Town, 7950","","www.falsebaycollege.co.za","","021 787 0800",""));
        CollegeList.add(new College("Gert Sibande TVET College","Mpumalanga","Ermelo"," Mel Mentz St, Ermelo, 2350","","www.educonnect.co.za/institutions/institution/gert-sibande-tvet-college","","017 811 5428",""));
        CollegeList.add(new College("GoldField TVET College","Free State","Welkom","10111","","www.goldfieldstvet.edu.za","admin@goldfieldstvet.edu.za","+2757-910 6000",""));
        CollegeList.add(new College("Ingwe TVET College","Free State","Mount Free","202 Mli Road, Maluti, 4740","","ingwecollege.edu.za","info@ingwecollege.edu.za","039 256 0670",""));
        CollegeList.add(new College("Lephalale TVET College","Limpopo","Lephalale","Lephalale, 0555","","leptvetcol.edu.za","marketing@leptvetcol.edu.za","014 763 2252",""));
        CollegeList.add(new College("Letaba TVET College","Limpopo","Tzaneen","1 Claude Wheatley St, Arbor Park, Tzaneen, 0850","","www.letcol.co.za","centraloffice@letcol.co.za","015 307 5440",""));
        CollegeList.add(new College("Lovedale TVET College","Eastern Cape","King Williams Town","1 Amatola Row, King William's Town, 5601","","www.lovedalecollege.co.za","","043 642 1331",""));
        CollegeList.add(new College("Maluti TVET College","Free State","Phuthaditjhaba","Private Bag X07 PHUTHADITJHABA 9866","","www.malutitvet.co.za","","058 713 0296",""));
        CollegeList.add(new College("Mopani South TVET College","Limpopo","Phalaborwa","Cnr Haarlem & Combretum Avenue, Phalaborwa, 1389","","mopanicollege.edu.za","administration@mopanicollege.edu.za","015 781 1377",""));
        CollegeList.add(new College("Motheo TVET College","Free State","Bloemfontein","53 St Georges St, Bloemfontein Central, Bloemfontein, 9301","","www.motheotvet.co.za","marketing@motheotvet.co.za","051 406 9300",""));
        CollegeList.add(new College("Nkangala TVET College","Free State","Witbank","Cnr Haig & Northey, Witbank, P O Box 2282 WITBANK 1035","","ww.ntc.edu.za","info@nkangalafet.edu.za","+27 (0) 13 658 4700",""));
        CollegeList.add(new College("Northern Cape Rural TVET College","Northern Cape","Kimberley","16 Weideman Street, Upington","","www.ncrtvet.com","","053 631 0594",""));
        CollegeList.add(new College("Northern Cape Urban TVET College","Northern Cape","Kimberley","37-41 Long Street Kimberley, 8301","","ncutvet.edu.za","info@ncutvet.edu.za","(053) 839-2063",""));
        CollegeList.add(new College("North Link TVET College","Western Cape","Bellville","80 Voortrekker Rd, Bellville, Cape Town, 7530","","www.northlink.co.za","","021 970 9200",""));
        CollegeList.add(new College("Port Elizabeth TVET College","Eastern Cape","Port Elizabeth","139 Russell Rd, Port Elizabeth Central, Port Elizabeth 6001","","www.pecollege.edu.za","","041 509 6000",""));
        CollegeList.add(new College("Orbit TVET College","North West","Rustenburg"," Fatima Bhayat St, Rustenburg CBD, Rustenburg, 0300","","www.orbitcollege.co.za","rustenburgcampus@.orbitcollege.co.za","014 597 5500",""));
        CollegeList.add(new College("Sedibeng TVET College","Gauteng","Vereeniging","Central Office 40 Voortrekker Street Vereeniging, 1939","","www.sedcol.co.za","info@sedcol.co.za","(016) 422-6645",""));
        CollegeList.add(new College("Sekhukhune TVET College","Limpopo ","Fetakgomo","Fetakgomo","","www.sekhukhunetvet.edu.za","sekfet@sekfetcol.co.za","013 269 0020",""));
        CollegeList.add(new College("South Cape TVET College","Western Cape","Cape Town","10111","","educonnect.co.za/institutions/institution/south-cape-college","","",""));
        CollegeList.add(new College("South West Gauteng TVET College","Gauteng","Roodeport","1822 A Molele Street C/o Koma Road and Molele Street Molapo, Soweto","","www.swgc.co.za","headoffice@swgc.co.za","086 176 8849",""));
        CollegeList.add(new College("Taletso TVET College","North-West","Mmabatho","Kgora Building, Dr Albet Luthuli Drive, Mmabatho, 2735","","taletso.edu.za","","018 384 2346",""));
        CollegeList.add(new College("Thekwini TVET College","KwaZulu-Natal"," Durban","262 D'Aintree Avenue, Asherville","","www.thekwinicollege.co.za","","031 250 8200",""));
        CollegeList.add(new College("Umfolozi TVET College","KwaZulu-Natal","Richards Bay","Cnr. Naboomnek &, Via Richardia, Arboretum, Richards Bay, 3900","","","","",""));
        CollegeList.add(new College("Tshwane North TVET College","Gauteng","Tshwane","420 Helen Joseph Street (former Church Street),Pretoria","","www.tnc.edu.za","","(012) 401 1600",""));
        CollegeList.add(new College("Tshwane South TVET College","Gauteng","Tshwane","85 Francis Baard (Schoeman Str.), PRETORIA","","www.tsc.edu.za","info@tsc.edu.za","012 401 5000",""));
        CollegeList.add(new College("Vhembe TVET College","Limpopo","Thohoyandou"," R523, Thohoyandou, 0950","","www.vhembecollege.edu.za","info@vhembecollege.edu.za","27 (0) 15 963 7000",""));
        CollegeList.add(new College("Umgungundlovu FET College","KwaZulu-Natal","Pietermaritzburg","44 Burger Street,Pietermaritzburg,3201","","www.utvet.co.za","marketing@ufetc.edu.za"," 033 341 2100/2214",""));
        CollegeList.add(new College("Vuselela College","Gauteng","Klerksdorp","8 Bram Fischer Street Klerksdorp 2571","","www.vuselelacollege.co.za","","018 406 7800",""));
        CollegeList.add(new College("Waterberg TVET College","Limpopo","Mokopane","Cnr Tortius & Hooge Streets || P Bag X2449, Mokopane, 0600","","","hq@waterbergcollege.co.za","+2715 492 9000",""));
        CollegeList.add(new College("West Coast TVET College","Western Cape","West Coast","2 Loedolf, Malmesbury","","www.westcoastcollege.co.za","info@westcoastcollege.co.za","(022) 482 1143",""));
        CollegeList.add(new College("Western College TVET College"," Gauteng","RANDFONTEIN","42 Johnstone Street, RANDFONTEIN","","www.westcol.co.za","info@westcol.co.za","011 692 4004/82",""));
    }
}
