package com.facebook.fury.context;

import X.C0jw;

/* loaded from: ReqContextsPlugin.class */
public interface ReqContextsPlugin {
    boolean accepts(ReqContext reqContext);

    ReqContext continueReqContext(ReqContext reqContext, String str, int i, int i2, C0jw c0jw);

    ReqContext create(String str, int i, C0jw c0jw);

    void deactivate(ReqContext reqContext);

    void fail(ReqContext reqContext, Throwable th);

    ReqContext getActive();

    void reset();
}
