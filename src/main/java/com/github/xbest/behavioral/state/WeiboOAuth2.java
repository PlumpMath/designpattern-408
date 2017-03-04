package com.github.xbest.behavioral.state;

/**
 * Weibo ConcreteState
 * Created by link on 2017/3/4.
 */
public class WeiboOAuth2 implements OAuth2 {
    private OAuthContext oAuthContext;

    public WeiboOAuth2(OAuthContext oAuthContext) {
        this.oAuthContext = oAuthContext;
        this.oAuthContext.setoAuth2(this);
    }
    @Override
    public void getAccessToken() {
        System.out.println("Weibo getAccessToken.");
    }

    @Override
    public void getAuthorizeURL() {
        System.out.println("Weibo getAuthorizeURL.");
    }
}
