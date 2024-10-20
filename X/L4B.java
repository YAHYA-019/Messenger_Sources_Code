package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: L4B.class */
public final class L4B {
    public View A00;
    public final java.util.Map A02 = AnonymousClass001.A0u();
    public final ArrayList A01 = AnonymousClass001.A0s();

    public L4B() {
    }

    public L4B(View view) {
        this.A00 = view;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0038, code lost:
    
        if (r301.A02.equals(r0.A02) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof X.L4B
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3b
            r0 = r301
            android.view.View r0 = r0.A00
            r304 = r0
            r0 = r302
            X.L4B r0 = (X.L4B) r0
            r302 = r0
            r0 = r302
            android.view.View r0 = r0.A00
            r305 = r0
            r0 = r304
            r1 = r305
            if (r0 != r1) goto L3b
            r0 = r301
            java.util.Map r0 = r0.A02
            r304 = r0
            r0 = r302
            java.util.Map r0 = r0.A02
            r305 = r0
            r0 = r304
            r1 = r305
            boolean r0 = r0.equals(r1)
            r306 = r0
            r0 = 1
            r303 = r0
            r0 = r306
            if (r0 != 0) goto L40
        L3b:
            r0 = 0
            r303 = r0
            r0 = 0
            r305 = r0
        L40:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.L4B.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return 1BL.A03(this.A00) + this.A02.hashCode();
    }

    public String toString() {
        StringBuilder A0n = AnonymousClass001.A0n(0Pz.A0j("TransitionValues@", Integer.toHexString(hashCode()), ":\n"));
        A0n.append("    view = ");
        A0n.append(this.A00);
        String A0W = 0Pz.A0W(AnonymousClass001.A0d("\n", A0n), "    values:");
        java.util.Map map = this.A02;
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            String A0i = AnonymousClass001.A0i(A1B);
            StringBuilder A0n2 = AnonymousClass001.A0n(A0W);
            A0n2.append("    ");
            A0n2.append(A0i);
            A0n2.append(": ");
            A0n2.append(map.get(A0i));
            A0W = AnonymousClass001.A0d("\n", A0n2);
        }
        return A0W;
    }
}
