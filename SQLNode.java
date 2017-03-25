import java.util.ArrayList;

public class SQLNode{
    private boolean distinct;
    private ArrayList<Column> columns;
    private ArrayList<String[]> relations;
    //[0] element contains relation name
    //[1] element contains relation alias, if any
    private ArrayList<WhereNode> whereNode;
    private SQLNode parent;

    public SQLNode(){

    }

    public boolean isDistinct() {
        return distinct;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public ArrayList<Column> getColumns() {
        return columns;
    }

    public void setColumns(ArrayList<Column> columns) {
        this.columns = columns;
    }

    public ArrayList<String[]> getRelations() {
        return relations;
    }

    public void setRelations(ArrayList<String[]> relations) {
        this.relations = relations;
    }

    public ArrayList<WhereNode> getWhereNode() {
        return whereNode;
    }

    public void setWhereNode(ArrayList<WhereNode> whereNode) {
        this.whereNode = whereNode;
    }

    public SQLNode getParent() {
        return parent;
    }

    public void setParent(SQLNode parent) {
        this.parent = parent;
    }

    public SQLNode eval(){

    }
}