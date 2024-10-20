package org.webrtc;

import org.webrtc.PeerConnection;

/* loaded from: RtcCertificatePem.class */
public abstract class RtcCertificatePem {
    public static native RtcCertificatePem nativeGenerateCertificate(PeerConnection.KeyType keyType, long j);
}
