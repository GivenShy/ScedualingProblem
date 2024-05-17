import java.util.Random;

public class Autoassociator {
    private int weights[][];
    private int trainingCapacity;

    private int trainCounter;
    private Random random;
    private  CourseArray courseArray;

    public Autoassociator(CourseArray courses) {
        // TO DO
        // creates a new Hopfield network with the same number of neurons
        // as the number of courses in the input CourseArray
        courseArray = courses;
        weights = new int[courses.length()][courses.length()];
        random = new Random();
        trainCounter = 0;

    }

    public int getTrainingCapacity() {

        return weights.length;
    }

    public void training(int pattern[]) {
        for (int i = 1; i < weights.length; i++) {
            for (int j = 1; j < weights[i].length; j++) {
                if (i == j) {
                    weights[i][j] = 0;
                } else {
                    weights[i][j] += pattern[i] * pattern[j];
                }
            }
        }
        trainCounter++;
    }

    public int getTrainCounter(){
        return trainCounter;
    }
    public int unitUpdate(int neurons[]) {
        int index = random.nextInt(neurons.length-1)+1;
        unitUpdate(neurons,index);
        return index;
    }

    public void unitUpdate(int neurons[], int index) {
        int sum = 0;
        for(int i = 1;i<neurons.length;i++){
            sum+=weights[index][i] * neurons[i];
        }
        neurons[index] = sum>0?1:-1;
    }

    public void chainUpdate(int neurons[], int steps) {
        for(int i = 0;i<steps;i++){
            unitUpdate(neurons);
        }
    }

    public void fullUpdate(int neurons[]) {
        // TO DO
        // updates the input until the final state achieved
    }

    public boolean needTrain(){
        return trainCounter<= weights.length*0.139;
    }
}
