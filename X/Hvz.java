package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hvz.class */
public abstract class Hvz {
    public static I4d A00(Context context, I9V i9v, File file, List list, List list2) {
        Huc huc;
        I4d i4d = new I4d();
        HAy hAy = HAy.A03;
        Hpx hpx = new Hpx(file);
        hpx.A03 = i9v;
        HuY A00 = hpx.A00();
        I9H i9h = new I9H(hAy);
        i9h.A02(A00);
        Huc huc2 = new Huc(i9h);
        if (new IjH(context, false).ARj(Uri.fromFile(file)).A0K) {
            HAy hAy2 = HAy.A01;
            Hpx hpx2 = new Hpx(file);
            hpx2.A03 = i9v;
            HuY A002 = hpx2.A00();
            I9H i9h2 = new I9H(hAy2);
            i9h2.A02(A002);
            huc = new Huc(i9h2);
        } else {
            huc = null;
        }
        i4d.A03(huc2);
        A01(hAy, i4d, list);
        if (huc != null) {
            i4d.A03(huc);
            A01(HAy.A01, i4d, list2);
        }
        return i4d;
    }

    public static void A01(HAy hAy, I4d i4d, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            RSc rSc = (RSc) it.next();
            i4d.A01(rSc.A00, hAy, rSc.A01);
        }
    }
}
