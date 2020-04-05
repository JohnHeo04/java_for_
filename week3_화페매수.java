package java_tutorials;

public class week3_화페매수 extends money_04_02 {
    public static void main(String[] args) {

        int UNIT = 50000; // 화폐단위 ; 50000원, 10000원, 1000원, 500원, 100, 10원, 1
                          // 100원권, 50원권, 10원권, 5원권, 1원권
        int NUM = 0; // 화폐 매수
        int SW = 1; // 스위칭 변수

        int MONEY = 65245; // 입력받는 금액

        while (true) {
            NUM = MONEY / UNIT; // 몫 ; 화폐매수 : 입력받은 금액을 화폐단위로 나눈다.
            System.out.println(UNIT+"원 ->" + NUM + "개"); // 출력

            if (UNIT <= 1) { // UNIT가 1보다 작거나 같은면
                break; // 반복문 종료
            }//if
            
            MONEY = MONEY - UNIT * NUM; // 나누어 나온 나머지 . 다음 금액의 초기값
            
            if (SW == 0) { // 화폐의 다음 단위를 스위칭 변수를 이용해서 2, 5로 번갈아 나눔
                if(UNIT == 10000 || UNIT == 100 || UNIT == 10) {
                	UNIT = UNIT / 10; // 10000/2 = 5000,......
                	SW = 0;
                } else {
                	UNIT = UNIT / 2; // 5000/5 = 1000,......
                	SW = 1;
                } 	
           } else {
            	UNIT = UNIT / 5;
            	SW = 0;
            }
            
            //if
        }// while
    	
    	
        
    }
}
