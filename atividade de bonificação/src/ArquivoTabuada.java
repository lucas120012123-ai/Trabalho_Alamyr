import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ArquivoTabuada {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = input.nextInt();

        String NmDoArquivo = "tabuada_" + num + ".txt";

        try {
            FileWriter writer = new FileWriter(NmDoArquivo);

            for (int i = 1; i <= 10; i++) {
                writer.write(num + " x " + i + " = " + (num * i) + "\n");
            }

            writer.close();
            System.out.println("Arquivo criado com sucesso: " + NmDoArquivo);

        } catch (IOException e) {
            System.out.println("Erro ao criar o arquivo.");
        }

    
        input.close();
    }
}