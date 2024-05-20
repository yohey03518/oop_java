
public class Main {
  public static void main(String[] args) {
    Caculator caculator = new Caculator();
    caculator.Add(1);
    caculator.Add(1.5d);
    System.out.println(caculator.GetResult());
    caculator.Multiply(3.14f);
    System.out.println(caculator.GetResult());

    caculator.Clean();
    System.out.println(caculator.GetResult());
    caculator.Add(3);
    System.out.println(caculator.GetResult());
  }
}