package screenplay.model;

public class ApplicationInformation {
    private final String title;
    private final String signIn;

    public ApplicationInformation(String title, String signIn) {
        this.title = title;
        this.signIn = signIn;
    }

    @Override
    public String toString() {
        return String.format("{title='%s', signIn='%s'}", title, signIn);
    }
}
