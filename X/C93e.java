package X;

import android.content.res.Resources;
import com.facebook.mig.scheme.interfaces.MigColorScheme;

/* renamed from: X.93e, reason: invalid class name */
/* loaded from: 93e.class */
public final class C93e extends AbstractC07494k1 implements InterfaceC07554k7 {
    public static final AnonymousClass207 A05 = new AnonymousClass207(6Ku.class, "ThreadViewNuxBannerDataSource");
    public final 1Br A00;
    public final 1G9 A01;
    public final 9ND A02;
    public final 7SN A03;
    public final 7SO A04;

    public C93e(9ND r302, 1G9 r303) {
        11T.A0F(r302, 2);
        this.A01 = r303;
        this.A02 = r302;
        this.A00 = 1BK.A0E();
        this.A03 = new A4N(this);
        this.A04 = new A4Q(this);
    }

    @Override // X.InterfaceC07554k7
    public AnonymousClass207 Asi() {
        return A05;
    }

    @Override // X.InterfaceC07544k6
    public void Cgt(int i) {
        C6rt c6rt;
        if (i == 1 || i == 2) {
            return;
        }
        if (1Br.A09(this.A00).ArU(this.A01, 0) < 3) {
            9ND r0 = this.A02;
            7SN r02 = this.A03;
            7SO r03 = this.A04;
            boolean A1X = 1BL.A1X(r02, r03);
            MigColorScheme migColorScheme = (MigColorScheme) 1De.A00(r0.A00, 16979);
            7EG r04 = new 7EG();
            r04.A07 = r02;
            C00i c00i = r0.A01.A00;
            r04.A0M = ((Resources) c00i.get()).getString(2131960162);
            r04.A08 = r03;
            r04.A01(((Resources) c00i.get()).getString(2131960163));
            r04.A0W = A1X;
            c6rt = new C6rt(migColorScheme, new AnonymousClass690(r04));
        } else {
            c6rt = null;
        }
        A05(c6rt);
    }
}
