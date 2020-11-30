package colafinal;

import java.util.Scanner;

/**
 *
 * @author Alejandro Huerta González
 */
public class Colafinal {

    public static void main(String[] args) {
        int opc1;
        Scanner entrada = new Scanner(System.in);
        System.out.print("\n " + "Seleccione el programa que desea ejecutar" + "\n"
                + "1. Programa  Abecedario\n"
                + "2. Programa  Ordenamiento\n"
                + "3. Programa  Numeros Aleatorios\n"
                + "4. Programa  Abecedario Aleatorio sin repetir\n"
                + "5. SALIR\n");
        opc1 = entrada.nextInt();
        switch (opc1) {
            case 1:// AGREGAMOS EL CODIGO DEL PRIMER PROGRAMA 
                char v[] = new char[26];
                int tope = 26;
                Colafinal C = new Colafinal();
                int sub1 = 0;

                do {
                    System.out.println("1. Llenar\n"
                            + "2. Mostrar\n"
                            + "3. Eliminar\n"
                            + "4. Agregar\n"
                            + "5. SALIR");
                    switch (sub1 = entrada.nextInt()) {
                        case 1:
                            char letra = 'A';
                            for (int a = 0; a < tope; a++) {

                                v[a] = letra;
                                letra++;
                            }
                            System.out.println("Agregados " + tope + " elementos a la cola");
                            break;

                        case 2://Muestra el contenido de la cola del programa 1 
                            if (tope >= 0) {   // valida si hay por lo menos un elemento que mostrar
                                for (int a = 0; a < tope; a++) {
                                    System.out.println(v[a]);
                                }
                            } else {
                                System.out.println("cola vacia." + "Ejecute de nuevo");
                            }
                            break;
                        case 3: //Elimina el primer valor de la cola y recorre el demas contenido del vector a esa posicion                
                            if (tope > 0) { //De igual manera valida que haya elementos en la cola
                                int w = 1;
                                System.out.println("dato " + v[w - 1] + " eliminado");
                                tope--;
                                for (int a = 0; a < tope; a++) {
                                    v[a] = v[w];
                                    w++;
                                }
                            } else {
                                System.out.println("No hay letras para eliminar");
                            }
                            break;
                        case 4: // Metodo para agregar un nuevo valor a la cola e insertarlo al final
                            System.out.println("Ingrese la letra");
                            char w = entrada.next().charAt(0);
                            if (tope < 26) { //Nuevamente validamos si hay espacio para agregar nuevas letras
                                //Inserccion de la nueva letra
                                v[tope] = w;
                                System.out.println("elemento agregado en posicion: " + tope);
                                tope++;
                            } else {
                                System.out.println("cola llena");
                            }
                            break;
                    }
                } while (sub1 != 5);

                break; //AQUI TERMINA EL CODIGO DEL PRIMER PROGRAMA Y ROMPE PARA SEGUIR A LA OPCION 2

            case 2://CODIGO DEL PROGRAMA 2
                char x[] = new char[26]; //Vector de tipo caracter 26 porque son las letras del abecedario
                int tope1 = 26;
                int pos,
                 aux;
                do {
                    System.out.println("1. Llenar Random\n"
                            + "2. Mostrar\n"
                            + "3. Eliminar\n"
                            + "4. Agregar\n"
                            + "5. Ordenar\n"
                            + "6. Salir\n");
                    switch (sub1 = entrada.nextInt()) {

                        case 1:
                            char abecedario = 'A';
                            for (int y = 0; y < tope1; y++) {

                                x[y] = (char) (Math.random() * 26 + 'A');
                                abecedario++;
                            }
                            System.out.println("Agregados " + tope1 + " datos random a la cola");
                            break;
                        case 2:
                            if (tope1 >= 0) {// si la cola tiene por lo menos un elemento hara
                                // si tope es mayor o igual a 0 mostrar la letra
                                for (int y = 0; y < tope1; y++) {
                                    System.out.println(y + " . " + x[y]);
                                }
                            } else { //Si esto no se cumple va a enviar el mensaje de cola vacia
                                System.out.println("cola vacia");
                            }
                            break;

                        case 3:
                            if (tope1 > 0) {
                                int w = 1;
                                System.out.println("dato " + x[w - 1] + " eliminado");
                                tope1--;//25
                                for (int a = 0; a < tope1; a++) {
                                    x[a] = x[w];
                                    w++;
                                }
                            } else {
                                System.out.println("no hay datos para eliminar");
                            }
                            break;

                        case 4:
                            System.out.println("ingrese la letra");
                            char w = entrada.next().charAt(0);

                            if (tope1 < 26) { //si hay un espacio libre agregar el dato que dijite el usuario 
                                x[tope1] = w;
                                System.out.println("elemento agregado en posicion: " + tope1);
                                tope1++;
                            } else {
                                System.out.println("cola llena");
                            }
                            break;
                        case 6:
                            if (tope1 > 0) {//VALIDAMOS SI HAY ELEMENTOS QUE ORDENAR
                                for (int y = 0; y < tope1; y++) {
                                    pos = y;
                                    aux = x[y];
                                    while ((pos > 0) && (x[pos - 1] > aux)) {
                                        x[pos] = x[pos - 1];
                                        pos--;
                                    }
                                    x[tope1] = (char) aux;
                                }
                            } else {
                                System.out.print("La cola esta vacia");
                            }

                    }
                } while (sub1 != 6);
                break;  // ESTE BREAK TERMINA EL SEGUNDO EJERCICIO

            case 3: //aqui va el codigo del ejercicio 3

                int opcion = 0;

                System.out.println("Introduce el tamaño de la pila A y B");

                Scanner sc = new Scanner(System.in);

                int tamaño = sc.nextInt();

                System.out.println("Las pilas se crearón sitisfactoriamente \n");

                int pilaA[] = new int[tamaño];
                int pilaB[] = new int[tamaño];
                int pilaC[] = new int[tamaño];

                do {

                    System.out.println("\n 1. Llenar las pilas A y B/ \n"
                            + "2. Mostrar pila A y B \n"
                            + "3. Unir Pilas A y B\n"
                            + "4. Mostrar la suma de las pilas A y B \n"
                            + "5. Eliminar pilas\n"
                            + "6. SALIR \n");

                    opcion = sc.nextInt();
                    switch (opcion) {

                        case 1:

                            for (int i = 0; i < pilaA.length; i++) {
                                pilaA[i] = (int) (Math.random() * 100 + 1);
                                pilaB[i] = (int) (Math.random() * (200 - 100) + 100);
                            }
                            System.out.println("Las pilas han sido llenadas");
                            break;

                        case 2:

                            for (int i = 0; i < pilaA.length; i++) {
                                System.out.println("La pila A contiene: \n" + pilaA[i]);
                                System.out.println("La pila B contiene: \n" + pilaB[i]);
                            }
                            break;

                        case 3:
                            int j = 0;
                            for (int i = pilaA.length - 1; i >= 0; i--) {
                                pilaC[j] = pilaA[i] + pilaB[i];
                                j++;
                                System.out.println("Se han sumado de manera exitosa\n");
                            }
                            break;

                        case 4:

                            for (int i = 0; i < pilaA.length; i++) {
                                System.out.println("La suma de las pilas A y B es : \n" + pilaC[i]);
                            }
                            break;

                        case 5:
                            for (int i = 0; i < pilaA.length; i++) {
                                pilaA[i] = 0;
                                pilaB[i] = 0;
                                pilaC[i] = 0;
                            }
                            //Mensaje para indicar la eliminación 
                            System.out.println("Se han eliminado los datos correctamente\n ");
                            break;
                    }

                } while (opcion != 6);
                break;

            case 4:
                Scanner entrada2 = new Scanner(System.in);
                char[] pilaleatoria = new char[26];
                int tope3 = 0, apoyo;
                int i, j, 
                 opciones;
                char d = 0;
                do {
                    System.out.println("\n1.Llenar de manera aleatoria\n"
                            + "2. Mostrar el contenido de la pila\n"
                            + "3. Eliminar\n"
                            + "4. Agregar una nueva letra\n"
                            + "5. Ordenar de manera alfabetica\n"
                            + "6. SALIR\n");
                   opciones = entrada.nextInt();
                    switch (opciones) {
                        case 1:
                            for (int f = 0; f < 26; f++) {
                                pilaleatoria[f] = (char) (Math.random() * 26 + 'A');
                                for (int g = 0; g < f; g++) {
                                    if (pilaleatoria[f] == pilaleatoria[g]) {
                                        f--;
                                    }
                                }
                            }
                            for (int f = 0; f < 26; f++) {
                                tope3++;
                            }
                            break;
                        case 2:
                           for (int f = tope3 - 1; f >= 0; f--) {
                            System.out.print(" " + pilaleatoria[f]);
                            }
                           break;
                        case 3:
                           tope3--;
                           System.out.println("Letra eliminada");
                            
                           break;
                        case 4:
                        if (tope3 < 26) {
                            pilaleatoria[tope3] = d;
                            tope3++;
                            System.out.println("Letra Agregada");
                            } else {
                            System.out.println("La Pila se encuentra llena");
                            }
                            break;
                        case 5:
                        for (j = 0; j < pilaleatoria.length; j++) {
                        for (i =j + 1; i< pilaleatoria.length; i++) {
                        if (pilaleatoria[i] < pilaleatoria[j]) {
                        apoyo = pilaleatoria[i];
                        pilaleatoria[i] = pilaleatoria[j];
                        pilaleatoria[i] = (char) apoyo;
                        }
                        break;
                    }
                }
                }
                } while (opciones !=7);
        break;
        }

    }
}

