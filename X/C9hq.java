package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.sharedalbum.nux.SharedAlbumNuxFragment;

/* renamed from: X.9hq, reason: invalid class name */
/* loaded from: 9hq.class */
public final class C9hq {
    public static final 1G2 A08 = 1NK.A3m;
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02 = 1BK.A0E();
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1De A07;

    public C9hq(1De r302) {
        this.A07 = r302;
        1BY r0 = r302.A00;
        this.A05 = 1Bu.A03(r0, 65937);
        this.A04 = 1Bu.A03(r0, 68433);
        this.A01 = 1Bu.A03(r0, 67527);
        this.A00 = 7zM.A0Q();
        1Br A0Y = 7zM.A0Y();
        this.A03 = A0Y;
        this.A06 = 1Lm.A03(7zS.A0E(A0Y), r0, 100241);
    }

    public final void A00(Context context) {
        1G2 A00 = ((1M0) 1Br.A0B(this.A06)).A00("shared_album_deletion_disclosure_nux_impression_count");
        1Br r0 = this.A02;
        if (1Br.A09(r0).ArU(A00, 0) < 1) {
            7zP.A0N(this.A00).Ciz(new AF9(context, this));
            C00i c00i = r0.A00;
            int A03 = 7zM.A03(1BK.A0S(c00i), A00) + 1;
            1Ql A0U = 1BL.A0U(c00i);
            A0U.CaE(A00, A03);
            A0U.commit();
        }
    }

    public final void A01(06Z r302, ThreadKey threadKey) {
        11T.A0F(threadKey, 1);
        if (r302 != null) {
            if (7zM.A03(1Br.A09(this.A02), A08) < 2) {
                SharedAlbumNuxFragment.A03.A00(r302, threadKey, true);
            }
        }
    }
}
