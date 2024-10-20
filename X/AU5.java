package X;

import com.facebook.xapp.messaging.commmunitymessaging.category.model.CommunityCategory;
import kotlin.jvm.functions.Function1;

/* loaded from: AU5.class */
public final class AU5 extends C00q implements Function1 {
    public static final AU5 A00 = new AU5();

    public AU5() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        1qX A0t = 7zL.A0t(obj);
        CommunityCategory communityCategory = null;
        if (A0t != null && 1qX.A00(A0t) >= 1) {
            Long nullableLong = A0t.mResultSet.getNullableLong(0, 2);
            String A0o = 7zU.A0o(A0t, 0);
            if (nullableLong != null && A0o != null) {
                communityCategory = new CommunityCategory(nullableLong.longValue(), A0o);
            }
        }
        return communityCategory;
    }
}
