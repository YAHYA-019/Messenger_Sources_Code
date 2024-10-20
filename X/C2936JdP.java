package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* renamed from: X.JdP, reason: case insensitive filesystem */
/* loaded from: JdP.class */
public final class C2936JdP extends LOw {
    public final /* synthetic */ LNR A00;
    public final /* synthetic */ Function2 A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2936JdP(LNR lnr, Function2 function2) {
        super("Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.");
        this.A00 = lnr;
        this.A01 = function2;
    }

    public MKR Bdx(MNJ mnj, List list, long j) {
        MKR mkr;
        int i;
        int i2;
        LNR lnr = this.A00;
        LPN lpn = lnr.A08;
        lpn.A02 = mnj.AtT();
        lpn.A00 = mnj.AhL();
        lpn.A01 = mnj.Amu();
        if (mnj.BU2() || lnr.A09.A08 == null) {
            lnr.A00 = 0;
            mkr = (MKR) this.A01.invoke(lpn, new Constraints(j));
            i = lnr.A00;
            i2 = 1;
        } else {
            i2 = 0;
            lnr.A01 = 0;
            mkr = (MKR) this.A01.invoke(lnr.A07, new Constraints(j));
            i = lnr.A01;
        }
        return new LPC(lnr, mkr, mkr, i, i2);
    }
}
