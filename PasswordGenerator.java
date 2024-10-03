import java.util.Random;

public class PasswordGenerator {
    private static final String LOWERCASE = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIAL_CHARACTERS = "!@#$%^&*()-_=+<>?";
    private static final int PASSWORD_LENGTH = 10;

    public static String generatePassword() {
StringBuilder password = new StringBuilder(PASSWORD_LENGTH);
        Random random = new Random();

        password.append(UPPERCASE.charAt(random.nextInt(UPPERCASE.length())));
        password.append(NUMBERS.charAt(random.nextInt(NUMBERS.length())));
        password.append(SPECIAL_CHARACTERS.charAt(random.nextInt(SPECIAL_CHARACTERS.length())));

        for (int i = 3; i< PASSWORD_LENGTH; i++) {
            password.append(LOWERCASE.charAt(random.nextInt(LOWERCASE.length())));
        }

        return shuffleString(password.toString());
    }

    private static String shuffleString(String input) {
        char[] array = input.toCharArray();
        Random random = new Random();
        for (int i = array.length - 1; i> 0; i--) {
int index = random.nextInt(i + 1);
            char temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return new String(array);
    }

    public static void main(String[] args) {
        for (int i = 0; i< 10; i++) {
System.out.println("Password " + (i + 1) + ": " + generatePassword());
        }
    }
}
