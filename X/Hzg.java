package X;

import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import com.facebook.inject.FbInjector;

/* loaded from: Hzg.class */
public final class Hzg {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1BP A05;
    public final 1De A06;

    public Hzg(1De r302) {
        this.A06 = r302;
        1BY r0 = r302.A00;
        this.A02 = 1Bu.A03(r0, 49358);
        this.A01 = 1Bq.A00(49458);
        this.A00 = AbG.A0M();
        this.A05 = FbInjector.A00;
        this.A03 = 7zM.A0U();
        this.A04 = 1Bu.A03(r0, 68463);
    }

    public static final PendingIntent A00(Hzg hzg, Enum r302, String str) {
        String A01 = ((51X) 1Br.A0B(hzg.A01)).A01(str);
        11T.A0A(A01);
        Intent A0A = 4YU.A0A(A01);
        05X r0 = new 05X();
        r0.A0D(A0A, FbInjector.A03.getClassLoader());
        r0.A0A();
        ((05Y) r0).A08 = new AnonymousClass488(1Br.A04(hzg.A00), "SecurePendingIntent");
        if (r302 != null) {
            String name = r302.name();
            Bundle bundle = ((05Y) r0).A07;
            if (bundle == null) {
                bundle = 1BK.A05();
                ((05Y) r0).A07 = bundle;
            }
            bundle.putString("INCALL_NOTIFICATION_TYPE_KEY", name);
        }
        return r0.A02(FbInjector.A03, 0, 134217728);
    }
}
