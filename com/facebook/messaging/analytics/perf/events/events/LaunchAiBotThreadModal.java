package com.facebook.messaging.analytics.perf.events.events;

import X.11T;
import X.1BK;
import X.7zQ;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: LaunchAiBotThreadModal.class */
public final class LaunchAiBotThreadModal extends PRELoggingEvent {
    public static final List A02 = 7zQ.A13();
    public final String A00;
    public final ThreadKey A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchAiBotThreadModal(ThreadKey threadKey, String str) {
        super(1BK.A01(threadKey));
        11T.A0F(str, 2);
        this.A01 = threadKey;
        this.A00 = str;
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "launch_ai_bot_thread_modal";
    }

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A01() {
        return "";
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.LaunchAiBotThreadModal";
    }

    public List B1L() {
        return A02;
    }
}
