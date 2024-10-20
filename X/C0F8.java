package X;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: X.0F8, reason: invalid class name */
/* loaded from: 0F8.class */
public final class C0F8 {
    public static 0FA A00;
    public static Executor A01;
    public static List A02;
    public static final 0FA A03;

    /* JADX WARN: Type inference failed for: r0v0, types: [X.0FA, java.lang.Object] */
    static {
        ?? obj = new Object();
        A03 = obj;
        A00 = obj;
        A01 = Executors.newSingleThreadExecutor();
        A02 = new ArrayList();
    }

    public static void A00(final 0FA r301) {
        synchronized (C0F8.class) {
            if (A00 != r301) {
                A00 = r301;
                List<0FC> list = A02;
                for (final 0FC r0 : list) {
                    A01.execute(new Runnable() { // from class: X.009
                        public static final String __redex_internal_original_name = "GlobalPropertiesCreator$$ExternalSyntheticLambda1";

                        @Override // java.lang.Runnable
                        public final void run() {
                            0FC r02 = r0;
                            0FA r03 = r301;
                            0FA r04 = C0F8.A03;
                            r02.CKu(r03);
                        }
                    });
                }
                list.clear();
            }
        }
    }

    public static void A01(0FC r301) {
        synchronized (C0F8.class) {
            0FA r0 = A00;
            if (r0 != A03) {
                A01.execute(new 0hS(r0, r301));
            } else {
                A02.add(r301);
            }
        }
    }
}
