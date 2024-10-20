package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: JXj.class */
public final class JXj extends View {
    public long A00;
    public Function1 A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final float A05;
    public final Runnable A06;
    public final List A07;
    public final L0G A08;

    public JXj(Context context) {
        super(context, null, 0);
        this.A07 = AnonymousClass001.A0s();
        this.A06 = new Lli(this);
        11T.A0A(getResources());
        this.A05 = C0A8.A03(r0, 4.0f);
        this.A04 = C0A8.A03(r0, 15.0f);
        this.A03 = C0A8.A03(r0, -200.0f);
        this.A02 = C0A8.A03(r0, 800.0f);
        this.A08 = new L0G(this, new M0s(this, 15));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        11T.A0F(canvas, 0);
        super.onDraw(canvas);
        for (KkN kkN : this.A07) {
            int save = canvas.save();
            try {
                kkN.A03.A01(canvas);
                kkN.A01.draw(canvas);
            } finally {
                canvas.restoreToCount(save);
            }
        }
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i) {
        11T.A0F(view, 0);
        super.onVisibilityChanged(view, i);
        L0G.A00(this.A08);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i) {
        int A06 = 0FI.A06(1778916225);
        super.onWindowVisibilityChanged(i);
        L0G l0g = this.A08;
        l0g.A00 = i;
        L0G.A00(l0g);
        0FI.A0C(-582269067, A06);
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        11T.A0F(drawable, 0);
        List list = this.A07;
        boolean z = true;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (11T.A0O(((KkN) it.next()).A01, drawable)) {
                    return true;
                }
            }
        }
        if (!super.verifyDrawable(drawable)) {
            z = false;
        }
        return z;
    }
}
