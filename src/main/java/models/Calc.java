package models;

public class Calc {
    private String operation;
    private Integer operand1;
    private Integer operand2;
    private Integer result;

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public void calculate(String operation, Integer a, Integer b) {

        result=0;
        switch (operation) {
            case "сложение" -> setResult(a + b);
            case "вычитание" -> setResult(a - b);
            case "умножение" -> setResult(a * b);
            case "деление" -> setResult(a / b);
            default -> System.out.println("Неверный ввод, повторите попытку");

        }

    }
}



