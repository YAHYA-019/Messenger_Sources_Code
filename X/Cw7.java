package X;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.collect.ImmutableMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: Cw7.class */
public final class Cw7 implements DHh {
    public final /* synthetic */ long A00;
    public final /* synthetic */ CQn A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public Cw7(CQn cQn, String str, String str2, long j, boolean z) {
        this.A01 = cQn;
        this.A04 = z;
        this.A00 = j;
        this.A02 = str;
        this.A03 = str2;
    }

    /* JADX WARN: Type inference failed for: r0v52, types: [com.facebook.messaging.wellbeing.selfremediation.block.user.BlockUserFragment, androidx.fragment.app.Fragment, java.lang.Object] */
    @Override // X.DHh
    public void onFailure(Throwable th) {
        ?? r0;
        COw cOw;
        CQn cQn = this.A01;
        String str = this.A03;
        boolean z = this.A04;
        9fJ.A00(CQn.A01(cQn), "block_on_facebook_failed", z ? "block" : "unblock");
        QuickPerformanceLogger A0U = 1BK.A0U(cQn.A0G);
        int i = 30289127;
        if (z) {
            i = 30282654;
        }
        A0U.markerEnd(i, (short) 3);
        C85 c85 = cQn.A07;
        java.util.Map map = c85 != null ? c85.A02 : null;
        if (map == null) {
            map = CBg.A00;
        }
        LinkedHashMap A1C = 1BK.A1C();
        Iterator A0y = AnonymousClass001.A0y(map);
        while (A0y.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0y);
            if (AnonymousClass001.A03(A0z.getKey()) != 1) {
                1BL.A1O(A1C, A0z);
            }
        }
        CQn.A08(cQn, ImmutableMap.copyOf((java.util.Map) A1C));
        BlockUserFragment blockUserFragment = cQn.A05;
        if (AbM.A1a(blockUserFragment) && (cOw = (r0 = (BlockUserFragment) AbM.A0r(blockUserFragment)).A03) != null) {
            CR1 cr1 = new CR1(6, (Object) r0, z);
            Context context = r0.getContext();
            11T.A0F(context, 0);
            1Ih r02 = (1Ih) 1Br.A0B(cOw.A03);
            int i2 = 2131967513;
            if (z) {
                i2 = 2131953341;
            }
            String A14 = AbK.A14(r02, str, i2);
            1Br.A0C(cOw.A01);
            DR6 A01 = C5ic.A01(context, cOw.A04);
            A01.A0J(A14);
            A01.A0K(true);
            A01.A0B((DialogInterface.OnClickListener) null, R.string.cancel);
            A01.A0D(cr1, 2131967444);
            COw.A02(A01, cOw);
        }
        AbG.A0r(cQn.A0M).flowEndFail(this.A00, "BlockUserPresenter::getFacebookBlockCallback", th.getMessage());
        CQn.A09(cQn, 0S2.A0C);
    }

    @Override // X.DHh
    public void onSuccess() {
        CQn cQn = this.A01;
        boolean z = this.A04;
        9fJ.A00(CQn.A01(cQn), "block_on_facebook_completed", z ? "block" : "unblock");
        QuickPerformanceLogger A0U = 1BK.A0U(cQn.A0G);
        int i = 30289127;
        if (z) {
            i = 30282654;
        }
        A0U.markerEnd(i, (short) 2);
        AbG.A0r(cQn.A0M).flowEndSuccess(this.A00);
        cQn.A08.A01(new CfF(z, this.A02));
        CQn.A09(cQn, 0S2.A01);
    }
}
