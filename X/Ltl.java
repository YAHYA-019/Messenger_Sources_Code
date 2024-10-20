package X;

import java.util.concurrent.Callable;

/* loaded from: Ltl.class */
public final class Ltl implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public Ltl(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:359:0x0878, code lost:
    
        if (r305 == null) goto L337;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0b26, code lost:
    
        if (r305 == null) goto L452;
     */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            Method dump skipped, instructions count: 2930
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Ltl.call():java.lang.Object");
    }

    public void finalize() {
        if (1 - this.A00 != 0) {
            super.finalize();
            return;
        }
        int A03 = 0FI.A03(-487804576);
        ((4KC) this.A02).A00();
        0FI.A09(-552798041, A03);
    }
}
