package com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatar;

import X.11T;
import X.1BL;
import X.1Bn;
import X.1Br;
import X.1Lm;
import X.C5es;
import X.HBG;
import X.Hve;
import X.I8b;
import X.IFE;
import X.Ih5;
import X.Ih6;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView;
import com.facebook.resources.ui.FbTextView;

/* loaded from: AvatarSearchSuggestedRow.class */
public final class AvatarSearchSuggestedRow {
    public int A00;
    public ThreadKey A01;
    public final Context A02;
    public final ViewStub A03;
    public final FbUserSession A04;
    public final 1Br A05;
    public final FbTextView A06;
    public final IFE A07;
    public final Ih6 A08;
    public final Ih5 A09;

    /* JADX WARN: Type inference failed for: r0v21, types: [android.widget.TextView, com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView, android.view.View, com.facebook.resources.ui.FbTextView] */
    public AvatarSearchSuggestedRow(Context context, EditText editText, FbUserSession fbUserSession, I8b i8b) {
        1BL.A1H(context, fbUserSession, i8b);
        this.A02 = context;
        this.A04 = fbUserSession;
        this.A05 = 1Lm.A00(context, fbUserSession, 66197);
        this.A00 = -1;
        Ih6 ih6 = new Ih6(i8b, this);
        this.A08 = ih6;
        Ih5 ih5 = new Ih5(i8b, this, 0);
        this.A09 = ih5;
        View inflate = LayoutInflater.from(context).inflate(2132543415, (ViewGroup) null);
        11T.A0I(inflate, "null cannot be cast to non-null type android.view.ViewStub");
        ViewStub viewStub = (ViewStub) inflate;
        this.A03 = viewStub;
        ?? suggestedRowTitleView = new SuggestedRowTitleView(context, null, 0);
        suggestedRowTitleView.setText(suggestedRowTitleView.getContext().getText(2131953140));
        this.A06 = suggestedRowTitleView;
        1Bn.A0A(115721);
        IFE A00 = Hve.A00(viewStub, editText, ih5, ih6, HBG.A02);
        this.A07 = A00;
        A00.A03 = C5es.A05;
    }
}
