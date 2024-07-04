import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int km, age, tip;
        double a=0.1, total, dis=0 ;

        System.out.print("Yolculuk için mesafeyi km cinsinden giriniz: ");
        km = sc.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        age = sc.nextInt();

        System.out.println("Yolculuk tipini seçin\n1)Sadece gidiş\n2)Gidiş-dönüş");
        tip = sc.nextInt();

        total = (km*a);

        if (!(tip>=1 && tip<3 && age >=1 && km >= 1)){
            System.out.print("Girilen veriler hatalı!");
            System.exit(0);
        }
        else if(age<12){
            dis = total*0.5;
        }
        else if(age>=12 && age < 24){
            dis = total*0.9;
        }
        else if(age>=65){
            dis = total*0.7;
        }
        else{
            dis = total;
        }
        if(tip == 2){
            dis = dis - (total*0.2);
        }
        System.out.println("İndirim varsa indirimli fiyatınız: "+dis+" TL");
    }
}