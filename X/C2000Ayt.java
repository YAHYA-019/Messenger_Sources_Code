package X;

import android.view.View;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.Arrays;

/* renamed from: X.Ayt, reason: case insensitive filesystem */
/* loaded from: Ayt.class */
public final class C2000Ayt extends C1rj {
    public int A00;
    public View.OnClickListener A01;
    public View.OnClickListener A02;
    public C1u3 A03;
    public C1u3 A04;
    public C1u3 A05;
    public MigColorScheme A06;
    public CharSequence A07;
    public CharSequence A08;
    public CharSequence A09;
    public CharSequence A0A;
    public CharSequence A0B;
    public CharSequence A0C;
    public CharSequence A0D;
    public CharSequence A0E;
    public String A0F;

    public C2000Ayt() {
        super("LocationSharingNuxComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A07, this.A01, this.A06, this.A08, this.A03, this.A09, Integer.valueOf(this.A00), this.A0A, this.A02, this.A0B, this.A04, this.A0C, this.A0D, this.A05, this.A0E, this.A0F};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        String str = this.A0F;
        CharSequence charSequence = this.A09;
        CharSequence charSequence2 = this.A08;
        C1u3 c1u3 = this.A03;
        CharSequence charSequence3 = this.A0C;
        CharSequence charSequence4 = this.A0B;
        C1u3 c1u32 = this.A04;
        CharSequence charSequence5 = this.A0E;
        CharSequence charSequence6 = this.A0D;
        C1u3 c1u33 = this.A05;
        CharSequence charSequence7 = this.A07;
        View.OnClickListener onClickListener = this.A01;
        CharSequence charSequence8 = this.A0A;
        View.OnClickListener onClickListener2 = this.A02;
        MigColorScheme migColorScheme = this.A06;
        8NJ r0 = new 8NJ(new 8Lf(onClickListener, onClickListener2, charSequence7, charSequence8), new C8xf(null, this.A00), (CharSequence) null, (CharSequence) null, str, Arrays.asList(new 8Ll(c1u3, charSequence, charSequence2, (String) null), new 8Ll(c1u32, charSequence3, charSequence4, (String) null), new 8Ll(c1u33, charSequence5, charSequence6, (String) null)), true);
        8Tn A00 = C8nn.A00(r302);
        A00.A2a(migColorScheme);
        A00.A2Y(r0);
        return A00.A2W();
    }
}
