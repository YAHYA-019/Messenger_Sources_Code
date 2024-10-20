package X;

import com.facebook.account.twofac.protocol.CheckApprovedMachineMethod$Result;
import com.facebook.account.twofac.protocol.CheckApprovedMachineParams;
import java.util.ArrayList;
import org.apache.http.message.BasicNameValuePair;

/* loaded from: Cfv.class */
public final class Cfv implements 1Ro {
    public static final String __redex_internal_original_name = "CheckApprovedMachineMethod";

    public /* bridge */ /* synthetic */ C04103zy B7F(Object obj) {
        CheckApprovedMachineParams checkApprovedMachineParams = (CheckApprovedMachineParams) obj;
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new BasicNameValuePair("u", String.valueOf(checkApprovedMachineParams.A00)));
        C04083zw A0C = AbH.A0C(new BasicNameValuePair("m", checkApprovedMachineParams.A01), A0s);
        AbF.A1P(A0C, "checkApprovedMachine");
        A0C.A0F = 1BJ.A00(83);
        A0C.A0J = A0s;
        A0C.A02();
        A0C.A06 = 0S2.A0C;
        return A0C.A01();
    }

    public /* bridge */ /* synthetic */ Object B7m(AnonymousClass439 anonymousClass439, Object obj) {
        anonymousClass439.A03();
        return anonymousClass439.A00().A1W(CheckApprovedMachineMethod$Result.class);
    }
}
