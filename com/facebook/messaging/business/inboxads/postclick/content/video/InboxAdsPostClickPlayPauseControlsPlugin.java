package com.facebook.messaging.business.inboxads.postclick.content.video;

import X.C09s;
import X.C6d6;
import X.GPl;
import X.IKE;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: InboxAdsPostClickPlayPauseControlsPlugin.class */
public class InboxAdsPostClickPlayPauseControlsPlugin extends C6d6 {
    public final ImageButton A00;
    public final ImageButton A01;

    public InboxAdsPostClickPlayPauseControlsPlugin(Context context) {
        this(context, null);
    }

    public InboxAdsPostClickPlayPauseControlsPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InboxAdsPostClickPlayPauseControlsPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A0C(2132542155);
        ImageButton imageButton = (ImageButton) C09s.A01(this, 2131368339);
        this.A01 = imageButton;
        ImageButton imageButton2 = (ImageButton) C09s.A01(this, 2131368338);
        this.A00 = imageButton2;
        GPl.A02(this, 8);
        IKE.A01(imageButton, this, 16);
        IKE.A01(imageButton2, this, 17);
    }

    @Override // X.C6d6
    public String A0H() {
        return "InboxAdsPostClickPlayPauseControlsPlugin";
    }
}
