package com.facebook.msys.mcp.analyticsplugin;

import X.1BY;
import X.C4Xg;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.analytics.analytics2.Analytics2Analytics;
import java.util.List;
import java.util.Map;

/* loaded from: MsysAnalyticsPluginPremailbox.class */
public class MsysAnalyticsPluginPremailbox extends Premailbox {
    public 1BY _UL_mInjectionContext;
    public Analytics2Analytics analytics2Analytics;

    private Analytics2Analytics getAnalytics() {
        if (this.analytics2Analytics == null) {
            synchronized (MsysAnalyticsPluginPremailbox.class) {
                if (this.analytics2Analytics == null) {
                    this.analytics2Analytics = new Analytics2Analytics(new C4Xg(this, 30));
                }
            }
        }
        return this.analytics2Analytics;
    }

    @Override // com.facebook.msys.mcp.analyticsplugin.Premailbox
    public void MsysAnalyticsImpl_MsysAnalyticsLog(PrivacyContext privacyContext, int i, int i2, boolean z, int i3, String str, String str2, long j, Map map, Map map2, List list) {
        getAnalytics().log(i, i2, z, str, str2, j, map, map2, list);
    }
}
