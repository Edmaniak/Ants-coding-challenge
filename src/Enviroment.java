
/**
 * zde se setkaji mravenci
 */

public class Enviroment {

    private Ant[] meetingSpace;
    private Color colorColony1;
    private Color colorColony2;

    public Enviroment(int countOfAnts, Color colorColony1, Color colorColony2) {

        this.meetingSpace = new Ant[countOfAnts * 2];
        this.colorColony1 = colorColony1;
        this.colorColony2 = colorColony2;

        for (int i = 0; i < countOfAnts; i++)
            meetingSpace[i] = new Ant(colorColony1, (char) ('A' + i));

        for (int i = countOfAnts; i < countOfAnts * 2; i++)
            meetingSpace[i] = new Ant(colorColony2, (char) ('A' + i));

    }

    /**
     * Starts the ants movement against each other
     */
    public void run() {
        printMeetSpace(0);
        for (int i = 0; i < meetingSpace.length - 1; i++) {
            for (int j = 0; j < meetingSpace.length - 1; j++) {
                if (meetingSpace[j].getColor() == colorColony1 && meetingSpace[j + 1].getColor() == colorColony2) {
                    Ant a = meetingSpace[j];
                    meetingSpace[j] = meetingSpace[j + 1];
                    meetingSpace[j + 1] = a;
                    j++;
                }
            }
            printMeetSpace(i + 1);
        }
    }

    /**
     * Prints the current state of meetingSpace
     *
     * @param order the round that the state is in
     */
    private void printMeetSpace(int order) {
        System.out.print(Color.WHITE + " " + (order + 1) + ")");

        for (int i = 0; i < meetingSpace.length; i++)
            System.out.print(meetingSpace[i]);

        System.out.println();
    }


}
