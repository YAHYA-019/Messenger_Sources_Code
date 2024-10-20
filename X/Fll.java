package X;

import com.facebook.payments.checkout.model.CheckoutData;
import com.facebook.payments.checkout.model.SimpleCheckoutData;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Fll.class */
public final class Fll implements GK3 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Fll(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.GK3
    public void BzY() {
        AtomicBoolean atomicBoolean;
        boolean BTn;
        switch (this.A00) {
            case 0:
                DZz dZz = (DZz) this.A01;
                java.util.Map map = dZz.A0Q;
                GKM gkm = (GKM) this.A02;
                map.put(gkm.AnR(), Boolean.valueOf(gkm.BTn()));
                atomicBoolean = dZz.A0R;
                BTn = map.containsValue(AnonymousClass001.A0K());
                break;
            case 1:
                atomicBoolean = ((DZe) this.A01).A0X;
                BTn = ((GKM) this.A02).BTn();
                break;
            default:
                return;
        }
        atomicBoolean.set(BTn);
    }

    @Override // X.GK3
    public void C4o(boolean z) {
        switch (this.A00) {
            case 0:
                DZz dZz = (DZz) this.A01;
                java.util.Map map = dZz.A0Q;
                map.put(((GKM) this.A02).AnR(), Boolean.valueOf(z));
                AtomicBoolean atomicBoolean = dZz.A0R;
                atomicBoolean.set(map.containsValue(AnonymousClass001.A0K()));
                dZz.A08.C4o(atomicBoolean.get());
                return;
            case 1:
                DZe dZe = (DZe) this.A01;
                AtomicBoolean atomicBoolean2 = dZe.A0X;
                GKM gkm = (GKM) this.A02;
                atomicBoolean2.set(gkm.BTn());
                if (dZe.isResumed()) {
                    if (atomicBoolean2.get()) {
                        DZe.A0B(dZe, gkm.AnR());
                        return;
                    } else {
                        if (DZe.A0F(dZe)) {
                            return;
                        }
                        DZe.A0A(dZe, gkm.AnR());
                        return;
                    }
                }
                return;
            default:
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00d8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:41:0x022a A[LOOP:1: B:39:0x021c->B:41:0x022a, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x028b A[SYNTHETIC] */
    @Override // X.GK3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void CHl(int r302, int r303, android.content.Intent r304) {
        /*
            Method dump skipped, instructions count: 1469
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fll.CHl(int, int, android.content.Intent):void");
    }

    @Override // X.GK3
    public void CsT(QoM qoM) {
        switch (this.A00) {
            case 0:
                DZz dZz = (DZz) this.A01;
                FIS A07 = DZz.A07(dZz);
                CheckoutData checkoutData = dZz.A0A;
                FIS.A03(A07, FIS.A02(qoM, (SimpleCheckoutData) checkoutData, ((GKM) this.A02).AnR()));
                return;
            case 1:
                return;
            default:
                ((DZx) this.A01).A01.CsT(qoM);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0088, code lost:
    
        if (r302 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x002b, code lost:
    
        if (r302 != 0) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0032, code lost:
    
        if (r302 == 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x003a, code lost:
    
        if (r302 == 8) goto L20;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0006. Please report as an issue. */
    @Override // X.GK3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setVisibility(int r302) {
        /*
            r301 = this;
            r0 = r301
            int r0 = r0.A00
            r303 = r0
            r0 = r303
            switch(r0) {
                case 0: goto L79;
                case 1: goto L43;
                default: goto L1c;
            }
        L1c:
            r0 = r301
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r304 = r0
            r0 = r304
            X.06c r0 = X.AbJ.A09(r0)
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L9c
        L2e:
            r0 = 4
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L65
            r0 = 8
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L65
        L3d:
            r0 = r305
            r0.A05()
            return
        L43:
            r0 = r302
            if (r0 == 0) goto L8e
            r0 = 4
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L57
            r0 = 8
            r303 = r0
            r0 = r302
            r1 = r303
            if (r0 == r1) goto L57
            return
        L57:
            r0 = r301
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r304 = r0
            r0 = r304
            X.06c r0 = X.AbJ.A09(r0)
            r305 = r0
        L65:
            r0 = r301
            java.lang.Object r0 = r0.A02
            X.GKM r0 = (X.GKM) r0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r304 = r0
            r0 = r305
            r1 = r304
            r0.A0H(r1)
            goto L3d
        L79:
            r0 = r301
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r304 = r0
            r0 = r304
            X.06c r0 = X.AbJ.A09(r0)
            r305 = r0
            r0 = r302
            if (r0 == 0) goto L9c
            goto L2e
        L8e:
            r0 = r301
            java.lang.Object r0 = r0.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r304 = r0
            r0 = r304
            X.06c r0 = X.AbJ.A09(r0)
            r305 = r0
        L9c:
            r0 = r301
            java.lang.Object r0 = r0.A02
            X.GKM r0 = (X.GKM) r0
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            r304 = r0
            r0 = r305
            r1 = r304
            r0.A0K(r1)
            goto L3d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Fll.setVisibility(int):void");
    }
}
