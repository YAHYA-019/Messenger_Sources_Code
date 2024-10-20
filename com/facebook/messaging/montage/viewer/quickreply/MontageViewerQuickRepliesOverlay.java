package com.facebook.messaging.montage.viewer.quickreply;

import X.11T;
import X.1Br;
import X.1CO;
import X.2OB;
import X.4YV;
import X.7zM;
import X.7zQ;
import X.8fJ;
import X.C00i;
import X.C1u2;
import X.C1u3;
import X.DKF;
import X.DKG;
import X.GOn;
import X.GOo;
import X.IKE;
import X.JAL;
import X.JAM;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.facebook.acra.constants.ActionId;
import com.facebook.fbui.widget.glyph.GlyphButton;
import com.facebook.litho.LithoView;
import com.facebook.messaging.montage.viewer.contextualreplies.MontageViewerContextualRepliesView;
import com.facebook.resources.ui.FbFrameLayout;
import com.facebook.ui.compat.fbrelativelayout.FbRelativeLayout;
import com.facebook.widget.text.BetterTextView;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: MontageViewerQuickRepliesOverlay.class */
public final class MontageViewerQuickRepliesOverlay extends FbFrameLayout {
    public Function1 A00;
    public Function1 A01;
    public boolean A02;
    public boolean A03;
    public final GlyphButton A04;
    public final GlyphButton A05;
    public final GlyphButton A06;
    public final 1Br A07;
    public final LithoView A08;
    public final LithoView A09;
    public final LithoView A0A;
    public final LithoView A0B;
    public final MontageViewerContextualRepliesView A0C;
    public final MontageViewerContextualRepliesView A0D;
    public final 1CO A0E;
    public final FbRelativeLayout A0F;
    public final BetterTextView A0G;
    public final BetterTextView A0H;
    public final boolean A0I;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageViewerQuickRepliesOverlay(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MontageViewerQuickRepliesOverlay(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v61, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r0v65, types: [com.facebook.widget.text.BetterTextView, android.view.View] */
    public MontageViewerQuickRepliesOverlay(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A07 = GOn.A0R(context);
        1CO r0 = (1CO) 7zM.A0N().get();
        this.A0E = r0;
        boolean AZk = r0.AZk(72341298102735428L);
        this.A0I = AZk;
        this.A00 = JAL.A00;
        this.A01 = JAM.A00;
        View.inflate(context, 2132542620, this);
        this.A08 = (LithoView) 7zM.A0H(this, 2131362322);
        this.A09 = (LithoView) 7zM.A0H(this, 2131362323);
        this.A0A = (LithoView) 7zM.A0H(this, 2131363865);
        this.A0B = (LithoView) 7zM.A0H(this, 2131363866);
        this.A0C = (MontageViewerContextualRepliesView) 7zM.A0H(this, 2131363360);
        this.A0D = (MontageViewerContextualRepliesView) 7zM.A0H(this, 2131363361);
        this.A0F = (FbRelativeLayout) 7zM.A0H(this, 2131365808);
        GlyphButton glyphButton = (GlyphButton) 7zM.A0H(this, 2131367526);
        this.A06 = glyphButton;
        GlyphButton glyphButton2 = (GlyphButton) 7zM.A0H(this, 2131362307);
        this.A04 = glyphButton2;
        GlyphButton glyphButton3 = (GlyphButton) 7zM.A0H(this, 2131363854);
        this.A05 = glyphButton3;
        ?? r02 = (BetterTextView) 7zM.A0H(this, 2131362321);
        this.A0G = r02;
        ?? r03 = (BetterTextView) 7zM.A0H(this, 2131363864);
        this.A0H = r03;
        this.A02 = false;
        this.A03 = false;
        if (AZk) {
            findViewById(2131368236).setVisibility(8);
            C1u2 A0I = 4YV.A0I();
            GOo.A1E(glyphButton, C1u3.A6V, A0I, 7zQ.A0m(this.A07).BKh());
            GOo.A1E(glyphButton3, C1u3.A2j, A0I, 7zQ.A0m(this.A07).AqM());
            GOo.A1E(glyphButton2, C1u3.A0f, A0I, 7zQ.A0m(this.A07).AqM());
            A05(this);
            IKE.A01(glyphButton, this, ActionId.DATA_LOAD_START);
            IKE.A01(glyphButton3, this, ActionId.LEGACY_MARKER);
            IKE.A01(glyphButton2, this, ActionId.ACTION_BAR_COMPLETE);
        } else {
            findViewById(2131368035).setVisibility(8);
            A04(this);
            IKE.A01((View) r02, this, ActionId.ABORTED);
            IKE.A01((View) r03, this, ActionId.QUERY_READY);
        }
        this.A0F.setVisibility(8);
    }

    public /* synthetic */ MontageViewerQuickRepliesOverlay(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, DKG.A0A(attributeSet, i2), DKF.A01(i2, i));
    }

    public static final void A00(GlyphButton glyphButton, MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay) {
        glyphButton.setBackgroundResource(2132411204);
        glyphButton.A02(7zQ.A0m(montageViewerQuickRepliesOverlay.A07).BKh());
    }

    public static final void A01(GlyphButton glyphButton, MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay) {
        glyphButton.A02(7zQ.A0m(montageViewerQuickRepliesOverlay.A07).AqM());
        glyphButton.setBackground(null);
    }

    public static final void A02(LithoView lithoView, MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay, List list) {
        lithoView.A0y(new 8fJ(list, montageViewerQuickRepliesOverlay.A00));
    }

    public static final void A03(MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay) {
        A06(montageViewerQuickRepliesOverlay, 8);
        montageViewerQuickRepliesOverlay.A0A.setVisibility(0);
        montageViewerQuickRepliesOverlay.A0B.setVisibility(0);
        montageViewerQuickRepliesOverlay.A0C.setVisibility(8);
        montageViewerQuickRepliesOverlay.A0D.setVisibility(8);
        A00(montageViewerQuickRepliesOverlay.A05, montageViewerQuickRepliesOverlay);
        A01(montageViewerQuickRepliesOverlay.A06, montageViewerQuickRepliesOverlay);
        A01(montageViewerQuickRepliesOverlay.A04, montageViewerQuickRepliesOverlay);
    }

    public static final void A04(MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay) {
        A06(montageViewerQuickRepliesOverlay, 8);
        montageViewerQuickRepliesOverlay.A0A.setVisibility(0);
        montageViewerQuickRepliesOverlay.A0B.setVisibility(0);
        2OB r0 = montageViewerQuickRepliesOverlay.A0H;
        r0.setBackgroundResource(2132411204);
        C00i c00i = montageViewerQuickRepliesOverlay.A07.A00;
        r0.setTextColor(7zM.A11(c00i).BKh());
        2OB r02 = montageViewerQuickRepliesOverlay.A0G;
        r02.setTextColor(7zM.A11(c00i).AqM());
        r02.setBackground(null);
    }

    public static final void A05(MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay) {
        A06(montageViewerQuickRepliesOverlay, 8);
        montageViewerQuickRepliesOverlay.A0A.setVisibility(8);
        montageViewerQuickRepliesOverlay.A0B.setVisibility(8);
        if (montageViewerQuickRepliesOverlay.A03) {
            montageViewerQuickRepliesOverlay.A0C.setVisibility(0);
            montageViewerQuickRepliesOverlay.A0D.setVisibility(0);
        }
        A00(montageViewerQuickRepliesOverlay.A06, montageViewerQuickRepliesOverlay);
        A01(montageViewerQuickRepliesOverlay.A05, montageViewerQuickRepliesOverlay);
        A01(montageViewerQuickRepliesOverlay.A04, montageViewerQuickRepliesOverlay);
    }

    public static final void A06(MontageViewerQuickRepliesOverlay montageViewerQuickRepliesOverlay, int i) {
        if (i != 0 || montageViewerQuickRepliesOverlay.A02) {
            montageViewerQuickRepliesOverlay.A08.setVisibility(i);
            montageViewerQuickRepliesOverlay.A09.setVisibility(i);
        }
    }
}
