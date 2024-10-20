package com.messagingclient.componentslogger;

import X.C0il;
import java.util.Map;

/* loaded from: ComponentLoggerPluginMCFBridgejniDispatcher.class */
public class ComponentLoggerPluginMCFBridgejniDispatcher {
    static {
        C0il.A0B("ComponentLoggerPluginMCFBridgejni");
    }

    public static native Map MCIComponentAttributionLoggerCreateAggregatedDataNative(int i, int i2);

    public static native void MCIComponentAttributionLoggerEndNative(int i, int i2);

    public static native void MCIComponentAttributionLoggerStartNative(int i, int i2, String str);
}
