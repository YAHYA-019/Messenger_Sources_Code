package X;

import android.text.TextUtils;
import com.facebook.acra.constants.ActionId;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;

/* renamed from: X.4Cx, reason: invalid class name */
/* loaded from: 4Cx.class */
public final class C4Cx implements C4Cy {
    public boolean A00;
    public final LightweightQuickPerformanceLogger A01;

    public C4Cx(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger) {
        this.A01 = lightweightQuickPerformanceLogger;
    }

    public static EventBuilder A00(C4Cx c4Cx, String str, String str2, long j) {
        EventBuilder markEventBuilder = c4Cx.A01.markEventBuilder(21370350, str);
        markEventBuilder.annotate("stage", str2);
        if (j > 0) {
            markEventBuilder.annotate("timestamp", j);
        }
        if (c4Cx.A00) {
            markEventBuilder.annotate("from_disk", true);
        }
        return markEventBuilder;
    }

    public static void A01(C4Cx c4Cx, CharSequence charSequence, String str, String str2, String str3, int i, int i2, int i3, long j) {
        EventBuilder A00 = A00(c4Cx, str2, str, System.currentTimeMillis());
        A02(A00, charSequence, i);
        A00.annotate("file_size", j);
        if (str3 != null) {
            A00.annotate("reason", str3);
        }
        if (i2 > 0) {
            A00.annotate("number_of_chunks", i2);
            A00.annotate("current_chunk_index", i3);
        }
        A00.report();
    }

    public static void A02(EventBuilder eventBuilder, CharSequence charSequence, int i) {
        eventBuilder.annotate(AnonymousClass000.A00(29), i);
        eventBuilder.annotate("hprof_id", charSequence.toString());
    }

    public void A03(CharSequence charSequence, String str, int i, int i2, int i3, int i4, long j, long j2, long j3) {
        EventBuilder A00 = A00(this, str, "compression_succeeded", System.currentTimeMillis());
        A02(A00, charSequence, i);
        A00.annotate("original_file_size", j);
        A00.annotate("compressed_file_size", j2);
        A00.annotate("time_to_compress_ms", i2);
        A00.annotate(TraceFieldType.CompressionType, i3);
        A00.annotate("compression_level", i4);
        A00.annotate("java_memory_estimate_bytes", j3);
        A00.report();
    }

    public void A04(CharSequence charSequence, String str, int i, int i2, int i3, long j, boolean z) {
        EventBuilder A00 = A00(this, str, "upload_attempted", System.currentTimeMillis());
        A02(A00, charSequence, i);
        A00.annotate("file_size", j);
        A00.annotate("is_compressed", z);
        A00.annotate("number_of_chunks", i2);
        A00.annotate("current_chunk_index", i3);
        A00.report();
    }

    public void A05(CharSequence charSequence, String str, String str2, int i, int i2, int i3, int i4, long j) {
        EventBuilder A00 = A00(this, str, "compression_failed", System.currentTimeMillis());
        A02(A00, charSequence, i);
        A00.annotate("original_file_size", j);
        A00.annotate(TraceFieldType.CompressionType, i2);
        A00.annotate("compression_level", i3);
        A00.annotate("time_spent_compressing_ms", i4);
        A00.annotate("reason", str2);
        A00.report();
    }

    public void A06(CharSequence charSequence, String str, String str2, long j, long j2) {
        EventBuilder A00 = A00(this, str, "dump_succeeded", j);
        A00.annotate("hprof_id", charSequence.toString());
        A00.annotate("file_size", j2);
        if (!TextUtils.isEmpty(str2)) {
            A00.annotate("asl_session_id", str2);
        }
        A00.report();
    }

    public void A07(CharSequence charSequence, String str, String str2, String str3, int i, int i2, long j) {
        EventBuilder A00 = A00(this, str, "dump_finished", j);
        A00.annotate(1BJ.A00(22), i);
        A00.annotate("hprof_id", charSequence.toString());
        A00.annotate("async_behavior", i2);
        if (!TextUtils.isEmpty(str2)) {
            A00.annotate(4YT.A00(ActionId.APP_DID_BECOME_ACTIVE), str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            A00.annotate("asl_session_id", str3);
        }
        A00.report();
    }

    public void A08(CharSequence charSequence, String str, String str2, String str3, long j) {
        EventBuilder A00 = A00(this, str, "dump_failed", j);
        A00.annotate("hprof_id", charSequence.toString());
        if (str2 != null) {
            A00.annotate("reason", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            A00.annotate("asl_session_id", str3);
        }
        A00.report();
    }

    @Override // X.C4Cy
    public void CgG(String str, String str2, String str3, String str4) {
        EventBuilder A00 = A00(this, str, "dump_declined", System.currentTimeMillis());
        if (str3 != null) {
            A00.annotate("asl_session_id", str3);
        }
        A00.annotate("reason", str4);
        if (str2 != null) {
            A00.annotate("cause_details", str2);
        }
        A00.report();
    }

    @Override // X.C4Cy
    public void CgH(CharSequence charSequence, String str, String str2, String str3) {
        A08(charSequence, str, str3, str2, System.currentTimeMillis());
    }

    @Override // X.C4Cy
    public void CgI(CharSequence charSequence, CharSequence charSequence2, String str, String str2, int i, int i2) {
        A07(charSequence, str, charSequence2.toString(), str2, i, i2, System.currentTimeMillis());
    }

    @Override // X.C4Cy
    public void CgJ(String str, String str2, String str3) {
        EventBuilder A00 = A00(this, str, "dump_requested", System.currentTimeMillis());
        A00.annotate("asl_session_id", str3);
        if (str2 != null) {
            A00.annotate("cause_details", str2);
        }
        A00.report();
    }

    @Override // X.C4Cy
    public void CgK(CharSequence charSequence, String str, String str2, String str3) {
        EventBuilder A00 = A00(this, str, "dump_started", System.currentTimeMillis());
        A00.annotate("hprof_id", charSequence.toString());
        A00.annotate("asl_session_id", str3);
        if (str2 != null) {
            A00.annotate("cause_details", str2);
        }
        A00.report();
    }

    @Override // X.C4Cy
    public void CgL(CharSequence charSequence, String str, String str2, long j) {
        A06(charSequence, str, str2, System.currentTimeMillis(), j);
    }

    @Override // X.C4Cy
    public void CgW(String str, long j, long j2, long j3, long j4) {
        EventBuilder A00 = A00(this, "OOM", "oom", j);
        if (A00.isSampled()) {
            A00.annotate("asl_session_id", str);
            A00.annotate("free_heap", j2);
            A00.annotate("total_heap", j3);
            A00.annotate("max_heap", j4);
            A00.report();
        }
    }
}
