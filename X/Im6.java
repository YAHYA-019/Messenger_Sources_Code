package X;

import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.graphql.query.GraphQlQueryParamSet;
import com.facebook.stickers.model.Sticker;

/* loaded from: Im6.class */
public final class Im6 implements C6wg {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public Im6(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    @Override // X.C6wg
    public final void C6f(Context context, View view, 06Z r304, Sticker sticker, 6tM r306) {
        switch (this.A00) {
            case 0:
                HY0 hy0 = (HY0) this.A01;
                Sticker sticker2 = (Sticker) this.A02;
                Object obj = this.A03;
                GWC gwc = hy0.A00;
                FbUserSession A05 = 1Fw.A05(gwc.A01);
                CI6 ci6 = (CI6) gwc.A0E.get();
                String str = sticker2.A0F;
                JMq jMq = gwc.A03;
                7zT.A1S(A05, context, str);
                11T.A0F(r306, 5);
                I5H i5h = (I5H) 1Br.A0B(ci6.A00);
                ARW arw = new ARW(16, context, jMq, r306, obj, ci6);
                GraphQlQueryParamSet A0M = 7zL.A0M();
                A0M.A05("sticker_id", str);
                1FV A09 = ((DKN) 1De.A00(i5h.A00, 68643)).A00().A09(5Dh.A00(A0M, new C01643sd(Q95.class, "RemoveUserGeneratedAiStickers", null, null, "fbandroid", -990651883, 0, 1504996284L, 1504996284L, false, true)));
                1Br.A0D(i5h.A05, Ini.A01(arw, 50), A09);
                return;
            case 1:
                HY8 hy8 = (HY8) this.A01;
                C2lg c2lg = (C2lg) this.A02;
                Sticker sticker3 = (Sticker) this.A03;
                int A03 = c2lg.mViewHolder.A03();
                if (A03 >= 0) {
                    GWm gWm = hy8.A00;
                    CallerContext callerContext = GWm.A0W;
                    Hmu hmu = gWm.A08;
                    if (hmu != null) {
                        hmu.A00(sticker3, A03);
                        return;
                    }
                    return;
                }
                return;
            default:
                11T.A0F(sticker, 0);
                C8o4.A00((1Iw) this.A01, sticker, (96J) this.A03);
                return;
        }
    }
}
