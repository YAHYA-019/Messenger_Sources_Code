package X;

import com.facebook.xapp.messaging.commmunitymessaging.category.model.CommunityCategory;
import kotlin.jvm.functions.Function1;

/* loaded from: AU4.class */
public final class AU4 extends C00q implements Function1 {
    public static final AU4 A00 = new AU4();

    public AU4() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0j;
        1qX A0t = 7zL.A0t(obj);
        CommunityCategory communityCategory = null;
        if (A0t != null && 1qX.A00(A0t) >= 1 && (A0j = 7zP.A0j(A0t, 0)) != null) {
            communityCategory = new CommunityCategory(A0t.mResultSet.getLong(0, 1), A0j);
        }
        return communityCategory;
    }
}
