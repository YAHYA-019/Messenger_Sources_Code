package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.9c7, reason: invalid class name */
/* loaded from: 9c7.class */
public final class C9c7 {
    public C3RG A00;
    public final FbUserSession A01;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A06;
    public final 1Br A09;
    public final 1Br A0B;
    public final 1Br A08 = 7zM.A0Z();
    public final 1Br A0A = 1Bq.A00(68796);
    public final 1Br A07 = 7zM.A0W();
    public final 1Br A05 = 7zM.A0d();
    public final 2bX A02 = new LiveData(C8su.A00);

    public C9c7(FbUserSession fbUserSession, Context context) {
        this.A01 = fbUserSession;
        this.A06 = 1Lm.A00(context, fbUserSession, 16874);
        this.A04 = 1Bu.A01(context, 67246);
        this.A03 = 1Lm.A00(context, fbUserSession, 68883);
        this.A0B = 1Bu.A01(context, 68808);
        this.A09 = 1Bu.A01(context, 66524);
    }

    public final void A00() {
        ((C9cq) 1Br.A0B(this.A0A)).A03("DELETE_BACKUP_STARTED");
        7zP.A0O(this.A08).A01(this.A02, C8st.A00);
        C9rb.A00(7zQ.A0M(this.A06).A00(), this, 8);
    }

    public final boolean A01() {
        C96m c96m;
        C1wm c1wm = (C1wm) 1Br.A0B(((C9bq) 1Br.A0B(this.A0B)).A03);
        if (7zR.A1X(((C1wi) 1Br.A0B(c1wm.A00)).A01())) {
            C1wk A0Z = 7zP.A0Z(c1wm.A03);
            long A0A = 1BL.A0A(C1wk.A03(A0Z), C1wg.A00(A0Z, 1NK.A4n));
            C1ud A0a = 7zP.A0a(c1wm.A02);
            if (A0A >= 7zM.A06(A0a, C1ud.A00(A0a), 36597901668257579L)) {
                c96m = C96m.A0B;
                return AnonymousClass001.A1W(c96m, C96m.A0B);
            }
        }
        c96m = C96m.A0C;
        return AnonymousClass001.A1W(c96m, C96m.A0B);
    }
}
