package com.facebook.messaging.rtc.incall.impl.widgets;

import X.11T;
import X.1Br;
import X.1Bu;
import X.1Lm;
import X.4YU;
import X.5Zt;
import X.7zM;
import X.7zP;
import X.C1u3;
import X.CPw;
import X.GOn;
import X.GOq;
import X.HVG;
import X.HbZ;
import X.HnK;
import X.IK1;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.resources.ui.FbButton;

/* loaded from: EndedCallButtonsView.class */
public final class EndedCallButtonsView extends LinearLayout {
    public HVG A00;
    public FbButton A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1Br A05;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndedCallButtonsView(Context context) {
        super(context);
        11T.A0F(context, 1);
        this.A02 = 1Bu.A00(68141);
        Context A08 = 4YU.A08(this);
        this.A05 = 1Bu.A01(A08, 16428);
        this.A03 = 7zM.A0U();
        this.A04 = 1Bu.A01(A08, 84855);
        A00(1Br.A03(this.A05), context);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EndedCallButtonsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        11T.A0F(context, 1);
        this.A02 = 1Bu.A00(68141);
        Context A08 = 4YU.A08(this);
        this.A05 = 1Bu.A01(A08, 16428);
        this.A03 = 7zM.A0U();
        this.A04 = 1Bu.A01(A08, 84855);
        A00(1Br.A03(this.A05), context);
    }

    private final void A00(FbUserSession fbUserSession, Context context) {
        LayoutInflater.from(context).inflate(2132541932, this);
        ((HnK) 1Lm.A05(context, fbUserSession, 115649)).A01.add(new HbZ(fbUserSession, this));
        A01(fbUserSession, this);
    }

    public static final void A01(FbUserSession fbUserSession, EndedCallButtonsView endedCallButtonsView) {
        FbButton fbButton = (FbButton) endedCallButtonsView.findViewById(2131361996);
        endedCallButtonsView.A01 = fbButton;
        if (fbButton != null) {
            HnK hnK = (HnK) GOq.A0y(endedCallButtonsView, fbUserSession, 115649);
            if (!hnK.A00 || !5Zt.A00((5Zt) 1Br.A0B(endedCallButtonsView.A02)).AZk(36313939898998039L)) {
                fbButton.setVisibility(8);
                return;
            }
            fbButton.setVisibility(0);
            fbButton.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, CPw.A00(GOn.A0E(endedCallButtonsView), 2132410435, 7zP.A0S(endedCallButtonsView.A03).A03(C1u3.A1y)), (Drawable) null, (Drawable) null);
            fbButton.setOnClickListener(new IK1(6, hnK, endedCallButtonsView, fbUserSession));
        }
    }
}
