package com.example.terjemahbahasajawa;



import android.content.Context;

import com.example.terjemahbahasajawa.Database.DatabaseHelper;
import com.example.terjemahbahasajawa.Model.Terjemahan;

import java.util.ArrayList;
import java.util.Collection;



public class Data {




    public static String[][] data = new String[][]{
            {"saya","aku","kula","adalem/kawula"},
            {"menyuruh","akon","aken","dhawuh/utus"},
            {"anak/putra","anak","anak","putra"},
            {"ikut","anut","tumut","dherek"},
            {"apa","apa","menapa","menapa"},
            {"nama","aran","nama","asma"},
            {"jelek","asor","awon","andhap"},
            {"hati/piker","ati","manah","penggalih"},
            {"badan","awak","badan","sarira"},
            {"member","aweh","suka","paring/nyaosi/ngaturi"},
            {"mari/silakan","ayo","mangga","suwawi"},


            {"pulang/kembali","bali","wangsul","kondur"},
            {"pramuwisma","batur","rencang","abdi"},
            {"suami/istri","bojo","semah","garwa"},
            {"kumis","brengos","rawis","gumbala*"},
            {"butuh","butuh","betah","kersa"},


            {"dia/beliau","dheweke","piyambakipun","panjenenganipun"},
                    {"lulut","dhengkul","dhengkul","jengku"},
                    {"punya","duwe","gadhah","kagungan"},


                    {"tidak tahu","embuh","boten mangertos","duka"},
                    {"kepala","endhas","sirah","mustaka"},
                    {"pakai","enggo","angge","agem"},
                    {"muda","enom","enem","mudha/timur"},
                    {"pinta","epek","pendhet","pundhut"},


                    {"bawa","gawa","bekta","asta"},
                    {"bawaan","gawan","bekta","ampilan*"},
                    {"buat","gawe","damel","ngasta/yasa"},
                    {"bekerja","nyambut gawe","nyambut damel","ngasta"},
                    {"mau","gelem","purun","kersa"},
                    {"api","geni","latu","brama*"},
                    {"bangun","gugah","gigah","wungu"},
                    {"menuruti","gugu","gega","ngetokaken"},
                    {"berkata","gunem","ginem","ngendika"},


                    {"ikat kepala","iket","udheng","dhestar"},
                    {"tambah","imbuh","imbet","tanduk"},
                    {"hidung","irung","irung","grana"},

                    {"jaga","jaga","jagi","reksa"},
                    {"pinta","jaluk","suwun","pundhut"},
                    {"obat","jamu","jampi","usada"},
                    {"kuda","jaran","kapal","kuda/turangga"},
                    {"katanya","jare","caiyosipun","ngendikanipun"},
                    {"kain","jarit","sinjang","nyamping"},
                    {"nama","jeneng","nama","asma"},
                    {"ambil","jupuk","pendhet","pundhut"},
                    {"sisir","jungkat","serat","pethat"},


                    {"kalah","kalah","kawon","kasoran*"},
                    {"berkata","kandha","cariyos","ngendika"},
                    {"kemauan","karep","kajeng","karsa"},
                    {"celana","kathok","sruwal","lancingan*"},
                    {"boleh","kena","pikantuk","kepareng"},
                    {"keris","keris","dhuwung","wangkingan"},
                    {"pakaian","klambi","rasukan","ageman"},
                    {"suruh","kon","ken","utus"},
                    {"disuruh","kongkon","kengken","utus/dhawuh"},
                    {"engkau","kowe","sampeyan","panjenengan"},
                    {"mendengar","krungu","mireng","midhanget"},
                    {"kubur","kubur","petak","sare"},
                    {"kurus","kuru","kera","susut"},


                    {"lair","lair","lair","miyos"},
                    {"jalan","laku","lampah","tindak"},
                    {"melakukan","nglakoni","nglampahi","nindakaken"},
                    {"laki-laki","lanang","jaler","kakung"},
                    {"sakit","lara","sakit","gerah"},
                    {"pintu","lawang","konten","kori"},
                    {"pergi","lunga","kesah","tindak"},


                    {"baca","maca","maca","maos"},
                    {"makan","mangan","nedha","dhahar"},
                    {"tempat tinggal","manggon","manggen","lenggah"},
                    {"sembuh","mari","mantun","dhangan"},
                    {"mata","mata","mripat","paningal"},
                    {"meninggal","mati","pejah/tilar","seda"},
                    {"mayat","mayit","jisim","layon"},
                    {"ikut","melu","tumut","ndherek"},
                    {"pergi/ke","menyang","dhateng","tindak"},
                    {"hamil","meteng","wawrat/ngandheg","mbobot/nggarbini"},
                    {"minggat","minggat","kesah","lolos/kentar"},



                    {"marah","nesu","srengen","duka"},
                    {"buang air besar","ngising","bebucal","bobotan"},
                    {"tahu","ngreti","gertos","priksa/pirsa"},


                    {"boleh","oleh","angsal","kepareng/pikantuk"},
                    {"rumah","omah","griya","dalem"},
                    {"nikah","omah-omah","emah-emah","krama"},
                    {"berkata","omong","ginem/sanjang","ngendika"},


                    {"makanan","pangan","tedha","dhaharan"},
                    {"pinta","pek","pendhet/suwun","pundhut"},
                    {"penis","pelanangan","pejaleran","kalam*"},
                    {"piker","piker","manah","penggalih"},


                    {"rambut","rambut","rambut","rikma"},
                    {"pembantu","rewang","rencang","abdi"},
                    {"dengar","rungu","pireng","midhanget"},


                    {"saudara","sadulur","sedherek","sentana*"},
                    {"kaki","sikil","suku","sampeyan"},
                    {"meminjam","silih","sambut/ngampil","pundhut ngampil"},
                    {"selamat","slamet","wilujeng","sugeng"},
                    {"jamuan","suguh","segah","sugata"},
                    {"sedih","susah","sisah","sungkawa/sekel"},



                    {"saya","tak/dak","kula","adalem/kawula"},
                    {"bertanya","takon","taken","nyuwun priksa/mundhut priksa dangu"},
                    {"jamu","tambah","jampi","usada"},
                    {"bangun","tangi","tangi","wungu"},
                    {"hadir","teka","dhateng/dumugi","rawuh"},
                    {"tandang","tilik","tuwi","tinjo"},
                    {"lihat","tonton","tingal","priksa"},
                    {"beli","tuku","tumbas","mundhut"},
                    {"naik","tunggang","tumpak","nitih"},
                    {"tidur","turu","tilem","sare"},
                    {"berkata","tutur","sanjang/criyos","parik priksa/caos priksa"},
                    {"tua","tuwa","sepuh","yuswa"},



                    {"pulang","mulih","antuk","kondur"},
                    {"undang","undang","timbale","aturi"},
                    {"gigi","untu","waos","waja"},
                    {"hidup","urip","gesang","sugeng"},
                    {"hutang","utang","sambut/ampil","nyuwun/mundhut ngampil"},



                    {"perempuan","wadon","setri","putrid/wanita"},
                    {"sembuh","waras","saras","dhangan"},
                    {"warisan","warisan","tiliran","pusaka*"},
                    {"miniman","wedang","benteran","unjukan"},
                    {"melihat","weruh","sumerep","priksa"},
                    {"memberi","weweh","suka","maringi/nyaosi/ngaturi"},
                    {"keluar","wetu","wedal","wiyos"},
                    {"berkata","wicara","wicanten","ngendika"},
                    {"orang","wong","tiyang","priyantun"}
    };


    public static String[][] data3 = new String[][]{

    };


    public static ArrayList<Terjemahan> getListData(){
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[0]);
            terjemahan.setArti(aData[0]);

            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);




            list.add(terjemahan);
        }

        return list;
    }


    public static ArrayList<Terjemahan>getListData2() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[0]);
            terjemahan.setArti(aData[1]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }

    public static ArrayList<Terjemahan>getListData3() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[0]);
            terjemahan.setArti(aData[2]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }


    public static ArrayList<Terjemahan>getListData4() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[0]);
            terjemahan.setArti(aData[3]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }









    public static ArrayList<Terjemahan>getListData5() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[1]);
            terjemahan.setArti(aData[0]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }

    public static ArrayList<Terjemahan>getListData6() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[1]);
            terjemahan.setArti(aData[1]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }

    public static ArrayList<Terjemahan>getListData7() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[1]);
            terjemahan.setArti(aData[2]);

            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }

    public static ArrayList<Terjemahan>getListData8() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[1]);
            terjemahan.setArti(aData[3]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }












    public static ArrayList<Terjemahan>getListData9() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[2]);
            terjemahan.setArti(aData[0]);

            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }

    public static ArrayList<Terjemahan>getListData10() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[2]);
            terjemahan.setArti(aData[1]);

            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }

    public static ArrayList<Terjemahan>getListData11() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[2]);
            terjemahan.setArti(aData[2]);

            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }


    public static ArrayList<Terjemahan>getListData12() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[2]);
            terjemahan.setArti(aData[3]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }










    public static ArrayList<Terjemahan>getListData13() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[3]);
            terjemahan.setArti(aData[0]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }


    public static ArrayList<Terjemahan>getListData14() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[3]);
            terjemahan.setArti(aData[1]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }


    public static ArrayList<Terjemahan>getListData15() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[3]);
            terjemahan.setArti(aData[2]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }


    public static ArrayList<Terjemahan>getListData16() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[3]);
            terjemahan.setArti(aData[3]);


            terjemahan.setIndonesia(aData[0]);
            terjemahan.setNgoko(aData[1]);
            terjemahan.setKrama(aData[2]);
            terjemahan.setHalus(aData[3]);


            list.add(terjemahan);
        }

        return list;
    }










    public static ArrayList<Terjemahan>getListData17() {
        Terjemahan terjemahan = null;
        ArrayList<Terjemahan> list = new ArrayList<>();
        for (String[] aData : data3) {
            terjemahan = new Terjemahan();
            terjemahan.setKata(aData[0]);
            terjemahan.setArti(aData[0]);




            list.add(terjemahan);
        }

        return list;
    }

}
