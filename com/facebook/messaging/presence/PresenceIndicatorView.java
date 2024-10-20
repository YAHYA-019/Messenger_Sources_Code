package com.facebook.messaging.presence;

import X.1BK;
import X.AnonymousClass001;
import X.C1oo;
import X.QpE;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.BetterTextView;
import java.util.Map;

/* loaded from: PresenceIndicatorView.class */
public class PresenceIndicatorView extends CustomLinearLayout {
    public Map A00;
    public int A01;
    public final ImageView A02;
    public final BetterTextView A03;

    public PresenceIndicatorView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    public PresenceIndicatorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A00 = AnonymousClass001.A0u();
        setOrientation(0);
        setGravity(17);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1oo.A2B);
        if (obtainStyledAttributes.getBoolean(1, false)) {
            1BK.A1P(QpE.A05, this.A00, 2132347034);
            1BK.A1P(QpE.A06, this.A00, 2132347017);
        }
        ?? betterTextView = new BetterTextView(context, null, 2130971386);
        this.A03 = betterTextView;
        betterTextView.setVisibility(8);
        ImageView imageView = new ImageView(context, null, obtainStyledAttributes.getResourceId(2, 2130971385));
        this.A02 = imageView;
        if (obtainStyledAttributes.getInteger(0, 0) == 1) {
            addView(betterTextView);
            addView(imageView);
        } else {
            addView(imageView);
            addView(betterTextView);
        }
        int color = obtainStyledAttributes.getColor(3, -1);
        setTextColor(color == -1 ? getContext().getColor(2132213997) : color);
        obtainStyledAttributes.recycle();
    }

    public int getTextColor() {
        return this.A01;
    }

    public void setTextColor(int i) {
        this.A01 = i;
        this.A03.setTextColor(i);
    }
}
