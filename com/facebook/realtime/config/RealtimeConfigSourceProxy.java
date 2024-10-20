package com.facebook.realtime.config;

import X.3tY;

/* loaded from: RealtimeConfigSourceProxy.class */
public class RealtimeConfigSourceProxy {
    public final 3tY mConfigSource;

    public RealtimeConfigSourceProxy(3tY r302) {
        this.mConfigSource = r302;
    }

    public boolean getGlobalBool(String str, boolean z) {
        return this.mConfigSource.Anw(str, z);
    }

    public double getGlobalDouble(String str, double d) {
        return d;
    }

    public int getGlobalInt(String str, int i) {
        return i;
    }

    public String getGlobalString(String str, String str2) {
        return this.mConfigSource.Anx(str, str2);
    }

    public boolean getLiveConfigBool(String str, String str2, boolean z) {
        return this.mConfigSource.AZj(str, str2, z);
    }

    public double getLiveConfigDouble(String str, String str2, double d) {
        return this.mConfigSource.AiC(str, str2, d);
    }

    public int getLiveConfigInt(String str, String str2, int i) {
        return this.mConfigSource.ArW(str, str2, i);
    }

    public String getLiveConfigString(String str, String str2, String str3) {
        return this.mConfigSource.BD4(str, str2, str3);
    }
}
