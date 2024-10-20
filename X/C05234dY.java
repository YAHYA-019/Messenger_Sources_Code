package X;

import android.util.Pair;

/* renamed from: X.4dY, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4dY.class */
public final class C05234dY extends AbstractC04664bm {
    public final /* synthetic */ 5fC A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05234dY(InterfaceC04444az interfaceC04444az, 5fC r303) {
        super(interfaceC04444az);
        this.A00 = r303;
    }

    public static void A00(C05234dY c05234dY) {
        Pair pair;
        5fC r0 = c05234dY.A00;
        synchronized (r0) {
            pair = (Pair) r0.A01.poll();
            if (pair == null) {
                r0.A00--;
            }
        }
        if (pair != null) {
            r0.A02.execute(new 3gU(pair, c05234dY));
        }
    }
}
