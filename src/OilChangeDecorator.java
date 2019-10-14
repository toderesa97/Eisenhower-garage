public class OilChangeDecorator extends WorkDecorator{

    public OilChangeDecorator(Work work) {
        super(work);
    }

    @Override
    public float getPrice() {
        return 5 + super.getPrice();
    }

    public String getDescription() {
        return super.getDescription() + ", oil change ";
    }
}
