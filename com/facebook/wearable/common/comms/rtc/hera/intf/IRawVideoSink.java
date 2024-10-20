package com.facebook.wearable.common.comms.rtc.hera.intf;

import X.JDa;
import kotlin.jvm.functions.Function2;

/* loaded from: IRawVideoSink.class */
public interface IRawVideoSink extends JDa {
    Function2 getOnSinkParamsChanged();

    IVideoSize getSinkSize();

    void notifySourceSizeChanged(int i, int i2);

    void release();

    void setOnSinkParamsChanged(Function2 function2);
}
