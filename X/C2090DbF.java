package X;

import android.content.Context;
import android.content.Intent;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import java.util.HashSet;
import java.util.LinkedHashSet;

/* renamed from: X.DbF, reason: case insensitive filesystem */
/* loaded from: DbF.class */
public final class C2090DbF extends 1Ni {
    public final 1Br A00;

    public C2090DbF() {
        super(1Bu.A00(98772), (C02w) 1Bi.A03(0));
        this.A00 = 1Bu.A00(98767);
    }

    public /* bridge */ /* synthetic */ void A02(Context context, Intent intent, Object obj) {
        F5d f5d = (F5d) obj;
        4YV.A1N(context, f5d);
        if (1Br.A07(((2tK) 1Br.A0B(this.A00)).A00).AZk(2342159130954835751L)) {
            if (11T.A0O(intent != null ? intent.getAction() : null, "com.facebook.ixttriggers.events.ENROLLMENT_CLEARED_EVENT")) {
                FbUserSession A0E = 4YV.A0E(context);
                11T.A0F(A0E, 0);
                try {
                    try {
                        String str = F5d.A03;
                        0fH.A0j(str, "Relaunch blocked triggers");
                        C2t1 c2t1 = (C2t1) 1Br.A0B(f5d.A01);
                        FbUserSession A03 = 1Br.A03(c2t1.A0G);
                        C2t2 c2t2 = c2t1.A05;
                        c2t2.A00();
                        try {
                            for (InterstitialTrigger interstitialTrigger : new LinkedHashSet((HashSet) ((F6D) 1Br.A0B(((2tN) 1Lm.A06(A03, 98776)).A00)).A04.getValue())) {
                                0fH.A0g(interstitialTrigger, str, "Maybe start interstitial with trigger %s");
                                C05324dh c05324dh = (C05324dh) 1Br.A0B(f5d.A02);
                                11T.A0F(interstitialTrigger, 1);
                                C05324dh.A01(context, c05324dh, interstitialTrigger, 2tJ.class, null, true);
                            }
                        } finally {
                            c2t2.A01();
                        }
                    } catch (Exception e) {
                        1Br.A04(f5d.A00).softReport(F5d.A03, "Failed to start blocked triggers", e);
                    }
                } finally {
                    ((C2t1) 1Br.A0B(f5d.A01)).A0T(A0E);
                }
            }
        }
    }
}
