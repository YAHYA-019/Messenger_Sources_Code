package X;

import com.facebook.common.build.BuildConstants;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.base.Objects;

/* renamed from: X.1Oc, reason: invalid class name */
/* loaded from: 1Oc.class */
public final class C1Oc {
    public 1BY A00;
    public final 1Og A03;
    public final 1Oe A05;
    public final 1OZ A07;
    public final 1OY A08;
    public final C00i A02 = new 1BQ(33013);
    public final C00i A06 = new 1BQ(33032);
    public final 1Ln A04 = (1Ln) 1Bi.A03(66191);
    public final C00i A01 = new 1BQ(99390);

    public C1Oc(1BO r302, 1OZ r303) {
        1OY r0 = (1OY) 1Bi.A03(16615);
        this.A08 = r0;
        this.A05 = (1Oe) 1Bi.A03(16617);
        this.A00 = new 1BY(r302);
        this.A07 = r303;
        this.A03 = r0.A00(r303);
    }

    public int A00() {
        int ArU = ((FbSharedPreferences) this.A02.get()).ArU(this.A03.A0B, 0);
        if (ArU < 0 || ArU > 3) {
            ArU = 0;
        }
        return ArU;
    }

    public long A01() {
        return ((FbSharedPreferences) this.A02.get()).Av1(this.A03.A07, 0L);
    }

    public long A02() {
        long now = ((C0dp) this.A01.get()).now();
        long Av1 = ((FbSharedPreferences) this.A02.get()).Av1(this.A03.A0E, 0L);
        if (Av1 > 0) {
            return now - Av1;
        }
        0fH.A0A(C1Oc.class, "there is no register time");
        return -1;
    }

    public String A03() {
        String A02 = ((1H2) this.A06.get()).A02();
        1Ql edit = ((FbSharedPreferences) this.A02.get()).edit();
        edit.CaL(this.A03.A09, A02);
        edit.commit();
        return A02;
    }

    public String A04() {
        String A04 = this.A05.A04(C1fe.A0q);
        if (A04 == null) {
            A04 = "";
        }
        1Ql edit = ((FbSharedPreferences) this.A02.get()).edit();
        edit.CaL(this.A03.A01, A04);
        edit.commit();
        return A04;
    }

    public String A05() {
        return ((FbSharedPreferences) this.A02.get()).A3a(this.A03.A0C, "");
    }

    public String A06() {
        switch (this.A07.ordinal()) {
            case 0:
                return "https://api.amazon.com/messaging/registrations/";
            case 1:
                return "https://nnapi.ovi.com/nnapi/2.0/send";
            case 2:
                return "https://fcm.googleapis.com/fcm/send";
            case 3:
            case 4:
                return 1BK.A1T(1BK.A0R(this.A02), this.A03.A04) ? "" : "https://android.googleapis.com/gcm/send";
            case 5:
            case 6:
                return 4YT.A00(66);
            default:
                throw AnonymousClass001.A0N("Unsupported push notification service type.");
        }
    }

    public void A07() {
        1Ql edit = ((FbSharedPreferences) this.A02.get()).edit();
        1Og r0 = this.A03;
        edit.CaL(r0.A0C, "");
        edit.CaL(r0.A0D, "");
        edit.CaE(r0.A08, 0);
        edit.CaL(r0.A09, "");
        edit.CaL(r0.A01, "");
        edit.CaH(r0.A05, ((C0dp) this.A01.get()).now());
        1Ql putBoolean = edit.putBoolean(r0.A03, false);
        putBoolean.Cdj(r0.A06);
        putBoolean.commit();
    }

    public void A08() {
        1Ql edit = ((FbSharedPreferences) this.A02.get()).edit();
        edit.CaH(this.A03.A0E, ((C0dp) this.A01.get()).now());
        edit.commit();
    }

    public void A09() {
        ((FbSharedPreferences) this.A02.get()).edit().putBoolean(this.A03.A03, false).commit();
    }

    public void A0A(String str, int i) {
        long now = ((C0dp) this.A01.get()).now();
        1Ql edit = ((FbSharedPreferences) this.A02.get()).edit();
        1Og r0 = this.A03;
        edit.CaL(r0.A0C, str);
        edit.CaH(r0.A05, now);
        edit.CaH(r0.A07, now);
        edit.CaH(r0.A06, now);
        edit.CaE(r0.A08, BuildConstants.A00());
        String A02 = ((1H2) this.A06.get()).A02();
        1G2 r02 = r0.A09;
        if (A02 == null) {
            edit.Cdj(r02);
        } else {
            edit.CaL(r02, A02);
        }
        String A04 = this.A05.A04(C1fe.A0q);
        1G2 r03 = r0.A01;
        if (A04 != null) {
            edit.CaL(r03, A04);
        } else {
            edit.Cdj(r03);
        }
        if (i < 0 || i > 3) {
            i = 0;
        }
        boolean z = false;
        if (i != A00()) {
            z = true;
            edit.CaE(r0.A0B, i);
        }
        if (!Objects.equal(A05(), str) || z || A0C() || A0B() || A0D()) {
            edit.putBoolean(r0.A03, false);
        }
        edit.commit();
    }

    public boolean A0B() {
        boolean z = false;
        if (BuildConstants.A00() != ((FbSharedPreferences) this.A02.get()).ArU(this.A03.A08, (-1) << (-1))) {
            z = true;
        }
        return z;
    }

    public boolean A0C() {
        return !((FbSharedPreferences) this.A02.get()).A3a(this.A03.A09, "").equals(((1H2) this.A06.get()).A02());
    }

    public boolean A0D() {
        return !((FbSharedPreferences) this.A02.get()).A3a(this.A03.A01, "").equals(this.A05.A04(C1fe.A0q));
    }

    public boolean A0E() {
        return ((FbSharedPreferences) this.A02.get()).AZn(this.A03.A03, false);
    }
}
