package com.facebook.messaging.analytics.perf.events.events;

import X.7zQ;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: GroupInviteLinkOpen.class */
public final class GroupInviteLinkOpen extends PRELoggingEvent {
    public static final List A01 = 7zQ.A13();
    public final ThreadViewParams A00;

    public GroupInviteLinkOpen(ThreadViewParams threadViewParams, int i) {
        super(i);
        this.A00 = threadViewParams;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "group_invite_link_open";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.GroupInviteLinkOpen";
    }

    public List B1L() {
        return A01;
    }
}
