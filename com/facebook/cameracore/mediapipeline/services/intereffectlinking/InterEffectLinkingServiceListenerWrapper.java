package com.facebook.cameracore.mediapipeline.services.intereffectlinking;

import X.AnonymousClass001;
import X.JEP;
import X.SE0;
import android.os.Handler;

/* loaded from: InterEffectLinkingServiceListenerWrapper.class */
public class InterEffectLinkingServiceListenerWrapper {
    public final JEP mListener;
    public final Handler mUIHandler = AnonymousClass001.A07();

    public InterEffectLinkingServiceListenerWrapper(JEP jep) {
        this.mListener = jep;
    }

    public void requestEffect(String str, boolean z, InterEffectLinkingFailureHandler interEffectLinkingFailureHandler) {
        this.mUIHandler.post(new SE0(interEffectLinkingFailureHandler, this, str, z));
    }
}
