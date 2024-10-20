package com.facebook.litho.configuration;

import X.11T;
import X.3UA;
import android.os.Build;
import android.os.StrictMode;
import java.util.concurrent.Executor;

/* loaded from: StrictModeConfiguration$PieStrictModeCompat.class */
public final class StrictModeConfiguration$PieStrictModeCompat {
    public static final StrictModeConfiguration$PieStrictModeCompat A00 = new Object();

    public final StrictMode.ThreadPolicy.Builder penaltySoftError(StrictMode.ThreadPolicy.Builder builder) {
        11T.A0E(builder);
        if (Build.VERSION.SDK_INT < 28) {
            return builder;
        }
        StrictMode.ThreadPolicy.Builder penaltyListener = builder.penaltyListener(new Executor() { // from class: X.3j2
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                runnable.run();
            }
        }, (StrictMode.OnThreadViolationListener) 3UA.A00);
        11T.A0J(penaltyListener, "penaltyListener(...)");
        return penaltyListener;
    }
}
