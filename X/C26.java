package X;

import com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: C26.class */
public final class C26 {
    public final /* synthetic */ BlockUserFragment A00;

    public C26(BlockUserFragment blockUserFragment) {
        this.A00 = blockUserFragment;
    }

    public void A00() {
        Object obj;
        Object obj2 = null;
        obj2.getClass();
        CQn cQn = this.A00.A08;
        Iterator A0y = AnonymousClass001.A0y(CBg.A00);
        while (true) {
            if (!A0y.hasNext()) {
                obj = null;
                break;
            } else {
                obj = A0y.next();
                if (11T.A0O(((C1777AsB) ((Map.Entry) obj).getValue()).A05, (Object) null)) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        C85 c85 = cQn.A07;
        java.util.Map map = c85 != null ? c85.A02 : null;
        11T.A0F((Object) null, 1);
        if (map == null) {
            map = CBg.A00;
        }
        LinkedHashMap A1C = 1BK.A1C();
        Iterator A0y2 = AnonymousClass001.A0y(map);
        while (A0y2.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y2);
            if (7zL.A1X(((C1777AsB) A0z.getValue()).A05, (Object) null)) {
                4YV.A1R(A0z, A1C);
            }
        }
        CQn.A08(cQn, ImmutableMap.copyOf((java.util.Map) A1C));
        if (entry != null) {
            boolean z = ((C1777AsB) entry.getValue()).A08;
            int A03 = AnonymousClass001.A03(entry.getKey());
            if (A03 != 0) {
                if (A03 == 1) {
                    CQn.A0C(cQn, z, true);
                }
            } else {
                C00i c00i = cQn.A0M;
                long generateNewFlowId = AbG.A0r(c00i).generateNewFlowId(57151977);
                AbI.A1U(AbG.A0r(c00i), "block_presenter", generateNewFlowId, false);
                AbG.A0r(c00i).flowAnnotate(generateNewFlowId, "isBlock", z);
                CQn.A07(cQn, CQn.A04(cQn), generateNewFlowId, z, false);
            }
        }
    }
}
