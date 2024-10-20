package X;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.google.common.base.Preconditions;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: GVu.class */
public final class GVu extends C0wp {
    public final IBw A00;
    public final C6x7 A01;
    public final List A02;
    public final WeakHashMap A03;
    public final /* synthetic */ IDa A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GVu(06Z r302, IBw iBw, IDa iDa, C6x7 c6x7, List list) {
        super(r302);
        this.A04 = iDa;
        this.A03 = new WeakHashMap();
        this.A02 = list;
        this.A00 = iBw;
        this.A01 = c6x7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0045, code lost:
    
        if (X.AnonymousClass001.A1V(r0.get(r303)) != false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static X.1pK A00(X.GVu r301, int r302) {
        /*
            r0 = r301
            X.IBw r0 = r0.A00
            r303 = r0
            r0 = r301
            java.util.List r0 = r0.A02
            r1 = r302
            java.lang.Object r0 = r0.get(r1)
            X.6x1 r0 = (X.C6x1) r0
            r304 = r0
            X.6x7 r0 = X.C6x7.A03
            r305 = r0
            r0 = r303
            r1 = r305
            r2 = r304
            X.1pK r0 = r0.A04(r1, r2)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L48
            r0 = r301
            java.util.WeakHashMap r0 = r0.A03
            r304 = r0
            r0 = r304
            r1 = r303
            boolean r0 = r0.containsKey(r1)
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L48
            r0 = r304
            r1 = r303
            java.lang.Object r0 = r0.get(r1)
            r305 = r0
            r0 = r305
            boolean r0 = X.AnonymousClass001.A1V(r0)
            r306 = r0
            r0 = r306
            if (r0 != 0) goto L4a
        L48:
            r0 = 0
            r303 = r0
        L4a:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GVu.A00(X.GVu, int):X.1pK");
    }

    public int A0C() {
        return this.A02.size();
    }

    @Override // X.C0wp
    public final Object A0E(ViewGroup viewGroup, int i) {
        Object A0E = super.A0E(viewGroup, i);
        this.A03.put(A0E, AnonymousClass001.A0K());
        return A0E;
    }

    @Override // X.C0wp
    public final Fragment A0I(int i) {
        List list = this.A02;
        Preconditions.checkElementIndex(i, list.size());
        C6x1 c6x1 = (C6x1) list.get(i);
        1pK A04 = this.A00.A04(c6x1 == C6x1.A04 ? this.A01 : C6x7.A03, c6x1);
        IDa.A01(A04, this.A04);
        return A04;
    }
}
