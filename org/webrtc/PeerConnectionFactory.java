package org.webrtc;

import android.content.Context;
import org.webrtc.MediaStreamTrack;
import org.webrtc.PeerConnection;

/* loaded from: PeerConnectionFactory.class */
public abstract class PeerConnectionFactory {

    /* loaded from: PeerConnectionFactory$Options.class */
    public class Options {
    }

    public static native long nativeCreateAudioSource(long j, MediaConstraints mediaConstraints);

    public static native long nativeCreateAudioTrack(long j, String str, long j2);

    public static native long nativeCreateLocalMediaStream(long j, String str);

    public static native long nativeCreatePeerConnection(long j, PeerConnection.RTCConfiguration rTCConfiguration, MediaConstraints mediaConstraints, long j2, SSLCertificateVerifier sSLCertificateVerifier);

    public static native PeerConnectionFactory nativeCreatePeerConnectionFactory(Context context, Options options, long j, long j2, long j3, VideoEncoderFactory videoEncoderFactory, VideoDecoderFactory videoDecoderFactory, long j4, long j5, long j6, long j7, long j8);

    public static native long nativeCreateVideoSource(long j, boolean z, boolean z2);

    public static native long nativeCreateVideoTrack(long j, String str, long j2);

    public static native void nativeDeleteLoggable();

    public static native String nativeFindFieldTrialsFullName(String str);

    public static native void nativeFreeFactory(long j);

    public static native long nativeGetNativePeerConnectionFactory(long j);

    public static native RtpCapabilities nativeGetRtpReceiverCapabilities(long j, MediaStreamTrack.MediaType mediaType);

    public static native RtpCapabilities nativeGetRtpSenderCapabilities(long j, MediaStreamTrack.MediaType mediaType);

    public static native void nativeInitializeAndroidGlobals();

    public static native void nativeInitializeFieldTrials(String str);

    public static native void nativeInitializeInternalTracer();

    public static native void nativeInjectLoggable(JNILogging jNILogging, int i);

    public static native void nativePrintStackTrace(int i);

    public static native void nativeShutdownInternalTracer();

    public static native boolean nativeStartAecDump(long j, int i, int i2);

    public static native boolean nativeStartInternalTracingCapture(String str);

    public static native void nativeStopAecDump(long j);

    public static native void nativeStopInternalTracingCapture();
}
