package com.github.xbest.structural.decorator;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/**装饰模式，又叫wrapper pattern，主要是对已有的对象动态的添加一些额外的功能。<br/>
 * jdk中的典型案例就是{@link InputStream}、{@link java.io.OutputStream}、{@link java.io.Reader}、{@link java.io.Writer}<br/>
 * 本次的示例代码也是基于{@link FilterInputStream}来实现的，示例来源为headfirst例子。<br/>
 * Created by link on 2017/2/28.
 */
public class LowerCaseInputStream extends FilterInputStream {
    /**
     * Creates a <code>FilterInputStream</code>
     * by assigning the  argument <code>in</code>
     * to the field <code>this.in</code> so as
     * to remember it for later use.
     *
     * @param in the underlying input stream, or <code>null</code> if
     *           this instance is to be created without an underlying stream.
     */
    protected LowerCaseInputStream(InputStream in) {
        super(in);
    }

    @Override
    public int read() throws IOException {
        int c = super.read();
        return c == -1 ? c : Character.toLowerCase(c);
    }
}
