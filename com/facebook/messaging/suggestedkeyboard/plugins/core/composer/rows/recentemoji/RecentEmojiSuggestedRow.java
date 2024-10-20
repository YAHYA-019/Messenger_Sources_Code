package com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.recentemoji;

import X.1BL;
import X.1Br;
import X.1Bu;
import X.83U;
import X.8E7;
import X.9pI;
import X.C00m;
import X.I8b;
import android.content.Context;
import android.widget.EditText;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView;

/* loaded from: RecentEmojiSuggestedRow.class */
public final class RecentEmojiSuggestedRow {
    public final 1Br A00;
    public final 8E7 A01;
    public final SuggestedRowTitleView A02;
    public final C00m A03;
    public final EditText A04;

    /* JADX WARN: Type inference failed for: r0v10, types: [android.widget.TextView, com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView] */
    public RecentEmojiSuggestedRow(Context context, EditText editText, I8b i8b, C00m c00m) {
        1BL.A1H(context, i8b, c00m);
        this.A03 = c00m;
        this.A04 = editText;
        this.A00 = 1Bu.A00(68757);
        8E7 r0 = new 8E7(context);
        this.A01 = r0;
        ?? suggestedRowTitleView = new SuggestedRowTitleView(context, null, 0);
        suggestedRowTitleView.setText(context.getText(2131956399));
        this.A02 = suggestedRowTitleView;
        r0.A00 = 83U.A01(i8b, this, 30);
        if (editText != null) {
            editText.addTextChangedListener(new 9pI(this, 7));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        if (X.0CU.A0O(r302) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.recentemoji.RecentEmojiSuggestedRow r301) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.recentemoji.RecentEmojiSuggestedRow.A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.recentemoji.RecentEmojiSuggestedRow):void");
    }
}
