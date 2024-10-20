package com.facebook.messenger.mcp.sessionedcontext;

import X.11T;
import X.1BP;
import X.1Bq;
import X.1Br;
import X.1CO;
import X.C06w;
import X.C06z;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: MessengerSessionedMCPContext.class */
public final class MessengerSessionedMCPContext {
    public static final /* synthetic */ C06z[] $$delegatedProperties = {new C06w(MessengerSessionedMCPContext.class, "application", "getApplication()Landroid/content/Context;", 0), new C06w(MessengerSessionedMCPContext.class, "mobileConfig", "getMobileConfig()Lcom/facebook/mobileconfig/factory/MobileConfig;", 0), new C06w(MessengerSessionedMCPContext.class, "mobileConfigAdminId", "getMobileConfigAdminId()Lcom/facebook/mobileconfig/factory/MobileConfig;", 0)};
    public final 1BP application$delegate;
    public final FbUserSession fbUserSession;
    public final 1Br mobileConfig$delegate;
    public final 1Br mobileConfigAdminId$delegate;

    public MessengerSessionedMCPContext(FbUserSession fbUserSession) {
        11T.A0F(fbUserSession, 1);
        this.fbUserSession = fbUserSession;
        this.application$delegate = FbInjector.A00;
        this.mobileConfig$delegate = 1Bq.A00(16385);
        this.mobileConfigAdminId$delegate = 1Bq.A00(16387);
    }

    public final 1CO getMobileConfig() {
        return (1CO) this.mobileConfig$delegate.A00.get();
    }
}
