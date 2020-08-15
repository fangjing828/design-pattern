package pers.fj.design_pattern.struct.adaptor;

public class TargetResult {
    private String type;
    private String name;
    private String source;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return "TargetResult{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", source='" + source + '\'' +
                '}';
    }
}
