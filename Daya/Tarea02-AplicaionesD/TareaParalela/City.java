package TareaParalela;
import java.util.ArrayList;
import java.util.Collections;

/*  Un usuario tiene una lista de ciudades,
    se requiere resolver que las ciudades se visualizen en
    orden de la lista y de manera aleatoria. 
    
 */

public class City {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Ciudades 1");
        songs.add("Ciudades 2");
        songs.add("Ciudades 3");
        songs.add("Ciudades 4");
        songs.add("Ciudades 5");
        
          System.out.println("Lista de Ciudades:");
          long initialTimee = System.nanoTime();
              for (String song : songs) {
                  System.out.println("Visualizando la "+song);
              }
          long endTimee = System.nanoTime();
          System.out.println("La diferencia de tiempo de programación basico secuencial: "+ (endTimee - initialTimee) / 1_000_000_000.0 + " segundos");
          System.out.println("============================================================");
          long initialTime = System.nanoTime();
               songs.stream().forEach(s -> System.out.println("Visualizando la "+s));
          long endTime = System.nanoTime();
          System.out.println("La diferencia de tiempo de programación secuencial: "+ (endTime - initialTime) / 1_000_000_000.0 + " segundos");
          long initialTimeee = System.nanoTime();
               songs.stream().parallel().forEach(s -> System.out.println("Visualizando la "+s));
        long endTimeee = System.nanoTime();
        System.out.println("La diferencia de tiempo de programación paralela: "+ (endTimeee - initialTimeee) / 1_000_000_000.0 + " segundos");

        System.out.println("----------------------------------------------------------------");   

        System.out.println("\nLista de ciudades mezcladas / aleatorias:");

        Collections.shuffle(songs);
        long initialTimeP1 = System.nanoTime();

        for (String song : songs) {
            System.out.println("Visualizando la "+song);
        }
        long endTimeP1 = System.nanoTime();
        System.out.println("\nLa diferencia de tiempo de programación basico secuencial: "+ (endTimeP1 - initialTimeP1) / 1_000_000_000.0 + " segundos");


        long initialTimeS = System.nanoTime();
        Collections.shuffle(songs);
        songs.stream().forEach(s -> System.out.println("Visualizando la "+s));
        long endTimeS = System.nanoTime();
        System.out.println("La diferencia de tiempo de programación secuencial: "+ (endTimeS - initialTimeS) / 1_000_000_000.0 + " segundos");
        System.out.println(" ");

        long initialTimeP = System.nanoTime();
        Collections.shuffle(songs);
        songs.stream().parallel().forEach(s -> System.out.println("Visualizando la "+s));
        long endTimeP = System.nanoTime();
        System.out.println("\nLa diferencia de tiempo de programación paralela: "+ (endTimeP - initialTimeP) / 1_000_000_000.0 + " segundos");
      
      
    }
}
