package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.List;

/* loaded from: D90.class */
public final class D90 implements Runnable {
    public static final String __redex_internal_original_name = "KeyTransparencyShadowTestUtils$startShadowTest$runnable$1";
    public final /* synthetic */ FbUserSession A00;
    public final /* synthetic */ C23v A01;
    public final /* synthetic */ String A02;

    public D90(FbUserSession fbUserSession, C23v c23v, String str) {
        this.A01 = c23v;
        this.A02 = str;
        this.A00 = fbUserSession;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C23v c23v = this.A01;
        FbSharedPreferences A09 = 1Br.A09(c23v.A02);
        String str = this.A02;
        AbK.A1O(A09.edit(), 1G9.A05(1G0.A0B.A0F(1BJ.A00(462)), str));
        List A0r = 7zU.A0r(Long.parseLong(str));
        AnonymousClass206 anonymousClass206 = (AnonymousClass206) 1Lm.A05(C0f1.A00(), this.A00, 33176);
        C00i c00i = c23v.A04.A00;
        1BK.A0V(c00i).markerStart(976892663);
        1BK.A0V(c00i).markerPoint(976892663, "start_key_verification");
        anonymousClass206.A00(new A1d(c23v, 63), A0r);
    }
}
