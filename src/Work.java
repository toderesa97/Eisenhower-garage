public abstract class Work {

    private String description;
    private int takenHours;
    private final int ID;
    private boolean done;

    public Work(String description, int id) {
        this.description = description;
        this.ID = id;
    }

    public abstract float getPrice();

    public String getDescription() {
        return description;
    }

    public Work setDescription(String description) {
        this.description = description;
        return this;
    }

    public int getTakenHours() {
        return takenHours;
    }

    public Work setTakenHours(int takenHours) {
        this.takenHours = takenHours;
        return this;
    }

    public int getID() {
        return ID;
    }

    public boolean isDone() {
        return done;
    }

    public Work setDone(boolean done) {
        this.done = done;
        return this;
    }

    public void add(int hours) {
        this.takenHours += hours;
    }

    public void markAsDone() {
        this.done = true;
    }
}
