package X;

import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.voiceengine.WebRtcAudioRecord;

/* loaded from: Lxb.class */
public final class Lxb extends Thread {
    public static final String __redex_internal_original_name = "WebRtcAudioRecord$AudioRecordThread";
    public volatile boolean A00;
    public final /* synthetic */ WebRtcAudioRecord A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lxb(WebRtcAudioRecord webRtcAudioRecord) {
        super("AudioRecordJavaThread");
        this.A01 = webRtcAudioRecord;
        this.A00 = true;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        Process.setThreadPriority(-19);
        Logging.d(WebRtcAudioRecord.TAG, JQx.A0x("AudioRecordThread"));
        WebRtcAudioRecord webRtcAudioRecord = this.A01;
        WebRtcAudioRecord.assertTrue(AnonymousClass001.A1Q(webRtcAudioRecord.audioRecord.getRecordingState(), 3));
        System.nanoTime();
        while (this.A00) {
            AudioRecord audioRecord = webRtcAudioRecord.audioRecord;
            ByteBuffer byteBuffer = webRtcAudioRecord.byteBuffer;
            int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
            if (read == webRtcAudioRecord.byteBuffer.capacity()) {
                if (WebRtcAudioRecord.microphoneMute) {
                    webRtcAudioRecord.byteBuffer.clear();
                    webRtcAudioRecord.byteBuffer.put(webRtcAudioRecord.emptyBytes);
                }
                if (this.A00) {
                    webRtcAudioRecord.nativeDataIsRecorded(read, webRtcAudioRecord.nativeAudioRecord);
                }
            } else {
                String A0T = 0Pz.A0T("AudioRecord.read failed: ", read);
                Logging.e(WebRtcAudioRecord.TAG, A0T);
                if (read == -3) {
                    this.A00 = false;
                    webRtcAudioRecord.reportWebRtcAudioRecordError(A0T);
                }
            }
        }
        try {
            AudioRecord audioRecord2 = webRtcAudioRecord.audioRecord;
            if (audioRecord2 != null) {
                audioRecord2.stop();
            }
        } catch (IllegalStateException e) {
            Logging.e(WebRtcAudioRecord.TAG, 0Pz.A1B("AudioRecord.stop failed: ", e));
        }
    }
}
