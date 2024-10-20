package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.prefs.shared.FbSharedPreferences;
import java.text.StringCharacterIterator;
import java.util.Locale;

/* renamed from: X.2cr, reason: invalid class name */
/* loaded from: 2cr.class */
public final class C2cr {
    public final 1De A00;
    public final 1Br A01;
    public final 1Br A02 = 1Bq.A00(33013);
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final C15h A06;

    public C2cr(1De r302) {
        this.A00 = r302;
        1BY r0 = r302.A00;
        this.A05 = 1Bu.A03(r0, 65998);
        this.A04 = 1Bq.A00(66259);
        this.A03 = 1Bu.A03(r0, 67240);
        this.A01 = 1Bq.A00(99390);
        this.A06 = new 3jD(this, 15);
    }

    public double A00() {
        C00i c00i = this.A03.A00;
        double A07 = ((5Nr) c00i.get()).A00.A07(0S2.A00) / 1.0E9d;
        double d = 0.0d;
        if (A07 != 0.0d) {
            d = ((((5Nr) c00i.get()).A01() / 1.0E9d) / A07) * 100.0d;
        }
        return d;
    }

    public long A01(1G9 r302) {
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) this.A02.A00.get();
        11T.A0F(this.A05.A00.get(), 1);
        return fbSharedPreferences.Av1(C1wg.A02(r302), 0L);
    }

    public String A02(long j) {
        Object[] objArr;
        String str;
        if (j == Long.MIN_VALUE) {
            j++;
        }
        long abs = Math.abs(j);
        if (0 > abs || abs >= 1000) {
            StringCharacterIterator stringCharacterIterator = new StringCharacterIterator("KMGTPE");
            while (abs >= 1000000) {
                abs /= 1000;
                stringCharacterIterator.next();
            }
            objArr = new Object[]{Float.valueOf(((float) abs) / 1000.0f), Character.valueOf(stringCharacterIterator.current())};
            str = "%.1f %cB";
        } else {
            objArr = 1BK.A1Z(abs);
            str = "%d b";
        }
        return 1BK.A15(Locale.getDefault(), str, objArr);
    }

    public void A03(1G9 r302) {
        1Ql edit = ((FbSharedPreferences) this.A02.A00.get()).edit();
        11T.A0F(this.A05.A00.get(), 1);
        edit.CaH(C1wg.A02(r302), ((C0dp) this.A01.A00.get()).now());
        edit.commitImmediately();
    }

    public void A04(boolean z) {
        1Ql edit = ((FbSharedPreferences) this.A02.A00.get()).edit();
        1G9 r0 = 1NK.A5X;
        11T.A0F(this.A05.A00.get(), 1);
        edit.putBoolean(C1wg.A02(r0), z).commitImmediately();
    }

    public void A05(boolean z) {
        1Ql edit = ((FbSharedPreferences) this.A02.A00.get()).edit();
        1G9 r0 = 1NK.A5a;
        11T.A0F(this.A05.A00.get(), 1);
        edit.putBoolean(C1wg.A02(r0), z).commitImmediately();
    }

    public void A06(boolean z) {
        1Ql.A02(1Br.A08(this.A02), 1Br.A0A(this.A05, 1NK.A5Q), z);
    }

    public boolean A07() {
        this.A04.A00.get();
        FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) this.A02.A00.get();
        1G9 r0 = 1NK.A5Q;
        11T.A0F(this.A05.A00.get(), 1);
        return fbSharedPreferences.AZn(C1wg.A02(r0), true);
    }

    public boolean A08() {
        return 1BK.A1T(1Br.A09(this.A02), 1Br.A0A(this.A05, 1NK.A5X));
    }

    public boolean A09() {
        return 1BK.A1T(1Br.A09(this.A02), 1Br.A0A(this.A05, 1NK.A5a));
    }

    public boolean A0A() {
        boolean z = false;
        if (((5Nr) this.A03.A00.get()).A00() / 1000000.0d < 1xG.A00((1xG) this.A04.A00.get()).Auy(36603768586049891L) * 1000) {
            z = true;
        }
        return z;
    }

    public boolean A0B() {
        FbUserSession fbUserSession = (FbUserSession) this.A06.get();
        11T.A0D(fbUserSession);
        C1wv c1wv = (C1wv) 1Lm.A07(fbUserSession, this.A00.A00, 68883);
        C1wv.A04(c1wv);
        boolean z = false;
        if (c1wv.A02.getValue() == C1wj.A04) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x005a, code lost:
    
        if (r0.getValue() == X.C1wj.A03) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A0C() {
        /*
            r301 = this;
            r0 = r301
            X.15h r0 = r0.A06
            java.lang.Object r0 = r0.get()
            com.facebook.auth.usersession.FbUserSession r0 = (com.facebook.auth.usersession.FbUserSession) r0
            r302 = r0
            r0 = 68883(0x10d13, float:9.6526E-41)
            r303 = r0
            r0 = r302
            X.11T.A0D(r0)
            r0 = r301
            X.1De r0 = r0.A00
            X.1BY r0 = r0.A00
            r304 = r0
            r0 = r302
            r1 = r304
            r2 = r303
            java.lang.Object r0 = X.1Lm.A07(r0, r1, r2)
            X.1wv r0 = (X.C1wv) r0
            r305 = r0
            r0 = r305
            X.C1wv.A04(r0)
            r0 = r305
            androidx.lifecycle.MutableLiveData r0 = r0.A02
            r302 = r0
            r0 = r302
            java.lang.Object r0 = r0.getValue()
            r306 = r0
            X.1wj r0 = X.C1wj.A04
            r304 = r0
            r0 = r306
            r1 = r304
            if (r0 == r1) goto L5d
            r0 = r305
            X.C1wv.A04(r0)
            r0 = r302
            java.lang.Object r0 = r0.getValue()
            r302 = r0
            X.1wj r0 = X.C1wj.A03
            r306 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            r1 = r306
            if (r0 != r1) goto L60
        L5d:
            r0 = 1
            r307 = r0
        L60:
            r0 = r307
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2cr.A0C():boolean");
    }

    public boolean A0D() {
        FbUserSession fbUserSession = (FbUserSession) this.A06.get();
        11T.A0D(fbUserSession);
        C1wv c1wv = (C1wv) 1Lm.A07(fbUserSession, this.A00.A00, 68883);
        C1wv.A04(c1wv);
        boolean z = false;
        if (c1wv.A02.getValue() == C1wj.A03) {
            z = true;
        }
        return z;
    }
}
