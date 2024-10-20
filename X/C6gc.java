package X;

import java.io.Closeable;

/* renamed from: X.6gc, reason: invalid class name */
/* loaded from: 6gc.class */
public final class C6gc implements Closeable {
    public final C01i A00;
    public final C01i A01;
    public final C01i A02;
    public final C01i A03;
    public final 1Br A04;
    public final C01i A05;

    public C6gc() {
        C03i c03i = C03i.A02;
        this.A03 = C01g.A00(c03i, C6gd.A00);
        this.A04 = 1Bu.A00(67105);
        this.A02 = C01g.A00(c03i, new C82y(this, 36));
        this.A00 = C01g.A00(c03i, new C82y(this, 34));
        this.A05 = C01g.A00(c03i, new C82y(this, 37));
        this.A01 = C01g.A00(c03i, new C82y(this, 35));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
