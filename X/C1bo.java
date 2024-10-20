package X;

import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.1bo, reason: invalid class name */
/* loaded from: 1bo.class */
public final class C1bo {
    public final int A00;
    public final int A01;
    public final C1bw A02;
    public final Set A03;
    public final Set A04;
    public final Set A05;

    public C1bo(C1bw c1bw, Set set, Set set2, Set set3, int i, int i2) {
        this.A04 = Collections.unmodifiableSet(set);
        this.A03 = Collections.unmodifiableSet(set2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = c1bw;
        this.A05 = Collections.unmodifiableSet(set3);
    }

    public static C1bo A00(Class cls, final Object obj, Class... clsArr) {
        C1bq c1bq = new C1bq(cls, clsArr);
        c1bq.A02 = new C1bw(obj) { // from class: X.1bu
            public final Object A00;

            {
                this.A00 = obj;
            }

            @Override // X.C1bw
            public Object AIn(C1c5 c1c5) {
                return this.A00;
            }
        };
        return c1bq.A00();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Component<");
        sb.append(Arrays.toString(this.A04.toArray()));
        sb.append(">{");
        sb.append(this.A00);
        sb.append(", type=");
        sb.append(this.A01);
        sb.append(", deps=");
        sb.append(Arrays.toString(this.A03.toArray()));
        return 1BL.A0v(sb);
    }
}
