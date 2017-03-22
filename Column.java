public class Column{
    String prefix; //contains prefix, if any
    String name; //contains column name
    SQLNode sn; //contains SQLNode where column resolves
    int ci; //contains index of relations where column resolves
}