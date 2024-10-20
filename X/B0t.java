package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableString;
import android.text.style.ClickableSpan;
import com.facebook.litho.LithoView;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* loaded from: B0t.class */
public final class B0t extends C1rj {
    public static final AcJ A0B = (AcJ) 1Bi.A03(83523);
    public int A00;
    public ClickableSpan A01;
    public Btt A02;
    public 5xF A03;
    public AcP A04;
    public CQ4 A05;
    public BhH A06;
    public DEO A07;
    public MigColorScheme A08;
    public String A09;
    public boolean A0A;

    public B0t() {
        super("SearchErrorStateComponent");
    }

    public static final 2K3 A00(SpannableString spannableString, 1Iw r302, MigColorScheme migColorScheme) {
        2KD A0e = 7zR.A0e(r302, migColorScheme, false);
        7zQ.A1T(A0e, spannableString);
        4YU.A1N(A0e, 2RH.A07);
        A0e.A2X();
        A0e.A2H(2dP.A03);
        return A0e.A2W();
    }

    public final Object[] A0k() {
        return new Object[]{this.A08, this.A05, this.A02, this.A01, this.A07, this.A03, this.A09, this.A06, Boolean.valueOf(this.A0A), Integer.valueOf(this.A00), this.A04};
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03d8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x03eb  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03fc  */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 1224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0t.A0y(X.1Iw):X.1LI");
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        AlE alE;
        boolean z;
        switch (r302.A01) {
            case -1570095918:
                1Iw r0 = r302.A00.A00;
                String str = (String) r302.A03[0];
                1BK.A1M(r0, str);
                C68t A0R = 7zU.A0R();
                Context context = r0.A0D;
                Uri uri = null;
                try {
                    uri = C0A2.A03(str);
                } catch (SecurityException unused) {
                }
                A0R.A0G(context, uri, C5id.A0C);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -227396577:
                CsC csC = ((B0t) r302.A00.A01).A07;
                if (csC == null) {
                    return null;
                }
                CsC csC2 = csC;
                switch (csC2.A00) {
                    case 0:
                        C1565Alk c1565Alk = (C1565Alk) csC2.A01;
                        Rl0 rl0 = c1565Alk.A03;
                        String str2 = "viewModelController";
                        if (rl0 != null) {
                            String str3 = rl0.A02;
                            if (str3 == null) {
                                throw 1BK.A0h();
                            }
                            String str4 = c1565Alk.A0D;
                            if (str4 != null) {
                                rl0.A00(str3, str4);
                                return null;
                            }
                            str2 = "sessionId";
                        }
                        11T.A0L(str2);
                        throw 0Q8.createAndThrow();
                    case 1:
                        B7E b7e = (B7E) csC2.A01;
                        b7e.A06.A08(B7E.A06(b7e));
                        B7E.A0C(b7e, b7e.A0B, true);
                        return null;
                    case 2:
                        B7D b7d = (B7D) csC2.A01;
                        B7D.A0P(b7d, B7D.A09(b7d));
                        b7d.A1Z().A02(ImmutableList.copyOf((Collection) b7d.A13), B7D.A09(b7d));
                        return null;
                    case 3:
                        C1557Alb c1557Alb = ((ChF) csC2.A01).A02;
                        NavigationTrigger navigationTrigger = C1557Alb.A1B;
                        CN9 cn9 = (CN9) c1557Alb.A07.get();
                        c1557Alb.A0G.A02();
                        C00i c00i = cn9.A03;
                        if (CP3.A01(c00i) && AbF.A0m(c00i).A08()) {
                            c00i.get();
                        }
                        C1557Alb.A0G(c1557Alb);
                        return null;
                    case 4:
                        alE = (AlE) csC2.A01;
                        Bgy bgy = alE.A0A;
                        if (bgy != null) {
                            AcQ acQ = bgy.A00.A00;
                            AcQ.A0P(acQ, acQ.A0f, true, false, false);
                            acQ.A0m = true;
                            AcQ.A0L(acQ);
                        }
                        z = false;
                        break;
                    default:
                        C1590Am9 c1590Am9 = (C1590Am9) csC2.A01;
                        LithoView lithoView = c1590Am9.A00;
                        if (lithoView != null) {
                            lithoView.A0z(null);
                        }
                        C1590Am9.A03(c1590Am9);
                        return null;
                }
            case 894681314:
                BhH bhH = ((B0t) r302.A00.A01).A06;
                if (bhH == null) {
                    return null;
                }
                alE = bhH.A00;
                z = true;
                break;
            default:
                return null;
        }
        AlE.A03((ByH) null, alE, (ImmutableList) null, Boolean.valueOf(z));
        return null;
    }
}
