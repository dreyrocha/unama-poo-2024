// **Desafio 3:**
// Crie uma nova classe chamada `Categoria` com um atributo `nome`. Crie um objeto da classe `Categoria` e associe-o a uma tarefa.

// - **Instruções:**
//   - Crie a classe `Categoria` com um atributo `nome` e métodos `getNome` e `setNome`.
//   - Modifique a classe `Tarefa` para incluir uma associação a `Categoria`.
//   - Crie objetos `Categoria` e `Tarefa`, e associe uma categoria a uma tarefa.

public class Categoria {
    private String nome;

    public Categoria(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;
    private Categoria categoria;

    public Tarefa(String titulo, String descricao, String prazo, int prioridade, Categoria categoria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
        this.categoria = categoria;
    }

    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Categoria: " + categoria.getNome());
    }

    public static void main(String[] args) {
        Categoria categoria = new Categoria("Estudos");
        Tarefa tarefa = new Tarefa("Finalizar projeto", "Completar as tarefas pendentes", "2024-09-15", 3, categoria);

        tarefa.exibirDetalhes();
    }
}
