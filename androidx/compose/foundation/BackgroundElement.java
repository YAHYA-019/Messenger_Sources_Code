package androidx.compose.foundation;

import X.1BK;
import X.1BL;
import X.4YV;
import X.7zQ;
import X.LDp;
import X.LOB;
import X.MEK;
import kotlin.jvm.functions.Function1;

/* loaded from: BackgroundElement.class */
public final class BackgroundElement extends LOB {
    public final float A00 = 1.0f;
    public final long A01;
    public final MEK A02;
    public final Function1 A03;

    public BackgroundElement(MEK mek, Function1 function1, long j) {
        this.A01 = j;
        this.A02 = mek;
        this.A03 = function1;
    }

    public boolean equals(Object obj) {
        BackgroundElement backgroundElement = obj instanceof BackgroundElement ? (BackgroundElement) obj : null;
        boolean z = false;
        if (backgroundElement != null) {
            long j = this.A01;
            long j2 = backgroundElement.A01;
            long j3 = LDp.A01;
            if (j == j2 && this.A00 == backgroundElement.A00) {
                z = 4YV.A1a(this.A02, backgroundElement.A02, false);
            }
        }
        return z;
    }

    public int hashCode() {
        long j = this.A01;
        long j2 = LDp.A01;
        return 1BK.A03(this.A02, 1BL.A00(7zQ.A02(j) * 31, this.A00));
    }
}
