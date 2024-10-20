package X;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.chatheads.interstitialnux.ChatHeadsInterstitialNuxFragment;
import com.facebook.messaging.dialog.ConfirmActionParams;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;

/* renamed from: X.2j4, reason: invalid class name */
/* loaded from: 2j4.class */
public final class C2j4 {
    public Runnable A00;
    public final 1Br A05 = 1Bq.A00(67900);
    public final 1BP A09 = FbInjector.A00;
    public final 1Br A06 = 1Bu.A00(99364);
    public final 1Br A07 = 1Bq.A00(67262);
    public final 1Br A04 = 1Bu.A00(82531);
    public final 1Br A03 = 1Bu.A00(33230);
    public final 1Br A08 = 1Bu.A00(65920);
    public final 1Br A02 = 1Bq.A00(82398);
    public final 1Br A01 = 1Bq.A00(66345);

    public static final void A00(06Z r301) {
        new ChatHeadsInterstitialNuxFragment().A0m(r301, "chat_heads_interstitial_tag");
    }

    public static final void A01(C2j4 c2j4) {
        ((1vE) 1Br.A0B(c2j4.A01)).A01();
        C04464b1 c04464b1 = (C04464b1) 1Br.A0B(c2j4.A05);
        C04464b1.A01(C04464b1.A00(c04464b1, C1xj.A0A), c04464b1);
    }

    public static final void A02(C2j4 c2j4, ThreadSummary threadSummary) {
        String A00 = AnonymousClass000.A00(188);
        Erg erg = (Erg) 1Br.A0B(c2j4.A06);
        Context context = FbInjector.A03;
        11T.A0A(context);
        erg.A00(context);
        if (Build.VERSION.SDK_INT >= 30 && ((C2j5) 1Br.A0B(c2j4.A03)).A01()) {
            C1254Abw c1254Abw = (C1254Abw) 1Br.A0B(c2j4.A04);
            Context context2 = FbInjector.A03;
            11T.A0A(context2);
            c1254Abw.A09(context2, threadSummary);
            return;
        }
        ((1vE) 1Br.A0B(c2j4.A01)).A01();
        C04464b1 c04464b1 = (C04464b1) 1Br.A0B(c2j4.A05);
        ThreadKey threadKey = threadSummary.A0n;
        11T.A0A(threadKey);
        c04464b1.A04(threadKey, null, null, A00, false, 5WB.A04(threadSummary, threadSummary.A1z));
    }

    public static final boolean A03(C2j4 c2j4) {
        C00i c00i = c2j4.A03.A00;
        if (((C2j5) c00i.get()).A01() || !((1Rv) c2j4.A07.A00.get()).A0B()) {
            return ((C2j5) c00i.get()).A01() && ((2Pi) c2j4.A08.A00.get()).A02();
        }
        return true;
    }

    public final void A04(06Z r302, final ThreadSummary threadSummary) {
        if (A03(this)) {
            A02(this, threadSummary);
            return;
        }
        this.A00 = new Runnable() { // from class: X.3gg
            public static final String __redex_internal_original_name = "ChatHeadsOpenHelper$openChatHead$1";

            @Override // java.lang.Runnable
            public final void run() {
                C2j4.A02(C2j4.this, threadSummary);
            }
        };
        if (!((C2j5) 1Br.A0B(this.A03)).A01()) {
            A00(r302);
            return;
        }
        boolean A03 = ((2Pi) 1Br.A0B(this.A08)).A03();
        1Br.A0C(this.A02);
        Context context = FbInjector.A03;
        11T.A0A(context);
        if (A03) {
            C3Or.A00(context, r302);
            return;
        }
        BxS bxS = new BxS(context.getString(2131953541), context.getString(2131953543));
        bxS.A03 = 1BK.A0v(context, context.getString(2131952789), 2131953538);
        ConfirmActionParams confirmActionParams = new ConfirmActionParams(bxS);
        2Ov r0 = new 2Ov();
        Bundle A05 = 1BK.A05();
        A05.putParcelable("confirmActionParams", confirmActionParams);
        r0.setArguments(A05);
        r0.A0m(r302, (String) null);
    }
}
