package X;

import android.util.Pair;

/* renamed from: X.1f7, reason: invalid class name */
/* loaded from: 1f7.class */
public final class C1f7 {
    public static C1f7 A01;
    public final C1dz A00;

    public C1f7(C1dz c1dz) {
        this.A00 = c1dz;
    }

    public void A00(1fB r302, int i, int i2, boolean z) {
        C1f4 c1f4;
        C1dz c1dz = this.A00;
        if (!c1dz.A00 || (r302 instanceof 1fA)) {
            return;
        }
        String A00 = C1fq.A00(r302.A02());
        if ("".equals(A00)) {
            A00 = AnonymousClass001.A0X(r302);
        }
        if (r302 instanceof 2Lw) {
            2Lw r0 = (2Lw) r302;
            c1f4 = new C1f4();
            String valueOf = String.valueOf(((Number) r0.A00.second).intValue());
            java.util.Map map = c1f4.A02;
            map.put("old_priority", valueOf);
            map.put("new_priority", String.valueOf(r0.A01));
            map.put("is_boosted", String.valueOf(((Boolean) r0.A00.first).booleanValue()));
            r0.A00 = new 03Y(false, 0);
        } else if (r302 instanceof C1ij) {
            C1ij c1ij = (C1ij) r302;
            c1f4 = new C1f4();
            String obj = c1ij.A00.second.toString();
            java.util.Map map2 = c1f4.A02;
            map2.put("old_priority", obj);
            map2.put("new_priority", String.valueOf(c1ij.A01));
            map2.put("is_boosted", c1ij.A00.first.toString());
            c1ij.A00 = new Pair(false, 0);
        } else if (r302 instanceof C1ih) {
            C1ih c1ih = (C1ih) r302;
            c1f4 = new C1f4();
            String valueOf2 = String.valueOf(((Number) c1ih.A00.second).intValue());
            java.util.Map map3 = c1f4.A02;
            map3.put("old_priority", valueOf2);
            map3.put("new_priority", String.valueOf(c1ih.A01));
            map3.put("is_boosted", String.valueOf(((Boolean) c1ih.A00.first).booleanValue()));
            c1ih.A00 = new 03Y(false, 0);
        } else if (r302 instanceof C1ik) {
            C1ik c1ik = (C1ik) r302;
            c1f4 = new C1f4();
            String valueOf3 = String.valueOf(((Number) c1ik.A00.second).intValue());
            java.util.Map map4 = c1f4.A02;
            map4.put("old_priority", valueOf3);
            map4.put("new_priority", String.valueOf(c1ik.A01));
            map4.put("is_boosted", String.valueOf(((Boolean) c1ik.A00.first).booleanValue()));
            c1ik.A00 = new 03Y(false, 0);
        } else {
            c1f4 = null;
        }
        Integer valueOf4 = Integer.valueOf(i2);
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(A00);
        stringBuffer.append("_");
        stringBuffer.append(i);
        stringBuffer.append("_");
        stringBuffer.append(valueOf4 != null ? valueOf4.intValue() : 0);
        String obj2 = stringBuffer.toString();
        java.util.Map map5 = c1dz.A01.A00;
        C1f3 c1f3 = (C1f3) map5.get(obj2);
        if (c1f3 != null) {
            if (c1f4 != null) {
                C1f4 c1f42 = c1f3.A08;
                c1f42.A02.putAll(c1f4.A02);
                c1f42.A01.putAll(c1f4.A01);
                c1f42.A00.putAll(c1f4.A00);
            }
            int i3 = 2;
            if (z) {
                i3 = 4;
            }
            try {
                c1f3.A00(i3);
                c1dz.Ba6(c1f3);
                map5.remove(obj2);
            } catch (Throwable th) {
                0fH.A0z("MBLog", "Failed to end event for %s with trigger id: %d and key: %d, is timed out: %s ", th, new Object[]{A00, Integer.valueOf(i), valueOf4, Boolean.valueOf(z)});
            }
        }
    }
}
