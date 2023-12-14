public class Employee {

    public static int workDays = 7;

    private final String name;
    private final int id;
    // Work start times for given week
    private int[] startTimes;
    // Work end times for given week
    private int[] endTimes;

    public Employee(String name, int id, int[] startTimes, int[] endTimes) {
        this.name = name;
        this.id = id;
        this.startTimes = startTimes;
        this.endTimes = endTimes;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public int getStartTimeByDay(int day) {
        return startTimes[day];
    }

    public int getEndTimeByDay(int day) {
        return endTimes[day];
    }

    public void setStartTimes(int[] startTimes) {
        System.arraycopy(startTimes, 0, this.startTimes, 0, startTimes.length);
    }

    public void setEndTimes(int[] endTimes) {
        System.arraycopy(endTimes, 0, this.endTimes, 0, endTimes.length);
    }

}
