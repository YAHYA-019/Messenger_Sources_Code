package X;

import java.util.List;

/* renamed from: X.Ap3, reason: case insensitive filesystem */
/* loaded from: Ap3.class */
public final class C1661Ap3 extends 2rI {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C1661Ap3(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void A02(1OW r302) {
        if (this.A00 != 0) {
            ((C5pz) this.A02).Blg();
        } else {
            ((C5rt) this.A02).Blg();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Throwable, java.util.List] */
    public void A03(1OW r302) {
        if (this.A00 != 0) {
            if (r302 != null) {
                2EU r0 = (2EU) r302.B7p();
                if (r0 != null) {
                    if (AbG.A1a(r0)) {
                        ((C5pz) this.A02).BpV(r0);
                        return;
                    }
                    r0.close();
                }
                ((C5pz) this.A02).Blg();
                return;
            }
            return;
        }
        if (r302 == null || r302.B7p() == null) {
            ((C5rt) this.A02).Blg();
            return;
        }
        ?? r02 = (List) r302.B7p();
        if (r02.isEmpty()) {
            ((C5rt) this.A02).Blg();
        } else {
            ((C5rt) this.A02).BpW(r02);
        }
    }
}
