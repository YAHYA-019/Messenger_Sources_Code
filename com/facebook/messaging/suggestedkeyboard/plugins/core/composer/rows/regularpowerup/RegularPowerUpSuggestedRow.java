package com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.regularpowerup;

import X.0S2;
import X.1BL;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1HG;
import X.1Lm;
import X.5aU;
import X.7zM;
import X.7zT;
import X.9XM;
import X.9Xd;
import X.AbR;
import X.C00m;
import X.C9gP;
import X.I8b;
import X.IXs;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: RegularPowerUpSuggestedRow.class */
public final class RegularPowerUpSuggestedRow {
    public ThreadKey A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final EditText A04;
    public final FbUserSession A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final LithoView A0B;
    public final C9gP A0C;
    public final I8b A0D;
    public final SuggestedRowTitleView A0E;
    public final C00m A0F;

    /* JADX WARN: Type inference failed for: r0v20, types: [android.widget.TextView, com.facebook.messaging.suggestedkeyboard.plugins.core.composer.views.SuggestedRowTitleView] */
    public RegularPowerUpSuggestedRow(Context context, EditText editText, FbUserSession fbUserSession, I8b i8b, C00m c00m) {
        7zT.A1W(context, fbUserSession, i8b, c00m);
        this.A05 = fbUserSession;
        this.A0D = i8b;
        this.A0F = c00m;
        this.A04 = editText;
        this.A0A = 1Lm.A00(context, fbUserSession, 116050);
        this.A09 = 1HG.A00(context, 65898);
        this.A08 = 1Bq.A00(85048);
        this.A06 = 1Bu.A00(67781);
        this.A07 = 7zM.A0X();
        ?? suggestedRowTitleView = new SuggestedRowTitleView(context, null, 0);
        suggestedRowTitleView.setText(context.getText(2131965712));
        this.A0E = suggestedRowTitleView;
        LithoView lithoView = new LithoView(context, (AttributeSet) null);
        this.A0B = lithoView;
        AbR abR = (AbR) 1Bn.A0A(1142);
        9XM r0 = (9XM) 1Bn.A0A(68146);
        C9gP A0l = abR.A0l(0S2.A00);
        this.A0C = A0l;
        List A00 = r0.A00();
        ArrayList A0z = 1BL.A0z(A00);
        Iterator it = A00.iterator();
        while (it.hasNext()) {
            A0z.add(new 9Xd((5aU) it.next()));
        }
        IXs iXs = new IXs(this);
        A0l.A00 = lithoView;
        A0l.A04 = A0z;
        A0l.A02 = iXs;
        C9gP.A00(A0l);
        this.A0E.setVisibility(8);
        this.A0B.setVisibility(8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c0, code lost:
    
        if (((X.AnonymousClass610) X.1Br.A0B(r301.A06)).A02() == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0025, code lost:
    
        if (r304 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.regularpowerup.RegularPowerUpSuggestedRow r301) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.regularpowerup.RegularPowerUpSuggestedRow.A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.regularpowerup.RegularPowerUpSuggestedRow):void");
    }
}
