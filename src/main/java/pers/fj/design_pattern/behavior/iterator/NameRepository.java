package pers.fj.design_pattern.behavior.iterator;

public class NameRepository implements Container{
    @Override
    public Iterator iterator() {
        return new NameIterator();
    }

    private String[] names = new String[]{"A", "B", "C", "D"};


    class NameIterator implements Iterator {
        int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public Object next() {
            if (hasNext()) {
                return names[index++];
            }
            return null;
        }
    }
}
