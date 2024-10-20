package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: Ev3.class */
public final class Ev3 {
    public final Ejb A00;
    public final F3d A01;
    public final List A02;
    public final java.util.Map A03;
    public final Set A04 = 7zL.A15();

    public Ev3(Ejb ejb, F3d f3d, List list, java.util.Map map) {
        this.A00 = ejb;
        this.A01 = f3d;
        this.A02 = 7zO.A10(list, 0);
        this.A03 = new LinkedHashMap(map);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        if (r0.A0f((X.FyG) r301.A00.A01, r302) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00(X.DLQ r302) {
        /*
            r301 = this;
            X.FGp r0 = X.FGp.A00()
            r303 = r0
            r0 = r303
            X.FJG r0 = r0.A03
            r304 = r0
            r0 = r302
            int r0 = r0.A05
            r305 = r0
            r0 = r305
            boolean r0 = X.1Wg.A0D(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L45
            r0 = 13326(0x340e, float:1.8674E-41)
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L45
            r0 = 13336(0x3418, float:1.8688E-41)
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L45
            r0 = 16927(0x421f, float:2.372E-41)
            r306 = r0
            r0 = r305
            r1 = r306
            if (r0 == r1) goto L45
        L3f:
            r0 = 0
            r305 = r0
        L42:
            r0 = r305
            return r0
        L45:
            r0 = r301
            X.Ejb r0 = r0.A00
            java.lang.Object r0 = r0.A01
            X.FyG r0 = (X.FyG) r0
            r303 = r0
            r0 = r304
            r1 = r303
            r2 = r302
            boolean r0 = r0.A0f(r1, r2)
            r306 = r0
            r0 = 1
            r305 = r0
            r0 = r306
            if (r0 != 0) goto L42
            goto L3f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ev3.A00(X.DLQ):boolean");
    }
}
