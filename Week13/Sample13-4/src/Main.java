void main() throws IOException{
    int[] score;
    int sum;

    score = Input.readData(subject.values().length);

    sum = compute.calcTotal(score);

    output.display(score, sum);
}
