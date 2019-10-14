public class ClutchChangeDecorator extends WorkDecorator {

    public ClutchChangeDecorator(Work work) {
        super(work);
    }

    @Override
    public float getPrice() {
        return 65 + super.getPrice();
    }

    public String getDescription() {
        return super.getDescription() + ", clutch change ";
    }
}
