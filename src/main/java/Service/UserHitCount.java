package Service;

public class UserHitCount {
    private String username;
    private int hitCount;

    public UserHitCount(String username, int hitCount) {
        this.username = username;
        this.hitCount = hitCount;
    }

    public String getUsername() {
        return username;
    }

    public int getHitCount() {
        return hitCount;
    }
}
