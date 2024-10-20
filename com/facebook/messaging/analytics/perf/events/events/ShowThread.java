package com.facebook.messaging.analytics.perf.events.events;

import X.C0s8;
import X.C6ic;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: ShowThread.class */
public final class ShowThread extends PRELoggingEvent {
    public static final List A05 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final ThreadViewParams A00;
    public final C6ic A01;
    public final Boolean A02;
    public final Boolean A03;
    public final String A04;

    public ShowThread(ThreadViewParams threadViewParams, C6ic c6ic, Boolean bool, Boolean bool2, String str, int i) {
        super(i);
        this.A00 = threadViewParams;
        this.A01 = c6ic;
        this.A04 = str;
        this.A03 = bool;
        this.A02 = bool2;
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.ShowThread";
    }

    public List B1L() {
        return A05;
    }
}
