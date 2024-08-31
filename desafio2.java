// **Desafio 2:**
// Adicione um método na classe `Tarefa` para exibir todos os detalhes da tarefa em um formato legível.

// - **Instruções:**
//   - Adicione um método chamado `exibirDetalhes` na classe `Tarefa`.
//   - O método deve exibir o título, descrição, prazo e prioridade da tarefa em formato legível.

public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;

    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Prioridade: " + prioridade);
    }

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Finalizar projeto", "Completar as tarefas pendentes", "2024-09-15", 3);
        tarefa.exibirDetalhes();
    }
}
