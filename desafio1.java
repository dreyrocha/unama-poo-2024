// **Desafio 1:**
// Crie uma instância da classe `Tarefa` com diferentes valores e utilize os métodos `get` e `set` para modificar e acessar os atributos.

// - **Instruções:**
//   - Crie um objeto `Tarefa` com valores iniciais para título, descrição, prazo e prioridade.
//   - Modifique o título da tarefa usando o método `setTitulo`.
//   - Exiba o novo título usando o método `getTitulo`.

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

    public String getTitulo() {
        return titulo;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public static void main(String[] args) {
        Categoria categoria = new Categoria("Estudos");
        Tarefa tarefa = new Tarefa("Finalizar projeto", "Completar as tarefas pendentes", "2024-09-15", 3, categoria);

        System.out.println("Título da Tarefa: " + tarefa.getTitulo());
        System.out.println("Categoria da Tarefa: " + tarefa.getCategoria().getNome());
    }
}
