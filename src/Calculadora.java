public class Calculadora {

  public int Som(int a, int b) {

    return a + b;
  }

  public int Sub(int a, int b) {

    return a - b;
  }

  public int Div(int a, int b) {

    if (b == 0) {
      System.err.print("\n[ERRO]:: Não é possível dividir um número por 0.");
    }

    return a / b;
  }

  public int Mul(int a, int b) {

    return a * b;
  }
}
