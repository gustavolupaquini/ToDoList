public class Menu {
    public void Show(){
        System.out.println("Menu ToDo List \n  ");
        System.out.println("1 - Listar Tarefas");
        System.out.println("2 - Adicionar Tarefa");
        System.out.println("3 - Editar Tarefa");
        System.out.println("4 - Remover Tarefa");
        System.out.println("0 - Fechar ");
    }

    public void Return(int choice){
        if (choice != 0) {
            try {
                System.out.println("\nRetornando ao menu...");
                Thread.sleep(1000);
                for (int i = 0; i < 10; i++)
                    System.out.println(" ");
            } catch (InterruptedException e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }
}
