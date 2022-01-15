import java.util.Scanner;

public class teste {
    public static void main(String[] args) {
        int menu =0, menu2 =0, menu3=0, ano;
        String titulo, compositor, interprete;
        Scanner input = new Scanner(System.in);
        while (menu == 0) {
            System.out.println("Musicas");
            System.out.println("Adicionar:        1");
            System.out.println("titulo da musica: 2");
            System.out.println("interprete:       3");
            System.out.println("Periodo:          4");
            System.out.println("compositor:       5");
            System.out.print("R:");
            menu = input.nextInt();

        if (menu == 1) {
            System.out.println("Tipo");
            System.out.println("MP3: 1");
            System.out.println("LP:  2");
            System.out.println("CD:  3");
            System.out.print("R:");
            menu = input.nextInt();
        }
            if (menu2 == 1) {
                System.out.println("MP3");
            }
            if (menu2 == 2) {
                System.out.println("LP");
            }
            if (menu2 == 3) {
                System.out.println("CD");
            }
        if (menu == 2) {
            System.out.print("Titulo: ");
            titulo = input.nextLine();
        }
        if (menu == 3) {
            System.out.print("Interprete:");
            interprete = input.nextLine();
        }
        if (menu == 4) {
            System.out.println("Periodo: ");
            ano = input.nextInt();
        }
        if (menu == 5) {
            System.out.println("Compositor:");
            compositor = input.nextLine();
        }
            System.out.println("Repetir: 1");
            System.out.println("exit:    2");
            System.out.println("R: ");
            menu3 = input.nextInt();
            if (menu3==1){
            menu = 0;
            }
        }
    }
}
