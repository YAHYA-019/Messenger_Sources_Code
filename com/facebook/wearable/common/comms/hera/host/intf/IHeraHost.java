package com.facebook.wearable.common.comms.hera.host.intf;

import X.0DR;
import X.C00m;
import android.view.Surface;

/* loaded from: IHeraHost.class */
public interface IHeraHost {
    void configureCameraSourcesCallback(C00m c00m, C00m c00m2);

    Object dispatchToStore(Object obj, 0DR r2);

    IHeraCallManager getCallManager();

    String getDebugStats();

    Object init(0DR r1);

    Object release(0DR r1);

    void setCameraOutputSurface(Surface surface, int i, int i2);
}
