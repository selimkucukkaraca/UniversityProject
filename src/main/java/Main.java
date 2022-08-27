import model.Address;
import model.Student;
import model.Teacher;
import model.University;
import service.StudentService;
import service.TeacherService;

import java.util.Scanner;
import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        final TeacherService teacherService = new TeacherService();
        final StudentService studentService = new StudentService();

        Scanner scanner = new Scanner(System.in);

        String islemler = "1- Ogrenci ekle\n" +
                "2- Ogretmen ekle\n" +
                "3-Tum ogrencileri goster\n" +
                "4-Tum ogretmenleri goster\n" +
                "5-Cikis icin q'ya basiniz";


        while (true) {
            System.out.println("-------------------------Otomasyon Sistemine hosgeldiniz-------------------------");
            System.out.println(islemler);

            System.out.println("yapmak istediginiz islemli giriniz : ");
            String islem = scanner.nextLine();

            if (islem.equals("1")) {
                System.out.println("ogrencinin id'si : ");
                String id = scanner.nextLine();
                System.out.println("Öğrencinin adı: ");
                String name = scanner.nextLine();
                System.out.println("Öğrencinin soyadı: ");
                String lastName = scanner.nextLine();
                System.out.println("Öğrencinin numarası: ");
                String number = scanner.nextLine();
                System.out.println("Bölümü: ");
                String study = scanner.nextLine();
                System.out.println("Öğrencinin ülkesi");
                String country = scanner.nextLine();
                System.out.println("Öğrencinin şehri: ");
                String city = scanner.nextLine();
                System.out.println("Öğrencinin eyaleti: ");
                String distinct = scanner.nextLine();
                System.out.println("Öğrencinin sokağı: ");
                String street = scanner.nextLine();

                studentService.save(new Student(
                        id, name, lastName, number, study,
                        new Address(id, country, city, distinct, street)
                ));
            }
            else if (islem.equals("2")) {
                System.out.println("ogretmenin id'si : ");
                String id = scanner.nextLine();
                System.out.println("Ogretmenin adi :");
                String name = scanner.nextLine();
                System.out.println("Ogretmenin soyadi : ");
                String lastname = scanner.nextLine();
                System.out.println("Ogretmenin yasi : ");
                String age = scanner.nextLine();
                System.out.println("Ogretmenin universitesi : ");
                String university = scanner.nextLine();

                teacherService.save(new Teacher(
                        id, name,lastname,age,university,
                        new University(id,university)
                ));
            }
            else if (islem.equals("3")){
                System.out.println(studentService.findAll());
            }
            else if (islem.equals("4")) {
                System.out.println(teacherService.findAll());
            }
            else if (islem.equals("5")) {
                System.out.println("cikis yapiliyor...");
                break;
            }
            else {
                System.out.println("gecersiz islem");
            }
        }
    }
}
