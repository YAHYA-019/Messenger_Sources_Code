package com.facebook.messaging.threadview.plugins.interfaceextensions.sendercontext.transition;

import X.5Rl;
import X.5Rm;
import X.C3s9;
import X.C5X0;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.acra.constants.ActionId;

/* loaded from: SenderContextTransition.class */
public final class SenderContextTransition {
    public final 5Rl A00;
    public final 5Rm A01;
    public final 5Rm A02;

    public SenderContextTransition() {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        5Rm r0 = C3s9.A01;
        this.A01 = new C5X0(accelerateInterpolator, ActionId.VIDEO_DISPLAYED);
        this.A02 = new C5X0(new DecelerateInterpolator(), ActionId.VIDEO_DISPLAYED);
        this.A00 = new 5Rl(250.0d, 30.0d);
    }
}
