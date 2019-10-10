import java.util.HashMap;
import java.util.Map;

public class Garage {

    private Map<Integer,Work> workList = new HashMap<>();

    public void add(Work work){
        workList.put(work.getID(),work);
    }

    public boolean add(int hours, int workID) {
        if(workList.containsKey(workID)){
            workList.get(workID).add(hours);
        } else {
            return false;
        }
        return true;
    }

    public boolean add(double materialCost, int workID){
        Work work = workList.getOrDefault(workID, null);
        if (this.isAddable(work)) {
            FixWork fixWork = (FixWork) work;
            fixWork.add(materialCost);
            return true;
        }
        return false;
    }

    private boolean isAddable(Work work) {
        return work instanceof FixWork && !work.isDone();
    }
}


