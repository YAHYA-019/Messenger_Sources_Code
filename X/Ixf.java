package X;

import java.util.List;

/* loaded from: Ixf.class */
public final class Ixf implements Runnable {
    public static final String __redex_internal_original_name = "PreviewController$2";
    public final /* synthetic */ Hp6 A00;
    public final /* synthetic */ List A01;

    public Ixf(Hp6 hp6, List list) {
        this.A00 = hp6;
        this.A01 = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.A01;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((RQC) list.get(i2)).A00();
            i = i2 + 1;
        }
    }
}
