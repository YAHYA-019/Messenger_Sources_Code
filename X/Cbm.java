package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import java.util.EnumSet;

/* loaded from: Cbm.class */
public final class Cbm implements CallerContextable, DJk {
    public static final CallerContext A0A = CallerContext.A06(Cbm.class);
    public static final String __redex_internal_original_name = "NeueContactPickerMontageAudienceLoader";
    public 2eS A00;
    public 2TV A01;
    public 1BY A02;
    public 2TR A03;
    public final C00i A05 = 1BQ.A02(17024);
    public final C00i A09 = AbH.A0F();
    public final C00i A06 = AbH.A0E();
    public final C00i A07 = 1BQ.A01();
    public final C00i A08 = 1BV.A01((1BY) null, 84364);
    public final C00i A04 = 1BV.A01((1BY) null, 83054);

    public Cbm(1BO r302) {
        this.A02 = 7zL.A0Q(r302);
    }

    public void AEC() {
        2TR r0 = this.A03;
        if (r0 != null) {
            r0.AEC();
        }
        2eS r02 = this.A00;
        if (r02 != null) {
            r02.A00(true);
        }
    }

    public void CmR(2TV r302) {
        r302.getClass();
        this.A01 = r302;
    }

    public /* bridge */ /* synthetic */ void D1t(Object obj) {
        this.A05.get();
        this.A03 = 2TN.A02(EnumSet.of(2TP.A02), -1, true);
        FbUserSession A05 = 1Fw.A05(this.A02);
        2TR r0 = this.A03;
        r0.A01 = new C1619Anx(1, A05, obj, this);
        r0.A08();
    }
}
