package com.facebook.messaging.nativepagereply.plugins.biimthreadactionsystem.entrypoint;

import X.06Z;
import X.1Br;
import X.1Bu;
import X.5Sh;
import X.7zM;
import X.7zR;
import X.AnonymousClass553;
import X.Cx1;
import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.scheme.interfaces.ThreadViewColorScheme;

/* loaded from: TASEntrypointButton.class */
public final class TASEntrypointButton {
    public final Context A00;
    public final 06Z A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final ThreadKey A05;
    public final ThreadViewColorScheme A06;
    public final AnonymousClass553 A07;
    public final 5Sh A08;

    public TASEntrypointButton(Context context, 06Z r303, ThreadKey threadKey, 5Sh r305, ThreadViewColorScheme threadViewColorScheme) {
        7zR.A1O(r303, threadViewColorScheme);
        this.A00 = context;
        this.A01 = r303;
        this.A06 = threadViewColorScheme;
        this.A08 = r305;
        this.A05 = threadKey;
        this.A04 = 7zM.A0U();
        this.A03 = 1Bu.A01(context, 82643);
        this.A02 = 1Bu.A01(context, 66590);
        this.A07 = Cx1.A01(this, 27);
    }
}
