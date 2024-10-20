package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

/* loaded from: KqL.class */
public final class KqL {
    public long A00;
    public final Paint A01;
    public final KkM A02;
    public final L3J A03;
    public final L2X A04;

    /* JADX WARN: Type inference failed for: r0v5, types: [X.L2X, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9, types: [X.L3J, java.lang.Object] */
    public KqL(Paint paint, KkM kkM, long j) {
        1BL.A1F(kkM, paint);
        this.A02 = kkM;
        this.A01 = paint;
        this.A00 = j;
        ?? obj = new Object();
        L2X.A00((L2X) obj);
        this.A04 = obj;
        ?? obj2 = new Object();
        ((L3J) obj2).A00 = 0.0f;
        ((L3J) obj2).A01 = 0.0f;
        L3J.A00((L3J) obj2);
        this.A03 = obj2;
    }

    public final void A00(Canvas canvas) {
        int save = canvas.save();
        try {
            this.A04.A01(canvas);
            KkM kkM = this.A02;
            Paint paint = this.A01;
            long j = this.A00;
            Khq khq = kkM.A02;
            Rect rect = kkM.A01;
            11T.A0F(rect, 1);
            khq.A00.AOM(canvas, paint, rect, khq.A01[(int) ((((float) (j % 1000)) / 1000.0f) * 1.0f)]);
        } finally {
            canvas.restoreToCount(save);
        }
    }
}
