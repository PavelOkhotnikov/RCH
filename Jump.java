package CatRobotHuman;

public class Jump implements RunAndJump {

    private int height;

    public Jump (int height) {
        this.height = height;
    }

    public String check(Parameters parameters) {
        parameters.jumpStr();
        parameters.setSuccess(parameters.getMaxHeight() >= height);
        if (parameters.getSuccess()) {
            parameters.getSuccess();
            return "Он " + parameters.getName() + " перепрыгнул стену высотой: " + height + " м";
        } else {
            parameters.getSuccess();
            return "Он " + parameters.getName() + " не перепрыгнул стену высотой: " + height + " м";
        }
    }

}
