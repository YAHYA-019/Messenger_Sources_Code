package com.facebook.livequery.auxiliary;

import X.11T;
import X.1BK;
import X.1Bq;
import X.1Br;
import X.1De;
import X.1EZ;
import X.7zS;
import X.C06w;
import X.C06z;
import X.C15h;
import X.GOp;
import X.J5u;
import com.facebook.auth.viewercontext.ViewerContext;

/* loaded from: LiveQueryClientInfo.class */
public final class LiveQueryClientInfo {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(LiveQueryClientInfo.class, "viewerContextManager", "getViewerContextManager()Lcom/facebook/auth/viewercontext/ViewerContextManager;", 0), new C06w(LiveQueryClientInfo.class, "uniqueIdForDeviceHolder", "getUniqueIdForDeviceHolder()Lcom/facebook/device_id/UniqueIdForDeviceHolder;", 0), new C06w(LiveQueryClientInfo.class, "mobileConfig", "getMobileConfig()Lcom/facebook/mobileconfig/factory/MobileConfig;", 0)};
    public final 1De kinjector;
    public final 1Br viewerContextManager$delegate;
    public final C15h userAgentProvider = J5u.A03(this, 10);
    public final 1Br uniqueIdForDeviceHolder$delegate = 1Bq.A00(33032);
    public final 1Br mobileConfig$delegate = 1BK.A0C();

    public LiveQueryClientInfo(1De r302) {
        this.kinjector = r302;
        this.viewerContextManager$delegate = GOp.A0J(r302);
    }

    private final ViewerContext getViewerContext() {
        ViewerContext B0v = ((1EZ) 1Br.A0B(this.viewerContextManager$delegate)).B0v();
        if (B0v == null) {
            if (11T.A0O(((1EZ) 1Br.A0B(this.viewerContextManager$delegate)).Aue(), ViewerContext.A01)) {
                return null;
            }
            B0v = ((1EZ) 1Br.A0B(this.viewerContextManager$delegate)).Aue();
        }
        return B0v;
    }

    public final String accessToken() {
        ViewerContext viewerContext = getViewerContext();
        if (viewerContext == null || 1Br.A07(this.mobileConfig$delegate).AZk(36315211208729150L)) {
            return null;
        }
        return viewerContext.mAuthToken;
    }

    public final String deviceId() {
        return 7zS.A11(this.uniqueIdForDeviceHolder$delegate);
    }

    public final String userAgent() {
        Object obj = this.userAgentProvider.get();
        11T.A0A(obj);
        return (String) obj;
    }

    public final String userId() {
        ViewerContext viewerContext = getViewerContext();
        if (viewerContext == null) {
            return null;
        }
        return viewerContext.mUserId;
    }
}
