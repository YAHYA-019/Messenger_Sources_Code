package com.facebook.rsys.clienttransportmonitor.gen;

import X.2JQ;
import X.N0B;
import X.N6e;
import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: ClientTransportMonitorProxy.class */
public abstract class ClientTransportMonitorProxy {
    public static 2JQ CONVERTER = N6e.A00(16);

    /* loaded from: ClientTransportMonitorProxy$CProxy.class */
    public final class CProxy extends ClientTransportMonitorProxy {
        public static long sMcfTypeId;
        public final NativeHolder mNativeHolder;

        static {
            N0B.A00();
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }

        public static native ClientTransportMonitorProxy createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof ClientTransportMonitorProxy)) {
                return false;
            }
            return nativeEquals(obj);
        }

        @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
        public native long getCumulativeBytesReceived();

        @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
        public native long getCumulativeBytesSent();

        @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
        public native SocketStateStats getSocketStateStats();

        public native int hashCode();

        @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
        public native void onCallCompleted(RetinaStats retinaStats);

        @Override // com.facebook.rsys.clienttransportmonitor.gen.ClientTransportMonitorProxy
        public native void updateCallStatus(RsysCallStatus rsysCallStatus, long j);
    }

    public abstract long getCumulativeBytesReceived();

    public abstract long getCumulativeBytesSent();

    public abstract SocketStateStats getSocketStateStats();

    public abstract void onCallCompleted(RetinaStats retinaStats);

    public abstract void updateCallStatus(RsysCallStatus rsysCallStatus, long j);
}
