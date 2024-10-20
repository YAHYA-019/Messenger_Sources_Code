package X;

import android.util.Pair;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.GiN, reason: case insensitive filesystem */
/* loaded from: GiN.class */
public final class C2586GiN extends 4bA {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C2586GiN(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public void A00() {
        InterfaceC04444az interfaceC04444az;
        Pair pair;
        boolean remove;
        ArrayList arrayList;
        C04364ar c04364ar;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        switch (this.A00) {
            case 0:
                ((AtomicBoolean) this.A02).set(true);
                return;
            case 1:
            case 2:
            default:
                ((AbstractRunnableC04534b9) this.A02).A02();
                return;
            case 3:
                C04584be c04584be = (C04584be) this.A01;
                synchronized (c04584be) {
                    CopyOnWriteArraySet copyOnWriteArraySet = c04584be.A06;
                    pair = (Pair) this.A02;
                    remove = copyOnWriteArraySet.remove(pair);
                    arrayList = null;
                    if (!remove) {
                        c04364ar = null;
                        arrayList2 = null;
                    } else if (copyOnWriteArraySet.isEmpty()) {
                        c04364ar = c04584be.A02;
                        arrayList2 = null;
                    } else {
                        ArrayList A02 = C04584be.A02(c04584be);
                        arrayList2 = C04584be.A03(c04584be);
                        arrayList3 = C04584be.A01(c04584be);
                        c04364ar = null;
                        arrayList = A02;
                    }
                    arrayList3 = null;
                }
                C04364ar.A01(arrayList);
                C04364ar.A02(arrayList2);
                C04364ar.A00(arrayList3);
                if (c04364ar != null) {
                    if (!c04584be.A07.A04 || c04364ar.BV1()) {
                        c04364ar.A03();
                    } else {
                        2rC r0 = 2rC.A03;
                        synchronized (c04364ar) {
                            try {
                                if (r0 == c04364ar.A00) {
                                    arrayList4 = null;
                                } else {
                                    c04364ar.A00 = r0;
                                    arrayList4 = 1BK.A17(c04364ar.A0B);
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                        C04364ar.A02(arrayList4);
                    }
                }
                if (remove) {
                    interfaceC04444az = (InterfaceC04444az) pair.first;
                    break;
                } else {
                    return;
                }
            case 4:
                5qA r02 = (5qA) this.A01;
                if (5qA.A01(r02)) {
                    interfaceC04444az = r02.A00;
                    break;
                } else {
                    return;
                }
            case 5:
                AbstractRunnableC04534b9 abstractRunnableC04534b9 = (AbstractRunnableC04534b9) this.A01;
                abstractRunnableC04534b9.A02();
                ((C04284aj) this.A02).A01.Cdn(abstractRunnableC04534b9);
                return;
        }
        interfaceC04444az.Bn2();
    }

    public void A01() {
        if (3 - this.A00 != 0) {
            super.A01();
        } else {
            C04364ar.A00(C04584be.A01((C04584be) this.A01));
        }
    }

    public void A02() {
        if (3 - this.A00 != 0) {
            super.A02();
        } else {
            C04364ar.A01(C04584be.A02((C04584be) this.A01));
        }
    }

    public void A03() {
        if (3 - this.A00 != 0) {
            super.A03();
        } else {
            C04364ar.A02(C04584be.A03((C04584be) this.A01));
        }
    }
}
