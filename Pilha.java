public class Pilha {

  int item;
  int ponteiro = -1;
  int tamanho;

  public Pilha(int tamanho) throws Exception {
    this.tamanho = tamanho -1;
    if (tamanho > 10) throw new Exception("O tamanho máximo da pilha deve ser de 10.");
  }

  int[] pilha = new int[10];

  void pop() throws Exception {
    if (ponteiro >= 0) {
      ponteiro--;
    } else {
      throw new Exception("Não há itens na pilha");
    }
  }

  void push(int item) throws Exception {
    if (ponteiro > tamanho - 1) {
      throw new Exception("Não é possível incluir o item " + item + " na pilha, pois ela está cheia.");
    } else {
      ponteiro++;
      pilha[ponteiro] = item;
    }
  }

  void peek() throws Exception {
    if (ponteiro >= 0) {
      System.out.println(pilha[ponteiro]);
    } else {
      throw new Exception("Não há itens na pilha");
    }
  }
}
