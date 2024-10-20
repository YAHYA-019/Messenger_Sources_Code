package androidx.browser.browseractions;

import X.DKD;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.LinearLayout;

/* loaded from: BrowserActionsFallbackMenuView.class */
public class BrowserActionsFallbackMenuView extends LinearLayout {
    public final int A00;
    public final int A01;

    public BrowserActionsFallbackMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Resources resources = getResources();
        this.A01 = resources.getDimensionPixelOffset(2132279320);
        this.A00 = resources.getDimensionPixelOffset(2132279415);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(DKD.A00(Math.min(DKD.A09(this).widthPixels - (this.A01 * 2), this.A00)), i2);
    }
}
