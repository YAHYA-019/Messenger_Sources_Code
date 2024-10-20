package X;

import android.os.Build;

/* renamed from: X.4v3, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4v3.class */
public final class C10964v3 {
    public 1BY A00;
    public final C00i A01 = new 1BV((1BY) null, 49591);
    public final C00i A04 = new 1BQ(49362);
    public final C00i A02 = new 1BV((1BY) null, 83263);
    public final C00i A03 = new 1BQ(66536);

    public C10964v3(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public C4v5 A00() {
        return (C4v5) (((21W) this.A03.get()).A0A() ? Build.VERSION.SDK_INT >= 30 ? this.A01 : this.A04 : this.A02).get();
    }
}
