import java.util.Scanner;

public class Frase {

    private Scanner input=new Scanner(System.in);
    String[] Palabras = {};

    public String[] SeparaPalabra(String frase){
        for(int i=0;i<frase.length();i++){
            Palabras = frase.split(" ");
        }
        return Palabras;
    }

    public void getPalabras(String[] Palabras){
        for(int i=Palabras.length-1;i>=0;i--){
            System.out.print(Palabras[i]+ " ");
        }
    }

    public String PidoFrase(){
        System.out.println("Introduce una frase: ");
        String frase = input.nextLine();
        return frase;
    }
}
