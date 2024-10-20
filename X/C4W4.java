package X;

import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.4W4, reason: invalid class name */
/* loaded from: 4W4.class */
public final class C4W4 implements 4AN {
    public final int A00;
    public final Object A01;

    public C4W4(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void CDn(FbUserSession fbUserSession, int i) {
        4AW r306;
        1P5 r307;
        if (this.A00 != 0) {
            if (i != 1) {
                return;
            }
            r306 = (4AW) this.A01;
            r307 = r306.A03;
        } else {
            if (i != 1) {
                return;
            }
            r306 = (4AE) this.A01;
            r307 = ((4AE) r306).A03;
        }
        r307.A08(fbUserSession, r306);
    }
}
