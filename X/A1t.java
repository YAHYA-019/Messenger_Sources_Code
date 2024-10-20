package X;

import com.facebook.location.providers.FbLocationStatusMonitor;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messenger.app.accountcustomdata.MessengerAccountCustomDataListener;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: A1t.class */
public final class A1t implements 1HN, 1HO {
    public final int A00;
    public final Object A01;

    public A1t(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void onSharedPreferenceChanged(FbSharedPreferences fbSharedPreferences, 1G2 r303) {
        C6s0 c6s0;
        switch (this.A00) {
            case 0:
                FbLocationStatusMonitor fbLocationStatusMonitor = (FbLocationStatusMonitor) this.A01;
                String str = FbLocationStatusMonitor.A09;
                if (r303.equals(((1Ky) 1Bn.A0A(98565)).A01("location_interstitial"))) {
                    FbLocationStatusMonitor.A01(fbLocationStatusMonitor);
                    return;
                }
                return;
            case 1:
                11T.A0F(r303, 1);
                1G2 r0 = 1NK.A05;
                ThreadKey A00 = AbstractC03303xn.A00(r303);
                C07644ka c07644ka = (C07644ka) this.A01;
                if (11T.A0O(c07644ka.A06, A00)) {
                    if (!((2Ph) 1Br.A0B(c07644ka.A03)).A0B(r0)) {
                        7Hv r02 = c07644ka.A05;
                        r02.A00 = c07644ka.A04;
                        c6s0 = r02.A00();
                    } else {
                        c6s0 = null;
                    }
                    c07644ka.A05(c6s0);
                    return;
                }
                return;
            case 2:
                C07704kg c07704kg = (C07704kg) this.A01;
                if (C07704kg.A01(c07704kg, c07704kg.A0E)) {
                    c07704kg.A05(null);
                    6mO r03 = c07704kg.A00;
                    if (r03 != null) {
                        r03.A01();
                        return;
                    }
                    return;
                }
                return;
            case 3:
                7UJ.A00((7UJ) this.A01);
                return;
            case 4:
                MessengerAccountCustomDataListener messengerAccountCustomDataListener = (MessengerAccountCustomDataListener) this.A01;
                1G2 r04 = 1NK.A5z;
                if (r04.equals(r303)) {
                    1BK.A0R(messengerAccountCustomDataListener.A04).D63(messengerAccountCustomDataListener.A06, r04);
                }
                MessengerAccountCustomDataListener.A00(messengerAccountCustomDataListener);
                return;
            case 5:
                6F2.A0Z((6F2) this.A01);
                return;
            default:
                6V6 r05 = (6V6) this.A01;
                synchronized (r05) {
                    6V9 r06 = (6V9) 1Br.A0B(r05.A09);
                    FbSharedPreferences A09 = 1Br.A09(r05.A0F);
                    11T.A0D(A09);
                    r05.A03 = 6V9.valueOf(6VB.A01(A09, (6VA) 1Br.A0B(r05.A0H), r06));
                }
                return;
        }
    }
}
