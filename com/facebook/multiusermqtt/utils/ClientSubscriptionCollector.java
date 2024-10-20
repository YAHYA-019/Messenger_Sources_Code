package com.facebook.multiusermqtt.utils;

import X.0WH;
import X.1BQ;
import X.C00i;
import X.C1mW;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: ClientSubscriptionCollector.class */
public final class ClientSubscriptionCollector {
    public final C00i A00 = new 1BQ(32826);
    public final C00i A01;
    public final List A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;
    public final C00i A06;

    public ClientSubscriptionCollector() {
        1BQ r0 = new 1BQ(66309);
        this.A06 = r0;
        this.A02 = new CopyOnWriteArrayList();
        this.A03 = new 0WH(0);
        this.A04 = new 0WH(0);
        this.A05 = new 0WH(0);
        this.A01 = ((C1mW) r0.get()).A00;
    }
}
