package X;

import androidx.compose.ui.unit.Constraints;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: X.JdQ, reason: case insensitive filesystem */
/* loaded from: JdQ.class */
public final class C2937JdQ extends LOw {
    public static final C2937JdQ A00 = new C2937JdQ();

    public C2937JdQ() {
        super("Undefined intrinsics block and it is required");
    }

    public MKR Bdx(MNJ mnj, List list, long j) {
        int A05;
        int A04;
        M6m A002;
        C00r A003;
        if (list.isEmpty()) {
            A05 = Constraints.A03(j);
            A04 = Constraints.A02(j);
            A003 = M50.A00;
        } else {
            if (list.size() != 1) {
                ArrayList A1B = AbJ.A1B(list);
                int size = list.size();
                int i = 0;
                while (i < size) {
                    i = MNG.A00(A1B, list, i, j);
                }
                int size2 = A1B.size();
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size2; i4++) {
                    L56 l56 = (L56) A1B.get(i4);
                    i2 = Math.max(l56.A01, i2);
                    i3 = Math.max(l56.A00, i3);
                }
                A05 = Constraints.A05(j, i2);
                A04 = Constraints.A04(j, i3);
                A002 = M6m.A00(A1B, 19);
                return MNJ.A00(mnj, A002, A05, A04);
            }
            L56 Bdz = ((MNG) list.get(0)).Bdz(j);
            A05 = Constraints.A05(j, Bdz.A01);
            A04 = Constraints.A04(j, Bdz.A00);
            A003 = M6m.A00(Bdz, 18);
        }
        A002 = (Function1) A003;
        return MNJ.A00(mnj, A002, A05, A04);
    }
}
