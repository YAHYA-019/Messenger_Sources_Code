package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;

/* loaded from: J8p.class */
public final class J8p extends C00q implements C00m {
    public final /* synthetic */ GrN this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public J8p(GrN grN) {
        super(0);
        this.this$0 = grN;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        1Br.A0C(1Bu.A01(this.this$0.A01, 147702));
        GrN grN = this.this$0;
        FbUserSession fbUserSession = grN.A02;
        Context context = grN.A01;
        Ify A0r = GOn.A0r(grN.A0c);
        Ifz ifz = (Ifz) this.this$0.A0d.getValue();
        7zT.A1S(fbUserSession, context, A0r);
        11T.A0F(ifz, 3);
        return new Hqc(context, fbUserSession, A0r, ifz);
    }
}
