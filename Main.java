package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    // 1.Escribe una función “escribeArray5” a la que le pasamos un array de tipo entero de cinco elementos
    // y lo escribe por pantalla de la siguiente forma: [23, 43, 1, -3, 6]
    public static void escribeArray5(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < 4; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[4]);
        System.out.print("]");
    }

    // 2.Escribe una función “escribeArray” a la que le pasamos un array de enteros del tamaño que sea
    // y lo escribe por pantalla de la misma forma. Tendremos que usar la función “length” para saber el
    // tamaño del array desde dentro de la función.
    public static void escribeArray(int[] a)
    {
        int i;
        System.out.print("[");
        for (i = 0; i < a.length - 1; i++)
        {
            System.out.print(a[i] + ", ");
        }
        System.out.print(a[a.length - 1]);
        System.out.println("]");
    }

    // 3.Escribe una función “leeArray5” que lea un array de enteros de 5 elementos.
    // Habrá que pasarle el array ya definido y él lo rellenará pidiéndole los valores al usuario por consola.
    public static void leeArray5(int[] a)
    {
        int i, valor;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe los valores del array");

        for (i = 0; i < 5; i++)
        {
            System.out.println("Escribe el valor en la posición " + i);
            valor = sc.nextInt();
            a[i] = valor;
        }
    }

    // 4.Escribe una función “leeArray” que lea un array de enteros de cualquier tamaño.
    // El array lo crearemos fuera de la función y dentro de la función usaremos la función “length” para
    // saber cuál es el tamaño y cuántos datos debemos leer.
    public static void leeArray(int[] a)
    {
        int i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe los valores del array");

        for (i = 0; i < a.length; i++)
        {
            System.out.print("Posición " + i + ": ");
            a[i] = sc.nextInt();
        }
    }

    // 5.Escribe una función “ponCeros5” que modifique el contenido de un array de enteros
    // de cinco elementos y ponga en todas las posiciones un 0.
    public static void ponCeros5(int[] a)
    {
        int i;
        for (i = 0; i < 5; i++)
        {
            a[i] = 0;
        }
    }

    // 6.Escribe una función “ponCero” que haga lo mismo para un array de enteros de cualquier tamaño.
    public static void ponCeros(int[] a)
    {
        int i;
        for (i = 0; i < a.length; i++)
        {
            a[i] = 0;
        }
    }

    // 7.Escribe una función “sumaArray5” que sume todas las posiciones de un array de
    // enteros de cinco elementos y nos devuelva el resultado.
    public static int sumaArray5(int[] a)
    {
        int i, suma = 0;

        for (i = 0; i < 5; i++)
        {
            suma = suma + a[1];
        }
        return suma;
    }

    // 8.Escriba una función “sumaArray” que hágalo mismo para un array de enteros de cualquier tamaño.
    public static int sumaArray(int[] a)
    {
        int i, suma = 0;

        for (i = 0; i < a.length; i++)
        {
            suma = suma + a[1];
        }
        return suma;
    }

    // 9.Escribe una función “mediaArray5” que nos calcule el valor medio de los elementos
    // de un array de enteros de tamaño 5.
    public static double mediaArray5(int[] a)
    {
        double media;
        int suma = sumaArray5(a);

        media = suma / 5.0;

        return media;
    }

    // 10.Escribe una función “mediaArray” que haga lo mismo para un array de enteros de cualquier tamaño.
    public static double mediaArray(int[] a)
    {
        double media;
        int suma = sumaArray5(a);

        media = suma / (double) a.length;

        return media;
    }

    // 11.Escribe una función “rellenaEnOrden” que nos rellena un array de enteros con los números
    // desde el 1 en adelante (1, 2, 3, 4... hasta el tamaño del array).
    public static void rellenaEnOrden(int[] a)
    {
        int i;

        for (i = 0; i < a.length; i++)
        {
            a[i] = i + 1;
        }
    }

    // 12.Escribe una función “rellenaEnOrdenDesc” que nos rellena un array con
    // los valores siguientes: tamaño del array, tamaño del array-1, etc., 3, 2, 1.
    public static void rellenaEnOrdenDesc(int[] a)
    {
        int i, j = a.length;

        for (i = 0; i < a.length; i++)
        {
            a[i] = j;
            j--;
        }
    }

    // 13.Escribe una función “rellenaAleatorio” a la que le pasamos un array de enteros
    // y nos lo rellena de valores aleatorios entre 1 y 10.
    public static void rellenaAletorio(int[] a)
    {
        Random r = new Random();
        int i;

        for (i = 0; i < a.length; i++)
        {
            a[i] = r.nextInt(10) + 1; //r.nextInt genera un valor entre 0 y 10.
        }
    }

    // 14.Escribe una función “estaOrdenado” a la que le pasas un array de enteros y te devuelve
    // un booleano que será verdadero si los elementos del array se encuentran en orden ascendente.
    public static boolean estaOrdenado(int[] a)
    {
        int i, cont = 0;

        for (i = 0; i < a.length - 1; i++)
        {
            if (a[i] <= a[i + 1])
            {
                cont++;
            }
        }

        if (cont == a.length - 1)
        {
            return true;
        }
        else
        {
           return false;
        }

        //  int i;
        //  for (i = 0; i < a.length - 1; i++)
        //  {
        //      if (a[i] <= a[i + 1])
        //      {
        //          return false
        //      }
        //  }
        //  return true
    }

    // 15.Escribe una función “numeroImpares” a la que le pasas un array de enteros y te devuelve
    // un entero que corresponde a la cantidad de números impares que tenemos en el array.
    public static int numeroImpares(int[] a)
    {
        int i, cont = 0;

        for (i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 1)
            {
                cont++;
            }
        }
        return cont;
    }

    // 16.Escribe una función “minArray” a la que le pasas un array y te devuelve
    // el valor más pequeño de los contenidos en dicho array.
    public static int minArray(int[] a)
    {
        int i, min;
        min = a[0];

        for (i = 0; i < a.length; i++)
        {
            if (a[i] < min)
            {
                min = a[i];
            }
        }
        return min;
    }

    // 17.Escribe una función “maxArray” que te devuelve el más grande.
    public static int maxArray(int[] a)
    {
        int i, max;
        max = a[0];

        for (i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }
        return max;
    }

    // 18.Escribe una función “numeroAprobados” a la que se le pasa un array de enteros y,
    // suponiendo que son notas, nos devuelve el número de aprobados (valores entre 5 y 10).
    public static int numeroAprobados(int[] notas)
    {
        int i, cont = 0;

        for (i = 0; i < notas.length; i++)
        {
            if (notas[i] >= 5 && notas[i] <= 10)
            {
                cont++;
            }
        }
        return cont;
    }

    // 19.Escribe una función “porEncimaDe” a la que le pasamos un valor “limite” y nos devuelve
    // cuántos elementos del array son iguales o mayores que ese límite. Por ejemplo,
    // le pasamos el valor 10 y nos dice cuántos elementos son 10 o más.
    public static int porEncimaDe(int[] a, int limite)
    {
        int i, cont = 0;

        for (i = 0; i < a.length; i++)
        {
            if (a[i] >= limite)
            {
                cont++;
            }
        }
        return cont;
    }

    // 20.Escribe una función “cuantosCeros” a la que le pasamos un array y nos devuelve
    // un entero que nos dice cuántos elementos tienen el valor 0.
    public static int cuantosCeros(int[] a)
    {
        int i, cont = 0;

        for (i = 0; i < a.length; i++)
        {
            if (a[i] == 0)
            {
                cont++;
            }
        }
        return cont;
    }

    // 21.Escribe una función “copiaArray” a la que le pasas dos arrayspor parámetro (array1 y array2, por ejemplo)
    // del mismo tamaño (se debería comprobar dentro de la función). La función copiara el contenido del primer
    // array al segundo array.
    public static void copiaArray(int[] a, int[] b)
    {
        int i;

        if (a.length == b.length)
        {
            for (i = 0; i < a.length; i++)
            {
                b[i] = a[i];
            }
        }
        else
        {
            System.out.println("Los arrays no tienen el mismo tamaño");
        }
    }

    // 22.Escribe una función “copiaArrayInvertido” a la que le pasas dos arrays por parámetro y te copia
    // el contenido del primer array al segundo array pero en orden inverso (Ej.: si el primero es [5,6,7,8,9],
    // en el segundo se copiará [9,8,7,6,5]).
    public static void copiaArrayInvertido(int[] a, int[] b)
    {
        int i, j;

        if (a.length == b.length)
        {
            j = a.length - 1;
            for (i = 0; i < a.length; i++)
            {
                b[i] = a[j];
                j--;
            }
        }
        else
        {
            System.out.println("Los arrays no tienen el mismo tamaño");
        }
    }

    // Escribe una función “sumaArrays” a la que le pasamos tres arrays.
    // Los dos primeros contendrán losdatos que hay que sumar y en el tercero guardaremos
    // el resultado (Ej.: [1,2,3] + [8, 6, 8] = [9, 8, 11]).
    public static void sumaArrays(int[] a, int[] b, int[] c)
    {
        int i;

        if (a.length == b.length && b.length == c.length)
        {
            for (i = 0; i < a.length; i++)
            {
                c[i] = a[i] + b[i];
            }
        }
        else
        {
            System.out.println("Los arrays no tienen el mismo tamaño");
        }
    }

    // 24.Escribe también las funciones “restaArrays”, “multiplicaArrays” y “divideArrays”.
    public static void restaArrays(int[] a, int[] b, int[] c)
    {
        int i;

        if (a.length == b.length && b.length == c.length)
        {
            for (i = 0; i < a.length; i++)
            {
                c[i] = a[i] - b[i];
            }
        }
        else
        {
            System.out.println("Los arrays no tienen el mismo tamaño");
        }
    }

    public static void multiplicaArrays(int[] a, int[] b, int[] c)
    {
        int i;

        if (a.length == b.length && b.length == c.length)
        {
            for (i = 0; i < a.length; i++)
            {
                c[i] = a[i] + b[i];
            }
        }
        else
        {
            System.out.println("Los arrays no tienen el mismo tamaño");
        }
    }

    public static void divideArrays(int[] a, int[] b, int[] c)
    {
        int i;

        if (a.length == b.length && b.length == c.length)
        {
            for (i = 0; i < a.length; i++)
            {
                c[i] = a[i] / b[i];
            }
        }
        else
        {
            System.out.println("Los arrays no tienen el mismo tamaño");
        }
    }

    // 25. Escribe una función “invierteArray” a la que le pasamos un array de enteros y modifica
    // su contenido invirtiendo la posición de sus elementos (Ej.: [1,2,3] -> [3,2,1]).
    public static void invierteArray(int[] a)
    {
        //int[] b = new int[a.length];
        //copiaArrayInvertido(a, b);
        //copiaArray(b, a);

        int i, j, temporal;
        j = a.length - 1;
        for (i = 0; i < j; i++)
        {
            temporal = a[i];
            a[i] = a[j];
            a[j] = temporal;
            j--;
        }
    }

    // 26. Escribe una función “comparaArrays” a la que le pasamos dos arrays y nos devuelve un boolean
    // que será verdadero si los dos arrays tienen el mismo tamaño y contienen los mismos datos.
    public static boolean comparaArray(int[] a, int[] b)
    {
        int i;
        boolean resultado = true;

        if (a.length == b.length)
        {
            for (i = 0; i < a.length; i++)
            {
                if (a[i] != b[i])
                {
                    resultado = false;
                    i = a.length;
                }
            }
        }
        else
        {
            resultado = false;
        }
        return resultado;
    }

    // 27. Escribe una función “ponNotasArray” a la que le pasamos dos arrays del mismo tamaño.
    // El primero será un array de reales (double) y contendrá las notas de los alumnos.
    // El segundo será un array de booleanos en el que deberemos escribir en cada posición “true” si la nota
    // es mayor o igual que 5 (aprobado) y “false” en caso contrario.
    public static void ponNotasArray(double[] notas, boolean[] aprobados)
    {
        int i;

        if (notas.length == aprobados.length)
        {
            for (i = 0; i < notas.length; i++)
            {
                if (notas[i] >= 5)
                {
                    aprobados[i] = true;
                }
                else
                {
                    aprobados[i] = false;
                }
            }
        }
        else
        {
            System.out.println("Los arrays no tienen el mismo tamaño");
        }

    }

    // 28. Escribe una función “concatenaArrays55” a la que le pasamos tres arrays de enteros.
    // Los dos primeros tendrán un tamaño de 5 y contendrán los datos que hay que copiar.
    // El tercero tendrá un tamaño de 10 y en él copiaremos los datos del primer array y después
    // los datos del segundo (Ej.: [4,5,6,7,8] & [1,1,2,2,3] = [4,5,6,7,8,1,1,2,2,3]).
    public static void concatenaArray55(int[] a, int[] b, int[] c)
    {

        if (a.length == 5 && b.length == 5 && c.length == 10)
        {
            int i;
            for (i = 0; i < a.length; i++)
            {
                c[i] = a[i];
                c[i + 5] = b[i];
            }
        }
        else
        {
            System.out.println("Los arrays no tienen los tamaños especificados (5/5/10)");
        }
    }

    // 29. Escribe una función “concatenaArrays” a la que pasamos tres arrays con la condición de que el tamaño
    // del tercero sea igual a la suma del tamaño de los dos primeros. Hará lo mismo que la función anterior.
    public static void concatenaArrays(int[] a, int[] b, int[] c)
    {

        if (a.length + b.length == c.length)
        {
            int i, j = 0;

            for (i = 0; i < a.length; i++)
            {
                c[j] = a[i];
                j++;
            }
            for (i = 0; i < b.length; i++)
            {
                c[j] = b[i];
                j++;
            }
        }
        else
        {
            System.out.println("Los arrays no tienen los tamaños especificados");
        }
    }


    // 30. Escribe una función “contiene” a la que le pasamos un array y un valor entero.
    // La función nos devolverá “true” si el array contiene el número y “false” si no lo contiene.
    public static boolean contiene(int[] a, int n)
    {
        int i;
        boolean resultado = false;

        for (i = 0; i < a.length; i++)
        {
            if (a[i] == n)
            {
                resultado = true;
            }
        }
        return resultado;
    }

    // 31. Escribe una función “concatenaArraysPro” a la que le pasas dos arrays de enteros y te devuelve
    // un array cuyo tamaño es la suma del tamaño de ambos y que contiene todos los elementos del primero
    // y a continuación los del segundo. Esta función devolverá un array de enteros (int[]) el cuál
    // se creará dentro de la propia función.
    // Ej. de uso:  int[] a = {1,2,3};
    //              int[] b = {4,5,6,7,2};
    //              int[] c;
    //              c = concatenaArraysPro(a, b);
    public static int[] concatenaArraysPro(int[] a, int[] b)
    {
        int[] c = new int[a.length + b.length];

        concatenaArrays(a, b, c);

        return c;
    }


    // 32. Escribe una función “copiaArrayPro” a la que le pasas un array y te devuelve un array
    // del mismo tamaño y con los mismos datos.
    // Ej. de uso:  int[] a = {1,2,3};
    //              int[] b;
    //              b = copiaArrayPro(a);
    public static int[] copiaArrayPro(int[] a)
    {
        //int[] b = new int[a.length];
        //copiaArray(a, b);
        //return b;

        int i;
        int[] b = new int[a.length];

        for (i = 0; i < a.length; i++)
        {
            b[i] = a[i];
        }
        return b;
    }

    // 33. Escribe una función “insertaEnArray” a la que le pasas tres parámetros: un array de enteros,
    // un valor entero y una posición. La función insertará el valor en la posición indicada,
    // desplazando el resto de valores para hacerle hueco. La función nos devolverá un array con el resultado.
    // Ej.: Si tenemos el array [1,2,3,4,5] y queremos insertar el valor “26” en la posición “2”,
    // el resultado será: [1,2,26,3,4,5].
    public static int[] insertaEnArray(int[] a, int valor, int posicion)
    {
        int i;
        int[] b = new int[a.length + 1];

        for (i= 0; i < posicion; i++)
        {
            b[i] = a[i];
        }

        b[posicion] = valor;

        for (i = posicion; i <a.length; i++)
        {
            b[i + 1] = a[i];
        }
        return b;
    }


    // 34. Escribe una función “borraDeArray” a la que le pasas dos parámetros: un array de enteros y una posición.
    // La función eliminará el elemento colocado en la posición indicada. La función nos devolverá un array
    // con el resultado.
    // Ej.: Si tenemos el array [5,7,2,8,1] y queremos eliminar la posición 1, el resultado será: [5,2,8,1].
    public static int[] borraDeArray(int[] a, int posicion)
    {
        int i;
        int[] b = new int[a.length - 1];

        for (i= 0; i < posicion; i++)
        {
            b[i] = a[i];
        }

        for (i = posicion + 1; i <a.length; i++)
        {
            b[i - 1] = a[i];
        }
        return b;
    }

    // 35. Escribe una función “elimina1ElementoArray” a la que le pasas dos parámetros: un array de enteros
    // y un valor entero. La función eliminará del array el valor entero independientemente de la posición
    // en la que se encuentre. Si el valor se repite, se eliminará sólo la primera vez que aparece el valor.
    // La función nos devolverá un array con el resultado.
    public static int[] elimina1ElementoArray(int[] a, int elemento)
    {
        int i;
        int[] b = a;

        for (i = 0; i < a.length; i++)
        {
            if (a[i] == elemento)
            {
                b = borraDeArray(a, i);
                i = a.length;
            }
        }

        return b;
    }


    // 36. Escribe una función “eliminaElementosArray” a la que le pasas dos parámetros: un array de enteros
    // y un valor entero. La función eliminará del array el valor entero independientemente de la posición
    // en la que se encuentre.Si el valor se repite, se eliminarán todas las veces que se repite.
    // La función nos devolverá un array con el resultado.
    public static int[] eliminaElementosArray(int[] a, int elemento)
    {
        // int i;
        // int[] b = a;

        // for (i = 0; i < b.length; i++)
        // {
        //    if (b[i] == elemento)
        //    {
        //        b = borraDeArray(b, i);
        //        i--;
        //    }
        // }
        // return b;

        // int[] b = a;
        // while(contiene(b, elemento))
        // {
        //    b = eliminaElementosArray(b, elemento);
        // }
        // return b;

        int i, j, cont = 0;

        for (i = 0; i <a.length; i++)
        {
            if (a[i] == elemento)
            {
                cont++;
            }
        }

        int[] b = new int[a.length - cont];

        j = 0;
        for (i = 0; i < a.length; i++)
        {
            if (a[i] != elemento)
            {
                b[i] = a [i];
                j++;
            }
        }
        return b;
    }

    // 37. Escribe una función “insertaArrayEnArray” a la que le pasas tres parámetros: un array de enteros,
    // una posición de ese array, y otro array de enteros. La función insertará en el primer array,
    // a partir de la posición indicada, to-do el contenido del segundo array. La función nos devolverá un
    // array con el resultado. Ej.: [6, 2, 1, 3], posición: 2, insertar: [12, 13], resultado = [6, 2, 12, 13, 1, 3].
    public static int[] insertaArrayEnArray(int[] a, int position, int[] b)
    {
        //int i;
        //int[] c = a;

        //for (i = 0; i < b.length; i++)
        //{
        //    c = insertaEnArray(c, b[i], position);
            position++;
        //}
        //return c;

        int i, j;
        int[] c = new int[a.length + b.length];
        j = 0;
        for (i = 0; i < position; i++)
        {
            c[j] = a[i];
            j++;
        }
        for (i = 0; i < b.length; i++)
        {
            c[j] = b[i];
            j++;
        }
        for (i = position; i < a.length; i++)
        {
            c[j] = a[i];
            j++;
        }
        return c;
    }

    // 38. Escribe una función “subArray” a la que le pasas un array y dos posiciones. La función te devuelve
    // otro array que contiene los datos comprendidos entre ambas posiciones (incluidas ambas dos).
    // Ej.: [3, 6, 2, 8, 9], posiciones, 1 y 3, resultado = [6, 2, 8].
    public static int[] subArray(int[] a, int p1, int p2)
    {
        int[] b = new int[p2 - p1 + 1];
        int i, j = 0;

        for (i = p1; i <= p2; i++)
        {
            b[j] = a[i];
            j++;
        }
        return b;
    }

    // 39.Escribe una función “recortaArray” a la que le pasas un array y dos posiciones.
    // La función te devuelve otro array que contiene los todos los datos menos los comprendidos entre
    // ambas posiciones (incluidas ambas dos). Ej.: [3, 6, 2, 8, 9], posiciones, 1 y 3, resultado = [3, 9].
    public static int[] recortaArray(int[] a, int p1, int p2)
    {
        int[] b = new int[a.length - (p2 - p1 + 1)];
        int i, j = 0;

        for (i = 0; i <= p1; i++)
        {
            b[j] = a[i];
            j++;
        }
        for (i = p2 + 1; i <= a.length; i++)
        {
            b[j] = a[i];
            j++;
        }
        return b;
    }


    // 40.Escribe la función “ordenaBurbuja”a la que le pasaremos un array de enteros y lo ordenará
    // mediante la ordenación de la burbuja. La ordenación de la burbuja funciona de la siguiente forma:
    //  • Si el array tiene N elementos, se realizarán N-1 pasadas
    //    (por ejemplo, para un array de 5 elementos tendremos que realizar 4 pasadas para que quede ordenado).
    //  • En cada pasada, iremos recorriendo el array de principio a fin comprobando los números por parejas
    //    (por ejemplo: el primer y segundo número, el segundo y el tercero, etc.).
    //  • Si la pareja de números está en orden (o sea, el primero es menor que el segundo)
    //    la dejamos como está y si está desordenada, los intercambiamos.
    public static void ordenaBurbuja(int[] a)
    {
        int i, j, temp;
        int pasadas = a.length - 1;

        for (i = 0; i < pasadas; i++)
        {
            for (j = 0; j < a.length - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j +1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int opcion;

        System.out.println();
        System.out.println("Relación de arrays");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.println("1. escribeArray5           11. rellenaEnOrden             21. copiaArray                    31. concatenaArraysPro");
        System.out.println("2. escribeArray            12. rellenaEnOrdenDesc         22. copiaArrayInvertido           32. copiaArrayPro");
        System.out.println("3. leeArray5               13. rellenaAleatorio           23. sumaArrays                    33. insertaEnArray");
        System.out.println("4. leeArray                14. estaOrdenado               24. restaArrays                   34. borraDeArray");
        System.out.println("5. ponCeros5               15. numeroImpares              25. invierteArray                 35. elimina1ElementoArray");
        System.out.println("6. ponCeros                16. minArray                   26. comparaArrays                 36. eliminaElementosArray");
        System.out.println("7. sumaArray5              17. maxArray                   27. ponNotasArray                 37. insertaArrayEnArray");
        System.out.println("8. sumaArray               18. numeroAprobados            28. concatenaArray55              38. subArray");
        System.out.println("9. mediaArray5             19. porEncimaDe                29. concatenaArrays               39. recortaArray");
        System.out.println("10. mediaArray             20. cuantosCeros               30. contiene                      40. ordenaBurbuja");
        System.out.println("---------------------------------------------------------------------------------------------------------------------");
        System.out.print("Opción: ");
        opcion = sc.nextInt();

        switch (opcion)
        {
            case 1:
            {
                int[] a = {23, 43, 1 , -3, 6};
                escribeArray5(a);
            }
            break;

            case 2:
            {
                int[] a = {23, 43, 1 , -3, 6, 13, 20};
                escribeArray(a);
            }
            break;

            case 3:
            {
                int[] a = new int[5];
                leeArray5(a);
                escribeArray5(a);
            }
            break;

            case 4:
            {
                int[] a = new int[3];
                leeArray(a);
                escribeArray(a);
            }
            break;

            case 5:
            {
                int[] a = {23, 43, 1 , -3, 6};
                ponCeros5(a);
                escribeArray5(a);
            }
            break;

            case 6:
            {
                int[] a = {23, 43, 1 , -3, 6, 13, 20};
                ponCeros(a);
                escribeArray(a);
            }
            break;

            case 7:
            {
                int[] a = {23, 43, 1 , -3, 6};
                int suma;
                escribeArray5(a);
                suma = sumaArray5(a);
                System.out.println("La suma es " + suma);
            }
            break;

            case 8:
            {
                int[] a = new int[3];
                leeArray(a);
                escribeArray(a);
                System.out.println("La suma es " + sumaArray(a));
            }
            break;

            case 9:
            {
                int[] a = {2, 2, 2, 2, 3};
                double media;
                escribeArray5(a);
                media = mediaArray5(a);
                System.out.println("La media es: " + media);
            }
            break;

            case 10:
            {
                int[] a = {2, 2, 2, 3};
                double media;
                escribeArray(a);
                media = mediaArray(a);
                System.out.println("La media es: " + media);
            }
            break;

            case 11:
            {
                int[] a = new int[10];
                rellenaEnOrden(a);
                escribeArray(a);
            }
            break;

            case 12:
            {
                int[] a = new int[10];
                rellenaEnOrdenDesc(a);
                escribeArray(a);
            }
            break;

            case 13:
            {
                int[] a = new int[10];
                rellenaAletorio(a);
                escribeArray(a);
            }
            break;

            case 14:
            {
                int[] a = new int[10];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println(estaOrdenado(a));
                rellenaEnOrden(a);
                escribeArray(a);
                System.out.println(estaOrdenado(a));
            }
            break;

            case 15:
            {
                int[] a = new int[10];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println(numeroImpares(a));
            }
            break;

            case 16:
            {
                int[] a = new int[5];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println(minArray(a));
            }
            break;

            case 17:
            {
                int[] a = new int[10];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println(maxArray(a));
            }
            break;

            case 18:
            {
                int[] a = new int[10];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println(numeroAprobados(a));
            }
            break;

            case 19:
            {
                int[] a = new int[10];
                int limite;
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println("Introduce el límite: ");
                limite = sc.nextInt();
                System.out.println(numeroAprobados(a));
            }
            break;

            case 20:
            {
                int[] a = new int[10];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println(cuantosCeros(a));
            }
            break;

            case 21:
            {
                int[] a = new int[10];
                int[] b = new int[10];
                rellenaAletorio(a);
                escribeArray(a);
                copiaArray(a, b);
                escribeArray(b);
            }
            break;

            case 22:
            {
                int[] a = new int[10];
                int[] b = new int[10];
                rellenaAletorio(a);
                escribeArray(a);
                escribeArray(b);
                copiaArrayInvertido(a, b);
                escribeArray(b);
            }
            break;

            case 23:
            {
                int[] a = new int[10];
                int[] b = new int[10];
                int[] c = new int[10];
                rellenaAletorio(a);
                rellenaAletorio(b);
                escribeArray(a);
                escribeArray(b);
                sumaArrays(a, b, c);
                escribeArray(c);
            }
            break;

            case 24:
            {
                int[] a = new int[10];
                int[] b = new int[10];
                int[] c = new int[10];
                rellenaAletorio(a);
                rellenaAletorio(b);
                escribeArray(a);
                escribeArray(b);
                restaArrays(a, b , c);
                System.out.print("Resta: ");
                escribeArray(c);
                multiplicaArrays(a, b , c);
                System.out.print("Multiplicación: ");
                escribeArray(c);
                divideArrays(a, b , c);
                System.out.print("División: ");
                escribeArray(c);
            }
            break;

            case 25:
            {
                int[] a = new int[10];
                rellenaEnOrden(a);
                escribeArray(a);
                invierteArray(a);
                escribeArray(a);
            }
            break;

            case 26:
            {
                int[] a = new int[10];
                int[] b = new int[10];
                rellenaEnOrden(a);
                rellenaEnOrden(b);
                escribeArray(a);
                escribeArray(b);
                boolean bo = comparaArray(a, b);
                System.out.println(bo);
            }
            break;

            case 27:
            {
                double[] a = {10, 4.3, 0.25, 7.33, 5.75};
                boolean[] b = new boolean[5];
                System.out.println(Arrays.toString(a));
                ponNotasArray(a, b);
                System.out.println(Arrays.toString(b));
            }
            break;

            case 28:
            {
                int[] a = new int[5];
                int[] b = new int[5];
                int[] c = new int[10];
                rellenaAletorio(a);
                rellenaEnOrden(b);
                escribeArray(a);
                escribeArray(b);
                concatenaArray55(a, b, c);
                escribeArray(c);
            }
            break;

            case 29:
            {
                int[] a = new int[6];
                int[] b = new int[9];
                int[] c = new int[15];
                rellenaAletorio(a);
                rellenaEnOrden(b);
                escribeArray(a);
                escribeArray(b);
                concatenaArrays(a, b, c);
                escribeArray(c);
            }
            break;

            case 30:
            {
                int[] a = new int[6];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println("Dime un número");
                int n = sc.nextInt();
                System.out.println(contiene(a, n));
            }
            break;

            case 31:
            {
                int[] a = {1,2,3};
                int[] b = {4,5,6,7,2};
                int[] c;
                c = concatenaArraysPro(a, b);
                escribeArray(a);
                escribeArray(b);
                escribeArray(c);
            }
            break;

            case 32:
            {
                int[] a = {1,2,3};
                int[] b;
                b = copiaArrayPro(a);
                escribeArray(a);
                escribeArray(b);
            }
            break;

            case 33:
            {
                int[] a = new int[9];
                rellenaEnOrden(a);
                escribeArray(a);
                System.out.println("Dime un número");
                int n = sc.nextInt();
                System.out.println("Dime su posición");
                int p = sc.nextInt();
                a = insertaEnArray(a, n, p);
                escribeArray(a);
            }
            break;

            case 34:
            {
                int[] a = new int[9];
                rellenaEnOrden(a);
                escribeArray(a);
                System.out.println("Dime su posición");
                int p = sc.nextInt();
                a = borraDeArray(a, p);
                escribeArray(a);
            }
            break;

            case 35:
            {
                int[] a = new int[9];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println("Escribe el elemento");
                int n = sc.nextInt();
                a = eliminaElementosArray(a, n);
                escribeArray(a);
            }
            break;

            case 36:
            {
                int[] a = new int[9];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println("Escribe el elemento");
                int n = sc.nextInt();
                a = elimina1ElementoArray(a, n);
                escribeArray(a);
            }
            break;

            case 37:
            {
                int[] a = new int[9];
                rellenaAletorio(a);
                int[] b = {100, 200, 300};
                escribeArray(a);
                escribeArray(b);
                System.out.println("Dime la posición");
                int p = sc.nextInt();
                a = insertaArrayEnArray(a, p, b);
                escribeArray(a);
            }
            break;

            case 38:
            {
                int[] a = new int[9];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println("Dime la posición 1");
                int p1 = sc.nextInt();
                System.out.println("Dime la posición 2");
                int p2 = sc.nextInt();
                int[] b = subArray(a, p1, p2);
                escribeArray(b);
            }
            break;

            case 39:
            {
                int[] a = new int[9];
                rellenaAletorio(a);
                escribeArray(a);
                System.out.println("Dime la posición 1");
                int p1 = sc.nextInt();
                System.out.println("Dime la posición 2");
                int p2 = sc.nextInt();
                int[] b = recortaArray(a, p1, p2);
                escribeArray(b);
            }
            break;

            case 40:
            {
                int[] a = new int[9];
                rellenaAletorio(a);
                escribeArray(a);
                ordenaBurbuja(a);
                escribeArray(a);
            }
            break;



            default:
            {
                System.out.println("Opción no válida");
            }
        }
    }
}
