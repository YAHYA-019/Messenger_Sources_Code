package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: G5w.class */
public final class G5w implements Runnable {
    public static final String __redex_internal_original_name = "MerlinComponentSpec$onComponentFocused$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6KI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CM7[] A05;

    public G5w(6KI r302, String str, String str2, List list, CM7[] cm7Arr, long j) {
        this.A04 = list;
        this.A05 = cm7Arr;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        List list = this.A04;
        CM7[] cm7Arr = this.A05;
        String str = this.A03;
        String str2 = this.A02;
        long j = this.A00;
        6KI r0 = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        ArrayList A10 = 7zO.A10(A0s, 0);
        6KH r02 = (6KH) 1Br.A0B(DLj.A09);
        if (r02.A03) {
            z = r02.A02;
        } else {
            z = r02.A06.AZr(1GD.A06, 36315417368142693L);
            r02.A02 = z;
            r02.A03 = true;
        }
        if (z) {
            1Br.A0C(DLj.A0A);
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        for (int i = 0; i < cm7Arr.length; i++) {
        }
        r0.A06(new Eqe(EM0.A04, str, str2, A10, (Bbe[]) A0s2.toArray(new Bbe[0]), 100, j));
    }
}
