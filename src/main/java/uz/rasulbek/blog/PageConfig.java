package uz.rasulbek.blog;

public class PageConfig {
    private static PageConfig pageConfig = new PageConfig();
    private static int userId =0;
    private static String userName="Mehmon";

    public static PageConfig get(){
        return pageConfig;
    }

    public static int getUserId() {
        return userId;
    }

    public static void setUserId(int userId) {
        PageConfig.userId = userId;
    }

    public static String getUserName() {
        return userName;
    }

    public static void setUserName(String userName) {
        PageConfig.userName = userName;
    }
}
