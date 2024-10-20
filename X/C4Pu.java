package X;

import java.io.OutputStream;

/* renamed from: X.4Pu, reason: invalid class name */
/* loaded from: 4Pu.class */
public abstract class C4Pu extends C4C3 {
    public final long A00;
    public final String A01;

    public C4Pu(String str, long j, String str2) {
        super(str);
        this.A00 = j;
        this.A01 = str2;
    }

    public abstract void A05(OutputStream outputStream);
}
