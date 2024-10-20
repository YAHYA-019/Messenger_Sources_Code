package com.facebook.zero.common;

import X.AnonymousClass001;

/* loaded from: ZeroDogfoodingSettingsParams.class */
public class ZeroDogfoodingSettingsParams {
    public final Long mDogfoodingSettingsTs;
    public final String mZeroBalance;

    public ZeroDogfoodingSettingsParams() {
        this.mZeroBalance = "";
        this.mDogfoodingSettingsTs = 0L;
    }

    public ZeroDogfoodingSettingsParams(String str, Long l) {
        this.mZeroBalance = str;
        this.mDogfoodingSettingsTs = l;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ZeroDogfoodingSettingsParams:{");
        sb.append(", zero_balance=");
        sb.append(this.mZeroBalance);
        sb.append(", dogfooding_settings_ts=");
        sb.append(this.mDogfoodingSettingsTs);
        return AnonymousClass001.A0d("}", sb);
    }
}
