package com.facebook.messaging.aibot.plugins.core.threadsettings.creatorinforow;

import X.06Z;
import X.1Br;
import X.1Bu;
import X.2Sh;
import X.7zM;
import X.7zT;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;

/* loaded from: ThreadSettingsAiBotCreatorInfoRow.class */
public final class ThreadSettingsAiBotCreatorInfoRow {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final ThreadKey A04;
    public final 2Sh A05;

    public ThreadSettingsAiBotCreatorInfoRow(Context context, 06Z r303, ThreadKey threadKey, 2Sh r305) {
        7zT.A1T(context, threadKey, r303);
        this.A00 = context;
        this.A04 = threadKey;
        this.A05 = r305;
        this.A01 = r303;
        this.A03 = 7zM.A0U();
        this.A02 = 1Bu.A00(82553);
    }
}
