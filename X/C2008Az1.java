package X;

import android.view.View;
import java.util.BitSet;

/* renamed from: X.Az1, reason: case insensitive filesystem */
/* loaded from: Az1.class */
public final class C2008Az1 extends C1rj {
    public 59Y A00;

    public C2008Az1() {
        super("MigGlyphButtonAccessoryLayout");
    }

    public final Object[] A0k() {
        return new Object[]{this.A00};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        59Y r0 = this.A00;
        AwV awV = new AwV(r302, new AzL());
        C2cm A00 = C2cl.A00(r302);
        A00.A2b(r0.A03);
        A00.A2X(r0.A01);
        A00.A2W();
        float f = r0.A00;
        A00.A0z(f);
        A00.A0l(f);
        C2cl A0J = 7zL.A0J(A00);
        AzL azL = awV.A01;
        azL.A03 = 7zQ.A0T(A0J);
        BitSet bitSet = awV.A02;
        bitSet.set(0);
        azL.A05 = r0.A05;
        azL.A06 = "android.widget.Button";
        C1qo c1qo = awV.A02;
        azL.A01 = c1qo.A02(f);
        bitSet.set(2);
        azL.A00 = c1qo.A02(r0.A02);
        bitSet.set(1);
        awV.A1G(2130971610);
        azL.A04 = r0.A04 != null ? 1LI.A06(r302, C2008Az1.class, "MigGlyphButtonAccessoryLayout") : null;
        awV.A2K("glyph_button");
        C1rs.A03(bitSet, awV.A03);
        awV.A0J();
        return azL;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i != -1351902487) {
            4YV.A1G(r302, obj, i);
            return null;
        }
        1Is r0 = r302.A00.A01;
        View view = ((3xC) obj).A00;
        DGL dgl = ((C2008Az1) r0).A00.A04;
        dgl.getClass();
        dgl.onClick(view);
        return null;
    }
}
