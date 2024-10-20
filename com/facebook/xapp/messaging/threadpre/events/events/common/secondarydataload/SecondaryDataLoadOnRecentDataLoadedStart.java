package com.facebook.xapp.messaging.threadpre.events.events.common.secondarydataload;

import X.7zO;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent;
import java.util.List;

/* loaded from: SecondaryDataLoadOnRecentDataLoadedStart.class */
public final class SecondaryDataLoadOnRecentDataLoadedStart extends PRELoggingStartEvent {
    public static final List A00 = 7zO.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingStartEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "secondary_data_load_on_recent_data_loaded";
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.secondarydataload.SecondaryDataLoadOnRecentDataLoadedStart";
    }

    public List B1L() {
        return A00;
    }
}
