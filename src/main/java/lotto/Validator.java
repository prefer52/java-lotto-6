package lotto;

public class Validator {
    // 공백이거나 NULL인지 검증
    public static Boolean isBlankOrNULL(String input) {
        if (input.equals("") || input == null)
            throw new IllegalArgumentException("[ERROR]");

        return true;
    }

    // 공백문자를 포함하는지 검증
    public static Boolean containSpace(String input) {
        if (input.contains(" "))
            throw new IllegalArgumentException("[ERROR]");

        return true;
    }

    // 양의 정수 입력이 맞는지 검증
    public static Boolean isNumber(String input) {
        try {
            Integer number = Integer.parseInt(input);
            // Integer으로 변환된 값이 입력 값과 같지 않을 시 예외 발생
            if (number.toString().equals(input))
                throw new IllegalArgumentException("[ERROR]");
            if (number < 0)
                throw new IllegalArgumentException("[ERROR]");
        } catch (NumberFormatException e) {

        throw new IllegalArgumentException("[ERROR]");
    }
        return true;
    }

    // 1000원으로 나누어 떨어지는지 검증
    public static Boolean isDividedBy(int divisor, Integer amount) {
        if (amount%divisor != 0)
            throw new IllegalArgumentException("[ERROR]");

        return true;
    }

    // ',,'가 포함되어 있거나 ','로 시작하거나 끝나는지 검증
    public static Boolean containInvalidComma(String input) {
        if (input.contains(",,") || input.startsWith(",") ||
                input.endsWith(","))
            throw new IllegalArgumentException("[ERROR]");

        return true;
    }
}
