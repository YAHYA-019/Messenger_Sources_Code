package com.facebook.xapp.messaging.events.common.data;

import X.0S2;
import X.1Q5;
import java.util.List;

/* loaded from: RequestLoadMoreData.class */
public final class RequestLoadMoreData implements 1Q5 {
    public static final RequestLoadMoreData A01 = new RequestLoadMoreData(0S2.A00);
    public final Integer A00;

    public RequestLoadMoreData(Integer num) {
        this.A00 = num;
    }

    public String A3Z() {
        return "com.facebook.xapp.messaging.events.common.data.RequestLoadMoreData";
    }

    public List B1L() {
        return null;
    }
}
