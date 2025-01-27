// MoveRequest.java
public class MoveRequest {
    private int sourceRow;
    private int sourceCol;
    private int targetRow;
    private int targetCol;

    public MoveRequest(int sourceRow, int sourceCol, int targetRow, int targetCol) {
        this.sourceRow = sourceRow;
        this.sourceCol = sourceCol;
        this.targetRow = targetRow;
        this.targetCol = targetCol;
    }

    public int getSourceRow() {
        return sourceRow;
    }

    public void setSourceRow(int sourceRow) {
        this.sourceRow = sourceRow;
    }

    public int getSourceCol() {
        return sourceCol;
    }

    public void setSourceCol(int sourceCol) {
        this.sourceCol = sourceCol;
    }

    public int getTargetRow() {
        return targetRow;
    }

    public void setTargetRow(int targetRow) {
        this.targetRow = targetRow;
    }

    public int getTargetCol() {
        return targetCol;
    }

    public void setTargetCol(int targetCol) {
        this.targetCol = targetCol;
    }
}