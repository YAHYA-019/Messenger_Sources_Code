package X;

import com.facebook.profilo.ipc.TraceConfigExtras;
import java.util.Arrays;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.0lp, reason: invalid class name */
/* loaded from: 0lp.class */
public final class C0lp {
    public static final List A02 = Arrays.asList("async", "atrace", "qpl", "other", "liger", "fbsystrace", "liger_http2", "system_counters", "stack_trace", "high_freq_main_thread_counters", "transient_network_data", "frames", "main_thread_messages", "libc_io", "memory_allocation", "class_load");
    public final TraceConfigExtras A00;
    public final List A01;

    public C0lp(TraceConfigExtras traceConfigExtras, List list) {
        this.A01 = list == null ? A02 : list;
        TreeMap treeMap = new TreeMap();
        treeMap.put("trace_config.logger_priority", 0);
        TreeMap treeMap2 = new TreeMap();
        treeMap2.put("trace_config.buffer_sizes", new int[]{30000});
        TreeMap treeMap3 = null;
        TreeMap treeMap4 = null;
        TreeMap treeMap5 = null;
        TraceConfigExtras traceConfigExtras2 = new TraceConfigExtras(treeMap, null, treeMap2, null, null);
        if (traceConfigExtras != null) {
            if (traceConfigExtras2.A01 != null || traceConfigExtras.A01 != null) {
                throw AnonymousClass001.A0N("One or both extras are configuration backed");
            }
            TreeMap treeMap6 = traceConfigExtras2.A04;
            TreeMap treeMap7 = null;
            treeMap4 = (treeMap6 == null && traceConfigExtras.A04 == null) ? treeMap4 : new TreeMap();
            TreeMap treeMap8 = traceConfigExtras2.A02;
            treeMap5 = (treeMap8 == null && traceConfigExtras.A02 == null) ? treeMap5 : new TreeMap();
            TreeMap treeMap9 = traceConfigExtras2.A03;
            TreeMap treeMap10 = (treeMap9 == null && traceConfigExtras.A03 == null) ? null : new TreeMap();
            TreeMap treeMap11 = traceConfigExtras2.A05;
            treeMap3 = (treeMap11 == null && traceConfigExtras.A05 == null) ? treeMap3 : new TreeMap();
            TreeMap treeMap12 = traceConfigExtras2.A06;
            treeMap7 = (treeMap12 == null && traceConfigExtras.A05 == null) ? treeMap7 : new TreeMap();
            if (treeMap6 != null) {
                treeMap4.putAll(treeMap6);
            }
            TreeMap treeMap13 = traceConfigExtras.A04;
            if (treeMap13 != null) {
                treeMap4.putAll(treeMap13);
            }
            if (treeMap8 != null) {
                treeMap5.putAll(treeMap8);
            }
            TreeMap treeMap14 = traceConfigExtras.A02;
            if (treeMap14 != null) {
                treeMap5.putAll(treeMap14);
            }
            if (treeMap9 != null) {
                treeMap10.putAll(treeMap9);
            }
            TreeMap treeMap15 = traceConfigExtras.A03;
            if (treeMap15 != null) {
                treeMap10.putAll(treeMap15);
            }
            if (treeMap11 != null) {
                treeMap3.putAll(treeMap11);
            }
            TreeMap treeMap16 = traceConfigExtras.A05;
            if (treeMap16 != null) {
                treeMap3.putAll(treeMap16);
            }
            if (treeMap12 != null) {
                treeMap7.putAll(treeMap12);
            }
            TreeMap treeMap17 = traceConfigExtras.A06;
            if (treeMap17 != null) {
                treeMap7.putAll(treeMap17);
            }
            traceConfigExtras2 = new TraceConfigExtras(treeMap4, treeMap5, treeMap10, treeMap3, treeMap7);
        }
        this.A00 = traceConfigExtras2;
    }
}
