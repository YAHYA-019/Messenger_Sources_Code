package com.facebook.messaging.montage.viewer.reaction;

import X.1BQ;
import X.1Bn;
import X.AbL;
import X.AbR;
import X.C00i;
import X.C09s;
import X.C1u3;
import X.DKC;
import X.GOn;
import X.GOo;
import X.Hb2;
import X.Hg9;
import X.IXR;
import X.IlM;
import android.content.Context;
import android.util.AttributeSet;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.inject.FbInjector;
import com.facebook.resources.ui.FbTextView;
import com.facebook.user.tiles.UserTileView;
import com.facebook.widget.CustomFrameLayout;

/* loaded from: MontageViewerReactionsComposerView.class */
public class MontageViewerReactionsComposerView extends CustomFrameLayout {
    public C00i A00;
    public IXR A01;
    public AbR A02;
    public final Hb2 A03;
    public final MontageViewerReactionsComposerScrollView A04;
    public final Hg9 A05;
    public final FbTextView A06;
    public final UserTileView A07;

    public MontageViewerReactionsComposerView(Context context) {
        this(context, null);
    }

    public MontageViewerReactionsComposerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MontageViewerReactionsComposerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A02 = DKC.A0U(608);
        this.A00 = 1BQ.A02(66067);
        A0U(2132542747);
        setClipChildren(false);
        this.A06 = GOo.A0X(this, 2131366815);
        this.A07 = (UserTileView) C09s.A01(this, 2131368305);
        this.A03 = new Hb2();
        AbR abR = this.A02;
        GlyphView glyphView = (GlyphView) C09s.A01(this, 2131362838);
        FbTextView A0X = GOo.A0X(this, 2131367959);
        Context A01 = FbInjector.A01();
        AbL.A0y(abR);
        try {
            Hg9 hg9 = new Hg9(glyphView, A0X);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A05 = hg9;
            GlyphView glyphView2 = hg9.A00;
            GOn.A1P(glyphView2, C1u3.A1K, GOn.A0M(hg9.A02));
            glyphView2.setVisibility(8);
            hg9.A03.setText(2131960788);
            MontageViewerReactionsComposerScrollView montageViewerReactionsComposerScrollView = (MontageViewerReactionsComposerScrollView) C09s.A01(this, 2131367120);
            this.A04 = montageViewerReactionsComposerScrollView;
            montageViewerReactionsComposerScrollView.A0A.A00.add(new IlM(this));
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    @Override // android.view.View
    public void scrollTo(int i, int i2) {
        this.A04.scrollTo(i, i2);
        super.scrollTo(i, i2);
    }
}
