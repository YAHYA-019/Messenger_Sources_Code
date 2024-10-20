package X;

import java.util.HashMap;
import kotlin.jvm.functions.Function1;

/* loaded from: L0x.class */
public final class L0x {
    public int A01;
    public JaX A02;
    public Object A03;
    public final Function1 A0B;
    public int A00 = -1;
    public final KsG A09 = new KsG();
    public final C2818Jaa A04 = new C2818Jaa(6);
    public final C2820Jac A05 = new C2820Jac(6);
    public final LtK A07 = LtK.A02(new MN3[16]);
    public final MHs A06 = new LNW(this);
    public final KsG A08 = new KsG();
    public final HashMap A0A = AnonymousClass001.A0u();

    public L0x(Function1 function1) {
        this.A0B = function1;
    }

    public static final void A00(JaX jaX, L0x l0x, Object obj, Object obj2, int i) {
        if (l0x.A01 <= 0) {
            int i2 = -1;
            int A01 = JaX.A01(jaX, obj);
            if (A01 < 0) {
                A01 ^= -1;
            } else {
                i2 = ((KuF) jaX).A02[A01];
            }
            ((KuF) jaX).A04[A01] = obj;
            ((KuF) jaX).A02[A01] = i;
            if ((obj instanceof MN3) && i2 != i) {
                C2883Jc4 Afs = ((MN3) obj).Afs();
                l0x.A0A.put(obj, Afs.A04);
                KuF kuF = Afs.A03;
                KsG ksG = l0x.A08;
                ksG.A00(obj);
                Object[] objArr = kuF.A04;
                long[] jArr = kuF.A03;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i3 = 0;
                    while (true) {
                        int i4 = i3;
                        long j = jArr[i4];
                        if ((JQy.A0L(j) & (-9187201950435737472L)) != -9187201950435737472L) {
                            int A0G = JR0.A0G(i4, length);
                            int i5 = 0;
                            while (true) {
                                int i6 = i5;
                                if (i6 >= A0G) {
                                    break;
                                }
                                if ((j & 255) < 128) {
                                    LO7 lo7 = (MJO) JQx.A0t(objArr, i4, i6);
                                    if (lo7 instanceof LO7) {
                                        lo7.A03(2);
                                    }
                                    ksG.A01(lo7, obj);
                                }
                                j >>= 8;
                                i5 = i6 + 1;
                            }
                            if (A0G != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        } else {
                            i3 = i4 + 1;
                        }
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof LO7) {
                    ((LO7) obj).A03(2);
                }
                l0x.A09.A01(obj, obj2);
            }
        }
    }
}
