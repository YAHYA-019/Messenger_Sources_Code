package com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatarpowerup;

import X.0S2;
import X.11T;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1HG;
import X.1Lm;
import X.7zM;
import X.7zT;
import X.AbR;
import X.C00m;
import X.C0ty;
import X.C9gP;
import X.I8b;
import X.IXr;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView;

/* loaded from: AvatarPowerUpSuggestedRow.class */
public final class AvatarPowerUpSuggestedRow {
    public ThreadKey A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final EditText A04;
    public final LifecycleOwner A05;
    public final FbUserSession A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final LithoView A0E;
    public final C9gP A0F;
    public final I8b A0G;
    public final SuggestedRowTitleView A0H;
    public final C00m A0I;

    /* JADX WARN: Type inference failed for: r0v28, types: [android.widget.TextView, com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView] */
    public AvatarPowerUpSuggestedRow(Context context, EditText editText, LifecycleOwner lifecycleOwner, FbUserSession fbUserSession, I8b i8b, C00m c00m) {
        7zT.A1W(context, fbUserSession, lifecycleOwner, i8b);
        11T.A0F(c00m, 5);
        this.A06 = fbUserSession;
        this.A05 = lifecycleOwner;
        this.A0G = i8b;
        this.A0I = c00m;
        this.A04 = editText;
        this.A0D = 1Lm.A00(context, fbUserSession, 116050);
        this.A0C = 1HG.A00(context, 65898);
        this.A0B = 1Bq.A00(85048);
        this.A09 = 1Lm.A00(context, fbUserSession, 67795);
        this.A07 = 1Lm.A00(context, fbUserSession, 66197);
        this.A08 = 1Bq.A00(67960);
        this.A0A = 7zM.A0X();
        ?? suggestedRowTitleView = new SuggestedRowTitleView(context, null, 0);
        suggestedRowTitleView.setText(context.getText(2131953117));
        this.A0H = suggestedRowTitleView;
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        this.A0E = lithoView;
        C9gP A0l = ((AbR) 1Bn.A0A(1142)).A0l(0S2.A01);
        this.A0F = A0l;
        C0ty c0ty = C0ty.A00;
        IXr iXr = new IXr(this);
        11T.A0F(c0ty, 1);
        A0l.A00 = lithoView;
        A0l.A04 = c0ty;
        A0l.A02 = iXr;
        C9gP.A00(A0l);
        this.A0H.setVisibility(8);
        this.A0E.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r304 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatarpowerup.AvatarPowerUpSuggestedRow r301) {
        /*
            Method dump skipped, instructions count: 198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatarpowerup.AvatarPowerUpSuggestedRow.A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.avatarpowerup.AvatarPowerUpSuggestedRow):void");
    }
}
