package X;

import android.R;
import android.content.Context;
import android.view.View;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* renamed from: X.Aym, reason: case insensitive filesystem */
/* loaded from: Aym.class */
public final class C1993Aym extends C1rj {
    public View.OnClickListener A00;
    public View.OnClickListener A01;
    public FbUserSession A02;
    public BvC A03;
    public MigColorScheme A04;
    public C5xv A05;
    public User A06;
    public boolean A07;
    public boolean A08;

    public C1993Aym() {
        super("RestrictNuxComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A04, this.A00, this.A03, this.A02, Boolean.valueOf(this.A07), this.A05, this.A01, Boolean.valueOf(this.A08), this.A06};
    }

    /* JADX WARN: Type inference failed for: r0v49, types: [X.2qQ, java.lang.Object] */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        BCz c8xd;
        ImmutableList A01;
        String string;
        MigColorScheme migColorScheme = this.A04;
        BvC bvC = this.A03;
        boolean z = this.A07;
        View.OnClickListener onClickListener = this.A01;
        View.OnClickListener onClickListener2 = this.A00;
        boolean z2 = this.A08;
        C5xv c5xv = this.A05;
        FbUserSession fbUserSession = this.A02;
        User user = this.A06;
        boolean A1X = 1BL.A1X(r302, migColorScheme);
        7zS.A17(2, bvC, onClickListener, onClickListener2);
        11T.A0F(c5xv, 7);
        11T.A0F(fbUserSession, 8);
        2cM A012 = 2cK.A01(r302, (String) null, 0);
        7zM.A1O(A012, migColorScheme);
        if (z2) {
            C5yw A00 = C5yv.A00(r302);
            A00.A2b(migColorScheme);
            A00.A2i(false);
            A00.A2Y();
            A00.A2d(c5xv);
            AbH.A1Q(A012, A00);
        }
        1Br r0 = bvC.A04;
        String A0u = user != null ? 4YU.A0u((1Ih) 1Br.A0B(r0), AbF.A1B(user), 2131962407) : ((1Ih) 1Br.A0B(r0)).getString(2131962372);
        11T.A0A(A0u);
        if (user != null) {
            C2fr A0P = ((2fZ) 4YU.A0o(fbUserSession, bvC.A00, 17067)).A0P(user);
            11T.A0A(A0P);
            c8xd = new BCz(A0P);
        } else {
            MigColorScheme A0m = 7zQ.A0m(bvC.A01);
            ?? obj = new Object();
            7zM.A1V((2qQ) obj, 2132476034);
            c8xd = new C8xd(7zT.A02((2qQ) obj, A0m, 2132476035), "messenger_restrict_nux", "RestrictNuxComponentSpec error");
        }
        if (user != null) {
            ImmutableList.Builder builder = ImmutableList.builder();
            builder.m11011add((Object) 8Ll.A01(C1u3.A2d, ((1Ih) 1Br.A0B(r0)).getString(2131962388), ((1Ih) 1Br.A0B(r0)).getString(2131962387), (String) null, 8));
            if (!AbL.A1I(bvC.A03)) {
                builder.m11011add((Object) 8Ll.A01(C1u3.A04, ((1Ih) 1Br.A0B(r0)).getString(2131962362), ((1Ih) 1Br.A0B(r0)).getString(2131962361), (String) null, 8));
            }
            builder.m11011add((Object) 8Ll.A01(C1u3.A6e, ((1Ih) 1Br.A0B(r0)).getString(2131962406), ((1Ih) 1Br.A0B(r0)).getString(2131962405), (String) null, 8));
            A01 = 1Fj.A01(builder);
            string = 4YU.A0u((1Ih) 1Br.A0B(r0), AbF.A1B(user), 2131962395);
        } else {
            Context A0A = 7zL.A0A(r302);
            ImmutableList.Builder builder2 = ImmutableList.builder();
            builder2.m11011add((Object) 8Ll.A01(C1u3.A5q, ((1Ih) 1Br.A0B(r0)).getString(2131962398), ((1Ih) 1Br.A0B(r0)).getString(2131962387), (String) null, 8));
            if (!AbL.A1I(bvC.A03)) {
                builder2.m11011add((Object) 8Ll.A01(C1u3.A04, ((1Ih) 1Br.A0B(r0)).getString(2131962362), ((1Ih) 1Br.A0B(r0)).getString(2131962370), (String) null, 8));
            }
            C1u3 c1u3 = C1u3.A6e;
            String string2 = ((1Ih) 1Br.A0B(r0)).getString(2131962406);
            String A0t = 4YU.A0t((1Ih) 1Br.A0B(r0), 2131962374);
            String A0t2 = 4YU.A0t((1Ih) 1Br.A0B(r0), 2131962375);
            EC2 A013 = ((CFx) 1Br.A0B(bvC.A02)).A01(A0A, onClickListener, 7zQ.A0m(bvC.A01));
            0Dc A0F = 7zS.A0F(A0A, A0t);
            if (z) {
                A0F.A05(A013, "%1$s", A0t2, 33);
            } else {
                A0F.A06("%1$s", A0t2);
            }
            builder2.m11011add((Object) 8Ll.A01(c1u3, string2, 7zM.A0E(A0F), (String) null, 8));
            A01 = 1Fj.A01(builder2);
            string = ((1Ih) 1Br.A0B(r0)).getString(R.string.ok);
        }
        11T.A0A(string);
        8NJ r02 = new 8NJ(new 8Lf(onClickListener2, string), c8xd, (CharSequence) null, (CharSequence) null, A0u, A01, A1X);
        8Tn A002 = C8nn.A00(r302);
        A002.A2a(migColorScheme);
        A002.A2Y(r02);
        return 7zL.A0V(A012, A002.A2W());
    }
}
