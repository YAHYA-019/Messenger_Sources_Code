package com.facebook.realtime.common.appstate;

import X.1XI;
import X.1XN;

/* loaded from: AppStateGetter.class */
public class AppStateGetter implements 1XI, 1XN {
    public final 1XI mAppForegroundStateGetter;
    public final 1XN mAppNetworkStateGetter;

    public AppStateGetter(1XI r302, 1XN r303) {
        this.mAppForegroundStateGetter = r302;
        this.mAppNetworkStateGetter = r303;
    }

    public boolean isAppForegrounded() {
        return this.mAppForegroundStateGetter.isAppForegrounded();
    }

    public boolean isAppSuspended() {
        return this.mAppForegroundStateGetter.isAppSuspended();
    }

    public boolean isNetworkConnected() {
        return this.mAppNetworkStateGetter.isNetworkConnected();
    }
}
