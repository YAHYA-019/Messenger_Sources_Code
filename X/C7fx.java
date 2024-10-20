package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import android.view.ViewOutlineProvider;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.7fx, reason: invalid class name */
/* loaded from: 7fx.class */
public final class C7fx extends C1rj {
    public MigColorScheme A00;
    public String A01;
    public String A02;
    public String A03;

    public C7fx() {
        super("MutedMemberComposer");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00, this.A01, this.A02, this.A03};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        MigColorScheme migColorScheme = this.A00;
        String str = this.A03;
        String str2 = this.A01;
        String str3 = this.A02;
        11T.A0F(r302, 0);
        1BL.A1H(migColorScheme, str, str2);
        11T.A0F(str3, 4);
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        A01.A2b();
        A01.A0e();
        2KD A012 = 2K3.A01(r302, 0);
        A012.A2i();
        A012.A2d();
        A012.A2X();
        4YU.A1L(A012, 2RH.A03);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) str).append((CharSequence) System.getProperty("line.separator")).append((CharSequence) str2);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, str.length(), 17);
        A012.A2z(spannableStringBuilder);
        A012.A2x(migColorScheme);
        4YU.A1K(A01, A012);
        8TV A00 = C8ns.A00(r302);
        A00.A0e();
        A00.A2Z(str3);
        2RH r0 = 2RH.A05;
        4YU.A1N(A00, r0);
        A00.A2Y(migColorScheme);
        A00.A2T(1LI.A09(r302, C7fx.class, "MutedMemberComposer", -1236685267));
        A01.A2e(A00.A2W());
        4YU.A1L(A01, r0);
        A01.A1B(4YU.A00(r0));
        A01.A0w(4YU.A00(2RH.A04));
        A01.A1H(migColorScheme.Abp());
        A01.A1g(ViewOutlineProvider.BOUNDS);
        return A01.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1236685267) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Iw r0 = r302.A00.A00;
        11T.A0F(r0, 0);
        1Bn.A0A(83103);
        Context context = r0.A0D;
        11T.A0A(context);
        CAC.A00(context);
        return null;
    }
}
