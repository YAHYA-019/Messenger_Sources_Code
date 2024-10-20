package com.facebook.fbservice.ops;

import X.1Ho;
import android.os.Bundle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: BlueServiceOperationFactory.class */
public interface BlueServiceOperationFactory {
    public static final String BLUESERVICE_NO_AUTH = "BLUESERVICE_NO_AUTH";

    1Ho newInstance(String str, Bundle bundle, int i, CallerContext callerContext, FbUserSession fbUserSession);

    1Ho newInstance_DEPRECATED(String str, Bundle bundle);

    1Ho newInstance_DEPRECATED(String str, Bundle bundle, int i);

    1Ho newInstance_DEPRECATED(String str, Bundle bundle, int i, CallerContext callerContext);

    1Ho newInstance_DEPRECATED(String str, Bundle bundle, CallerContext callerContext);
}
