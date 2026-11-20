//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
void main() throws IOException{
    Scanner keyboard = new Scanner(System.in);
    class Customer {
        String waterNo;
        String name;
        char type;
        String typeName;
        float usage;
        int charge;
        int tax;
        int pay;

        public Customer(String waterNo, String name, char type, float usage) {
            this.waterNo = waterNo;
            this.name = name;
            this.type = type;
            this.usage = usage;
        }
    }

    Customer[] customers = new Customer[]{
            new Customer("1111", "홍길동", '1', 135.7f),
            new Customer("1211", "홍동길", '2', 789.6f),
            new Customer("1311", "길동홍", '3', 2345.6f),
            new Customer("1411", "길홍동", '4', 2524.5f),
            new Customer("1511", "동길홍", '5', 2416.4f),
            new Customer("1611", "동홍길", '6', 1234.5f),
            new Customer("1711", "가나다", '7', 2315.3f),
            new Customer("1811", "라마바", '8', 395.6f),
            new Customer("1911", "사아자", '9', 5049.5f),
            new Customer("1011", "차카타", '0', 2958.3f)};
/*
    int count = 0;
    while (count < customers.length) {
        System.out.printf("%s 고객님의 사용량(예: 12.4)입력 : ", customers[count].name);
        customers[count].usage = keyboard.nextFloat();
        if (customers[count].usage < 0) {
            System.err.println("ERROR : 사용량은 0보다는 커야 함");
            System.in.read();
        } else{
            count++;
        }
    } */

    for (int i = 0; i < customers.length; i++){
        if (customers[i].type == '1') {
            customers[i].typeName = "가정용";
        } else if  (customers[i].type == '2') {
            customers[i].typeName = "영업용";
        }else if  (customers[i].type == '3') {
            customers[i].typeName = "공장용";
        }else if  (customers[i].type == '4') {
            customers[i].typeName = "관공서";
        }else if  (customers[i].type == '5') {
            customers[i].typeName = "군기관";
        } else {
            customers[i].typeName = "";
        }
    }

    for (int i = 0; i < customers.length; i++) {
        customers[i].charge = 1200;
        int usage = (int) (customers[i].usage + 0.5f);
        switch (customers[i].type) {
            case '1' :
                customers[i].charge += usage * 40;
                break;
            case '2' :
                customers[i].charge += usage * 55;
                break;
            case '3' :
                customers[i].charge += usage * 78;
                break;
            case '4' :
                customers[i].charge += usage * 35;
                break;
            case '5' :
                customers[i].charge += usage * 20;
                break;
            default:
                customers[i].charge = 0;
        }
    }

    for (int i = 0; i < customers.length; i++){
        if (customers[i].type == '1') {
            customers[i].tax = (int) (customers[i].charge * 5.0f / 100);
        } else if  (customers[i].type == '2') {
            customers[i].tax = (int) (customers[i].charge * 3.5f / 100);
        }else if  (customers[i].type == '3') {
            customers[i].tax = (int) (customers[i].charge * 2.5f / 100);
        }else if  (customers[i].type == '4') {
            customers[i].tax = (int) (customers[i].charge * 1.5f / 100);
        }else if  (customers[i].type == '5') {
            customers[i].tax = 0;
        } else {
            customers[i].tax = -1;
        }

        customers[i].tax = customers[i].tax / 10 * 10;
    }

    for (int i = 0; i < customers.length; i++){
        customers[i].pay = customers[i].charge + customers[i].tax;
    }

    for (int i = 0; i < customers.length; i++){
        for (int j = 1; j < customers.length - i; i++){
            if (customers[j-1].pay < customers[j].pay) {
                Customer temp = customers[j - 1];
                customers[j-1] = customers[j];
                customers[j] = temp;
            }
        }
    }

    System.out.println("**********************************************************************");
    System.out.println(" 번호  이름    구분     사용량     사용금액       세금      납부금액    기타");
    System.out.println("**********************************************************************");

    for (int i = 0; i < customers.length; i++) {
        System.out.printf("%4s %3s %c %3s %,7.1f %,10d원 %,8d원 %,10d원 %s\n", customers[i].waterNo, customers[i].name, customers[i].type,customers[i].typeName, customers[i].usage, customers[i].charge,
                customers[i].tax, customers[i].pay, customers[i].type == '5' ? "일괄징수" : "");
    }
    System.out.println("*********************************************************************");
}
