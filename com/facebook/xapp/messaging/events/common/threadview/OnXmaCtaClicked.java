package com.facebook.xapp.messaging.events.common.threadview;

import X.1BL;
import X.1Q5;
import X.C5n8;
import X.C5vw;
import java.util.List;

/* loaded from: OnXmaCtaClicked.class */
public final class OnXmaCtaClicked implements 1Q5 {
    public final C5vw A00;
    public final C5n8 A01;
    public final Integer A02;

    public OnXmaCtaClicked(C5vw c5vw, C5n8 c5n8, Integer num) {
        1BL.A1F(c5n8, c5vw);
        this.A01 = c5n8;
        this.A00 = c5vw;
        this.A02 = num;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.events.common.threadview.OnXmaCtaClicked";
    }

    public List B1L() {
        return null;
    }
}
