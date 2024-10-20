package com.facebook.tigon.tigonobserver;

import com.facebook.tigon.iface.TigonRequest;

/* loaded from: TigonRequestAdded.class */
public interface TigonRequestAdded {
    long creationTime();

    long requestId();

    TigonRequest submittedRequest();
}
