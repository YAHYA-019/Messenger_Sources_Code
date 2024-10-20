package X;

import com.facebook.account.twofac.protocol.LoginApprovalResendCodeParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cfw.class */
public final class Cfw implements 1Ro {
    public static final String __redex_internal_original_name = "LoginApprovalResendCodeMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        LoginApprovalResendCodeParams loginApprovalResendCodeParams = (LoginApprovalResendCodeParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        C04083zw A0C = AbH.A0C(new BasicNameValuePair(DKB.A00(392), loginApprovalResendCodeParams.A01), A0s);
        AbF.A1Q(A0C, 1BJ.A00(194));
        A0C.A0F = 0Pz.A0I(loginApprovalResendCodeParams.A00, "/twofacsms");
        A0C.A0J = A0s;
        A0C.A02();
        A0C.A06 = 0S2.A01;
        return A0C.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return null;
    }
}
