package X;

import android.net.Uri;
import com.facebook.common.callercontext.CallerContext;

/* renamed from: X.8ev, reason: invalid class name */
/* loaded from: 8ev.class */
public final class C8ev extends 1LH {
    public static final CallerContext A01 = CallerContext.A0B("AvatarHeartPowerUpComponent");
    public final Uri A00;

    public C8ev(Uri uri) {
        this.A00 = uri;
    }

    public 1LI A0s(C2k5 c2k5) {
        C06974ih c06974ih = (C06974ih) 2rO.A00(c2k5, APj.A00, 7zL.A1Z(c2k5));
        5BH A012 = 5BG.A01(c2k5.A05);
        A012.A2X(this.A00);
        A012.A0l(130.0f);
        A012.A0L();
        A012.A2Z(c06974ih);
        A012.A2b(A01);
        A012.A2L("avatar_power_up");
        return 7zO.A0O(A012);
    }
}
