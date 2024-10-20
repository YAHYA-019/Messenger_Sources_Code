package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.93c, reason: invalid class name */
/* loaded from: 93c.class */
public final class C93c extends AbstractC07494k1 {
    public C8yi A00;
    public final long A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1Br A04 = 1Bq.A00(16449);

    public C93c(Context context, FbUserSession fbUserSession, long j) {
        this.A02 = context;
        this.A03 = fbUserSession;
        this.A01 = j;
    }

    @Override // X.AbstractC07504k2
    public void A04() {
        C8yi c8yi = this.A00;
        if (c8yi != null) {
            c8yi.D5r();
        }
        this.A00 = null;
    }

    @Override // X.InterfaceC07544k6
    public void Cgt(int i) {
        4YV.A11(this.A04).execute(new ADb(this));
    }
}
