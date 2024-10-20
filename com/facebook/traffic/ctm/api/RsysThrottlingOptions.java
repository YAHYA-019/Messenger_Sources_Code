package com.facebook.traffic.ctm.api;

/* loaded from: RsysThrottlingOptions.class */
public class RsysThrottlingOptions {
    public final long maxDownlinkBitsPerSecond;
    public final long maxUplinkBitsPerSecond;

    /* loaded from: RsysThrottlingOptions$Builder.class */
    public final class Builder {
        public long maxDownlinkBitsPerSecond;
        public long maxUplinkBitsPerSecond;

        public Builder() {
            long j = -1;
            this.maxUplinkBitsPerSecond = j;
            this.maxDownlinkBitsPerSecond = j;
        }

        public RsysThrottlingOptions build() {
            return new RsysThrottlingOptions(this);
        }

        public Builder maxDownlinkBitsPerSecond(long j) {
            this.maxDownlinkBitsPerSecond = j;
            return this;
        }

        public Builder maxUplinkBitsPerSecond(long j) {
            this.maxUplinkBitsPerSecond = j;
            return this;
        }
    }

    public RsysThrottlingOptions(Builder builder) {
        this.maxUplinkBitsPerSecond = builder.maxUplinkBitsPerSecond;
        this.maxDownlinkBitsPerSecond = builder.maxDownlinkBitsPerSecond;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof RsysThrottlingOptions)) {
                return false;
            }
            RsysThrottlingOptions rsysThrottlingOptions = (RsysThrottlingOptions) obj;
            if (this.maxUplinkBitsPerSecond == rsysThrottlingOptions.maxUplinkBitsPerSecond && this.maxDownlinkBitsPerSecond == rsysThrottlingOptions.maxDownlinkBitsPerSecond) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public long getMaxDownlinkBitsPerSecond() {
        return this.maxDownlinkBitsPerSecond;
    }

    public long getMaxUplinkBitsPerSecond() {
        return this.maxUplinkBitsPerSecond;
    }
}
