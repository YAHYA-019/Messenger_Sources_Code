package org.webrtc.voiceengine;

import X.0Pz;
import X.1BL;
import X.AnonymousClass001;
import X.GOm;
import X.JQx;
import X.KMY;
import X.Lxb;
import X.MDo;
import X.MDp;
import android.media.AudioRecord;
import com.facebook.acra.constants.ActionId;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;

/* loaded from: WebRtcAudioRecord.class */
public class WebRtcAudioRecord {
    public static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BITS_PER_SAMPLE = 16;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int BUFFER_SIZE_FACTOR = 2;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final boolean DEBUG = false;
    public static final String TAG = "WebRtcAudioRecord";
    public static MDp audioSamplesReadyCallback;
    public static MDo errorCallback;
    public static volatile boolean microphoneMute;
    public AudioRecord audioRecord;
    public Lxb audioThread;
    public ByteBuffer byteBuffer;
    public WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final long nativeAudioRecord;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    public static int audioSource = 7;

    public WebRtcAudioRecord(long j) {
        Logging.d(TAG, JQx.A0x("ctor"));
        this.nativeAudioRecord = j;
        this.effects = new WebRtcAudioEffects();
    }

    public static /* synthetic */ MDp access$700() {
        return null;
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw AnonymousClass001.A0J("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        int i2 = 12;
        if (i == 1) {
            i2 = 16;
        }
        return i2;
    }

    private boolean enableBuiltInAEC(boolean z) {
        Logging.d(TAG, 0Pz.A0R("enableBuiltInAEC(", ')', z));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setAEC(z);
        }
        Logging.e(TAG, "Built-in AEC is not supported on this platform");
        return false;
    }

    private boolean enableBuiltInNS(boolean z) {
        Logging.d(TAG, 0Pz.A0R("enableBuiltInNS(", ')', z));
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            return webRtcAudioEffects.setNS(z);
        }
        Logging.e(TAG, "Built-in NS is not supported on this platform");
        return false;
    }

    private int getAudioSessionId() {
        return this.audioRecord.getAudioSessionId();
    }

    public static int getDefaultAudioSource() {
        return 7;
    }

    private int initRecording(int i, int i2) {
        String A0T;
        Logging.d(TAG, 0Pz.A0o("initRecording(sampleRate=", ", channels=", ")", i, i2));
        if (this.audioRecord != null) {
            A0T = "InitRecording called twice without StopRecording.";
        } else {
            int i3 = i / 100;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * 2 * i3);
            this.byteBuffer = allocateDirect;
            JQx.A1O("byteBuffer.capacity: ", allocateDirect.capacity(), TAG);
            this.emptyBytes = new byte[this.byteBuffer.capacity()];
            nativeCacheDirectBufferAddress(this.byteBuffer, this.nativeAudioRecord);
            int i4 = 12;
            if (i2 == 1) {
                i4 = 16;
            }
            int minBufferSize = AudioRecord.getMinBufferSize(i, i4, 2);
            if (minBufferSize != -1 && minBufferSize != -2) {
                JQx.A1O("AudioRecord.getMinBufferSize: ", minBufferSize, TAG);
                int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                JQx.A1O("bufferSizeInBytes: ", max, TAG);
                try {
                    AudioRecord audioRecord = new AudioRecord(audioSource, i, i4, 2, max);
                    this.audioRecord = audioRecord;
                    if (audioRecord.getState() != 1) {
                        reportWebRtcAudioRecordInitError("Failed to create a new AudioRecord instance");
                        releaseAudioResources();
                        return -1;
                    }
                    WebRtcAudioEffects webRtcAudioEffects = this.effects;
                    if (webRtcAudioEffects != null) {
                        webRtcAudioEffects.enable(this.audioRecord.getAudioSessionId(), true);
                    }
                    logMainParameters();
                    logMainParametersExtended();
                    return i3;
                } catch (IllegalArgumentException e) {
                    reportWebRtcAudioRecordInitError(0Pz.A1B("AudioRecord ctor error: ", e));
                    releaseAudioResources();
                    return -1;
                }
            }
            A0T = 0Pz.A0T("AudioRecord.getMinBufferSize failed: ", minBufferSize);
        }
        reportWebRtcAudioRecordInitError(A0T);
        return -1;
    }

    private void logMainParameters() {
        Logging.d(TAG, 0Pz.A0q("AudioRecord: session ID: ", ", channels: ", ", sample rate: ", this.audioRecord.getAudioSessionId(), this.audioRecord.getChannelCount(), this.audioRecord.getSampleRate()));
    }

    private void logMainParametersExtended() {
        Logging.d(TAG, 0Pz.A0T("AudioRecord: buffer size in frames: ", this.audioRecord.getBufferSizeInFrames()));
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer byteBuffer, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(int i, long j);

    private native void nativeReportWebRtcAudioRecordError(String str, long j);

    private native void nativeReportWebRtcAudioRecordInitError(String str, long j);

    private native void nativeReportWebRtcAudioRecordStartError(String str, String str2, long j);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioRecord audioRecord = this.audioRecord;
        if (audioRecord != null) {
            audioRecord.release();
            this.audioRecord = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioRecordError(String str) {
        Logging.e(TAG, 0Pz.A0W("Run-time recording error: ", str));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioRecordError(0Pz.A0W("Run-time recording error: ", str), this.nativeAudioRecord);
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, 0Pz.A0W("Init recording error: ", str));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioRecordInitError(0Pz.A0W("Init recording error: ", str), this.nativeAudioRecord);
    }

    private void reportWebRtcAudioRecordStartError(KMY kmy, String str) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Start recording error: ");
        A0k.append(kmy);
        Logging.e(TAG, 1BL.A0u(". ", str, A0k));
        WebRtcAudioUtils.logAudioState(TAG);
        nativeReportWebRtcAudioRecordStartError(kmy.toString(), 0Pz.A0W("Start recording error: ", str), this.nativeAudioRecord);
    }

    public static void setAudioSource(int i) {
        synchronized (WebRtcAudioRecord.class) {
            Logging.w(TAG, 0Pz.A0C(audioSource, i, "Audio source is changed from: ", " to "));
            audioSource = i;
        }
    }

    public static void setErrorCallback(MDo mDo) {
        Logging.d(TAG, GOm.A00(ActionId.ASYNC_ACTION_FAIL));
        errorCallback = mDo;
    }

    public static void setMicrophoneMute(boolean z) {
        Logging.w(TAG, 0Pz.A19("setMicrophoneMute(", ")", z));
        microphoneMute = z;
    }

    public static void setOnAudioSamplesReady(MDp mDp) {
        audioSamplesReadyCallback = mDp;
    }

    private boolean startRecording() {
        Logging.d(TAG, "startRecording");
        assertTrue(AnonymousClass001.A1T(this.audioRecord));
        assertTrue(AnonymousClass001.A1U(this.audioThread));
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(KMY.A02, 0Pz.A0T("AudioRecord.startRecording failed - incorrect state :", this.audioRecord.getRecordingState()));
                return false;
            }
            Lxb lxb = new Lxb(this);
            this.audioThread = lxb;
            lxb.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(KMY.A01, 0Pz.A1B("AudioRecord.startRecording failed: ", e));
            return false;
        }
    }

    private boolean stopRecording() {
        Logging.d(TAG, "stopRecording");
        Lxb lxb = this.audioThread;
        if (lxb != null) {
            Logging.d(TAG, "stopThread");
            lxb.A00 = false;
            if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
                Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
                WebRtcAudioUtils.logAudioState(TAG);
            }
            this.audioThread = null;
        }
        WebRtcAudioEffects webRtcAudioEffects = this.effects;
        if (webRtcAudioEffects != null) {
            webRtcAudioEffects.release();
        }
        releaseAudioResources();
        return true;
    }
}
