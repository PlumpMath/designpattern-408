package com.github.xbest.behavioral.state;

/**
 * Weixin ConcreteState
 * Created by link on 2017/3/4.
 */
public class WeixinOAuth2 implements OAuth2 {
    private OAuthContext oAuthContext;

    public WeixinOAuth2(OAuthContext oAuthContext) {
        this.oAuthContext = oAuthContext;
        this.oAuthContext.setoAuth2(this);
    }

    @Override
    public void getAccessToken() {
        System.out.println("Weixin getAccessToken.");
    }

    @Override
    public void getAuthorizeURL() {
        System.out.println("Weixin getAuthorizeURL.");
    }
}
