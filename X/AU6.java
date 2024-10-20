package X;

import com.facebook.xapp.messaging.commmunitymessaging.category.model.CommunityCategory;
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* loaded from: AU6.class */
public final class AU6 extends C00q implements Function1 {
    public static final AU6 A00 = new AU6();

    public AU6() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ImmutableList build;
        1qX A0t = 7zL.A0t(obj);
        if (A0t == null) {
            build = ImmutableList.of();
        } else {
            07E A0w = 7zR.A0w(A0t);
            ImmutableList.Builder builder = ImmutableList.builder();
            Iterator it = A0w.iterator();
            while (it.hasNext()) {
                int A06 = 7zL.A06(it);
                String A0j = 7zP.A0j(A0t, A06);
                if (A0j != null) {
                    builder.add(new CommunityCategory(7zQ.A0E(A0t, A06), A0j));
                }
            }
            build = builder.build();
        }
        11T.A0A(build);
        return build;
    }
}
