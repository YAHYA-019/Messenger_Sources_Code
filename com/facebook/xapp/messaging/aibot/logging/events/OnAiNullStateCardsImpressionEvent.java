package com.facebook.xapp.messaging.aibot.logging.events;

import X.11T;
import X.1Q5;
import X.98C;
import X.98J;
import java.util.List;

/* loaded from: OnAiNullStateCardsImpressionEvent.class */
public final class OnAiNullStateCardsImpressionEvent implements 1Q5 {
    public final long A00;
    public final 98C A01;
    public final 98J A02;
    public final Long A03;
    public final String A04;
    public final String A05;
    public final String A06;

    public OnAiNullStateCardsImpressionEvent(98C r302, 98J r303, Long l, String str, String str2, String str3, long j) {
        11T.A0F(str2, 4);
        this.A05 = str;
        this.A01 = r302;
        this.A00 = j;
        this.A04 = str2;
        this.A02 = r303;
        this.A03 = l;
        this.A06 = str3;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsImpressionEvent";
    }

    public List B1L() {
        return null;
    }
}
