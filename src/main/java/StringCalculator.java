import java.io.IOException;

public class StringCalculator {
    int add(String number1){
        int result = 0;

        if (number1.isEmpty())
            return 0;
        else {
            var numbers = number1.split("[,\n]");
            for (var number : numbers) {
                result = result + Integer.parseInt(number);




/*                try {

                    if(result < 0)
                        throw new MyException("Number is negative");
                }
                catch (MyException m) {
                    System.out.println(m);
                }*/




            }
        }
        return result;
    }
}