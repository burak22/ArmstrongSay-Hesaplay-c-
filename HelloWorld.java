import java.util.Scanner;

public class HelloWorld{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),basamak = 0;
        int tempNumber = a;
        while(tempNumber!=0){
            basamak++;
            tempNumber = tempNumber/10;
        }
        tempNumber = a;
        double sum = Math.pow((tempNumber%10),basamak);
        while(tempNumber!=0){
            tempNumber/=10;
            sum+= Math.pow((tempNumber%10),basamak);
        }
        if(sum == a){
            System.out.println(a + " Sayısı bir Armstrong sayıdır.");
        }
        else{
            System.out.println(a + " Sayısı bir Armstrong sayı DEĞİLDİR");
        }
        sc.close();
    }            
}