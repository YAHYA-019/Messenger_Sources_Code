package X;

import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.traffic.knob.InbandTelemetryBweEstimate;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8qo, reason: invalid class name */
/* loaded from: 8qo.class */
public final class C8qo extends 2Yf {
    public static final C01i A03 = C01g.A01(ANQ.A00);
    public Aa6 A00;
    public 8Kh A01;
    public MigColorScheme A02;

    public C8qo() {
        super("FriendsTabRecommendedPublicChannelsSection");
    }

    public void A0X(2Yv r302, 2Yv r303) {
        ((C8ov) r303).A00 = ((C8ov) r302).A00;
    }

    public void A0Z(2Yy r302, C1qb c1qb, int i, int i2, int i3, long j, boolean z, boolean z2) {
        boolean z3 = ((C8ov) ((2Yf) this).A03).A00;
        8Kh r0 = this.A01;
        7zP.A1M(c1qb, 0, r0);
        if (z3) {
            return;
        }
        if (c1qb.A0J() != null) {
            4YV.A1F(c1qb, true, (-1) << (-1));
        }
        CQo A0a = 7zR.A0a();
        List A0Y = 0QD.A0Y(r0.A00, 1BL.A07(A03));
        11T.A0F(A0Y, 0);
        CQo.A0F(BOn.A0H, A0a, (Long) null, (String) null, (List) null, 04R.A05(7zQ.A1b("channels", 4YV.A0t(InbandTelemetryBweEstimate.COMPACT_DEBUG_STR_DELIMITER_LEVEL_1, A0Y, AT3.A00))), 176, 2, 20, 3);
    }

    public void A0a(C1qb c1qb) {
        ((C8ov) ((2Yf) this).A03).A00 = false;
    }

    public 2Ys A0d(C1qb c1qb) {
        QOR qor;
        MigColorScheme migColorScheme = this.A02;
        8Kh r0 = this.A01;
        Aa6 aa6 = this.A00;
        11T.A0F(c1qb, 0);
        1BL.A1H(migColorScheme, r0, aa6);
        9Oe r02 = (9Oe) 1Bi.A03(68471);
        2Yr A0l = 7zL.A0l();
        8TR A00 = C5z5.A00(c1qb);
        A00.A2a(c1qb.A0D(2131966544));
        A00.A2Z(migColorScheme);
        List list = r0.A00;
        int size = list.size();
        C01i c01i = A03;
        if (size > 1BL.A07(c01i)) {
            A00.A2X(2131966542);
            C5z5 c5z5 = A00.A01;
            c5z5.A08 = true;
            c5z5.A01 = C9pw.A00(aa6, r0, 31);
        }
        C5z5 A2W = A00.A2W();
        2hP A0I = 2hO.A0I(c1qb);
        A0I.A05(A2W);
        A0l.A01(A0I.A02());
        C00i c00i = r02.A00.A00;
        if (1BK.A0M(c00i).AZk(36323955761761634L)) {
            int A002 = 2yD.A00(1BK.A0M(c00i), 36605430738525339L);
            2hP A0I2 = 2hO.A0I(c1qb);
            DuU A01 = Dzb.A01(c1qb);
            C1rq A003 = C1rg.A00(c1qb);
            4YU.A1L(A003, 2RH.A03);
            3Dx r03 = 3Dx.A01;
            float A02 = 7zL.A02();
            C1ti c1ti = ((C1rj) A003.A00).A00;
            if (c1ti != null) {
                c1ti.A0T(r03, 7zL.A04(A003, A02));
            }
            Iterator it = 0QD.A0Y(list, A002).iterator();
            while (it.hasNext()) {
                A003.A2f(new 8Xe(aa6, (8Jz) it.next(), migColorScheme));
            }
            A01.A2X(A003);
            A01.A01.A04 = false;
            A0I2.A05(A01.A2W());
            qor = A0I2.A02();
        } else {
            qor = new QOR();
            qor.A01 = migColorScheme;
            qor.A02 = 0QD.A0Y(list, 1BL.A07(c01i));
            qor.A00 = aa6;
        }
        return 7zO.A0Y(A0l, qor);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    public /* bridge */ /* synthetic */ 2Yv A0f() {
        return new Object();
    }

    public boolean A0i(2Yf r302, boolean z) {
        if (this != r302) {
            if (r302 == null || getClass() != r302.getClass()) {
                return false;
            }
            C8qo c8qo = (C8qo) r302;
            MigColorScheme migColorScheme = this.A02;
            MigColorScheme migColorScheme2 = c8qo.A02;
            if (migColorScheme != null) {
                if (!migColorScheme.equals(migColorScheme2)) {
                    return false;
                }
            } else if (migColorScheme2 != null) {
                return false;
            }
            Aa6 aa6 = this.A00;
            Aa6 aa62 = c8qo.A00;
            if (aa6 != null) {
                if (!aa6.equals(aa62)) {
                    return false;
                }
            } else if (aa62 != null) {
                return false;
            }
            8Kh r0 = this.A01;
            8Kh r02 = c8qo.A01;
            if (r0 != null) {
                if (!r0.equals(r02)) {
                    return false;
                }
            } else if (r02 != null) {
                return false;
            }
        }
        return true;
    }
}
