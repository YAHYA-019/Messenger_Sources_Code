package com.facebook.livequery.core.common;

import X.1Bn;
import X.1De;

/* loaded from: LiveQueryServiceFactory.class */
public final class LiveQueryServiceFactory {
    public final 1De kinjector;

    public LiveQueryServiceFactory(1De r302) {
        this.kinjector = r302;
    }

    public final LiveQueryService build() {
        return (LiveQueryService) 1Bn.A0G(this.kinjector.A00, 115240);
    }
}
