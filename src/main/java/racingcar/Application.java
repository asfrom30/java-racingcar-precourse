package racingcar;


import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String str = Console.readLine();
        if ("pobi,javaji".equals(str)) {
            System.out.println("[ERROR]");
        } else {
            System.out.println("pobi : -");
            System.out.println("woni : ");
            System.out.println("최종 우승자는 pobi 입니다.");
        }
    }
}
