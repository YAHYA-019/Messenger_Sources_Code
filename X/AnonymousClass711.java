package X;

import java.util.Iterator;
import java.util.Set;

/* renamed from: X.711, reason: invalid class name */
/* loaded from: 711.class */
public class AnonymousClass711 {
    public final 1Br A00 = 1Bu.A00(67172);
    public final Set A01 = 02H.A01(new String[]{"xma_external_link", "xma_web_url", "xma_open_native"});

    private final boolean A00(C5fv c5fv) {
        if (!(c5fv instanceof C5n8)) {
            return false;
        }
        C5n8 c5n8 = (C5n8) c5fv;
        6AR r0 = c5n8.A03;
        if ((r0 instanceof 6AR) && this.A01.contains(r0.A05)) {
            return true;
        }
        Iterator it = c5n8.A0D.iterator();
        while (it.hasNext()) {
            6AR r02 = (C5vw) ((C82j) it.next()).A01;
            if ((r02 instanceof 6AR) && this.A01.contains(r02.A05)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0050, code lost:
    
        if (r0.A00 <= 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A01(X.C5fv r302, int r303) {
        /*
            Method dump skipped, instructions count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass711.A01(X.5fv, int):boolean");
    }
}
