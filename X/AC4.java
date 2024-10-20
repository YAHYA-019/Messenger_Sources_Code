package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.bottomsheet.MigBottomSheetDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* loaded from: AC4.class */
public final class AC4 implements 1K9 {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ 06Z A01;
    public final /* synthetic */ FbUserSession A02;
    public final /* synthetic */ C9hg A03;
    public final /* synthetic */ ThreadKey A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ Long A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;

    public AC4(Context context, 06Z r303, FbUserSession fbUserSession, C9hg c9hg, ThreadKey threadKey, Integer num, Long l, String str, String str2, boolean z, boolean z2) {
        this.A03 = c9hg;
        this.A02 = fbUserSession;
        this.A04 = threadKey;
        this.A09 = z;
        this.A01 = r303;
        this.A00 = context;
        this.A0A = z2;
        this.A06 = l;
        this.A07 = str;
        this.A08 = str2;
        this.A05 = num;
    }

    public void onFailure(Throwable th) {
    }

    public void onSuccess(Object obj) {
        2JY r0;
        2JY A0B;
        2JY A0B2;
        ImmutableList A0c;
        AbstractC08294mh abstractC08294mh = (AbstractC08294mh) obj;
        Object obj2 = null;
        if (abstractC08294mh == null || (r0 = (2JY) abstractC08294mh.A03) == null || (A0B = 1BK.A0B(r0, 2JX.class, -818453485, -135698918)) == null || (A0B2 = 1BK.A0B(A0B, 2JX.class, -267399590, 1147082194)) == null || (A0c = A0B2.A0c(1429656682, 2JX.class, 1294206227)) == null) {
            return;
        }
        List A0V = 0QD.A0V(A0c);
        if (A0V.isEmpty()) {
            return;
        }
        C9hg c9hg = this.A03;
        FbUserSession fbUserSession = this.A02;
        ThreadKey threadKey = this.A04;
        long j = threadKey.A04;
        ArrayList A00 = C9hg.A00(fbUserSession, c9hg, A0V, j);
        if (!A00.isEmpty() || !this.A09) {
            if (7zM.A1b(A00) && this.A0A) {
                94S r02 = MigBottomSheetDialogFragment.A01;
                7zU.A14(3GT.A00(threadKey, this.A05, this.A06, this.A07, this.A08, A00), this.A01, "AdminOnboardingBottomSheetFragment");
                return;
            } else {
                if (7zM.A1b(A00)) {
                    c9hg.A02(fbUserSession, null, j, true);
                    String str = this.A08;
                    if (str != null) {
                        ((8yV) 4YU.A0n(fbUserSession, c9hg.A00, 68149)).A01(str, j);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        List A0x = 7zP.A0x(this.A01);
        ListIterator listIterator = A0x.listIterator(A0x.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                break;
            }
            Object previous = listIterator.previous();
            if (((Fragment) previous).mView != null) {
                obj2 = previous;
                break;
            }
        }
        Fragment fragment = (Fragment) obj2;
        if (fragment != null) {
            Context context = this.A00;
            7zQ.A17(context, fragment.requireView(), (MigColorScheme) 1Bu.A06(context, 16979), (6LF) 1Bu.A06(context, 67784), 2131967372);
        }
    }
}
