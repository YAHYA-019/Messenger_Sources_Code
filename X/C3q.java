package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.presence.DefaultPresenceManager;
import com.facebook.user.model.Name;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.google.common.base.Platform;
import com.google.common.collect.ImmutableList;
import java.util.LinkedList;

/* loaded from: C3q.class */
public final class C3q {
    public 1BY A00;
    public Be5 A01;
    public final 1KE A02 = (1KE) 1Bn.A0B(16480);

    public C3q(1BO r302, Be5 be5) {
        this.A00 = 7zL.A0Q(r302);
        this.A01 = be5;
    }

    public AnonymousClass544 A00(FbUserSession fbUserSession, DK3 dk3, User user, String str, boolean z, boolean z2) {
        1XZ r0;
        Long Asz;
        String str2 = str;
        ImmutableList of = z2 ? ImmutableList.of((Object) new 5A0(new Cx3(this, dk3, user, z), LightColorScheme.A00(), z)) : ImmutableList.of();
        BiM biM = (BiM) 1Bi.A03(84195);
        Resources resources = FbInjector.A00().getResources();
        Name name = user.A0X;
        String A00 = name.A00();
        59C A01 = z ? 5OL.A01(A00, -16743169) : 5OL.A00(A00);
        11T.A0F(fbUserSession, 1);
        ImmutableList.Builder builder = ImmutableList.builder();
        58B r02 = 58B.A0A;
        LinkedList A1F = AbF.A1F();
        UserKey userKey = user.A0k;
        long hashCode = userKey.hashCode();
        1Br.A0C(biM.A00);
        new C58m(((2fZ) 1Lo.A06(fbUserSession, 17067)).A0P(user), null);
        5OL.A00(name.A00());
        1BY r03 = this.A00;
        2fZ r04 = (2fZ) 1Lo.A04((Context) null, fbUserSession, r03, 17067);
        C2fd A04 = ((C2ff) 1Lo.A04((Context) null, fbUserSession, r03, 17069)).A04(user, 60, true);
        C2fr A0R = r04.A0R(user, A04);
        C2qg c2qg = null;
        if (A04 == C2fd.A0a && (Asz = (r0 = (1XZ) 1Bi.A03(65723)).Asz(userKey)) != null) {
            Resources resources2 = FbInjector.A00().getResources();
            C2qg c2qg2 = C2qg.A0C;
            C2qh c2qh = new C2qh();
            c2qh.A06 = resources2.getColor(2132214626);
            c2qh.A02 = resources2.getColor(2132214625);
            c2qh.A09 = ((5Ou) 1Br.A0B(((DefaultPresenceManager) r0).A0I)).A0J(0S2.A0K, Asz.longValue());
            c2qh.A00 = resources2.getColor(2132214426);
            c2qg = new C2qg(c2qh);
        }
        C58m c58m = new C58m(A0R, c2qg);
        String str3 = user.A1N;
        boolean z3 = !Platform.stringIsNullOrEmpty(str2);
        String A002 = CLe.A00(resources, str3, z3);
        if (!z3) {
            str2 = A002;
        } else if (!Platform.stringIsNullOrEmpty(A002)) {
            str2 = 0Pz.A0W(A002, str2);
        }
        5ON A003 = 5OM.A00(str2);
        A1F.add(55J.A00(new CvW(1, user, dk3, this, !z), (C5wx) null));
        AnonymousClass544 A004 = 55L.A00(new 55U(A01, A003, c58m, r02, AbJ.A0s(builder, of), (CharSequence) null, hashCode, true), A1F);
        11T.A0A(A004);
        return A004;
    }
}
