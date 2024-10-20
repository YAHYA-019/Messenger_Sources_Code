package X;

import com.google.common.collect.ImmutableList;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: Ch6.class */
public final class Ch6 implements DEd {
    public final /* synthetic */ C1531Akk A00;

    public Ch6(C1531Akk c1531Akk) {
        this.A00 = c1531Akk;
    }

    @Override // X.DEd
    public void CJE(Object obj) {
        COs cOs;
        Integer num;
        C1531Akk c1531Akk = this.A00;
        if (c1531Akk.A0K.isEmpty()) {
            if (c1531Akk.A0N || !c1531Akk.A0d.get()) {
                c1531Akk.A0d.set(true);
                if (!c1531Akk.A0O) {
                    c1531Akk.A0O = true;
                    c1531Akk.A1X();
                }
                Cc4 cc4 = c1531Akk.A0E;
                BP5 bp5 = c1531Akk.A09;
                int size = c1531Akk.A0I.size();
                if (bp5 != null) {
                    int ordinal = bp5.ordinal();
                    if (ordinal == 36) {
                        cOs = cc4.A0N;
                        num = 0S2.A01;
                    } else if (ordinal == 37) {
                        cOs = cc4.A0M;
                        num = 0S2.A0N;
                    } else {
                        if (ordinal != 38) {
                            return;
                        }
                        cOs = cc4.A0L;
                        num = 0S2.A0C;
                    }
                    AtomicBoolean atomicBoolean = cOs.A0B;
                    if (atomicBoolean.get()) {
                        return;
                    }
                    atomicBoolean.set(true);
                    ImmutableList A01 = COs.A01(cOs, COs.A02(cOs, num), num);
                    if (size + A01.size() < 3 || A01.isEmpty()) {
                        CxX cxX = cOs.A00;
                        if (cxX == null) {
                            cxX = new CxX(num, cOs, 2);
                            cOs.A00 = cxX;
                        }
                        ((C21N) cOs.A0D.getValue()).A00(cxX);
                        ((C00683ob) cOs.A0C.getValue()).A09(new Czj(cOs, num, 74), 11T.A03(Integer.valueOf(6Bt.A00(num))));
                    } else {
                        atomicBoolean.set(false);
                    }
                    cOs.A08.A00(A01, num);
                    cOs.A0A.set(false);
                }
            }
        }
    }
}
