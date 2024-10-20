package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeMap;

/* renamed from: X.133, reason: invalid class name */
/* loaded from: 133.class */
public final class AnonymousClass133 extends 0Tc implements C0ll {
    public final ThreadLocal A01 = new ThreadLocal() { // from class: X.0lm
        @Override // java.lang.ThreadLocal
        public /* bridge */ /* synthetic */ Object initialValue() {
            return new Random();
        }
    };
    public final java.util.Map A00 = new TreeMap();

    /* JADX WARN: Multi-variable type inference failed */
    public int A01(C0ld c0ld, Object obj, long j) {
        Iterator it = ((C03E) A07(c0ld)).A00.iterator();
        while (it.hasNext()) {
            C03F c03f = (C03F) it.next();
            if (A05(null, null, j, c03f.A02)) {
                if (((Random) this.A01.get()).nextInt(c03f.A00) == 0) {
                    return c03f.A01;
                }
                return -101;
            }
        }
        return -100;
    }

    public boolean A04() {
        return true;
    }

    public boolean A05(Object obj, Object obj2, long j, long j2) {
        boolean z = false;
        if (((int) (j >> 32)) == ((int) (j2 >> 32))) {
            int i = (int) j;
            int i2 = (int) j2;
            if (i == 0 || i2 == 0 || i == i2) {
                z = true;
            }
        }
        return z;
    }

    public /* bridge */ /* synthetic */ Object A06(C0ld c0ld) {
        int[] traceConfigIdxs = c0ld.getTraceConfigIdxs("startup", "start");
        C03E c03e = new C03E();
        ArrayList A0t = AnonymousClass001.A0t(traceConfigIdxs.length);
        for (int i : traceConfigIdxs) {
            C03F c03f = new C03F();
            if (!c0ld.optTraceConfigParamBool(i, "trace_config.is_cold_start", false) && c0ld.optTraceConfigParamBool(i, "trace_config.is_black_box", false)) {
                c03f.A01 = i;
                String optTraceConfigParamString = c0ld.optTraceConfigParamString(i, "trace_config.blackbox_type", "");
                if (optTraceConfigParamString == null) {
                    optTraceConfigParamString = "";
                }
                c03f.A02 = c0ld.optTraceConfigTriggerParamInt(i, "qpl", "stop", "trigger.qpl.marker", 0) | (optTraceConfigParamString.hashCode() << 32);
                c03f.A03 = optTraceConfigParamString;
                c03f.A00 = c0ld.getTraceConfigParamInt(i, "trace_config.coinflip_sample_rate");
                A0t.add(c03f);
            }
        }
        c03e.A00 = A0t;
        java.util.Map map = this.A00;
        map.clear();
        Iterator it = A0t.iterator();
        while (it.hasNext()) {
            C03F c03f2 = (C03F) it.next();
            int i2 = (int) (c03f2.A02 >> 32);
            String str = c03f2.A03;
            Integer valueOf = Integer.valueOf(i2);
            if (!map.containsKey(valueOf)) {
                map.put(valueOf, str);
            } else if (!str.equals(map.get(valueOf))) {
                android.util.Log.w("Profilo", 0Pz.A0v("Blackbox type collision: ", str, " and ", AnonymousClass001.A0b(valueOf, map)));
            }
        }
        return c03e;
    }

    @Override // X.C0ll
    public String AAJ(long j) {
        String str;
        int i = (int) (j >> 32);
        StringBuilder A0k = AnonymousClass001.A0k();
        if (i == 0) {
            str = "";
        } else {
            String A0b = AnonymousClass001.A0b(Integer.valueOf(i), this.A00);
            if (A0b == null) {
                A0b = "?";
            }
            A0k.append(A0b);
            str = ":";
        }
        A0k.append(str);
        A0k.append((int) j);
        return A0k.toString();
    }

    @Override // X.C0ll
    public int B8d(C0ld c0ld, long j) {
        Iterator it = ((C03E) A07(c0ld)).A00.iterator();
        while (it.hasNext()) {
            C03F c03f = (C03F) it.next();
            if (j == c03f.A02) {
                return c03f.A00;
            }
        }
        return 0;
    }
}
