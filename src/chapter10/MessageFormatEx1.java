package chapter10;

import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";

        Object[] arguments = {"김애옹", "02-1245-7568", "25", "07-24"};

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
