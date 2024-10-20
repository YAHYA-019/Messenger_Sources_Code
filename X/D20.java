package X;

import android.content.Context;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import java.util.ArrayList;

/* loaded from: D20.class */
public final class D20 implements InterfaceC07434jv {
    public final DJX A00;
    public final By6 A01;
    public final String A02;

    public D20(DJX djx, By6 by6, String str) {
        this.A01 = by6;
        this.A02 = str;
        this.A00 = djx;
    }

    public static void A00(DJX djx, By6 by6, BjO bjO, String str) {
        bjO.A00.add(new D1s(new D20(djx, by6, str)));
    }

    @Override // X.InterfaceC07434jv
    public /* bridge */ /* synthetic */ Object A4o(Object obj, Object obj2) {
        C1787AsL c1787AsL = (C1787AsL) obj;
        11T.A0F(c1787AsL, 0);
        String str = this.A02;
        By6 by6 = this.A01;
        Context context = by6.A00;
        ThreadKey threadKey = by6.A07.A01;
        06Z r0 = by6.A01;
        User user = c1787AsL.A01;
        BNH bnh = BNH.A09;
        Capabilities capabilities = c1787AsL.A03;
        ThreadSummary threadSummary = c1787AsL.A00;
        2Sh r02 = c1787AsL.A04;
        DHb dHb = by6.A04;
        DJX djx = this.A00;
        DHd dHd = by6.A06;
        1G1 r03 = by6.A02;
        DHu dHu = ((Bb6) C1Y6.A00(context, "com_facebook_messaging_threadsettings_plugins_interfaces_actionbutton_ActionButtonInterfaceSpec", str, new Object[]{threadKey, r0, user, bnh, capabilities, threadSummary, r02, dHb, djx, dHd, r03.A02, r03, by6.A05})).A00;
        String[] Ayr = dHu.Ayr();
        ArrayList A0y = 7zO.A0y(Ayr);
        for (String str2 : Ayr) {
            if (dHu.BLA(str2) != null) {
                throw AnonymousClass001.A0Q("getIcon");
            }
            C8R AVD = dHu.AVD(str2);
            if (AVD != null) {
                A0y.add(AVD);
            }
        }
        return A0y.isEmpty() ? null : new AtC(A0y);
    }
}
