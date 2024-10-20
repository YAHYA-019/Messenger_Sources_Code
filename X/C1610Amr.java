package X;

import android.view.View;
import com.facebook.graphservice.tree.TreeJNI;
import com.facebook.messaging.business.plugins.threadcreation.banner.ThreadCreationBanner;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Amr, reason: case insensitive filesystem */
/* loaded from: Amr.class */
public final class C1610Amr extends 1RM {
    public final /* synthetic */ ThreadCreationBanner A00;
    public final /* synthetic */ ThreadKey A01;
    public final /* synthetic */ 7OX A02;
    public final /* synthetic */ User A03;

    public C1610Amr(ThreadCreationBanner threadCreationBanner, ThreadKey threadKey, 7OX r304, User user) {
        this.A00 = threadCreationBanner;
        this.A03 = user;
        this.A01 = threadKey;
        this.A02 = r304;
    }

    public /* bridge */ /* synthetic */ void A02(Object obj) {
        TreeJNI A0L;
        2JY r0 = (2JY) obj;
        if (r0 == null || (A0L = r0.A0L(1120429741, 2JX.class, -439196479)) == null || !A0L.getBooleanValue(-82842882)) {
            return;
        }
        C00i c00i = this.A00.A02;
        String A0y = AbJ.A0y(1BK.A04(c00i), 2131966926);
        this.A02.CXr(new 6Ky((View.OnClickListener) null, (View.OnClickListener) null, (1LI) null, 9DU.A00(CZD.A00(this, 44), 1BK.A04(c00i).getString(2131966924)), (C9g0) null, (C9g0) null, (ImmutableList) null, (CharSequence) null, 1BK.A0v(1BK.A04(c00i), this.A03.A0X.displayName, 2131966925), A0y, (Class) null, (Integer) null, 0, false));
    }

    public void A03(Throwable th) {
    }
}
