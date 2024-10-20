package X;

import java.nio.charset.Charset;

/* renamed from: X.03r, reason: invalid class name */
/* loaded from: 03r.class */
public abstract class C03r {
    public static final Charset A00;
    public static final Charset A01;
    public static final Charset A02;
    public static final Charset A03;
    public static final Charset A04;
    public static final Charset A05;

    static {
        Charset forName = Charset.forName("UTF-8");
        11T.A0A(forName);
        A05 = forName;
        Charset forName2 = Charset.forName("UTF-16");
        11T.A0A(forName2);
        A02 = forName2;
        Charset forName3 = Charset.forName("UTF-16BE");
        11T.A0A(forName3);
        A03 = forName3;
        Charset forName4 = Charset.forName("UTF-16LE");
        11T.A0A(forName4);
        A04 = forName4;
        Charset forName5 = Charset.forName("US-ASCII");
        11T.A0A(forName5);
        A01 = forName5;
        Charset forName6 = Charset.forName("ISO-8859-1");
        11T.A0A(forName6);
        A00 = forName6;
    }
}
