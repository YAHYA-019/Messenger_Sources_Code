package X;

import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import java.util.BitSet;

/* loaded from: Dz7.class */
public final class Dz7 extends C1rj {
    public static final C06974ih A03 = 7zO.A0Q(InterfaceC07034in.A04, C06984ii.A00());
    public RS7 A00;
    public String A01;
    public String A02;

    public Dz7() {
        super("HomeFullBodyPreviewFragmentComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A01, this.A02, this.A00};
    }

    public boolean A0o() {
        return true;
    }

    @Override // X.C1rj
    public 1LI A0z(1Iw r302, int i, int i2) {
        E05 e05 = (E05) 4YU.A0P(r302);
        String str = this.A02;
        String str2 = this.A01;
        GET get = e05.A01;
        GET get2 = e05.A00;
        ContextChain contextChain = (ContextChain) r302.A09(ContextChain.class);
        1BL.A1G(get, get2);
        CallerContext A04 = CallerContext.A04(new ContextChain(contextChain, K92.__redex_internal_original_name, "avatars_home_full_body_preview"));
        float size = View.MeasureSpec.getSize(i);
        float size2 = View.MeasureSpec.getSize(i2);
        float f = size / size2;
        2cM A01 = 2cK.A01(r302, (String) null, 0);
        Dru dru = new Dru(new DxY(), r302);
        DxY dxY = dru.A00;
        dxY.A02 = str2;
        BitSet bitSet = dru.A02;
        bitSet.set(0);
        dxY.A00 = f;
        bitSet.set(1);
        11T.A0D(A04);
        5BH A012 = 5BG.A01(r302);
        A012.A0R();
        A012.A19(40.0f);
        A012.A2b(A04);
        if (str == null) {
            throw 1BK.A0h();
        }
        7zM.A1J(A012, str);
        A012.A2Z(A03);
        A012.A00.A0u().put(3, new C1rn(Float.valueOf((f > 0.6f ? size2 / 1250.0f : size / 750.0f) * 1250.0f * (-0.099999964f))));
        A012.A0v(1.1f);
        dxY.A01 = A012.A2V();
        bitSet.set(2);
        A01.A2d(dru);
        C1rq A013 = C1rg.A01(r302, null, 0);
        2cM A014 = 2cK.A01(r302, (String) null, 0);
        QF5 A00 = QMp.A00(r302);
        A00.A2W(0);
        1Im A09 = 1LI.A09(r302, Dz7.class, "HomeFullBodyPreviewFragmentComponent", 316148272);
        QMp qMp = A00.A00;
        qMp.A03 = A09;
        qMp.A00 = 2131956746;
        A014.A2d(A00);
        A013.A2e(A014);
        A01.A2d(A013);
        2cM A015 = 2cK.A01(r302, (String) null, 0);
        A015.A0c();
        C26z c26z = C26z.BOTTOM;
        A015.A2E(c26z, 0);
        A015.A0e();
        CallerContext A0B = CallerContext.A0B("HomeFullBodyPreviewFragmentComponentSpec");
        boolean AZk = DKE.A0c().AZk(72340172821302526L);
        2cM A016 = 2cK.A01(r302, (String) null, 0);
        if (AZk) {
            AbstractC2162Dfq abstractC2162Dfq = new AbstractC2162Dfq(r302);
            abstractC2162Dfq.A0X(C26z.HORIZONTAL, 16.0f);
            abstractC2162Dfq.A0X(c26z, 16.0f);
            abstractC2162Dfq.A03 = ENu.A05;
            abstractC2162Dfq.A0f(2131956755);
            abstractC2162Dfq.A06 = 7zO.A0U(new GBp(r302, get, 2));
            AbstractC2178Dg6.A07(A0B, abstractC2162Dfq, A016);
        } else {
            DuI duI = new DuI(new DxX(), r302);
            duI.A0W();
            duI.A24(c26z, 16.0f);
            duI.A2W(2131956755);
            duI.A00.A00 = get;
            A016.A2d(duI);
            DuI duI2 = new DuI(new DxX(), r302);
            duI2.A0W();
            duI2.A24(c26z, 16.0f);
            DxX dxX = duI2.A00;
            dxX.A02 = true;
            duI2.A2W(2131956757);
            dxX.A00 = get2;
            A016.A2d(duI2);
        }
        7zL.A1G(A016, A015);
        A01.A2d(A015);
        return A01.A00;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -450593580:
                RS7 rs7 = ((Dz7) r302.A00.A01).A00;
                11T.A0F(rs7, 1);
                rs7.A01();
                return null;
            case 316148272:
                RS7 rs72 = ((Dz7) r302.A00.A01).A00;
                11T.A0F(rs72, 1);
                ((Ezx) 1Br.A0B(rs72.A00.A04)).A00();
                return null;
            case 1084253380:
                RS7 rs73 = ((Dz7) r302.A00.A01).A00;
                11T.A0F(rs73, 1);
                rs73.A00();
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        E05 e05 = (E05) r303;
        RS7 rs7 = this.A00;
        11T.A0F(rs7, 3);
        FdW fdW = new FdW(rs7);
        FdX fdX = new FdX(rs7);
        e05.A01 = fdW;
        e05.A00 = fdX;
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
