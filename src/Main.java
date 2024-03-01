import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SearchCEP searchCEP = new SearchCEP();

        System.out.println("Search for a CEP");
        var cep = input.nextLine();

        try {
            Address newAddress = searchCEP.searchAddress(cep);
            System.out.println(newAddress);
            FileGenerator generator = new FileGenerator();
            generator.saveJson(newAddress);
        } catch (RuntimeException | IOException e) {
            System.out.println(e.getMessage());
            System.out.println("Finishing the application");
        }
    }
}