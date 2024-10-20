package X;

import com.facebook.graphql.model.GraphQLStory;
import com.facebook.graphservice.interfaces.Tree;
import java.util.HashMap;
import java.util.LinkedList;

/* loaded from: L1o.class */
public final class L1o {
    public static HashMap A01 = AnonymousClass001.A0u();
    public static HashMap A02 = AnonymousClass001.A0u();
    public static HashMap A03 = AnonymousClass001.A0u();
    public static HashMap A04 = AnonymousClass001.A0u();
    public static final LinkedList A05 = AbF.A1F();
    public final C00i A00 = 1BQ.A02(131302);

    public L1o() {
        L03 l03 = (L03) 1Bi.A03(131303);
        A01.clear();
        if (!l03.A01) {
            l03.A02.Av9(1GD.A06, 36592837895652321L);
            l03.A01 = true;
        }
        if (l03.A00) {
            return;
        }
        l03.A02.Av9(1GD.A06, 36592837895717858L);
        l03.A00 = true;
    }

    public void A00(LCt lCt, C6mr c6mr, Object obj, String str) {
        boolean z;
        Object obj2;
        2iK r0;
        C2hn A022;
        String A0a;
        String A0Z;
        L02 l02 = (L02) this.A00.get();
        if (l02.A01) {
            z = l02.A00;
        } else {
            z = l02.A02.AZr(1GD.A06, 36311362919861010L);
            l02.A00 = z;
            l02.A01 = true;
        }
        if (!z || obj == null) {
            return;
        }
        if (obj instanceof MNz) {
            obj2 = (MNz) obj;
        } else {
            if ((obj instanceof 2iK) && (r0 = (2iK) obj) != null && (A022 = r0.A02()) != null) {
                A022.AgD("FEED_EDGE_CUSTOM_ATTRIBUTE");
            }
            obj2 = null;
        }
        if (obj2 instanceof GraphQLStory) {
            try {
                GraphQLStory graphQLStory = (GraphQLStory) F1h.A01((Tree) obj2, GraphQLStory.class, -541423194);
                if (graphQLStory == null || (A0a = graphQLStory.A0a(1270488759)) == null || (A0Z = graphQLStory.A0Z()) == null) {
                    return;
                }
                if (A0a.contains("page_insights") || graphQLStory.A0c() != null) {
                    A01.put(A0Z, str);
                    0fH.A0j("LastActionTracker", str);
                    int A052 = lCt.A05();
                    int height = c6mr.A00.getHeight();
                    0fH.A0g(Integer.valueOf(A052), "LastActionTracker", "viewport top: %s");
                    0fH.A0g(Integer.valueOf(height), "LastActionTracker", "viewport bottom: %s");
                    0fH.A0g(-1, "LastActionTracker", "feed unit top: %s");
                    0fH.A0g(-1, "LastActionTracker", "feed unit bottom: %s");
                }
            } catch (IllegalArgumentException unused) {
                0fH.A0j("LastActionTracker", "Error parsing story for coordinate detection in newsfeed Recycler");
            }
        }
    }
}
