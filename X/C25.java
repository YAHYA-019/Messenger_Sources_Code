package X;

import com.facebook.litho.LithoView;
import com.facebook.messaging.wellbeing.selfremediation.block.group.blockmember.BlockMemberFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.BitSet;

/* loaded from: C25.class */
public final class C25 {
    public final /* synthetic */ BlockMemberFragment A00;

    public C25(BlockMemberFragment blockMemberFragment) {
        this.A00 = blockMemberFragment;
    }

    public void A00(ImmutableList immutableList) {
        0D2 r0 = this.A00;
        LithoView lithoView = r0.A01;
        if (lithoView != null) {
            C1892Avt c1892Avt = new C1892Avt(lithoView.A09, new QJ4());
            MigColorScheme migColorScheme = r0.A06;
            String str = null;
            if (migColorScheme == null) {
                11T.A0L("colorScheme");
                throw 0Q8.createAndThrow();
            }
            QJ4 qj4 = c1892Avt.A01;
            qj4.A01 = migColorScheme;
            BitSet bitSet = c1892Avt.A02;
            bitSet.set(0);
            if (r0.A07) {
                str = r0.getString(BlockMemberFragment.A05(r0));
            }
            qj4.A04 = str;
            bitSet.set(2);
            qj4.A03 = immutableList;
            bitSet.set(1);
            qj4.A02 = CxE.A00(r0, 96);
            qj4.A00 = r0.A00;
            C1rs.A03(bitSet, c1892Avt.A03);
            c1892Avt.A0J();
            lithoView.A0x(qj4);
        }
    }
}
