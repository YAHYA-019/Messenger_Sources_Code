package X;

import android.util.SparseArray;
import com.facebook.common.time.AwakeTimeSinceBootClock;
import com.facebook.onecamera.components.logging.xlogger.cppimpl.OneCameraXLoggerCpp;
import com.facebook.proxygen.TraceFieldType;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: Gu1.class */
public final class Gu1 extends Gu2 {
    public static final AtomicLong A03 = new AtomicLong(0);
    public final SparseArray A00;
    public final 05U A01;
    public final HWm A02;

    public Gu1(JLD jld, String str, String str2, boolean z) {
        super(jld, z ? new IcX() : new OneCameraXLoggerCpp(false), str, str2);
        this.A00 = DKC.A0E();
        AwakeTimeSinceBootClock awakeTimeSinceBootClock = AwakeTimeSinceBootClock.INSTANCE;
        GfQ gfQ = new GfQ(this);
        if (awakeTimeSinceBootClock == null) {
            throw AnonymousClass001.A0L(AnonymousClass000.A00(40));
        }
        this.A01 = new 05U(gfQ, awakeTimeSinceBootClock, java.util.Map.class, 16, 1024, 16);
        0fH.A0j("FbCameraLogger", "Legacy CommonFbCameraLogger ctor");
        this.A02 = new HWm(jld);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public Gu1(X.JOW r302, X.JLD r303) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Gu1.<init>(X.JOW, X.JLD):void");
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0DA, X.Gau] */
    public static C2358Gau A00(HDP hdp, Gu1 gu1, String str, String str2, String str3, String str4, java.util.Map map, long j) {
        java.util.Map map2;
        long nowNanos = ((GuA) gu1).A05.AyD().nowNanos();
        String str5 = null;
        JMP jmp = ((Gu2) gu1).A01;
        if (jmp.getActiveSessionId() != null) {
            str5 = "pre_capture";
        }
        ?? r0 = new 0DA();
        r0.A07("product_name", ((GuA) gu1).A00);
        r0.A07("component_name", str);
        r0.A07("component_instance_id", String.valueOf(j));
        r0.A07("logger_instance_id", ((GuA) gu1).A08);
        r0.A04("client_time_ms", Double.valueOf(nowNanos / 1000000.0d));
        r0.A07("product_session_id", ((GuA) gu1).A01);
        IcM icM = ((GuA) gu1).A06;
        r0.A08("effect_ids", icM.A05);
        r0.A07("video_recording_state", icM.A04);
        r0.A07("stage", str5);
        r0.A07("active_session_id", jmp.getActiveSessionId());
        r0.A07("custom_session_id", str4);
        if (hdp != null && str2 != null && str3 != null) {
            0DA r02 = new 0DA();
            r02.A06(TraceFieldType.ErrorCode, 1BK.A0l(hdp.mErrorCode));
            r02.A07(TraceFieldType.Error, hdp.getMessage());
            r02.A07("error_severity", str2);
            r02.A07(AbstractC00603o4.A00(486), str3);
            r02.A07(DKB.A00(46), android.util.Log.getStackTraceString(hdp));
            r0.A02(r02, "error");
        }
        HashMap A0u = AnonymousClass001.A0u();
        if (map != null) {
            A0u.putAll(map);
        }
        if (hdp != null && (map2 = hdp.mExtras) != null) {
            A0u.putAll(map2);
        }
        A0u.put("event_counter", String.valueOf(A03.getAndIncrement()));
        ((0DA) r0).A00.put("extra_data", A0u);
        return r0;
    }

    public static boolean A01(Gu1 gu1, Throwable th) {
        boolean z = false;
        if (th != null) {
            int hashCode = th.toString().hashCode();
            long currentTimeMillis = System.currentTimeMillis();
            SparseArray sparseArray = gu1.A00;
            Number number = (Number) sparseArray.get(hashCode, 4YV.A0j());
            number.getClass();
            sparseArray.put(hashCode, Long.valueOf(currentTimeMillis));
            if (currentTimeMillis - number.longValue() <= 300) {
                z = true;
            }
        }
        return z;
    }

    public java.util.Map A3w() {
        return (java.util.Map) this.A01.A01();
    }

    public void Cco(java.util.Map map) {
        this.A01.A02(map);
    }
}
