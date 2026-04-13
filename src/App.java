import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite peso e altura:");
        double p = sc.nextDouble(); double a = sc.nextDouble();

        double imc = p / (a * a);

        String r = "";

        if(imc < 18.5){
            r = "abaixo do peso";
        }else{
            if(imc <= 24.9){
                r = "peso normal";
            }else{
                if(imc <= 29.9){
                    r = "sobrepeso";
                }else{
                    if(imc <= 34.9){
                        r = "obesidade grau 1";
                    }else{
                        if(imc <= 39.9){
                            r = "obesidade grau 2";
                        }else{
                            r = "obesidade grau 3";
                        }
                    }
                }
            }
        }

        System.out.println("IMC: " + imc);
        System.out.println("Classificação: " + r);

        sc.close();
    }
}