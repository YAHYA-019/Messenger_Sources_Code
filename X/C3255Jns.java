package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.businessextension.jscalls.BusinessExtensionJSBridgeCall;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCall;
import java.util.concurrent.Executor;

/* renamed from: X.Jns, reason: case insensitive filesystem */
/* loaded from: Jns.class */
public final class C3255Jns extends KeS implements MIJ {
    public Kk3 A00;
    public RequestAutofillJSBridgeCall A01;
    public 1BY A02;
    public final F6F A03;
    public final KzA A04;
    public final KWH A05;
    public final C00i A06;
    public final C00i A07;
    public final C4O A08;
    public final C00i A09;
    public final C00i A0A;
    public final Eog A0B;
    public final L4p A0C;

    public C3255Jns(1BO r302) {
        super((KWH) 1Bi.A03(131186));
        this.A03 = (F6F) 1Bi.A03(100034);
        this.A04 = (KzA) 1Bi.A03(131111);
        this.A09 = 1BQ.A00();
        L4p l4p = (L4p) 1Bi.A03(131181);
        this.A0C = l4p;
        Eog eog = (Eog) 1Bn.A0B(98529);
        this.A0B = eog;
        this.A06 = 1BQ.A01();
        this.A08 = (C4O) 1Bn.A0B(82698);
        1BQ A02 = 1BQ.A02(16476);
        this.A07 = A02;
        1BQ A022 = 1BQ.A02(16432);
        this.A0A = A022;
        this.A05 = (KWH) 1Bi.A03(131186);
        this.A02 = 7zL.A0Q(r302);
        this.A00 = new Kk3(eog, l4p, (Executor) A022.get(), (Executor) A02.get());
    }

    public String Asb() {
        return "requestAutoFill";
    }

    public void BM9(BusinessExtensionJSBridgeCall businessExtensionJSBridgeCall, RDn rDn) {
        if (1BK.A0N(this.A09).AZk(36314266315398960L)) {
            RequestAutofillJSBridgeCall requestAutofillJSBridgeCall = (RequestAutofillJSBridgeCall) businessExtensionJSBridgeCall;
            if (rDn == null || requestAutofillJSBridgeCall.A04("JS_BRIDGE_PAGE_ID") == null || C0A2.A03(requestAutofillJSBridgeCall.A06).toString() == null) {
                requestAutofillJSBridgeCall.A06(2018154, null);
            }
            FbUserSession A05 = 1Fw.A05(this.A02);
            this.A08.A00(A05, new LUt(this, requestAutofillJSBridgeCall), rDn.A00, (String) requestAutofillJSBridgeCall.A04("JS_BRIDGE_PAGE_ID"), C0A2.A03(requestAutofillJSBridgeCall.A06).toString());
        }
    }
}
