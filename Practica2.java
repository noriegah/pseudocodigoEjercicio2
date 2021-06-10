import java.util.*;

public class Practica2 {
    public static void main(String []args){
    Scanner scanner = new Scanner (System.in);
    int num;
    System.out.println("Ingrese un Valor");
    num=scanner.nextInt();
    if (num==1){
        System.out.println("El número no puede ser igual a 1");
    }
    if (num>1){
        while(num>1){
            num-=1;
            System.out.println(num);
        }
    }else {
        while(num<1){
            num+=1;
            System.out.println(num);
        }
    }
}
}