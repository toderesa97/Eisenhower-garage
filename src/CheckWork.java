public class CheckWork extends Work{

    public CheckWork(String description, int id) {
        super(description, id);
    }

    @Override
    public float getPrice() {
        return super.getTakenHours()*30+20;
    }

    @Override
    public String toString() {
        return "CheckWork{" +
                "Price=" + this.getPrice() +
                '}';
    }
}
