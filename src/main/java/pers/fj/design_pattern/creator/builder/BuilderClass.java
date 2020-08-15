package pers.fj.design_pattern.creator.builder;

public class BuilderClass {
    private String key;
    private String value;

    public static BuilderClass newBuilder() {
        return new BuilderClass();
    }

    public BuilderClass withKey() {
        this.key = key;
        return this;
    }

    public BuilderClass withValue() {
        this.value = value;
        return this;
    }

    public SomeClass build() {
        SomeClass some = new SomeClass();
        some.setKey(key);
        some.setValue(value);
        return some;
    }
}
