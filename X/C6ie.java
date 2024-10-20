package X;

import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.6ie, reason: invalid class name */
/* loaded from: 6ie.class */
public final class C6ie {
    public static final C6if A02 = new C6if();
    public final java.util.Map A00 = new ConcurrentHashMap();
    public final C6ia A01;

    public C6ie(C6ia c6ia) {
        this.A01 = c6ia;
    }

    public static final String A00(C6ie c6ie, String str, String str2, int i, boolean z) {
        java.util.Map map = (java.util.Map) c6ie.A00.get(Integer.valueOf(i));
        int i2 = 0;
        if (map == null) {
            map = 04R.A0A(new 03Y[]{1BK.A1G(str, 04R.A0A(new 03Y[]{1BK.A1G("start", 0), 1BK.A1G("end", 0)}))});
        }
        java.util.Map map2 = (java.util.Map) map.get(str);
        if (map2 == null) {
            map2 = 04R.A0A(new 03Y[]{1BK.A1G("start", 0), 1BK.A1G("end", 0)});
        }
        Number number = (Number) map2.get(str2);
        if (number != null) {
            i2 = number.intValue();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('_');
        if (z) {
            sb.append(i2);
        } else {
            sb.append(i2);
            sb.append('_');
            sb.append(str2);
        }
        return sb.toString();
    }

    public static final void A01(C6ie c6ie, String str, String str2, int i) {
        java.util.Map map = c6ie.A00;
        Integer valueOf = Integer.valueOf(i);
        java.util.Map map2 = (java.util.Map) map.get(valueOf);
        int i2 = 0;
        if (map2 == null) {
            map2 = 04R.A0A(new 03Y[]{new 03Y(str, 04R.A0A(new 03Y[]{new 03Y("start", 0), new 03Y("end", 0)}))});
        }
        java.util.Map map3 = (java.util.Map) map2.get(str);
        if (map3 == null) {
            map3 = 04R.A0A(new 03Y[]{new 03Y("start", 0), new 03Y("end", 0)});
        }
        Number number = (Number) map3.get(str2);
        if (number != null) {
            i2 = number.intValue();
        }
        int i3 = i2 + 1;
        if (i3 <= 10) {
            map3.put(str2, Integer.valueOf(i3));
            map2.put(str, map3);
            map.put(valueOf, map2);
            return;
        }
        C6ia c6ia = c6ie.A01;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" + ");
        sb.append(str2);
        sb.append(" exceeds index cap of 10 with instanceKey as ");
        sb.append(i);
        c6ia.report("ThreadPREMarkerPointIndexTracker", sb.toString());
    }
}
