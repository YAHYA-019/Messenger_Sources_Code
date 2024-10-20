package com.facebook.zero.common;

import com.google.common.collect.ImmutableList;

/* loaded from: ZeroTrafficEnforcementConfig.class */
public class ZeroTrafficEnforcementConfig {
    public static final ZeroTrafficEnforcementConfig A00 = new ZeroTrafficEnforcementConfig();
    public final double mPassRate;
    public final ImmutableList mSubnetsWhiteList;
    public final boolean mTorqueEnabled;

    public ZeroTrafficEnforcementConfig() {
        this.mSubnetsWhiteList = ImmutableList.of();
        this.mPassRate = 0.0d;
        this.mTorqueEnabled = false;
    }

    public ZeroTrafficEnforcementConfig(ImmutableList immutableList, double d, boolean z) {
        this.mSubnetsWhiteList = immutableList;
        this.mPassRate = d;
        this.mTorqueEnabled = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ZeroTrafficEnforcementConfig:{");
        sb.append("TorqueEnabled=");
        sb.append(this.mTorqueEnabled);
        sb.append(", PassRate=");
        sb.append(this.mPassRate);
        sb.append(", SubnetsWhiteList=");
        sb.append(this.mSubnetsWhiteList);
        sb.append("}");
        return sb.toString();
    }
}
