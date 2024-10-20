package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* loaded from: I9t.class */
public abstract class I9t {
    public static H3u A00(JH4 jh4, JH5 jh5, I9e i9e, java.util.Map map) {
        HashMap A0u = AnonymousClass001.A0u();
        SparseArray sparseArray = (SparseArray) map.get(HAy.A03);
        if (sparseArray != null) {
            for (int i = 0; i < sparseArray.size(); i++) {
                A0u.put(Integer.toString(sparseArray.keyAt(i)), sparseArray.valueAt(i));
            }
        }
        return new H3u(i9e, jh4, jh5, A0u, 1);
    }

    public static H3v A01(I9d i9d, JH2 jh2, JH3 jh3, I9e i9e) {
        HashMap A0u = AnonymousClass001.A0u();
        Iterator A0x = AnonymousClass001.A0x(i9d.A07(HAy.A03));
        int i = 0;
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            Integer num = (Integer) A0z.getKey();
            Iterator A1G = GOn.A1G(A0z.getValue());
            while (A1G.hasNext()) {
                A0u.put(Integer.toString(i), new RM6((RSc) A1G.next(), num));
                i++;
            }
        }
        HashMap A0u2 = AnonymousClass001.A0u();
        Iterator A0x2 = AnonymousClass001.A0x(A0u);
        while (A0x2.hasNext()) {
            Map.Entry A0z2 = AnonymousClass001.A0z(A0x2);
            I9V i9v = ((RM6) A0z2.getValue()).A00;
            TimeUnit timeUnit = TimeUnit.MICROSECONDS;
            long max = Math.max(0L, i9v.A03(timeUnit));
            long A02 = i9v.A02(timeUnit);
            if (A02 < 0) {
                A02 = Long.MAX_VALUE;
            }
            A0u2.put(A0z2.getKey(), new I9V(timeUnit, max, A02));
        }
        return new H3v(jh2, jh3, i9e, A0u2, A0u);
    }

    public static ArrayList A02(HAy hAy, I9e i9e, java.util.Map map, long j) {
        ArrayList A0s = AnonymousClass001.A0s();
        SparseArray sparseArray = (SparseArray) map.get(hAy);
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i = 0; i < size; i++) {
                int keyAt = sparseArray.keyAt(i);
                Object valueAt = sparseArray.valueAt(i);
                valueAt.getClass();
                if (((I9V) valueAt).A06(TimeUnit.MICROSECONDS, j, i9e.A1d())) {
                    AnonymousClass001.A1J(A0s, keyAt);
                }
            }
        }
        return A0s;
    }

    public static void A03(JO9 jo9, HAy hAy, Hkg hkg, java.util.Map map) {
        I9d i9d = hkg.A08;
        i9d.getClass();
        HashMap A08 = i9d.A08(hAy);
        if (A08 == null) {
            if (hAy == HAy.A03) {
                throw new Exception();
            }
            return;
        }
        Iterator A0x = AnonymousClass001.A0x(A08);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            int A03 = AnonymousClass001.A03(A0z.getKey());
            Huc huc = (Huc) A0z.getValue();
            long A01 = IEs.A01(jo9, huc, hkg.A0A.A1e());
            SparseArray sparseArray = (SparseArray) map.get(hAy);
            if (sparseArray == null) {
                sparseArray = DKC.A0E();
                map.put(hAy, sparseArray);
            }
            long j = huc.A00;
            sparseArray.put(A03, new I9V(TimeUnit.MICROSECONDS, j, j + A01));
        }
    }
}
