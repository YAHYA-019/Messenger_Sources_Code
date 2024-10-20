package X;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: AF1.class */
public final class AF1 implements Runnable {
    public static final String __redex_internal_original_name = "ThreadEmbodimentScrollListener$onScrolled$1";
    public final /* synthetic */ RecyclerView A00;
    public final /* synthetic */ 8Dq A01;

    public AF1(RecyclerView recyclerView, 8Dq r303) {
        this.A01 = r303;
        this.A00 = recyclerView;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0048, code lost:
    
        if (r0 == false) goto L8;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r301 = this;
            r0 = r301
            X.8Dq r0 = r0.A01
            r302 = r0
            r0 = r301
            androidx.recyclerview.widget.RecyclerView r0 = r0.A00
            r303 = r0
            r0 = r303
            r1 = -1
            boolean r0 = r0.canScrollVertically(r1)
            r1 = 1
            r0 = r0 ^ r1
            r304 = r0
            r0 = r302
            boolean r0 = r0.A00
            r305 = r0
            r0 = r305
            r1 = r304
            if (r0 == r1) goto L57
            r0 = r302
            r1 = r304
            r0.A00 = r1
            r0 = r302
            X.01i r0 = r0.A01
            r306 = r0
            r0 = r306
            java.lang.Object r0 = r0.getValue()
            X.9kz r0 = (X.C9kz) r0
            r303 = r0
            r0 = r303
            r1 = r304
            r0.A04 = r1
            r0 = r303
            boolean r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L4b
            r0 = 1
            r305 = r0
            r0 = r304
            if (r0 != 0) goto L51
        L4b:
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
        L51:
            r0 = r303
            r1 = r305
            X.C9kz.A01(r0, r1)
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AF1.run():void");
    }
}
