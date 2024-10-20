package X;

import com.facebook.graphql.enums.GraphQLStoryAttachmentStyle;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9d7, reason: invalid class name */
/* loaded from: 9d7.class */
public final class C9d7 {
    public static final List A00(2JX r301, C9d7 c9d7, List list) {
        List list2;
        Object obj;
        2JY A0S;
        String A0l;
        ImmutableList A0e = r301.A0e(GraphQLStoryAttachmentStyle.A1G, 139866732);
        11T.A0A(A0e);
        Iterator it = A0e.iterator();
        while (true) {
            list2 = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (obj == GraphQLStoryAttachmentStyle.A0t || obj == GraphQLStoryAttachmentStyle.A01) {
                break;
            }
        }
        GraphQLStoryAttachmentStyle graphQLStoryAttachmentStyle = (GraphQLStoryAttachmentStyle) obj;
        if (graphQLStoryAttachmentStyle != null) {
            int ordinal = graphQLStoryAttachmentStyle.ordinal();
            if (ordinal == 456) {
                2JY A0B = 1BK.A0B(r301, 2JX.class, 103772132, 2055936227);
                if (A0B != null && (A0S = A0B.A0S(2JX.class, -1494921816)) != null && (A0l = A0S.A0l()) != null && A0l.length() != 0) {
                    list2 = 11T.A03(new QAL(A0l, A0S.getIntValue(113126854), A0S.getIntValue(-1221029593)));
                }
            } else if (ordinal == 43 && list != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    List A00 = A00((2JX) it2.next(), c9d7, null);
                    if (A00 != null) {
                        A0s.add(A00);
                    }
                }
                return C1A3.A1F(A0s);
            }
        }
        return list2;
    }
}
