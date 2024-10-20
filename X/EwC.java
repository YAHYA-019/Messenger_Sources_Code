package X;

import android.content.Context;
import com.facebook.graphql.enums.GraphQLStringDefUtil;
import com.facebook.inject.FbInjector;
import com.google.common.collect.ImmutableList;

/* loaded from: EwC.class */
public final class EwC {
    public ImmutableList A00 = ImmutableList.of();
    public final C00i A01;

    public EwC() {
        Context A00 = FbInjector.A00();
        11T.A0D(A00);
        this.A01 = 1HG.A00(A00, 99849);
    }

    public final int A00(String str) {
        int i;
        int size = this.A00.size();
        int i2 = 0;
        while (true) {
            i = i2;
            if (i >= size) {
                i = -1;
                break;
            }
            if (0CV.A0a(str, 7zL.A0N(AbF.A0M(this.A00, i), 2JX.class, 187022711, 1291669363).A0k(), true)) {
                break;
            }
            i2 = i + 1;
        }
        return i;
    }

    public final String A01(String str) {
        String A0k;
        1Du it = this.A00.iterator();
        while (it.hasNext()) {
            2JY A0N = 7zL.A0N(7zL.A0P(it), 2JX.class, 187022711, 1291669363);
            11T.A0A(A0N);
            if (11T.A0O(A0N.A0t(GraphQLStringDefUtil.A00(), "GraphQLAvatarCategoryGlyph", -1949705313), str) && (A0k = A0N.A0k()) != null) {
                return A0k;
            }
        }
        return "";
    }
}
