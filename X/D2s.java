package X;

import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.messaging.business.plugins.suggestedreply.model.ReplyEntry;
import com.facebook.messaging.business.plugins.suggestedreply.model.SuggestedReplyOpenTopSheetParams;
import com.google.common.base.Function;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: D2s.class */
public final class D2s implements Function {
    public final /* synthetic */ long A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ long A02;
    public final /* synthetic */ Bou A03;

    public D2s(Bou bou, long j, long j2, long j3) {
        this.A03 = bou;
        this.A02 = j;
        this.A00 = j2;
        this.A01 = j3;
    }

    @Override // com.google.common.base.Function
    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        Object obj2;
        2JY A0B;
        2JY A0O;
        2JY A0B2;
        2JY A0B3;
        2JY A0O2;
        Object obj3;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        long currentTimeMillis = System.currentTimeMillis();
        B44 b44 = (B44) this.A03.A01.get();
        long j = currentTimeMillis - this.A02;
        1UG A08 = 1BK.A08(1Br.A02(b44.A01), 1BJ.A00(1664));
        if (A08.isSampled()) {
            1UG.A02(A08, "biim__suggested__reply");
            0DA r0 = new 0DA();
            r0.A06(GOm.A00(24), Long.valueOf(j));
            1UG.A01(r0, A08);
            1UG.A04(A08, b44.A02);
        }
        if (abstractC08294mh == null || (obj2 = abstractC08294mh.A03) == null) {
            return null;
        }
        ImmutableList A0c = ((2JY) obj2).A0c(-1662361203, 2JX.class, -1180006856);
        if (A0c.isEmpty()) {
            return null;
        }
        ArrayList A1B = AbJ.A1B(A0c);
        Iterator it = A0c.iterator();
        while (it.hasNext()) {
            2JY A0P = 7zL.A0P(it);
            if (A0P != null && (A0B = 1BK.A0B(A0P, 2JX.class, -340323263, -755207281)) != null && (A0O = 7zL.A0O(A0B, 2JX.class, 645370618, -797562815, -1864408792)) != null && (A0B2 = 1BK.A0B(A0O, 2JX.class, 1143022732, -403449041)) != null && (A0B3 = 1BK.A0B(A0B2, 2JX.class, -1289032093, -470484103)) != null && (A0O2 = 7zL.A0O(A0B3, 2JX.class, -403068042, -2013771121, 525133959)) != null) {
                String A0r = A0O2.A0r(1246912830);
                String A0t = A0O2.A0t(GraphQLStringDefUtil.A00(), "GraphQLMessengerBusinessSuggestedReplyType", -1649467243);
                if (A0r != null && !AbM.A1b(A0r) && A0t != null && !AbM.A1b(A0t)) {
                    BKs bKs = BKs.A03;
                    int i = 0;
                    switch (A0t.hashCode()) {
                        case -1611296843:
                            obj3 = "LOCATION";
                            break;
                        case 517424258:
                            obj3 = "USER_FAQ";
                            break;
                        case 719927989:
                            if (A0t.equals("USER_FAQ_SAVED_REPLY")) {
                                i = 2131966569;
                            }
                        default:
                            A1B.add(new ReplyEntry(bKs, null, null, null, null, A0r, null, null, A0t, null, i));
                            continue;
                    }
                    if (A0t.equals(obj3)) {
                        i = 2131966568;
                    }
                    A1B.add(new ReplyEntry(bKs, null, null, null, null, A0r, null, null, A0t, null, i));
                    continue;
                }
            }
        }
        if (A1B.isEmpty()) {
            return null;
        }
        ImmutableList.of();
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A1B);
        C1pq.A08("replyEntries", copyOf);
        return new SuggestedReplyOpenTopSheetParams(copyOf, null, this.A01, this.A00, true);
    }
}
