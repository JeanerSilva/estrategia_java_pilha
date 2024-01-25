import java.util.EmptyStackException;

public class PilhaComTamanhoFixo {
    private int tamanhoMaximo;
    private String[] elementos;
    private int topo; // Índice do topo da pilha

    // Construtor que recebe o tamanho máximo da pilha
    public PilhaComTamanhoFixo(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.elementos = new String[tamanhoMaximo];
        this.topo = -1; // Inicializa o topo como -1 para indicar que a pilha está vazia
    }

    // Método para empilhar um elemento (push)
    public void push(String elemento) {
        if (topo < tamanhoMaximo - 1) {
            topo++;
            elementos[topo] = elemento;
        } else {
            System.out.println("Erro: Pilha cheia. Não é possível empilhar mais elementos.");
        }
    }

    // Método para desempilhar um elemento (pop)
    public String pop() {
        if (topo >= 0) {
            String elementoDesempilhado = elementos[topo];
            topo--;
            return elementoDesempilhado;
        } else {
            throw new EmptyStackException(); // Pilha vazia, não é possível desempilhar
        }
    }

    // Método para visualizar o elemento no topo da pilha (peek)
    public String peek() {
        if (topo >= 0) {
            return elementos[topo];
        } else {
            throw new EmptyStackException(); // Pilha vazia, não há elementos para visualizar
        }
    }

    // Método para verificar se a pilha está vazia
    public boolean isEmpty() {
        return topo == -1;
    }

    // Método para verificar se a pilha está cheia
    public boolean isFull() {
        return topo == tamanhoMaximo - 1;
    }

    public static void main(String[] args) {
        PilhaComTamanhoFixo pilha = new PilhaComTamanhoFixo(3);

        pilha.push("Elemento 1");
        pilha.push("Elemento 2");
        pilha.push("Elemento 3");

        System.out.println("Topo da pilha: " + pilha.peek());

        pilha.pop();
        System.out.println("Topo da pilha após pop: " + pilha.peek());

        pilha.push("Elemento 4"); // Tentando empilhar em uma pilha cheia

        while (!pilha.isEmpty()) {
            System.out.println("Desempilhado: " + pilha.pop());
        }
    }
}
