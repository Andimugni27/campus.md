package Entity;
import java.util.HashMap;

public class setup {
        public static void initializeData(
            HashMap<String, Langganan> langganans,
            HashMap<String, User> pembelis,
            HashMap<String, Tutor> Tutors
    ) {
        Langganan langganan1 = new Langganan();
        Langganan langganan2 = new Langganan();
        Langganan langganan3 = new Langganan();
        Langganan langganan4 = new Langganan();
        Langganan langganan5 = new Langganan();
        Langganan langganan6 = new Langganan();

        langganan1.setNameLangganan("Langganan 1 Bulan").setIdLangganan("1").setHargaLangganan(500000).setKuota(0).setWaktu(30);
        langganan2.setNameLangganan("Langganan 1 Bulan Premium").setIdLangganan("2").setHargaLangganan(750000).setKuota(1).setWaktu(30);
        langganan3.setNameLangganan("Langganan 3 Bulan").setIdLangganan("3").setHargaLangganan(1250000).setKuota(2).setWaktu(90);
        langganan4.setNameLangganan("Langganan 3 Bulan Premium").setIdLangganan("4").setHargaLangganan(2000000).setKuota(8).setWaktu(90);
        langganan5.setNameLangganan("Langganan 1 Tahun").setIdLangganan("5").setHargaLangganan(5500000).setKuota(9).setWaktu(365);
        langganan6.setNameLangganan("Langganan 1 Tahun Premium").setIdLangganan("6").setHargaLangganan(8000000).setKuota(10).setWaktu(365);
        

        langganans.put(langganan1.getIdLangganan(), langganan1);
        langganans.put(langganan2.getIdLangganan(), langganan2);
        langganans.put(langganan3.getIdLangganan(), langganan3);
        langganans.put(langganan4.getIdLangganan(), langganan4);
        langganans.put(langganan5.getIdLangganan(), langganan5);
        langganans.put(langganan6.getIdLangganan(), langganan6);

        
        Tutor Tutor1 = new Tutor();
        Tutor Tutor2 = new Tutor();
        Tutor Tutor3 = new Tutor();
        Tutor Tutor4 = new Tutor();
        Tutor Tutor5 = new Tutor();
        Tutor Tutor6 = new Tutor();

        Tutor1.setIdTutor("01").setName("-");
        Tutor2.setIdTutor("02").setName("Nami");
        Tutor3.setIdTutor("03").setName("-");
        Tutor4.setIdTutor("04").setName("Zoro");
        Tutor5.setIdTutor("05").setName("-");
        Tutor6.setIdTutor("06").setName("Luffy");

        Tutors.put(Tutor1.getIdTutor(), Tutor1);
        Tutors.put(Tutor2.getIdTutor(), Tutor2);
        Tutors.put(Tutor3.getIdTutor(), Tutor3);
        Tutors.put(Tutor4.getIdTutor(), Tutor4);
        Tutors.put(Tutor5.getIdTutor(), Tutor5);
        Tutors.put(Tutor6.getIdTutor(), Tutor6);


        langganan1.setTutor(Tutor1);
        langganan2.setTutor(Tutor2);
        langganan3.setTutor(Tutor3);
        langganan4.setTutor(Tutor4);
        langganan5.setTutor(Tutor5);
        langganan6.setTutor(Tutor6);

    }
    
}
