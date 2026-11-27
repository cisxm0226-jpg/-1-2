import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

public static int readData() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    int radius = 0;

    while (true) {
        try {
            System.out.print("원의 반지름 입력 : ");
            radius = keyboard.nextInt();

            if (radius > 0)
                break;
            else {
                System.err.print("ERROR : 음수 아니야");
                System.in.read();
            }
        } catch (InputMismatchException e) {
            keyboard.nextLine();
            System.err.print("ERROR : 숫자가 아니야");
            System.in.read();
        }
    }

    return radius;
}

double circleArea(int r) {
    double area;

    area = Math.PI * r * r;
    return area;
}

void display(String title, int value) {
    System.out.printf("%s : %,d Cm\n", title, value);
}

void display(String title, double value) {
    System.out.printf("%s : %,.2f ㎠\n", title, value);
}

void main() throws IOException {
    int radius;
    double area;

    radius = readData();
    area = circleArea(radius);

    display("원의 반지름", radius);
    display("원의 면적", area);
}