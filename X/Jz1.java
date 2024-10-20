package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import java.io.Serializable;

/* loaded from: Jz1.class */
public final class Jz1 extends JzF implements Serializable {
    public static final long serialVersionUID = 1;
    public final JzF _delegate;
    public final Class[] _views;

    public Jz1(JzF jzF, Class[] clsArr) {
        super(jzF._name, jzF);
        this._delegate = jzF;
        this._views = clsArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    @Override // X.JzF
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A04(X.28Q r302, X.C26c r303, java.lang.Object r304) {
        /*
            r301 = this;
            r0 = r303
            java.lang.Class r0 = r0._serializationView
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L40
            r0 = r301
            java.lang.Class[] r0 = r0._views
            r306 = r0
            r0 = r306
            int r0 = r0.length
            r307 = r0
            r0 = 0
            r308 = r0
        L19:
            r0 = r308
            r1 = r307
            if (r0 >= r1) goto L46
            r0 = r301
            java.lang.Class[] r0 = r0._views
            r1 = r308
            r0 = r0[r1]
            r306 = r0
            r0 = r306
            r1 = r305
            boolean r0 = r0.isAssignableFrom(r1)
            r309 = r0
            r0 = r309
            if (r0 != 0) goto L40
            r0 = r308
            r1 = 1
            int r0 = r0 + r1
            r308 = r0
            goto L19
        L40:
            r0 = 1
            r308 = r0
            goto L49
        L46:
            r0 = 0
            r308 = r0
        L49:
            r0 = r301
            X.JzF r0 = r0._delegate
            r306 = r0
            r0 = r308
            if (r0 == 0) goto L5d
            r0 = r306
            r1 = r302
            r2 = r303
            r3 = r304
            r0.A04(r1, r2, r3)
            return
        L5d:
            X.27Z r0 = X.28Q.A01
            r306 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Jz1.A04(X.28Q, X.26c, java.lang.Object):void");
    }

    @Override // X.JzF
    public void A06(JsonSerializer jsonSerializer) {
        this._delegate.A06(jsonSerializer);
    }
}
