package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.List;

/* renamed from: X.Gl6, reason: case insensitive filesystem */
/* loaded from: Gl6.class */
public final class C2688Gl6 extends C1rj {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public 8Ln A04;
    public 1Im A05;
    public MigColorScheme A06;
    public HAN A07;
    public List A08;
    public boolean A09;

    public C2688Gl6() {
        super("ResumeRecordingButton");
    }

    public final Object[] A0k() {
        return new Object[]{this.A06, this.A08, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A05, Boolean.valueOf(this.A09), this.A07, this.A04, Integer.valueOf(this.A02), Integer.valueOf(this.A03)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        2MQ r321;
        2Re r315;
        int i;
        MigColorScheme migColorScheme = this.A06;
        int i2 = this.A02;
        int i3 = this.A03;
        int i4 = this.A01;
        int i5 = this.A00;
        List list = this.A08;
        8Ln r0 = this.A04;
        1Im r02 = this.A05;
        HAN han = this.A07;
        boolean z = this.A09;
        boolean A1X = 1BL.A1X(r302, migColorScheme);
        7zS.A18(7, r0, r02, han);
        C1u2 A0I = 4YV.A0I();
        HAN han2 = HAN.A05;
        if (han == han2) {
            r321 = 2MQ.A2O;
            r315 = r0.A00 ? 2Re.A01 : 2Re.A02;
            i = 2131962967;
        } else {
            r321 = 2MQ.A29;
            r315 = 2Re.A02;
            i2 = i5;
            i = 2131964559;
            i3 = i4;
        }
        2zB A00 = 2cP.A00(r302);
        A00.A2a(migColorScheme);
        A00.A2Z(A0I.A05(r321, r315));
        if (list != null && han == han2) {
            i3 = DKE.A0G(list, A1X ? 1 : 0);
        }
        3yK r03 = new 3yK(i3, i3);
        2cP r04 = A00.A01;
        r04.A04 = r03;
        A00.A2X(24.0f);
        boolean z2 = !z;
        A00.A2b(z2);
        if (r0.A00 && han == han2) {
            r04.A05 = 2cQ.A05;
        } else {
            A00.A1H(0);
        }
        C1rq A002 = C1rg.A00(r302);
        Context context = r302.A0D;
        11T.A0A(context);
        C6nd c6nd = new C6nd();
        Object obj = r0.A04;
        Integer num = 0S2.A01;
        Resources resources = context.getResources();
        int A01 = obj == num ? GOo.A01(resources) / 2 : resources.getDimensionPixelSize(2132279311);
        int A04 = DKC.A04(context.getResources());
        66S r05 = new 66S(7Sm.A00(context) ? AbstractC2327GOs.A0I(A01, A04) : AbstractC2327GOs.A0I(A04, A01));
        if (list != null) {
            c6nd.A06(new 7uW(0S2.A00, 0QD.A0n(list)));
        } else {
            c6nd.A05(i2, false);
        }
        c6nd.setAlpha(Color.alpha(i2));
        c6nd.A07(r05);
        A002.A0D(c6nd);
        A002.A1W(2132279359);
        A002.A1M(2132279359);
        C26z c26z = C26z.END;
        float f = 0.0f;
        if (obj == num) {
            f = 2.0f;
        }
        A002.A25(c26z, f);
        A002.A2b();
        A002.A2c();
        A002.A2T(r02);
        A002.A2f(A00.A2W());
        A002.A2U(z2);
        A002.A1J(i);
        A002.A0F(1BJ.A00(ActionId.POPULATE_CONSISTENCY_MEMORY_CACHE));
        return A002.A00;
    }
}
