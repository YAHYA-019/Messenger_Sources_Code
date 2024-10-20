package androidx.compose.runtime;

import X.04S;
import X.0DO;
import X.0DR;
import X.0Xs;
import X.C0Bd;
import X.C2820Jac;
import X.JQx;
import X.JQz;
import X.JR0;
import X.MMw;
import java.util.List;

/* loaded from: Recomposer$runRecomposeAndApplyChanges$2.class */
public final class Recomposer$runRecomposeAndApplyChanges$2 extends 0DO implements C0Bd {
    public /* synthetic */ Object L$0;
    public Object L$1;
    public Object L$2;
    public Object L$3;
    public Object L$4;
    public Object L$5;
    public Object L$6;
    public Object L$7;
    public Object L$8;
    public int label;
    public final /* synthetic */ Recomposer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recomposer$runRecomposeAndApplyChanges$2(Recomposer recomposer, 0DR r303) {
        super(3, r303);
        this.this$0 = recomposer;
    }

    public static final void A01(C2820Jac c2820Jac, C2820Jac c2820Jac2, C2820Jac c2820Jac3, C2820Jac c2820Jac4, Recomposer recomposer, List list, List list2, List list3) {
        0Xs r0 = Recomposer.A0N;
        synchronized (recomposer.A0D) {
            list.clear();
            list2.clear();
            int size = list3.size();
            int i = 0;
            while (true) {
                int i2 = i;
                if (i2 >= size) {
                    break;
                }
                MMw mMw = (MMw) list3.get(i2);
                mMw.A3c();
                Recomposer.A02(mMw, recomposer);
                i = i2 + 1;
            }
            list3.clear();
            Object[] objArr = c2820Jac.A03;
            long[] jArr = c2820Jac.A02;
            int length = jArr.length - 2;
            long j = -1;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    int i4 = i3;
                    long j2 = jArr[i4];
                    if ((JQz.A0I(j2, 7) & (-9187201950435737472L)) != -9187201950435737472L) {
                        int A0G = JR0.A0G(i4, length);
                        for (int i5 = 0; i5 < A0G; i5++) {
                            if ((j2 & 255) < 128) {
                                MMw mMw2 = (MMw) JQx.A0t(objArr, i4, i5);
                                mMw2.A3c();
                                Recomposer.A02(mMw2, recomposer);
                            }
                            j2 >>= 8;
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
            c2820Jac.A06();
            Object[] objArr2 = c2820Jac2.A03;
            long[] jArr2 = c2820Jac2.A02;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i6 = 0;
                while (true) {
                    int i7 = i6;
                    long j3 = jArr2[i7];
                    if ((((j3 ^ j) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int A0G2 = JR0.A0G(i7, length2);
                        for (int i8 = 0; i8 < A0G2; i8++) {
                            if ((j3 & 255) < 128) {
                                ((MMw) JQx.A0t(objArr2, i7, i8)).AEl();
                            }
                            j3 >>= 8;
                        }
                        if (A0G2 != 8) {
                            break;
                        }
                    }
                    if (i7 == length2) {
                        break;
                    } else {
                        i6 = i7 + 1;
                    }
                }
            }
            c2820Jac2.A06();
            c2820Jac3.A06();
            Object[] objArr3 = c2820Jac4.A03;
            long[] jArr3 = c2820Jac4.A02;
            int length3 = jArr3.length - 2;
            if (length3 >= 0) {
                int i9 = 0;
                while (true) {
                    int i10 = i9;
                    long j4 = jArr3[i10];
                    if ((((j4 ^ j) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int A0G3 = JR0.A0G(i10, length3);
                        for (int i11 = 0; i11 < A0G3; i11++) {
                            if ((j4 & 255) < 128) {
                                MMw mMw3 = (MMw) JQx.A0t(objArr3, i10, i11);
                                mMw3.A3c();
                                Recomposer.A02(mMw3, recomposer);
                            }
                            j4 >>= 8;
                        }
                        if (A0G3 != 8) {
                            break;
                        }
                    }
                    if (i10 == length3) {
                        break;
                    } else {
                        i9 = i10 + 1;
                    }
                }
            }
            c2820Jac4.A06();
        }
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        Recomposer$runRecomposeAndApplyChanges$2 recomposer$runRecomposeAndApplyChanges$2 = new Recomposer$runRecomposeAndApplyChanges$2(this.this$0, (0DR) obj3);
        recomposer$runRecomposeAndApplyChanges$2.L$0 = obj2;
        return recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(04S.A00);
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x027a, code lost:
    
        if (r321 == r0) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0097 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02f7  */
    /* JADX WARN: Type inference failed for: r0v175, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v178, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v181, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v205, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v208, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v211, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v91, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r325v2, types: [java.util.AbstractCollection] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x02f4 -> B:41:0x01c5). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x036a -> B:8:0x007e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r302) {
        /*
            Method dump skipped, instructions count: 899
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.Recomposer$runRecomposeAndApplyChanges$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
