public class WhereNode{
    private boolean negated;
    private boolean nested;
    private String nestingType;
    private SQLNode subQuery;
    private String leftOperandType;
    private String leftOperandPrefix;
    private String leftOperandName;
    private SQLNode leftResolveNode;
    private int leftResolveIndex;
    private String leftOperandValue;
    private String comparison;
    private String rightOperandType;
    private String rightOperandPrefix;
    private String rightOperandName;
    private SQLNode rightResolveNode;
    private int rightResolveIndex;
    private String rightOperandValue;

    public WhereNode(){

    }

    public boolean isNegated() {
        return negated;
    }

    public void setNegated(boolean negated) {
        this.negated = negated;
    }

    public boolean isNested() {
        return nested;
    }

    public void setNested(boolean nested) {
        this.nested = nested;
    }

    public String getNestingType() {
        return nestingType;
    }

    public void setNestingType(String nestingType) {
        this.nestingType = nestingType;
    }

    public SQLNode getSubQuery() {
        return subQuery;
    }

    public void setSubQuery(SQLNode subQuery) {
        this.subQuery = subQuery;
    }

    public String getLeftOperandType() {
        return leftOperandType;
    }

    public void setLeftOperandType(String leftOperandType) {
        this.leftOperandType = leftOperandType;
    }

    public String getLeftOperandPrefix() {
        return leftOperandPrefix;
    }

    public void setLeftOperandPrefix(String leftOperandPrefix) {
        this.leftOperandPrefix = leftOperandPrefix;
    }

    public String getLeftOperandName() {
        return leftOperandName;
    }

    public void setLeftOperandName(String leftOperandName) {
        this.leftOperandName = leftOperandName;
    }

    public SQLNode getLeftResolveNode() {
        return leftResolveNode;
    }

    public void setLeftResolveNode(SQLNode leftResolveNode) {
        this.leftResolveNode = leftResolveNode;
    }

    public int getLeftResolveIndex() {
        return leftResolveIndex;
    }

    public void setLeftResolveIndex(int leftResolveIndex) {
        this.leftResolveIndex = leftResolveIndex;
    }

    public String getLeftOperandValue() {
        return leftOperandValue;
    }

    public void setLeftOperandValue(String leftOperandValue) {
        this.leftOperandValue = leftOperandValue;
    }

    public String getComparison() {
        return comparison;
    }

    public void setComparison(String comparison) {
        this.comparison = comparison;
    }

    public String getRightOperandType() {
        return rightOperandType;
    }

    public void setRightOperandType(String rightOperandType) {
        this.rightOperandType = rightOperandType;
    }

    public String getRightOperandPrefix() {
        return rightOperandPrefix;
    }

    public void setRightOperandPrefix(String rightOperandPrefix) {
        this.rightOperandPrefix = rightOperandPrefix;
    }

    public String getRightOperandName() {
        return rightOperandName;
    }

    public void setRightOperandName(String rightOperandName) {
        this.rightOperandName = rightOperandName;
    }

    public SQLNode getRightResolveNode() {
        return rightResolveNode;
    }

    public void setRightResolveNode(SQLNode rightResolveNode) {
        this.rightResolveNode = rightResolveNode;
    }

    public int getRightResolveIndex() {
        return rightResolveIndex;
    }

    public void setRightResolveIndex(int rightResolveIndex) {
        this.rightResolveIndex = rightResolveIndex;
    }

    public String getRightOperandValue() {
        return rightOperandValue;
    }

    public void setRightOperandValue(String rightOperandValue) {
        this.rightOperandValue = rightOperandValue;
    }
}