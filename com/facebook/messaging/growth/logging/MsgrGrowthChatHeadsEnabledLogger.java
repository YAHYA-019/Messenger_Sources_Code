package com.facebook.messaging.growth.logging;

import X.04J;
import X.1BO;
import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Rv;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.C00i;
import X.C0B5;
import X.C0et;
import X.DKB;
import android.content.Context;
import com.facebook.inject.FbInjector;

/* loaded from: MsgrGrowthChatHeadsEnabledLogger.class */
public final class MsgrGrowthChatHeadsEnabledLogger {
    public 1BY A00;
    public final C00i A02 = new 1BQ(16885);
    public final C00i A03 = FbInjector.A00;
    public final C00i A04 = new 1BQ(16634);
    public final C0et A01 = (C0et) 1Bi.A03(83604);
    public final C00i A05 = new 1BQ(67262);

    public MsgrGrowthChatHeadsEnabledLogger(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static void A00(MsgrGrowthChatHeadsEnabledLogger msgrGrowthChatHeadsEnabledLogger, String str) {
        String str2;
        if (msgrGrowthChatHeadsEnabledLogger.A01 == C0et.A0P) {
            C00i c00i = msgrGrowthChatHeadsEnabledLogger.A02;
            if (((C0B5) c00i.get()).A01("com.facebook.katana", 0) != null) {
                1UG A00 = 1UD.A00((04J) msgrGrowthChatHeadsEnabledLogger.A04.get(), 1ZG.A01, "msgr_growth_chat_heads_enabled");
                if (A00.isSampled()) {
                    Boolean bool = (Boolean) 1Bn.A0E((Context) null, msgrGrowthChatHeadsEnabledLogger.A00, 99943);
                    boolean A0B = ((1Rv) msgrGrowthChatHeadsEnabledLogger.A05.get()).A0B();
                    try {
                        str2 = ((C0B5) c00i.get()).A01.getInstallerPackageName(((Context) msgrGrowthChatHeadsEnabledLogger.A03.get()).getPackageName());
                    } catch (IllegalArgumentException unused) {
                        str2 = null;
                    }
                    A00.A7R("trigger", str);
                    A00.A5H("chat_heads_enabled", bool);
                    A00.A5H("can_draw_overlays", Boolean.valueOf(A0B));
                    A00.A7R("installer_name", str2);
                    A00.BZL();
                }
            }
        }
    }

    public void A01() {
        A00(this, DKB.A00(358));
    }
}
