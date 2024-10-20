package com.facebook.messaging.media.editing.trimmer;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.widget.CustomFrameLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: MultimediaVideoScrubberView.class */
public class MultimediaVideoScrubberView extends CustomFrameLayout {
    public VideoEditGalleryTrimmerFilmstripView A00;
    public BetterTextView A01;

    public MultimediaVideoScrubberView(Context context) {
        super(context);
        A00();
    }

    public MultimediaVideoScrubberView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00();
    }

    public MultimediaVideoScrubberView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00();
    }

    private void A00() {
        A0U(2132542614);
        this.A00 = (VideoEditGalleryTrimmerFilmstripView) findViewById(2131368208);
        this.A01 = (BetterTextView) findViewById(2131368207);
    }
}
