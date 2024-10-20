package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.ui.media.contentsearch.ContentSearchResultsView;

/* loaded from: GWz.class */
public final class GWz extends 2kG {
    public final /* synthetic */ int A00;
    public final /* synthetic */ ContentSearchResultsView A01;

    public GWz(ContentSearchResultsView contentSearchResultsView, int i) {
        this.A01 = contentSearchResultsView;
        this.A00 = i;
    }

    public void A05(Rect rect, View view, 2NQ r304, RecyclerView recyclerView) {
        int i = this.A00;
        rect.set(i, i, i, i);
    }
}
