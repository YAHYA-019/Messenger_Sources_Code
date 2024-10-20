package X;

import com.facebook.prefs.shared.FbSharedPreferences;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.1wi, reason: invalid class name */
/* loaded from: 1wi.class */
public final class C1wi {
    public final 1Br A01 = 1Bq.A00(33013);
    public final Set A02 = new LinkedHashSet();
    public final 1Br A00 = 1Bq.A00(66529);

    public final C1wj A00() {
        String str = ((1Fv) 1Bi.A03(66351)).A04().A02;
        this.A00.A00.get();
        1G2 A00 = 1wX.A00(1wX.A01, str);
        C1wj c1wj = null;
        if (A00 != null) {
            int ArU = ((FbSharedPreferences) this.A01.A00.get()).ArU(A00, -2);
            0fH.A0j("BackupStatusCache", 0Pz.A0T("get the current local cache status: ", ArU));
            if (ArU != -2) {
                C1wj[] c1wjArr = C1wj.A00;
                int length = c1wjArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        c1wj = C1wj.A05;
                        break;
                    }
                    c1wj = c1wjArr[i];
                    if (c1wj.status == ArU) {
                        break;
                    }
                    i++;
                }
            }
        }
        return c1wj;
    }

    public final Boolean A01() {
        int ordinal;
        C1wj A00 = A00();
        if (A00 == null || (ordinal = A00.ordinal()) == -1) {
            return null;
        }
        boolean z = true;
        if (ordinal != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void A02(C1wj c1wj) {
        11T.A0F(c1wj, 0);
        StringBuilder sb = new StringBuilder();
        sb.append("set the current local cache status: ");
        sb.append(c1wj);
        0fH.A0j("BackupStatusCache", sb.toString());
        String str = ((1Fv) 1Bi.A03(66351)).A04().A02;
        this.A00.A00.get();
        1G9 A00 = 1wX.A00(1wX.A01, str);
        if (A00 != null) {
            1Ql edit = ((FbSharedPreferences) this.A01.A00.get()).edit();
            edit.CaE(A00, c1wj.status);
            edit.commitImmediately();
        }
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C1x5) it.next()).A00(c1wj);
        }
    }
}
