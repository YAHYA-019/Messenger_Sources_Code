package com.facebook.cameracore.audiograph;

import X.0Pz;
import X.0S2;
import X.0fH;
import X.1BK;
import X.7zO;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.DKC;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GcK;
import X.GcL;
import X.Gty;
import X.H9A;
import X.HDP;
import X.HJT;
import X.HOm;
import X.HOp;
import X.HWl;
import X.HlS;
import X.Hr3;
import X.HrU;
import X.HzP;
import X.I5F;
import X.I8p;
import X.IA4;
import X.ICK;
import X.IEE;
import X.IN6;
import X.INF;
import X.IcD;
import X.IcK;
import X.Inp;
import X.IvG;
import X.Iza;
import X.JCg;
import X.JE2;
import X.JIk;
import X.JNN;
import X.JQ8;
import X.JQ9;
import X.LBz;
import X.Qyz;
import X.SAO;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.jni.HybridData;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: AudioPipelineImpl.class */
public class AudioPipelineImpl implements JNN {
    public static boolean sIsNativeLibLoaded;
    public final Hr3 mAudioDebugCallback;
    public final HOm mAudioMixingCallback;
    public HrU mAudioOutputCallback;
    public final Handler mAudioPipelineHandler;
    public volatile Handler mAudioPlayerThread;
    public ICK mAudioRecorder;
    public INF mAudioRecorderCallback;
    public volatile Handler mAudioRecorderThread;
    public I8p mAudioRenderPerfStats;
    public volatile AudioTrack mAudioTrack;
    public final int mBufferSizeInSamples;
    public HybridData mHybridData;
    public boolean mIsManuallyProcessingGraph;
    public final JQ8 mMobileConfigComponent;
    public int mPlatformNumChannels;
    public final HlS mPlatformOutputErrorCallback;
    public int mPlatformSampleType;
    public volatile JIk mStartInputCallback;
    public volatile Handler mStartInputHandler;
    public volatile JIk mStopInputCallback;
    public volatile Handler mStopInputHandler;
    public final HJT mThreadPool;
    public final boolean mXplatControlsStartInput;
    public static final boolean IS_UNIT_TEST = GOo.A1T();
    public static final IcD sEmptyStateCallback = new Object();
    public static final JE2 sEmptyAudioPerfStatsProvider = new IN6();
    public final Object mAudioTrackLock = AnonymousClass001.A0R();
    public final AtomicBoolean mDestructed = 7zO.A15();
    public final AtomicBoolean mStopped = DKC.A1E(true);
    public final int mGraphSampleRate = 44100;

    public AudioPipelineImpl(int i, int i2, JQ8 jq8, int i3, HOm hOm, Hr3 hr3, HlS hlS, JCg jCg, Handler handler, HJT hjt) {
        this.mBufferSizeInSamples = i;
        this.mThreadPool = hjt;
        this.mAudioPipelineHandler = handler;
        this.mAudioMixingCallback = hOm;
        this.mAudioDebugCallback = hr3;
        this.mMobileConfigComponent = jq8;
        this.mPlatformOutputErrorCallback = hlS;
        this.mXplatControlsStartInput = jq8.BSa(72);
        if (IS_UNIT_TEST) {
            return;
        }
        this.mHybridData = initHybrid(i, 44100.0f, 1000, true);
    }

    private void createAudioTrack(int i) {
        int i2;
        if (this.mAudioTrack != null) {
            this.mAudioTrack.release();
        }
        int i3 = this.mGraphSampleRate;
        int i4 = this.mPlatformNumChannels;
        if (i4 == 1) {
            i2 = 4;
        } else {
            if (i4 != 2) {
                throw AnonymousClass001.A0T("Out channel count not supported");
            }
            i2 = 12;
        }
        this.mAudioTrack = new AudioTrack(3, i3, i2, this.mPlatformSampleType, i, 1);
        this.mMobileConfigComponent.BSa(65);
        Integer valueOf = Integer.valueOf(this.mGraphSampleRate);
        Integer valueOf2 = Integer.valueOf(this.mPlatformNumChannels);
        int i5 = this.mPlatformSampleType;
        0fH.A0Y(valueOf, valueOf2, i5 != 2 ? 0Pz.A0T("Wrong enum ", i5) : "ENCODING_PCM_16BIT", Integer.valueOf(i), "AudioPipeline", "AudioTrack config sampleRate=%d numChannels=%d sampleType=%s bufferSizeInBytes=%d");
    }

    private native int createFbaProcessingGraphInternal(int i, int i2, boolean z);

    private native int createManualProcessingGraphInternal(int i, int i2);

    private native HybridData initHybrid(int i, float f, int i2, boolean z);

    public static void reportException(int i, String str, JIk jIk) {
        Gty gty = new Gty(str);
        gty.A03("fba_error_code", Qyz.A00(i));
        jIk.BwK(gty);
    }

    private native int startInputInternal();

    /* JADX INFO: Access modifiers changed from: private */
    public native int stopInputInternal();

    public int createFbaProcessingGraph(int i, int i2, HrU hrU) {
        this.mPlatformSampleType = 2;
        this.mPlatformNumChannels = i2;
        this.mIsManuallyProcessingGraph = false;
        this.mAudioOutputCallback = hrU;
        if (IS_UNIT_TEST) {
            return 0;
        }
        return createFbaProcessingGraphInternal(3, i2, this.mMobileConfigComponent.BSc(68));
    }

    public int createManualProcessingGraph(int i, int i2, HrU hrU) {
        this.mPlatformSampleType = 2;
        this.mPlatformNumChannels = i2;
        this.mIsManuallyProcessingGraph = true;
        this.mAudioOutputCallback = hrU;
        if (IS_UNIT_TEST) {
            return 0;
        }
        return createManualProcessingGraphInternal(3, i2);
    }

    public int fillAudioBuffer(Inp inp) {
        if (this.mIsManuallyProcessingGraph) {
            ICK ick = this.mAudioRecorder;
            if (ick != null) {
                ick.A03(inp);
            }
            return 1;
        }
        int A00 = this.mBufferSizeInSamples * this.mPlatformNumChannels * LBz.A00(this.mPlatformSampleType);
        ByteBuffer byteBuffer = inp.A02;
        if (byteBuffer.capacity() < A00) {
            0fH.A0k("AudioPipeline", "Error when filling capture buffer, not enough space in it");
            return 1;
        }
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        int pullCaptureSinkQueue = pullCaptureSinkQueue(byteBuffer, A00);
        if (pullCaptureSinkQueue == 0) {
            HrU hrU = this.mAudioOutputCallback;
            if (hrU == null) {
                return 0;
            }
            hrU.A00(inp, this.mGraphSampleRate, this.mPlatformSampleType, this.mPlatformNumChannels, A00, elapsedRealtimeNanos);
            return 0;
        }
        if (pullCaptureSinkQueue == 20) {
            0fH.A0l("AudioPipeline", "Empty capture sink queue");
            return 1;
        }
        0fH.A14("AudioPipeline", "Error when pulling capture queue sink = %s", new Object[]{Qyz.A00(pullCaptureSinkQueue)});
        return 1;
    }

    public native AudioGraphClientProvider getAudioGraphClientProvider();

    public native String getDebugInfo();

    public native String getFBAProfileInfo(int i);

    public void handleAudioCallback(byte[] bArr, long j, long j2) {
        HrU hrU = this.mAudioOutputCallback;
        if (hrU != null) {
            hrU.A01(bArr, this.mGraphSampleRate, this.mPlatformSampleType, this.mPlatformNumChannels, j, j2);
        }
    }

    public void handleDebugEvent(String str) {
        IEE iee = this.mAudioDebugCallback.A00;
        0fH.A0g(str, "AudioPipelineController", "DebugEvent: %s");
        HashMap A00 = HzP.A00(iee.A09, iee.A0H, (JNN) null);
        A00.put("AP_FBADebugInfo", str);
        iee.A0K.BZb("audio_pipeline_method_exceeded_time", "AudioPipelineController", A00, GOn.A0B(iee));
    }

    public native boolean isSubgraphInserted();

    public native void onReceivedAudioMixingMode(int i);

    public void onSubgraphInserted() {
        HWl hWl = this.mAudioDebugCallback.A00.A0J;
        if (hWl != null) {
            JQ9 jq9 = hWl.A00;
            List Ajf = jq9.AbM().Ajf();
            jq9.B0E().updateAnnotation(!Ajf.isEmpty() ? (String) 1BK.A0r(Ajf) : "", "subgraph_inserted", String.valueOf(Ajf.size()));
        }
    }

    public native int pause();

    public void prepareRecorder(I5F i5f, JE2 je2, Handler handler, JIk jIk, Handler handler2) {
        HDP hdp;
        synchronized (this) {
            if (i5f.A03 != this.mGraphSampleRate) {
                new HDP(22002, "Requested sample rate does not match graph");
            } else {
                int i = i5f.A01;
                int i2 = this.mPlatformSampleType;
                if (i != i2) {
                    new HDP(22002, "Requested PCM encoding does not match graph callback");
                } else {
                    int bitCount = Integer.bitCount(i5f.A00);
                    int i3 = this.mPlatformNumChannels;
                    if (bitCount != i3) {
                        new HDP(22002, "Requested number of channels does not match graph callback");
                    } else if (i5f.A02 != this.mBufferSizeInSamples * i3 * LBz.A00(i2)) {
                        new HDP(22002, "Requested samples per frame does not match graph");
                    } else {
                        if (this.mIsManuallyProcessingGraph) {
                            if (this.mAudioRecorder == null) {
                                INF inf = new INF(this);
                                this.mAudioRecorderCallback = inf;
                                this.mAudioRecorder = new ICK(handler, je2, i5f, inf, this.mMobileConfigComponent.AeY(1004), this.mMobileConfigComponent.Am8(21), this.mMobileConfigComponent.BSc(68));
                                this.mMobileConfigComponent.BSa(65);
                            } else {
                                0fH.A0j("AudioPipeline", "prepareRecorder - AudioRecorder already created");
                                0fH.A0g(i5f.toString(), "AudioPipeline", "prepareRecorder - video recording config requested: %s");
                            }
                            if (this.mAudioRecorder.A0F == 0S2.A00) {
                                ICK ick = this.mAudioRecorder;
                                ick.A09.A02("pARc");
                                ICK.A01(handler2, ick);
                                ick.A06.post(new Iza(handler2, ick, jIk));
                            }
                        }
                        jIk.onSuccess();
                    }
                }
            }
            jIk.BwK(hdp);
        }
    }

    public native int processAndPullSpeaker(byte[] bArr, int i);

    public native int processAndPullSpeakerWithByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processByteBuffer(ByteBuffer byteBuffer, int i);

    public native int processData(byte[] bArr, int i);

    public native int pullCaptureSinkQueue(ByteBuffer byteBuffer, int i);

    public void release() {
        if (GOp.A1a(this.mDestructed)) {
            ICK ick = this.mAudioRecorder;
            if (ick != null) {
                ick.A05(sEmptyStateCallback, this.mAudioPipelineHandler);
                this.mAudioRecorder = null;
            }
            stopPlatformOutput();
            HybridData hybridData = this.mHybridData;
            if (hybridData != null) {
                hybridData.resetNative();
                this.mHybridData = null;
            }
            this.mAudioRecorderCallback = null;
            this.mAudioOutputCallback = null;
        }
    }

    public native int resume();

    public boolean setAudioMixing(int i) {
        HOm hOm = this.mAudioMixingCallback;
        hOm.A00.A0A.postDelayed(new IvG(hOm, i), 500L);
        return true;
    }

    public String snapshot() {
        ICK ick = this.mAudioRecorder;
        if (ick != null) {
            return ick.A09.A01();
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0175, code lost:
    
        if (r321 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x01b1, code lost:
    
        if (r315 != 12) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0237, code lost:
    
        if (r315 != 12) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void startInput(X.JIk r302, android.os.Handler r303) {
        /*
            Method dump skipped, instructions count: 628
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.audiograph.AudioPipelineImpl.startInput(X.JIk, android.os.Handler):void");
    }

    public int startPlatformInput() {
        int i;
        I8p i8p;
        if (!this.mXplatControlsStartInput) {
            return 0;
        }
        JIk jIk = this.mStartInputCallback;
        Handler handler = this.mStartInputHandler;
        this.mStartInputCallback = null;
        this.mStartInputHandler = null;
        if (jIk == null || handler == null) {
            H9A h9a = I5F.A05;
            int i2 = this.mGraphSampleRate;
            int i3 = this.mPlatformSampleType;
            int i4 = this.mPlatformNumChannels;
            if (i4 == 1) {
                i = 16;
            } else {
                if (i4 != 2) {
                    throw AnonymousClass001.A0T("Channel count not supported");
                }
                i = 12;
            }
            I5F i5f = new I5F(h9a, i, i3, this.mBufferSizeInSamples * i4 * LBz.A00(i3), i2);
            Handler A00 = IA4.A00((Handler.Callback) null, IA4.A02, "audio_recorder", -19);
            prepareRecorder(i5f, sEmptyAudioPerfStatsProvider, A00, sEmptyStateCallback, this.mAudioPipelineHandler);
            this.mAudioRecorderThread = A00;
        }
        if (this.mAudioRecorder == null || this.mAudioRecorderCallback == null) {
            if (jIk == null) {
                return 34;
            }
            jIk.BwK(new Gty("AudioRecorder not created. Cannot start input."));
            return 0;
        }
        HrU hrU = this.mAudioOutputCallback;
        if (hrU != null) {
            boolean isSubgraphInserted = IS_UNIT_TEST ? false : isSubgraphInserted();
            HOp hOp = hrU.A00;
            if (hOp != null && (i8p = hOp.A00.A0E) != null) {
                i8p.A09 = isSubgraphInserted;
            }
        }
        INF.A00(this);
        this.mStopped.set(false);
        0fH.A0j("AudioPipeline", "audio pipeline starting the audio recorder");
        ICK ick = this.mAudioRecorder;
        IcK icK = new IcK(this, jIk, 1);
        if (handler == null) {
            handler = this.mAudioPipelineHandler;
        }
        ick.A04(icK, handler);
        return 0;
    }

    /* JADX WARN: Finally extract failed */
    public int startPlatformOutput() {
        GcL gcK;
        0fH.A0j("AudioPipeline", "startPlatformOutput");
        int A00 = this.mBufferSizeInSamples * this.mPlatformNumChannels * LBz.A00(this.mPlatformSampleType);
        if (this.mMobileConfigComponent.BSc(68)) {
            0fH.A0j("AudioPipeline", "Using ByteBuffer for platform output");
            gcK = new GcL(this, A00);
        } else {
            0fH.A0j("AudioPipeline", "Using byte[] for platform output");
            gcK = new GcK(this, A00);
        }
        this.mAudioPlayerThread = IA4.A00((Handler.Callback) null, IA4.A02, "audio_player_thread", -19);
        int i = gcK.A00;
        long j = i;
        I8p i8p = new I8p((AbstractC2327GOs.A09(this.mPlatformSampleType, j, this.mPlatformNumChannels) / this.mGraphSampleRate) * 1000, this.mBufferSizeInSamples);
        this.mAudioRenderPerfStats = i8p;
        i8p.A09 = true;
        synchronized (this.mAudioTrackLock) {
            createAudioTrack(i);
            try {
                this.mAudioTrack.play();
            } catch (IllegalStateException unused) {
                createAudioTrack(i);
                try {
                    this.mAudioTrack.play();
                } catch (IllegalStateException unused2) {
                    try {
                        if (this.mAudioTrack != null) {
                            this.mAudioTrack.release();
                        }
                        this.mAudioTrack = null;
                        this.mPlatformOutputErrorCallback.A00(new Gty("Error with AudioTrack constructor or play()"));
                        return 34;
                    } catch (Throwable th) {
                        this.mAudioTrack = null;
                        throw th;
                    }
                }
            }
        }
        this.mAudioPlayerThread.post(new SAO(gcK, this));
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (r305 == 13) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0060, code lost:
    
        if (r305 != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void stopInput(X.JIk r302, android.os.Handler r303) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.cameracore.audiograph.AudioPipelineImpl.stopInput(X.JIk, android.os.Handler):void");
    }

    public int stopPlatformInput() {
        if (!this.mXplatControlsStartInput) {
            return 0;
        }
        JIk jIk = this.mStopInputCallback;
        Handler handler = this.mStopInputHandler;
        this.mStopInputCallback = null;
        this.mStopInputHandler = null;
        if (this.mAudioRecorder == null) {
            if (jIk == null) {
                return 0;
            }
            jIk.BwK(new Gty("AudioRecorder not created. Cannot stop input."));
            return 0;
        }
        this.mStopped.set(true);
        ICK ick = this.mAudioRecorder;
        IcK icK = new IcK(this, jIk, 2);
        if (handler == null) {
            handler = this.mAudioPipelineHandler;
        }
        ick.A05(icK, handler);
        INF inf = this.mAudioRecorderCallback;
        if (inf == null) {
            return 0;
        }
        this.mAudioDebugCallback.A00(inf.A00, inf.A01);
        INF.A00(this);
        return 0;
    }

    public int stopPlatformOutput() {
        0fH.A0j("AudioPipeline", "stopPlatformOutput");
        if (this.mAudioPlayerThread != null) {
            IA4.A01(this.mAudioPlayerThread, true, true);
            this.mAudioPlayerThread = null;
        }
        synchronized (this.mAudioTrackLock) {
            if (this.mAudioTrack != null) {
                I8p i8p = this.mAudioRenderPerfStats;
                if (i8p != null) {
                    i8p.A01 = this.mAudioTrack.getUnderrunCount();
                }
                this.mAudioTrack.release();
                this.mAudioTrack = null;
            }
            I8p i8p2 = this.mAudioRenderPerfStats;
            if (i8p2 != null) {
                i8p2.A08 = IS_UNIT_TEST ? "test" : getFBAProfileInfo(5);
                I8p i8p3 = this.mAudioRenderPerfStats;
                0fH.A13("AudioPipeline", "Avg processing time playback: %f [ms], frame size %.2f [ms] = %d samples, total number of frames processed %d,  was effect on: %b, was recording: %b,  num deadline missed %d, fbaProfileInfo %s", new Object[]{Float.valueOf(i8p3.A02()), GOp.A14((float) i8p3.A0C), Long.valueOf(i8p3.A0B), Long.valueOf(i8p3.A06), Boolean.valueOf(i8p3.A09), Boolean.valueOf(i8p3.A0A), Long.valueOf(i8p3.A01), i8p3.A08});
                Hr3 hr3 = this.mAudioDebugCallback;
                if (hr3 != null) {
                    hr3.A01(this.mAudioRenderPerfStats, false);
                }
                this.mAudioRenderPerfStats = null;
            }
        }
        return 0;
    }

    public native void updateOutputRouteState(int i);
}
