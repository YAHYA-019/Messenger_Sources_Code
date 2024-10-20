package X;

import java.io.ByteArrayOutputStream;

/* renamed from: X.29V, reason: invalid class name */
/* loaded from: 29V.class */
public final class C29V {
    public final 29T A00;

    public C29V() {
        this(new 3cZ());
    }

    public C29V(29T r302) {
        this.A00 = r302;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.29W, java.lang.Object] */
    public byte[] A00(C29M c29m) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ?? obj = new Object();
        ((29W) obj).A00 = null;
        ((29W) obj).A01 = byteArrayOutputStream;
        c29m.DAs(this.A00.B5O((29W) obj));
        return byteArrayOutputStream.toByteArray();
    }
}
