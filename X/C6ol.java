package X;

import android.graphics.Color;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import java.util.BitSet;

/* renamed from: X.6ol, reason: invalid class name */
/* loaded from: 6ol.class */
public final class C6ol extends C1rj {
    public 06Z A00;
    public FbUserSession A01;
    public 5zD A02;
    public AnonymousClass622 A03;

    public C6ol() {
        super("ForwardButtonComponent");
    }

    public static final void A00(1Iw r301, CNJ cnj, AnonymousClass622 anonymousClass622) {
        Message A01 = CNJ.A01(anonymousClass622.A03, anonymousClass622.A05);
        11T.A0A(A01);
        cnj.A03(r301.A0D, A01, NavigationTrigger.A00(AnonymousClass539.A4i, "forward_gutter"));
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A00, this.A03, this.A02};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        5zD r0 = this.A02;
        AnonymousClass622 anonymousClass622 = this.A03;
        FbUserSession fbUserSession = this.A01;
        06Z r02 = this.A00;
        11T.A0F(r302, 0);
        11T.A0F(anonymousClass622, 2);
        11T.A0F(fbUserSession, 3);
        C1u2 c1u2 = (C1u2) 1Bi.A03(16839);
        6JM r03 = (6JM) 1Bn.A0A(67632);
        1Bn.A0A(67077);
        C54x c54x = new C54x(r302.A0D, fbUserSession);
        float alpha = ((anonymousClass622.A02 != null || anonymousClass622.A03()) && c54x.A00()) ? Color.alpha(r03.A02(r0).AYy()) / 255.0f : 1.0f;
        85I r04 = new 85I(r302, new C6om());
        r04.A0B(alpha);
        int A02 = c1u2.A02(2MQ.A2q, 2Re.A03);
        C6om c6om = r04.A01;
        c6om.A00 = A02;
        BitSet bitSet = r04.A02;
        bitSet.set(1);
        c6om.A02 = r03.A02(r0);
        bitSet.set(0);
        r04.A1J(2131956994);
        C26z c26z = C26z.ALL;
        r04.A29(c26z, 12.0f);
        r04.A2T(1LI.A02(r302, C6ol.class, 0S2.A01, "ForwardButtonComponent", new Object[]{anonymousClass622, c54x, r02}, 1662501186));
        r04.A25(c26z, 6.0f);
        return r04.A2V();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Type inference failed for: r0v116, types: [java.lang.Throwable, boolean] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object A15(X.1Im r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6ol.A15(X.1Im, java.lang.Object):java.lang.Object");
    }
}
