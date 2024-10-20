package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.3Sx, reason: invalid class name */
/* loaded from: 3Sx.class */
public final class C3Sx {
    public 1PA A00;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A06 = 1Bq.A00(66258);
    public final 1Br A08 = 1Bq.A00(66360);
    public final 1Br A07 = 1Bq.A00(67724);
    public final C1qM A0C = new C9zx(this, 8);
    public final 2bX A05 = new LiveData(1BK.A0d());
    public String A04 = "";
    public String A03 = "";
    public String A01 = "";
    public String A02 = "";

    public C3Sx(FbUserSession fbUserSession, Context context) {
        this.A0A = 1Lm.A00(context, fbUserSession, 33124);
        this.A0B = 1Bu.A01(context, 33220);
        this.A09 = 1HG.A00(context, 16598);
    }

    public static final void A00(C3Sx c3Sx) {
        if (((2zS) 1Br.A0B(c3Sx.A07)).A03() == 2bZ.A04) {
            A01(c3Sx, "", "", "", "", false);
        } else {
            ((C2ba) 1Br.A0B(c3Sx.A0B)).A01(new A1d(c3Sx, 79));
        }
    }

    public static final void A01(C3Sx c3Sx, String str, String str2, String str3, String str4, boolean z) {
        2bX r0 = c3Sx.A05;
        if (AnonymousClass001.A1V(r0.getValue()) != z) {
            ((C1x1) 1Br.A0B(c3Sx.A08)).A01(r0, Boolean.valueOf(z));
            c3Sx.A04 = str;
            c3Sx.A03 = str2;
            c3Sx.A01 = str3;
            c3Sx.A02 = str4;
        }
    }
}
