package X;

import java.util.Comparator;
import java.util.Date;

/* loaded from: Ls6.class */
public final class Ls6 implements Comparator {
    public final /* synthetic */ 6IZ A00;

    public Ls6(6IZ r302) {
        this.A00 = r302;
    }

    @Override // java.util.Comparator
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        KTN ktn = (KTN) obj2;
        Date date = ((KTN) obj).A05;
        if (date == null && ktn.A05 == null) {
            return 0;
        }
        if (date == null) {
            return -1;
        }
        Date date2 = ktn.A05;
        if (date2 == null) {
            return 1;
        }
        return date2.compareTo(date);
    }
}
