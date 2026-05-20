package chap07;

//65세이상: 70% 할인

public class IfSwitchTest {
    public static void main(String[] args) {
        int age = 6;
        int price = 20000;

        double discountRate = 0.0;
        int lastPrice = price;

        if(age <= 7)
            discountRate = 1;
        else if(age <= 11){
            discountRate = 0.5;
        }
        else if(age <= 19){
            discountRate = 0.3;
        }
        else if(age >= 65){
            discountRate = 0.7;
        }
        else{
            discountRate = 0.0;
        }

        lastPrice = (int)(price * (1-discountRate));


        System.out.println("나이가 "+age+"세 이므로 할인율 "+ discountRate*100 + "%적용되어 요금은 "+lastPrice+"원 입니다.");
    }
}
