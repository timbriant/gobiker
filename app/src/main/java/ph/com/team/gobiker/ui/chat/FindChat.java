package ph.com.team.gobiker.ui.chat;

public class FindChat {
    public String profileimage, fullname, status;

    public FindChat(){

    }

    public FindChat(String profileimage, String fullname, String status) {
        this.profileimage = profileimage;
        this.fullname = fullname;
    }

    public String getProfileimage() {
        return profileimage;
    }

    public void setProfileimage(String profileimage) {
        this.profileimage = profileimage;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }
}