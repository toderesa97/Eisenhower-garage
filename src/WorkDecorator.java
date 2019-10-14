public abstract class WorkDecorator extends Work {

    private Work work;

    public WorkDecorator(Work work) {
        super(work.getDescription(), work.getID());
        this.work = work;
    }

    public float getPrice() {
        return work.getPrice();
    }

}
