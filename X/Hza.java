package X;

import android.content.Context;
import android.net.Uri;
import com.facebook.inject.FbInjector;

/* loaded from: Hza.class */
public final class Hza {
    public static final Uri A06 = 4YU.A0F("content://sms/queued");
    public static final String[] A07 = {"_id"};
    public long A00;
    public final Context A02;
    public final 1GU A03;
    public final AbR A04;
    public boolean A01 = false;
    public final Object A05 = AnonymousClass001.A0R();

    public Hza() {
        1GU A0A = AbI.A0A();
        AbR A0U = DKC.A0U(84747);
        Context A00 = FbInjector.A00();
        C0dp A0B = AbI.A0B();
        this.A03 = A0A;
        this.A04 = A0U;
        this.A02 = A00;
        this.A00 = A0B.now();
    }
}
