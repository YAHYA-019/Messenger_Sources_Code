package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.8r0, reason: invalid class name */
/* loaded from: 8r0.class */
public final class C8r0 extends C9ct {
    public final Context A00;
    public final BOj A01;
    public final 1pI A02;
    public final 9ZJ A03;
    public final AXY A04;
    public final 83Z A05;
    public final String A06;
    public final 06Z A07;
    public final FbUserSession A08;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8r0(Context context, 06Z r303, BOj bOj, FbUserSession fbUserSession, 1pI r306, AXY axy, String str, String str2) {
        super(str);
        7zP.A1L(fbUserSession, 2, r306);
        this.A00 = context;
        this.A08 = fbUserSession;
        this.A06 = str2;
        this.A07 = r303;
        this.A02 = r306;
        this.A01 = bOj;
        this.A04 = axy;
        this.A03 = new 9ZJ(context, r303, fbUserSession, r306);
        this.A05 = 1BK.A0F();
    }
}
