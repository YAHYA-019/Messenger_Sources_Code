package com.facebook.messaging.msys.thread.aibot.footer.view;

import X.11T;
import X.3yG;
import android.content.Context;
import android.content.res.Resources;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.facebook.resources.ui.FbTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: AiBotDisclosureView.class */
public final class AiBotDisclosureView extends FrameLayout {
    public final FbTextView A00;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AiBotDisclosureView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AiBotDisclosureView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.TextView, android.view.View, com.facebook.resources.ui.FbTextView] */
    public AiBotDisclosureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        ?? fbTextView = new FbTextView(context);
        this.A00 = fbTextView;
        addView((View) fbTextView, new FrameLayout.LayoutParams(-1, -2));
        fbTextView.setGravity(17);
        fbTextView.setMovementMethod(LinkMovementMethod.getInstance());
        fbTextView.setHighlightColor(0);
    }

    public /* synthetic */ AiBotDisclosureView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void A00(CharSequence charSequence) {
        if (charSequence == null || charSequence.length() == 0) {
            return;
        }
        Resources resources = getResources();
        11T.A0A(resources);
        setPadding(3yG.A02(resources), 3yG.A04(resources, 12.0f), 3yG.A02(resources), 0);
        this.A00.setText(charSequence);
    }
}
