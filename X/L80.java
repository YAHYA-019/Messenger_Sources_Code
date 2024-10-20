package X;

import android.util.SparseIntArray;
import com.facebook.hyperthrift.HyperThriftBase;
import com.facebook.logginginfra.falco.Checksum;
import com.facebook.logginginfra.falco.Identity;
import com.facebook.logginginfra.falco.SetQPLConfigDirective;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: L80.class */
public final class L80 {
    public final 1IU A00;

    public L80(1IU r302) {
        this.A00 = r302;
    }

    public static int A00(HyperThriftBase hyperThriftBase) {
        Number number = (Number) hyperThriftBase.A00(0);
        number.getClass();
        return number.intValue();
    }

    public static Integer A01(Long l) {
        long longValue = l.longValue();
        if (longValue == 0) {
            return 0S2.A00;
        }
        if (longValue == 1) {
            return 0S2.A01;
        }
        if (longValue == 2) {
            return 0S2.A0C;
        }
        if (longValue == 4) {
            return 0S2.A0N;
        }
        if (longValue == 8) {
            return 0S2.A0Y;
        }
        if (longValue == 16) {
            return 0S2.A0j;
        }
        if (longValue == 32) {
            return 0S2.A0u;
        }
        if (longValue == 64) {
            return 0S2.A15;
        }
        if (longValue == 128) {
            return 0S2.A1G;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v261, types: [X.KfY, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.KSX, java.lang.Object] */
    public 4VG A02(SetQPLConfigDirective setQPLConfigDirective) {
        Object obj;
        boolean z;
        LinkedHashMap A1C;
        HyperThriftBase hyperThriftBase = (HyperThriftBase) setQPLConfigDirective.A00(0);
        List<HyperThriftBase> list = (List) setQPLConfigDirective.A00(1);
        if (list == null) {
            list = Collections.emptyList();
        }
        List<HyperThriftBase> list2 = (List) setQPLConfigDirective.A00(2);
        try {
            SparseIntArray sparseIntArray = new SparseIntArray();
            1ZQ r0 = new 1ZQ();
            for (HyperThriftBase hyperThriftBase2 : list) {
                int A00 = A00(hyperThriftBase2);
                Number number = (Number) hyperThriftBase2.A00(1);
                number.getClass();
                int intValue = number.intValue();
                Object A002 = hyperThriftBase2.A00(2);
                sparseIntArray.put(A00, intValue);
                r0.put(A00, A002);
            }
            Khj khj = new Khj(sparseIntArray, r0);
            C1L8 A003 = 1L6.A00();
            Iterator it = list.iterator();
            while (true) {
                long j = 0;
                if (!it.hasNext()) {
                    break;
                }
                HyperThriftBase hyperThriftBase3 = (HyperThriftBase) it.next();
                int A004 = A00(hyperThriftBase3);
                List list3 = (List) hyperThriftBase3.A00(3);
                if (list3 != null) {
                    Iterator it2 = list3.iterator();
                    while (it2.hasNext()) {
                        j |= JR0.A0X(it2);
                    }
                    A003.put(A004, j);
                }
            }
            KzG kzG = new KzG(A003);
            ?? obj2 = new Object();
            ((KSX) obj2).A00 = new 1ZQ();
            for (HyperThriftBase hyperThriftBase4 : list) {
                int A005 = A00(hyperThriftBase4);
                HashMap hashMap = new HashMap();
                ((KSX) obj2).A00.put(A005, hashMap);
                java.util.Map map = (java.util.Map) hyperThriftBase4.A00(6);
                if (map != null) {
                    Iterator A0y = AnonymousClass001.A0y(map);
                    while (A0y.hasNext()) {
                        1BL.A1O(hashMap, AnonymousClass001.A0z(A0y));
                    }
                }
            }
            1ZQ r02 = new 1ZQ();
            for (HyperThriftBase hyperThriftBase5 : list) {
                int A006 = A00(hyperThriftBase5);
                HyperThriftBase hyperThriftBase6 = (HyperThriftBase) hyperThriftBase5.A00(4);
                if (hyperThriftBase6 != null) {
                    List list4 = (List) hyperThriftBase6.A00(0);
                    String[] A0n = list4 != null ? C3o5.A0n(list4) : null;
                    ?? obj3 = new Object();
                    if (A0n == null) {
                        A1C = null;
                    } else {
                        A1C = 1BK.A1C();
                        for (int i = 0; i < A0n.length; i++) {
                            AnonymousClass001.A1A(A0n[i], A1C, i);
                        }
                    }
                    ((KfY) obj3).A00 = A1C;
                    r02.put(A006, obj3);
                }
            }
            r02.A00 = true;
            r02.size();
            LYA lya = new LYA(r02);
            1ZQ r03 = new 1ZQ();
            if (list2 != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (HyperThriftBase hyperThriftBase7 : list2) {
                    HyperThriftBase hyperThriftBase8 = (HyperThriftBase) hyperThriftBase7.A00(1);
                    HyperThriftBase hyperThriftBase9 = (HyperThriftBase) hyperThriftBase7.A00(0);
                    if (hyperThriftBase9 != null) {
                        Long l = (Long) hyperThriftBase9.A00(0);
                        if (l != null) {
                            Integer A01 = A01(l);
                            Integer A012 = A01(Long.valueOf(l.longValue() << 1));
                            if (A01 != null && A012 != null) {
                                new LT8(A012);
                            }
                        }
                        new Object();
                    } else {
                        if (hyperThriftBase8 != null) {
                            Number number2 = (Number) hyperThriftBase8.A00(0);
                            if (number2 != null) {
                                new LT9(number2.intValue());
                            }
                        }
                        new Object();
                    }
                    A0s.add(z);
                }
                int size = list2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    HyperThriftBase hyperThriftBase10 = (HyperThriftBase) list2.get(i2);
                    LT9 lt9 = (MEy) A0s.get(i2);
                    if (lt9 instanceof LT9) {
                        LT9 lt92 = lt9;
                        HyperThriftBase hyperThriftBase11 = (HyperThriftBase) hyperThriftBase10.A00(1);
                        if (hyperThriftBase11 != null) {
                            List list5 = (List) hyperThriftBase11.A00(1);
                            if (list5 != null) {
                                Iterator it3 = list5.iterator();
                                while (it3.hasNext()) {
                                    long A0X = JR0.A0X(it3);
                                    if (A0X < 0 || A0X >= A0s.size()) {
                                        new Object();
                                    } else {
                                        obj = A0s.get((int) A0X);
                                    }
                                    11T.A0F(obj, 0);
                                    lt92.A00.add(obj);
                                }
                            }
                        }
                    }
                }
                List A0V = 0QD.A0V(A0s);
                for (HyperThriftBase hyperThriftBase12 : list) {
                    int A007 = A00(hyperThriftBase12);
                    Number number3 = (Number) hyperThriftBase12.A00(5);
                    if (number3 != null) {
                        long longValue = number3.longValue();
                        if (longValue >= 0 && longValue < A0V.size()) {
                            r03.put(A007, A0V.get((int) longValue));
                        }
                    }
                }
            }
            KfX kfX = new KfX(r03);
            Checksum checksum = (Checksum) setQPLConfigDirective.A00(3);
            checksum.getClass();
            return new 4VG(checksum, hyperThriftBase != null ? (Identity) hyperThriftBase.A00(3) : null, kfX, kzG, khj, (KSX) obj2, lya);
        } catch (NullPointerException unused) {
            return null;
        }
    }
}
