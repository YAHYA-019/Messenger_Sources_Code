package X;

import android.content.Context;
import androidx.lifecycle.LiveData;
import com.facebook.auth.usersession.FbUserSession;
import java.util.Collection;

/* renamed from: X.2c4, reason: invalid class name */
/* loaded from: 2c4.class */
public final class C2c4 {
    public 1PA A00;
    public final 1Br A08;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A09 = 1Bq.A00(66258);
    public final 1Br A07 = 1Bq.A00(66360);
    public final 1Br A06 = 1Bq.A00(67724);
    public final C1qM A0D = new C3aj(this, 6);
    public final 2bX A05 = new LiveData(false);
    public String A04 = "";
    public String A03 = "";
    public String A01 = "";
    public String A02 = "";

    public C2c4(FbUserSession fbUserSession, Context context) {
        this.A0B = 1Lm.A00(context, fbUserSession, 33124);
        this.A0C = 1Bu.A01(context, 33220);
        this.A0A = 1Bu.A01(context, 66574);
        this.A08 = 1HG.A00(context, 16598);
    }

    public static final void A00(C2c4 c2c4) {
        if (((2zS) c2c4.A06.A00.get()).A03() == 2bZ.A04) {
            A01(c2c4, "", "", "", "", false);
        } else {
            ((C2ba) c2c4.A0C.A00.get()).A01(new C3b7(c2c4, 25));
        }
    }

    public static final void A01(C2c4 c2c4, String str, String str2, String str3, String str4, boolean z) {
        2bX r0 = c2c4.A05;
        if (((Boolean) r0.getValue()).booleanValue() != z) {
            ((C1x1) 1Br.A0B(c2c4.A07)).A01(r0, Boolean.valueOf(z));
            c2c4.A04 = str;
            c2c4.A03 = str2;
            c2c4.A01 = str3;
            c2c4.A02 = str4;
        }
    }

    public static final boolean A02(C2su c2su) {
        boolean z;
        boolean z2 = false;
        Collection A07 = 07C.A07(0, ((1qX) c2su).mResultSet.getCount());
        if (!(A07 instanceof Collection) || !A07.isEmpty()) {
            07I it = A07.iterator();
            while (it.hasNext()) {
                if (((1qX) c2su).mResultSet.getInteger(it.A00(), 1) == 13) {
                    z = true;
                    break;
                }
            }
        }
        z = false;
        boolean z3 = false;
        if (((1qX) c2su).mResultSet.getCount() == 0) {
            z3 = true;
        }
        if (z && !z3) {
            z2 = true;
        }
        return z2;
    }
}
