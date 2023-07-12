import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path: ");
        String str = sc.nextLine();

        File path =  new File(str);

//Array folders recebe a lista de path com uma lista
//que contem objetos do tipo File.

        File[] folders = path.listFiles(File::isDirectory);
        System.out.println("FOLDERS");

//Mostrando as pastas.

        for (File folder : folders) {
            System.out.println(folder);
        }

//Mostrando arquivos.
        System.out.println("FILES");
        File[] files =  path.listFiles(File::isFile);
        for (File file : files) {
            System.out.println(file);
        }
//Comando para criar uma subpasta.
        boolean success = new File(str + "\\subpasta").mkdir();
        System.out.println("Directory created " + success);

    }
}