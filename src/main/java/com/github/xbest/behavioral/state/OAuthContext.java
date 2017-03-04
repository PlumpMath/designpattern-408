package com.github.xbest.behavioral.state;

/**
 * State Context
 * Created by link on 2017/3/4.
 */
public class OAuthContext {
    private OAuth2 oAuth2;

    public void getAccessToken() {
        this.oAuth2.getAccessToken();
    }

    public void getAuthorizeURL() {
        this.oAuth2.getAuthorizeURL();
    }

    public void setoAuth2(OAuth2 oAuth2) {
        this.oAuth2 = oAuth2;
    }
}
