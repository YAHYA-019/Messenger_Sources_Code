package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Jbp, reason: case insensitive filesystem */
/* loaded from: Jbp.class */
public final class C2872Jbp extends Snapshot {
    public int A00;
    public final Function1 A01;

    public C2872Jbp(LjB ljB, Function1 function1, int i) {
        super(ljB, i);
        this.A01 = function1;
        this.A00 = 1;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0B() {
        if (this.A02) {
            return;
        }
        A0D();
        super.A0B();
    }
}
