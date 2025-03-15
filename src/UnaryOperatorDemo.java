import java.util.function.UnaryOperator;

public class UnaryOperatorDemo implements UnaryOperator<Integer> {
    @Override
    public Integer apply(Integer integer) {
        return integer * 2;
    }
}
