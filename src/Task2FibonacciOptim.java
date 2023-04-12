public class Task2FibonacciOptim {

// Оптимизируйте алгоритм для вычисления чисел Фибоначчи (см. этот урок, задача 2),
// оцените временну́ю и пространственную эффективность.
  public static void main(String[] args) {
    System.out.println("fibonacci(10) = " + fibonacci(10));
  }

  /**
   * Поиск числа Фибоначчи
   *
   * @param n порядковый номер числа Фибоначчи
   * @return число Фибоначчи
   */
  public static int fibonacci(int n) {
    if (n < 3) { // для 1 и 2
      return 1;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
