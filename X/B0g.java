package X;

import android.graphics.drawable.Drawable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;

/* loaded from: B0g.class */
public final class B0g extends C1rj {
    public static final MigColorScheme A0F = LightColorScheme.A00();
    public int A00;
    public int A01;
    public Drawable A02;
    public Bdt A03;
    public ThreadKey A04;
    public DIX A05;
    public MigColorScheme A06;
    public 2KE A07;
    public ThreadThemeInfo A08;
    public CharSequence A09;
    public CharSequence A0A;
    public Integer A0B;
    public String A0C;
    public boolean A0D;
    public boolean A0E;

    public B0g() {
        super("MessengerUnifiedSearchBar");
        this.A06 = A0F;
        this.A01 = 3;
    }

    public final Object[] A0k() {
        return new Object[]{this.A02, this.A06, this.A09, Integer.valueOf(this.A00), Integer.valueOf(this.A01), this.A0A, this.A05, this.A0B, Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0E), this.A0C, this.A07, this.A04, this.A08, this.A03};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x00ec, code lost:
    
        if (r325 != 0) goto L9;
     */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B0g.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v61, types: [X.Bjt, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1974694341:
                C5r6 c5r6 = (C5r6) obj;
                1Is r0 = r302.A00.A01;
                ((B0g) r0).A05.BzF(c5r6.A00, c5r6.A01);
                return null;
            case -1786875001:
                1Iv r02 = r302.A00;
                1Is r03 = r02.A01;
                1Iw r04 = r02.A00;
                DIX dix = ((B0g) r03).A05;
                if (r04.A02 != null) {
                    r04.A0H(7zS.A0N(true), "updateState:MessengerUnifiedSearchBar.updateIsQueryNullOrEmpty");
                }
                C2ko A0E = 1LI.A0E(r04, "search_bar", 270236861);
                if (A0E != null) {
                    ?? obj2 = new Object();
                    obj2.A00 = "";
                    obj2.A01 = true;
                    7zO.A1P(A0E, (Object) obj2);
                }
                dix.CJd("");
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case 96515278:
                1Is r05 = r302.A00.A01;
                ((B0g) r05).A05.CF5(((El7) obj).A02);
                return null;
            case 609316320:
                1Iv r06 = r302.A00;
                1Is r07 = r06.A01;
                1Iw r08 = r06.A00;
                String str = ((EdN) obj).A00;
                DIX dix2 = ((B0g) r07).A05;
                boolean A0A = 1JF.A0A(str);
                if (r08.A02 != null) {
                    r08.A0H(7zS.A0N(Boolean.valueOf(A0A)), "updateState:MessengerUnifiedSearchBar.updateIsQueryNullOrEmpty");
                }
                dix2.CJd(str);
                return null;
            case 1803022739:
                Bdt bdt = ((B0g) r302.A00.A01).A03;
                if (bdt == null) {
                    return null;
                }
                bdt.A00.A05.postDelayed(new D5i(bdt), 300L);
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        ((B1b) r303).A00 = Boolean.valueOf(1JF.A0A(this.A0A)).booleanValue();
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
