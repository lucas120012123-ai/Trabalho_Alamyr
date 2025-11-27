import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerTabuada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        String NmDoArquivo = "tabuada_" + num + ".txt";

        File arquivo = new File(NmDoArquivo);

        // Verifica se existe
        if (!arquivo.exists()) {
            System.out.println("O arquivo não existe.");
            input.close();
            return;
        }

        System.out.println("Lendo o arquivo: " + NmDoArquivo);
        System.out.println("----------------------------------");

        try {
            Scanner leitor = new Scanner(arquivo);

            while (leitor.hasNextLine()) {
                System.out.println(leitor.nextLine());
            }

            leitor.close();

        } catch (FileNotFoundException e) {
            System.out.println("Erro ao abrir o arquivo.");
        }

        input.close();
    }
}