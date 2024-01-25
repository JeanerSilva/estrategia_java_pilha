public class TestePilha {

  public static void main(String args[]) throws Exception {
    System.out.println("hello");

    Pilha p = new Pilha(10);

    for (int x = 1; x < 15; x++) {
        p.push(x);
        p.peek();
      }

    p.push(1);
    p.peek();
    p.push(3);
    p.peek();
    p.pop();
    p.peek();
    //p.pop();
    //p.peek();

  }
}
