package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Jbo, reason: case insensitive filesystem */
/* loaded from: Jbo.class */
public final class C2871Jbo extends Snapshot {
    public final Snapshot A00;
    public final Function1 A01;

    public C2871Jbo(Snapshot snapshot, LjB ljB, Function1 function1, int i) {
        super(ljB, i);
        this.A01 = function1;
        this.A00 = snapshot;
        snapshot.A0C();
    }

    @Override // androidx.compose.runtime.snapshots.Snapshot
    public void A0B() {
        if (this.A02) {
            return;
        }
        int A04 = A04();
        Snapshot snapshot = this.A00;
        if (A04 != snapshot.A04()) {
            A0G();
        }
        snapshot.A0D();
        super.A0B();
    }
}
