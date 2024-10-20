package com.facebook.cameracore.mediapipeline.services.audio.implementation;

import X.02W;
import X.0Pz;
import X.0fH;
import X.11I;
import X.11T;
import X.AbJ;
import X.AnonymousClass001;
import X.GOn;
import X.HWd;
import X.Hhz;
import X.I4w;
import X.I8p;
import X.QTO;
import X.Qnj;
import X.RHs;
import X.RKf;
import X.ROK;
import X.RYR;
import X.S6U;
import android.content.Context;
import android.media.AudioManager;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost;
import com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioRenderCallback;
import com.facebook.jni.HybridData;
import com.google.common.base.Platform;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Semaphore;

/* loaded from: AudioPlatformComponentHostImpl.class */
public class AudioPlatformComponentHostImpl extends AudioPlatformComponentHost {
    public String mAssetsDirectory;
    public RHs mAudioDecoder;
    public AudioInputPreview mAudioInputPreview;
    public HWd mAudioLogger;
    public final AudioManager mAudioManager;
    public volatile I4w mAudioPlayer;
    public volatile AudioServiceController mAudioServiceController;
    public final int mDefaultSampleRate;
    public short[] mInputSamples;
    public MicrophoneSink mMicrophoneSink;
    public final Semaphore mMicrophoneSinkSemaphore;
    public byte[] mOutputBytes;
    public short[] mOutputSamples;
    public AudioRenderCallback mRenderCallback;
    public Qnj mStreamType = Qnj.A01;
    public boolean mIsCaptureEnabled = true;
    public boolean mIsRecording = false;
    public boolean mIsEffectLoaded = false;
    public boolean mIsServiceCreated = false;

    public AudioPlatformComponentHostImpl(Context context, Hhz hhz) {
        HybridData initHybrid = initHybrid();
        this.mHybridData = initHybrid;
        02W.A01(initHybrid, "%s > mHybridData is null", new Object[]{AudioPlatformComponentHostImpl.class});
        this.mAudioManager = (AudioManager) context.getApplicationContext().getSystemService("audio");
        int defaultSampleRate = (int) getDefaultSampleRate();
        this.mDefaultSampleRate = defaultSampleRate;
        this.mMicrophoneSinkSemaphore = new Semaphore(1, true);
        this.mInputSamples = new short[defaultSampleRate];
        this.mOutputSamples = new short[defaultSampleRate];
        this.mOutputBytes = new byte[defaultSampleRate * 2];
    }

    private native double getDefaultSampleRate();

    private native HybridData initHybrid();

    /* JADX INFO: Access modifiers changed from: private */
    public native void readAudioFileFinished(String str);

    /* JADX INFO: Access modifiers changed from: private */
    public native void readAudioFileReady(String str, short[] sArr, int i);

    /* JADX INFO: Access modifiers changed from: private */
    public native void readAudioFileStarted(String str, double d, boolean z);

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006e, code lost:
    
        if (r0 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0107, code lost:
    
        if (r0.isBluetoothA2dpOn() != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r0.isBluetoothA2dpOn() == false) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateAudioPreviewState() {
        /*
            Method dump skipped, instructions count: 310
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.updateAudioPreviewState():void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0027, code lost:
    
        if (r301.mIsCaptureEnabled == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void updateAudioState() {
        /*
            r301 = this;
            r0 = r301
            r0.updateAudioPreviewState()
            r0 = r301
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r0.mAudioServiceController
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L36
            r0 = r301
            boolean r0 = r0.mIsEffectLoaded
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2a
            r0 = r301
            boolean r0 = r0.mIsRecording
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L2a
            r0 = r301
            boolean r0 = r0.mIsCaptureEnabled
            r303 = r0
            r0 = 1
            r304 = r0
            r0 = r303
            if (r0 != 0) goto L2c
        L2a:
            r0 = 0
            r304 = r0
        L2c:
            r0 = r301
            com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioServiceController r0 = r0.mAudioServiceController
            r302 = r0
            r0 = r302
            r1 = r304
            r0.setCaptureEnabled(r1)
        L36:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.mediapipeline.services.audio.implementation.AudioPlatformComponentHostImpl.updateAudioState():void");
    }

    public AudioServiceController createAudioServiceController() {
        if (this.mAudioServiceController == null) {
            this.mAudioServiceController = new AudioServiceController();
        }
        return this.mAudioServiceController;
    }

    public MicrophoneSink createMicrophoneSink() {
        MicrophoneSink microphoneSink = this.mMicrophoneSink;
        if (microphoneSink == null) {
            microphoneSink = new MicrophoneSink();
            this.mMicrophoneSink = microphoneSink;
        }
        return microphoneSink;
    }

    public String findAssetPath(String str) {
        02W.A08(!Platform.stringIsNullOrEmpty(str), "%s > findAssetPath() > assetName is null or empty", AudioPlatformComponentHostImpl.class);
        String str2 = this.mAssetsDirectory;
        02W.A01(str2, "%s > findAssetPath() > mAssetsDirectory is null", new Object[]{AudioPlatformComponentHostImpl.class});
        String A0W = 0Pz.A0W(str2, str);
        try {
            QTO qto = new QTO(this, AnonymousClass001.A0E(str2).getCanonicalPath());
            try {
                11I r0 = new 11I();
                11T.A0F(A0W, 0);
                r0.A0C(qto, A0W, true);
                r0.A08();
                return A0W;
            } catch (SecurityException e) {
                0fH.A0S(AudioPlatformComponentHostImpl.class, e.getMessage() != null ? e.getMessage() : 0Pz.A0W("Asset path does not exist or is invalid: ", A0W), new Object[]{e.getCause(), e});
                return null;
            }
        } catch (IOException unused) {
            0fH.A0S(AudioPlatformComponentHostImpl.class, "Assets directory path does not exist or is invalid: %s", new Object[]{this.mAssetsDirectory});
            return null;
        }
    }

    public void onEffectLoaded(String str, boolean z) {
        02W.A08(this.mIsServiceCreated, "%s > onEffectLoaded() > service is not created yet", AudioPlatformComponentHostImpl.class);
        02W.A08(!this.mIsEffectLoaded, "%s > onEffectLoaded() > effect is already loaded", AudioPlatformComponentHostImpl.class);
        this.mAudioDecoder = new RHs();
        02W.A08(!Platform.stringIsNullOrEmpty(str), "%s > isDirectoryPathExistsAndValid() > path is null or empty", AudioPlatformComponentHostImpl.class);
        if (AnonymousClass001.A0E(str).isDirectory()) {
            String str2 = File.separator;
            if (!str.endsWith(str2)) {
                str = 0Pz.A0W(str, str2);
            }
            this.mAssetsDirectory = str;
        } else {
            0fH.A0S(AudioPlatformComponentHostImpl.class, "Could not set asset directory, path does not exist or valid: %s", new Object[]{str});
        }
        if (z) {
            this.mAudioInputPreview = new AudioInputPreview(this.mAudioServiceController, (int) getDefaultSampleRate());
            I4w i4w = this.mAudioPlayer;
            this.mAudioPlayer = null;
            if (i4w != null) {
                i4w.A02();
                i4w.A00.release();
            }
            02W.A01(this.mAudioInputPreview, "%s > createPreviewPlayer() > mAudioInputPreview is null", new Object[]{AudioPlatformComponentHostImpl.class});
            I4w i4w2 = new I4w(this.mAudioManager, this.mStreamType, this.mAudioLogger);
            AudioInputPreview audioInputPreview = this.mAudioInputPreview;
            int i = this.mDefaultSampleRate;
            audioInputPreview.getClass();
            i4w2.A01 = audioInputPreview;
            try {
                i4w2.A00.setPlaybackRate(i);
            } catch (IllegalStateException e) {
                0fH.A0s("AudioPlayer", "Failed to set playback rate for AudioPlayer in load()", e);
            }
            this.mAudioPlayer = i4w2;
        }
        this.mIsEffectLoaded = true;
        updateAudioState();
    }

    public void onEffectReleased() {
        if (this.mIsEffectLoaded) {
            this.mIsEffectLoaded = false;
            this.mAssetsDirectory = null;
            updateAudioState();
            I4w i4w = this.mAudioPlayer;
            this.mAudioPlayer = null;
            if (i4w != null) {
                i4w.A02();
                i4w.A00.release();
            }
            RHs rHs = this.mAudioDecoder;
            if (rHs != null) {
                synchronized (rHs) {
                    rHs.A01.shutdown();
                }
                this.mAudioDecoder = null;
            }
            AudioInputPreview audioInputPreview = this.mAudioInputPreview;
            if (audioInputPreview != null) {
                audioInputPreview.close();
                this.mAudioInputPreview = null;
            }
            this.mMicrophoneSinkSemaphore.acquireUninterruptibly();
            MicrophoneSink microphoneSink = this.mMicrophoneSink;
            if (microphoneSink != null) {
                microphoneSink.mHybridData.resetNative();
                this.mMicrophoneSink = null;
            }
            this.mMicrophoneSinkSemaphore.release();
        }
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost
    public boolean onInputDataAvailable(byte[] bArr, int i, int i2, int i3, int i4) {
        int readCaptureSamples;
        if (!this.mIsRecording) {
            return false;
        }
        if (this.mAudioServiceController == null) {
            0fH.A0E(AudioPlatformComponentHostImpl.class, "Service is already destroyed but buffers are still being pumped through");
            return false;
        }
        if (i4 < 0) {
            0fH.A0S(AudioPlatformComponentHostImpl.class, "Negative buffer size for input data: %d", AnonymousClass001.A1a(i4));
            return false;
        }
        if (i4 % 2 > 0) {
            0fH.A0S(AudioPlatformComponentHostImpl.class, "Odd buffer size for input data: %d", AnonymousClass001.A1a(i4));
        }
        int i5 = (i4 / 2) / i3;
        if (this.mMicrophoneSink != null) {
            short[] sArr = this.mInputSamples;
            if (sArr.length < i5 * i3) {
                sArr = new short[i5 * 2];
                this.mInputSamples = sArr;
            }
            int i6 = i5 * 2 * i3;
            02W.A04(AnonymousClass001.A1O(i6 % 2));
            int i7 = i6 / 2;
            02W.A04(sArr.length >= i7);
            ByteBuffer.wrap(bArr).order(ByteOrder.nativeOrder()).asShortBuffer().get(sArr, 0, i7);
            if (i3 == 2) {
                short[] sArr2 = this.mInputSamples;
                for (int i8 = 0; i8 < i7; i8++) {
                    sArr2[i8] = sArr2[i8 * 2];
                }
                while (i7 < i6) {
                    sArr2[i7] = 0;
                    i7++;
                }
            }
            if (this.mMicrophoneSinkSemaphore.tryAcquire()) {
                MicrophoneSink microphoneSink = this.mMicrophoneSink;
                if (microphoneSink != null) {
                    microphoneSink.write(this.mInputSamples, i5, i);
                }
                this.mMicrophoneSinkSemaphore.release();
            }
        }
        02W.A01(this.mRenderCallback, "%s > renderSamples() > mRenderCallback is null", new Object[]{AudioPlatformComponentHostImpl.class});
        if (this.mOutputSamples.length < i5 * i3) {
            this.mOutputSamples = new short[i5 * 2 * i3];
        }
        if (this.mAudioServiceController == null || (readCaptureSamples = this.mAudioServiceController.readCaptureSamples(this.mOutputSamples, i5, i)) == 0) {
            return false;
        }
        int i9 = readCaptureSamples * 2;
        int i10 = i9 * i3;
        byte[] bArr2 = this.mOutputBytes;
        if (bArr2.length < i10) {
            bArr2 = new byte[i10 * 2];
            this.mOutputBytes = bArr2;
        }
        if (i3 == 2) {
            short[] sArr3 = this.mOutputSamples;
            while (true) {
                i9--;
                if (i9 < 0) {
                    break;
                }
                sArr3[i9] = sArr3[i9 / 2];
            }
        }
        short[] sArr4 = this.mOutputSamples;
        int i11 = readCaptureSamples * i3;
        02W.A04(AbJ.A1U(bArr2.length, i11 * 2));
        ByteBuffer.wrap(bArr2).order(ByteOrder.nativeOrder()).asShortBuffer().put(sArr4, 0, i11);
        this.mRenderCallback.onSamplesReady(this.mOutputBytes, i, i2, i3, i10);
        return true;
    }

    public void onServiceCreated() {
        02W.A08(!this.mIsServiceCreated, "%s > onServiceCreated() > service is already created", AudioPlatformComponentHostImpl.class);
        02W.A01(this.mAudioServiceController, "%s > onServiceCreated() > mAudioServiceController is null", new Object[]{AudioPlatformComponentHostImpl.class});
        this.mIsServiceCreated = true;
    }

    public void onServiceDestroyed() {
        if (this.mIsServiceCreated) {
            02W.A08(!this.mIsEffectLoaded, "%s > onServiceDestroyed() > effect is not released yet", AudioPlatformComponentHostImpl.class);
            if (this.mAudioServiceController != null) {
                this.mAudioServiceController.mHybridData.resetNative();
            }
            this.mAudioServiceController = null;
            this.mIsServiceCreated = false;
        }
    }

    public void readAudioFile(String str, String str2, String str3) {
        02W.A01(this.mAudioDecoder, "%s > readAudioFile() > mAudioDecoder is null", new Object[]{AudioPlatformComponentHostImpl.class});
        if (str2 == null || str2.isEmpty()) {
            str2 = findAssetPath(str);
            if (str2 == null) {
                0fH.A0S(AudioPlatformComponentHostImpl.class, "Failed to read audio file: %s", new Object[]{str});
                return;
            }
        }
        RHs rHs = this.mAudioDecoder;
        RKf rKf = new RKf(this, str3);
        synchronized (rHs) {
            ExecutorService executorService = rHs.A01;
            if (executorService.isShutdown()) {
                0fH.A0S(AudioPlatformComponentHostImpl.class, "Fail to decode audio file: %s", new Object[]{0Pz.A0j("Cannot decode file ", str2, ": executor shut down")});
            } else {
                RYR ryr = rHs.A00;
                ROK rok = new ROK(rKf, str2);
                synchronized (ryr) {
                    ryr.A01.add(rok);
                }
                executorService.execute(new S6U(rHs));
            }
        }
    }

    public int readExternalAudioStream(String str, short[] sArr, int i) {
        02W.A08(!Platform.stringIsNullOrEmpty(str), "%s > readExternalAudioStream() > identifier is null or empty", AudioPlatformComponentHostImpl.class);
        return 0;
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost
    public void setMuted(boolean z) {
        updateAudioPreviewState();
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost
    public void startRecording(boolean z) {
        I8p i8p;
        HWd hWd;
        this.mIsRecording = true;
        I4w i4w = this.mAudioPlayer;
        if (i4w != null && (i8p = i4w.A02) != null) {
            Float valueOf = Float.valueOf(i8p.A02());
            float f = ((float) i8p.A0C) / 1000000.0f;
            Float valueOf2 = Float.valueOf(f);
            long j = i8p.A0B;
            HashMap A00 = I8p.A00(i8p, valueOf, valueOf2, Long.valueOf(j));
            if (i8p.A06 > 30 && (hWd = i4w.A03) != null) {
                A00.put("render_audio_avg_processing_time_ms", String.valueOf(i8p.A02()));
                long j2 = i8p.A01;
                if (j2 > -1) {
                    A00.put("render_audio_num_deadline_missed", String.valueOf(j2));
                }
                A00.put("render_audio_was_recording", String.valueOf(i8p.A0A));
                I8p.A01(i8p, A00, f);
                A00.put("render_audio_samples_per_frame", String.valueOf(j));
                hWd.A00.BZb("audio_pipeline_recording_started", "AudioPlayer", A00, GOn.A0B(i4w));
            }
            i8p.A03();
            i8p.A0A = true;
        }
        updateAudioState();
    }

    @Override // com.facebook.cameracore.mediapipeline.services.audio.interfaces.AudioPlatformComponentHost
    public void stopRecording() {
        this.mIsRecording = false;
        updateAudioState();
    }
}
