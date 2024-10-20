package com.facebook.xapp.messaging.aibot.logging.events;

import X.1Q5;
import X.98C;
import X.98J;
import X.AnonymousClass983;
import java.util.List;

/* loaded from: OnAiNullStateCardsClickEvent.class */
public final class OnAiNullStateCardsClickEvent implements 1Q5 {
    public final 98C A00;
    public final AnonymousClass983 A01;
    public final 98J A02;
    public final Long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public OnAiNullStateCardsClickEvent() {
        this(null, null, null, null, null, null, null, null);
    }

    public OnAiNullStateCardsClickEvent(98C r302, AnonymousClass983 anonymousClass983, 98J r304, Long l, Long l2, String str, String str2, String str3) {
        this.A06 = str;
        this.A00 = r302;
        this.A05 = str2;
        this.A03 = l;
        this.A02 = r304;
        this.A04 = l2;
        this.A01 = anonymousClass983;
        this.A07 = str3;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.aibot.logging.events.OnAiNullStateCardsClickEvent";
    }

    public List B1L() {
        return null;
    }
}
