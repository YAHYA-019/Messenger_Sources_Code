package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: F7d.class */
public final class F7d {
    public java.util.Map A00 = AnonymousClass001.A0u();
    public final List A01 = AnonymousClass001.A0s();

    public static Emp A00(FxZ fxZ, F7d f7d) {
        List list = f7d.A01;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Emp emp = (Emp) it.next();
            Object obj = emp.A01.get();
            if (emp.A00.A00 || obj == null) {
                it.remove();
            } else if (obj == fxZ) {
                return emp;
            }
        }
        Emp emp2 = new Emp(fxZ);
        list.add(emp2);
        return emp2;
    }

    public void A01(String str, Object obj) {
        synchronized (this) {
            if (obj != null ? !DKD.A1Y(str, obj, this.A00) : this.A00.containsKey(str)) {
                HashMap A1C = DKC.A1C(this.A00);
                this.A00 = A1C;
                A1C.put(str, obj);
                Iterator it = this.A01.iterator();
                while (it.hasNext()) {
                    Emp emp = (Emp) it.next();
                    final FxZ fxZ = (FxZ) emp.A01.get();
                    if (emp.A00.A00 || fxZ == null) {
                        it.remove();
                    } else {
                        Set set = (Set) emp.A02.get(str);
                        if (set != null) {
                            Iterator it2 = set.iterator();
                            while (it2.hasNext()) {
                                FxZ.A05(new G5u(fxZ, this.A00, obj, "gs", AnonymousClass001.A0i(it2)));
                            }
                        } else {
                            final String str2 = "gs";
                            final java.util.Map map = this.A00;
                            FxZ.A05(new Runnable() { // from class: X.G4l
                                public static final String __redex_internal_original_name = "BloksTreeManager$$ExternalSyntheticLambda1";

                                @Override // java.lang.Runnable
                                public final void run() {
                                    fxZ.A0C(new EHb(str2, map));
                                }
                            });
                        }
                    }
                }
            }
        }
    }
}
