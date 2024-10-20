package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import com.facebook.messaging.chatheads.interstitialnux.ChatHeadsInterstitialNuxFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* loaded from: Az2.class */
public final class Az2 extends C1rj {
    public Bce A00;
    public MigColorScheme A01;

    public Az2() {
        super("M4ChatHeadsInterstitialNuxContentLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.2qQ, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A01;
        Context context = r302.A0D;
        C2e c2e = (C2e) 1Bn.A0E(context, (1BY) null, 82435);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        ?? obj = new Object();
        7zM.A1V((2qQ) obj, 2132345062);
        int A03 = AnonymousClass001.A03(migColorScheme.Ci4(7zQ.A0k((2qQ) obj, 2132345061)));
        C2cq A00 = C2cp.A00(r302, 0);
        A00.A2a(context.getDrawable(A03));
        A00.A17(40.0f);
        7zN.A1B(A01, A00);
        Dud A012 = Dzc.A01(r302);
        A012.A0R();
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        2KD A0e = 7zR.A0e(r302, migColorScheme, false);
        7zU.A1U(A0e);
        A0e.A2X();
        A0e.A2r(2131954099);
        2RH r0 = 2RH.A03;
        4YU.A1N(A0e, r0);
        4YU.A1K(A013, A0e);
        2KD A0e2 = 7zR.A0e(r302, migColorScheme, false);
        A0e2.A2l();
        A0e2.A2d();
        A0e2.A2X();
        1Br.A0C(c2e.A00);
        A0e2.A2r(2131954095);
        4YU.A1N(A0e2, r0);
        4YU.A1K(A013, A0e2);
        2KD A0e3 = 7zR.A0e(r302, migColorScheme, false);
        A0e3.A2l();
        A0e3.A2d();
        A0e3.A2X();
        A0e3.A2r(2131954096);
        4YU.A1N(A0e3, r0);
        4YU.A1K(A013, A0e3);
        A013.A0j(0.0f);
        A013.A0k(0.0f);
        A013.A0e();
        2RH r02 = 2RH.A06;
        7zO.A1E(A013, r02);
        A01.A2e(7zM.A0w(A013.A00, A012));
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        8TZ A002 = C8nr.A00(r302);
        A002.A2a(migColorScheme);
        A002.A2b(r302.A0D(2131954098));
        7zN.A1D(A002, r302, Az2.class, "M4ChatHeadsInterstitialNuxContentLayout", 1252410447);
        A014.A2e(A002.A2W());
        8TU A003 = C8nm.A00(r302);
        A003.A2Y(migColorScheme);
        A003.A2Z(r302.A0D(2131954097));
        7zN.A1D(A003, r302, Az2.class, "M4ChatHeadsInterstitialNuxContentLayout", 1674061644);
        4YU.A1N(A003, r0);
        A014.A2e(A003.A2W());
        A014.A0j(0.0f);
        A014.A0k(0.0f);
        A014.A0e();
        7zO.A1E(A014, r02);
        7zL.A1G(A014, A01);
        4YU.A1L(A01, r02);
        return A01.A00;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [com.facebook.messaging.chatheads.interstitialnux.ChatHeadsInterstitialNuxFragment, androidx.fragment.app.Fragment] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != 1252410447) {
            if (i != 1674061644) {
                return null;
            }
            ChatHeadsInterstitialNuxFragment.A05(((Az2) r302.A00.A01).A00.A00.A02.A00);
            return null;
        }
        ?? r0 = ((Az2) r302.A00.A01).A00.A00.A02.A00;
        try {
            ((08O) r0.A03.get()).A01().A0B(((1Rv) r0.A02.get()).A01(false), r0, 82);
            return null;
        } catch (ActivityNotFoundException e) {
            0fH.A0w("ChatHeadsInterstitialNuxFragment", "Unable to find activity for ACTION_MANAGE_OVERLAY_PERMISSION", e);
            return null;
        }
    }
}
