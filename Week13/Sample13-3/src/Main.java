
void main() throws IOException {
    int radius;
    double area;

    radius = Input.readData("원의 반지름");

    area = compute.circleArea(radius);

    output.display("원의 반지름", radius);
    output.display("원의 면적", area);

}
