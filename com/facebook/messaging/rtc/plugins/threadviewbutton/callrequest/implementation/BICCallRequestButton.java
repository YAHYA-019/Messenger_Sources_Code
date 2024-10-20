package com.facebook.messaging.rtc.plugins.threadviewbutton.callrequest.implementation;

import X.06Z;
import X.1Br;
import X.7zM;
import X.7zR;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: BICCallRequestButton.class */
public final class BICCallRequestButton {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final ThreadKey A03;
    public final ThreadViewColorScheme A04;

    public BICCallRequestButton(Context context, 06Z r303, ThreadKey threadKey, ThreadViewColorScheme threadViewColorScheme) {
        7zR.A1N(threadViewColorScheme, r303);
        this.A04 = threadViewColorScheme;
        this.A00 = context;
        this.A01 = r303;
        this.A03 = threadKey;
        this.A02 = 7zM.A0U();
    }
}
