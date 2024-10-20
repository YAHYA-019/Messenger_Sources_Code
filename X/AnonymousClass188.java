package X;

import java.util.concurrent.ExecutorService;

/* renamed from: X.188, reason: invalid class name */
/* loaded from: 188.class */
public abstract class AnonymousClass188 {
    public final C18b A00;
    public final ExecutorService A01;
    public final 18B A02;

    public AnonymousClass188(C09D c09d, 18B r303, ExecutorService executorService) {
        this.A01 = executorService;
        this.A02 = r303;
        this.A00 = new C18b(c09d);
    }

    public void A00(C18c c18c) {
        synchronized (this) {
            C18b c18b = this.A00;
            C18c A00 = c18b.A00(c18c);
            if (A00 != null) {
                c18b.A04(A00, new C18c(A00.A02, A00.A00(), A00.A01 - 10, A00.A00 + 1));
                c18b.A02();
            }
        }
    }
}
