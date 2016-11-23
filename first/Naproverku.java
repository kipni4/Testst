package first;
import java.util.InputMismatchException;
import java.util.Scanner;
/**
 Не получилось загрузить на git папку studentchek скопирую код в папку которая грузиться
 */
public class Naproverku {
    public static void main(String[] args) {
        voprosb v1 = new voprosb();
        voprosb v2 = new voprosb();
        voprosb v3 = new voprosb();
        v1.setVop("Как зовут разраба?", "Коля", "УааасяЯЯ", "Петя", "Леша", "2");
        v2.setVop("Какого цвета белая кошка?", "Серого", "Красного", "Черного", "Белого", "4");
        v3.setVop("В.И. Ленин завещал?", "Бриться", "Лечиться", "Учиться", "Бегать", "3");
        tst t1 =new tst();
        t1.setTst(v1,v2,v3);
        t1.zadavat();

    }
}
class tst{
    private int a2 =3;
    voprosb tst[]=new voprosb[a2];
    public void setTst(voprosb a1,voprosb a2,voprosb a3){
        this.tst[0]=a1;
        this.tst[1]=a2;
        this.tst[2]=a3;
    }
    public void zadavat(){
        tst[0].zadavatb();
        tst[1].zadavatb();
        tst[2].zadavatb();
    }
    public voprosb getTst(){return tst[a2];}

}

class voprosb {
    private int a1 = 6;
    String ot[] = new String[a1];

    public void setVop(String a, String b, String c, String d, String e, String f) {
        this.ot[0] = a;
        this.ot[1] = b;
        this.ot[2] = c;
        this.ot[3] = d;
        this.ot[4] = e;
        this.ot[5] = f;// Строка правильного ответа содержит номер строки ot[x] где х номер строки с правильным ответом
    }

    public void zadavatb() {
        int b;
        System.out.println(ot[0]);
        for (int i = 1; i < (a1 - 1); i++) {
            System.out.print(i + ")");
            System.out.println(ot[i]);
        }
        try {
            b = new Scanner(System.in).nextInt();
            // if (b==1||b==2||b==3||b==4)

        }
        catch (InputMismatchException e){
            System.out.println("Вы ввели неверное значение, ответом может быть только номер строки.");
            System.out.println("Введите номер строки верного ответа.");
            b = new Scanner(System.in).nextInt();
            // throw e;
        }
        //if(b<0&&b>4)
        //  throw new IllegalArgumentException("Вы ввели неверный номер строки");
        //new InputMismatchException("Вы ввели неверный номер строки");

        if (b == Integer.parseInt(ot[a1 - 1]))
            System.out.println("Правильный ответ");
        else
            System.out.println("Неправильно");


    }

    public String getVop() {
        return ot[a1];
    }
}

