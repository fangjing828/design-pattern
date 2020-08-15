package pers.fj.design_pattern.struct.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OrCriteria implements Criteria {
    private final Criteria[] criterion;

    public OrCriteria(Criteria... criterion) {
        this.criterion = criterion;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> result = new ArrayList<>();
        for (Criteria criteria : criterion) {
            result.addAll(criteria.meetCriteria(persons));
        }
        return result.stream().distinct().collect(Collectors.toList());
    }
}
