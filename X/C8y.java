package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.user.model.User;

/* loaded from: C8y.class */
public final class C8y {
    public final C54 A00;
    public final BsQ A01;
    public final Context A02;
    public final BR9 A03;

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, X.BR9] */
    public C8y(Context context, 06Z r303, DGt dGt, DGu dGu) {
        11T.A0F(context, 1);
        this.A02 = context;
        C1F6 A0F = AbG.A0F(898);
        C1F6 c1f6 = (C1F6) 1Bn.A0E(context, (1BY) null, 900);
        C1F6 c1f62 = (C1F6) 1Bn.A0E(context, (1BY) null, 899);
        Context A01 = FbInjector.A01();
        AbL.A0y(A0F);
        try {
            ?? obj = new Object();
            ((BR9) obj).A00 = r303;
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A03 = obj;
            Context A012 = FbInjector.A01();
            AbL.A0y(c1f6);
            BsQ bsQ = new BsQ(c1f6, dGu);
            1Bn.A0K();
            FbInjector.A04(A012);
            this.A01 = bsQ;
            A01 = FbInjector.A01();
            AbL.A0y(c1f62);
            C54 c54 = new C54(c1f62, dGt);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A00 = c54;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public void A00() {
        BsQ bsQ = this.A01;
        bsQ.A02 = BKm.A02;
        ((CIe) 1Lo.A04((Context) null, 1Fw.A06(bsQ.A03.get()), bsQ.A00, 83623)).A02();
        bsQ.A01.ARV();
    }

    public void A01(View view, FbUserSession fbUserSession, MigColorScheme migColorScheme, User user, String str) {
        7zT.A1S(user, migColorScheme, view);
        C54 c54 = this.A00;
        CbQ cbQ = c54.A01;
        if (cbQ != null) {
            c54.A02 = str;
            CbQ.A00(view, 3Ea.A03, fbUserSession, cbQ, (2UP) null, (MontageBucketPreview) null, (C38) null, (BL2) null, migColorScheme, (RichStatus) null, user, "contact_manager_long_click", -1);
        }
    }

    public void A02(String str) {
        BsQ bsQ = this.A01;
        bsQ.A02 = BKm.A01;
        CIe cIe = (CIe) 1Lo.A04((Context) null, 1Fw.A06(bsQ.A03.get()), bsQ.A00, 83623);
        if (cIe.A01 != null) {
            cIe.A02();
        }
        String A0t = 1BK.A0t();
        cIe.A01 = A0t;
        1UG A08 = 1BK.A08(1Br.A02(cIe.A04), 1BJ.A00(1392));
        if (A0t != null) {
            if (A08.isSampled()) {
                AbF.A1N(A08, A0t);
                AbI.A1M(A08, str);
            }
            CM7 cm7 = (CM7) 1Br.A0B(cIe.A03);
            cm7.A03 = true;
            cm7.A02 = A0t;
        }
        ((6KI) ((C7tl) 1Br.A0B(cIe.A05)).A01.get()).A02();
        bsQ.A01.AQi();
    }
}
