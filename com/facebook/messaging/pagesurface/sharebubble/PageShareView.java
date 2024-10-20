package com.facebook.messaging.pagesurface.sharebubble;

import X.11T;
import X.1BJ;
import X.1BK;
import X.1Br;
import X.1Bu;
import X.2Wo;
import X.6Ay;
import X.7Wh;
import X.AbG;
import X.C09s;
import X.CwV;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import com.facebook.android.maps.StaticMapView$StaticMapOptions;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbui.widget.glyph.GlyphView;
import com.facebook.litho.LithoView;
import com.facebook.messaging.business.common.calltoaction.CallToActionContainerView;
import com.facebook.messaging.xma.ui.XMALinearLayout;
import com.facebook.widget.text.BetterTextView;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: PageShareView.class */
public final class PageShareView extends XMALinearLayout implements CallerContextable {
    public 6Ay A00;
    public final StaticMapView$StaticMapOptions A01;
    public final FbDraweeView A02;
    public final FbDraweeView A03;
    public final GlyphView A04;
    public final GlyphView A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final LithoView A09;
    public final CallToActionContainerView A0A;
    public final 2Wo A0B;
    public final BetterTextView A0C;
    public final BetterTextView A0D;
    public final BetterTextView A0E;
    public final BetterTextView A0F;
    public final BetterTextView A0G;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PageShareView(Context context) {
        this(context, null, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PageShareView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        11T.A0F(context, 1);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PageShareView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        11T.A0F(context, 1);
        this.A06 = AbG.A0L();
        this.A08 = 1Bu.A00(84867);
        this.A07 = 1BK.A0C();
        this.A01 = new StaticMapView$StaticMapOptions("page_share_attachment");
        A0D(2132543008);
        setOrientation(1);
        this.A02 = (FbDraweeView) C09s.A01(this, 2131366237);
        this.A03 = (FbDraweeView) C09s.A01(this, 2131366263);
        this.A09 = (LithoView) C09s.A01(this, 2131366267);
        this.A0E = (BetterTextView) C09s.A01(this, 2131366259);
        this.A05 = (GlyphView) C09s.A01(this, 2131368328);
        this.A0G = (BetterTextView) C09s.A01(this, 2131366266);
        this.A04 = (GlyphView) C09s.A01(this, 2131366265);
        this.A0F = (BetterTextView) C09s.A01(this, 2131366264);
        this.A0C = (BetterTextView) C09s.A01(this, 2131366236);
        this.A0D = (BetterTextView) C09s.A01(this, 2131366258);
        this.A0A = (CallToActionContainerView) C09s.A01(this, 2131366268);
        View A01 = C09s.A01(this, 2131366270);
        11T.A0I(A01, 1BJ.A00(14));
        this.A0B = 2Wo.A00((ViewStub) A01);
    }

    public /* synthetic */ PageShareView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // com.facebook.messaging.xma.ui.XMALinearLayout
    public void A0F(7Wh r302) {
        this.A0A.Cwl(r302 != null ? new CwV(this, r302) : null);
    }
}
