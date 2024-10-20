package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCall;
import com.facebook.user.model.User;

/* renamed from: X.Jnt, reason: case insensitive filesystem */
/* loaded from: Jnt.class */
public final class C3256Jnt extends KeS implements MIJ {
    public Kk4 A00;
    public SaveAutofillDataJSBridgeCall A01;
    public 1BY A02;
    public final F6F A03;
    public final KzA A04;
    public final KWH A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final Eog A09;
    public final L4p A0A;
    public final Etq A0B;
    public final User A0C;
    public final C4O A0D;
    public final C00i A0E;

    public C3256Jnt(1BO r302) {
        super((KWH) 1Bi.A03(131186));
        this.A0E = 1BQ.A00();
        this.A06 = 1BQ.A01();
        this.A03 = (F6F) 1Bi.A03(100034);
        this.A04 = (KzA) 1Bi.A03(131111);
        this.A0A = (L4p) 1Bi.A03(131181);
        this.A09 = (Eog) 1Bn.A0B(98529);
        this.A0B = (Etq) 1Bn.A0B(98530);
        this.A0D = (C4O) 1Bn.A0B(82698);
        this.A07 = 1BQ.A02(16476);
        this.A08 = 1BQ.A02(16432);
        this.A0C = (User) 1Bn.A0B(83430);
        this.A05 = (KWH) 1Bi.A03(131186);
        this.A02 = 7zL.A0Q(r302);
    }

    public String Asb() {
        return "saveAutofillData";
    }

    public void BM9(BusinessExtensionJSBridgeCall businessExtensionJSBridgeCall, RDn rDn) {
        if (1BK.A0N(this.A0E).AZk(36314266315464497L)) {
            SaveAutofillDataJSBridgeCall saveAutofillDataJSBridgeCall = (SaveAutofillDataJSBridgeCall) businessExtensionJSBridgeCall;
            if (rDn == null || saveAutofillDataJSBridgeCall.A04("JS_BRIDGE_PAGE_ID") == null || C0A2.A03(saveAutofillDataJSBridgeCall.A06).toString() == null) {
                saveAutofillDataJSBridgeCall.A06(2018154, null);
            }
            FbUserSession A05 = 1Fw.A05(this.A02);
            this.A0D.A00(A05, new LUu(this, saveAutofillDataJSBridgeCall), rDn.A00, (String) saveAutofillDataJSBridgeCall.A04("JS_BRIDGE_PAGE_ID"), C0A2.A03(saveAutofillDataJSBridgeCall.A06).toString());
        }
    }
}
