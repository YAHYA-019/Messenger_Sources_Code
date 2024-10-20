package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.messaging.rtc.incall.impl.expression.ExpressionList;

/* loaded from: GWy.class */
public final class GWy extends 2kG {
    public final /* synthetic */ ExpressionList A00;

    public GWy(ExpressionList expressionList) {
        this.A00 = expressionList;
    }

    public void A05(Rect rect, View view, 2NQ r304, RecyclerView recyclerView) {
        7zT.A1S(rect, view, recyclerView);
        ExpressionList expressionList = this.A00;
        float f = RecyclerView.A1C;
        if (expressionList.A01 != null) {
            if (expressionList.A00 == 0) {
                expressionList.A00 = GOo.A0A(view).getDimensionPixelSize(2132279371);
            }
            int A05 = RecyclerView.A05(view);
            GWo gWo = expressionList.A01;
            int size = gWo != null ? gWo.A00.size() : 0;
            if (A05 == 0) {
                rect.left = expressionList.A00;
            } else if (A05 == size - 1) {
                rect.right = expressionList.A00;
            }
        }
    }
}
