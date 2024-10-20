package X;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: B01.class */
public final class B01 extends C1rj {
    public static final MigColorScheme A06 = LightColorScheme.A00();
    public Drawable A00;
    public MigColorScheme A01;
    public ImmutableList A02;
    public CharSequence A03;
    public CharSequence A04;
    public List A05;

    public B01() {
        super("Interstitial");
        this.A01 = A06;
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A01, this.A00, this.A03, this.A04, this.A05};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        C59g c59g;
        59L A00;
        CharSequence charSequence = this.A04;
        CharSequence charSequence2 = this.A03;
        ImmutableList immutableList = this.A02;
        List list = this.A05;
        MigColorScheme migColorScheme = this.A01;
        Drawable drawable = this.A00;
        boolean A1X = 1BL.A1X(r302, charSequence);
        1BK.A1J(charSequence2, 2, immutableList);
        11T.A0F(migColorScheme, 5);
        2cM A0i = 7zM.A0i(r302);
        C1ro c1ro = C1ro.STRETCH;
        A0i.A2g(c1ro);
        C26z c26z = C26z.TOP;
        2RH r0 = 2RH.A05;
        4YU.A1O(A0i, r0, c26z);
        if (drawable != null) {
            C2cq A002 = C2cp.A00(r302, 0);
            A002.A2a(drawable);
            A002.A0z(56.0f);
            A002.A0l(56.0f);
            7zU.A1D(A002, 2RH.A06);
            7zO.A1M(A002, 2RH.A04, c26z);
            A002.A0N();
            A0i.A2d(A002);
        }
        if (list != null) {
            2rS A003 = 2rR.A00(r302);
            A003.A2c(new 2rQ((List) null, list));
            A003.A2d(A1X);
            A003.A2b(migColorScheme);
            A003.A2Z(56.0f);
            A003.A2X(3.0f);
            7zU.A1D(A003, 2RH.A06);
            7zO.A1M(A003, 2RH.A04, c26z);
            A0i.A2d(A003);
        }
        55N A004 = 55M.A00(r302);
        final 7sZ r02 = new 7sZ();
        r02.A07 = charSequence.toString();
        r02.A01 = 2;
        r02.A00 = 10;
        r02.A05 = charSequence2.toString();
        r02.A04 = migColorScheme;
        A004.A2X(new AnonymousClass544(r02) { // from class: X.55a
            public final int A00;
            public final int A01;
            public final long A02;
            public final View.OnClickListener A03;
            public final MigColorScheme A04;
            public final CharSequence A05;
            public final String A06;
            public final String A07;
            public final boolean A08;

            {
                this.A02 = r02.A02;
                String str = r02.A07;
                str.getClass();
                this.A07 = str;
                this.A01 = r02.A01;
                this.A08 = r02.A08;
                this.A05 = r02.A05;
                this.A00 = r02.A00;
                this.A06 = r02.A06;
                this.A03 = r02.A03;
                this.A04 = r02.A04;
            }

            @Override // X.AnonymousClass544
            public boolean BVd(AnonymousClass544 anonymousClass544) {
                boolean z = false;
                if (anonymousClass544.getClass() == C55a.class) {
                    C55a c55a = (C55a) anonymousClass544;
                    if (this.A02 == c55a.A02 && 1JF.A0C(this.A07, c55a.A07) && TextUtils.equals(this.A05, c55a.A05) && 1JF.A0C(this.A06, c55a.A06) && this.A08 == c55a.A08 && this.A01 == c55a.A01 && this.A00 == c55a.A00) {
                        z = 4YV.A1Z(this.A04, c55a.A04);
                    }
                }
                return z;
            }

            @Override // X.AnonymousClass544
            public long getId() {
                return this.A02;
            }
        });
        A0i.A2d(A004);
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            C7m c7m = (C7m) it.next();
            2MQ r03 = c7m.A00;
            if (r03 == null) {
                c59g = null;
            } else {
                if (r03 == 2MQ.A1i) {
                    throw 1BK.A0g();
                }
                c59g = COF.A00(r03, 2Re.A02, Cx1.A01(c7m, 35), migColorScheme, c7m.A02);
            }
            55N A005 = 55M.A00(r302);
            CJ4 cj4 = new CJ4();
            if (c7m.A03) {
                String str = c7m.A02;
                11T.A0A(str);
                A00 = new 59L(str);
            } else {
                A00 = 5OL.A00(c7m.A02);
                if (A00 == null) {
                    throw 1BK.A0h();
                }
            }
            cj4.A02 = (55A) A00;
            cj4.A05 = c59g;
            CJ4.A00(cj4, c7m, ActionId.APP_DID_BECOME_ACTIVE);
            cj4.A07 = migColorScheme;
            A005.A2X(cj4.A01());
            A005.A1y(c1ro);
            A0i.A2e(A005.A2W());
        }
        C1rq A01 = C1rg.A01(r302, null, 0);
        A01.A2h(c1ro);
        A01.A1H(migColorScheme.Abp());
        7zO.A1F(A0i, r0);
        return 7zL.A0d(A0i.A00, A01);
    }
}
