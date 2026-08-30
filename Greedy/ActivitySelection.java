public class ActivitySelection {

    public static void main(String[] args) {

        int start[] = {10, 12, 20};
        int end[] = {20, 25, 30};

        int maxAct = 0;
        int lastEnd = 0;

        for (int i = 0; i < start.length; i++) {

            if (start[i] >= lastEnd) {
                maxAct++;
                lastEnd = end[i];

                System.out.println("Selected Activity: A" + i);
            }
        }

        System.out.println("Maximum Activities = " + maxAct);
    }
}