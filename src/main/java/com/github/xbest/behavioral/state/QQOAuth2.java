package com.github.xbest.behavioral.state;

/**
 * QQ ConcreteState
 * Created by link on 2017/3/4.
 */
public class QQOAuth2 implements OAuth2 {
    private OAuthContext oAuthContext;

    public QQOAuth2(OAuthContext oAuthContext) {
        this.oAuthContext = oAuthContext;
        this.oAuthContext.setoAuth2(this);
    }

    @Override
    public void getAccessToken() {
        System.out.println("QQ getAccessToken.");
    }

    @Override
    public void getAuthorizeURL() {
        System.out.println("QQ getAuthorizeURL.");
    }
}
