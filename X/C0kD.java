package X;

import java.lang.ref.ReferenceQueue;

/* renamed from: X.0kD, reason: invalid class name */
/* loaded from: 0kD.class */
public abstract class C0kD {
    public static final Thread A03;
    public static final 0kC A01 = new 0kC();
    public static final ReferenceQueue A02 = new ReferenceQueue();
    public static final C0kB A00 = new C0kB();

    static {
        Thread thread = new Thread() { // from class: X.0k9
            public static final String __redex_internal_original_name = "DestructorThread$1";

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                while (true) {
                    try {
                        C0kB c0kB = C0kD.A00;
                        0kA remove = C0kD.A02.remove();
                        remove.destruct();
                        if (remove.previous == null) {
                            0kA r0 = (0kA) C0kD.A01.A00.getAndSet(null);
                            while (true) {
                                0kA r305 = r0;
                                if (r305 == null) {
                                    break;
                                }
                                0kA r02 = r305.next;
                                0kA r03 = C0kD.A00.A00;
                                r305.next = r03.next;
                                r03.next = r305;
                                r305.next.previous = r305;
                                r305.previous = r03;
                                r0 = r02;
                            }
                        }
                        0kA r04 = remove.next;
                        r04.previous = remove.previous;
                        remove.previous.next = r04;
                    } catch (InterruptedException unused) {
                    }
                }
            }
        };
        A03 = thread;
        thread.start();
    }
}
