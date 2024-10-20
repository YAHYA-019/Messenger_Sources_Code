package com.facebook.profilo.provider.threadlifecycle;

import X.0FI;
import X.0Gw;
import X.C0lu;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import com.facebook.profilo.mmapbuf.core.Buffer;

/* loaded from: ThreadLifecycleProvider.class */
public final class ThreadLifecycleProvider extends C0lu {
    public static final int PROVIDER_THREADS = ProvidersRegistry.A00.A02("thread_lifecycle");
    public boolean mTracing;

    public ThreadLifecycleProvider() {
        super("profilo_thread_lifecycle");
    }

    public static native void nativeStartProfiling(MultiBufferLogger multiBufferLogger, String str, String str2, boolean z, boolean z2);

    public static native void nativeStopProfiling();

    @Override // X.C0lu
    public void disable() {
        0FI.A09(-307049239, 0FI.A03(58540697));
    }

    @Override // X.C0lu
    public void enable() {
        0FI.A09(1687708055, 0FI.A03(-601805988));
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return PROVIDER_THREADS;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        int i = PROVIDER_THREADS;
        if (!TraceEvents.isEnabled(i)) {
            i = 0;
        }
        return i;
    }

    @Override // X.C0lu
    public void onTraceEnded(TraceContext traceContext, 0Gw r303) {
        int i;
        synchronized (this) {
            int A03 = 0FI.A03(-1756914383);
            if (this.mTracing) {
                nativeStopProfiling();
                this.mTracing = false;
                i = 2032426037;
            } else {
                i = 2040742512;
            }
            0FI.A09(i, A03);
        }
    }

    @Override // X.C0lu
    public void onTraceStarted(TraceContext traceContext, 0Gw r303) {
        String str;
        int i;
        synchronized (this) {
            int A03 = 0FI.A03(-432367486);
            super.onTraceStarted(traceContext, r303);
            if (this.mTracing) {
                i = -575756378;
            } else {
                boolean z = false;
                boolean A02 = traceContext == null ? false : traceContext.A08.A02("provider.thread_lifecycle.capture_stacks", false);
                if (traceContext != null && traceContext.A08.A02("provider.thread_lifecycle.mixed_stack", false)) {
                    z = true;
                }
                String str2 = null;
                if (A02 && traceContext != null) {
                    Buffer buffer = traceContext.A09;
                    if (buffer.getFilePath() != null) {
                        str2 = buffer.generateMemoryMappingFilePath();
                        str = buffer.generateLocalSymbolsFilePath();
                        nativeStartProfiling(A05(), str2, str, A02, z);
                        this.mTracing = true;
                        i = 1786176923;
                    }
                }
                str = null;
                nativeStartProfiling(A05(), str2, str, A02, z);
                this.mTracing = true;
                i = 1786176923;
            }
            0FI.A09(i, A03);
        }
    }
}
