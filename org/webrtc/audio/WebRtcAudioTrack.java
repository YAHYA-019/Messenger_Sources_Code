package org.webrtc.audio;

import X.0Pz;
import X.1BL;
import X.AnonymousClass001;
import X.DKD;
import X.Hn4;
import X.JQx;
import X.JQz;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import java.nio.ByteBuffer;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: WebRtcAudioTrack.class */
public class WebRtcAudioTrack {
    public static final int AUDIO_TRACK_START = 0;
    public static final int AUDIO_TRACK_STOP = 1;
    public static final long AUDIO_TRACK_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BITS_PER_SAMPLE = 16;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final int DEFAULT_USAGE = 2;
    public static final String TAG = "WebRtcAudioTrackExternal";
    public final AudioAttributes audioAttributes;
    public final AudioManager audioManager;
    public AudioTrackThread audioThread;
    public AudioTrack audioTrack;
    public ByteBuffer byteBuffer;
    public final Context context;
    public byte[] emptyBytes;
    public final JavaAudioDeviceModule.AudioTrackErrorCallback errorCallback;
    public int initialBufferSizeInFrames;
    public long nativeAudioTrack;
    public volatile boolean speakerMute;
    public final JavaAudioDeviceModule.AudioTrackStateCallback stateCallback;
    public final Hn4 threadChecker;
    public boolean useLowLatency;
    public final VolumeLogger volumeLogger;

    /* loaded from: WebRtcAudioTrack$AudioTrackThread.class */
    public class AudioTrackThread extends Thread {
        public LowLatencyAudioBufferManager bufferManager;
        public volatile boolean keepAlive;

        public AudioTrackThread(String str) {
            super(str);
            this.keepAlive = true;
            this.bufferManager = new LowLatencyAudioBufferManager();
        }

        private int writeBytes(AudioTrack audioTrack, ByteBuffer byteBuffer, int i) {
            return audioTrack.write(byteBuffer, i, 0);
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioTrack.TAG, 0Pz.A0W("AudioTrackThread", WebRtcAudioUtils.getThreadInfo()));
            WebRtcAudioTrack.assertTrue(AnonymousClass001.A1Q(WebRtcAudioTrack.this.audioTrack.getPlayState(), 3));
            WebRtcAudioTrack.this.doAudioTrackStateCallback(0);
            int capacity = WebRtcAudioTrack.this.byteBuffer.capacity();
            while (this.keepAlive) {
                WebRtcAudioTrack.nativeGetPlayoutData(WebRtcAudioTrack.this.nativeAudioTrack, capacity);
                WebRtcAudioTrack.assertTrue(DKD.A1V(capacity, WebRtcAudioTrack.this.byteBuffer.remaining()));
                if (WebRtcAudioTrack.this.speakerMute) {
                    WebRtcAudioTrack.this.byteBuffer.clear();
                    WebRtcAudioTrack webRtcAudioTrack = WebRtcAudioTrack.this;
                    webRtcAudioTrack.byteBuffer.put(webRtcAudioTrack.emptyBytes);
                    WebRtcAudioTrack.this.byteBuffer.position(0);
                }
                WebRtcAudioTrack webRtcAudioTrack2 = WebRtcAudioTrack.this;
                int write = webRtcAudioTrack2.audioTrack.write(webRtcAudioTrack2.byteBuffer, capacity, 0);
                if (write != capacity) {
                    Logging.e(WebRtcAudioTrack.TAG, 0Pz.A0T("AudioTrack.write played invalid number of bytes: ", write));
                    if (write < 0) {
                        this.keepAlive = false;
                        WebRtcAudioTrack.this.reportWebRtcAudioTrackError(0Pz.A0T("AudioTrack.write failed: ", write));
                    }
                }
                WebRtcAudioTrack webRtcAudioTrack3 = WebRtcAudioTrack.this;
                if (webRtcAudioTrack3.useLowLatency) {
                    this.bufferManager.maybeAdjustBufferSize(webRtcAudioTrack3.audioTrack);
                }
                WebRtcAudioTrack.this.byteBuffer.rewind();
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioTrack.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager) {
        this(context, audioManager, null, null, null, false);
    }

    public WebRtcAudioTrack(Context context, AudioManager audioManager, AudioAttributes audioAttributes, JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback, JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback, boolean z) {
        Hn4 hn4 = new Hn4();
        this.threadChecker = hn4;
        hn4.A00 = null;
        this.context = context;
        this.audioManager = audioManager;
        this.audioAttributes = audioAttributes;
        this.errorCallback = audioTrackErrorCallback;
        this.stateCallback = audioTrackStateCallback;
        this.volumeLogger = new VolumeLogger(audioManager);
        this.useLowLatency = z;
        Logging.d(TAG, 0Pz.A0W("ctor", WebRtcAudioUtils.getThreadInfo()));
    }

    private int GetPlayoutUnderrunCount() {
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            return audioTrack.getUnderrunCount();
        }
        return -1;
    }

    public static AudioAttributes.Builder applyAttributesOnQOrHigher(AudioAttributes.Builder builder, AudioAttributes audioAttributes) {
        return builder.setAllowedCapturePolicy(audioAttributes.getAllowedCapturePolicy());
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw AnonymousClass001.A0J("Expected condition to be true");
        }
    }

    private int channelCountToConfiguration(int i) {
        int i2 = 12;
        if (i == 1) {
            i2 = 4;
        }
        return i2;
    }

    public static AudioTrack createAudioTrackOnLollipopOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes) {
        Logging.d(TAG, "createAudioTrackOnLollipopOrHigher");
        logNativeOutputSampleRate(i);
        return new AudioTrack(getAudioAttributes(audioAttributes), JQz.A0K(i, i2), i3, 1, 0);
    }

    public static AudioTrack createAudioTrackOnLowerThanLollipop(int i, int i2, int i3) {
        return new AudioTrack(0, i, i2, 2, i3, 1);
    }

    public static AudioTrack createAudioTrackOnOreoOrHigher(int i, int i2, int i3, AudioAttributes audioAttributes) {
        Logging.d(TAG, "createAudioTrackOnOreoOrHigher");
        logNativeOutputSampleRate(i);
        return new AudioTrack.Builder().setAudioAttributes(getAudioAttributes(audioAttributes)).setAudioFormat(JQz.A0K(i, i2)).setBufferSizeInBytes(i3).setPerformanceMode(1).setTransferMode(1).setSessionId(0).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioTrackStateCallback(int i) {
        Logging.d(TAG, 0Pz.A0T("doAudioTrackStateCallback: ", i));
        JavaAudioDeviceModule.AudioTrackStateCallback audioTrackStateCallback = this.stateCallback;
        if (audioTrackStateCallback != null) {
            if (i == 0) {
                audioTrackStateCallback.onWebRtcAudioTrackStart();
            } else if (i == 1) {
                audioTrackStateCallback.onWebRtcAudioTrackStop();
            } else {
                Logging.e(TAG, "Invalid audio state");
            }
        }
    }

    public static AudioAttributes getAudioAttributes(AudioAttributes audioAttributes) {
        AudioAttributes.Builder contentType = new AudioAttributes.Builder().setUsage(DEFAULT_USAGE).setContentType(1);
        if (audioAttributes != null) {
            if (audioAttributes.getUsage() != 0) {
                contentType.setUsage(audioAttributes.getUsage());
            }
            if (audioAttributes.getContentType() != 0) {
                contentType.setContentType(audioAttributes.getContentType());
            }
            contentType.setFlags(audioAttributes.getFlags());
            if (Build.VERSION.SDK_INT >= 29) {
                contentType = applyAttributesOnQOrHigher(contentType, audioAttributes);
            }
        }
        return contentType.build();
    }

    private int getBufferSizeInFrames() {
        return this.audioTrack.getBufferSizeInFrames();
    }

    public static int getDefaultUsageAttribute() {
        return 2;
    }

    private int getInitialBufferSizeInFrames() {
        return this.initialBufferSizeInFrames;
    }

    private int getStreamMaxVolume() {
        this.threadChecker.A00();
        Logging.d(TAG, "getStreamMaxVolume");
        return this.audioManager.getStreamMaxVolume(0);
    }

    private int getStreamVolume() {
        this.threadChecker.A00();
        Logging.d(TAG, "getStreamVolume");
        return this.audioManager.getStreamVolume(0);
    }

    /* JADX WARN: Type inference failed for: r0v64, types: [java.lang.Throwable, android.media.AudioTrack] */
    private int initPlayout(int i, int i2, double d) {
        AudioTrack createAudioTrackOnLollipopOrHigher;
        String str;
        this.threadChecker.A00();
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("initPlayout(sampleRate=");
        A0k.append(i);
        A0k.append(", channels=");
        A0k.append(i2);
        A0k.append(", bufferSizeFactor=");
        A0k.append(d);
        Logging.d(TAG, AnonymousClass001.A0d(")", A0k));
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2 * 2 * (i / 100));
        this.byteBuffer = allocateDirect;
        JQx.A1O("byteBuffer.capacity: ", allocateDirect.capacity(), TAG);
        this.emptyBytes = new byte[this.byteBuffer.capacity()];
        nativeCacheDirectBufferAddress(this.nativeAudioTrack, this.byteBuffer);
        int i3 = 12;
        if (i2 == 1) {
            i3 = 4;
        }
        int minBufferSize = (int) (AudioTrack.getMinBufferSize(i, i3, 2) * d);
        JQx.A1O("minBufferSizeInBytes: ", minBufferSize, TAG);
        if (minBufferSize < this.byteBuffer.capacity()) {
            str = "AudioTrack.getMinBufferSize returns an invalid value.";
        } else {
            if (d > 1.0d) {
                this.useLowLatency = false;
            }
            ?? r0 = this.audioTrack;
            if (r0 == 0) {
                try {
                    if (this.useLowLatency) {
                        createAudioTrackOnLollipopOrHigher = createAudioTrackOnOreoOrHigher(i, i3, minBufferSize, this.audioAttributes);
                        this.audioTrack = createAudioTrackOnLollipopOrHigher;
                    } else {
                        createAudioTrackOnLollipopOrHigher = createAudioTrackOnLollipopOrHigher(i, i3, minBufferSize, this.audioAttributes);
                        this.audioTrack = createAudioTrackOnLollipopOrHigher;
                    }
                    if (createAudioTrackOnLollipopOrHigher == null || createAudioTrackOnLollipopOrHigher.getState() != 1) {
                        reportWebRtcAudioTrackInitError("Initialization of audio track failed.");
                        releaseAudioResources();
                        return -1;
                    }
                    this.initialBufferSizeInFrames = this.audioTrack.getBufferSizeInFrames();
                    logMainParameters();
                    logMainParametersExtended();
                    return minBufferSize;
                } catch (IllegalArgumentException unused) {
                    reportWebRtcAudioTrackInitError(r0.getMessage());
                    releaseAudioResources();
                    return -1;
                }
            }
            str = "Conflict with existing AudioTrack.";
        }
        reportWebRtcAudioTrackInitError(str);
        return -1;
    }

    private boolean isVolumeFixed() {
        return this.audioManager.isVolumeFixed();
    }

    private void logBufferCapacityInFrames() {
        Logging.d(TAG, 0Pz.A0T("AudioTrack: buffer capacity in frames: ", this.audioTrack.getBufferCapacityInFrames()));
    }

    private void logBufferSizeInFrames() {
        Logging.d(TAG, 0Pz.A0T("AudioTrack: buffer size in frames: ", this.audioTrack.getBufferSizeInFrames()));
    }

    private void logMainParameters() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("AudioTrack: session ID: ");
        A0k.append(this.audioTrack.getAudioSessionId());
        A0k.append(", channels: ");
        A0k.append(this.audioTrack.getChannelCount());
        A0k.append(", sample rate: ");
        A0k.append(this.audioTrack.getSampleRate());
        A0k.append(", max gain: ");
        A0k.append(AudioTrack.getMaxVolume());
        Logging.d(TAG, A0k.toString());
    }

    private void logMainParametersExtended() {
        logBufferSizeInFrames();
        logBufferCapacityInFrames();
    }

    public static void logNativeOutputSampleRate(int i) {
        int nativeOutputSampleRate = AudioTrack.getNativeOutputSampleRate(0);
        Logging.d(TAG, 0Pz.A0T("nativeOutputSampleRate: ", nativeOutputSampleRate));
        if (i != nativeOutputSampleRate) {
            Logging.w(TAG, "Unable to use fast mode since requested sample rate is not native");
        }
    }

    private void logUnderrunCount() {
        Logging.d(TAG, 0Pz.A0T("underrun count: ", this.audioTrack.getUnderrunCount()));
    }

    public static native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    public static native void nativeGetPlayoutData(long j, int i);

    private void releaseAudioResources() {
        Logging.d(TAG, "releaseAudioResources");
        AudioTrack audioTrack = this.audioTrack;
        if (audioTrack != null) {
            audioTrack.release();
            this.audioTrack = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void reportWebRtcAudioTrackError(String str) {
        Logging.e(TAG, 0Pz.A0W("Run-time playback error: ", str));
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackError(str);
        }
    }

    private void reportWebRtcAudioTrackInitError(String str) {
        Logging.e(TAG, 0Pz.A0W("Init playout error: ", str));
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackInitError(str);
        }
    }

    private void reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode audioTrackStartErrorCode, String str) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Start playout error: ");
        A0k.append(audioTrackStartErrorCode);
        Logging.e(TAG, 1BL.A0u(". ", str, A0k));
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioTrackErrorCallback audioTrackErrorCallback = this.errorCallback;
        if (audioTrackErrorCallback != null) {
            audioTrackErrorCallback.onWebRtcAudioTrackStartError(audioTrackStartErrorCode, str);
        }
    }

    private boolean setStreamVolume(int i) {
        this.threadChecker.A00();
        Logging.d(TAG, 0Pz.A0d("setStreamVolume(", ")", i));
        if (this.audioManager.isVolumeFixed()) {
            Logging.e(TAG, "The device implements a fixed volume policy.");
            return false;
        }
        this.audioManager.setStreamVolume(0, i, 0);
        return true;
    }

    private boolean startPlayout() {
        this.threadChecker.A00();
        this.volumeLogger.start();
        Logging.d(TAG, "startPlayout");
        assertTrue(AnonymousClass001.A1T(this.audioTrack));
        assertTrue(AnonymousClass001.A1U(this.audioThread));
        try {
            this.audioTrack.play();
            if (this.audioTrack.getPlayState() != 3) {
                reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_STATE_MISMATCH, 0Pz.A0T("AudioTrack.play failed - incorrect state :", this.audioTrack.getPlayState()));
                releaseAudioResources();
                return false;
            }
            AudioTrackThread audioTrackThread = new AudioTrackThread("AudioTrackJavaThread");
            this.audioThread = audioTrackThread;
            audioTrackThread.start();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioTrackStartError(JavaAudioDeviceModule.AudioTrackStartErrorCode.AUDIO_TRACK_START_EXCEPTION, 0Pz.A1B("AudioTrack.play failed: ", e));
            releaseAudioResources();
            return false;
        }
    }

    private boolean stopPlayout() {
        this.threadChecker.A00();
        this.volumeLogger.stop();
        Logging.d(TAG, "stopPlayout");
        assertTrue(AnonymousClass001.A1T(this.audioThread));
        logUnderrunCount();
        this.audioThread.stopThread();
        Logging.d(TAG, "Stopping the AudioTrackThread...");
        this.audioThread.interrupt();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e(TAG, "Join of AudioTrackThread timed out.");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        Logging.d(TAG, "AudioTrackThread has now been stopped.");
        this.audioThread = null;
        if (this.audioTrack != null) {
            Logging.d(TAG, "Calling AudioTrack.stop...");
            try {
                this.audioTrack.stop();
                Logging.d(TAG, "AudioTrack.stop is done.");
                doAudioTrackStateCallback(1);
            } catch (IllegalStateException e) {
                Logging.e(TAG, 0Pz.A1B("AudioTrack.stop failed: ", e));
            }
        }
        releaseAudioResources();
        return true;
    }

    public void setNativeAudioTrack(long j) {
        this.nativeAudioTrack = j;
    }

    public void setSpeakerMute(boolean z) {
        Logging.w(TAG, 0Pz.A19("setSpeakerMute(", ")", z));
        this.speakerMute = z;
    }
}
