package Ejercicio_1;

import java.util.Scanner;

public class main_calculadora{

    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        Scanner scanner = new Scanner(System.in);

        Integer numero_1;

        Integer numero_2;

        String operacion;

        Integer resultado = 0;


        Integer contador = 1;

        do {
            System.out.println("CALCULADORA");
            System.out.println(" ");
            System.out.println(">>> Primer numero: ");
            numero_1 = scanner.nextInt();
            System.out.println(">>> Segundo numero: ");
            numero_2 = scanner.nextInt();
            System.out.println(">>> operacion: ");
            operacion = scanner.next();

            switch (operacion){
                case "+":
                    resultado = calculadora.suma(numero_1,numero_2);
                    System.out.println(" Suma exitosa");


                    contador++;
                    break;

                case "-":
                    resultado = calculadora.resta(numero_1, numero_2);
                    System.out.println(" Resta exitosa");


                    contador++;
                    break;

                case "*":
                    resultado = calculadora.multlipicacion(numero_1, numero_2);
                    System.out.println(" Multiplicacion exitosa");


                    contador++;
                    break;

                case "/":

                    if (numero_2 == 0){ System.out.println("No se puede dividir por cero");

                        contador++;
                        break;


                    }
                    resultado = calculadora.division(numero_1, numero_2);
                    System.out.println(" Division exitosa");


                    break;

                default:
                    System.out.println("Operacion no valida");







            }

            System.out.println("Resultado: " + resultado);
            if (resultado < 0){
                System.out.println("Tene cuidado, el resultado es negativo");
            }else if(resultado == 0 || resultado < 10000){
                System.out.println("Resultado dentro de los limites");
            }else {System.out.println("Error, resultado muy grande");}

            contador++;




        }while (contador <= 5);









    }
}
