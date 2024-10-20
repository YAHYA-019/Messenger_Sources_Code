package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.fbavatar.artifacto.AvatarArtifactRepository;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.9bv, reason: invalid class name */
/* loaded from: 9bv.class */
public final class C9bv {
    public final 1Br A01;
    public final 1Br A03;
    public final 1Br A02 = 1Bu.A00(68722);
    public final ConcurrentHashMap A05 = new ConcurrentHashMap();
    public final Set A04 = Collections.synchronizedSet(AnonymousClass001.A0v());
    public Set A00 = Collections.synchronizedSet(AnonymousClass001.A0v());

    public C9bv(FbUserSession fbUserSession) {
        this.A01 = 1Lm.A01(fbUserSession, 68721);
        this.A03 = 1Lm.A01(fbUserSession, 68723);
    }

    public final AHv A00(String... strArr) {
        0oW r303;
        AHv A00 = AvatarArtifactRepository.A00(C9s5.A00, 7zP.A0Q(this.A01), null, 02L.A09(strArr));
        AJV ajv = new AJV(this, null, 30);
        int i = 0Jx.A00;
        0oS r0 = new 0oS(ajv, A00, 5);
        if (i <= 0) {
            throw AnonymousClass001.A0L(0Pz.A0T("Expected positive concurrency level, but had ", i));
        }
        if (i == 1) {
            r303 = new 0oW(r0, 4);
        } else {
            r303 = new 0Wa(0S2.A00, 0DL.A00, r0, i, -2);
        }
        return new AHv(this, 0Pf.A00(r303, 100), 3);
    }

    public final Object A01(String str, 0DR r303, String[] strArr) {
        Object A03 = 7zP.A0Q(this.A01).A03(C9s5.A00, str, null, r303, (String[]) Arrays.copyOf(strArr, strArr.length));
        if (A03 != 0Ds.A02) {
            A03 = 04S.A00;
        }
        return A03;
    }
}
