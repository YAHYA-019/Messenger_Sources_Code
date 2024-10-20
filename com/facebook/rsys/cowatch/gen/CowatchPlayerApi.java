package com.facebook.rsys.cowatch.gen;

import X.2JQ;
import X.HMt;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: CowatchPlayerApi.class */
public abstract class CowatchPlayerApi {
    public static 2JQ CONVERTER = IR0.A00(77);

    /* loaded from: CowatchPlayerApi$CProxy.class */
    public final class CProxy extends CowatchPlayerApi {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            HMt.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native CowatchPlayerApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void endSession(String str, String str2);

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof CowatchPlayerApi)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void forceResetAudio();

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void forceSyncLatestState();

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void playMedia(String str, String str2, long j, CowatchLoggingMetadata cowatchLoggingMetadata, boolean z, int i);

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void playMediaOptimistic(String str, String str2, long j, CowatchMediaMetadata cowatchMediaMetadata, CowatchLoggingMetadata cowatchLoggingMetadata, int i, String str3);

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void playMediaOptimisticDeprecated(String str, String str2, String str3, String str4, boolean z, boolean z2, long j, float f, String str5, String str6, String str7, long j2, String str8, String str9, boolean z3, boolean z4, String str10, long j3);

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void postAdminMessageWithEmptyModel(String str);

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void selectCaptionLanguage(String str);

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void updateIsInReportFlow(boolean z);

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void updateMediaLikedState(boolean z);

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void updateMediaPosition(long j, long j2);

        @Override // com.facebook.rsys.cowatch.gen.CowatchPlayerApi
        public native void updatePlaybackState(int i, long j);
    }

    public abstract void endSession(String str, String str2);

    public abstract void forceResetAudio();

    public abstract void forceSyncLatestState();

    public abstract void playMedia(String str, String str2, long j, CowatchLoggingMetadata cowatchLoggingMetadata, boolean z, int i);

    public abstract void playMediaOptimistic(String str, String str2, long j, CowatchMediaMetadata cowatchMediaMetadata, CowatchLoggingMetadata cowatchLoggingMetadata, int i, String str3);

    public abstract void playMediaOptimisticDeprecated(String str, String str2, String str3, String str4, boolean z, boolean z2, long j, float f, String str5, String str6, String str7, long j2, String str8, String str9, boolean z3, boolean z4, String str10, long j3);

    public abstract void postAdminMessageWithEmptyModel(String str);

    public abstract void selectCaptionLanguage(String str);

    public abstract void updateIsInReportFlow(boolean z);

    public abstract void updateMediaLikedState(boolean z);

    public abstract void updateMediaPosition(long j, long j2);

    public abstract void updatePlaybackState(int i, long j);
}
