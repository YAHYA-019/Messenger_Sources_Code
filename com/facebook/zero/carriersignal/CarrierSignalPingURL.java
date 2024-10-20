package com.facebook.zero.carriersignal;

import X.4YU;

/* loaded from: CarrierSignalPingURL.class */
public class CarrierSignalPingURL {
    public final Long cooldown;
    public final String key;
    public final String url;

    public CarrierSignalPingURL() {
        this.key = null;
        this.url = null;
        this.cooldown = null;
    }

    public CarrierSignalPingURL(String str, String str2, long j) {
        this.url = str2;
        this.key = str;
        this.cooldown = Long.valueOf(j);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            CarrierSignalPingURL carrierSignalPingURL = (CarrierSignalPingURL) obj;
            String str = this.key;
            String str2 = carrierSignalPingURL.key;
            if (str != str2 && (str == null || !str.equals(str2))) {
                return false;
            }
            String str3 = this.url;
            String str4 = carrierSignalPingURL.url;
            if (str3 != str4 && (str3 == null || !str3.equals(str4))) {
                return false;
            }
            Long l = this.cooldown;
            Long l2 = carrierSignalPingURL.cooldown;
            if (l != l2 && (l == null || !l.equals(l2))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 4YU.A04(this.key, this.url, this.cooldown);
    }
}
