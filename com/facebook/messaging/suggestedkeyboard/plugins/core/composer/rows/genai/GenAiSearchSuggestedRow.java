package com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai;

import X.0S2;
import X.11T;
import X.1BL;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.2OB;
import X.7zM;
import X.DKG;
import X.HBG;
import X.Hve;
import X.I8b;
import X.IFE;
import X.IJ7;
import X.IKB;
import X.IgZ;
import X.Ih4;
import X.Ih7;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.facebook.resources.ui.FbTextView;
import com.facebook.xapp.messaging.capability.vector.Capabilities;

/* loaded from: GenAiSearchSuggestedRow.class */
public final class GenAiSearchSuggestedRow {
    public int A00;
    public ThreadKey A01;
    public MigColorScheme A02;
    public Capabilities A03;
    public Integer A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public final ViewGroup A08;
    public final ViewStub A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final Ih4 A0D;
    public final IgZ A0E;
    public final FbTextView A0F;
    public final FbTextView A0G;
    public final IFE A0H;
    public final Ih7 A0I;

    /* JADX WARN: Type inference failed for: r0v39, types: [android.view.View, com.facebook.resources.ui.FbTextView] */
    public GenAiSearchSuggestedRow(Context context, EditText editText, FbUserSession fbUserSession, I8b i8b) {
        1BL.A1H(context, fbUserSession, i8b);
        this.A0C = 1Lm.A00(context, fbUserSession, 116051);
        this.A0B = 1Bq.A00(68416);
        this.A0A = 1Bu.A00(115713);
        this.A00 = -1;
        this.A02 = LightColorScheme.A00();
        this.A04 = 0S2.A00;
        this.A0E = new IgZ(this, 1);
        Ih4 ih4 = new Ih4(editText, i8b, this);
        this.A0D = ih4;
        Ih7 ih7 = new Ih7(i8b, this);
        this.A0I = ih7;
        View inflate = LayoutInflater.from(context).inflate(2132543413, (ViewGroup) null);
        11T.A0I(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup = (ViewGroup) inflate;
        this.A08 = viewGroup;
        this.A0F = (FbTextView) 7zM.A0H(viewGroup, 2131364303);
        ?? r0 = (FbTextView) 7zM.A0H(viewGroup, 2131364304);
        this.A0G = r0;
        View inflate2 = LayoutInflater.from(context).inflate(2132543415, (ViewGroup) null);
        11T.A0I(inflate2, "null cannot be cast to non-null type android.view.ViewStub");
        ViewStub viewStub = (ViewStub) inflate2;
        this.A09 = viewStub;
        1Bn.A0A(115721);
        this.A0H = Hve.A00(viewStub, editText, ih4, ih7, HBG.A03);
        if (editText != null) {
            IJ7.A00(editText, this, 4);
        }
        IKB.A00((View) r0, this, 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0089, code lost:
    
        if (X.GOq.A1Y((X.AnonymousClass842) r0.get()) == false) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow r301) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow.A00(com.facebook.messaging.suggestedkeyboard.plugins.core.composer.rows.genai.GenAiSearchSuggestedRow):void");
    }

    public static final void A01(GenAiSearchSuggestedRow genAiSearchSuggestedRow, Integer num) {
        if (genAiSearchSuggestedRow.A04 == num || !genAiSearchSuggestedRow.A06) {
            return;
        }
        genAiSearchSuggestedRow.A04 = num;
        2OB r0 = genAiSearchSuggestedRow.A0G;
        int i = 0;
        if (num == 0S2.A00) {
            i = 8;
        }
        r0.setVisibility(i);
        Integer num2 = genAiSearchSuggestedRow.A04;
        Integer num3 = 0S2.A0C;
        MigColorScheme migColorScheme = genAiSearchSuggestedRow.A02;
        r0.setTextColor(num2 == num3 ? migColorScheme.B4d() : migColorScheme.B9Q());
    }

    public static final void A02(GenAiSearchSuggestedRow genAiSearchSuggestedRow, boolean z) {
        int i = 0;
        genAiSearchSuggestedRow.A08.setVisibility(DKG.A00(z ? 1 : 0));
        ViewStub viewStub = genAiSearchSuggestedRow.A09;
        if (!z) {
            i = 8;
        }
        viewStub.setVisibility(i);
    }
}
