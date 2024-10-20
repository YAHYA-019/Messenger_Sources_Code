package X;

import java.util.List;

/* renamed from: X.31l, reason: invalid class name */
/* loaded from: 31l.class */
public final /* synthetic */ class C31l implements Runnable {
    public static final String __redex_internal_original_name = "RecyclerBinder$$ExternalSyntheticLambda3";
    public final /* synthetic */ List A00;

    @Override // java.lang.Runnable
    public final void run() {
        List list = this.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= size) {
                return;
            }
            ((2iK) list.get(i2)).A04();
            i = i2 + 1;
        }
    }
}
