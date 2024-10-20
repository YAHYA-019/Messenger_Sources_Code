package androidx.mediarouter.app;

import X.AnonymousClass001;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ListView;
import java.util.Iterator;
import java.util.List;

/* loaded from: OverlayListView.class */
public final class OverlayListView extends ListView {
    public final List A00;

    public OverlayListView(Context context) {
        super(context);
        this.A00 = AnonymousClass001.A0s();
    }

    public OverlayListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = AnonymousClass001.A0s();
    }

    public OverlayListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = AnonymousClass001.A0s();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        List list = this.A00;
        if (list.size() > 0) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                it.next();
                throw AnonymousClass001.A0Q("getBitmapDrawable");
            }
        }
    }
}
