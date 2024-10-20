package com.facebook.messaging.threadview.plugins.messagedetails.transition;

import X.5Rl;
import X.5Rm;
import X.C3s9;
import X.C5X0;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.facebook.acra.constants.ActionId;

/* loaded from: MessageDetailsTransition.class */
public final class MessageDetailsTransition {
    public static final 5Rl A00;
    public static final 5Rm A01;
    public static final 5Rm A02;

    static {
        AccelerateInterpolator accelerateInterpolator = new AccelerateInterpolator();
        5Rm r0 = C3s9.A01;
        A01 = new C5X0(accelerateInterpolator, ActionId.VIDEO_DISPLAYED);
        A02 = new C5X0(new DecelerateInterpolator(), ActionId.VIDEO_DISPLAYED);
        A00 = new 5Rl(250.0d, 30.0d);
    }
}
