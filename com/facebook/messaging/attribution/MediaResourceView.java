package com.facebook.messaging.attribution;

import X.C09s;
import X.C1oo;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.messaging.sharing.mediapreview.MediaSharePreviewPlayableView;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.listview.EmptyListViewItem;

/* loaded from: MediaResourceView.class */
public class MediaResourceView extends CustomFrameLayout implements CallerContextable {
    public static final CallerContext A05 = CallerContext.A0A(MediaResourceView.class, "media_resource_view", "media_resource_view");
    public FbDraweeView A00;
    public MediaSharePreviewPlayableView A01;
    public MediaResource A02;
    public EmptyListViewItem A03;
    public int A04;

    public MediaResourceView(Context context) {
        super(context);
        this.A04 = -1;
        A00(context, null);
    }

    public MediaResourceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A04 = -1;
        A00(context, attributeSet);
    }

    public MediaResourceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A04 = -1;
        A00(context, attributeSet);
    }

    private void A00(Context context, AttributeSet attributeSet) {
        A0U(2132542507);
        EmptyListViewItem emptyListViewItem = (EmptyListViewItem) C09s.A01(this, 2131365306);
        this.A03 = emptyListViewItem;
        emptyListViewItem.A0F(true);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A1u);
            this.A04 = obtainStyledAttributes.getInt(0, -1);
            obtainStyledAttributes.recycle();
        }
    }

    @Override // com.facebook.widget.CustomFrameLayout, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3 = this.A04;
        if (i3 != -1) {
            i2 = View.MeasureSpec.makeMeasureSpec(i3, (-1) << (-1));
        }
        super.onMeasure(i, i2);
    }
}
