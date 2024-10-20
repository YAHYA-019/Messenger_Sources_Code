package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.user.model.User;

/* loaded from: B5N.class */
public final class B5N extends 6Hk {
    public DGE A00;
    public User A01;
    public boolean A02;
    public final Context A03;
    public final FbUserSession A04;
    public final 1Br A05;

    public B5N() {
    }

    public B5N(Context context, FbUserSession fbUserSession) {
        boolean A1Z = 7zP.A1Z(fbUserSession);
        this.A03 = context;
        this.A04 = fbUserSession;
        this.A05 = 1Bu.A01(context, 82710);
        this.A02 = A1Z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001a, code lost:
    
        if (r301.A02 == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.Fragment, com.facebook.messaging.wellbeing.selfremediation.restrict.nux.RestrictNuxFragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(X.B5N r301, com.facebook.user.model.User r302) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B5N.A00(X.B5N, com.facebook.user.model.User):void");
    }

    public static void A01(B5N b5n, boolean z) {
        DGE dge = b5n.A00;
        if (dge != null) {
            dge.Bu8(b5n.A01, z);
        }
        0D2 r0 = (0D2) AbM.A0q(b5n);
        if (r0.A01 != null || r0.getParentFragmentManager().A0b("restrict_nux_fragment") == null) {
            r0.A0o();
            return;
        }
        1pI A0E = AbI.A0E(r0);
        if (A0E.BVa()) {
            A0E.CeH("restrict_nux_fragment");
        }
    }
}
