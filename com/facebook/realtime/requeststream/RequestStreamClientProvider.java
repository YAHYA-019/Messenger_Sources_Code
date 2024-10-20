package com.facebook.realtime.requeststream;

import X.1BO;
import X.1BY;
import X.1Lo;
import X.7zL;
import X.C15h;
import X.J5u;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: RequestStreamClientProvider.class */
public class RequestStreamClientProvider {
    public 1BY _UL_mInjectionContext;
    public FbUserSession mFbUserSession;
    public final C15h mMQTTRequestStreamClientHolder = J5u.A03(this, 75);

    public RequestStreamClientProvider(1BO r302, FbUserSession fbUserSession) {
        this._UL_mInjectionContext = 7zL.A0Q(r302);
        this.mFbUserSession = fbUserSession;
    }

    private RequestStreamClient getDGWRequestStreamClient() {
        return (RequestStreamClient) 1Lo.A04((Context) null, this.mFbUserSession, this._UL_mInjectionContext, 115433);
    }

    private RequestStreamClient getMQTTRequestStreamClient() {
        return (RequestStreamClient) this.mMQTTRequestStreamClientHolder.get();
    }
}
