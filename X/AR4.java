package X;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: AR4.class */
public final class AR4 extends C00q implements Function1 {
    public final float A00;
    public final int A01;
    public final Object A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AR4(Object obj, float f, int i) {
        super(1);
        this.A01 = i;
        this.A02 = obj;
        this.A00 = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C88P c88p;
        if (this.A01 != 0) {
            c88p = (C88P) obj;
            11T.A0F(c88p, 0);
            java.util.Map map = c88p.A04;
            Object obj2 = this.A02;
            7WS r0 = (7WS) map.get(obj2);
            if (r0 != null && Math.abs(this.A00 - r0.A00) < 1.0f) {
                LinkedHashMap A1C = 1BK.A1C();
                Iterator A0y = AnonymousClass001.A0y(map);
                while (A0y.hasNext()) {
                    Map.Entry A0z = AnonymousClass001.A0z(A0y);
                    if (7zL.A1X(A0z.getKey(), obj2)) {
                        1BL.A1O(A1C, A0z);
                    }
                }
                ImmutableList immutableList = c88p.A02;
                int size = immutableList.size() - A1C.size();
                int i = c88p.A00;
                java.util.Map map2 = c88p.A03;
                11T.A0F(map2, 3);
                return new C88P(immutableList, A1C, map2, i, size);
            }
        } else {
            long A05 = AnonymousClass001.A05(obj);
            LCF lcf = (LCF) this.A02;
            if (!AnonymousClass001.A1V(lcf.A03.getValue())) {
                long j = A05 / 1;
                float f = this.A00;
                MN0 mn0 = lcf.A02;
                if (mn0.Av6() == Long.MIN_VALUE) {
                    mn0.Cqx(j);
                    7zU.A13(lcf.A00.A00, true);
                }
                long Av6 = j - mn0.Av6();
                boolean z = true;
                if (f != 0.0f) {
                    Av6 = 0KF.A02(Av6 / f);
                }
                lcf.A01.Cqx(Av6);
                if (f != 0.0f) {
                    z = false;
                }
                LCF.A03(lcf, Av6, z);
            }
            c88p = 04S.A00;
        }
        return c88p;
    }
}
