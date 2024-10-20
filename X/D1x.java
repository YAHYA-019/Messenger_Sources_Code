package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.threadsettings2.params.ThreadSettingsParams;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: D1x.class */
public final class D1x implements InterfaceC07434jv {
    public final 1Br A00;
    public final DJX A01;
    public final By6 A02;
    public final String A03;

    public D1x(DJX djx, By6 by6, String str) {
        this.A02 = by6;
        this.A03 = str;
        this.A01 = djx;
        this.A00 = 1Bu.A01(by6.A00, 16979);
    }

    @Override // X.InterfaceC07434jv
    public /* bridge */ /* synthetic */ Object A4o(Object obj, Object obj2) {
        C1787AsL c1787AsL = (C1787AsL) obj;
        11T.A0F(c1787AsL, 0);
        String str = this.A03;
        By6 by6 = this.A02;
        Context context = by6.A00;
        FbUserSession fbUserSession = by6.A02;
        ThreadSettingsParams threadSettingsParams = by6.A07;
        BbC bbC = (BbC) C1Y6.A00(context, "com_facebook_messaging_threadsettings_plugins_interfaces_row_RowInterfaceSpec", str, new Object[]{fbUserSession, threadSettingsParams.A01, c1787AsL.A03, c1787AsL.A00, c1787AsL.A04, c1787AsL.A05, by6.A01, c1787AsL.A01, c1787AsL.A06, by6.A05, by6.A04, by6.A06, this.A01, 1Br.A0B(this.A00), threadSettingsParams.A03});
        ArrayList A0s = AnonymousClass001.A0s();
        DIM dim = bbC.A00;
        String[] Ayr = dim.Ayr();
        11T.A0A(Ayr);
        for (String str2 : Ayr) {
            AtE BLB = dim.BLB(str2);
            if (BLB == null) {
                DG9 B8K = dim.B8K(str2);
                if (B8K != null) {
                    BLB = new AtE(B8K);
                } else {
                    ImmutableList B8Q = dim.B8Q(str2);
                    if (B8Q != null) {
                        ArrayList A0z = 1BL.A0z(B8Q);
                        Iterator it = B8Q.iterator();
                        while (it.hasNext()) {
                            DG9 dg9 = (DG9) it.next();
                            11T.A0D(dg9);
                            A0z.add(new AtE(dg9));
                        }
                        A0s.addAll(A0z);
                    }
                }
            }
            A0s.add(BLB);
        }
        return A0s;
    }
}
