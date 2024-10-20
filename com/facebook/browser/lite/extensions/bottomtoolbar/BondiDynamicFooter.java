package com.facebook.browser.lite.extensions.bottomtoolbar;

import X.2MR;
import X.JQx;
import X.LDi;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.Button;
import android.widget.LinearLayout;
import com.facebook.browser.lite.extensions.bondishareablecomponent.businesslogo.BondiBusinessLogoView;
import com.facebook.browser.lite.extensions.bondishareablecomponent.istaticaction.BondiDynamicFooterIStaticActionDisplay;
import com.facebook.fbui.widget.glyph.GlyphButton;
import java.util.Collections;
import java.util.List;

/* loaded from: BondiDynamicFooter.class */
public class BondiDynamicFooter extends LinearLayout {
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public ViewStub A08;
    public BondiBusinessLogoView A09;
    public BondiDynamicFooterIStaticActionDisplay A0A;
    public GlyphButton A0B;
    public List A0C;
    public Button A0D;
    public Button A0E;

    public BondiDynamicFooter(Context context) {
        super(context);
        this.A0C = Collections.emptyList();
        A00(context);
    }

    public BondiDynamicFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A0C = Collections.emptyList();
        A00(context);
    }

    public BondiDynamicFooter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A0C = Collections.emptyList();
        A00(context);
    }

    private void A00(Context context) {
        setVisibility(8);
        View.inflate(context, 2132541585, this);
        View requireViewById = requireViewById(2131362503);
        View requireViewById2 = requireViewById(2131362509);
        this.A09 = (BondiBusinessLogoView) requireViewById(2131362504);
        this.A08 = JQx.A0X(this, 2131362505);
        this.A0A = (BondiDynamicFooterIStaticActionDisplay) requireViewById(2131362508);
        this.A0D = (Button) requireViewById(2131362506);
        this.A0E = (Button) requireViewById(2131362507);
        this.A01 = requireViewById(2131363756);
        this.A02 = requireViewById(2131367556);
        this.A06 = requireViewById(2131367558);
        this.A05 = requireViewById(2131367557);
        this.A0B = (GlyphButton) requireViewById(2131367555);
        this.A03 = requireViewById(2131363758);
        this.A07 = requireViewById(2131363761);
        this.A04 = requireViewById(2131363760);
        Context context2 = getContext();
        requireViewById.setBackgroundColor(LDi.A02(context2).A01(2MR.A19));
        requireViewById2.setBackgroundColor(LDi.A02(context2).A01(2MR.A0p));
    }
}
