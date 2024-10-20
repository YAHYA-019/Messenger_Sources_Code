package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Parcelable;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import java.util.HashSet;

/* renamed from: X.93d, reason: invalid class name */
/* loaded from: 93d.class */
public final class C93d extends AbstractC07494k1 implements InterfaceC07554k7 {
    public static final AnonymousClass207 A02;
    public final Context A00;
    public final ThreadKey A01;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A02 = new AnonymousClass207(6Ku.class, "StaxExperimentalThreadViewBannerDataSource");
    }

    public C93d(Context context, ThreadKey threadKey) {
        this.A00 = context;
        this.A01 = threadKey;
    }

    @Override // X.InterfaceC07554k7
    public AnonymousClass207 Asi() {
        return A02;
    }

    @Override // X.InterfaceC07544k6
    public void Cgt(int i) {
        2yD A0Q;
        long j;
        Context context = this.A00;
        ThreadKey threadKey = this.A01;
        boolean A0S = ThreadKey.A0S(threadKey);
        if (A0S || ThreadKey.A0V(threadKey)) {
            A0Q = 1BL.A0Q();
            j = 36313931309063431L;
        } else {
            if (threadKey.A0y()) {
                return;
            }
            A0Q = 1BL.A0Q();
            j = 36313931307949312L;
        }
        if (A0Q.AZk(j)) {
            MigColorScheme A0c = 7zR.A0c(context);
            String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("[Employees Only] STAX %s Thread View", ThreadKey.A0n(threadKey) ? "Tincan" : A0S ? AbE.A00(ActionId.ACTION_BAR_COMPLETE) : ThreadKey.A0Y(threadKey) ? "CMS" : ThreadKey.A0k(threadKey) ? "Open" : threadKey.A1A() ? "Community" : threadKey.A1H() ? "Interop" : "Unknown");
            HashSet A0v = AnonymousClass001.A0v();
            ColorDrawable A0D = 7zL.A0D(A0c.BDl());
            C1pq.A08("text", formatStrLocaleSafe);
            A05(new C6rw(new 7Vq(A0D, (View.OnClickListener) null, (View.OnClickListener) null, C1u7.A0A, A0c, 2KE.A04, (HeterogeneousMap) null, (Long) null, (Long) null, "", "", "", "", "", formatStrLocaleSafe, A0v, 10005)));
        }
    }
}
