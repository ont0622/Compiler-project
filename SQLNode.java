public class SQLNode{
    boolean distinct;
    ArrayList<Column> columns;

    ArrayList<String[]> relations;
    //[0] element contains relation name
    //[1] element contains relation alias, if any
    ArrayList<WhereNode> whereNode;

    SQLNode parent;
}