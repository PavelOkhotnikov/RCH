package CatRobotHuman;

public interface Parameters {

    String getName();

    int getMaxLength();

    int getMaxHeight();

    boolean getSuccess();

    void setSuccess(boolean success);

    String runStr();

    String jumpStr();
}
