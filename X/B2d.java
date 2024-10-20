package X;

import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;

/* loaded from: B2d.class */
public final class B2d extends B2f implements CallerContextable {
    public static final String __redex_internal_original_name = "AccountLoginSilentFragment";
    public FbUserSession A00;
    public C00i A01;
    public COx A02;
    public C15h A03;
    public final BPY A0B = new B37(this, 13);
    public final C00i A04 = AbF.A0S(this, 17037);
    public final C00i A0A = AbF.A0S(this, 85262);
    public final C00i A06 = AbF.A0S(this, 84004);
    public final C00i A05 = AbI.A0N();
    public final C00i A09 = 1BV.A00(100129);
    public final C00i A08 = 1BQ.A02(100107);
    public final C00i A07 = new 1HH(this, 65730);

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        super.A1S(bundle);
        this.A00 = AbL.A09(this);
        this.A01 = 1BV.A00(49449);
        this.A03 = DBe.A00(this, 11);
        COx cOx = new COx(this, ((AlJ) this).A00, new C00(getContext()), this.A0B, "login", "login_operation", "", false);
        COx.A02(cOx);
        this.A02 = cOx;
    }
}
