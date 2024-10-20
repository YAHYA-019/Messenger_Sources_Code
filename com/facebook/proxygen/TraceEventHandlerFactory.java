package com.facebook.proxygen;

import X.40H;
import X.41D;
import X.C00i;
import org.apache.http.protocol.HttpContext;

/* loaded from: TraceEventHandlerFactory.class */
public interface TraceEventHandlerFactory {
    TraceEventHandler create(String str, HttpContext httpContext, 40H r3, 41D r4, SamplePolicy samplePolicy, C00i c00i);
}
