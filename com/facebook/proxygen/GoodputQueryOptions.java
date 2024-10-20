package com.facebook.proxygen;

import X.AnonymousClass001;

/* loaded from: GoodputQueryOptions.class */
public class GoodputQueryOptions {
    public final boolean hostMustHaveQuicSocket;
    public String hostname;
    public final double percentile;

    /* loaded from: GoodputQueryOptions$Builder.class */
    public class Builder {
        public double mPercentile = 0.5d;
        public String mHostname = null;
        public boolean mHostMustHaveQuicSocket = false;

        public GoodputQueryOptions build() {
            return new GoodputQueryOptions(this);
        }

        public Builder setHostMustHaveQuicSocket(boolean z) {
            this.mHostMustHaveQuicSocket = z;
            return this;
        }

        public Builder setHostname(String str) {
            this.mHostname = str;
            return this;
        }

        public Builder setPercentile(double d) {
            if (d >= 0.0d && d <= 1.0d) {
                this.mPercentile = d;
                return this;
            }
            StringBuilder A0n = AnonymousClass001.A0n("Percentile must be within [0,1] range inclusive. Provided percentile ");
            A0n.append(d);
            throw AnonymousClass001.A0L(A0n.toString());
        }
    }

    public GoodputQueryOptions(Builder builder) {
        this.percentile = builder.mPercentile;
        this.hostname = builder.mHostname;
        this.hostMustHaveQuicSocket = builder.mHostMustHaveQuicSocket;
    }

    public String getHostname() {
        return this.hostname;
    }

    public double getPercentile() {
        return this.percentile;
    }

    public boolean mustHostHaveQuicSocket() {
        return this.hostMustHaveQuicSocket;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("GoodputQueryOptions(percentile=");
        A0k.append(this.percentile);
        A0k.append(",hostname=");
        A0k.append(this.hostname);
        A0k.append(",mustHaveQuicSocket=");
        A0k.append(this.hostMustHaveQuicSocket);
        return AnonymousClass001.A0d(")", A0k);
    }
}
