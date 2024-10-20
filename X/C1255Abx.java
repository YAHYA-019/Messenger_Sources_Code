package X;

import android.os.Bundle;
import com.facebook.common.util.TriState;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.RegularImmutableSet;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: X.Abx, reason: case insensitive filesystem */
/* loaded from: Abx.class */
public final class C1255Abx implements 4qU {
    public final /* synthetic */ C09754rf A00;

    public C1255Abx(C09754rf c09754rf) {
        this.A00 = c09754rf;
    }

    public Iterable B0L() {
        4qT r0 = new 4qT(RegularImmutableSet.A05, 0S2.A01);
        return ImmutableList.of((Object) new C4r6(TriState.UNSET, (1Ro) this.A00.A02.get(), r0, null, "gk"));
    }

    public void CA9(java.util.Map map) {
        List list;
        Bundle bundle = (Bundle) map.get("gk");
        if (bundle != null) {
            C09754rf c09754rf = this.A00;
            synchronized (c09754rf) {
                list = c09754rf.A00;
                if (list == null) {
                    Set set = c09754rf.A04;
                    list = set.isEmpty() ? Collections.emptyList() : 1BK.A17(set);
                    c09754rf.A00 = list;
                }
            }
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((InterfaceC09484qQ) list.get(i)).C0D(bundle);
            }
            1Od r0 = c09754rf.A01;
            1Od.A01(r0);
            long j = r0.A0d;
            1Ql edit = c09754rf.A03.edit();
            edit.CaH(AbstractC1256Aby.A01, j);
            edit.commit();
            0fH.A07(C09754rf.class, Long.valueOf(j), "Set current gk last check time %d");
        }
    }
}
