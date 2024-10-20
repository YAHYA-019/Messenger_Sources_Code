package com.facebook.cameracore.musiceffect;

import X.C0il;
import X.GOo;
import X.QzC;
import com.facebook.jni.HybridData;

/* loaded from: AudioServiceConfigurationAnnouncer.class */
public final class AudioServiceConfigurationAnnouncer {
    public static final QzC Companion = new Object();
    public HybridData mHybridData;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, X.QzC] */
    static {
        C0il.A0B("musiceffect-native");
    }

    public AudioServiceConfigurationAnnouncer() {
        if (GOo.A1T()) {
            return;
        }
        this.mHybridData = initHybrid();
    }

    private final native boolean announce(String str, String str2, String str3, String str4, long j, long j2, String str5);

    public static final native HybridData initHybrid();

    public final native float audioClipProgress();

    public final native boolean pause();

    public final native boolean resume();
}
