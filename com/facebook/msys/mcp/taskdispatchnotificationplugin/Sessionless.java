package com.facebook.msys.mcp.taskdispatchnotificationplugin;

import java.util.Set;

/* loaded from: Sessionless.class */
public abstract class Sessionless {
    private Set MsysLSTaskDispatchNotificationImpl_GetAllowedTaskLabelsForNotificationJNI() {
        Set set = ((MsysLSTaskDispatchNotificationPluginSessionless) this).allowedTaskLabels;
        if (set == null) {
            set = null;
        }
        return set;
    }

    public abstract Set MsysLSTaskDispatchNotificationImpl_GetAllowedTaskLabelsForNotification();
}
