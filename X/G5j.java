package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: G5j.class */
public final class G5j implements Runnable {
    public static final String __redex_internal_original_name = "MerlinComponentSpec$onComponentInvisible$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6KI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ CM7[] A04;

    public G5j(6KI r302, String str, String str2, CM7[] cm7Arr, long j) {
        this.A04 = cm7Arr;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        CM7[] cm7Arr = this.A04;
        String str = this.A03;
        String str2 = this.A02;
        long j = this.A00;
        6KI r0 = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        for (CM7 cm7 : cm7Arr) {
            A0s.add(CM7.A00(cm7));
        }
        Bbe[] bbeArr = (Bbe[]) A0s.toArray(new Bbe[0]);
        List list = DLj.A0C;
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
        r0.A06(new Eqe(EM0.A07, str, str2, 0QD.A0V(A0s2), bbeArr, 0, j));
    }
}
