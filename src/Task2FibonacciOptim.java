import java.util.ArrayList;

public class Task2FibonacciOptim {

// Оптимизируйте алгоритм для вычисления чисел Фибоначчи (см. этот урок, задача 2),
// оцените временну́ю и пространственную эффективность.
  public static void main(String[] args) {          // O(n) - time, O(n) - space ?
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(1);
    System.out.println("fibonacci(10) = " + fibonacci(10, numbers));
    System.out.println(numbers);
  }

  /**
   * Поиск числа Фибоначчи
   *
   * @param n порядковый номер числа Фибоначчи
   * @return число Фибоначчи
   */
  public static int fibonacci(int n, ArrayList<Integer> numbers) {
    if (n < 3) { // для 1 и 2
      return numbers.get(n - 1);
    }
    if (numbers.size() < n) {
      numbers.add(fibonacci(n - 1, numbers) + fibonacci(n - 2, numbers));
    }
    return numbers.get(n - 1);
  }
}
