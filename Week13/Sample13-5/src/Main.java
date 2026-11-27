void main() throws IOException{
    int[] score;
    int sum;

    Input input = new Input();
    score = Input.readData(subject.values().length);


    compute compute = new compute();
    sum = compute.calcTotal(score);


    output output = new output();
    output.display(score, sum);
}
