import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Aecedario con numeros");

        Scanner sc = new Scanner(System.in);

        int number1=sc.nextInt();

        sc.close();

        if(number1==1){
            System.out.println("A");
        }else if(number1==2){
            System.out.println("B");
        }else if(number1==3){
            System.out.println("C");
        }else if(number1==4){
            System.out.println("D");
        }else if(number1==5){
            System.out.println("E");
        }else if(number1==6){
            System.out.println("F");
        }else if(number1==7){
            System.out.println("G");
        }else{
            if(number1==0){
                System.out.println("El 0 no corresponde a una letra");
            }else if(number1<0){
                System.out.println("Un numero negativo no corresponde a una letra");
            }else{
                System.out.println("Si has puesto un numero mayor que 7 le corresponde otra letra");
            }
        }
    }
}