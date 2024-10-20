package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.dbllite.data.DblLiteCredentials;
import com.facebook.fbservice.service.OperationResult;

/* loaded from: Cfb.class */
public final class Cfb implements 1Tu, CallerContextable {
    public static final String __redex_internal_original_name = "DblLiteServiceHandler";
    public final CIA A00;
    public final 1Rl A01;
    public final C00i A02;
    public final C00i A03;
    public final FFU A04;
    public final C15h A05;
    public final Context A06;

    public Cfb(Context context) {
        this.A06 = context;
        CIA cia = (CIA) 1Bi.A03(85159);
        DBS dbs = new DBS(context, this, 0);
        1Rl A0I = AbJ.A0I();
        1BV A0R = 7zL.A0R(context, 85160);
        1BV A00 = 1BV.A00(85035);
        this.A04 = (FFU) 1Bi.A03(100141);
        this.A00 = cia;
        this.A05 = dbs;
        this.A01 = A0I;
        this.A02 = A0R;
        this.A03 = A00;
    }

    public OperationResult BMQ(1TC r302) {
        String str = r302.A06;
        if (str.equals("get_dbl_nonce")) {
            FbUserSession A0C = 4YV.A0C(this.A06);
            String A02 = this.A04.A02();
            String str2 = (String) this.A01.A08(CallerContext.A09(getClass(), __redex_internal_original_name), (1Ro) this.A02.get(), new BbY(A02));
            CIA cia = this.A00;
            DblLiteCredentials dblLiteCredentials = new DblLiteCredentials(((ViewerContext) this.A05.get()).mUserId, str2);
            synchronized (cia) {
                cia.A00.get();
                11T.A0F(A0C, 0);
                1G2 A01 = 1G3.A01(BYR.A00, dblLiteCredentials.userId);
                try {
                    1Ql A0V = 1BL.A0V(cia.A02);
                    A0V.CaL(A01, cia.A03.A0W(dblLiteCredentials));
                    A0V.commit();
                } catch (2LD e) {
                    1BK.A09(cia.A01).softReport("Corrupt DblLiteCredentials Write", "", e);
                }
            }
        } else {
            if (!str.equals("expire_dbl_nonce")) {
                throw 0Pz.A05("Unhandled operation type: ", str);
            }
            String string = r302.A00.getString("account_id");
            String A022 = this.A04.A02();
            CIA cia2 = this.A00;
            DblLiteCredentials A012 = cia2.A01(string);
            if (A012 != null) {
                this.A01.A08(CallerContext.A09(getClass(), __redex_internal_original_name), (1Ro) this.A03.get(), new RKo(A022, string, A012.nonce));
                synchronized (cia2) {
                    cia2.A00.get();
                    1G2 A013 = 1G3.A01(BYR.A00, string);
                    1Ql A0V2 = 1BL.A0V(cia2.A02);
                    A0V2.Cdj(A013);
                    A0V2.commit();
                }
            }
        }
        return OperationResult.A00;
    }
}
