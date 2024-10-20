package X;

import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: G5x.class */
public final class G5x implements Runnable {
    public static final String __redex_internal_original_name = "MerlinComponentSpec$onComponentVisible$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 6KI A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ List A04;
    public final /* synthetic */ CM7[] A05;

    public G5x(6KI r302, String str, String str2, List list, CM7[] cm7Arr, long j) {
        this.A05 = cm7Arr;
        this.A04 = list;
        this.A03 = str;
        this.A02 = str2;
        this.A00 = j;
        this.A01 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        CM7[] cm7Arr = this.A05;
        List list = this.A04;
        String str = this.A03;
        String str2 = this.A02;
        long j = this.A00;
        6KI r0 = this.A01;
        ArrayList A0s = AnonymousClass001.A0s();
        for (CM7 cm7 : cm7Arr) {
            A0s.add(CM7.A00(cm7));
        }
        Bbe[] bbeArr = (Bbe[]) A0s.toArray(new Bbe[0]);
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((EdS) it.next()).A00.A07((ZonePolicy) null) != null) {
                A0s2.add(new Object());
            }
        }
        ArrayList A10 = 7zO.A10(A0s2, 0);
        6KH r02 = (6KH) 1Br.A0B(DLj.A09);
        if (r02.A03) {
            z = r02.A02;
        } else {
            z = r02.A06.AZr(1GD.A06, 36315417368142693L);
            r02.A02 = z;
            r02.A03 = true;
        }
        if (z && ((EdS) 1Br.A0B(DLj.A0A)).A00.A07((ZonePolicy) null) != null) {
            A10.add(new Object());
        }
        r0.A06(new Eqe(EM0.A04, str, str2, A10, bbeArr, 0, j));
    }
}
