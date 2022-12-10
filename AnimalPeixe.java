import java.util.Scanner;

public class AnimalPeixe extends Animal {

    public static Animal cadastra() {
        Animal a = new AnimalPeixe();
        Scanner leia = new Scanner(System.in);

        System.out.print("\nInforme o nome: ");
        a.setNome(leia.nextLine());

        System.out.print("Raça: ");
        a.setRaca(leia.nextLine());

        System.out.print("Idade: ");
        a.setIdade(leia.nextInt());

        return a;
    }

    @Override
    public void imprime() {
        System.out.println("--Animal Peixe--");
        super.imprime();

        System.out.println("Acompanha um aquário");

    }

}
