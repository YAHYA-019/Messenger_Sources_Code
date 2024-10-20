package com.facebook.zero.common.zerobalance;

import java.util.Arrays;

/* loaded from: ZeroBalanceUrlConfig.class */
public class ZeroBalanceUrlConfig {
    public String mTimeoutFreeUrl = "";
    public String mRedirectedFreeUrl = "";
    public String mTimeoutPaidUrl = "";
    public String mRedirectedPaidUrl = "";
    public String mTimeoutExternalUrl = "";
    public String mRedirectedExternalUrl = "";
    public int mPingTimeoutSeconds = 0;
    public int mTimeoutTotalFreePingsRetries = 0;
    public int mTimeoutTotalPaidPingsRetries = 0;
    public int mTimeoutTotalExternalPingsRetries = 0;
    public int mRedirectTotalPingRetries = 0;
    public int mZbDisableInterval = 0;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ZeroBalanceUrlConfig zeroBalanceUrlConfig = (ZeroBalanceUrlConfig) obj;
            if (this.mPingTimeoutSeconds != zeroBalanceUrlConfig.mPingTimeoutSeconds || this.mTimeoutTotalFreePingsRetries != zeroBalanceUrlConfig.mTimeoutTotalFreePingsRetries || this.mTimeoutTotalPaidPingsRetries != zeroBalanceUrlConfig.mTimeoutTotalPaidPingsRetries || this.mTimeoutTotalExternalPingsRetries != zeroBalanceUrlConfig.mTimeoutTotalExternalPingsRetries || !this.mTimeoutFreeUrl.equals(zeroBalanceUrlConfig.mTimeoutFreeUrl) || !this.mRedirectedFreeUrl.equals(zeroBalanceUrlConfig.mRedirectedFreeUrl) || !this.mTimeoutPaidUrl.equals(zeroBalanceUrlConfig.mTimeoutPaidUrl) || !this.mRedirectedPaidUrl.equals(zeroBalanceUrlConfig.mRedirectedPaidUrl) || !this.mTimeoutExternalUrl.equals(zeroBalanceUrlConfig.mTimeoutExternalUrl) || !this.mRedirectedExternalUrl.equals(zeroBalanceUrlConfig.mRedirectedExternalUrl)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mTimeoutFreeUrl, this.mRedirectedFreeUrl, this.mTimeoutPaidUrl, this.mRedirectedPaidUrl, this.mTimeoutExternalUrl, this.mRedirectedExternalUrl, Integer.valueOf(this.mPingTimeoutSeconds), Integer.valueOf(this.mTimeoutTotalFreePingsRetries), Integer.valueOf(this.mTimeoutTotalPaidPingsRetries), Integer.valueOf(this.mTimeoutTotalExternalPingsRetries)});
    }
}
