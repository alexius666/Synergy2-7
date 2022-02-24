package java_synergy;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception{
            Digit digit = new Digit(-2);
            Class<? extends Digit> digitClass = digit.getClass();
            Field valueField = digitClass.getDeclaredField("value");
            Even evenAnnotation;
            if ((evenAnnotation = (Even)valueField.getAnnotation(Even.class)) != null) {
                valueField.setAccessible(true);
                int digitValue = (Integer)valueField.get(digit);
                if (digitValue >= 0) {
                    //valueField.set(digit, evenAnnotation.value());
                    System.out.println(evenAnnotation.message());
                }
                else {
                    //valueField.set(digit, evenAnnotation.value());
                    System.out.println(evenAnnotation.negativeMsg());
                }
            }

            Method incrementMethod = digitClass.getDeclaredMethod("increment", Integer.TYPE);
            Even evenParamMethod = (Even)incrementMethod.getParameters()[0].getAnnotation(Even.class);
            if (evenParamMethod != null) {
            }
    }
}
