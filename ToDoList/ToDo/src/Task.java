import java.util.ArrayList;
import java.util.List;

public class Task {
    private List<String> task;

    public Task(){
        this.task = new ArrayList<>();
    }
    public void ListTask(){
        if (task.isEmpty()) {
            System.out.println("Nenhuma tarefa disponível.");
            return;
        }

        for (int i = 0; i < this.task.size(); i++){
            System.out.println(i + "-" + task.get(i));
        }
    }
    public void add(String newTask){
        if(newTask == ""){
            System.out.println("Erro: Informe uma task");
            return;
        }

        this.task.add(newTask);
        System.out.println("Tarefa adicionada!");
    }
    public void edit(int index, String editTask){
        verifyTask(index);
        this.task.set(index, editTask);
        System.out.println("Tarefa editada com sucesso!");
    }
    public void remove(int index){
        verifyTask(index);
        this.task.remove(index);
        System.out.println("Tarefa removida!");
    }
}

