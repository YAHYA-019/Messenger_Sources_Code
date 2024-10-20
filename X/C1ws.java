package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.1ws, reason: invalid class name */
/* loaded from: 1ws.class */
public final class C1ws {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;

    public C1ws(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.A03 = 1Bq.A00(65997);
        this.A04 = 1Bu.A00(66524);
        this.A00 = 1Lm.A01(fbUserSession, 68883);
        this.A02 = 1Lm.A01(fbUserSession, 68886);
        this.A01 = 1Bu.A00(67246);
    }

    public final boolean A00() {
        String str;
        int ordinal;
        0fH.A0j("DefaultEbUpsellTouchPointProvider", "shouldShowFlow");
        C1wk c1wk = (C1wk) this.A04.A00.get();
        FbSharedPreferences A03 = C1wk.A03(c1wk);
        1G9 r0 = 1NK.A4j;
        11T.A0F(C1wk.A01(c1wk), 1);
        if (A03.AZn(C1wg.A02(r0), false)) {
            str = "user has completed NUX upsell";
        } else {
            C1wv c1wv = (C1wv) this.A00.A00.get();
            C1wv.A04(c1wv);
            C1wy c1wy = (C1wy) c1wv.A06.getValue();
            if (c1wy == null || (ordinal = c1wy.ordinal()) == -1 || ordinal == 2) {
                str = "Backup status is null";
            } else if (ordinal == 0) {
                str = "User has a backup already";
            } else if (((C1x3) this.A02.A00.get()).A08) {
                0BG r02 = (0BG) this.A01.A00.get();
                Context A00 = FbInjector.A00();
                11T.A0A(A00);
                if (r02.A00(A00)) {
                    C1ud c1ud = (C1ud) this.A03.A00.get();
                    if (C1ud.A00(c1ud).AZr(c1ud.A02, 36316426697844788L)) {
                        return true;
                    }
                    str = "Upsell MC is disabled";
                } else {
                    str = "Block store is not available";
                }
            } else {
                str = "User is not opted out";
            }
        }
        0fH.A0j("DefaultEbUpsellTouchPointProvider", str);
        return false;
    }
}
