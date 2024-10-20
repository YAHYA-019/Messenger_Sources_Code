package com.facebook.acra.anr.sigquit;

import X.C04a;
import android.os.Handler;

/* loaded from: SigquitDetector.class */
public interface SigquitDetector {
    void cleanupAppStateFile();

    void doNotIgnoreNextSiguit();

    void init(C04a c04a, boolean z);

    void installSignalHandler(Handler handler, boolean z);

    void startDetector();

    void stopDetector();
}
