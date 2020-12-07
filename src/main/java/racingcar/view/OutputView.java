package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Cars;

import java.util.List;

public class OutputView {
    private static final String EXECUTION_RESULT_MESSAGE = "\n실행 결과\n";
    private static final String PROGRESS_BAR = "-";

    private OutputView() {}

    public static void printExecutionResultMessage() {
        System.out.print(EXECUTION_RESULT_MESSAGE);
    }

    public static void printProgress(Cars cars) {
        for (Car car : cars.getCars()) {
            System.out.print(car.getName() + " : " + PROGRESS_BAR.repeat(car.getPosition()) + "\n");
        }
        System.out.println();
    }

    public static void printWinners(List<String> winners) {
        System.out.println("최종 우승자: " + String.join(", ", winners));
    }
}
