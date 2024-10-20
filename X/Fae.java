package X;

import android.location.Location;
import com.facebook.auth.component.listener.interfaces.AuthenticationResult;
import com.facebook.auth.credentials.OpenIDLoginCredentials;
import com.facebook.common.callercontext.CallerContext;
import java.util.List;

/* loaded from: Fae.class */
public final class Fae implements GOk {
    public static final String __redex_internal_original_name = "AuthOperations$OpenIDAuthOperation";
    public final OpenIDLoginCredentials A00;
    public final Integer A01;
    public final String A02;
    public final List A03;
    public final /* synthetic */ Fck A04;

    public Fae(OpenIDLoginCredentials openIDLoginCredentials, Fck fck, Integer num, String str, List list) {
        this.A04 = fck;
        this.A00 = openIDLoginCredentials;
        this.A01 = num;
        this.A03 = list;
        this.A02 = str;
    }

    @Override // java.util.concurrent.Callable
    /* renamed from: A00, reason: merged with bridge method [inline-methods] */
    public AuthenticationResult call() {
        C00i c00i;
        C00i c00i2;
        C15h c15h;
        C00i c00i3;
        Fck fck = this.A04;
        String A00 = FFU.A00(fck);
        c00i = fck.A0c;
        String BD0 = 1BK.A0R(c00i).BD0(C1mC.A0A);
        c00i2 = fck.A0f;
        L5D A01 = LBf.A01((C5ez) c00i2.get(), Fck.__redex_internal_original_name, 372368882);
        OpenIDLoginCredentials openIDLoginCredentials = this.A00;
        Location location = A01 == null ? null : new Location(A01.A00);
        c15h = fck.A0y;
        Location location2 = location;
        ROZ roz = new ROZ(location2, openIDLoginCredentials, this.A01, A00, BD0, this.A02, this.A03, 1BL.A1a(c15h));
        1Rl A0Y = DKE.A0Y(fck);
        c00i3 = fck.A0T;
        return (AuthenticationResult) A0Y.A07(CallerContext.A09(getClass(), Fck.__redex_internal_original_name), DKC.A0S(c00i3), (C04033zm) null, roz);
    }
}
