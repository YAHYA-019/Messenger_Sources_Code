package X;

import com.facebook.ui.media.contentsearch.ContentSearchResultItemView;

/* loaded from: H04.class */
public final class H04 extends C66m {
    public final /* synthetic */ ContentSearchResultItemView A00;

    public H04(ContentSearchResultItemView contentSearchResultItemView) {
        this.A00 = contentSearchResultItemView;
    }

    @Override // X.C66m, X.C66n
    public void CMV(C66i c66i) {
        float f = 1.0f - (((float) c66i.A09.A00) * 0.15f);
        ContentSearchResultItemView contentSearchResultItemView = this.A00;
        contentSearchResultItemView.setScaleX(f);
        contentSearchResultItemView.setScaleY(f);
    }
}
