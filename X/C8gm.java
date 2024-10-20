package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.8gm, reason: invalid class name */
/* loaded from: 8gm.class */
public final class C8gm extends 1LH {
    public final C9cu A00;
    public final C9i4 A01;
    public final ESJ A02;
    public final Function1 A03;
    public final boolean A04;
    public final 2lO A05;

    public C8gm(2lO r302, C9cu c9cu, C9i4 c9i4, ESJ esj, Function1 function1, boolean z) {
        1BL.A1H(esj, c9i4, c9cu);
        this.A02 = esj;
        this.A01 = c9i4;
        this.A00 = c9cu;
        this.A05 = r302;
        this.A03 = function1;
        this.A04 = z;
    }

    private final boolean A01() {
        Eyx eyx;
        EJY ejy = this.A02;
        EJY ejy2 = ejy instanceof EJY ? ejy : null;
        if (ejy2 != null && (eyx = ejy2.A00) != null) {
            List list = eyx.A02;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (((F9y) it.next()).A02 == 0S2.A00) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0238, code lost:
    
        if (r312 != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (r301.A01.A03 == false) goto L6;
     */
    /* JADX WARN: Type inference failed for: r0v17, types: [X.0Je, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0s(X.C2k5 r302) {
        /*
            Method dump skipped, instructions count: 1302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8gm.A0s(X.2k5):X.1LI");
    }
}
