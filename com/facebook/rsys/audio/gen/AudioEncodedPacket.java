package com.facebook.rsys.audio.gen;

import X.2JQ;
import X.HMh;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: AudioEncodedPacket.class */
public class AudioEncodedPacket {
    public static 2JQ CONVERTER = N6e.A00(0);
    public static long sMcfTypeId;
    public final NativeHolder mNativeHolder;

    static {
        HMh.A00();
    }

    public AudioEncodedPacket(NativeHolder nativeHolder) {
        this.mNativeHolder = nativeHolder;
    }

    public AudioEncodedPacket(byte[] bArr, short s, int i) {
        bArr.getClass();
        Short.valueOf(s).getClass();
        this.mNativeHolder = initNativeHolder(bArr, s, i);
    }

    public static native AudioEncodedPacket createFromMcfType(McfReference mcfReference);

    public static native NativeHolder initNativeHolder(byte[] bArr, short s, int i);

    private native boolean nativeEquals(Object obj);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof AudioEncodedPacket)) {
            return false;
        }
        return nativeEquals(obj);
    }

    public native byte[] getEncodedData();

    public native short getSeqNum();

    public native int getTimestamp();

    public native int hashCode();

    public native String toString();
}
