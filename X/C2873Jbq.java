package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Jbq, reason: case insensitive filesystem */
/* loaded from: Jbq.class */
public final class C2873Jbq extends Snapshot {
    public Function1 A00;
    public final long A01;
    public final Snapshot A02;
    public final Snapshot A03;
    public final boolean A04;

    public C2873Jbq(Snapshot snapshot, Function1 function1, boolean z) {
        super(LjB.A04, 0);
        this.A02 = snapshot;
        this.A04 = z;
        int i = LEY.A00;
        this.A00 = function1 == null ? null : function1;
        this.A01 = JR0.A0Q();
        this.A03 = this;
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0B() {
        Snapshot snapshot;
        super.A02 = true;
        if (!this.A04 || (snapshot = this.A02) == null) {
            return;
        }
        snapshot.A0B();
    }
}
