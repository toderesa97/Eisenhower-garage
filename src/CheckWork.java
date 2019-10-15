import java.util.Arrays;

public class CheckWork extends Work{

    private String[] chekList;

    public CheckWork(String description, int id) {
        super(description, id);
        chekList = new String[]{"No","No","No","No","No","No","No","No","No","No"};
    }

    @Override
    public float getPrice() {
        return super.getTakenHours()*30+20;
    }

    @Override
    public String toString() {
        return "CheckWork{" +
                "Price=" + this.getPrice() +
                ", Desc=" + super.getDescription() +
                '}';
    }

    public CheckWork setChekList(String[] chekList) {
        this.chekList = chekList;
        return this;
    }

    public String[] getChekList() {
        return chekList;
    }

    public boolean containsErrors(){
        return Arrays.asList(chekList).contains("No");
    }
}
