package com.facebook.realtime.requeststream;

import X.1BK;
import X.2yD;
import com.facebook.realtime.requeststream.api.StreamOptions;

/* loaded from: RSStreamOptions.class */
public class RSStreamOptions implements StreamOptions {
    public final long A00;
    public final String A01;
    public final boolean A02;

    public RSStreamOptions() {
        2yD A0K = 1BK.A0K();
        this.A01 = A0K.BCy(36876374455878345L);
        this.A00 = A0K.Auy(36594899479234932L);
        this.A02 = A0K.AZk(36313424503642683L);
    }

    @Override // com.facebook.realtime.requeststream.api.StreamOptions
    public String getRequestLogContext() {
        return this.A01;
    }

    @Override // com.facebook.realtime.requeststream.api.StreamOptions
    public long getRetryBackoffInterval() {
        return this.A00;
    }

    @Override // com.facebook.realtime.requeststream.api.StreamOptions
    public boolean shouldGenNewStreamIdPerRetry() {
        return this.A02;
    }
}
