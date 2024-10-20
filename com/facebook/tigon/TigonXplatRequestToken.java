package com.facebook.tigon;

import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.HttpPriorityContext;

/* loaded from: TigonXplatRequestToken.class */
public class TigonXplatRequestToken implements TigonRequestToken {
    public final HybridData mHybridData;

    public TigonXplatRequestToken(HybridData hybridData) {
        this.mHybridData = hybridData;
    }

    @Override // com.facebook.tigon.TigonRequestToken
    public native void cancel();

    @Override // com.facebook.tigon.TigonRequestToken
    public native void changeHttpPriority(int i, boolean z);

    @Override // com.facebook.tigon.TigonRequestToken
    public native void updateHttpPriorityContext(HttpPriorityContext httpPriorityContext);
}
