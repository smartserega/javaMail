package models;

public class UserModel {

      String login1;
      String password1;
      String login2;
      String password2;
      String forWhomEmail;
      String text;
      String content;

    public UserModel() {
        this.login1 = login1;
        this.password1 = password1;
        this.login2 = login2;
        this.password2 = password2;
        this.forWhomEmail = forWhomEmail;
        this.text = text;
        this.content = content;
    }

    public String getLogin1() {
        return login1;
    }

    public void setLogin1(String login1) {
        this.login1 = login1;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getLogin2() {
        return login2;
    }

    public void setLogin2(String login2) {
        this.login2 = login2;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public String getForWhomEmail() {
        return forWhomEmail;
    }

    public void setForWhomEmail(String forWhomEmail) {
        this.forWhomEmail = forWhomEmail;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "login1='" + login1 + '\'' +
                ", password1='" + password1 + '\'' +
                ", login2='" + login2 + '\'' +
                ", password2='" + password2 + '\'' +
                ", forWhomEmail='" + forWhomEmail + '\'' +
                ", text='" + text + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
