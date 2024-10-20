package com.facebook.profilo.provider.memorymappings;

import X.0FI;
import X.0cG;
import X.C0lu;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.core.TraceEvents;
import com.facebook.profilo.logger.MultiBufferLogger;

/* loaded from: MemoryMappingActionsProvider.class */
public final class MemoryMappingActionsProvider extends C0lu {
    public static final int PROVIDER_MAPPINGS = ProvidersRegistry.A00.A02("memory_mapping_actions");
    public boolean isProfiling;

    public static native void nativeStartProfiling(MultiBufferLogger multiBufferLogger, int i, int i2, String str, boolean z, boolean z2, int i3, boolean z3, boolean z4, int i4, String str2);

    public static native void nativeStopProfiling();

    @Override // X.C0lu
    public void disable() {
        int A03 = 0FI.A03(2132660497);
        nativeStopProfiling();
        this.isProfiling = false;
        synchronized (0cG.class) {
            0cG.A01 = false;
            0cG.A00();
        }
        0FI.A09(-930113607, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0064, code lost:
    
        r312 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006e, code lost:
    
        if (r0 != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0071, code lost:
    
        r314 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0076, code lost:
    
        r315 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x007b, code lost:
    
        if (r0 == null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        r316 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0098, code lost:
    
        if (r0.A08.A02("provider.memory_mapping_actions.use_lock_free_queue_async_unwinder", true) != false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e4, code lost:
    
        r317 = r0.A08.A00("provider.memory_mapping_actions.async_unwinder_thread_priority", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00a6, code lost:
    
        r318 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
    
        if (r306 == 0) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b0, code lost:
    
        if (r0 == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00b3, code lost:
    
        r0 = r0.A09;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00c3, code lost:
    
        if (r0.getFilePath() == null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c6, code lost:
    
        r318 = r0.generateMemoryMappingFilePath();
        r319 = r0.generateLocalSymbolsFilePath();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00da, code lost:
    
        monitor-enter(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x014f, code lost:
    
        X.0cG.A04 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0154, code lost:
    
        X.0cG.A01 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0157, code lost:
    
        X.0cG.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x015c, code lost:
    
        monitor-exit(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0177, code lost:
    
        nativeStartProfiling(A05(), r306, r307, r318, r311, r312, r314, r315, r316, r317, r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x017d, code lost:
    
        r301.isProfiling = true;
        r302 = 596278585;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x01a3, code lost:
    
        X.0FI.A09(r302, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x01a8, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0187, code lost:
    
        r320 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0189, code lost:
    
        r320.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0191, code lost:
    
        monitor-enter(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0192, code lost:
    
        X.0cG.A04 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0197, code lost:
    
        X.0cG.A01 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x019a, code lost:
    
        X.0cG.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01a0, code lost:
    
        r302 = 849709483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00de, code lost:
    
        r319 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009b, code lost:
    
        r316 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00a0, code lost:
    
        if (r0 != null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
    
        r317 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fc, code lost:
    
        r314 = r0.A08.A00("provider.memory_mapping_actions.async_unwinder_queue_size", 256);
        r315 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0124, code lost:
    
        if (r0.A08.A02("provider.memory_mapping_actions.share_async_unwinder_thread", false) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0044, code lost:
    
        if (r0 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003c, code lost:
    
        if (r0.A08.A02("provider.memory_mapping_actions.detail_fd", true) != false) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0047, code lost:
    
        r312 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0061, code lost:
    
        if (r0.A08.A02("provider.memory_mapping_actions.log_unmapping", true) == false) goto L14;
     */
    @Override // X.C0lu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void enable() {
        /*
            Method dump skipped, instructions count: 433
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.memorymappings.MemoryMappingActionsProvider.enable():void");
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return PROVIDER_MAPPINGS;
    }

    @Override // X.C0lu
    public int getTracingProviders() {
        if (!this.isProfiling) {
            return 0;
        }
        int i = PROVIDER_MAPPINGS;
        if (TraceEvents.isEnabled(i)) {
            return i;
        }
        return 0;
    }
}
