package org.webrtc.audio;

import X.0Pz;
import X.1BL;
import X.AnonymousClass001;
import X.JQx;
import X.JQz;
import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioRecord;
import android.media.AudioRecordingConfiguration;
import android.media.AudioTimestamp;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.webrtc.Logging;
import org.webrtc.ThreadUtils;
import org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: WebRtcAudioRecord.class */
public class WebRtcAudioRecord {
    public static final int AUDIO_RECORD_START = 0;
    public static final int AUDIO_RECORD_STOP = 1;
    public static final long AUDIO_RECORD_THREAD_JOIN_TIMEOUT_MS = 2000;
    public static final int BUFFERS_PER_SECOND = 100;
    public static final int BUFFER_SIZE_FACTOR = 2;
    public static final int CALLBACK_BUFFER_SIZE_MS = 10;
    public static final int CHECK_REC_STATUS_DELAY_MS = 100;
    public static final int DEFAULT_AUDIO_FORMAT = 2;
    public static final int DEFAULT_AUDIO_SOURCE = 7;
    public static final String TAG = "WebRtcAudioRecordExternal";
    public final int audioFormat;
    public final AudioManager audioManager;
    public AudioRecord audioRecord;
    public final JavaAudioDeviceModule.SamplesReadyCallback audioSamplesReadyCallback;
    public final int audioSource;
    public boolean audioSourceMatchesRecordingSession;
    public AudioRecordThread audioThread;
    public ByteBuffer byteBuffer;
    public final Context context;
    public final WebRtcAudioEffects effects;
    public byte[] emptyBytes;
    public final JavaAudioDeviceModule.AudioRecordErrorCallback errorCallback;
    public ScheduledExecutorService executor;
    public ScheduledFuture future;
    public final boolean isAcousticEchoCancelerSupported;
    public boolean isAudioConfigVerified;
    public final boolean isNoiseSuppressorSupported;
    public volatile boolean microphoneMute;
    public long nativeAudioRecord;
    public final JavaAudioDeviceModule.AudioRecordStateCallback stateCallback;

    /* loaded from: WebRtcAudioRecord$AudioRecordThread.class */
    public class AudioRecordThread extends Thread {
        public volatile boolean keepAlive;

        public AudioRecordThread(String str) {
            super(str);
            this.keepAlive = true;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            Process.setThreadPriority(-19);
            Logging.d(WebRtcAudioRecord.TAG, 0Pz.A0W("AudioRecordThread", WebRtcAudioUtils.getThreadInfo()));
            WebRtcAudioRecord.assertTrue(AnonymousClass001.A1Q(WebRtcAudioRecord.this.audioRecord.getRecordingState(), 3));
            WebRtcAudioRecord.this.doAudioRecordStateCallback(0);
            System.nanoTime();
            AudioTimestamp audioTimestamp = new AudioTimestamp();
            while (this.keepAlive) {
                WebRtcAudioRecord webRtcAudioRecord = WebRtcAudioRecord.this;
                AudioRecord audioRecord = webRtcAudioRecord.audioRecord;
                ByteBuffer byteBuffer = webRtcAudioRecord.byteBuffer;
                int read = audioRecord.read(byteBuffer, byteBuffer.capacity());
                if (read == WebRtcAudioRecord.this.byteBuffer.capacity()) {
                    if (WebRtcAudioRecord.this.microphoneMute) {
                        WebRtcAudioRecord.this.byteBuffer.clear();
                        WebRtcAudioRecord webRtcAudioRecord2 = WebRtcAudioRecord.this;
                        webRtcAudioRecord2.byteBuffer.put(webRtcAudioRecord2.emptyBytes);
                    }
                    if (this.keepAlive) {
                        long j = 0;
                        if (WebRtcAudioRecord.this.audioRecord.getTimestamp(audioTimestamp, 0) == 0) {
                            j = audioTimestamp.nanoTime;
                        }
                        WebRtcAudioRecord webRtcAudioRecord3 = WebRtcAudioRecord.this;
                        webRtcAudioRecord3.nativeDataIsRecorded(webRtcAudioRecord3.nativeAudioRecord, read, j);
                    }
                    WebRtcAudioRecord webRtcAudioRecord4 = WebRtcAudioRecord.this;
                    if (webRtcAudioRecord4.audioSamplesReadyCallback != null) {
                        byte[] copyOfRange = Arrays.copyOfRange(webRtcAudioRecord4.byteBuffer.array(), WebRtcAudioRecord.this.byteBuffer.arrayOffset(), WebRtcAudioRecord.this.byteBuffer.capacity() + WebRtcAudioRecord.this.byteBuffer.arrayOffset());
                        WebRtcAudioRecord webRtcAudioRecord5 = WebRtcAudioRecord.this;
                        webRtcAudioRecord5.audioSamplesReadyCallback.onWebRtcAudioRecordSamplesReady(new JavaAudioDeviceModule.AudioSamples(webRtcAudioRecord5.audioRecord.getAudioFormat(), WebRtcAudioRecord.this.audioRecord.getChannelCount(), WebRtcAudioRecord.this.audioRecord.getSampleRate(), copyOfRange));
                    }
                } else {
                    String A0T = 0Pz.A0T("AudioRecord.read failed: ", read);
                    Logging.e(WebRtcAudioRecord.TAG, A0T);
                    if (read == -3) {
                        this.keepAlive = false;
                        WebRtcAudioRecord.this.reportWebRtcAudioRecordError(A0T);
                    }
                }
            }
            try {
                AudioRecord audioRecord2 = WebRtcAudioRecord.this.audioRecord;
                if (audioRecord2 != null) {
                    audioRecord2.stop();
                    WebRtcAudioRecord.this.doAudioRecordStateCallback(1);
                }
            } catch (IllegalStateException e) {
                Logging.e(WebRtcAudioRecord.TAG, 0Pz.A1B("AudioRecord.stop failed: ", e));
            }
        }

        public void stopThread() {
            Logging.d(WebRtcAudioRecord.TAG, "stopThread");
            this.keepAlive = false;
        }
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager) {
        this(context, audioManager, 7, 2, null, null, null, WebRtcAudioEffects.isAcousticEchoCancelerSupported(), WebRtcAudioEffects.isNoiseSuppressorSupported());
    }

    public WebRtcAudioRecord(Context context, AudioManager audioManager, int i, int i2, JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback, JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback, JavaAudioDeviceModule.SamplesReadyCallback samplesReadyCallback, boolean z, boolean z2) {
        this.effects = new WebRtcAudioEffects();
        if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
            throw AnonymousClass001.A0L("HW AEC not supported");
        }
        if (z2 && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
            throw AnonymousClass001.A0L("HW NS not supported");
        }
        this.context = context;
        this.audioManager = audioManager;
        this.audioSource = i;
        this.audioFormat = i2;
        this.errorCallback = audioRecordErrorCallback;
        this.stateCallback = audioRecordStateCallback;
        this.audioSamplesReadyCallback = samplesReadyCallback;
        this.isAcousticEchoCancelerSupported = z;
        this.isNoiseSuppressorSupported = z2;
        Logging.d(TAG, 0Pz.A0W("ctor", WebRtcAudioUtils.getThreadInfo()));
    }

    public static void assertTrue(boolean z) {
        if (!z) {
            throw AnonymousClass001.A0J("Expected condition to be true");
        }
    }

    public static String audioStateToString(int i) {
        return i != 0 ? i != 1 ? "INVALID" : "STOP" : "START";
    }

    private int channelCountToConfiguration(int i) {
        int i2 = 12;
        if (i == 1) {
            i2 = 16;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r301.getType() != r302.getType()) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean checkDeviceMatch(android.media.AudioDeviceInfo r301, android.media.AudioDeviceInfo r302) {
        /*
            r0 = r301
            int r0 = r0.getId()
            r303 = r0
            r0 = r302
            int r0 = r0.getId()
            r304 = r0
            r0 = r303
            r1 = r304
            if (r0 != r1) goto L22
            r0 = r301
            int r0 = r0.getType()
            r305 = r0
            r0 = r302
            int r0 = r0.getType()
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            r1 = r303
            if (r0 == r1) goto L24
        L22:
            r0 = 0
            r304 = r0
        L24:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.audio.WebRtcAudioRecord.checkDeviceMatch(android.media.AudioDeviceInfo, android.media.AudioDeviceInfo):boolean");
    }

    public static AudioRecord createAudioRecordOnLowerThanM(int i, int i2, int i3, int i4, int i5) {
        Logging.d(TAG, "createAudioRecordOnLowerThanM");
        return new AudioRecord(i, i2, i3, i4, i5);
    }

    public static AudioRecord createAudioRecordOnMOrHigher(int i, int i2, int i3, int i4, int i5) {
        Logging.d(TAG, "createAudioRecordOnMOrHigher");
        return new AudioRecord.Builder().setAudioSource(i).setAudioFormat(new AudioFormat.Builder().setEncoding(i4).setSampleRate(i2).setChannelMask(i3).build()).setBufferSizeInBytes(i5).build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void doAudioRecordStateCallback(int i) {
        Logging.d(TAG, 0Pz.A0W("doAudioRecordStateCallback: ", audioStateToString(i)));
        JavaAudioDeviceModule.AudioRecordStateCallback audioRecordStateCallback = this.stateCallback;
        if (audioRecordStateCallback != null) {
            if (i == 0) {
                audioRecordStateCallback.onWebRtcAudioRecordStart();
            } else if (i == 1) {
                audioRecordStateCallback.onWebRtcAudioRecordStop();
            } else {
                Logging.e(TAG, "Invalid audio state");
            }
        }
    }

    private boolean enableBuiltInAEC(boolean z) {
        Logging.d(TAG, 0Pz.A19("enableBuiltInAEC(", ")", z));
        return this.effects.setAEC(z);
    }

    private boolean enableBuiltInNS(boolean z) {
        Logging.d(TAG, 0Pz.A19("enableBuiltInNS(", ")", z));
        return this.effects.setNS(z);
    }

    public static int getBytesPerSample(int i) {
        int i2 = 1;
        if (i != 1 && i != 2) {
            if (i != 3) {
                i2 = 4;
                if (i != 4) {
                    if (i != 13) {
                        throw 0Pz.A04("Bad audio format ", i);
                    }
                }
            }
            return i2;
        }
        return 2;
    }

    private int initRecording(int i, int i2) {
        String A0T;
        String A1B;
        AudioRecord createAudioRecordOnMOrHigher;
        Logging.d(TAG, 0Pz.A0o("initRecording(sampleRate=", ", channels=", ")", i, i2));
        if (this.audioRecord != null) {
            A0T = "InitRecording called twice without StopRecording.";
        } else {
            int i3 = i / 100;
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(getBytesPerSample(this.audioFormat) * i2 * i3);
            this.byteBuffer = allocateDirect;
            if (allocateDirect.hasArray()) {
                JQx.A1O("byteBuffer.capacity: ", this.byteBuffer.capacity(), TAG);
                this.emptyBytes = new byte[this.byteBuffer.capacity()];
                nativeCacheDirectBufferAddress(this.nativeAudioRecord, this.byteBuffer);
                int i4 = 12;
                if (i2 == 1) {
                    i4 = 16;
                }
                int minBufferSize = AudioRecord.getMinBufferSize(i, i4, this.audioFormat);
                if (minBufferSize != -1 && minBufferSize != -2) {
                    JQx.A1O("AudioRecord.getMinBufferSize: ", minBufferSize, TAG);
                    int max = Math.max(minBufferSize * 2, this.byteBuffer.capacity());
                    JQx.A1O("bufferSizeInBytes: ", max, TAG);
                    try {
                        createAudioRecordOnMOrHigher = createAudioRecordOnMOrHigher(this.audioSource, i, i4, this.audioFormat, max);
                        this.audioRecord = createAudioRecordOnMOrHigher;
                    } catch (IllegalArgumentException | UnsupportedOperationException e) {
                        A1B = 0Pz.A1B("AudioRecord build error: ", e);
                    }
                    if (createAudioRecordOnMOrHigher == null || createAudioRecordOnMOrHigher.getState() != 1) {
                        A1B = "Creation or initialization of audio recorder failed.";
                        reportWebRtcAudioRecordInitError(A1B);
                        releaseAudioResources();
                        return -1;
                    }
                    this.effects.enable(this.audioRecord.getAudioSessionId());
                    logMainParameters();
                    logMainParametersExtended();
                    int logRecordingConfigurations = logRecordingConfigurations(false);
                    if (logRecordingConfigurations != 0) {
                        Logging.w(TAG, 0Pz.A0T("Potential microphone conflict. Active sessions: ", logRecordingConfigurations));
                    }
                    return i3;
                }
                A0T = 0Pz.A0T("AudioRecord.getMinBufferSize failed: ", minBufferSize);
            } else {
                A0T = "ByteBuffer does not have backing array.";
            }
        }
        reportWebRtcAudioRecordInitError(A0T);
        return -1;
    }

    public static boolean logActiveRecordingConfigs(int i, List list) {
        assertTrue(!list.isEmpty());
        Iterator it = list.iterator();
        String str = "AudioRecordingConfigurations: ";
        while (true) {
            Logging.d(TAG, str);
            if (!it.hasNext()) {
                return true;
            }
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            StringBuilder A0k = AnonymousClass001.A0k();
            int clientAudioSource = audioRecordingConfiguration.getClientAudioSource();
            A0k.append("  client audio source=");
            A0k.append(WebRtcAudioUtils.audioSourceToString(clientAudioSource));
            A0k.append(", client session id=");
            A0k.append(audioRecordingConfiguration.getClientAudioSessionId());
            A0k.append(" (");
            A0k.append(i);
            A0k.append(")");
            A0k.append("\n");
            AudioFormat format = audioRecordingConfiguration.getFormat();
            A0k.append("  Device AudioFormat: ");
            A0k.append("channel count=");
            A0k.append(format.getChannelCount());
            A0k.append(", channel index mask=");
            A0k.append(format.getChannelIndexMask());
            A0k.append(", channel mask=");
            A0k.append(WebRtcAudioUtils.channelMaskToString(format.getChannelMask()));
            A0k.append(", encoding=");
            A0k.append(WebRtcAudioUtils.audioEncodingToString(format.getEncoding()));
            A0k.append(", sample rate=");
            A0k.append(format.getSampleRate());
            A0k.append("\n");
            AudioFormat clientFormat = audioRecordingConfiguration.getClientFormat();
            A0k.append("  Client AudioFormat: ");
            A0k.append("channel count=");
            A0k.append(clientFormat.getChannelCount());
            A0k.append(", channel index mask=");
            A0k.append(clientFormat.getChannelIndexMask());
            A0k.append(", channel mask=");
            A0k.append(WebRtcAudioUtils.channelMaskToString(clientFormat.getChannelMask()));
            A0k.append(", encoding=");
            A0k.append(WebRtcAudioUtils.audioEncodingToString(clientFormat.getEncoding()));
            A0k.append(", sample rate=");
            A0k.append(clientFormat.getSampleRate());
            A0k.append("\n");
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null) {
                assertTrue(audioDevice.isSource());
                A0k.append("  AudioDevice: ");
                A0k.append("type=");
                A0k.append(JQz.A0k(audioDevice.getType()));
                A0k.append(", id=");
                A0k.append(audioDevice.getId());
            }
            str = A0k.toString();
        }
    }

    private void logMainParameters() {
        Logging.d(TAG, 0Pz.A0q("AudioRecord: session ID: ", ", channels: ", ", sample rate: ", this.audioRecord.getAudioSessionId(), this.audioRecord.getChannelCount(), this.audioRecord.getSampleRate()));
    }

    private void logMainParametersExtended() {
        Logging.d(TAG, 0Pz.A0T("AudioRecord: buffer size in frames: ", this.audioRecord.getBufferSizeInFrames()));
    }

    private int logRecordingConfigurations(boolean z) {
        int i = 0;
        if (this.audioRecord != null) {
            List<AudioRecordingConfiguration> activeRecordingConfigurations = this.audioManager.getActiveRecordingConfigurations();
            i = activeRecordingConfigurations.size();
            JQx.A1O("Number of active recording sessions: ", i, TAG);
            if (i > 0) {
                logActiveRecordingConfigs(this.audioRecord.getAudioSessionId(), activeRecordingConfigurations);
                if (z) {
                    this.audioSourceMatchesRecordingSession = verifyAudioConfig(this.audioRecord.getAudioSource(), this.audioRecord.getAudioSessionId(), this.audioRecord.getFormat(), this.audioRecord.getRoutedDevice(), activeRecordingConfigurations);
                    this.isAudioConfigVerified = true;
                }
            }
        }
        return i;
    }

    private native void nativeCacheDirectBufferAddress(long j, ByteBuffer byteBuffer);

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeDataIsRecorded(long j, int i, long j2);

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
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordError(str);
        }
    }

    private void reportWebRtcAudioRecordInitError(String str) {
        Logging.e(TAG, 0Pz.A0W("Init recording error: ", str));
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordInitError(str);
        }
    }

    private void reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode audioRecordStartErrorCode, String str) {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Start recording error: ");
        A0k.append(audioRecordStartErrorCode);
        Logging.e(TAG, 1BL.A0u(". ", str, A0k));
        WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        logRecordingConfigurations(false);
        JavaAudioDeviceModule.AudioRecordErrorCallback audioRecordErrorCallback = this.errorCallback;
        if (audioRecordErrorCallback != null) {
            audioRecordErrorCallback.onWebRtcAudioRecordStartError(audioRecordStartErrorCode, str);
        }
    }

    private void scheduleLogRecordingConfigurationsTask() {
        Logging.d(TAG, "scheduleLogRecordingConfigurationsTask");
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
        }
        this.executor = Executors.newSingleThreadScheduledExecutor();
        Callable callable = new Callable() { // from class: org.webrtc.audio.WebRtcAudioRecord$$ExternalSyntheticLambda0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return WebRtcAudioRecord.this.m11296xd3061741();
            }
        };
        ScheduledFuture scheduledFuture = this.future;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.future.cancel(true);
        }
        this.future = this.executor.schedule(callable, 100, TimeUnit.MILLISECONDS);
    }

    private boolean startRecording() {
        Logging.d(TAG, "startRecording");
        assertTrue(AnonymousClass001.A1T(this.audioRecord));
        assertTrue(AnonymousClass001.A1U(this.audioThread));
        try {
            this.audioRecord.startRecording();
            if (this.audioRecord.getRecordingState() != 3) {
                reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_STATE_MISMATCH, 0Pz.A0T("AudioRecord.startRecording failed - incorrect state: ", this.audioRecord.getRecordingState()));
                return false;
            }
            AudioRecordThread audioRecordThread = new AudioRecordThread("AudioRecordJavaThread");
            this.audioThread = audioRecordThread;
            audioRecordThread.start();
            scheduleLogRecordingConfigurationsTask();
            return true;
        } catch (IllegalStateException e) {
            reportWebRtcAudioRecordStartError(JavaAudioDeviceModule.AudioRecordStartErrorCode.AUDIO_RECORD_START_EXCEPTION, 0Pz.A1B("AudioRecord.startRecording failed: ", e));
            return false;
        }
    }

    private boolean stopRecording() {
        Logging.d(TAG, "stopRecording");
        assertTrue(AnonymousClass001.A1T(this.audioThread));
        ScheduledFuture scheduledFuture = this.future;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isDone()) {
                this.future.cancel(true);
            }
            this.future = null;
        }
        ScheduledExecutorService scheduledExecutorService = this.executor;
        if (scheduledExecutorService != null) {
            scheduledExecutorService.shutdownNow();
            this.executor = null;
        }
        this.audioThread.stopThread();
        if (!ThreadUtils.joinUninterruptibly(this.audioThread, 2000L)) {
            Logging.e(TAG, "Join of AudioRecordJavaThread timed out");
            WebRtcAudioUtils.logAudioState(TAG, this.context, this.audioManager);
        }
        this.audioThread = null;
        this.effects.release();
        releaseAudioResources();
        return true;
    }

    public static boolean verifyAudioConfig(int i, int i2, AudioFormat audioFormat, AudioDeviceInfo audioDeviceInfo, List list) {
        assertTrue(!list.isEmpty());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioRecordingConfiguration audioRecordingConfiguration = (AudioRecordingConfiguration) it.next();
            AudioDeviceInfo audioDevice = audioRecordingConfiguration.getAudioDevice();
            if (audioDevice != null && audioRecordingConfiguration.getClientAudioSource() == i && audioRecordingConfiguration.getClientAudioSessionId() == i2 && audioRecordingConfiguration.getClientFormat().getEncoding() == audioFormat.getEncoding() && audioRecordingConfiguration.getClientFormat().getSampleRate() == audioFormat.getSampleRate() && audioRecordingConfiguration.getClientFormat().getChannelMask() == audioFormat.getChannelMask() && audioRecordingConfiguration.getClientFormat().getChannelIndexMask() == audioFormat.getChannelIndexMask() && audioRecordingConfiguration.getFormat().getEncoding() != 0 && audioRecordingConfiguration.getFormat().getSampleRate() > 0 && (audioRecordingConfiguration.getFormat().getChannelMask() != 0 || audioRecordingConfiguration.getFormat().getChannelIndexMask() != 0)) {
                if (checkDeviceMatch(audioDevice, audioDeviceInfo)) {
                    Logging.d(TAG, "verifyAudioConfig: PASS");
                    return true;
                }
            }
        }
        Logging.e(TAG, "verifyAudioConfig: FAILED");
        return false;
    }

    public boolean isAcousticEchoCancelerSupported() {
        return this.isAcousticEchoCancelerSupported;
    }

    public boolean isAudioConfigVerified() {
        return this.isAudioConfigVerified;
    }

    public boolean isAudioSourceMatchingRecordingSession() {
        if (this.isAudioConfigVerified) {
            return this.audioSourceMatchesRecordingSession;
        }
        Logging.w(TAG, "Audio configuration has not yet been verified");
        return false;
    }

    public boolean isNoiseSuppressorSupported() {
        return this.isNoiseSuppressorSupported;
    }

    /* renamed from: lambda$scheduleLogRecordingConfigurationsTask$0$org-webrtc-audio-WebRtcAudioRecord, reason: not valid java name */
    public /* synthetic */ String m11296xd3061741() {
        logRecordingConfigurations(true);
        return "Scheduled task is done";
    }

    public void setMicrophoneMute(boolean z) {
        Logging.w(TAG, 0Pz.A19("setMicrophoneMute(", ")", z));
        this.microphoneMute = z;
    }

    public void setNativeAudioRecord(long j) {
        this.nativeAudioRecord = j;
    }
}
