package X;

import android.graphics.drawable.Drawable;
import com.facebook.graphql.enums.GraphQLLSVerifiedType;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.8ca, reason: invalid class name */
/* loaded from: 8ca.class */
public final class C8ca extends 1LH {
    public final Drawable A00;
    public final GraphQLLSVerifiedType A01;
    public final MigColorScheme A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final C00m A06;

    public C8ca(Drawable drawable, GraphQLLSVerifiedType graphQLLSVerifiedType, MigColorScheme migColorScheme, String str, String str2, String str3, C00m c00m) {
        1BL.A1F(migColorScheme, drawable);
        this.A02 = migColorScheme;
        this.A00 = drawable;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = str3;
        this.A01 = graphQLLSVerifiedType;
        this.A06 = c00m;
    }

    public 1LI A0s(C2k5 c2k5) {
        2cL r304;
        String str;
        1Iw A0T = 7zO.A0T(c2k5);
        float[] A00 = new 75E(7zL.A0A(A0T)).A00(14);
        C85r A01 = 7LG.A01(A0T);
        MigColorScheme migColorScheme = this.A02;
        A01.A2Z(migColorScheme);
        String str2 = this.A05;
        if (str2 == null || (str = this.A03) == null) {
            r304 = null;
        } else {
            2lQ r0 = 2lO.A02;
            2lO A002 = 7zR.A0Q(7zR.A0Q(7zS.A0d((2lO) null, str2), 0S2.A01, "android.widget.ImageView"), 0S2.A0j, 1).A00(7zR.A0S((2lO) null, this.A00, 1));
            C2sn A0I = 7zS.A0I(c2k5);
            C87o A003 = C87n.A00(A0T);
            A003.A2X(migColorScheme);
            A003.A2Y(str2);
            String str3 = this.A04;
            C87n c87n = A003.A01;
            c87n.A05 = str3;
            c87n.A02 = C87t.A02;
            A003.A2Z(str);
            A003.A12(12.0f);
            A003.A0Y();
            c87n.A00 = this.A01;
            r304 = 7zM.A0l(A003.A2V(), A0I, c2k5, A002);
        }
        A01.A2Y(r304);
        1LI A2V = A01.A2V();
        C85d A004 = 7Gw.A00(A0T);
        2lQ r02 = 2lO.A02;
        7zS.A1M(A004, (2lO) null, 0S2.A1G, AV1.A00(this, 7), 1);
        A004.A2Y(A00);
        A004.A2X(A2V);
        return A004.A2V();
    }
}
