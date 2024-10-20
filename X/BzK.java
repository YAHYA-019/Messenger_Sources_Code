package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* loaded from: BzK.class */
public final class BzK {
    /* JADX WARN: Type inference failed for: r0v5, types: [X.Alp, androidx.fragment.app.Fragment] */
    public final void A00(1pI r302, 2MX r303, Long l, String str) {
        Bundle A09 = AbN.A09(r302);
        A09.putString("community_creation_nux_entry_point", str);
        if (l != null) {
            A09.putLong("community_creation_nux_upgraded_from_group_thread_id", l.longValue());
        }
        ?? c1570Alp = new C1570Alp();
        c1570Alp.setArguments(A09);
        r302.Czz((Fragment) c1570Alp, 0S2.A01, C1570Alp.__redex_internal_original_name);
        c1570Alp.A02 = r303;
    }
}
