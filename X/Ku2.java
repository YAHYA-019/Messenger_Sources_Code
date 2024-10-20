package X;

import com.google.common.base.Preconditions;

/* loaded from: Ku2.class */
public final class Ku2 {
    public final KkB A00;
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final java.util.Map A01 = AnonymousClass001.A0u();

    public Ku2(KkB kkB) {
        this.A00 = kkB;
    }

    public int A00(String str) {
        int i;
        synchronized (this) {
            i = 0;
            Preconditions.checkArgument(AnonymousClass001.A1O(1JF.A0B(str) ? 1 : 0));
            Integer num = (Integer) this.A01.get(str);
            if (num != null) {
                i = num.intValue();
            }
        }
        return i;
    }

    public int A01(String str) {
        int A00;
        synchronized (this) {
            Preconditions.checkArgument(AnonymousClass001.A1O(1JF.A0B(str) ? 1 : 0));
            A00 = A00(str) + 1;
            1BK.A1P(str, this.A01, A00);
        }
        return A00;
    }

    public Lhz A02(String str) {
        Lhz lhz;
        synchronized (this) {
            Preconditions.checkArgument(AnonymousClass001.A1O(1JF.A0B(str) ? 1 : 0));
            java.util.Map map = this.A02;
            if (map.containsKey(str)) {
                1BK.A1P(str, map, JQy.A0G(str, map) + 1);
            } else {
                1BK.A1P(str, map, 1);
            }
            lhz = new Lhz(this, str);
        }
        return lhz;
    }

    public String[] A03() {
        String[] strArr;
        synchronized (this) {
            java.util.Map map = this.A02;
            strArr = (String[]) map.keySet().toArray(new String[map.size()]);
        }
        return strArr;
    }
}
