package com.facebook.messaging.business.inboxads.postclick.content.video;

import X.2OB;
import X.6TI;
import X.C0A8;
import X.H3O;
import android.content.Context;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.SeekBar;

/* loaded from: InboxAdsPostClickVideoSeekBarPlugin.class */
public class InboxAdsPostClickVideoSeekBarPlugin extends H3O {
    public boolean A00;

    public InboxAdsPostClickVideoSeekBarPlugin(Context context) {
        this(context, null);
    }

    public InboxAdsPostClickVideoSeekBarPlugin(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InboxAdsPostClickVideoSeekBarPlugin(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = false;
    }

    public String A0H() {
        return "InboxAdsPostClickVideoSeekBarPlugin";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0e(6TI r302, boolean z) {
        super.A0e(r302, z);
        if (this.A00 || !z) {
            return;
        }
        if (((H3O) this).A06 != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                int A00 = C0A8.A00(getContext(), 5.0f);
                ((H3O) this).A06.setMinHeight(A00);
                ((H3O) this).A06.setMaxHeight(A00);
            }
            SeekBar seekBar = ((H3O) this).A06;
            Context context = getContext();
            seekBar.setProgressDrawable(context.getDrawable(2132410960));
            ((H3O) this).A06.setPadding(C0A8.A00(context, 9.0f), C0A8.A00(context, 12.0f), C0A8.A00(context, 9.0f), C0A8.A00(context, 18.0f));
        }
        2OB r0 = ((H3O) this).A07;
        if (r0 != null) {
            r0.setPadding(0, 0, 0, C0A8.A00(getContext(), 6.0f));
        }
        this.A00 = true;
    }
}
