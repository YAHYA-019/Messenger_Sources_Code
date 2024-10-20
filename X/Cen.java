package X;

import com.facebook.auth.usersession.FbUserSession;
import com.google.common.collect.ImmutableSet;

/* loaded from: Cen.class */
public final class Cen implements C4Av {
    public 1BY A00;
    public final C00i A02 = 1BV.A01((1BY) null, 84206);
    public final C00i A01 = 1BV.A01((1BY) null, 82346);

    public Cen(1BO r302) {
        this.A00 = 7zL.A0Q(r302);
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        if (!r302.A01()) {
            return false;
        }
        FbUserSession A00 = r302.A00();
        try {
            BpM bpM = (BpM) this.A01.get();
            ImmutableSet A002 = 2To.A00(4YV.A0r(bpM.A00, bpM.A01));
            if (A002.isEmpty()) {
                return true;
            }
            ((COq) this.A02.get()).A02(A00, A002);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
