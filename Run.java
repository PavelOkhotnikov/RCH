package CatRobotHuman;

public class Run implements RunAndJump {

    private int length;

    public Run (int length) {
        this.length = length;
    }

    public String check(Parameters parameters) {
        parameters.runStr();
        parameters.setSuccess(parameters.getMaxLength() >= length);
        if (parameters.getSuccess()) {
            parameters.getSuccess();
            return "Он " + parameters.getName() + " проходит дистанцию длиной: " + length + " км";
        } else {
            parameters.getSuccess();
            return "Он " + parameters.getName() + " не проходит дистанцию длиной: " + length + " км";
        }
    }
}
