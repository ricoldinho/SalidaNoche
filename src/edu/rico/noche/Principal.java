package edu.rico.noche;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //1.Saca por consola un mensaje de bienvenida “Vamos a tomar el aire. Bienvenido”.
        System.out.println("Vamos a tomar el aire. Bienvenido");
        /*
        * 2.Haz que existan las variables nivelAlcohol = 0.0, precioChupito = 3, precioCaña = 1.8,
        * precioCombinado = 8, nivelChupito = 0.25, nivelCaña =  0.1 y nivelCombinado = 0.4.*/
        double nivelAlcohol = 0.0;
        double precioChupito = 3;
        //En las variable JAMÁS usamos "ñ" o acentos
        double precioCanha = 1.8;
        double precioCombinado = 8;
        double nivelChupito = 0.25;
        double nivelCanha = 0.1;
        double nivelCombinado = 0.4;
        int numeroConsumiciones = 0;
        //3.Introduce por teclado un nombre de cliente y guárdalo en una variable.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el nombre del cliente: ");
        String nombreCliente = sc.nextLine();
        //4.Introduce una edad de cliente y guárdalo en una variable.
        System.out.println("Introduzca la edad del cliente: ");
        int edadCliente = sc.nextInt();
        //5.Introduce una cantidad de dinero que quieres que tenga el cliente.
        System.out.println("Introduzca el dinero del cliente: ");
        double dineroCliente = sc.nextDouble();
        /*6.Muestra en un único mensaje por consola lo siguiente: “El cliente de nombre: nombreCliente con edad
        edadCliente tiene x euros”.
        */
        System.out.println("El cliente de nombre: " + nombreCliente + " con edad " + edadCliente + " años, tiene " + dineroCliente + " euros.");
        /*
        * 7.Haz que el cliente entre en la primera discoteca, para
        * poder entrar, el programa tiene que comprobar que es
        * mayor de edad, si no lo es, tendrá que salir un mensaje
        * por consola denegando la entrada. Si es mayor de edad
        * deberemos comprobar que su nivel de alcoholemia no supere
        * el valor 1.2, en caso de superarlo, se le denegará la entrada
        * mostrando un mensaje que diga que no está en condiciones de entrar.*/
        System.out.println("*********************************");
        System.out.println("***                           ***");
        System.out.println("***   BIENVENIDO A PELICANO   ***");
        System.out.println("***                           ***");
        System.out.println("*********************************");
        if(edadCliente >= 18){
            System.out.println("El portero comprueba tu estado");
            if(nivelAlcohol >= 1.2){
                System.out.println("No puede entrar en ese estado");
            }else{
                System.out.println("Pase usted");
                //8 Enunciado del 8
                System.out.println("El cliente solicita beber una canha");
                if(dineroCliente >= precioCanha){
                    System.out.println("El cliente bebe una canha");
                    numeroConsumiciones++;
                    //la variable nivelAlcohol actúa como acumulador
                    //Esta línea también podrá escribirse => nivelAlcohol += nivelCanha
                    nivelAlcohol = nivelAlcohol + nivelCanha;
                    //dineroCliente -= precioCanha;
                    dineroCliente = dineroCliente - precioCanha;

                    System.out.println("El cliente solicita beber el chupito");
                    if(dineroCliente >= precioChupito){
                        numeroConsumiciones++;
                        System.out.println("El cliente bebe un chupito");
                        nivelAlcohol = nivelAlcohol + nivelChupito;
                        dineroCliente = dineroCliente - precioChupito;
                    }else{
                        System.out.println("No tienes dinero para el chupito");
                    }
                }else {
                    System.out.println("No tienes dinero suficiente para consumir");
                }
            }
        }else {
            System.out.println("Entrada denegada, no tienes la edad necesaria para ingresar");
        }

        System.out.println("*********************************");
        System.out.println("***                           ***");
        System.out.println("***   BIENVENIDO A INOX       ***");
        System.out.println("***                           ***");
        System.out.println("*********************************");
        if(edadCliente >= 18){
            System.out.println("Pase usted");
            if(nivelAlcohol >= 1.2){
                System.out.println("No puede entrar en ese estado");
            }else{
                System.out.println("El cliente solicita beber una canha");
                if(dineroCliente >= precioCanha){
                    numeroConsumiciones++;
                    System.out.println("El cliente bebe una canha");
                }else{
                    System.out.println("El cliente no tiene dinero");
                }
            }
        }else {
            System.out.println("No tienes edad suficiente para ingresar");
        }
        System.out.println("El cliente se vuelve a casa después de consumir " + numeroConsumiciones + " consumiciones");
    }
}
