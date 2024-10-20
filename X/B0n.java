package X;

import android.content.Context;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.widget.ImageView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.mapbox.mapboxsdk.R;

/* loaded from: B0n.class */
public final class B0n extends C1rj {
    public int A00;
    public BLZ A01;
    public MigColorScheme A02;
    public CharSequence A03;
    public CharSequence A04;
    public boolean A05;
    public static final MigColorScheme A07 = LightColorScheme.A00();
    public static final BLZ A06 = BLZ.A07;

    public B0n() {
        super("ButtonComponent");
        this.A02 = A07;
        this.A05 = true;
        this.A01 = A06;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [X.1rs, X.Awe] */
    public static C1913Awe A00(1Iw r301) {
        B0n b0n = new B0n();
        ?? c1rs = new C1rs(b0n, r301, 0, 0);
        c1rs.A01 = b0n;
        c1rs.A00 = r301;
        return c1rs;
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, Boolean.valueOf(this.A05), this.A01, this.A03, Integer.valueOf(this.A00), this.A04};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x005f. Please report as an issue. */
    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        7ZL A00;
        8TV A002;
        8TZ A003;
        MigColorScheme migColorScheme = this.A02;
        BLZ blz = this.A01;
        CharSequence charSequence = this.A03;
        int i = this.A00;
        CharSequence charSequence2 = this.A04;
        boolean z = this.A05;
        1GS r0 = (1GS) 1Bi.A03(16504);
        if (i > 0) {
            charSequence = 1BK.A0v(r302.A0D, charSequence2, i).toUpperCase(r0.A05());
        }
        switch (blz.ordinal()) {
            case 0:
                A003 = C8nr.A00(r302);
                A003.A2a(migColorScheme);
                A003.A2b(charSequence);
                A003.A2X(2132345591);
                A003.A1I(2132411183);
                A003.A2c(z);
                return A003.A2W();
            case 1:
                A003 = C8nr.A00(r302);
                A003.A2a(migColorScheme);
                A003.A2b(charSequence);
                A003.A2X(2132345158);
                A003.A01.A00 = R.dimen.mapbox_eight_dp;
                A003.A2c(z);
                return A003.A2W();
            case 2:
            default:
                A003 = C8nr.A00(r302);
                A003.A2a(migColorScheme);
                A003.A2b(charSequence);
                A003.A2c(z);
                return A003.A2W();
            case 3:
                A002 = C8ns.A00(r302);
                A002.A2Y(migColorScheme);
                A002.A2Z(charSequence);
                A002.A2a(z);
                return A002.A2W();
            case 4:
                Context context = r302.A0D;
                RippleDrawable A004 = C2cn.A00(C0A8.A00(context, 16.0f), -11809761, -13002470);
                A00 = C5Ay.A00(r302);
                A00.A00.A0G = charSequence;
                A00.A00.A08 = 2KQ.A03.A00(context);
                A00.A2W(2KV.A06.textSizeSp);
                A00.A0D(A004);
                int i2 = C98U.INVERSE_PRIMARY.colorInt;
                C5Ay c5Ay = A00.A00;
                c5Ay.A00 = i2;
                c5Ay.A0C = ImageView.ScaleType.FIT_CENTER;
                A00.A0t(100.0f);
                A00.A0U();
                A00.A2U(z);
                4YU.A1L(A00, 2RH.A03);
                A00.A00.A03 = 1;
                A00.A0J();
                return A00.A00;
            case 5:
                AwY A005 = B0m.A00(r302);
                A005.A2X(migColorScheme);
                A005.A2Y(charSequence);
                A005.A2Z(z);
                return A005.A2W();
            case 6:
                Context context2 = r302.A0D;
                float A006 = C0A8.A00(context2, 16.0f);
                C6pe c6pe = new C6pe();
                c6pe.A02(251658240);
                c6pe.A00.put(android.R.attr.state_pressed, 520093696);
                RippleDrawable A007 = C2cn.A00(A006, 0, c6pe.A01().getColorForState(BZz.A02, 0));
                A00 = C5Ay.A00(r302);
                A00.A00.A0G = charSequence;
                A00.A2U(z);
                A00.A00.A0B = Layout.Alignment.ALIGN_CENTER;
                A00.A2W(2KV.A05.textSizeSp);
                A00.A00.A08 = 2KQ.A03.A00(context2);
                A00.A0D(A007);
                A00.A2Y(2132214411);
                2RH r02 = 2RH.A05;
                4YU.A1L(A00, r02);
                7zO.A1E(A00, r02);
                A00.A0J();
                return A00.A00;
            case 7:
                RippleDrawable A008 = C2cn.A00(C0A8.A00(r302.A0D, 16.0f), -11809761, -13002470);
                A003 = C8nr.A00(r302);
                A003.A2a(migColorScheme);
                A003.A2b(charSequence);
                A003.A2X(2132345158);
                C8nr c8nr = A003.A01;
                c8nr.A01 = 20;
                c8nr.A00 = R.dimen.mapbox_eight_dp;
                A003.A0D(A008);
                A003.A2c(z);
                return A003.A2W();
            case 8:
                A002 = C8ns.A00(r302);
                A002.A2Y(migColorScheme);
                A002.A2Z(charSequence);
                C8ns c8ns = A002.A01;
                c8ns.A02 = A002.A02.A00.getDrawable(2132345158);
                c8ns.A01 = 20;
                c8ns.A00 = R.dimen.mapbox_eight_dp;
                A002.A2a(z);
                return A002.A2W();
        }
    }
}
