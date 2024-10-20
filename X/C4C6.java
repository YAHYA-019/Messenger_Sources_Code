package X;

import java.nio.charset.Charset;

/* renamed from: X.4C6, reason: invalid class name */
/* loaded from: 4C6.class */
public final class C4C6 extends C4C3 {
    public final Charset A00;
    public final byte[] A01;

    public C4C6(String str, Charset charset) {
        super("text/plain");
        if (str == null) {
            throw AnonymousClass001.A0L("Text may not be null");
        }
        charset = charset == null ? Charset.forName("US-ASCII") : charset;
        this.A01 = str.getBytes(charset.name());
        this.A00 = charset;
    }
}
