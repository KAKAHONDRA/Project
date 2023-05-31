import java.util.Random;
import java.util.Scanner;
class RockPaperScissors {
    private static GameItem[] items = { new Rock(), new Scissors(), new Paper() };
    private static Random random = new Random();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your choice (rock, scissors, paper): ");
            String userInput = scanner.nextLine().toLowerCase();

            // Проверяем корректность ввода пользователя
            if (!userInput.equals("rock") && !userInput.equals("scissors") && !userInput.equals("paper")) {
                System.out.println("Invalid input. Please try again.");
                continue;
            }

            // Генерируем случайный выбор компьютера
            int computerChoice = random.nextInt(3);
            GameItem computerItem = items[computerChoice];

            // Определяем выбор пользователя
            GameItem userItem;
            if (userInput.equals("rock")) {
                userItem = new Rock();
            } else if (userInput.equals("scissors")) {
                userItem = new Scissors();
            } else {
                userItem = new Paper();
            }

            // Выводим выбор пользователя и компьютера
            System.out.println("Your choice: " + userItem);
            System.out.println("Computer's choice: " + computerItem);

            // Определяем победителя
            if (userItem.beats(computerItem)) {
                System.out.println("You win!");
            } else if (computerItem.beats(userItem)) {
                System.out.println("Computer wins!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println();
        }
    }
}