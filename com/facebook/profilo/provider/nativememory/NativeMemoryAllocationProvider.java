package com.facebook.profilo.provider.nativememory;

import X.0FI;
import X.0Gw;
import X.0cG;
import X.0mL;
import X.0mM;
import X.AnonymousClass001;
import X.C0ft;
import X.C0lu;
import android.content.Context;
import com.facebook.profilo.core.ProvidersRegistry;
import com.facebook.profilo.ipc.TraceContext;
import com.facebook.profilo.logger.MultiBufferLogger;
import java.io.File;
import java.io.IOException;

/* loaded from: NativeMemoryAllocationProvider.class */
public final class NativeMemoryAllocationProvider extends C0lu implements 0mL {
    public static final int PROVIDER_MEMORY = ProvidersRegistry.A00.A02("native_memory_allocation");
    public boolean isProfiling;
    public final Context mContext;
    public String mErrorMessage;
    public boolean mIsFileBackedBuffer;
    public 0mM mProviderTriggerMonitor;
    public boolean mReuseDispatchTable;

    public NativeMemoryAllocationProvider(Context context) {
        super("profilo_native_memory");
        this.mContext = context;
    }

    public static native int nativeInitializeProfiling(Object obj, MultiBufferLogger multiBufferLogger, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, boolean z, boolean z2, int i9, boolean z3, boolean z4, boolean z5, int i10, boolean z6, int i11, String str2, boolean z7, int i12, int i13, int i14, boolean z8, String str3, boolean z9, int i15, boolean z10);

    public static native void nativeStartProfiling(boolean z);

    public static native void nativeStopProfiling();

    private void startProfiling() {
        synchronized (this) {
            if (!this.isProfiling) {
                nativeStartProfiling(this.mReuseDispatchTable);
                if (this.mIsFileBackedBuffer && C0ft.A04 != null) {
                    File file = C0ft.A04.A0B;
                    if (file != null) {
                        try {
                            AnonymousClass001.A0D(file, "nativemp").createNewFile();
                        } catch (IOException unused) {
                        }
                    }
                }
                this.isProfiling = true;
            }
        }
    }

    private void stopTraceIfRunning() {
        synchronized (this) {
            if (this.isProfiling) {
                nativeStopProfiling();
                this.isProfiling = false;
            }
            0mM r0 = this.mProviderTriggerMonitor;
            if (r0 != null) {
                r0.A01();
                this.mProviderTriggerMonitor = null;
            }
            synchronized (0cG.class) {
                0cG.A02 = false;
                0cG.A00();
            }
        }
    }

    @Override // X.C0lu
    public void disable() {
        int A03 = 0FI.A03(1026252937);
        stopTraceIfRunning();
        0FI.A09(-467005302, A03);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x0478, code lost:
    
        X.C0lu.A03(r0, r306, r317);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0481, code lost:
    
        X.C0lu.A03(r0, r318, r319);
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0494, code lost:
    
        X.C0lu.A03(r0, X.C0lu.A04(r320) ? 1 : 0, r321);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x04a1, code lost:
    
        r0.append(X.C0lu.A04(r322) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x04a8, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x04b6, code lost:
    
        r0.append(X.C0lu.A04(r324) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x04bd, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x04d1, code lost:
    
        X.C0lu.A03(r0, X.C0lu.A04(r325) ? 1 : 0, r326);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x04de, code lost:
    
        r0.append(X.C0lu.A04(r327) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x04e5, code lost:
    
        r0.append(',');
        r0 = r328;
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x04f0, code lost:
    
        r0.append(r328);
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x04fd, code lost:
    
        r0.append(",(");
        r0 = r330;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0509, code lost:
    
        r0.append(r330);
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0516, code lost:
    
        r0.append("),");
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0525, code lost:
    
        X.C0lu.A03(r0, X.C0lu.A04(r331) ? 1 : 0, r332);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0532, code lost:
    
        r0.append(X.C0lu.A04(r333) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0539, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0547, code lost:
    
        r0.append(X.C0lu.A04(r334) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x054e, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x055c, code lost:
    
        r0.append(X.C0lu.A04(r335) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0563, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0571, code lost:
    
        r0.append(X.C0lu.A04(r338) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0578, code lost:
    
        r0.append(',');
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0587, code lost:
    
        X.C0lu.A03(r0, X.C0lu.A04(r339) ? 1 : 0, r340);
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x058e, code lost:
    
        if (r341 == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0591, code lost:
    
        r342 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0596, code lost:
    
        r0.append(r342);
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x05b3, code lost:
    
        r0.A02(X.C0g6.A7b, X.C0gq.CRITICAL_REPORT, r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x05ba, code lost:
    
        X.0cG.A05 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x05bf, code lost:
    
        X.0cG.A02 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x05c2, code lost:
    
        X.0cG.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x05c7, code lost:
    
        monitor-exit(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x05ca, code lost:
    
        if (r334 != false) goto L191;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x05cd, code lost:
    
        r333 = ((r333 ? 1 : 0) | 2) == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x05d5, code lost:
    
        if (r335 == false) goto L194;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x05d8, code lost:
    
        r333 = ((r333 ? 1 : 0) | 4) == true ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0624, code lost:
    
        if (nativeInitializeProfiling(r301, A05(), r307, r310, r311, r312, r306, r317, r318, r319, r329, r344, r320, r321, r322, r324, r325, r326, r327, r328, r330, r331, r332, r333 ? 1 : 0, r337, r338, r343, r339, r340, r341) == 0) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0629, code lost:
    
        monitor-enter(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x062a, code lost:
    
        X.0cG.A05 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x062f, code lost:
    
        X.0cG.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0632, code lost:
    
        X.0cG.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x065c, code lost:
    
        monitor-exit(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x063a, code lost:
    
        if (r336 != 0) goto L206;
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x063d, code lost:
    
        startProfiling();
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0644, code lost:
    
        r301.mProviderTriggerMonitor = new X.0mM(r301, r336);
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0421, code lost:
    
        r344 = false;
        r343 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x03b2, code lost:
    
        r342 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x066f, code lost:
    
        r305 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0671, code lost:
    
        r0 = r314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0676, code lost:
    
        throw r305;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x01b1, code lost:
    
        r340 = r0.A08.A00("provider.native_memory_allocation.allocation_threshold_for_sync_unwinding", 0);
        r341 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x01d6, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.avoid_unwinding_if_deallocated", false) != false) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0167, code lost:
    
        r338 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x016c, code lost:
    
        if (r0 == null) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x020f, code lost:
    
        r334 = X.AnonymousClass001.A1N(r0.A08.A02("provider.native_memory_allocation.use_no_op_allocation_registry", false) ? 1 : 0);
        r335 = X.AnonymousClass001.A1N(r0.A08.A02("provider.native_memory_allocation.enable_allocation_tracker", true) ? 1 : 0);
        r336 = r0.A08.A00("provider.native_memory_allocation.when_to_start", 0);
        r337 = r0.A08.A00("provider.native_memory_allocation.hash_mode", 0);
        r302 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0266, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.reuse_dispatch_table", false) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x01dc, code lost:
    
        r332 = r0.A08.A00("provider.native_memory_allocation.unwind_on_free_chance", 0);
        r333 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0209, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.log_memory_events", true) == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x026c, code lost:
    
        r330 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00e4, code lost:
    
        r327 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x00e9, code lost:
    
        if (r0 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x00ec, code lost:
    
        r328 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x00d9, code lost:
    
        r325 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x00de, code lost:
    
        if (r0 != null) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x00e1, code lost:
    
        r326 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:205:0x00cb, code lost:
    
        r324 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:206:0x00d0, code lost:
    
        if (r0 != null) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:209:0x02ff, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.share_async_unwinder_thread", false) == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:211:0x034b, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.mixed_stack", false) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ad, code lost:
    
        if (r0 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b0, code lost:
    
        r324 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c8, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.use_lock_free_queue_async_unwinder", true) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0272, code lost:
    
        r325 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0290, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.log_async_unwider_queue_stats", false) != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0296, code lost:
    
        r326 = r0.A08.A00("provider.native_memory_allocation.async_unwinder_thread_priority", 0);
        r327 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x02bb, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.log_mapping_status_per_frame", false) != false) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x02c1, code lost:
    
        r328 = r0.A08.A00("provider.native_memory_allocation.elements_to_discard_on_unwinder_overflow", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        r329 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f4, code lost:
    
        if (r0 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00f7, code lost:
    
        r330 = r0.A08.A01("provider.native_memory_allocation.dynamic_sampling_config");
        r331 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x011b, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.log_async_unwinder_failure", false) != false) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x011e, code lost:
    
        r331 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0123, code lost:
    
        if (r0 != null) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0126, code lost:
    
        r332 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0129, code lost:
    
        r333 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x012e, code lost:
    
        if (r0 != null) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0131, code lost:
    
        r334 = false;
        r335 = true;
        r336 = 0;
        r337 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x013d, code lost:
    
        r302 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0142, code lost:
    
        r301.mReuseDispatchTable = r302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0149, code lost:
    
        if (r0 == null) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x014c, code lost:
    
        r338 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0164, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.resolve_names_on_client", false) != false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x016f, code lost:
    
        r339 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0187, code lost:
    
        if (r0.A08.A02("provider.native_memory_allocation.enable_jit_unwinding", false) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018a, code lost:
    
        r339 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x018f, code lost:
    
        if (r0 != null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0192, code lost:
    
        r340 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0195, code lost:
    
        r341 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0198, code lost:
    
        r0 = r301.mContext;
        r0 = r301.mReuseDispatchTable;
        r314 = X.0dA.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01aa, code lost:
    
        monitor-enter(r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01ab, code lost:
    
        r342 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x03a1, code lost:
    
        if (X.0dA.A00(r0, r0) != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x03aa, code lost:
    
        X.0fH.A0A(r314, "Could not verify safety of malloc hooks");
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x03b7, code lost:
    
        monitor-exit(r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x03ba, code lost:
    
        if (r342 != false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x03bd, code lost:
    
        r0 = com.facebook.common.mallochooks.jni.NativeAllocationHooksUtil$NativeImpl.sErrorMessage;
        r314 = X.0cG.class;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x03c8, code lost:
    
        monitor-enter(r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x03c9, code lost:
    
        X.0cG.A05 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x03ce, code lost:
    
        X.0cG.A02 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x03d1, code lost:
    
        X.0cG.A00();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x03d6, code lost:
    
        monitor-exit(r314);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x065d, code lost:
    
        X.0FI.A09(1019505328, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0666, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x03da, code lost:
    
        r301.mIsFileBackedBuffer = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x03e1, code lost:
    
        if (r0 == null) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x03e4, code lost:
    
        r0 = r0.A09;
        r0 = X.AnonymousClass001.A1T(r0.getFilePath());
        r301.mIsFileBackedBuffer = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x03fe, code lost:
    
        if (r0 == false) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0401, code lost:
    
        r329 = r0.generateMemoryMappingFilePath();
        r343 = r0.generateLocalSymbolsFilePath();
        r344 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0412, code lost:
    
        r0 = r301.mIsFileBackedBuffer;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x041d, code lost:
    
        monitor-enter(X.0cG.class);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x042a, code lost:
    
        r0 = X.C0F8.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0436, code lost:
    
        r0 = X.AnonymousClass001.A0l(com.facebook.acra.constants.ActionId.VIDEO_SET_RENDERER_CONTEXT);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x043d, code lost:
    
        r342 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0447, code lost:
    
        r0.append(X.AnonymousClass001.A1N(r0 ? 1 : 0) ? 1 : 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0452, code lost:
    
        r0.append(',');
        r0 = r307;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0463, code lost:
    
        X.C0lu.A03(r0, r307, r310);
        r0 = r311;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x046f, code lost:
    
        X.C0lu.A03(r0, r311, r312);
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C0lu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void enable() {
        /*
            Method dump skipped, instructions count: 1655
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.nativememory.NativeMemoryAllocationProvider.enable():void");
    }

    @Override // X.C0lu
    public int getSupportedProviders() {
        return PROVIDER_MEMORY;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (com.facebook.profilo.core.TraceEvents.isEnabled(r303) != false) goto L13;
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
            monitor-enter(r0)
            r0 = r301
            boolean r0 = r0.isProfiling     // Catch: java.lang.Throwable -> L21
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1b
            int r0 = com.facebook.profilo.provider.nativememory.NativeMemoryAllocationProvider.PROVIDER_MEMORY     // Catch: java.lang.Throwable -> L21
            r303 = r0
            r0 = r303
            boolean r0 = com.facebook.profilo.core.TraceEvents.isEnabled(r0)     // Catch: java.lang.Throwable -> L21
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            r303 = r0
        L1d:
            r0 = r301
            monitor-exit(r0)
            r0 = r303
            return r0
        L21:
            r304 = move-exception
            r0 = r301
            monitor-exit(r0)
            r0 = r304
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.profilo.provider.nativememory.NativeMemoryAllocationProvider.getTracingProviders():int");
    }

    @Override // X.C0lu
    public void onTraceEnded(TraceContext traceContext, 0Gw r303) {
        int A03 = 0FI.A03(-78574562);
        stopTraceIfRunning();
        0FI.A09(-1884952386, A03);
    }

    public void onTrigger() {
        startProfiling();
    }

    public void setErrorMessage(String str) {
        this.mErrorMessage = str;
    }
}
