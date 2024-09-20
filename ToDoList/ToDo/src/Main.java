import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Task task = new Task();
        int choice = 5;

        while (choice != 0) {
            Menu menu = new Menu();
            menu.Show();

            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    task.ListTask();
                    System.out.println("Aperte enter para voltar...");
                    scan.nextLine();
                    break;
                case 2:
                    System.out.println("Informe a nova tarefa: ");
                    task.add(scan.nextLine());
                    break;
                case 3:
                    System.out.println("Informe o número da tarefa a ser editada: ");
                    int indexTask = scan.nextInt();
                    System.out.println("Informe o novo titulo para task: ");
                    String editTask = scan.nextLine();
                    task.edit(indexTask, editTask);
                    break;
                case 4:
                    System.out.println("Informe o número da tarefa a ser removida: ");
                    task.remove(scan.nextInt());
                    break;
                case 0:
                    System.out.println("Fechando ...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            menu.Return(choice);
        }
    }
}