package org.webrtc;

import X.1BK;
import java.util.Collections;
import java.util.List;
import org.webrtc.MediaStreamTrack;

/* loaded from: RtpTransceiver.class */
public abstract class RtpTransceiver {

    /* loaded from: RtpTransceiver$RtpTransceiverDirection.class */
    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);

        public final int nativeIndex;

        RtpTransceiverDirection(int i) {
            this.nativeIndex = i;
        }
    }

    /* loaded from: RtpTransceiver$RtpTransceiverInit.class */
    public final class RtpTransceiverInit {
        public final RtpTransceiverDirection direction;
        public final List sendEncodings;
        public final List streamIds;

        public RtpTransceiverInit() {
            RtpTransceiverDirection rtpTransceiverDirection = RtpTransceiverDirection.SEND_RECV;
            List emptyList = Collections.emptyList();
            List emptyList2 = Collections.emptyList();
            this.direction = rtpTransceiverDirection;
            this.streamIds = 1BK.A17(emptyList);
            this.sendEncodings = 1BK.A17(emptyList2);
        }
    }

    public static native RtpTransceiverDirection nativeCurrentDirection(long j);

    public static native RtpTransceiverDirection nativeDirection(long j);

    public static native MediaStreamTrack.MediaType nativeGetMediaType(long j);

    public static native String nativeGetMid(long j);

    public static native RtpReceiver nativeGetReceiver(long j);

    public static native RtpSender nativeGetSender(long j);

    public static native void nativeSetCodecPreferences(long j, List list);

    public static native boolean nativeSetDirection(long j, RtpTransceiverDirection rtpTransceiverDirection);

    public static native void nativeStopInternal(long j);

    public static native void nativeStopStandard(long j);

    public static native boolean nativeStopped(long j);
}
