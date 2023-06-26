import java.util.Arrays;
public class Array {
    public static void main(String[] args) {
        char vowels[] = new char[5];

        vowels[0] = 'a';
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
// you can declare array like this:
        char vowels2[] = {'a', 'e', 'i', 'o', 'u'};

        System.out.println(Arrays.toString(vowels));

        int numbers[] = {1, 2, 3, 4, 5};
// the type of number should be the same as the type of an array
        for(int number : numbers) {
            System.out.println(number);
        }
    }}

