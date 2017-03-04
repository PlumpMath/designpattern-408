package com.github.xbest.behavioral.state;

/**
 * Created by link on 2017/3/4.
 */
public class Client {
    public static void main(String[] args) {
        OAuth2 oAuth2;
        OAuthContext oAuthContext = new OAuthContext();

        oAuth2 = new QQOAuth2(oAuthContext);
        oAuthContext.getAccessToken();

        oAuth2 = new WeiboOAuth2(oAuthContext);
        oAuthContext.getAccessToken();

        oAuth2 = new WeixinOAuth2(oAuthContext);
        oAuthContext.getAccessToken();
    }
}
