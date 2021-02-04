package design.pattern.struct.filter;

import java.util.List;

public class AndCriteria implements Criteria {
    private final Criteria[] criterion;

    public AndCriteria(Criteria... criterion) {
        this.criterion = criterion;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = persons;
        for (Criteria criteria : criterion) {
            result = criteria.meetCriteria(result);
        }
        return result;
    }
}
