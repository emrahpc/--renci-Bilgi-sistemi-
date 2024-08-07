import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       StudentManager sms=new StudentManager();
       Scanner scanner=new Scanner(System.in);

       //öğrenci ekleme


         boolean isExit=false;
        while(true) {

            System.out.println("öğrenci eklemek için 1 e basınız ");
            System.out.println("öğrenci listesi için 2 ye basınız");
            System.out.println("öğrenci silme işlemleri için 3 e basınız ");
            System.out.println( "öğrenciyi güncelleme işlemleri için 4 e basınız ");
            System.out.println("çıkış yapmak için 5 e basınız");
            System.out.println("yapmak istediğiniz duruma göre secim yapınız");
            int choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice) {

                case 1:
                    System.out.println("eklemek istediniz öğrenci bilgilerini giriniz");
                    System.out.println("öğrenci adı:");
                    String name = scanner.nextLine();
                    System.out.println("öğrenci numarası:");
                    String number = scanner.nextLine();
                    sms.studentAdd(name, number);
                    break;
                case 2:
                    sms.studentlist();
                    break;
                case 3:
                    System.out.println("Silmek istediğiniz öğrenci idsi");
                    int id   =scanner.nextInt();
                    sms.studentDelete(id);
                    break;
                case 4:
                    System.out.println("güncellenecek öğrenci idsi giriniz ");
                        int uptadeid=scanner.nextInt();
                         scanner.nextLine();
                    System.out.println("öğrencinin yeni adı");
                    String  newname  =scanner.nextLine();
                    System.out.println("öğrencinin yeni numarası");
                    String  newnumber  =scanner.nextLine();
                    sms.studentUpdate(uptadeid,newname,newnumber);
                    break;
                case 5:
                    System.out.println("çıkış yapılıyor");
                    isExit=true;
                    break;
                default :
                    System.out.println("gecersiz sayi degeri girdiniz ");
            }

          if(isExit) {
            break;
          }
        }

    }
}