import java.util.List;

class CalculatorConundrum {

  public String calculate(int operand1, int operand2, String operation) {
    if (operation == null) {
      throw new IllegalArgumentException("Operation cannot be null");
    }

    if (operation.isEmpty()) {
      throw new IllegalArgumentException("Operation cannot be empty");
    }

    List<String> allowedOperations = List.of("+", "*", "/");

    if (!allowedOperations.contains(operation)) {
      throw new IllegalOperationException(
        String.format("Operation '%s' does not exist", operation)
      );
    }

    String baseStringFormat = String.format(
      "%s %s %s = ",
      operand1,
      operation,
      operand2
    );

    if (operation.equals("+")) return baseStringFormat + (operand1 + operand2);
    if (operation.equals("*")) return baseStringFormat + operand1 * operand2;

    try {
      return baseStringFormat + operand1 / operand2;
    } catch (ArithmeticException c) {
      throw new IllegalOperationException("Division by zero is not allowed", c);
    }
  }
}
