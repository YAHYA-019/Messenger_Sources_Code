package X;

import com.facebook.graphql.model.GraphQLMedia;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hvb.class */
public final class Hvb {
    public static final GraphQLMedia A00(String str, List list, boolean z) {
        MSn A02 = GraphQLMedia.A02("Video");
        A02.A1Y(3355, str);
        A02.A1Z(-1099189116, z);
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            JtB jtB = (JtB) it.next();
            String str2 = jtB.A01;
            String str3 = jtB.A05;
            String str4 = jtB.A03;
            String str5 = jtB.A04;
            N4s n4s = new N4s(null, -1087353613);
            n4s.A1Y(-1097462182, str2);
            n4s.A1Y(-129427758, str4);
            n4s.A1Y(-958874724, str3);
            n4s.A1Y(487553405, str5);
            builder.m11011add((Object) n4s.A1U(MRk.A00(47), MSy.class, -1087353613));
        }
        A02.A00.put(-1363133599, 1Fj.A01(builder));
        GraphQLMedia A1v = A02.A1v();
        11T.A0A(A1v);
        return A1v;
    }
}
