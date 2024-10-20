package com.facebook.profilo.config.v2;

import X.C0il;
import com.facebook.jni.HybridData;

/* loaded from: ConfigParser.class */
public class ConfigParser {
    public final HybridData mHybridData;

    static {
        C0il.A0B("profilo_configjni");
    }

    public ConfigParser(String str) {
        this.mHybridData = initHybrid(str);
    }

    public static native HybridData initHybrid(String str);

    public native Config parseConfig();
}
