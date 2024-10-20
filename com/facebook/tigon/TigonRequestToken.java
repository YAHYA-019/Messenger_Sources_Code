package com.facebook.tigon;

import com.facebook.tigon.iface.HttpPriorityContext;

/* loaded from: TigonRequestToken.class */
public interface TigonRequestToken {
    void cancel();

    void changeHttpPriority(int i, boolean z);

    void updateHttpPriorityContext(HttpPriorityContext httpPriorityContext);
}
