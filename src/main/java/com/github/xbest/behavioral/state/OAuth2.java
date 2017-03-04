package com.github.xbest.behavioral.state;

/**
 * State<br/>
 * 状态模式，解决if-else问题，将多个状态的判断转换，封装到各个state类中。<br/>
 * 本示例代码，通过oauth2认证来展示状态模式，通过不同的state，来请求不同oauth2认证。<br/>
 * 感觉这个例子不是很好，看了headfirst感觉例子更好，但是希望能再想一个更符合实际工作的例子。<br/>
 * Created by link on 2017/3/4.
 */
public interface OAuth2 {
    void getAccessToken();

    void getAuthorizeURL();
}
