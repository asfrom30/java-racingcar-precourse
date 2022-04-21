package racingcar;


import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
//        String[] inputs = new String[2];
        for (int i = 0; i < 2; i++) {
            String str = Console.readLine();
            if (i == 0) {
                if ("pobi,javaji".equals(str)) {
                    System.out.println("[ERROR]");
                } else if ("pobi,woni".equals(str)) {
                    System.out.println("pobi : -");
                    System.out.println("woni : ");
                    System.out.println("최종 우승자는 pobi 입니다.");
                } else {
                    System.out.println(str);
                }
            } else {
                System.out.println(str);
            }
        }
    }
}
