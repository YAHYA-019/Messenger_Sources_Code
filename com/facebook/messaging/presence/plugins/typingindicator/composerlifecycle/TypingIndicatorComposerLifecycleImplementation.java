package com.facebook.messaging.presence.plugins.typingindicator.composerlifecycle;

import X.11T;
import X.2S4;
import X.6QZ;
import X.83A;
import X.C01g;
import X.C01i;
import android.content.Context;

/* loaded from: TypingIndicatorComposerLifecycleImplementation.class */
public final class TypingIndicatorComposerLifecycleImplementation {
    public final 2S4 A00;
    public final 6QZ A01;
    public final C01i A02;

    public TypingIndicatorComposerLifecycleImplementation(Context context, 2S4 r303, 6QZ r304) {
        11T.A0F(r303, 1);
        11T.A0F(r304, 2);
        11T.A0F(context, 3);
        this.A00 = r303;
        this.A01 = r304;
        this.A02 = C01g.A01(new 83A(context, this, 19));
    }
}
