package com.facebook.messaging.notify.plugins.mutexapp.threadsettingsdata;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.1PA;
import X.1PG;
import X.2Ph;
import X.7zM;
import X.AbH;
import X.C00i;
import X.C1x;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: ThreadSettingsMuteData.class */
public final class ThreadSettingsMuteData {
    public 1PA A00;
    public ThreadSummary A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final C1x A05;
    public final Context A06;

    public ThreadSettingsMuteData(Context context, ThreadKey threadKey, C1x c1x) {
        1BL.A1H(threadKey, c1x, context);
        this.A04 = threadKey;
        this.A05 = c1x;
        this.A06 = context;
        this.A03 = 1Bu.A01(context, 17010);
        this.A02 = AbH.A0d(context);
    }

    public static final void A00(ThreadSettingsMuteData threadSettingsMuteData) {
        NotificationSetting AzZ;
        NotificationSetting Aap;
        C1x c1x = threadSettingsMuteData.A05;
        C00i c00i = threadSettingsMuteData.A03.A00;
        2Ph r0 = (2Ph) c00i.get();
        ThreadSummary threadSummary = threadSettingsMuteData.A01;
        if (threadSummary == null) {
            AzZ = NotificationSetting.A05;
        } else {
            ThreadKey threadKey = threadSummary.A0n;
            AzZ = threadKey == null ? NotificationSetting.A06 : (threadKey.A0z() || (threadKey.A1N() && 1PG.A02(r0.A02))) ? threadSummary.AzZ() : r0.A02(threadKey);
        }
        c1x.A00(7zM.A17(AzZ.A02()), "is_muted");
        2Ph r02 = (2Ph) c00i.get();
        ThreadSummary threadSummary2 = threadSettingsMuteData.A01;
        if (threadSummary2 == null) {
            Aap = NotificationSetting.A05;
        } else {
            ThreadKey threadKey2 = threadSummary2.A0n;
            Aap = (threadKey2 == null || !r02.A0A(threadKey2.A06)) ? NotificationSetting.A06 : (threadKey2.A0z() || (threadKey2.A1N() && 1PG.A02(r02.A02))) ? threadSummary2.Aap() : r02.A01(threadKey2);
        }
        c1x.A00(7zM.A17(Aap.A02()), "is_call_muted");
    }
}
