package X;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: L6A.class */
public abstract class L6A {
    public static final List A00(List list) {
        String BIR;
        Uri A03;
        String scheme;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MOF Ak2 = ((MPz) it.next()).Ak2();
            if (Ak2 == null || (BIR = Ak2.BIR()) == null || (A03 = C0A2.A03(BIR)) == null || (scheme = A03.getScheme()) == null || !scheme.equalsIgnoreCase("https")) {
                throw AnonymousClass001.A0L("Link has to be https");
            }
            A0s.add(String.valueOf(A03));
        }
        return 0QD.A0V(A0s);
    }

    public static final List A01(List list, int i, int i2) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MPz mPz = (MPz) it.next();
            A0s.add(new RMD(Integer.valueOf(i), mPz.getLength(), mPz.Azy() + i2));
        }
        return 0QD.A0V(A0s);
    }

    public static final List A02(List list, int i, boolean z) {
        String scheme;
        String BIR;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MPz mPz = (MPz) it.next();
            MOF Ak2 = mPz.Ak2();
            String str = null;
            Uri A03 = (Ak2 == null || (BIR = Ak2.BIR()) == null) ? null : C0A2.A03(BIR);
            if (z && (A03 == null || (scheme = A03.getScheme()) == null || !scheme.equalsIgnoreCase("https"))) {
                throw AnonymousClass001.A0L("Link has to be https");
            }
            int length = mPz.getLength();
            int Azy = mPz.Azy() + i;
            if (Boolean.valueOf(z).booleanValue() && A03 != null) {
                str = A03.toString();
            }
            A0s.add(new RYu(length, Azy, str));
        }
        return 0QD.A0V(A0s);
    }
}
