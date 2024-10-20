package X;

import java.util.List;

/* loaded from: Ews.class */
public final class Ews {
    public final FxZ A00;
    public volatile Integer A01 = 0S2.A00;
    public volatile List A02;

    public Ews(FxZ fxZ) {
        this.A00 = fxZ;
    }

    public final void A00(Integer num) {
        List A0V;
        2JB.A02("Handler's active status can only be changed on the main thread");
        Integer num2 = this.A01;
        if (num2 != num) {
            int intValue = num2.intValue();
            int intValue2 = num.intValue();
            if (intValue > intValue2) {
                throw AnonymousClass001.A0N(0Pz.A0v("Invalid transition from ", 2 - intValue != 0 ? "PENDING" : "INACTIVE", " to ", 1 - intValue2 != 0 ? "INACTIVE" : "ACTIVE"));
            }
            synchronized (this) {
                this.A01 = num;
                List list = this.A02;
                A0V = list != null ? 0QD.A0V(list) : null;
                List list2 = this.A02;
                if (list2 != null) {
                    list2.clear();
                }
                this.A02 = null;
            }
            if (A0V == null || num != 0S2.A01) {
                return;
            }
            for (Object obj : A0V) {
                FxZ fxZ = this.A00;
                EHc eHc = (EHc) obj;
                if (2JB.A03()) {
                    FxZ.A04(fxZ, eHc);
                } else {
                    FxZ.A0P.post(new G4m(fxZ, eHc, this));
                }
            }
        }
    }

    public final void A01(Object obj) {
        synchronized (this) {
            if (this.A01 != 0S2.A0C) {
                if (this.A01 == 0S2.A00) {
                    if (this.A02 == null) {
                        this.A02 = AnonymousClass001.A0s();
                    }
                    List list = this.A02;
                    if (list != null) {
                        list.add(obj);
                    }
                } else {
                    FxZ fxZ = this.A00;
                    EHc eHc = (EHc) obj;
                    if (2JB.A03()) {
                        FxZ.A04(fxZ, eHc);
                    } else {
                        FxZ.A0P.post(new G4m(fxZ, eHc, this));
                    }
                }
            }
        }
    }
}
