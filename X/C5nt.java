package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.concurrent.TimeUnit;

/* renamed from: X.5nt, reason: invalid class name */
/* loaded from: 5nt.class */
public final class C5nt {
    public final 1Br A01 = 1Bq.A00(33013);
    public final 1Br A00 = 1Bq.A00(99390);

    public final C5nv A00(FbUserSession fbUserSession, long j) {
        11T.A0F(fbUserSession, 0);
        1G1 r0 = (1G1) fbUserSession;
        if (r0.A07) {
            return null;
        }
        String str = r0.A02;
        C00i c00i = this.A01.A00;
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i.get();
        1G3 A0D = C5nu.A00(str, j).A0D("/expiration_time");
        11T.A0A(A0D);
        long Av1 = fbSharedPreferences.Av1((1G2) A0D, 0L);
        C5nv c5nv = (C5nv) C5nv.A00.get(Integer.valueOf(((FbSharedPreferences) c00i.get()).ArU(C5nu.A00(str, j), 0)));
        if (Av1 > TimeUnit.MILLISECONDS.toSeconds(((C0dp) this.A00.A00.get()).now())) {
            return c5nv;
        }
        return null;
    }

    public final C5nv A01(FbUserSession fbUserSession, long j) {
        11T.A0F(fbUserSession, 0);
        1G1 r0 = (1G1) fbUserSession;
        if (r0.A07) {
            return null;
        }
        String str = r0.A02;
        C00i c00i = this.A01.A00;
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i.get();
        1G3 A0D = C5nu.A01(str, j).A0D("/expiration_time");
        11T.A0A(A0D);
        long Av1 = fbSharedPreferences.Av1((1G2) A0D, 0L);
        C5nv c5nv = (C5nv) C5nv.A00.get(Integer.valueOf(((FbSharedPreferences) c00i.get()).ArU(C5nu.A01(str, j), 0)));
        if (Av1 > TimeUnit.MILLISECONDS.toSeconds(((C0dp) this.A00.A00.get()).now())) {
            return c5nv;
        }
        return null;
    }

    public final void A02(String str) {
        11T.A0F(str, 0);
        1Ql edit = ((FbSharedPreferences) this.A01.A00.get()).edit();
        11T.A0A(edit);
        edit.CfI(C5nu.A00.A0F(str));
        edit.commit();
    }
}
