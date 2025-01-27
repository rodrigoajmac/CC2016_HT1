package com.grupo8;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner teclado = new Scanner(System.in);
        LicuadoraFuncional licuadora = new LicuadoraFuncional();
        if(licuadora.estaEncendida() == false){
            System.out.println("¿Desea encender la licuadora? \n 1. Si \n 2. No" );
            int ingreso = teclado.nextInt();
            if(ingreso == 1){
                licuadora.encender();
                while(licuadora.estaEncendida() == true){
                    System.out.println("1. Agregar volumen \n 2. Incrementar velocidad \n 3. Decrementar velocidad \n 4. Vaciar parcialmente \n 5. Vaciar completamente \n 6. Apagar");
                    int caso = teclado.nextInt();
                    switch (caso) {
                        case 1:
                            System.out.println("Ingrese el volumen que desea agregar a la licuadora");
                            double vol = teclado.nextDouble();
                            System.out.println("El volumen de la licuadora es: " + licuadora.llenar(vol));
                            break;
                        case 2:
                            System.out.println("La velocidad de la licuadora es: " + licuadora.incrementarVelocidad());
                            break;
                        case 3:
                            System.out.println("La velocidad de la licuadora es: " + licuadora.decrementarVelocidad());
                            break;
                        case 4:
                            System.out.println("Ingrese el volumen que desea vaciar de la licuadora");
                            double vola = teclado.nextDouble();
                            System.out.println("El volumen de la licuadora es: " + licuadora.servir(vola));
                            break;
                        case 5:
                            licuadora.vaciar();
                            System.out.println("La licuadora se ha vaciado");
                            break;
                        case 6:
                            licuadora.apagar();
                            break;
                    }
                }

            }
        }
        teclado.close();
    }
}
