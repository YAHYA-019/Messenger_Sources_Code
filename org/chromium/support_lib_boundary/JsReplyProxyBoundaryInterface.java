package org.chromium.support_lib_boundary;

import java.lang.reflect.InvocationHandler;

/* loaded from: JsReplyProxyBoundaryInterface.class */
public interface JsReplyProxyBoundaryInterface extends IsomorphicObjectBoundaryInterface {
    void postMessage(String str);

    void postMessageWithPayload(InvocationHandler invocationHandler);
}
