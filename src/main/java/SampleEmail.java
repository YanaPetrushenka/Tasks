import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SampleEmail {
    public static void main(String[] args) {
        String[] emailList = {"test@mail.ru",
                "123-kkdf@gmail.com",
                "123@343.com",
                "qwerty@.com",
                "123123@yandex.com",
                "test.test@gmail.com",
                "sdfsdfs@gmail."};

        for (String email : emailList) {
            if (isValidEmail(email)) {
                System.out.println(email + " верный формат");
            } else {
                System.out.println(email + " неверный формат");
            }
        }
    }

    public static boolean isValidEmail(String email) {
        String emailPattern = "^([a-z0-9_-]+\\.)*[a-z0-9_]+@[a-z]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";
        return Pattern.matches(emailPattern, email);
    }
}
