package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: Ev6.class */
public final class Ev6 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final F5L A05;

    public Ev6(Context context) {
        11T.A0F(context, 1);
        this.A01 = 1HG.A00(context, 99848);
        this.A00 = 1Bq.A00(82810);
        this.A04 = 1Bq.A00(99851);
        this.A03 = 1Bu.A01(context, 99855);
        this.A02 = 1Bu.A01(context, 99856);
        this.A05 = (F5L) F5L.A02.getValue();
    }

    public final void A00(FbUserSession fbUserSession, ELa eLa) {
        C00i c00i;
        boolean A1X = 1BL.A1X(fbUserSession, eLa);
        int ordinal = eLa.ordinal();
        if (ordinal == A1X) {
            String obj = ELa.A02.toString();
            c00i = this.A03.A00;
            if (((C61y) c00i.get()).A04()) {
                obj = ELa.A05.toString();
            }
            C00i c00i2 = this.A04.A00;
            c00i2.get();
            11T.A0G(obj, 0, ((FIl) 1Br.A0B(this.A01)).A00.A01);
            C00i c00i3 = this.A02.A00;
            ((C61z) 1Br.A0B(((Ehe) c00i3.get()).A00)).A03(fbUserSession, AnonymousClass621.A0K, A1X);
            Ehe ehe = (Ehe) c00i3.get();
            ((C61z) 1Br.A0B(ehe.A00)).A05(AnonymousClass621.A0H, System.currentTimeMillis() + 1209600000);
            ((ExI) 1Br.A0B(this.A00)).A03 = false;
            c00i2.get();
            ((EqK) c00i2.get()).A01.clear();
            ((C61y) c00i.get()).A03(A1X);
            ((C61y) c00i.get()).A02();
            C61y c61y = (C61y) c00i.get();
            FbUserSession A04 = 1Fw.A04(C61y.A00(c61y));
            C61y.A01(c61y).A03(A04, AnonymousClass621.A07, A1X);
            C61y.A01(c61y).A03(A04, AnonymousClass621.A0E, A1X);
            C61y.A01(c61y).A03(A04, AnonymousClass621.A0D, A1X);
        } else {
            if (ordinal != 2) {
                ((FIl) 1Br.A0B(this.A01)).A0D(false);
                return;
            }
            C00i c00i4 = this.A04.A00;
            c00i4.get();
            ((ExI) 1Br.A0B(this.A00)).A03 = A1X;
            c00i4.get();
            ((EqK) c00i4.get()).A01.clear();
            c00i = this.A03.A00;
            ((C61y) c00i.get()).A03(false);
            ((C61y) c00i.get()).A02();
        }
        C61y c61y2 = (C61y) c00i.get();
        C61y.A01(c61y2).A03(1Fw.A04(C61y.A00(c61y2)), AnonymousClass621.A06, false);
        ((FIl) 1Br.A0B(this.A01)).A0D(A1X);
    }
}
