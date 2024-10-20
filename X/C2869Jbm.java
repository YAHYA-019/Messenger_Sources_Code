package X;

import androidx.compose.runtime.snapshots.Snapshot;
import kotlin.jvm.functions.Function1;

/* renamed from: X.Jbm, reason: case insensitive filesystem */
/* loaded from: Jbm.class */
public final class C2869Jbm extends C2874Jbr {
    public boolean A00;
    public final C2874Jbr A01;

    public C2869Jbm(C2874Jbr c2874Jbr, LjB ljB, Function1 function1, Function1 function12, int i) {
        super(ljB, function1, function12, i);
        this.A01 = c2874Jbr;
        c2874Jbr.A0C();
    }

    @Override // X.C2874Jbr, androidx.compose.runtime.snapshots.Snapshot
    public void A0B() {
        if (((Snapshot) this).A02) {
            return;
        }
        super.A0B();
        if (this.A00) {
            return;
        }
        this.A00 = true;
        this.A01.A0D();
    }
}
