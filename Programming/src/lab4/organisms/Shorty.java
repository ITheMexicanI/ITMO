package lab4.organisms;

import lab4.Descriptions;
import lab4.Traits;
import lab4.location.City;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;

public class Shorty extends Villager {
    private int height;
    private List<Integer> grades;

    public Shorty(String name, int age, List<Traits> traits, City city, int height) {
        super(name, age, traits, "ученик", city);

        this.height = height;
        grades = new ArrayList<>();
    }

    public Shorty(String name, int age, City city, int height) {
        super(name, age, "ученик", city);

        this.height = height;
        grades = new ArrayList<>();
    }

    public int getHeight() {
        return height;
    }

    public String surprised() {
        if (getSettlement().getBuildingNamesList().contains("Ангар")) return "Увидел ангар";
        else return "Ангар еще не построен, удивляться рано";
    }

    @Override
    public void happyBirthday() {
        super.happyBirthday();
        this.height += 1;
    }

    public void getMark(int mark) {
        grades.add(mark);
    }

    public String getStatistic() {
        IntSummaryStatistics stats = grades
                .stream()
                .mapToInt(Integer::intValue)
                .summaryStatistics();

        return getTypeName() + " имеет " + stats.getCount() + " оценок, средний балл: " + stats.getAverage();
    }

    @Override
    public Descriptions getDescription() {
        return Descriptions.SHORTIES;
    }
}
