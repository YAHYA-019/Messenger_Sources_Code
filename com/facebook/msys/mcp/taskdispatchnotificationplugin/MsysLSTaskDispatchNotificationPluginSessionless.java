package com.facebook.msys.mcp.taskdispatchnotificationplugin;

import X.11T;
import X.2Gi;
import java.util.Collections;
import java.util.Set;

/* loaded from: MsysLSTaskDispatchNotificationPluginSessionless.class */
public final class MsysLSTaskDispatchNotificationPluginSessionless extends Sessionless {
    public static final 2Gi Companion = new Object();
    public static final String TRQ_LABEL = "145";
    public final Set allowedTaskLabels;

    public MsysLSTaskDispatchNotificationPluginSessionless() {
        Set singleton = Collections.singleton(TRQ_LABEL);
        11T.A0A(singleton);
        this.allowedTaskLabels = singleton;
    }

    @Override // com.facebook.msys.mcp.taskdispatchnotificationplugin.Sessionless
    public Set MsysLSTaskDispatchNotificationImpl_GetAllowedTaskLabelsForNotification() {
        return this.allowedTaskLabels;
    }
}
