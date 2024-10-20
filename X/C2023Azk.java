package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.facebook.messaging.accountlogin.fragment.segue.AccountLoginSegueCredentials;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.Azk, reason: case insensitive filesystem */
/* loaded from: Azk.class */
public final class C2023Azk extends C1rj {
    public C7xz A00;
    public C6Y A01;
    public B2q A02;
    public BoQ A03;
    public CHq A04;
    public MigColorScheme A05;
    public String A06;
    public String A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;

    public C2023Azk() {
        super("AccountLoginRootComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A05, Boolean.valueOf(this.A08), Boolean.valueOf(this.A09), this.A06, this.A02, this.A07, this.A01, Boolean.valueOf(this.A0A), this.A04, this.A00, Boolean.valueOf(this.A0B), 1BK.A0d(), this.A03};
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    public boolean A0o() {
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x0da9, code lost:
    
        if (r0 == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x04c0, code lost:
    
        if (r0 != false) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0ab6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0bfc  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0c0c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0d30  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0e05  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0e7f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0eeb  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0f47  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0a47  */
    /* JADX WARN: Type inference failed for: r0v24, types: [X.B2q, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r354v4 */
    /* JADX WARN: Type inference failed for: r354v5 */
    /* JADX WARN: Type inference failed for: r354v6, types: [android.text.SpannableString] */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0z(X.1Iw r302, int r303, int r304) {
        /*
            Method dump skipped, instructions count: 4296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2023Azk.A0z(X.1Iw, int, int):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v180, types: [X.AlJ, X.B2q, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v89, types: [X.AlJ, X.B2q, androidx.fragment.app.Fragment] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        boolean z;
        1Iw r308;
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -952092468:
                1Iv r0 = r302.A00;
                1Is r02 = r0.A01;
                r308 = r0.A00;
                C2023Azk c2023Azk = (C2023Azk) r02;
                BoQ boQ = c2023Azk.A03;
                C6Y c6y = c2023Azk.A01;
                boolean z2 = !boQ.A00;
                boQ.A00 = z2;
                if (c6y != null) {
                    ((AccountLoginSegueCredentials) ((AlJ) c6y.A00).A01).A0I = z2;
                    break;
                }
                break;
            case -855949748:
                C6Y c6y2 = ((C2023Azk) r302.A00.A01).A01;
                if (c6y2 == null) {
                    return null;
                }
                c6y2.A00();
                return null;
            case 96515278:
                1Is r03 = r302.A00.A01;
                int i = ((9QK) obj).A00;
                C2023Azk c2023Azk2 = (C2023Azk) r03;
                boolean z3 = c2023Azk2.A08;
                boolean z4 = c2023Azk2.A09;
                BoQ boQ2 = c2023Azk2.A03;
                C6Y c6y3 = c2023Azk2.A01;
                if (c6y3 == null || i != 6 || AbM.A1b(boQ2.A02.A00) || AbM.A1b(boQ2.A01.A00) || z4 || z3) {
                    z = false;
                } else {
                    c6y3.A00();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1196116736:
                1Iv r04 = r302.A00;
                1Is r05 = r04.A01;
                r308 = r04.A00;
                String str = ((Bbn) obj).A00;
                C6Y c6y4 = ((C2023Azk) r05).A01;
                if (c6y4 != null) {
                    String trim = str.trim();
                    B2q b2q = c6y4.A00;
                    ((AccountLoginSegueCredentials) ((AlJ) b2q).A01).A0C = trim;
                    1G2 r06 = B2q.A0x;
                    if (b2q.A0F) {
                        b2q.A0F = false;
                        b2q.A1d();
                    }
                    if (b2q.A0H) {
                        b2q.A0H = false;
                        AbH.A0h(b2q).A08(BMG.A07, b2q.A02);
                        break;
                    }
                }
                break;
            case 1415173789:
                C6Y c6y5 = ((C2023Azk) r302.A00.A01).A01;
                if (c6y5 == null) {
                    return null;
                }
                ?? r07 = c6y5.A00;
                1G2 r08 = B2q.A0x;
                C00i c00i = r07.A0h;
                AbN.A17(c00i, 1BK.A0U(c00i), 725105460);
                C00i c00i2 = r07.A0S;
                AbF.A0V(c00i2).A0E(BMG.A0T, (String) null);
                AbH.A0h((B2q) r07).A08(BMG.A05, r07.A02);
                r07.A1a();
                HashMap A0u = AnonymousClass001.A0u();
                A0u.put("user_id", TextUtils.isEmpty(((AccountLoginSegueCredentials) ((AlJ) r07).A01).A0G) ? "" : ((AccountLoginSegueCredentials) ((AlJ) r07).A01).A0G);
                AbF.A0V(c00i2).A0O(BMG.A27, A0u);
                if (r07.A1X() != BLS.A06) {
                    r07.A1b(BLp.A0L);
                    return null;
                }
                if (!r07.isAdded()) {
                    return null;
                }
                r07.requireActivity().setResult(-1, 4YU.A0A("com.facebook.messaging.accountswitch.SWITH_OPEN_AR"));
                AbG.A1K((Fragment) r07);
                return null;
            case 1782726174:
                C6Y c6y6 = ((C2023Azk) r302.A00.A01).A01;
                if (c6y6 == null) {
                    return null;
                }
                ?? r09 = c6y6.A00;
                1G2 r010 = B2q.A0x;
                C00i c00i3 = ((BaL) r09.A04.get()).A00.A00;
                2yD A0M = 1BK.A0M(c00i3);
                1GD r011 = 1GD.A05;
                if ((A0M.AZr(r011, 18302702484270050L) || 1BK.A0M(c00i3).AZr(r011, 18302702484270050L)) && r09.getContext() != null) {
                    Context context = r09.getContext();
                    EU9.A00(context);
                    FxJ fxJ = new FxJ((GKg) null, (1pI) null, (MigColorScheme) null, (FHf) null, (DLQ) null, (DLQ) null, (FZt) null, (Integer) null, (Integer) null, (String) null, 0, false);
                    HashMap A0u2 = AnonymousClass001.A0u();
                    HashMap A0u3 = AnonymousClass001.A0u();
                    HashMap A0u4 = AnonymousClass001.A0u();
                    new BitSet(0);
                    AbM.A19(context, fxJ, C3o5.A0L("com.bloks.www.bloks.caa.reg.playground", C4O5.A02(A0u2), A0u3), A0u4);
                    return null;
                }
                if (r09.getContext() != null) {
                    ((CIb) r09.A0Y.get()).A03(BOe.A0C, r09.A03, 0S2.A01, "msgr_login_page");
                }
                AbF.A0V(r09.A0S).A08(BMG.A2Y);
                C00i c00i4 = r09.A0R;
                AbG.A0f(c00i4).A08(BMG.A08, r09.A02);
                Integer num = 0S2.A00;
                ((C3T0) r09.A0c.get()).A02(num);
                r09.A1a();
                Context context2 = r09.getContext();
                if (context2 == null) {
                    return null;
                }
                ((2Vz) c00i4.get()).A05(context2, num, "", "", false, false);
                return null;
            case 1874929519:
                Bjy bjy = (Bjy) obj;
                1Iv r012 = r302.A00;
                1Is r013 = r012.A01;
                r308 = r012.A00;
                String str2 = bjy.A01;
                View view = bjy.A00;
                C2023Azk c2023Azk3 = (C2023Azk) r013;
                B1r b1r = (B1r) 4YU.A0P(r308);
                C6Y c6y7 = c2023Azk3.A01;
                C5I c5i = b1r.A03;
                PopupWindow popupWindow = b1r.A01;
                if (c6y7 != null) {
                    c6y7.A01(str2.trim());
                }
                if (popupWindow != null) {
                    if (str2 != null && str2.length() == 0) {
                        c5i.A00(view, popupWindow);
                        break;
                    } else {
                        popupWindow.dismiss();
                        break;
                    }
                }
                break;
            default:
                return null;
        }
        if (r308.A02 == null) {
            return null;
        }
        r308.A0H(7zR.A0N(), "updateState:AccountLoginRootComponent.increaseUiVersion");
        return null;
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        B1r b1r = (B1r) r303;
        PopupWindow popupWindow = null;
        C6Y c6y = this.A01;
        Object A0A = 1Bn.A0A(85282);
        Context context = r302.A0D;
        C5I c5i = (C5I) 1Bn.A0E(context, (1BY) null, 85242);
        if (c6y != null) {
            Bbj bbj = new Bbj(c6y);
            Context applicationContext = context.getApplicationContext();
            PopupWindow popupWindow2 = new PopupWindow(applicationContext);
            BoP boP = (BoP) c5i.A03.get();
            Bbl bbl = c5i.A05;
            Object A0E = 1Bn.A0E((Context) null, boP.A00, 99948);
            1Kd.A0D(boP.A02, new FwI(0, applicationContext, popupWindow2, boP, bbj, bbl, A0E), ((67R) boP.A01.get()).A03(true, true));
            popupWindow = popupWindow2;
        }
        b1r.A01 = popupWindow;
        b1r.A02 = (CDo) A0A;
        b1r.A03 = c5i;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
