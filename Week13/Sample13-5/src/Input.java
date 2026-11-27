import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static int[] readData(int length) {
        Scanner keyboard = new Scanner(System.in);
        int[] score = new int[length];

        int i = 0;
        while (i < length) {
            try {
                System.out.printf("%s 성적 입력 : ", subject.values()[i]);
                score[i] = keyboard.nextInt();

                if (score[i] >= 0 && score[i] <= 100) {
                    i++;
                } else {
                    System.err.println("ERROR : 0~100 사이로 입력해");
                }
            } catch (InputMismatchException e) {
                keyboard.nextLine();
                System.err.println("ERROR : 정수를 입력해");
            }
        }

        return score;
    }
}