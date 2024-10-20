package com.facebook.messaging.groups.plugins.leavegroup.threadsettingsclick;

import X.06Z;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.7zM;
import X.7zT;
import X.AbG;
import X.DHc;
import X.DHd;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSettingsLeaveGroupClickHandler.class */
public final class ThreadSettingsLeaveGroupClickHandler {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final ThreadKey A09;
    public final DHc A0A;
    public final DHd A0B;

    public ThreadSettingsLeaveGroupClickHandler(Context context, 06Z r303, ThreadKey threadKey, DHc dHc, DHd dHd) {
        7zT.A1W(context, threadKey, r303, dHd);
        11T.A0F(dHc, 5);
        this.A00 = context;
        this.A09 = threadKey;
        this.A01 = r303;
        this.A0B = dHd;
        this.A0A = dHc;
        this.A08 = 7zM.A0e(context);
        this.A03 = 1Bu.A01(context, 82535);
        this.A07 = AbG.A0W();
        this.A06 = 1Bq.A00(82449);
        this.A04 = 1Bu.A01(context, 82542);
        this.A05 = 1Bu.A01(context, 17010);
        this.A02 = AbG.A0c();
    }
}
