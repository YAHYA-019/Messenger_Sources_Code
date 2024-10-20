package X;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: X.0mr, reason: invalid class name */
/* loaded from: 0mr.class */
public final class C0mr implements 0iG {
    public 0hZ A7X(0hZ r302, Integer num) {
        11T.A0F(num, 0);
        11T.A0F(r302, 1);
        if (num == 0S2.A0C || num == 0S2.A0j || num == 0S2.A1J || num == 0S2.A0Y) {
            r302.A06(C0gp.A00() ? C0gq.LARGE_REPORT : C0gq.CRITICAL_REPORT, new 0hY() { // from class: X.0dn
                public /* bridge */ /* synthetic */ Object AIl(C0hg c0hg) {
                    11T.A0F(c0hg, 0);
                    HashSet A03 = c0hg.A07().A03();
                    int size = A03.size();
                    File[] fileArr = new File[size];
                    Iterator it = A03.iterator();
                    int i = 0;
                    while (true) {
                        int i2 = i;
                        if (!it.hasNext()) {
                            0jV r0 = 0GU.A02;
                            return new 0GU(02M.A00(), (File[]) Arrays.copyOf(fileArr, size));
                        }
                        fileArr[i2] = c0hg.A07().A02((String) it.next());
                        i = i2 + 1;
                    }
                }
            });
        }
        return r302;
    }

    public C0hh A7Y(C0hh c0hh, C0o0 c0o0) {
        11T.A0F(c0hh, 1);
        c0hh.A01(new C0o2(this, 2));
        return c0hh;
    }
}
