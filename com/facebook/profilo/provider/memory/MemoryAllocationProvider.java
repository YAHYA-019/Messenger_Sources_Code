package com.facebook.profilo.provider.memory;

import X.0FI;
import X.0Gw;
import X.0Zk;
import X.0cG;
import X.0kW;
import X.0kY;
import X.0mL;
import X.0mM;
import X.AnonymousClass001;
import X.C0ft;
import X.C0lu;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.io.File;
import java.io.IOException;
import java.lang.ref.ReferenceQueue;

/* loaded from: MemoryAllocationProvider.class */
public final class MemoryAllocationProvider extends C0lu implements 0mL {
    public static final int PROVIDER_MEMORY = ProvidersRegistry.A00.A02("memory_allocation");
    public 0Zk mDeallocationMonitor;
    public String mErrorMessage;
    public boolean mIsFileBackedBuffer;
    public 0mM mProviderTriggerMonitor;
    public boolean mRunning;
    public boolean mStarted;

    public MemoryAllocationProvider() {
        super("profilo_memory");
        this.mRunning = false;
        this.mStarted = false;
    }

    public static native void nativeAddPhantomReferenceLoop();

    public static native int nativeInitialize(Object obj, Object obj2, MultiBufferLogger multiBufferLogger, int i, int i2, int i3, int i4, int i5, boolean z, String str, int i6, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i7, int i8, boolean z7, boolean z8, int i9, String str2, boolean z9, int i10, String str3, boolean z10);

    public static native boolean nativeIsTracingEnabled();

    public static native void nativeRegisterDeallocation(long[] jArr, int i);

    public static native void nativeResetFrameworkNamesSet();

    public static native void nativeStartProfiling();

    public static native void nativeStopAddPhantomThread();

    public static native void nativeStopProfiling();

    private void startProfiling() {
        File file;
        synchronized (this) {
            if (this.mStarted) {
                return;
            }
            this.mStarted = true;
            0Zk r0 = this.mDeallocationMonitor;
            if (r0 != null) {
                ReferenceQueue referenceQueue = new ReferenceQueue();
                r0.A02 = referenceQueue;
                0kY r02 = new 0kY(r0, referenceQueue, 0Zk.A09.getAndIncrement());
                r0.A01 = r02;
                r02.start();
                0kW r03 = new 0kW(r0);
                r0.A00 = r03;
                r03.start();
            }
            nativeStartProfiling();
            if (!this.mIsFileBackedBuffer || C0ft.A04 == null || (file = C0ft.A04.A0B) == null) {
                return;
            }
            try {
                AnonymousClass001.A0D(file, "javamp").createNewFile();
            } catch (IOException unused) {
            }
        }
    }

    private void stopTraceIfRunning() {
        synchronized (this) {
            if (this.mRunning) {
                nativeStopProfiling();
                0Zk r0 = this.mDeallocationMonitor;
                if (r0 != null) {
                    0kY r02 = r0.A01;
                    if (r02 != null) {
                        r02.A01 = false;
                        r0.A01 = null;
                    }
                    if (r0.A00 != null) {
                        nativeStopAddPhantomThread();
                        r0.A00 = null;
                    }
                    this.mDeallocationMonitor = null;
                }
                this.mRunning = false;
                this.mStarted = false;
            }
            0mM r03 = this.mProviderTriggerMonitor;
            if (r03 != null) {
                r03.A01();
                this.mProviderTriggerMonitor = null;
            }
            synchronized (0cG.class) {
                0cG.A00 = false;
                0cG.A00();
            }
        }
    }

    @Override // X.C0lu
    public void disable() {
        int A03 = 0FI.A03(-526372287);
        stopTraceIfRunning();
        0FI.A09(502832503, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0491, code lost:
    
        r0.append(",(");
        r0 = r332;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x049d, code lost:
    
        r0.append(r332);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x04aa, code lost:
    
        r0.append("),");
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04b9, code lost:
    
        X.C0lu.A03(r0, X.C0lu.A04(r333) ? 1 : 0, r335);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04c0, code lost:
    
        r0.append(r336);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x04c8, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04d0, code lost:
    
        if (r337 == false) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04d3, code lost:
    
        r313 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04d8, code lost:
    
        r0.append(r313);
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x04f5, code lost:
    
        r0.A02(X.C0g6.A6J, X.C0gq.CRITICAL_REPORT, r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x04fc, code lost:
    
        X.0cG.A03 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0501, code lost:
    
        X.0cG.A00 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0504, code lost:
    
        X.0cG.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0509, code lost:
    
        monitor-exit(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x050c, code lost:
    
        if (r318 == false) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0567, code lost:
    
        if (nativeInitialize(r301.mDeallocationMonitor, r301, A05(), r307, r309, r311, r312, r315, r318, r331, r319, r320, r321, r322, r323, r325, r326, r327, r328, r329, r330, r332, r333, r335, r338, r337) != 0) goto L179;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x056c, code lost:
    
        if (r336 != 0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x056f, code lost:
    
        startProfiling();
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0584, code lost:
    
        r301.mProviderTriggerMonitor = new X.0mM(r301, r336);
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x058e, code lost:
    
        monitor-enter(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0590, code lost:
    
        X.0cG.A03 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0594, code lost:
    
        X.0cG.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0597, code lost:
    
        X.0cG.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x059c, code lost:
    
        monitor-exit(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x05a8, code lost:
    
        r316 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x05aa, code lost:
    
        X.0fH.A0u("MemoryAllocationProvider", "Exception while initializing java memory allocation provider.", r316);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x05bf, code lost:
    
        monitor-enter(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x05c0, code lost:
    
        X.0cG.A03 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x05c5, code lost:
    
        X.0cG.A00 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x05c8, code lost:
    
        X.0cG.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x051e, code lost:
    
        r301.mDeallocationMonitor = new X.0Zk(r301, r301, r324);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007c, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.track_deallocation", true) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x0247, code lost:
    
        if (r315 != 3) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x024c, code lost:
    
        if (r0 == null) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0251, code lost:
    
        if (r314 == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0254, code lost:
    
        r0 = r0.A09;
        r331 = r0.generateMemoryMappingFilePath();
        r338 = r0.generateLocalSymbolsFilePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x026c, code lost:
    
        r335 = r0.A08.A00("provider.memory_allocation.max_unwind_depth", 256);
        r336 = r0.A08.A00("provider.memory_allocation.when_to_start", 0);
        r337 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x02a1, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.log_allocation_failures", false) != false) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x02a7, code lost:
    
        r332 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01a5, code lost:
    
        r329 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01aa, code lost:
    
        if (r0 != null) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x01ad, code lost:
    
        r330 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x02c5, code lost:
    
        r326 = r0.A08.A00("provider.memory_allocation.async_unwinder_thread_priority", 0);
        r327 = r0.A08.A00("provider.memory_allocation.time_auto_process_refs", 0);
        r328 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x02f9, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.log_mapping_status_per_frame", false) != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0154, code lost:
    
        r325 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x016e, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.use_global_weak_ref", false) != false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0127, code lost:
    
        r323 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x012c, code lost:
    
        if (r0 == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00e5, code lost:
    
        r322 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00ff, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.skip_intercepted_refs_step", false) != false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00bc, code lost:
    
        if (r0 != null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x033a, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.unwind_stacks", true) != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00b4, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.share_async_unwinder_thread", false) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bf, code lost:
    
        r321 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00da, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.use_lock_free_queue_async_unwinder", true) == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00dd, code lost:
    
        r321 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00e2, code lost:
    
        if (r0 == null) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0102, code lost:
    
        r322 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0107, code lost:
    
        if (r0 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x010a, code lost:
    
        r323 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0124, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.log_async_unwider_queue_stats", false) != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x012f, code lost:
    
        r324 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0149, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.use_weak_ref_to_track_deallocation", false) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x014c, code lost:
    
        r324 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0151, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0171, code lost:
    
        r325 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0176, code lost:
    
        if (r0 != null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0179, code lost:
    
        r326 = 0;
        r327 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x017f, code lost:
    
        r328 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0184, code lost:
    
        if (r0 == null) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0187, code lost:
    
        r329 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a2, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.unwind_jit_frames", true) == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x02ad, code lost:
    
        r330 = r0.A08.A00("provider.memory_allocation.elements_to_discard_on_unwinder_overflow", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x01b0, code lost:
    
        r331 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x01b5, code lost:
    
        if (r0 == null) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01b8, code lost:
    
        r332 = r0.A08.A01("provider.memory_allocation.dynamic_sampling_config");
        r333 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01de, code lost:
    
        if (r0.A08.A02("provider.memory_allocation.log_async_unwinder_failure", false) != false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01e1, code lost:
    
        r333 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x01eb, code lost:
    
        if (r0 != null) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x01ee, code lost:
    
        r335 = 256;
        r336 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x01f6, code lost:
    
        r337 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x01f9, code lost:
    
        r301.mIsFileBackedBuffer = false;
        r314 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0206, code lost:
    
        if (r0 == null) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0209, code lost:
    
        r314 = X.AnonymousClass001.A1T(r0.A09.getFilePath());
        r301.mIsFileBackedBuffer = r314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0227, code lost:
    
        if (r315 != (-1)) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x022a, code lost:
    
        r315 = r313;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x022e, code lost:
    
        r338 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0231, code lost:
    
        r0 = r301.mIsFileBackedBuffer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x023c, code lost:
    
        monitor-enter(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0379, code lost:
    
        r0 = X.C0F8.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0382, code lost:
    
        r0 = X.AnonymousClass001.A0l(com.facebook.acra.constants.ActionId.VIDEO_SET_RENDERER_CONTEXT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0389, code lost:
    
        r313 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0393, code lost:
    
        r0.append(X.AnonymousClass001.A1N(r0 ? 1 : 0) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x039e, code lost:
    
        r0.append(',');
        r0 = r309;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03ab, code lost:
    
        X.C0lu.A03(r0, r307, r309);
        r0 = r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03bb, code lost:
    
        X.C0lu.A03(r0, r311, r312);
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x03c2, code lost:
    
        r0.append(r315);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03ca, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x03d9, code lost:
    
        X.C0lu.A03(r0, X.C0lu.A04(r318) ? 1 : 0, r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x03e6, code lost:
    
        r0.append(X.C0lu.A04(r320) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x03ed, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x03fb, code lost:
    
        r0.append(X.C0lu.A04(r321) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0402, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0410, code lost:
    
        r0.append(X.C0lu.A04(r322) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0417, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0425, code lost:
    
        r0.append(X.C0lu.A04(r323) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x042c, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0440, code lost:
    
        X.C0lu.A03(r0, X.C0lu.A04(r325) ? 1 : 0, r326);
        r0 = r327;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x044a, code lost:
    
        r0.append(r327);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0452, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0460, code lost:
    
        r0.append(X.C0lu.A04(r328) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0467, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0475, code lost:
    
        r0.append(X.C0lu.A04(r329) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x047c, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0484, code lost:
    
        r0.append(r330);
     */
    @Override // X.C0lu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void enable() {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.memory.MemoryAllocationProvider.enable():void");
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return PROVIDER_MEMORY;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        if (!nativeIsTracingEnabled()) {
            return 0;
        }
        int i = PROVIDER_MEMORY;
        if (TraceEvents.isEnabled(i)) {
            return i;
        }
        return 0;
    }

    @Override // X.C0lu
    public void onTraceEnded(TraceContext traceContext, 0Gw r303) {
        int A03 = 0FI.A03(543012337);
        stopTraceIfRunning();
        0FI.A09(1232010347, A03);
    }

    @Override // X.C0lu
    public void onTraceStarted(TraceContext traceContext, 0Gw r303) {
        int A03 = 0FI.A03(331605494);
        super.onTraceStarted(traceContext, r303);
        synchronized (this) {
            try {
                this.mRunning = true;
                nativeResetFrameworkNamesSet();
            } catch (Throwable th) {
                0FI.A09(2099817828, A03);
                throw th;
            }
        }
        0FI.A09(1400048898, A03);
    }

    public void onTrigger() {
        startProfiling();
    }

    public void setErrorMessage(String str) {
        this.mErrorMessage = str;
    }
}
