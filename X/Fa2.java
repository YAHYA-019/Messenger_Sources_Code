package X;

import android.view.View;

/* loaded from: Fa2.class */
public final class Fa2 implements GJH {
    public final /* synthetic */ View A00;
    public final /* synthetic */ DQ0 A01;

    public Fa2(View view, DQ0 dq0) {
        this.A01 = dq0;
        this.A00 = view;
    }

    public void CM7() {
        RW7.A00(this.A01, 0.0f);
    }

    public void CM8(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            RW7.A00(this.A01, (i * 1.0f) / height);
        }
    }

    public void CM9(int i) {
        int height = this.A00.getHeight();
        if (height > 0) {
            RW7.A00(this.A01, (i * 1.0f) / height);
        }
    }
}
