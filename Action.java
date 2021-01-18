package CatRobotHuman;

public class Action {

    void tryActionPositive() {
        Parameters cat1 = new Cat("Котик", 100, 2);
        Parameters cat2 = new Cat("Обормотик", 20, 1);

        Parameters human1 = new Human("Человек", 1000, 3);
        Parameters human2 = new Human("Молекула", 1500, 10);

        Parameters robot1 = new Robot("Разрушитель", 1000, 10);
        Parameters robot2 = new Robot("Пылесос", 10, 1);

        Parameters[] atlets = {cat1, cat2, human1, human2, robot1, robot2};


        RunAndJump jump1 = new Jump(5);
        RunAndJump jump2 = new Jump(3);

        RunAndJump run1 = new Run(100);
        RunAndJump run2 = new Run(1000);

        RunAndJump[] runAndJumps = {jump1, jump2, run1, run2};

        for (int i = 0; i < runAndJumps.length; i++) {

            for (Parameters parameters : atlets) {
                if (parameters.getSuccess()) {
                    runAndJumps[i].check(parameters);
                }
            }
        }
    }

    void tryActionNegative() {

        Parameters cat1 = new Cat("Котик", 100, 2);
        Parameters cat2 = new Cat("Обормотик", 20, 1);

        Parameters human1 = new Human("Человек", 1000, 3);
        Parameters human2 = new Human("АМолекула", 1500, 10);

        Parameters robot1 = new Robot("Разрушитель", 1000, 10);
        Parameters robot2 = new Robot("Пылесос", 10, 1);

        Parameters[] atlets = {cat1, cat2, human1, human2, robot1, robot2};


        RunAndJump jump1 = new Jump(1);
        RunAndJump jump2 = new Jump(3);

        RunAndJump run1 = new Run(700);
        RunAndJump run2 = new Run(1000);

        RunAndJump[] runAndJumps = {jump1, jump2, run1, run2};

        for (int i = 0; i < runAndJumps.length; i++) {
            for (Parameters parameters : atlets) {
                if (!parameters.getSuccess()) {
                    runAndJumps[i].check(parameters);
                }


            }
        }

    }
}
