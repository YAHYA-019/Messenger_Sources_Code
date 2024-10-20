package X;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.os.Process;
import org.webrtc.Logging;
import org.webrtc.voiceengine.WebRtcAudioTrack;

/* loaded from: Lxc.class */
public final class Lxc extends Thread {
    public static final String __redex_internal_original_name = "WebRtcAudioTrack$AudioTrackThread";
    public volatile boolean A00;
    public final /* synthetic */ WebRtcAudioTrack A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lxc(WebRtcAudioTrack webRtcAudioTrack) {
        super("AudioTrackJavaThread");
        this.A01 = webRtcAudioTrack;
        this.A00 = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        int i;
        String A0T;
        Process.setThreadPriority(-19);
        Logging.d(WebRtcAudioTrack.TAG, JQx.A0x("AudioTrackThread"));
        WebRtcAudioTrack webRtcAudioTrack = this.A01;
        WebRtcAudioTrack.assertTrue(AnonymousClass001.A1Q(webRtcAudioTrack.audioTrack.getPlayState(), 3));
        int capacity = webRtcAudioTrack.byteBuffer.capacity();
        while (this.A00) {
            webRtcAudioTrack.nativeGetPlayoutData(capacity, webRtcAudioTrack.nativeAudioTrack);
            WebRtcAudioTrack.assertTrue(DKD.A1V(capacity, webRtcAudioTrack.byteBuffer.remaining()));
            if (WebRtcAudioTrack.speakerMute) {
                webRtcAudioTrack.byteBuffer.clear();
                webRtcAudioTrack.byteBuffer.put(webRtcAudioTrack.emptyBytes);
                webRtcAudioTrack.byteBuffer.position(0);
            }
            int write = webRtcAudioTrack.audioTrack.write(webRtcAudioTrack.byteBuffer, capacity, 0);
            if (write != capacity) {
                Logging.e(WebRtcAudioTrack.TAG, 0Pz.A0T("AudioTrack.write played invalid number of bytes: ", write));
                if (write < 0) {
                    this.A00 = false;
                    webRtcAudioTrack.reportWebRtcAudioTrackError(0Pz.A0T("AudioTrack.write failed: ", write));
                }
            }
            webRtcAudioTrack.byteBuffer.rewind();
            AudioTrack audioTrack = webRtcAudioTrack.audioTrack;
            long j = write;
            int i2 = KdA.A00;
            if (i2 != 0) {
                long j2 = KdA.A03 + (j / i2);
                KdA.A03 = j2;
                if (j2 % KdA.A02 == 0) {
                    AudioTimestamp audioTimestamp = KdA.A04;
                    if (audioTrack.getTimestamp(audioTimestamp)) {
                        long j3 = audioTimestamp.framePosition;
                        long j4 = audioTimestamp.nanoTime;
                        long j5 = KdA.A03 - j3;
                        double sampleRate = ((j4 + ((j5 * 1000000000) / audioTrack.getSampleRate())) - System.nanoTime()) / 1000000.0d;
                        if (sampleRate > 0.0d && sampleRate < 2.147483647E9d) {
                            KdA.A01 = (int) sampleRate;
                        }
                        A0T = 0Pz.A0T("Latency in ms: ", KdA.A01);
                    } else {
                        A0T = "Failed to get Timestamp ";
                    }
                    Logging.d("WebRtcAudioLatencyUtils", A0T);
                }
                i = KdA.A01;
            } else {
                i = 0;
            }
            webRtcAudioTrack.nativeReportWebRtcTrackLatencyInMs(i, webRtcAudioTrack.nativeAudioTrack);
        }
        try {
            AudioTrack audioTrack2 = webRtcAudioTrack.audioTrack;
            if (audioTrack2 != null) {
                Logging.d(WebRtcAudioTrack.TAG, "Calling AudioTrack.stop...");
                audioTrack2.stop();
                Logging.d(WebRtcAudioTrack.TAG, "AudioTrack.stop is done.");
            }
        } catch (IllegalStateException e) {
            Logging.e(WebRtcAudioTrack.TAG, 0Pz.A1B("AudioTrack.stop failed: ", e));
        }
    }
}
