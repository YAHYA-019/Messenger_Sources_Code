package X;

import com.facebook.inject.FbInjector;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;

/* loaded from: Ewk.class */
public final class Ewk {
    public final C00i A01 = AbH.A0a();
    public final C00i A02 = AbH.A0S();
    public final C00i A00 = FbInjector.A00;

    public ArrayList A00() {
        ArrayList A0s = AnonymousClass001.A0s();
        EPg[] values = EPg.values();
        int length = values.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0s;
            }
            EPg ePg = values[i2];
            Date date = new Date(1BL.A08(this.A01));
            if (!date.before(ePg.startDate) && !date.after(ePg.endDate)) {
                A0s.add(ePg);
            }
            i = i2 + 1;
        }
    }

    public void A01(EPg ePg, int i) {
        int i2;
        int i3;
        String str;
        ENb eNb;
        Set stringSet = new 01V(1BK.A04(this.A00)).A00().A00("OfflineExperimentUniverse").getStringSet(F3w.A00(ePg.name), AnonymousClass001.A0v());
        if (stringSet.isEmpty() || (eNb = ePg.universe) == null || eNb.name == null) {
            if (i == 0) {
                i3 = 0;
            } else {
                if (i != -1) {
                    i2 = ePg.groupSize;
                } else {
                    i = ePg.groupSize;
                    i2 = ePg.groupCount;
                }
                i3 = i * i2;
            }
            str = ePg.name;
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = stringSet.iterator();
            while (it.hasNext()) {
                AnonymousClass001.A1J(A0s, Integer.parseInt(AnonymousClass001.A0i(it)));
            }
            Collections.sort(A0s);
            i3 = i != -1 ? AnonymousClass001.A03(A0s.get(i * ePg.groupSize)) : 10000;
            ENb eNb2 = ePg.universe;
            str = eNb2 != null ? eNb2.name : null;
        }
        1G2 A01 = 1G3.A01(F3w.A01, str);
        1Ql A0V = 1BL.A0V(this.A02);
        A0V.CaE(A01, i3);
        A0V.commit();
    }
}
