public class FixWork extends Work{

    private double materialsCost;

    public FixWork(String description, int id) {
        super(description, id);
    }

    @Override
    public float getPrice() {
        return (float) (super.getTakenHours()*35 + materialsCost*1.3);
    }

    public double getMaterialsCost() {
        return materialsCost;
    }

    public FixWork setMaterialsCost(double materialsCost) {
        this.materialsCost = materialsCost;
        return this;
    }

    public void add(double materialCost) {
        this.materialsCost += materialCost;
    }

    @Override
    public String toString() {
        return "FixWork{" +
                "Price=" + this.getPrice() +
                ", Desc=" + super.getDescription() +
                '}';
    }
}
