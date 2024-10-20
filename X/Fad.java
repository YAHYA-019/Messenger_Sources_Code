package X;

import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.common.callercontext.CallerContext;

/* loaded from: Fad.class */
public final class Fad implements GOk {
    public static final String __redex_internal_original_name = "AuthOperations$SsoAuthOperation";
    public final String A00;
    public final String A01;
    public final /* synthetic */ Fck A02;

    public Fad(Fck fck, String str, String str2) {
        this.A02 = fck;
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AuthenticationResult call() {
        C00i c00i;
        C15h c15h;
        Fhv fhv;
        Fck fck = this.A02;
        String A00 = FFU.A00(fck);
        c00i = fck.A0c;
        String BD0 = 1BK.A0R(c00i).BD0(C1mC.A0A);
        String str = this.A00;
        c15h = fck.A0y;
        EpG epG = new EpG(str, A00, BD0, (String) null, this.A01, 1BL.A1a(c15h));
        1Rl A0Y = DKE.A0Y(fck);
        fhv = fck.A0C;
        return (AuthenticationResult) A0Y.A07(CallerContext.A09(getClass(), Fck.__redex_internal_original_name), fhv, (C04033zm) null, epG);
    }
}
