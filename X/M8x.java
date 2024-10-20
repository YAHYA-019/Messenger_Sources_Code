package X;

import androidx.compose.foundation.ClickableElement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: M8x.class */
public final class M8x extends C00q implements C0Bd {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final boolean A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M8x(Object obj, Object obj2, Object obj3, String str, int i, boolean z) {
        super(3);
        this.A00 = i;
        this.A01 = obj;
        this.A05 = z;
        this.A04 = str;
        this.A03 = obj2;
        this.A02 = obj3;
    }

    @Override // X.C0Bd
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        03Y A1G;
        if (this.A00 == 0) {
            MLv A0N = JQz.A0N(obj2, obj3);
            MMs mMs = (MMs) JR2.A0Q(A0N, -1525724089);
            MLj D4B = Kwq.A00((ME2) this.A01, mMs, MLj.A00).D4B(new ClickableElement(null, mMs, (ExZ) this.A03, this.A04, (C00m) this.A02, this.A05));
            LNS.A0R(A0N);
            return D4B;
        }
        boolean A1X = 1BL.A1X(obj, obj2);
        boolean z = this.A05;
        if (z) {
            A1G = 1BK.A1G(new AVK(new Function2[]{(Function2) obj}), (Object) null);
        } else {
            AtomicReference atomicReference = new AtomicReference();
            A1G = 1BK.A1G(new AVK(new Function2[]{(Function2) obj, new AW5(atomicReference, 30)}), new M0R(atomicReference, 6));
        }
        Object obj4 = A1G.first;
        C00m c00m = (C00m) A1G.second;
        String str = this.A04;
        C0Bd c0Bd = (C0Bd) this.A03;
        List list = (List) this.A01;
        Function1[] function1Arr = (Function1[]) list.toArray(new Function1[0]);
        Object[] copyOf = Arrays.copyOf(function1Arr, function1Arr.length);
        11T.A0F(copyOf, 0);
        5Vs r0 = (5Vs) c0Bd.invoke(obj4, obj2, new GBo(copyOf, 36));
        9PW r02 = (9PW) this.A02;
        5Vt r03 = new 5Vt(r02, str, c00m, r0, z);
        Function1 function1 = r03.A00;
        r03.CoB(M6T.A00);
        ArrayList A0z = 1BL.A0z(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0z.add(((Function1) it.next()).invoke(r03));
        }
        r03.CoB(new ARh(r03, GOn.A1K(0), function1, A0z, r02, str, A1X ? 1 : 0, z));
        r03.A01(new JBV(r03, 8), false);
        return r03;
    }
}
