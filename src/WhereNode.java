public class WhereNode{
    boolean negated;
    boolean nested;
    String nestingType;
    SQLNode subQuery;
    String leftOperandType;
    String leftOperandPrefix;
    String leftOperandName;
    SQLNode leftREsolveNode;
    int leftResolveIndex;
    String leftOperandValue;
    String comparison;
    String rightOperandType;
    String rightOperandPrefix;
    String rightOperandName;
    SQLNode rightResolveNode;
    int rightResolveIndex;
    String rightOperandValue;
}