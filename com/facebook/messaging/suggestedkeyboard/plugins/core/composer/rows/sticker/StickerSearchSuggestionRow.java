package com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.sticker;

import X.11T;
import X.1BL;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.HBG;
import X.Hve;
import X.I8b;
import X.IFE;
import X.Ih5;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView;

/* loaded from: StickerSearchSuggestionRow.class */
public final class StickerSearchSuggestionRow {
    public int A00;
    public ThreadKey A01;
    public final ViewStub A02;
    public final 1Br A03;
    public final SuggestedRowTitleView A04;
    public final Ih5 A05;
    public final IFE A06;

    /* JADX WARN: Type inference failed for: r0v16, types: [android.widget.TextView, com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView] */
    public StickerSearchSuggestionRow(Context context, EditText editText, I8b i8b) {
        1BL.A1F(context, i8b);
        this.A03 = 1Bq.A00(68416);
        this.A00 = -1;
        Ih5 ih5 = new Ih5(i8b, this, 1);
        this.A05 = ih5;
        View inflate = LayoutInflater.from(context).inflate(2132543415, (ViewGroup) null);
        11T.A0I(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        ViewStub viewStub = (ViewStub) inflate;
        this.A02 = viewStub;
        ?? suggestedRowTitleView = new SuggestedRowTitleView(context, null, 0);
        suggestedRowTitleView.setText(context.getText(2131966576));
        this.A04 = suggestedRowTitleView;
        1Bn.A0A(115721);
        this.A06 = Hve.A00(viewStub, editText, ih5, null, HBG.A08);
    }
}
