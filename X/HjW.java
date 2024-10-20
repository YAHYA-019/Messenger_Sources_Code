package X;

import android.os.Build;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;

/* loaded from: HjW.class */
public final class HjW {
    public final FbUserSession A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final boolean A05;
    public final boolean A06;
    public final 1BP A07;

    public HjW(FbUserSession fbUserSession) {
        boolean z;
        11T.A0F(fbUserSession, 1);
        this.A00 = fbUserSession;
        1BP r0 = FbInjector.A00;
        this.A07 = r0;
        this.A01 = 1Bu.A00(115291);
        this.A02 = 1Bu.A00(85151);
        this.A04 = 1Bq.A00(6);
        this.A03 = 7zM.A0g(FbInjector.A03, 67579);
        Hmr hmr = (Hmr) 1Br.A0B(this.A01);
        if (!0Kh.A01()) {
            int i = Build.VERSION.SDK_INT;
            11T.A0A(r0);
            if (FbInjector.A03.getPackageManager().hasSystemFeature(i >= 33 ? "android.software.telecom" : "android.software.connectionservice") && 0Em.A00(FbInjector.A03, "android.permission.MANAGE_OWN_CALLS") == 0) {
                z = 1Br.A07(hmr.A00).AZk(36312243385798820L);
                this.A05 = z;
                this.A06 = ((Hmr) 1Br.A0B(this.A01)).A00();
            }
        }
        z = false;
        this.A05 = z;
        this.A06 = ((Hmr) 1Br.A0B(this.A01)).A00();
    }
}
