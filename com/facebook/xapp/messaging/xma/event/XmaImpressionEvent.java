package com.facebook.xapp.messaging.xma.event;

import X.11T;
import X.1Q5;
import X.C5n8;
import java.util.List;

/* loaded from: XmaImpressionEvent.class */
public final class XmaImpressionEvent implements 1Q5 {
    public final C5n8 A00;
    public final Integer A01;

    public XmaImpressionEvent(C5n8 c5n8, Integer num) {
        11T.A0F(c5n8, 1);
        this.A00 = c5n8;
        this.A01 = num;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.xma.event.XmaImpressionEvent";
    }

    public List B1L() {
        return null;
    }
}
