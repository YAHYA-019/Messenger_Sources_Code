package X;

import android.graphics.drawable.Drawable;
import com.facebook.common.callercontext.CallerContext;
import java.util.BitSet;
import java.util.List;

/* loaded from: Dvp.class */
public final class Dvp extends 1LH {
    public final Drawable A02;
    public final 2lO A03;
    public final List A05;
    public final boolean A06;
    public final String A04 = "SpotlightMediaItemComponent";
    public final int A00 = 1750;
    public final int A01 = 2500;

    public Dvp(Drawable drawable, 2lO r303, List list, boolean z) {
        this.A05 = list;
        this.A02 = drawable;
        this.A06 = z;
        this.A03 = r303;
    }

    public 1LI A0s(C2k5 c2k5) {
        11T.A0F(c2k5, 0);
        C07004ik A00 = C06984ii.A00();
        Drawable drawable = this.A02;
        if (drawable == null) {
            drawable = null;
        }
        A00.A06(drawable);
        C06974ih A0Q = 7zO.A0Q(InterfaceC07034in.A01, A00);
        DsJ dsJ = new DsJ(new DzL(), c2k5.A05);
        int i = this.A00;
        DzL dzL = dsJ.A00;
        dzL.A00 = i;
        BitSet bitSet = dsJ.A02;
        bitSet.set(0);
        dzL.A01 = this.A01;
        bitSet.set(1);
        dzL.A05 = this.A06;
        List list = this.A05;
        if (list != null) {
            if (dzL.A04.isEmpty()) {
                dzL.A04 = list;
            } else {
                dzL.A04.addAll(list);
            }
        }
        dzL.A03 = CallerContext.A0B(this.A04);
        dzL.A02 = A0Q;
        C5z7.A00(dsJ, this.A03);
        C1rs.A00(bitSet, dsJ.A03);
        dsJ.A0J();
        return dzL;
    }
}
