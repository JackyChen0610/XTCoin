import java.util.Scanner;

public class Calculation {

//  System.out.println("输入数据："+read);

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            System.out.print("每小时心跳次数：");

            Scanner scan = new Scanner(System.in);
            String read = scan.nextLine();

            System.out.print("该小时产生代币：" + new Calculation().calculate(read));
            System.out.println();
            System.out.println();
        }

    }

    private Double calculate(String x) {

        Integer xReq = Integer.parseInt(x);

        Double xRes = new Double(0);

        //50-70,120-150 每小时产生代币0.5
        if ((50 <= xReq / 60 && 70 >= xReq / 60) || (120 <= xReq / 60 && 150 >= xReq / 60)) {
            xRes = 5.0;
        }
        //70-120 每小时产生代币1.0
        if (70 < xReq / 60 && 120 > xReq / 60) {
            xRes = 10.0;
        }
        //其他情况每小时产生代币为0

        return xRes;

    }


}
