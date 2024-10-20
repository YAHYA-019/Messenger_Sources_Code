package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.1a1, reason: invalid class name and case insensitive filesystem */
/* loaded from: 1a1.class */
public abstract class AbstractC00061a1 {
    public static final Thread A03;
    public static final C00081a3 A01 = new C00081a3();
    public static final ReferenceQueue A02 = new ReferenceQueue();
    public static final C00101a5 A00 = new C00101a5();

    static {
        Thread thread = new Thread() { // from class: X.1a7
            public static final String __redex_internal_original_name = "DestructorThread$1";

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        C00101a5 c00101a5 = AbstractC00061a1.A00;
                        1Zw remove = AbstractC00061a1.A02.remove();
                        remove.destruct();
                        if (remove.A01 == null) {
                            1Zw r0 = (1Zw) AbstractC00061a1.A01.A00.getAndSet(null);
                            while (true) {
                                1Zw r305 = r0;
                                if (r305 == null) {
                                    break;
                                }
                                1Zw r02 = r305.A00;
                                1Zw r03 = AbstractC00061a1.A00.A00;
                                r305.A00 = r03.A00;
                                r03.A00 = r305;
                                r305.A00.A01 = r305;
                                r305.A01 = r03;
                                r0 = r02;
                            }
                        }
                        1Zw r04 = remove.A00;
                        r04.A01 = remove.A01;
                        remove.A01.A00 = r04;
                    } catch (InterruptedException unused) {
                    }
                }
            }
        };
        A03 = thread;
        thread.start();
    }
}
