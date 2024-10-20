package com.facebook.pando;

import X.11T;
import X.GI4;

/* loaded from: NativeCallbacks.class */
public final class NativeCallbacks {
    public final GI4 innerCallbacks;

    public NativeCallbacks(GI4 gi4) {
        11T.A0F(gi4, 1);
        this.innerCallbacks = gi4;
    }

    public final void onError(PandoError pandoError) {
        11T.A0F(pandoError, 0);
        this.innerCallbacks.BwM(pandoError);
    }

    public final void onModelUpdate(TreeJNI treeJNI, Summary summary) {
        11T.A0H(treeJNI, summary);
        this.innerCallbacks.CSa(summary, treeJNI);
    }
}
