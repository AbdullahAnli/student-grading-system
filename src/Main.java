import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Students>studentsList = new ArrayList<>();
        studentsList.add(new Students("Ahmet",54,"Bilgisayar"));
        studentsList.add(new Students("Mehmet",78,"Bilgisayar"));
        studentsList.add(new Students("Arda",100,"Bilgisayar"));
        studentsList.add(new Students("Hakan",99,"Yazılım"));
        studentsList.add(new Students("Ali",50,"Yazılım"));
        studentsList.add(new Students("Gökhan",70,"Yazılım"));
        studentsList.add(new Students("Ayşe",85,"Elektronik"));
        studentsList.add(new Students("Emine",80,"Elektronik"));
        studentsList.add(new Students("Serhat",30,"Elektronik"));

        // Sınıfların isimlerine göre ayırdık
        List<Students> ComputerStudentsList = studentsList.stream().filter(students -> students.getClassname().equals("Bilgisayar")).toList();
        List<Students> SoftStudentsList = studentsList.stream().filter(students -> students.getClassname().equals("Yazılım")).toList();
        List<Students> ElektronikStudentsList = studentsList.stream().filter(students -> students.getClassname().equals("Elektronik")).toList();
        System.out.println("Bilgisayar Sınıfı :\n"+ComputerStudentsList
        + "Yazılım Sınıfı : \n"+SoftStudentsList+"Elektronik Sınıfı :\n"+ElektronikStudentsList+"\n\n");


        // Notları en yüksek öğrencileri bulduk
        Students CompEnYuksekNot =ComputerStudentsList.stream().max(Comparator.comparing(Students::getGrade)).orElseThrow();
        Students SoftEnYuksekNot = SoftStudentsList.stream().max(Comparator.comparing(Students::getGrade)).orElseThrow();
        Students ElekEnYuksekNot = ElektronikStudentsList.stream().max(Comparator.comparing(Students::getGrade)).orElseThrow();
        Students NotuEnYuksekOgr = studentsList.stream().max(Comparator.comparing(Students::getGrade)).orElseThrow();
        System.out.println("NOTLARI EN YÜKSEK ÖĞRENCİLER :\n" +"Bilgisayar Sınıfı : "+CompEnYuksekNot
        + "\n Yazılım Sınıfı : "+SoftEnYuksekNot+"\n Elektronik Sınıfı : "+ElekEnYuksekNot);

        // Notları 70 ve üzeri olan öğrenciler
        List<Students> Notlari70UstuOlanlar = studentsList.stream().filter(student -> student.getGrade() >=70).collect(Collectors.toList());
        System.out.println("70 ÜSTÜ NOT ALANLAR : \n"+Notlari70UstuOlanlar);

        // Öğrencileri notlarına göre sırala
        List<Students> NotlaraGoreSiralama = studentsList.stream().sorted(Comparator.comparing(Students::getGrade).reversed()).toList();
        System.out.println("NOTLARA GÖRE SIRALAMA : \n"+NotlaraGoreSiralama);








    }
}