package com.facebook.acra.anr.sigquit;

/* loaded from: SigquitDetectorListener.class */
public interface SigquitDetectorListener {
    void onHookedMethods(boolean z);

    void onSigquit();

    void onSigquitTracesAvailable(String str, String str2, boolean z, boolean z2);
}
