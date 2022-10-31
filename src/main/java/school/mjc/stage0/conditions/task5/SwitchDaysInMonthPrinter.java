package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        int days = 0;
        switch (month) {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                days = 31;
                System.out.println(days);
                break;
            case (2):
                days = 28;
                System.out.println(days);
                break;
            case (4):
            case (6):
            case (9):
            case (11):
                days = 30;
                System.out.println(days);
                break;
            default:
                System.out.println("wrong number!");
                break;
        }
    }
}
