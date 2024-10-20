package com.facebook.messaging.customthreads.plugins.core.theme.threadthemeinfo;

import X.11T;
import X.1Br;
import X.1Bu;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.surfaceoptions.model.ThreadViewSurfaceOptions;

/* loaded from: ThreadThemeInfoData.class */
public final class ThreadThemeInfoData {
    public final Context A00;
    public final 1Br A01;
    public final ThreadKey A02;
    public final ThreadViewSurfaceOptions A03;

    public ThreadThemeInfoData(Context context, ThreadKey threadKey, ThreadViewSurfaceOptions threadViewSurfaceOptions) {
        11T.A0F(context, 1);
        11T.A0F(threadKey, 2);
        this.A00 = context;
        this.A02 = threadKey;
        this.A03 = threadViewSurfaceOptions;
        this.A01 = 1Bu.A00(66208);
    }
}
