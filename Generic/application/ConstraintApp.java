package Generic.application;

public class ConstraintApp {
    public static void main(String[] args) {
        NumberData<Integer> integerNumberdata = new NumberData<>(1);
        NumberData<Long> longNumberdata = new NumberData<>(1L);

        // NumberData<String > stringNumberdata = new NumberData<String>("AgentA");
        // Error

    }

    public static class NumberData<T extends Number> {
        private T data;

        public T getData() {
            return data;
        }

        public NumberData(T data) {
            this.data = data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
