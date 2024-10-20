package X;

import com.facebook.auth.usersession.FbUserSession;

/* loaded from: AKn.class */
public final class AKn extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKn(Object obj, Object obj2, String str, int i, boolean z) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
        this.A03 = str;
        this.A04 = z;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        if (this.A00 != 0) {
            String str = this.A03;
            if (str != null) {
                C9mb c9mb = (C9mb) this.A02;
                FbUserSession fbUserSession = (FbUserSession) this.A01;
                C9mb.A02(fbUserSession, c9mb, str, new 84V(2, c9mb, fbUserSession, this.A04));
            }
        } else {
            C9mb c9mb2 = (C9mb) this.A02;
            FbUserSession fbUserSession2 = (FbUserSession) this.A01;
            C9mb.A02(fbUserSession2, c9mb2, this.A03, new 84V(2, c9mb2, fbUserSession2, this.A04));
        }
        return 04S.A00;
    }
}
