package X;

import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.MarkerEditor;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1f2, reason: invalid class name */
/* loaded from: 1f2.class */
public final class C1f2 extends 1Km {
    public final C1eY A00;

    public C1f2(C1eY c1eY) {
        this.A00 = c1eY;
    }

    public C02S Au6() {
        C1eY c1eY = this.A00;
        if (c1eY != null) {
            C1dr c1dr = c1eY.A01;
            11T.A0A(c1dr);
            if (((2yD) c1dr.A0J.A00.A00.get()).AZk(36317225547738152L)) {
                int[] iArr = c1dr.A02;
                return new C02S(Arrays.copyOf(iArr, iArr.length), null);
            }
        }
        return C02S.A03;
    }

    public void C5i(C03b c03b) {
        11T.A0F(c03b, 0);
        C1eY c1eY = this.A00;
        if (c1eY != null) {
            c1eY.A00(c03b.getMarkerId(), c03b.ArT());
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.071, java.lang.Object] */
    public void Ctc(final QuickPerformanceLogger quickPerformanceLogger) {
        11T.A0F(quickPerformanceLogger, 0);
        if (this.A00 != null) {
            final ?? obj = new Object();
            C1fv.A00.add(new C1e1(quickPerformanceLogger, obj) { // from class: X.1fu
                public final QuickPerformanceLogger A00;
                public final AnonymousClass071 A01;

                {
                    this.A00 = quickPerformanceLogger;
                    this.A01 = obj;
                }

                public static final int A00(int i) {
                    int i2 = 27328523;
                    if (i == 1) {
                        return 27328525;
                    }
                    if (i == 5) {
                        return 27328516;
                    }
                    if (i == 10) {
                        return 27328518;
                    }
                    if (i == 15) {
                        return 27328517;
                    }
                    if (i == 20) {
                        return 27328524;
                    }
                    if (i == 25) {
                        return 27328519;
                    }
                    if (i == 30) {
                        return 27328522;
                    }
                    if (i == 35) {
                        return 27328520;
                    }
                    if (i == 40) {
                        return 27328526;
                    }
                    if (i == 45) {
                        return 27328527;
                    }
                    if (i == 50) {
                        i2 = 27328528;
                    }
                    return i2;
                }

                @Override // X.C1e1
                public void Ba6(C1f3 c1f3) {
                    Number A0o;
                    0fH.A0j("MBLog", c1f3.toString());
                    if (c1f3.A09) {
                        EventBuilder level = this.A00.markEventBuilder(A00(c1f3.A04), "").setLevel(7);
                        C1f4 c1f4 = c1f3.A08;
                        java.util.Map map = c1f4.A02;
                        11T.A0A(map);
                        for (Map.Entry entry : map.entrySet()) {
                            String str = (String) entry.getKey();
                            String str2 = (String) entry.getValue();
                            if (str2 != null) {
                                level.annotate(str, str2);
                            }
                        }
                        java.util.Map map2 = c1f4.A01;
                        11T.A0A(map2);
                        for (Map.Entry entry2 : map2.entrySet()) {
                            String str3 = (String) entry2.getKey();
                            Number number = (Number) entry2.getValue();
                            if (number != null) {
                                level.annotate(str3, number.longValue());
                            }
                        }
                        java.util.Map map3 = c1f4.A00;
                        11T.A0A(map3);
                        Iterator it = map3.entrySet().iterator();
                        while (it.hasNext()) {
                            Map.Entry A0z = AnonymousClass001.A0z(it);
                            String A0j = AnonymousClass001.A0j(A0z);
                            Number number2 = (Number) A0z.getValue();
                            if (number2 != null) {
                                level.annotate(A0j, number2.doubleValue());
                            }
                        }
                        level.report();
                        return;
                    }
                    int i = c1f3.A04;
                    int A00 = A00(i);
                    C1f4 c1f42 = c1f3.A08;
                    java.util.Map map4 = c1f42.A01;
                    Number number3 = (Number) map4.get("trigger_source_id");
                    if (number3 != null) {
                        c1f3.A02("trigger_source_name", 0Kv.A00((int) number3.longValue()));
                    }
                    if (i == 40 && (A0o = 1BK.A0o("overlapping_id", map4)) != null) {
                        c1f3.A02("overlapping_name", 0Kv.A00((int) A0o.longValue()));
                    }
                    QuickPerformanceLogger quickPerformanceLogger2 = this.A00;
                    int i2 = c1f3.A05;
                    long j = c1f3.A07;
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    quickPerformanceLogger2.markerStart(A00, i2, j, timeUnit);
                    MarkerEditor withMarker = quickPerformanceLogger2.withMarker(A00, i2);
                    11T.A0D(withMarker);
                    java.util.Map map5 = c1f42.A02;
                    11T.A0A(map5);
                    for (Map.Entry entry3 : map5.entrySet()) {
                        String str4 = (String) entry3.getKey();
                        String str5 = (String) entry3.getValue();
                        if (str5 != null) {
                            withMarker.annotate(str4, str5);
                        }
                    }
                    for (Map.Entry entry4 : map4.entrySet()) {
                        String str6 = (String) entry4.getKey();
                        Number number4 = (Number) entry4.getValue();
                        if (number4 != null) {
                            withMarker.annotate(str6, number4.longValue());
                        }
                    }
                    java.util.Map map6 = c1f42.A00;
                    11T.A0A(map6);
                    Iterator it2 = map6.entrySet().iterator();
                    while (it2.hasNext()) {
                        Map.Entry A0z2 = AnonymousClass001.A0z(it2);
                        String A0j2 = AnonymousClass001.A0j(A0z2);
                        Number number5 = (Number) A0z2.getValue();
                        if (number5 != null) {
                            withMarker.annotate(A0j2, number5.doubleValue());
                        }
                    }
                    withMarker.annotate("duration_microseconds", (c1f3.A02 - j) / 1000);
                    withMarker.markerEditingCompleted();
                    quickPerformanceLogger2.markerEnd(A00, i2, (short) c1f3.A00, c1f3.A02, timeUnit);
                }
            });
        }
    }

    public String getName() {
        return "mobileboost";
    }
}
