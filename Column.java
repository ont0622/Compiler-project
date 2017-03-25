public class Column{
    private String prefix; //contains prefix, if any
    private String name; //contains column name
    private SQLNode sn; //contains SQLNode where column resolves
    private int ci; //contains index of relations where column resolves

    public Column(){
    }

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SQLNode getSn() {
        return sn;
    }

    public void setSn(SQLNode sn) {
        this.sn = sn;
    }

    public int getCi() {
        return ci;
    }

    public void setCi(int ci) {
        this.ci = ci;
    }
}