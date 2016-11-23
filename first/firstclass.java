package first;

import java.util.Scanner;

/**
 выбор меньшего числа из 3-ёх
 */
public class firstclass {
    public static void main (String[]args){
        maxtri m1 = new maxtri(7,8,7);
        m1.shitatb();
        //int a = new Scanner(System.in).nextInt();
        //int b = new Scanner(System.in).nextInt();
       //int c = new Scanner(System.in).nextInt();
    }
}
     class maxtri{
             int a,b,c;
         public void shitatb(){
            if (a==b&&b==c)
                System.out.println("Все числа равны");
            else if (a==b&&a>c)
                System.out.println("Первое и втрое число одинаковые и максимальные " +a);
            else if (a==c&&a>b)
                System.out.println("Первое и третье число одинаковые и максимальные " +a);
            else if(b==c&&b>a)
                System.out.println("Второе и третье число одинаковые и максимальные " +b);
            else if (a>b&a>c)
                System.out.println("Первое число максимальное " +a);
            else if (b>c)
                System.out.println("Второе число максимально " +b);
            else System.out.println("Третье число максимальное " +c);}
         maxtri(int a1,int b1,int c1){
             this.a=a1;
             this.b=b1;
             this.c=c1;
         }
    }


