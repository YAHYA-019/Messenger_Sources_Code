package com.facebook.xapp.messaging.threadpre.events.events.common.secondarydataload;

import X.7zO;
import com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent;
import java.util.List;

/* loaded from: SecondaryDataLoadOnRecentDataLoadedEnd.class */
public final class SecondaryDataLoadOnRecentDataLoadedEnd extends PRELoggingEndEvent {
    public static final List A00 = 7zO.A14("com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEndEvent", "com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent");

    @Override // com.facebook.xapp.messaging.threadpre.events.events.common.PRELoggingEvent
    public String A00() {
        return "secondary_data_load_on_recent_data_loaded";
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.threadpre.events.events.common.secondarydataload.SecondaryDataLoadOnRecentDataLoadedEnd";
    }

    public List B1L() {
        return A00;
    }
}
