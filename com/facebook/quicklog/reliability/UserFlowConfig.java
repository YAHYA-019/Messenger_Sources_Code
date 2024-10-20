package com.facebook.quicklog.reliability;

import X.3FH;
import X.AnonymousClass002;

/* loaded from: UserFlowConfig.class */
public class UserFlowConfig {
    public final boolean mCancelOnBackground;
    public final String mTriggerSource;
    public long mTtlMs;

    /* loaded from: UserFlowConfig$UserFlowConfigBuilder.class */
    public class UserFlowConfigBuilder {
        public final boolean mCancelOnBackground;
        public final String mTriggerSource;
        public long mTtlMs = -1;

        public UserFlowConfigBuilder(String str, boolean z) {
            this.mTriggerSource = str;
            this.mCancelOnBackground = z;
        }

        public UserFlowConfig build() {
            UserFlowConfig userFlowConfig = new UserFlowConfig(this.mTriggerSource, this.mCancelOnBackground);
            userFlowConfig.mTtlMs = this.mTtlMs;
            return userFlowConfig;
        }

        public UserFlowConfigBuilder setTtlMs(long j) {
            this.mTtlMs = j;
            return this;
        }
    }

    public UserFlowConfig(String str, boolean z) {
        this.mTtlMs = -1;
        this.mTriggerSource = str;
        this.mCancelOnBackground = z;
    }

    public /* synthetic */ UserFlowConfig(String str, boolean z, 3FH r304) {
        this(str, z);
    }

    public static UserFlowConfigBuilder builder(String str, boolean z) {
        return new UserFlowConfigBuilder(str, z);
    }

    public static UserFlowConfig create(String str, boolean z) {
        return new UserFlowConfig(str, z);
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (obj != this) {
            if (!(obj instanceof UserFlowConfig)) {
                return false;
            }
            UserFlowConfig userFlowConfig = (UserFlowConfig) obj;
            if (userFlowConfig.mTriggerSource.equals(this.mTriggerSource) && userFlowConfig.mCancelOnBackground == this.mCancelOnBackground && userFlowConfig.mTtlMs == this.mTtlMs) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public String getTriggerSource() {
        return this.mTriggerSource;
    }

    public long getTtlMs() {
        return this.mTtlMs;
    }

    public final int hashCode() {
        return AnonymousClass002.A05(Long.valueOf(this.mTtlMs), (589 + this.mTriggerSource.hashCode()) * 31) + (this.mCancelOnBackground ? 1 : 0);
    }

    public boolean isCancelOnBackground() {
        return this.mCancelOnBackground;
    }
}
