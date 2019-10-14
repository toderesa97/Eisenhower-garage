public class TyresChangeDecorator extends WorkDecorator {

    public TyresChangeDecorator(Work work) {
        super(work);
    }

    @Override
    public float getPrice() {
        return 15 + super.getPrice();
    }

    public String getDescription() {
        return super.getDescription() + ", tyres change ";
    }
}
