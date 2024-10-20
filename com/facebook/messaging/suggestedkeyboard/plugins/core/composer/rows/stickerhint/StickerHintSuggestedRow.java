package com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.stickerhint;

import X.11T;
import X.1Bn;
import X.1Br;
import X.1Lm;
import X.7zT;
import X.C00m;
import X.HBG;
import X.Hve;
import X.I8b;
import X.IFE;
import X.IJ7;
import X.Ih5;
import X.Ih8;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.composer.avatar.StickerSuggestionsController;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView;
import com.google.common.collect.ImmutableList;
import java.util.List;

/* loaded from: StickerHintSuggestedRow.class */
public final class StickerHintSuggestedRow {
    public int A00;
    public ThreadKey A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final ViewStub A05;
    public final EditText A06;
    public final 1Br A07;
    public final SuggestedRowTitleView A08;
    public final IFE A09;
    public final C00m A0A;
    public final Ih8 A0B;
    public final Ih5 A0C;

    /* JADX WARN: Type inference failed for: r0v21, types: [android.widget.TextView, com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView] */
    public StickerHintSuggestedRow(Context context, EditText editText, FbUserSession fbUserSession, I8b i8b, C00m c00m) {
        7zT.A1W(context, fbUserSession, i8b, c00m);
        this.A0A = c00m;
        this.A06 = editText;
        this.A07 = 1Lm.A00(context, fbUserSession, 65809);
        this.A00 = -1;
        Ih5 ih5 = new Ih5(i8b, this, 2);
        this.A0C = ih5;
        Ih8 ih8 = new Ih8(i8b, this);
        this.A0B = ih8;
        View inflate = LayoutInflater.from(context).inflate(2132543415, (ViewGroup) null);
        11T.A0I(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        ViewStub viewStub = (ViewStub) inflate;
        this.A05 = viewStub;
        ?? suggestedRowTitleView = new SuggestedRowTitleView(context, null, 0);
        suggestedRowTitleView.setText(context.getText(2131966317));
        this.A08 = suggestedRowTitleView;
        1Bn.A0A(115721);
        IFE A00 = Hve.A00(viewStub, editText, ih5, ih8, HBG.A09);
        this.A09 = A00;
        A00.A0A = (List) ((StickerSuggestionsController) 1Br.A0B(this.A07)).A01.A02;
        A00.A07 = ImmutableList.of();
        if (editText != null) {
            IJ7.A00(editText, this, 5);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r304 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.stickerhint.StickerHintSuggestedRow r301) {
        /*
            r0 = r301
            X.00m r0 = r0.A0A
            java.lang.Object r0 = r0.invoke()
            java.lang.String r0 = (java.lang.String) r0
            r302 = r0
            r0 = r301
            android.widget.EditText r0 = r0.A06
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r303
            android.text.Editable r0 = r0.getText()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L28
            r0 = r303
            java.lang.String r0 = r0.toString()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2b
        L28:
            java.lang.String r0 = ""
            r304 = r0
        L2b:
            r0 = r301
            boolean r0 = r0.A03
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L87
            r0 = r304
            int r0 = r0.length()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L87
            r0 = r301
            boolean r0 = r0.A02
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L5a
            r0 = r301
            boolean r0 = r0.A04
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L87
        L5a:
            r0 = r302
            boolean r0 = X.7zL.A1V(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L87
            r0 = r301
            X.1Br r0 = r0.A07
            java.lang.Object r0 = X.1Br.A0B(r0)
            com.facebook.messaging.composer.avatar.StickerSuggestionsController r0 = (com.facebook.messaging.composer.avatar.StickerSuggestionsController) r0
            X.82Z r0 = r0.A01
            java.lang.Object r0 = r0.A02
            java.util.List r0 = (java.util.List) r0
            r303 = r0
            r0 = r303
            boolean r0 = X.1BK.A1Y(r0)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L87
            r0 = 1
            r306 = r0
        L87:
            r0 = r301
            com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView r0 = r0.A08
            r302 = r0
            r0 = 0
            r307 = r0
            r0 = 0
            r304 = r0
            r0 = r306
            int r0 = X.GOp.A07(r0)
            r305 = r0
            r0 = r302
            r1 = r305
            r0.setVisibility(r1)
            r0 = r301
            android.view.ViewStub r0 = r0.A05
            r303 = r0
            r0 = r306
            if (r0 != 0) goto Lac
            r0 = 8
            r307 = r0
        Lac:
            r0 = r303
            r1 = r307
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.stickerhint.StickerHintSuggestedRow.A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.stickerhint.StickerHintSuggestedRow):void");
    }
}
