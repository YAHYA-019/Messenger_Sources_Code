package X;

import com.facebook.graphql.model.GraphQLMedia;
import com.facebook.graphql.modelutil.BaseModelWithTree;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: I6H.class */
public abstract class I6H {
    public static final ImmutableList A00(GraphQLMedia graphQLMedia) {
        List<BaseModelWithTree> A01;
        String A0a;
        ImmutableList.Builder A0h = 4YU.A0h();
        ImmutableList.Builder A0h2 = 4YU.A0h();
        ImmutableList A0c = graphQLMedia.A0c();
        if (A0c.isEmpty()) {
            A01 = C0ty.A00;
        } else {
            1Du it = A0c.iterator();
            while (it.hasNext()) {
                BaseModelWithTree baseModelWithTree = (BaseModelWithTree) it.next();
                if (baseModelWithTree != null && baseModelWithTree.A0a(-1097462182) != null) {
                    A0h2.m11011add((Object) baseModelWithTree);
                }
            }
            A01 = 1Fj.A01(A0h2);
        }
        if (!A01.isEmpty()) {
            for (BaseModelWithTree baseModelWithTree2 : A01) {
                if (baseModelWithTree2 != null && (A0a = baseModelWithTree2.A0a(-1097462182)) != null) {
                    A0h.m11011add((Object) A0a);
                }
            }
        }
        return 1Fj.A01(A0h);
    }

    public static final boolean A01(GraphQLMedia graphQLMedia) {
        if (graphQLMedia == null || !graphQLMedia.A0b(-1099189116)) {
            return false;
        }
        ImmutableList A0c = graphQLMedia.A0c();
        11T.A0A(A0c);
        if ((A0c instanceof Collection) && A0c.isEmpty()) {
            return false;
        }
        Iterator it = A0c.iterator();
        while (it.hasNext()) {
            if ("asr".equals(((BaseModelWithTree) it.next()).A0a(-1097462182))) {
                return true;
            }
        }
        return false;
    }

    public static final boolean A02(GraphQLMedia graphQLMedia) {
        boolean z = false;
        if (graphQLMedia != null && !graphQLMedia.A0b(-1099189116) && !graphQLMedia.A0c().isEmpty()) {
            z = true;
        }
        return z;
    }
}
