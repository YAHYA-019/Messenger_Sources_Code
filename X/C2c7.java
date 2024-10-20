package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.2c7, reason: invalid class name */
/* loaded from: 2c7.class */
public final class C2c7 {
    public 1PA A00;
    public final 1Br A08;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A09 = 1Bq.A00(66258);
    public final 1Br A07 = 1Bq.A00(66360);
    public final 1Br A06 = 1Bq.A00(67724);
    public final C1qM A0C = new C3aj(this, 5);
    public final 2bX A05 = new LiveData(false);
    public String A04 = "";
    public String A03 = "";
    public String A01 = "";
    public String A02 = "";

    public C2c7(FbUserSession fbUserSession, Context context) {
        this.A0A = 1Lm.A00(context, fbUserSession, 33124);
        this.A0B = 1Bu.A01(context, 33220);
        this.A08 = 1HG.A00(context, 16598);
    }

    public static final void A00(C2c7 c2c7) {
        if (((2zS) c2c7.A06.A00.get()).A03() == 2bZ.A04) {
            A01(c2c7, "", "", "", "", false);
        } else {
            ((C2ba) c2c7.A0B.A00.get()).A01(new C3b7(c2c7, 24));
        }
    }

    public static final void A01(C2c7 c2c7, String str, String str2, String str3, String str4, boolean z) {
        2bX r0 = c2c7.A05;
        if (((Boolean) r0.getValue()).booleanValue() != z) {
            ((C1x1) 1Br.A0B(c2c7.A07)).A01(r0, Boolean.valueOf(z));
            c2c7.A04 = str;
            c2c7.A03 = str2;
            c2c7.A01 = str3;
            c2c7.A02 = str4;
        }
    }
}
