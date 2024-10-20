package com.facebook.ffmpeg;

import X.1KL;
import X.1KN;
import X.4YV;
import X.5Hg;
import java.util.Map;

/* loaded from: FFMpegMediaMuxer.class */
public class FFMpegMediaMuxer {
    public Map A00;
    public boolean A01;
    public final int A02;
    public final 5Hg A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final NativeWrapper mNativeWrapper;

    /* loaded from: FFMpegMediaMuxer$NativeWrapper.class */
    public class NativeWrapper implements 1KL {
        public volatile long mFragmentedFormatFlagsFix;
        public volatile long mNativeAudioCodec;
        public volatile long mNativeContext;
        public volatile long mNativeVideoCodec;

        public NativeWrapper(Object obj, long j) {
            this.mFragmentedFormatFlagsFix = j;
            1KN.A00(this, obj);
        }

        private native void nativeFinalize();

        public native FFMpegAVStream nativeAddStream(FFMpegMediaFormat fFMpegMediaFormat, int i, int i2);

        public native void nativeInit(String str);

        public native void nativeStart(boolean z, String str, Map map, String str2);

        public native void nativeStop();

        public void targetDestructed() {
            nativeFinalize();
        }
    }

    public FFMpegMediaMuxer(5Hg r302, String str, boolean z) {
        this(r302, str, z, null, -1, false, null, null);
    }

    public FFMpegMediaMuxer(5Hg r302, String str, boolean z, String str2, int i, boolean z2, Map map) {
        this(r302, str, z, str2, i, z2, map, null);
    }

    public FFMpegMediaMuxer(5Hg r302, String str, boolean z, String str2, int i, boolean z2, Map map, String str3) {
        this.A03 = r302;
        this.A06 = str;
        this.A07 = z;
        this.A04 = str2;
        this.A02 = i;
        this.mNativeWrapper = new NativeWrapper(this, 4YV.A03(z2 ? 1 : 0));
        this.A00 = map;
        this.A05 = str3;
    }

    public void A00() {
        this.mNativeWrapper.nativeStart(this.A07, this.A04, this.A00, this.A05);
        this.A01 = true;
    }

    public void A01() {
        if (this.A01) {
            this.mNativeWrapper.nativeStop();
            this.A01 = false;
        }
    }

    public FFMpegMediaMuxer initialize() {
        this.A03.A00();
        this.mNativeWrapper.nativeInit(this.A06);
        return this;
    }
}
