package X;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.ui.emoji.model.Emoji;
import java.util.BitSet;

/* loaded from: Dxe.class */
public final class Dxe extends C1rj {
    public int A00;
    public 1Im A01;
    public C22a A02;
    public Emoji A03;
    public Integer A04;
    public boolean A05;

    public Dxe() {
        super("SkinToneTooltipEnabledEmojiComponent");
    }

    public final Object[] A0k() {
        return new Object[]{this.A03, this.A04, this.A02, Boolean.valueOf(this.A05), Integer.valueOf(this.A00)};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Emoji emoji = this.A03;
        C22a c22a = this.A02;
        Integer num = this.A04;
        String A0C = r302.A0C();
        C2iw A0D = 7zT.A0D(r302, new Ew6(A0C), A0C);
        1BL.A1F(emoji, c22a);
        Dug dug = new Dug(r302, new DxC());
        7zN.A1D(dug, r302, Dxe.class, "SkinToneTooltipEnabledEmojiComponent", -230625247);
        dug.A1q(1LI.A09(r302, Dxe.class, "SkinToneTooltipEnabledEmojiComponent", 71235917));
        DxC A06 = Dug.A06(emoji, dug, num, c22a);
        dug.A1w(A0D);
        Dug.A07(dug);
        return A06;
    }

    @Override // X.C1rj
    public C1qp A14(1Iw r302, C1qp c1qp) {
        return 4YV.A0M(c1qp);
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        1Im r0;
        int i = r302.A01;
        Boolean bool = null;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i == -230625247) {
            1Iv r02 = r302.A00;
            1Is r03 = r02.A01;
            1Iw r04 = r02.A00;
            Emoji emoji = ((Dxe) r03).A03;
            11T.A0H(r04, emoji);
            1LI r05 = r04.A02;
            if (r05 != null && (r0 = ((Dxe) r05).A01) != null) {
                7zR.A1E(r0, new 7BP(emoji));
                return null;
            }
        } else if (i == 71235917) {
            1Iv r06 = r302.A00;
            1Is r07 = r06.A01;
            1Iw r08 = r06.A00;
            Dxe dxe = (Dxe) r07;
            Emoji emoji2 = dxe.A03;
            C22a c22a = dxe.A02;
            boolean z = dxe.A05;
            int i2 = dxe.A00;
            Integer num = dxe.A04;
            String A0C = r08.A0C();
            C2iw A0D = 7zT.A0D(r08, new Ew6(A0C), A0C);
            int A05 = 7zP.A05(emoji2, c22a, 1);
            Du9 du9 = new Du9(r08, new Dxd());
            1LI r09 = r08.A02;
            1Im r308 = r09 == null ? null : ((Dxe) r09).A01;
            Dxd dxd = du9.A01;
            dxd.A01 = r308;
            dxd.A05 = z;
            BitSet bitSet = du9.A02;
            bitSet.set(1);
            dxd.A04 = c22a.AjT(emoji2);
            bitSet.set(3);
            dxd.A02 = c22a;
            bitSet.set(0);
            dxd.A00 = i2;
            bitSet.set(A05);
            dxd.A03 = num;
            C1rs.A02(bitSet, du9.A03);
            du9.A0J();
            ComponentTree A0b = DKE.A0b(dxd, r08);
            Context context = r08.A0D;
            LithoView lithoView = new LithoView(context, (AttributeSet) null);
            lithoView.A10(A0b, true);
            11T.A0A(context);
            C2137Deq c2137Deq = new C2137Deq(context, 1, 2132542009);
            c2137Deq.A0B(lithoView);
            c2137Deq.A0H(0S2.A00);
            c2137Deq.A03 = -1;
            F1n.A00(r08, A0D, new Fil(c2137Deq));
            bool = true;
        }
        return bool;
    }
}
