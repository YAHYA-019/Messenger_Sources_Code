package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: Iv9.class */
public final class Iv9 implements Runnable {
    public static final String __redex_internal_original_name = "ViewPager2$SmoothScrollToPosition";
    public final int A00;
    public final RecyclerView A01;

    public Iv9(RecyclerView recyclerView, int i) {
        this.A00 = i;
        this.A01 = recyclerView;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.A01.A0w(this.A00);
    }
}
