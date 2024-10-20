package X;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.rti.common.time.RealtimeSinceBootClock;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: X.19f, reason: invalid class name */
/* loaded from: 19f.class */
public final class C19f {
    public final long A00 = SystemClock.elapsedRealtime();
    public final C15o A01;
    public final C09D A02;
    public final 09S A03;
    public final 17I A04;
    public final String A05;
    public final RealtimeSinceBootClock A06;
    public final 0QV A07;

    public C19f(Context context, C15o c15o, C09D c09d, RealtimeSinceBootClock realtimeSinceBootClock, 09S r306, 17I r307, 0QV r308) {
        this.A05 = context.getPackageName();
        this.A04 = r307;
        this.A06 = realtimeSinceBootClock;
        this.A01 = c15o;
        this.A02 = c09d;
        this.A03 = r306;
        this.A07 = r308;
    }

    public void A00(Integer num, String str) {
        HashMap A01 = C15p.A01("event_type", num.intValue() != 0 ? "UNEXPECTED_TOPIC" : "JSON_PARSE_ERROR");
        if (!TextUtils.isEmpty(str)) {
            A01.put("event_extra_info", str);
        }
        0fH.A0f("fbns_service_event", A01, "FbnsAnalyticsLogger", "Event name: %s, Event parameters: %s");
        C15n c15n = new C15n("fbns_service_event", this.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        c15n.A05(A01);
        this.A01.CgC(c15n);
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [X.0r0, X.15n] */
    public void A01(String str, String str2, String str3, java.util.Map map, long j, long j2, boolean z, boolean z2) {
        java.util.Map map2 = map;
        FbnsServiceDelegate fbnsServiceDelegate = FbnsServiceDelegate.A0E;
        09C r0 = this.A02;
        String str4 = 0Mf.A02.mPrefKey;
        11T.A0F(str4, 0);
        boolean z3 = r0.getBoolean(str4, false);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = elapsedRealtime - this.A00;
        long j4 = elapsedRealtime - j;
        AtomicLong atomicLong = this.A04.A05;
        long j5 = elapsedRealtime - atomicLong.get();
        long j6 = elapsedRealtime - j2;
        if (j2 < 0) {
            j6 = 0;
        }
        if (map == null) {
            map2 = AnonymousClass001.A0u();
        }
        map2.put("prev_running", String.valueOf(z));
        map2.put("nsid", Long.toString(atomicLong.get()));
        ?? c15n = new C15n("fbns_push_service_lifecycle", this.A05, Locale.getDefault().toString(), Build.MODEL, Build.MANUFACTURER);
        c15n.A07 = str;
        c15n.A06 = str2;
        c15n.A05 = str3;
        c15n.A00 = elapsedRealtime;
        c15n.A04 = j3;
        c15n.A01 = j4;
        c15n.A02 = j5;
        c15n.A03 = j6;
        c15n.A09 = z2;
        c15n.A08 = z3;
        C15n.A00(c15n, this, str, map2);
    }
}
