import lombok.Data;

@Data
public class Function {
    private MathExpression function;
    private String stringFunction;

    public Function(MathExpression function, String stringFunction) {
        this.function = function;
        this.stringFunction = stringFunction;
    }

    public double getValueOfFunction(double x) {
        return function.getValueOfFunction(x);
    }
}
