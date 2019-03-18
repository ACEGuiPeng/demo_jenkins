/**
 * @author guipeng
 * @description
 * @date 2019/3/18 9:08
 */
class TestDemo {
    private int sum = 0;

    int getSum() {
        return this.sum;
    }

    private void setSum(int sum) {
        this.sum = sum;
    }


    void calculate(int a, int b) {
        if (a > 0) {
            sum = a + b;
        } else {
            sum = b - a;
        }
        this.setSum(sum);
    }

}
