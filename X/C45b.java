package X;

import java.util.Iterator;

/* renamed from: X.45b, reason: invalid class name */
/* loaded from: 45b.class */
public final /* synthetic */ class C45b implements Runnable {
    public static final String __redex_internal_original_name = "MemoryManager$$ExternalSyntheticLambda0";
    public final /* synthetic */ 45Z A00;
    public final /* synthetic */ 2Cz A01;

    public /* synthetic */ C45b(45Z r302, 2Cz r303) {
        this.A01 = r303;
        this.A00 = r302;
    }

    @Override // java.lang.Runnable
    public final void run() {
        2Cz r0 = this.A01;
        45Z r02 = this.A00;
        synchronized (r0) {
            String name = r02.name();
            0fH.A07(2Cz.class, name, "trimMemory: %s");
            ((1CO) r0.A03.get()).Auy(36593142837347398L);
            try {
                Iterator it = r0.A05.keySet().iterator();
                while (it.hasNext()) {
                    ((2Et) it.next()).D5F(r02);
                }
                0fH.A07(2Cz.class, name, "trimMemory complete: %s");
            } finally {
                r0.A07.set(false);
            }
        }
    }
}
