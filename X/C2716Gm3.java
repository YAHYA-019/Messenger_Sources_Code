package X;

import android.net.Uri;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.Gm3, reason: case insensitive filesystem */
/* loaded from: Gm3.class */
public final class C2716Gm3 extends 2Yv {
    public Uri A00;
    public C1rn A01;
    public H2a A02;
    public H2Y A03;
    public H2Z A04;
    public AtomicBoolean A05;
    public AtomicBoolean A06;
    public AtomicBoolean A07;
    public AtomicBoolean A08;
    public AtomicBoolean A09;
    public AtomicReference A0A;

    public void A02(C2l4 c2l4) {
        if (c2l4.A00 == 0) {
            AtomicBoolean atomicBoolean = this.A07;
            if (atomicBoolean != null) {
                atomicBoolean.set(true);
            }
            this.A07 = atomicBoolean;
        }
    }
}
