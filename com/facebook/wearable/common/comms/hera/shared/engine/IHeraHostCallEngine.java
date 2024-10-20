package com.facebook.wearable.common.comms.hera.shared.engine;

import X.JJN;
import android.content.Context;
import com.facebook.wearable.common.comms.hera.shared.lifecycle.ILifecycleObserver;
import com.meta.wearable.comms.calling.hera.engine.camera.FeatureCameraApi;

/* loaded from: IHeraHostCallEngine.class */
public interface IHeraHostCallEngine extends IHeraCallEngine {
    Context getActivityContext();

    ILifecycleObserver.LifecycleListener getAppLifecycleListener();

    FeatureCameraApi getCameraApi();

    JJN getConnection();

    String getCurrentCallId();

    void setActivityContext(Context context);
}
