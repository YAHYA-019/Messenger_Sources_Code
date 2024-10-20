package com.meta.wearable.comms.calling.hera.engine.audio;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureAudioApi.class */
public abstract class FeatureAudioApi {

    /* loaded from: FeatureAudioApi$CppProxy.class */
    public final class CppProxy extends FeatureAudioApi {
        public static final /* synthetic */ boolean $assertionsDisabled = false;
        public final AtomicBoolean destroyed = 7zO.A15();
        public final long nativeRef;

        public CppProxy(long j) {
            if (j == 0) {
                throw JQz.A0i();
            }
            this.nativeRef = j;
        }

        private native void nativeDestroy(long j);

        private native void native_setMicOn(long j, String str, boolean z);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-1255629554);
            _djinni_private_destroy();
            0FI.A09(-1207172339, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioApi
        public void setMicOn(String str, boolean z) {
            native_setMicOn(this.nativeRef, str, z);
        }
    }

    public abstract void setMicOn(String str, boolean z);
}
