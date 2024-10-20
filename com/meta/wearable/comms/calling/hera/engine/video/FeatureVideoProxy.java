package com.meta.wearable.comms.calling.hera.engine.video;

import X.0FI;
import X.7zO;
import X.JQx;
import X.JQz;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: FeatureVideoProxy.class */
public abstract class FeatureVideoProxy {

    /* loaded from: FeatureVideoProxy$CppProxy.class */
    public final class CppProxy extends FeatureVideoProxy {
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

        private native void native_onParticipantVideoUpdated(long j, String str, String str2, boolean z);

        public void _djinni_private_destroy() {
            if (JQx.A1Z(this.destroyed)) {
                return;
            }
            nativeDestroy(this.nativeRef);
        }

        public void finalize() {
            int A03 = 0FI.A03(-2143166011);
            _djinni_private_destroy();
            0FI.A09(-506219314, A03);
        }

        @Override // com.meta.wearable.comms.calling.hera.engine.video.FeatureVideoProxy
        public void onParticipantVideoUpdated(String str, String str2, boolean z) {
            native_onParticipantVideoUpdated(this.nativeRef, str, str2, z);
        }
    }

    public abstract void onParticipantVideoUpdated(String str, String str2, boolean z);
}
