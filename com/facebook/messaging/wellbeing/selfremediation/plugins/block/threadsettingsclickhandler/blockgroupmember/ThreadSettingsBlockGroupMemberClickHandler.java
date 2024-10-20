package com.facebook.messaging.wellbeing.selfremediation.plugins.block.threadsettingsclickhandler.blockgroupmember;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.DHd;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSettingsBlockGroupMemberClickHandler.class */
public final class ThreadSettingsBlockGroupMemberClickHandler {
    public final 1Br A00;
    public final 1Br A01;
    public final ThreadKey A02;
    public final DHd A03;
    public final Context A04;

    public ThreadSettingsBlockGroupMemberClickHandler(Context context, ThreadKey threadKey, DHd dHd) {
        1BL.A1H(context, threadKey, dHd);
        this.A04 = context;
        this.A02 = threadKey;
        this.A03 = dHd;
        this.A00 = 1Bu.A01(context, 82655);
        this.A01 = 1Bu.A00(82656);
    }
}
