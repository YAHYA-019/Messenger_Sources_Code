package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.viewer.MontageViewerFragment;
import com.facebook.messaging.threadview.params.MessageDeepLinkInfo;
import com.facebook.user.model.UserKey;

/* renamed from: X.Gof, reason: case insensitive filesystem */
/* loaded from: Gof.class */
public final class C2802Gof extends HGG {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C2802Gof(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public void A03(long j, boolean z, boolean z2) {
        if (1 - this.A00 == 0) {
            ((C1ph) this.A02).Bth(((HxC) this.A01).A00);
        }
    }

    public void A0A(UserKey userKey, String str, java.util.Map map) {
        if (this.A00 != 0) {
            MontageViewerFragment montageViewerFragment = ((HxC) this.A01).A00;
            montageViewerFragment.A0o();
            HGG hgg = montageViewerFragment.A0L;
            if (hgg != null) {
                hgg.A0A(userKey, str, map);
                return;
            }
            return;
        }
        11T.A0F(userKey, 0);
        Hg7 hg7 = (Hg7) this.A02;
        ThreadKey A00 = 4iI.A00((4iI) 1Br.A0B(hg7.A01), userKey);
        if (A00 == null) {
            throw 1BK.A0h();
        }
        Object obj = this.A01;
        if (obj == null || A00.equals(obj)) {
            return;
        }
        ((6HS) hg7.A00.get()).A05(A00, (MessageDeepLinkInfo) null, 5SW.A1G, "messenger_montage_viewer");
    }
}
