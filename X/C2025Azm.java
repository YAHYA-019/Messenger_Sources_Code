package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Azm, reason: case insensitive filesystem */
/* loaded from: Azm.class */
public final class C2025Azm extends C1rj {
    public C2ko A00;
    public C2ko A01;
    public MigColorScheme A02;
    public C2D A03;
    public Boolean A04;
    public Long A05;
    public boolean A06;

    public C2025Azm() {
        super("StatusTimestampEditor");
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A04, this.A05, Boolean.valueOf(this.A06), 1BK.A0d(), this.A03};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        CharSequence charSequence;
        C26z c26z;
        2RH r308;
        Context context;
        String string;
        QNy A0P = 4YU.A0P(r302);
        MigColorScheme migColorScheme = this.A02;
        C2D c2d = this.A03;
        boolean z = this.A06;
        Long l = A0P.A01;
        Boolean bool = A0P.A00;
        1BL.A1F(migColorScheme, c2d);
        C90 c90 = (C90) 1Bn.A0A(83582);
        1Bn.A0A(67680);
        if (bool == null || l == null) {
            charSequence = "";
        } else {
            long longValue = l.longValue();
            boolean booleanValue = bool.booleanValue();
            long hours = TimeUnit.MILLISECONDS.toHours(longValue);
            if (booleanValue) {
                context = r302.A0D;
                string = c90.A02(7zM.A0B(context), 2131955350, 2131955352, 2131955348, longValue);
            } else {
                context = r302.A0D;
                Resources resources = context.getResources();
                string = hours == 1 ? resources.getString(2131955355) : 4YU.A0u(resources, Long.valueOf(hours), 2131955354);
                11T.A0D(string);
            }
            Resources resources2 = context.getResources();
            0Dc r0 = new 0Dc(resources2);
            r0.A02(string);
            if (z) {
                String A0t = 4YU.A0t(resources2, 2131955353);
                r0.A05(CFx.A00(7zM.A0B(context), CZF.A00(c2d, 96), migColorScheme, A0t, "Link"), "[[edit]]", A0t, 33);
            }
            charSequence = 7zM.A0E(r0);
        }
        CharSequence charSequence2 = charSequence;
        C1rq A01 = C1rg.A01(r302, null, 0);
        if (charSequence2.length() > 0) {
            2KD A012 = 2K3.A01(r302, 0);
            A012.A2X();
            7zQ.A1S(A012, charSequence2);
            A012.A2x(migColorScheme);
            A012.A0e();
            7zN.A1D(A012, r302, C2025Azm.class, "StatusTimestampEditor", -2019881222);
            A01.A2e(A012);
            4YU.A1L(A01, 2RH.A03);
            r308 = 2RH.A04;
            7zO.A1G(A01, r308);
            c26z = C26z.BOTTOM;
        } else {
            c26z = C26z.BOTTOM;
            r308 = 2RH.A07;
        }
        4YU.A1O(A01, r308, c26z);
        return A01.A00;
    }

    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return (2Yv) new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -2019881222) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        C2D c2d = ((C2025Azm) r302.A00.A01).A03;
        11T.A0F(c2d, 1);
        c2d.A00();
        return null;
    }

    @Override // X.C1rj
    public Object A16(C2ko c2ko, Object obj, Object[] objArr) {
        int i = c2ko.A02;
        if (i == -1376005335) {
            1Iw r0 = c2ko.A00;
            11T.A0F(r0, 0);
            if (r0.A02 == null) {
                return null;
            }
            r0.A0G(new C2l4(new Object[]{null, null}, 0), "updateState:StatusTimestampEditor.updateSelectedTimestamp");
            return null;
        }
        if (i != -442606815) {
            return null;
        }
        Bnn bnn = (Bnn) obj;
        1Iw r02 = c2ko.A00;
        long j = bnn.A00;
        boolean z = bnn.A01;
        Long l = 4YU.A0P(r02).A01;
        Boolean bool = 4YU.A0P(r02).A00;
        if (l != null && j == l.longValue() && 11T.A0O(Boolean.valueOf(z), bool)) {
            return null;
        }
        Long valueOf = Long.valueOf(j);
        Boolean valueOf2 = Boolean.valueOf(z);
        if (r02.A02 == null) {
            return null;
        }
        r02.A0G(new C2l4(new Object[]{valueOf, valueOf2}, 0), "updateState:StatusTimestampEditor.updateSelectedTimestamp");
        return null;
    }

    @Override // X.C1rj
    public void A1G(1Iw r302, 1sE r303) {
        7zQ.A1H(r302, this.A00, this, r303);
        7zQ.A1H(r302, this.A01, this, r303);
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        QNy qNy = (QNy) r303;
        Long l = this.A05;
        Boolean bool = this.A04;
        qNy.A01 = l;
        qNy.A00 = bool;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
