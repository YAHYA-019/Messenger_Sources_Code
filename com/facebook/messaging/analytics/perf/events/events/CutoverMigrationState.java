package com.facebook.messaging.analytics.perf.events.events;

import X.C0s8;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent;
import java.util.List;

/* loaded from: CutoverMigrationState.class */
public final class CutoverMigrationState extends PRELoggingEvent {
    public static final List A02 = C0s8.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");
    public final int A00;
    public final boolean A01;

    public CutoverMigrationState(int i, int i2, boolean z) {
        super(i);
        this.A00 = i2;
        this.A01 = z;
    }

    public String A3Z() {
        return "com.facebook.messaging.analytics.perf.events.events.CutoverMigrationState";
    }

    public List B1L() {
        return A02;
    }
}
