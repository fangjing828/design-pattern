package pers.fj.design_pattern.struct.adaptor;

public class AdapteeResult {
    private int type;
    private String name;

    public AdapteeResult() {
    }

    public AdapteeResult(int type, String name) {
        this.type = type;
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
