package com.facebook.msys.mcp.analyticsplugin;

import com.facebook.msys.mci.PrivacyContext;
import java.util.List;
import java.util.Map;

/* loaded from: Premailbox.class */
public abstract class Premailbox {
    private void MsysAnalyticsImpl_MsysAnalyticsLogJNI(PrivacyContext privacyContext, int i, int i2, boolean z, int i3, String str, String str2, long j, Map map, Map map2, List list) {
        if (privacyContext == null) {
            privacyContext = null;
        }
        if (map == null) {
            map = null;
        }
        if (map2 == null) {
            map2 = null;
        }
        if (list == null) {
            list = null;
        }
        MsysAnalyticsImpl_MsysAnalyticsLog(privacyContext, i, i2, z, i3, str, str2, j, map, map2, list);
    }

    public abstract void MsysAnalyticsImpl_MsysAnalyticsLog(PrivacyContext privacyContext, int i, int i2, boolean z, int i3, String str, String str2, long j, Map map, Map map2, List list);
}
