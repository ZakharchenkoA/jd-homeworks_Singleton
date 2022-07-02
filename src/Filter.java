import java.util.ArrayList;
import java.util.List;

public class Filter {
    protected int treshold;

    public Filter(int treshold) {
        this.treshold = treshold;
    }

    public List<Integer> filterOut(List<Integer> source) {
        Logger logger = Logger.getInstance();
        logger.log("Запускаем фильтрации");
        List<Integer> result = new ArrayList<>();
        for (int f : source) {
            if (f >= treshold) {
                result.add(f);
                logger.log("Элемент " + "'" + f + "'" + " подходит");
            } else {
                logger.log("Элемент " + "'" + f + "'" + " не подходит");
            }
        }
        logger.log(String.format("Прошло фильтр %s элемента из %s", result.size(), source.size()));
        return result;
    }
}