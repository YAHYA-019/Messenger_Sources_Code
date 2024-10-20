package com.facebook.profilo.provider.systemcounters;

import X.0FI;
import X.0Si;
import X.0mZ;
import X.0uL;
import X.C0T8;
import X.C0lu;
import X.C0lw;
import X.C0ma;
import android.os.Debug;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import com.facebook.jni.HybridData;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: SystemCounterThread.class */
public final class SystemCounterThread extends C0lu {
    public static final int PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    public static final int PROVIDER_SYSTEM_COUNTERS;
    public boolean mAllThreadsMode;
    public final 0Si mCounterCollector;
    public boolean mEnabled;
    public Handler mHandler;
    public HandlerThread mHandlerThread;
    public volatile boolean mHighFrequencyMode;
    public HybridData mHybridData;
    public 0mZ mSystemCounterLogger;

    static {
        C0lw c0lw = ProvidersRegistry.A00;
        PROVIDER_SYSTEM_COUNTERS = c0lw.A02("system_counters");
        PROVIDER_HIGH_FREQ_THREAD_COUNTERS = c0lw.A02("high_freq_main_thread_counters");
    }

    public SystemCounterThread() {
        this(null);
    }

    public SystemCounterThread(0Si r302) {
        super("profilo_systemcounters");
        this.mCounterCollector = r302;
        this.mSystemCounterLogger = new 0mZ(A05());
    }

    private native HybridData initHybrid(MultiBufferLogger multiBufferLogger);

    public static native void nativeAddToWhitelist(int i);

    public static native void nativeRemoveFromWhitelist(int i);

    @Override // X.C0lu
    public void disable() {
        synchronized (this) {
            int A03 = 0FI.A03(493192633);
            if (this.mEnabled) {
                this.mSystemCounterLogger.A02();
                if (this.mAllThreadsMode) {
                    logCounters();
                    logExpensiveCounters();
                }
                if (this.mHighFrequencyMode) {
                    logHighFrequencyThreadCounters();
                    logTraceAnnotations();
                }
            }
            this.mEnabled = false;
            this.mAllThreadsMode = false;
            this.mHighFrequencyMode = false;
            nativeSetHighFrequencyMode(false);
            HybridData hybridData = this.mHybridData;
            if (hybridData != null) {
                hybridData.resetNative();
                this.mHybridData = null;
            }
            HandlerThread handlerThread = this.mHandlerThread;
            if (handlerThread != null) {
                handlerThread.quit();
                this.mHandlerThread = null;
            }
            this.mHandler = null;
            Debug.stopAllocCounting();
            0FI.A09(1054018765, A03);
        }
    }

    @Override // X.C0lu
    public void enable() {
        synchronized (this) {
            int A03 = 0FI.A03(-158531286);
            this.mHybridData = initHybrid(A05());
            this.mEnabled = true;
            if (this.mHandler == null) {
                HandlerThread handlerThread = new HandlerThread("Prflo:Counters");
                C0T8.A00(handlerThread);
                this.mHandlerThread = handlerThread;
                handlerThread.start();
                this.mHandler = new 0uL(this.mHandlerThread.getLooper(), this, 1);
            }
            TraceContext traceContext = this.A00;
            if (TraceEvents.isEnabled(PROVIDER_SYSTEM_COUNTERS)) {
                this.mHighFrequencyMode = false;
                nativeSetHighFrequencyMode(false);
                this.mAllThreadsMode = true;
                Debug.startAllocCounting();
                0mZ r0 = this.mSystemCounterLogger;
                r0.A00 = 0L;
                r0.A01 = 0L;
                r0.A04 = 0L;
                r0.A05 = 0L;
                r0.A02 = 0L;
                r0.A03 = 0L;
                r0.A06 = 0L;
                r0.A07 = 0L;
                r0.A08 = 0L;
                r0.A09 = 0L;
                int i = 50;
                if (traceContext != null) {
                    i = traceContext.A08.A00("provider.system_counters.sampling_rate_ms", 50);
                }
                this.mHandler.obtainMessage(1, i, 0).sendToTarget();
                int i2 = 1000;
                if (traceContext != null) {
                    i2 = traceContext.A08.A00("provider.system_counters.expensive_sampling_rate_ms", 1000);
                }
                this.mHandler.obtainMessage(3, i2, 0).sendToTarget();
            }
            if (TraceEvents.isEnabled(PROVIDER_HIGH_FREQ_THREAD_COUNTERS)) {
                C0ma.A00(Process.myPid());
                this.mHighFrequencyMode = true;
                nativeSetHighFrequencyMode(true);
                int i3 = 7;
                if (traceContext != null) {
                    i3 = traceContext.A08.A00("provider.high_freq_main_thread_counters.sampling_rate_ms", 7);
                }
                this.mHandler.obtainMessage(2, i3, 0).sendToTarget();
            }
            0FI.A09(-1242989419, A03);
        }
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return PROVIDER_SYSTEM_COUNTERS | PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        int i = 0;
        if (this.mEnabled) {
            if (this.mAllThreadsMode) {
                i = 0 | PROVIDER_SYSTEM_COUNTERS;
            }
            if (this.mHighFrequencyMode) {
                i |= PROVIDER_HIGH_FREQ_THREAD_COUNTERS;
            }
        }
        return i;
    }

    public native void logCounters();

    public native void logExpensiveCounters();

    public native void logHighFrequencyThreadCounters();

    public native void logTraceAnnotations();

    public native void nativeSetHighFrequencyMode(boolean z);
}
