package X;

import android.os.Handler;
import android.view.TextureView;
import android.view.View;
import java.util.List;

/* loaded from: Id3.class */
public final class Id3 implements JLp {
    public final int A00;
    public final Object A01;

    public Id3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.JLp
    public void CDg(I5d i5d) {
        switch (this.A00) {
            case 1:
                C2420Gch c2420Gch = (C2420Gch) this.A01;
                boolean z = c2420Gch.A0k;
                c2420Gch.A0k = true;
                if (!c2420Gch.A0V && c2420Gch.A0U && z) {
                    GuJ guJ = JQ3.A00;
                    JOW jow = ((Ic7) c2420Gch).A00;
                    jow.getClass();
                    jow.AdC(guJ);
                    return;
                }
                return;
            case 2:
            case 5:
            case 6:
            default:
                return;
            case 3:
                if (i5d.A00() != null) {
                    List list = ((C2422Gcj) this.A01).A03.A00;
                    if (0 < GOo.A08(list)) {
                        list.get(0);
                        throw AnonymousClass001.A0Q("onSurfaceCreated");
                    }
                    return;
                }
                return;
            case 4:
                C2430Gcr c2430Gcr = (C2430Gcr) this.A01;
                c2430Gcr.A03 = i5d;
                if (!c2430Gcr.A07) {
                    c2430Gcr.A00 = 0;
                }
                i5d.A09 = 1;
                i5d.A08 = 1;
                c2430Gcr.A6y(i5d);
                c2430Gcr.A09.post(new Iol(this));
                return;
            case 7:
                Gtr.A04((Gtr) this.A01, i5d);
                return;
            case 8:
                Gtq.A04((Gtq) this.A01, i5d);
                return;
        }
    }

    @Override // X.JLp
    public void CDh(I5d i5d) {
        switch (this.A00) {
            case 1:
                ((C2420Gch) this.A01).A0k = false;
                return;
            case 2:
            case 5:
            case 6:
            default:
                return;
            case 3:
                if (i5d.A00() != null) {
                    List list = ((C2422Gcj) this.A01).A03.A00;
                    if (0 < GOo.A08(list)) {
                        list.get(0);
                        throw AnonymousClass001.A0Q("onSurfaceDestroyed");
                    }
                    return;
                }
                return;
            case 4:
                C2430Gcr c2430Gcr = (C2430Gcr) this.A01;
                c2430Gcr.A03 = null;
                c2430Gcr.Ceu(i5d);
                return;
            case 7:
                Gtr.A04((Gtr) this.A01, null);
                return;
            case 8:
                Gtq.A04((Gtq) this.A01, null);
                return;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0008. Please report as an issue. */
    @Override // X.JLp
    public void CDi(I5d i5d, int i, int i2) {
        Handler handler;
        Runnable izo;
        switch (this.A00) {
            case 0:
                return;
            case 1:
                C2420Gch c2420Gch = (C2420Gch) this.A01;
                c2420Gch.A04 = i;
                c2420Gch.A02 = i2;
                C2420Gch.A04(c2420Gch, c2420Gch.A0Q);
                return;
            case 2:
                Gth gth = (Gth) this.A01;
                int A00 = Gth.A00(gth);
                if (gth.A01 != A00) {
                    gth.A01 = A00;
                    List list = gth.A04.A00;
                    int A08 = GOo.A08(list);
                    for (int i3 = 0; i3 < A08; i3++) {
                        ((JED) list.get(i3)).CAJ(gth.A01, gth.A00);
                    }
                    return;
                }
                return;
            case 3:
                11T.A0F(i5d, 0);
                if (i5d.A00() != null) {
                    List list2 = ((C2422Gcj) this.A01).A03.A00;
                    if (0 < GOo.A08(list2)) {
                        list2.get(0);
                        throw AnonymousClass001.A0Q("onSurfaceChanged");
                    }
                    return;
                }
                return;
            case 4:
                handler = ((C2430Gcr) this.A01).A09;
                izo = new Izo(this, i, i2);
                handler.post(izo);
                return;
            case 5:
                HkX hkX = (HkX) this.A01;
                hkX.A03 = i;
                hkX.A02 = i2;
                Ick ick = new Ick(false);
                ick.A06 = new Icx(hkX, 0);
                int i4 = hkX.A03;
                int i5 = hkX.A02;
                ick.A01 = i4;
                ick.A00 = i5;
                Ick.A00(ick);
                Ick.A01(ick);
                JPz jPz = hkX.A08;
                IHY.A00(jPz).Cpn(new Icg(new I1d(), null, ick, false, false), 0);
                Hp4 A02 = ick.A02(hkX.A03, hkX.A02, 0);
                11T.A0A(A02);
                hkX.A0C.D1H(new Id4(hkX, 1));
                jPz.D7Z(0, A02.A01, A02.A00, hkX.A03, hkX.A02, AnonymousClass001.A1Q(hkX.A00, 1));
                return;
            case 6:
                ((Gtl) this.A01).A03.Cmm(i, i2);
                return;
            case 7:
                Gtr gtr = (Gtr) this.A01;
                gtr.A05 = i;
                gtr.A04 = i2;
                handler = gtr.A0L;
                izo = new IsY(this);
                handler.post(izo);
                return;
            default:
                handler = ((Gtq) this.A01).A0I;
                izo = new Runnable() { // from class: X.Isf
                    public static final String __redex_internal_original_name = "RtcSurfacePipeComponent$1$$ExternalSyntheticLambda0";

                    @Override // java.lang.Runnable
                    public final void run() {
                        Gtq.A03((Gtq) Id3.this.A01);
                    }
                };
                handler.post(izo);
                return;
        }
    }

    @Override // X.JLp
    public void CDj(I5d i5d) {
        int i;
        if (4 - this.A00 == 0) {
            C2430Gcr c2430Gcr = (C2430Gcr) this.A01;
            if (c2430Gcr.A07 || (i = c2430Gcr.A00) >= 4 || !c2430Gcr.A08) {
                return;
            }
            c2430Gcr.A00 = i + 1;
        }
    }

    @Override // X.JLp
    public void CDl(View view) {
        switch (this.A00) {
            case 0:
                ((I4u) this.A01).A00();
                return;
            case 1:
                boolean z = view instanceof TextureView;
                C2420Gch c2420Gch = (C2420Gch) this.A01;
                if (z) {
                    c2420Gch.A07 = (TextureView) view;
                } else {
                    c2420Gch.A07 = null;
                }
                c2420Gch.A06 = null;
                return;
            case 6:
                if (view != null) {
                    ((Gtl) this.A01).A03.CwS(view);
                    return;
                }
                return;
            default:
                return;
        }
    }
}
