import imgurdatatype.AccountResource;

public class ImgurClient {

    private String clientId;
    private String clientSecret;
    private static ImgurClient imgurClient;
    private boolean isAuthorized;

    private AccountResource account;

    private ImgurClient() {

    }

    public static ImgurClient getClient() {
        if (imgurClient == null) {
            synchronized (ImgurClient.class) {
                if (imgurClient == null) {
                    imgurClient = new ImgurClient();
                }
            }
        }
        return imgurClient;
    }

    public boolean isAuthorized() {
        return isAuthorized;
    }

    public void authorize(){

        isAuthorized=true;
    }
    public void authorize(String clientId, String clientSecret){

        isAuthorized=true;
    }

    public AccountResource account(){
        return account;
    }


}
