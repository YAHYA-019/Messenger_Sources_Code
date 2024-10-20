package com.facebook.smartcapture.ui;

import X.11T;
import X.4YU;
import X.AnonymousClass001;
import X.HL8;
import X.Kw8;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.facebook.smartcapture.logging.IdCaptureLogger;
import java.util.Map;

/* loaded from: TextTipView.class */
public final class TextTipView extends FrameLayout {
    public IdCaptureLogger A00;
    public final ImageView A01;
    public final ProgressBar A02;
    public final TextView A03;
    public final TextView A04;
    public final Map A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextTipView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        View.inflate(context, 2132543481, this);
        HL8.A00(this, 2131367004).setBackgroundTintList(ColorStateList.valueOf(Kw8.A00(4YU.A08(this), 2130971527)));
        this.A04 = (TextView) HL8.A00(this, 2131368234);
        this.A03 = (TextView) HL8.A00(this, 2131368233);
        this.A01 = (ImageView) HL8.A00(this, 2131365095);
        ProgressBar progressBar = (ProgressBar) HL8.A00(this, 2131366396);
        this.A02 = progressBar;
        Kw8.A01(context, progressBar, 2130971524);
        this.A05 = AnonymousClass001.A0u();
    }
}
