package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.Gnl, reason: case insensitive filesystem */
/* loaded from: Gnl.class */
public final class C2768Gnl extends IFM {
    public C2137Deq A00;
    public boolean A01;
    public 1BY A02;
    public boolean A03;
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;
    public final C00i A07;
    public final C00i A08;
    public final C00i A09;
    public final IWN A0A;
    public final C00i A0B;
    public final HSs A0C;
    public final C15h A0D;

    public C2768Gnl(ViewGroup viewGroup, AbR abR, 1BO r304, Hrw hrw, HSs hSs, IWN iwn, C6x1 c6x1) {
        super(viewGroup, abR, hrw, c6x1);
        this.A08 = 1BQ.A02(68759);
        this.A09 = 1BV.A01((1BY) null, 85041);
        this.A06 = 1BV.A01((1BY) null, 115967);
        this.A07 = 1BV.A01((1BY) null, 82143);
        this.A0B = 1BV.A01((1BY) null, 16979);
        this.A05 = AbH.A0Q();
        this.A04 = 1BQ.A02(66227);
        this.A02 = 7zL.A0Q(r304);
        this.A0D = new J5t(1Bn.A0E((Context) null, (1BY) null, 83719), this, 2);
        hSs.getClass();
        this.A0C = hSs;
        this.A0A = iwn;
        this.A03 = true;
    }

    public static void A00(C2768Gnl c2768Gnl) {
        if (c2768Gnl.A03) {
            ((HnV) c2768Gnl.A0D.get()).A00(c2768Gnl.A0A.AyK());
            IQ1 iq1 = c2768Gnl.A0C.A00.A0G.A00;
            CallerContext callerContext = IQ1.A1m;
            iq1.A1Q.Bi7(false);
            C00i c00i = c2768Gnl.A08;
            AbK.A1O(53I.A00((53I) c00i.get()).edit(), 4LQ.A08);
            53I r0 = (53I) c00i.get();
            1Ql edit = 53I.A00(r0).edit();
            1G2 r02 = 4LQ.A0P;
            7zO.A1T(edit, r02, 53I.A00(r0).ArU(r02, 0));
            A01(c2768Gnl, false);
        }
    }

    public static void A01(C2768Gnl c2768Gnl, boolean z) {
        View A09;
        if (c2768Gnl.A03 == z || (A09 = c2768Gnl.A09()) == null) {
            return;
        }
        TextView A06 = AbF.A06(A09, 2131361957);
        ImageView A0I = GOn.A0I(A09, 2131361956);
        if (A06 == null || A0I == null) {
            return;
        }
        C00i c00i = c2768Gnl.A0B;
        MigColorScheme A0p = AbF.A0p(c00i);
        A06.setTextColor(z ? A0p.BKg() : A0p.AqM());
        C1u2 A0M = GOn.A0M(c2768Gnl.A05);
        C1u3 c1u3 = C1u3.A6H;
        MigColorScheme A0p2 = AbF.A0p(c00i);
        GOo.A1E(A0I, c1u3, A0M, z ? A0p2.BKg() : A0p2.AqM());
        c2768Gnl.A03 = z;
    }

    public void A0F() {
        super.A0F();
        C2137Deq c2137Deq = this.A00;
        if (c2137Deq != null) {
            c2137Deq.A06();
            this.A00 = null;
        }
        if (A0D().A00 == HAE.A02) {
            this.A01 = false;
        }
    }

    public void A0H() {
        int i;
        super.A0H();
        View A09 = A09();
        if (A09 == null || A09.getVisibility() != 0 || this.A01) {
            return;
        }
        C2137Deq c2137Deq = this.A00;
        if (c2137Deq == null || !((FIU) c2137Deq).A0Z) {
            C00i c00i = this.A09;
            C00i c00i2 = ((HzT) c00i.get()).A04.A00;
            FbSharedPreferences A00 = 53I.A00((53I) c00i2.get());
            1G2 r0 = 4LQ.A0R;
            if (A00.ArU(r0, 0) >= 3 || 53I.A00((53I) c00i2.get()).AZn(4LQ.A08, false) || 53I.A00((53I) c00i2.get()).ArU(4LQ.A0W, 0) < 2) {
                return;
            }
            View A092 = A09();
            Integer AyK = ((IFM) this).A06.A02.AyK();
            Integer num = 0S2.A0C;
            HzT hzT = (HzT) c00i.get();
            Context context = A092.getContext();
            if (AyK == num) {
                11T.A0F(context, 0);
                i = 2131960891;
            } else {
                11T.A0F(context, 0);
                i = 2131960890;
            }
            C2137Deq A002 = HzT.A00(context, hzT, 1BK.A0u(context, i), -1);
            this.A00 = A002;
            A002.A0C(A092);
            53I r02 = (53I) this.A08.get();
            7zO.A1T(53I.A00(r02).edit(), r0, 53I.A00(r02).ArU(r0, 0));
            this.A01 = true;
        }
    }
}
