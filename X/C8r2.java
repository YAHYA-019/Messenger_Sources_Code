package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* renamed from: X.8r2, reason: invalid class name */
/* loaded from: 8r2.class */
public final class C8r2 extends 9aE {
    public final BOj A00;
    public final 1pI A01;
    public final 8Cr A02;
    public final 83Z A03;
    public final String A04;
    public final Context A05;
    public final 06Z A06;
    public final FbUserSession A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8r2(Context context, 06Z r303, BOj bOj, FbUserSession fbUserSession, 1pI r306, 8Cr r307, String str, String str2) {
        super(str);
        7zP.A1L(fbUserSession, 2, r306);
        this.A05 = context;
        this.A07 = fbUserSession;
        this.A04 = str2;
        this.A06 = r303;
        this.A01 = r306;
        this.A02 = r307;
        this.A00 = bOj;
        this.A03 = 1BK.A0F();
    }
}
