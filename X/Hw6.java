package X;

import com.facebook.graphservice.tree.TreeJNI;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;

/* loaded from: Hw6.class */
public final class Hw6 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r307v0 */
    /* JADX WARN: Type inference failed for: r307v1 */
    /* JADX WARN: Type inference failed for: r307v2, types: [java.util.AbstractCollection] */
    public static final List A00(2JX r301) {
        List list;
        2JY A0B;
        ImmutableList A0c;
        2JY A0B2 = 1BK.A0B(r301, 2JX.class, 25541362, 656489740);
        if (A0B2 == null || (A0B = 1BK.A0B(A0B2, 2JX.class, -2072136149, 547142130)) == null || (A0c = A0B.A0c(-1752333292, 2JX.class, -1545507263)) == null) {
            list = C0ty.A00;
        } else {
            list = 1BL.A0z(A0c);
            Iterator it = A0c.iterator();
            while (it.hasNext()) {
                TreeJNI A0K = 7zL.A0P(it).A0K(-1858494655, 2JX.class, 1132566940);
                11T.A0A(A0K);
                list.add(A0K);
            }
        }
        return list;
    }
}
