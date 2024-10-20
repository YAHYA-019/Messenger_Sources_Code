package com.facebook.profilo.provider.stacktrace;

import X.0FI;
import X.0Gw;
import X.AnonymousClass001;
import X.C0lu;
import X.C0lw;
import android.app.Application;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: StackFrameThread.class */
public final class StackFrameThread extends C0lu {
    public static final int PROVIDER_NATIVE_STACK_TRACE;
    public static final int PROVIDER_STACK_FRAME;
    public static final int PROVIDER_WALL_TIME_STACK_TRACE;
    public final Context mContext;
    public volatile boolean mEnabled;
    public Thread mProfilerThread;
    public TraceContext mSavedTraceContext;
    public int mSystemClockTimeIntervalMs;

    static {
        C0lw c0lw = ProvidersRegistry.A00;
        PROVIDER_STACK_FRAME = c0lw.A02("stack_trace");
        PROVIDER_WALL_TIME_STACK_TRACE = c0lw.A02("wall_time_stack_trace");
        PROVIDER_NATIVE_STACK_TRACE = c0lw.A02("native_stack_trace");
    }

    public StackFrameThread(Context context) {
        super("profilo_stacktrace");
        this.mSystemClockTimeIntervalMs = -1;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null && (context instanceof Application)) {
            this.mContext = context;
        } else {
            this.mContext = applicationContext;
        }
    }

    private void logAnnotation(String str, String str2) {
        MultiBufferLogger A05 = A05();
        A05.writeBytesEntry(0, 57, A05.writeBytesEntry(0, 56, A05.writeStandardEntry(6, 52, 0L, 0, 0, 0, 0L), str), str2);
    }

    public static native int nativeCpuClockResolutionMicros();

    /* JADX WARN: Type inference failed for: r0v18, types: [java.lang.Throwable, java.lang.Thread] */
    @Override // X.C0lu
    public void disable() {
        int i;
        int A03 = 0FI.A03(-1136144109);
        if (this.mEnabled) {
            this.mSavedTraceContext = null;
            this.mEnabled = false;
            synchronized (CPUProfiler.class) {
                if (CPUProfiler.sInitialized) {
                    CPUProfiler.nativeStopProfiling();
                }
            }
            ?? r0 = this.mProfilerThread;
            if (r0 != 0) {
                try {
                    r0.join();
                    this.mProfilerThread = null;
                } catch (InterruptedException unused) {
                    RuntimeException A0U = AnonymousClass001.A0U(r0);
                    0FI.A09(-831141173, A03);
                    throw A0U;
                }
            }
            i = -1057524221;
        } else {
            this.mProfilerThread = null;
            i = 1610381143;
        }
        0FI.A09(i, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x0416, code lost:
    
        if (r0 == 2) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x034a, code lost:
    
        if (r305 != false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x046c, code lost:
    
        if (r330 == false) goto L171;
     */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0437  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x045f  */
    @Override // X.C0lu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void enable() {
        /*
            Method dump skipped, instructions count: 1339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.enable():void");
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return PROVIDER_NATIVE_STACK_TRACE | PROVIDER_STACK_FRAME | PROVIDER_WALL_TIME_STACK_TRACE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0035, code lost:
    
        if ((r0 & r306) != 0) goto L10;
     */
    @Override // X.C0lu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int getTracingProviders() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.profilo.ipc.TraceContext r0 = r0.mSavedTraceContext
            r302 = r0
            r0 = r301
            boolean r0 = r0.mEnabled
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r303
            if (r0 == 0) goto L48
            r0 = r302
            if (r0 == 0) goto L48
            r0 = r302
            int r0 = r0.A02
            r305 = r0
            int r0 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_WALL_TIME_STACK_TRACE
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L38
            int r0 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_STACK_FRAME
            r306 = r0
            r0 = r305
            r1 = r306
            r0 = r0 & r1
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3d
        L38:
            r0 = 0
            r1 = r306
            r0 = r0 | r1
            r304 = r0
        L3d:
            int r0 = com.facebook.profilo.provider.stacktrace.StackFrameThread.PROVIDER_NATIVE_STACK_TRACE
            r303 = r0
            r0 = r305
            r1 = r303
            r0 = r0 & r1
            r1 = r304
            r0 = r0 | r1
            return r0
        L48:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.stacktrace.StackFrameThread.getTracingProviders():int");
    }

    @Override // X.C0lu
    public void onTraceEnded(TraceContext traceContext, 0Gw r303) {
        int i;
        int A03 = 0FI.A03(-80213858);
        int i2 = traceContext.A02;
        int i3 = PROVIDER_STACK_FRAME;
        int i4 = PROVIDER_WALL_TIME_STACK_TRACE;
        if ((i2 & (i3 | i4)) != 0) {
            logAnnotation("provider.stack_trace.art_compatibility", Boolean.toString(ArtCompatibility.isCompatible(this.mContext)));
            int i5 = traceContext.A02;
            int i6 = 0;
            if (((i3 | i4) & i5) != 0) {
                i6 = 32752;
            }
            if ((i5 & PROVIDER_NATIVE_STACK_TRACE) != 0) {
                i6 |= 4;
            }
            synchronized (CPUProfiler.class) {
                i = CPUProfiler.sAvailableTracers;
            }
            logAnnotation("provider.stack_trace.tracers", Integer.toBinaryString(i6 & i));
        }
        if ((traceContext.A02 & getSupportedProviders()) != 0) {
            logAnnotation("provider.stack_trace.cpu_timer_res_us", Integer.toString(nativeCpuClockResolutionMicros()));
        }
        0FI.A09(1439812052, A03);
    }

    @Override // X.C0lu
    public void onTraceStarted(TraceContext traceContext, 0Gw r303) {
        int A03 = 0FI.A03(-51282705);
        if (CPUProfiler.sInitialized) {
            CPUProfiler.nativeResetFrameworkNamesSet();
        }
        0FI.A09(2081947076, A03);
    }
}
