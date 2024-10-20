package org.webrtc.audio;

import X.0Pz;
import X.AnonymousClass001;
import X.JQx;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import org.webrtc.JniCommon;
import org.webrtc.Logging;

/* loaded from: JavaAudioDeviceModule.class */
public class JavaAudioDeviceModule implements AudioDeviceModule {
    public static final String TAG = "JavaAudioDeviceModule";
    public final WebRtcAudioRecord audioInput;
    public final AudioManager audioManager;
    public final WebRtcAudioTrack audioOutput;
    public final Context context;
    public final int inputSampleRate;
    public long nativeAudioDeviceModule;
    public final Object nativeLock;
    public final int outputSampleRate;
    public final boolean useStereoInput;
    public final boolean useStereoOutput;

    /* loaded from: JavaAudioDeviceModule$AudioRecordErrorCallback.class */
    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    /* loaded from: JavaAudioDeviceModule$AudioRecordStartErrorCode.class */
    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    /* loaded from: JavaAudioDeviceModule$AudioRecordStateCallback.class */
    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    /* loaded from: JavaAudioDeviceModule$AudioSamples.class */
    public class AudioSamples {
        public final int audioFormat;
        public final int channelCount;
        public final byte[] data;
        public final int sampleRate;

        public AudioSamples(int i, int i2, int i3, byte[] bArr) {
            this.audioFormat = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    /* loaded from: JavaAudioDeviceModule$AudioTrackErrorCallback.class */
    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    /* loaded from: JavaAudioDeviceModule$AudioTrackStartErrorCode.class */
    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    /* loaded from: JavaAudioDeviceModule$AudioTrackStateCallback.class */
    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    /* loaded from: JavaAudioDeviceModule$Builder.class */
    public class Builder {
        public AudioAttributes audioAttributes;
        public int audioFormat;
        public final AudioManager audioManager;
        public AudioRecordErrorCallback audioRecordErrorCallback;
        public AudioRecordStateCallback audioRecordStateCallback;
        public int audioSource;
        public AudioTrackErrorCallback audioTrackErrorCallback;
        public AudioTrackStateCallback audioTrackStateCallback;
        public final Context context;
        public int inputSampleRate;
        public int outputSampleRate;
        public SamplesReadyCallback samplesReadyCallback;
        public boolean useHardwareAcousticEchoCanceler;
        public boolean useHardwareNoiseSuppressor;
        public boolean useLowLatency;
        public boolean useStereoInput;
        public boolean useStereoOutput;

        public Builder(Context context) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = WebRtcAudioEffects.isAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = WebRtcAudioEffects.isNoiseSuppressorSupported();
            this.context = context;
            AudioManager A0T = JQx.A0T(context);
            this.audioManager = A0T;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(A0T);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(A0T);
            this.useLowLatency = false;
        }

        public AudioDeviceModule createAudioDeviceModule() {
            String str;
            String str2;
            Logging.d(JavaAudioDeviceModule.TAG, "createAudioDeviceModule");
            if (this.useHardwareNoiseSuppressor) {
                str = "HW NS will be used.";
            } else {
                if (WebRtcAudioEffects.isNoiseSuppressorSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC NS!");
                }
                str = "HW NS will not be used.";
            }
            Logging.d(JavaAudioDeviceModule.TAG, str);
            if (this.useHardwareAcousticEchoCanceler) {
                str2 = "HW AEC will be used.";
            } else {
                if (WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
                    Logging.d(JavaAudioDeviceModule.TAG, "Overriding default behavior; now using WebRTC AEC!");
                }
                str2 = "HW AEC will not be used.";
            }
            Logging.d(JavaAudioDeviceModule.TAG, str2);
            if (this.useLowLatency) {
                Logging.d(JavaAudioDeviceModule.TAG, "Low latency mode will be used.");
            }
            return new JavaAudioDeviceModule(this.context, this.audioManager, new WebRtcAudioRecord(this.context, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor), new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.useLowLatency), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes) {
            this.audioAttributes = audioAttributes;
            return this;
        }

        public Builder setAudioFormat(int i) {
            this.audioFormat = i;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback) {
            this.audioRecordErrorCallback = audioRecordErrorCallback;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback) {
            this.audioRecordStateCallback = audioRecordStateCallback;
            return this;
        }

        public Builder setAudioSource(int i) {
            this.audioSource = i;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback) {
            this.audioTrackErrorCallback = audioTrackErrorCallback;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback) {
            this.audioTrackStateCallback = audioTrackStateCallback;
            return this;
        }

        public Builder setInputSampleRate(int i) {
            Logging.d(JavaAudioDeviceModule.TAG, 0Pz.A0T("Input sample rate overridden to: ", i));
            this.inputSampleRate = i;
            return this;
        }

        public Builder setOutputSampleRate(int i) {
            Logging.d(JavaAudioDeviceModule.TAG, 0Pz.A0T("Output sample rate overridden to: ", i));
            this.outputSampleRate = i;
            return this;
        }

        public Builder setSampleRate(int i) {
            Logging.d(JavaAudioDeviceModule.TAG, 0Pz.A0T("Input/Output sample rate overridden to: ", i));
            this.inputSampleRate = i;
            this.outputSampleRate = i;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback) {
            this.samplesReadyCallback = samplesReadyCallback;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z) {
            if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW AEC not supported");
                z = false;
            }
            this.useHardwareAcousticEchoCanceler = z;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z) {
            if (z && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
                Logging.e(JavaAudioDeviceModule.TAG, "HW NS not supported");
                z = false;
            }
            this.useHardwareNoiseSuppressor = z;
            return this;
        }

        public Builder setUseLowLatency(boolean z) {
            this.useLowLatency = z;
            return this;
        }

        public Builder setUseStereoInput(boolean z) {
            this.useStereoInput = z;
            return this;
        }

        public Builder setUseStereoOutput(boolean z) {
            this.useStereoOutput = z;
            return this;
        }
    }

    /* loaded from: JavaAudioDeviceModule$SamplesReadyCallback.class */
    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    public JavaAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2) {
        this.nativeLock = AnonymousClass001.A0R();
        this.context = context;
        this.audioManager = audioManager;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i;
        this.outputSampleRate = i2;
        this.useStereoInput = z;
        this.useStereoOutput = z2;
    }

    public static Builder builder(Context context) {
        return new Builder(context);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    public static native long nativeCreateAudioDeviceModule(Context context, AudioManager audioManager, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2);

    @Override // org.webrtc.audio.AudioDeviceModule
    public long getNativeAudioDeviceModulePointer() {
        long j;
        synchronized (this.nativeLock) {
            j = this.nativeAudioDeviceModule;
            if (j == 0) {
                j = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
                this.nativeAudioDeviceModule = j;
            }
        }
        return j;
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void release() {
        synchronized (this.nativeLock) {
            long j = this.nativeAudioDeviceModule;
            if (j != 0) {
                JniCommon.nativeReleaseRef(j);
                this.nativeAudioDeviceModule = 0L;
            }
        }
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setMicrophoneMute(boolean z) {
        Logging.d(TAG, 0Pz.A1C("setMicrophoneMute: ", z));
        this.audioInput.setMicrophoneMute(z);
    }

    @Override // org.webrtc.audio.AudioDeviceModule
    public void setSpeakerMute(boolean z) {
        Logging.d(TAG, 0Pz.A1C("setSpeakerMute: ", z));
        this.audioOutput.setSpeakerMute(z);
    }
}
