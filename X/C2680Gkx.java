package X;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.LithoView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.Gkx, reason: case insensitive filesystem */
/* loaded from: Gkx.class */
public final class C2680Gkx extends LithoView {
    public HbL A00;
    public C5ww A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 0AE A08;

    public C2680Gkx(Context context) {
        super(context, (AttributeSet) null);
        this.A08 = new 0AE(10);
        this.A06 = 1Bu.A00(84083);
        this.A04 = 1Bu.A00(49505);
        this.A07 = 1Bu.A00(147710);
        this.A05 = 1Bu.A00(82069);
        this.A02 = 1Bq.A00(68640);
        this.A03 = GOn.A0R(context);
        AbstractC2326GOr.A1G(((LithoView) this).A09, this, false);
    }

    public static final C59g A05(C2680Gkx c2680Gkx, boolean z) {
        2MQ r0 = 2MQ.A27;
        2Re r02 = 2Re.A02;
        String string = c2680Gkx.getResources().getString(2131965232);
        MigColorScheme A0m = 7zQ.A0m(c2680Gkx.A03);
        AnonymousClass553 A06 = A06(c2680Gkx, 5);
        11T.A0F(A0m, 4);
        return new C59g(r0, r02, C83o.A02, A06, null, A0m, 0S2.A0C, string, 0, z);
    }

    public static final AnonymousClass553 A06(C2680Gkx c2680Gkx, int i) {
        0AE r0 = c2680Gkx.A08;
        IaY iaY = (AnonymousClass553) C0Ak.A00(r0, i);
        if (iaY == null) {
            iaY = new IaY(i, 1, c2680Gkx);
            r0.A09(i, iaY);
        }
        return iaY;
    }

    public static final String A09(C2680Gkx c2680Gkx, IYC iyc) {
        if (iyc.A0H) {
            String string = c2680Gkx.getResources().getString(2131965243);
            11T.A0D(string);
            return string;
        }
        String str = iyc.A06;
        11T.A0A(str);
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x006a, code lost:
    
        if (r302.intValue() == 7) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A0B(X.C2680Gkx r301, java.lang.Integer r302, int r303, boolean r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2680Gkx.A0B(X.Gkx, java.lang.Integer, int, boolean, boolean):java.lang.String");
    }
}
