package X;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.user.model.User;

/* loaded from: Cvc.class */
public final class Cvc implements C5ww {
    public final CIQ A00;
    public final CbT A01;
    public final 1Ih A02;
    public final 8GZ A03;
    public final CNX A04;
    public final 23F A05;

    public Cvc(CIQ ciq, 8GZ r303, CbT cbT, 1Ih r305, CNX cnx, 23F r307) {
        this.A02 = r305;
        this.A00 = ciq;
        this.A03 = r303;
        this.A01 = cbT;
        this.A04 = cnx;
        this.A05 = r307;
    }

    @Override // X.C5ww
    public void onClick(View view) {
        CIQ ciq = this.A00;
        if (TextUtils.isEmpty(null) && TextUtils.isEmpty(ciq.A01)) {
            return;
        }
        String str = ciq.A01;
        if (!TextUtils.isEmpty(str)) {
            23F r0 = this.A05;
            str.getClass();
            final User A0t = AbK.A0t(r0, str);
            if (A0t == null) {
                0fH.A0o("BlockPeopleV2ListClickItemListener", "user is null when blocking/unblocking from blocked people list");
                return;
            }
            8GZ r02 = this.A03;
            final CwG cwG = new CwG(this, 3);
            final CwD cwD = new CwD(this, 3);
            final 7EN r03 = (7EN) 7zO.A0l(r02, 50188);
            final BNT bnt = BNT.A04;
            final BNJ bnj = BNJ.A02;
            final 06Z r04 = r02.mFragmentManager;
            ((AnonymousClass472) 1Bn.A0E(r03.A01, (1BY) null, 67579)).A00(A0t.A0k).A02(new 7Yx() { // from class: X.Ck5
                public final void CHY(User user) {
                    7EN r05 = r03;
                    User user2 = A0t;
                    BNT bnt2 = bnt;
                    BNJ bnj2 = bnj;
                    06Z r06 = r04;
                    DHk dHk = cwG;
                    DGC dgc = cwD;
                    if (user == null) {
                        r05.A08(r06, bnt2, bnj2, (DHj) null, dgc, dHk, user2);
                    } else {
                        r05.A08(r06, bnt2, bnj2, (DHj) null, dgc, dHk, user);
                    }
                }
            });
            return;
        }
        8GZ r05 = this.A03;
        1Ih r06 = this.A02;
        String A0u = 4YU.A0u(r06, ciq.A02, 2131967512);
        String A0u2 = 4YU.A0u(r06, (Object) null, 2131966053);
        Context context = r05.getContext();
        if (context == null || TextUtils.isEmpty(null)) {
            return;
        }
        C00i c00i = r05.A00;
        c00i.getClass();
        DR6 A0e = AbK.A0e(context, c00i);
        A0e.A03(A0u);
        A0e.A0J(A0u2);
        CSG.A05(A0e, r05, ActionId.APPLY_FINISHED_LIST_AGAIN, 2131953396);
        A0e.A0B((DialogInterface.OnClickListener) null, 2131955693);
        7zN.A13(A0e);
    }
}
