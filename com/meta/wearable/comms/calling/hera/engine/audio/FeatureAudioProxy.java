package com.meta.wearable.comms.calling.hera.engine.audio;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureAudioProxy.class */
public abstract class FeatureAudioProxy {

    /* loaded from: FeatureAudioProxy$CppProxy.class */
    public final class CppProxy extends FeatureAudioProxy {
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

        private native void native_setMicOn2(long j, String str, boolean z);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(1245291104);
            _djinni_private_destroy();
            0FI.A09(-2069084151, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.audio.FeatureAudioProxy
        public void setMicOn2(String str, boolean z) {
            native_setMicOn2(this.nativeRef, str, z);
        }
    }

    public abstract void setMicOn2(String str, boolean z);
}
