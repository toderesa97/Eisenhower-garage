import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Garage {

    private Map<Integer, Work> workList = new HashMap<>();

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

    public int countForCheckErrors(){
        int counter = 0;
        for (Map.Entry<Integer, Work> workEntry : workList.entrySet()) {
            Work work = workEntry.getValue();
            if (work instanceof CheckWork && ((CheckWork) work).containsErrors()) {
                counter++;
            }
        }
        return counter;
    }

    public void saveAll() {
        // stream API
        List<Work> orderedWorks = this.workList
                .values()
                .stream()
                .sorted((work1, work2) -> work1.getDescription().compareTo(work2.getDescription()))
                .collect(Collectors.toList());
        writeTo("reparations.txt", orderedWorks.stream()
                .map(Work::toString)
                .collect(Collectors.joining("\n")));
    }

    private void writeTo(String filePath, String content) {
        Path file = Paths.get(filePath);
        try {
            Files.write(file, Collections.singleton(content), StandardCharsets.UTF_8);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}


