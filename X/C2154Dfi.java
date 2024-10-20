package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.Dfi, reason: case insensitive filesystem */
/* loaded from: Dfi.class */
public final class C2154Dfi extends AbstractC2178Dg6 {
    public RKs A00;
    public C2180Dg8 A01;
    public boolean A02;

    public C2154Dfi(1Iw r302) {
        super(r302);
        this.A01 = new C2180Dg8();
        this.A02 = false;
    }

    public static C2152Dfg A00(C2180Dg8 c2180Dg8, 1Iw r302) {
        CharSequence charSequence = ((EnN) c2180Dg8).A02;
        if (charSequence == null) {
            return null;
        }
        C2152Dfg c2152Dfg = new C2152Dfg(r302);
        c2152Dfg.A05 = charSequence;
        c2152Dfg.A03 = EP4.A0I;
        c2152Dfg.A0e(true);
        FAa A00 = FAa.A00();
        A00.A04();
        A00.A01 = 1;
        A00.A03();
        AbstractC2178Dg6.A0G(c2152Dfg, A00);
        return c2152Dfg;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [X.23P, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v36, types: [X.23P, java.lang.Object] */
    @Override // X.AbstractC2178Dg6
    public C1rs A0N(EzJ ezJ) {
        C1rs c1rs;
        C2180Dg8 c2180Dg8 = this.A01;
        c2180Dg8.getClass();
        1Iw r0 = this.A04;
        Context context = r0.A0D;
        C1rs A01 = 2cK.A01(r0, (String) null, 0);
        C26z c26z = C26z.START;
        RKs rKs = this.A00;
        if (rKs != null) {
            GKV gkv = rKs.A00;
            gkv.BcJ(c26z, rKs.A02.intValue());
            c1rs = gkv.ACp(ezJ);
        } else {
            c1rs = null;
        }
        A01.A2d(c1rs);
        A01.A2g(C1ro.FLEX_START);
        C1rs A012 = 2cK.A01(r0, (String) null, 0);
        C1rs c1rs2 = null;
        A012.A2g(C1ro.FLEX_END);
        RKs rKs2 = this.A00;
        2cL r02 = ((2cM) A01).A00;
        ?? obj = new Object();
        if (rKs2 != null) {
            if (rKs2.A01 == null) {
                r02.A0d(r0, (C23P) obj, View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            } else {
                obj.A01 = EVV.A00(context, r0.intValue());
            }
        }
        int max = Math.max(obj.A01, new Object().A01);
        C1rq A013 = C1rg.A01(r0, null, 0);
        A013.A0r(52.0f);
        A013.A2c();
        A013.A2b();
        C26z c26z2 = C26z.HORIZONTAL;
        EPJ epj = EPJ.A0o;
        A013.A25(c26z2, F0a.A01(epj, r0));
        A01.A0j(1.0f);
        A01.A0S();
        11T.A0F(context, 0);
        float f = max;
        A01.A0h(Math.round(f / 7zO.A0I(context).density));
        A013.A2e(A01);
        2cM A014 = 2cK.A01(r0, (String) null, 0);
        A014.A2d(A00(c2180Dg8, r0) == null ? null : A00(c2180Dg8, r0).ACp(ezJ));
        A014.A1B(16.0f);
        float f2 = 8.0f;
        if (this.A00 == null) {
            f2 = 0.0f;
        }
        A014.A25(c26z2, f2);
        A014.A0j(1.0f);
        A014.A0k(1.0f);
        A013.A2e(A014);
        A012.A0j(1.0f);
        A012.A0S();
        A012.A0h(Math.round(f / 7zO.A0I(context).density));
        A013.A2e(A012);
        A013.A0S();
        2cM A015 = 2cK.A01(r0, "FDSInternalBottomSheetHeader", 0);
        A015.A0S();
        A015.A2d(A013);
        if (!this.A02) {
            AbstractC2178Dg6 abstractC2178Dg6 = new AbstractC2178Dg6(r0);
            abstractC2178Dg6.A0X(c26z2, F0a.A01(epj, r0));
            c1rs2 = abstractC2178Dg6.ACp(ezJ);
        }
        A015.A2d(c1rs2);
        return A015;
    }

    public /* bridge */ /* synthetic */ void A0f(int i) {
        String A0D = this.A05.A0D(i);
        if (A0D == null) {
            ((ESq) this).A00 = true;
            return;
        }
        C2180Dg8 c2180Dg8 = this.A01;
        ((EnN) c2180Dg8).A02 = A0D;
        ((EnN) c2180Dg8).A03 = true;
    }
}
