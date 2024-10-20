package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.8qz, reason: invalid class name */
/* loaded from: 8qz.class */
public final class C8qz extends C9ct {
    public final Context A00;
    public final FbUserSession A01;
    public final 1pI A02;
    public final 9TH A03;
    public final 9ZJ A04;
    public final 5xF A05;
    public final 06Z A06;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8qz(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, 9TH r306, 5xF r307) {
        super("AiBotPickerFragment.listener_key");
        4YV.A1M(fbUserSession, 4, r305);
        this.A00 = context;
        this.A01 = fbUserSession;
        this.A03 = r306;
        this.A06 = r303;
        this.A02 = r305;
        this.A05 = r307;
        this.A04 = new 9ZJ(context, r303, fbUserSession, r305);
    }
}
