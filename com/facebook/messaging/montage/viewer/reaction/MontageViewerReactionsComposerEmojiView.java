package com.facebook.messaging.montage.viewer.reaction;

import X.2KY;
import X.6qG;
import X.C22a;
import X.GOp;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.facebook.ui.emoji.model.BasicEmoji;

/* loaded from: MontageViewerReactionsComposerEmojiView.class */
public class MontageViewerReactionsComposerEmojiView extends ImageView {
    public C22a A00;

    public MontageViewerReactionsComposerEmojiView(Context context) {
        this(context, null);
    }

    public MontageViewerReactionsComposerEmojiView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MontageViewerReactionsComposerEmojiView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = GOp.A0y();
    }

    public void A00(String str) {
        2KY r0 = this.A00;
        BasicEmoji A02 = 2KY.A02(r0, str);
        if (A02 == null) {
            setImageDrawable(null);
            return;
        }
        setImageDrawable(new InsetDrawable((Drawable) r0.AjP(A02, 6qG.A00), getResources().getDimensionPixelSize(2132279309)));
        setClickable(true);
        setContentDescription(A02.A07());
    }
}
