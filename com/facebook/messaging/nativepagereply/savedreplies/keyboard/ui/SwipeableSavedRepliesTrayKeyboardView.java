package com.facebook.messaging.nativepagereply.savedreplies.keyboard.ui;

import X.0S2;
import X.4YV;
import X.BIc;
import X.CEq;
import X.COe;
import X.CkT;
import X.CkV;
import X.DF2;
import X.H4B;
import X.RFz;
import X.RNm;
import X.Ra3;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.expandablecomponent.ExpandableBottomSheetContainer;
import com.facebook.messaging.nativepagereply.savedreplies.creation.ui.SwipeableSavedRepliesTrayCreationView;
import com.facebook.messaging.nativepagereply.savedreplies.keyboard.model.SavedRepliesKeyboardOpenParams;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.base.Objects;

/* loaded from: SwipeableSavedRepliesTrayKeyboardView.class */
public class SwipeableSavedRepliesTrayKeyboardView extends H4B {
    public EditText A00;
    public EditText A01;
    public BIc A02;
    public MigColorScheme A03;

    public SwipeableSavedRepliesTrayKeyboardView(Context context) {
        super(context);
        A00(context);
    }

    public SwipeableSavedRepliesTrayKeyboardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A00(context);
    }

    public SwipeableSavedRepliesTrayKeyboardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A00(context);
    }

    private void A00(Context context) {
        BIc bIc = new BIc(context);
        this.A02 = bIc;
        bIc.A09 = new RFz(this);
        View findViewById = bIc.findViewById(2131367092);
        findViewById.getClass();
        this.A00 = (EditText) findViewById;
        View findViewById2 = this.A02.findViewById(2131367093);
        findViewById2.getClass();
        this.A01 = (EditText) findViewById2;
        A0c(this.A02, this.A02.findViewById(2131367810));
        CkT ckT = new CkT(this, 1);
        ExpandableBottomSheetContainer expandableBottomSheetContainer = super.A03;
        if (expandableBottomSheetContainer != null) {
            expandableBottomSheetContainer.A02 = ckT;
        }
    }

    public static void A01(SavedRepliesKeyboardOpenParams savedRepliesKeyboardOpenParams, SwipeableSavedRepliesTrayKeyboardView swipeableSavedRepliesTrayKeyboardView) {
        BIc bIc = swipeableSavedRepliesTrayKeyboardView.A02;
        if (bIc != null) {
            Integer num = savedRepliesKeyboardOpenParams.A00;
            if (num != null) {
                bIc.A0W(num);
            }
            BIc bIc2 = swipeableSavedRepliesTrayKeyboardView.A02;
            String str = savedRepliesKeyboardOpenParams.A01;
            bIc2.A0W(0S2.A01);
            bIc2.A0D = true;
            bIc2.A0V(new CkV(bIc2, (Long) null, (String) null, str, (String) null, (String) null));
        }
    }

    @Override // X.H4B
    public void A0a(float f) {
        super.A0a(f);
        Ra3 ra3 = this.A02.A08.A02;
        if (ra3 != null) {
            Ra3.A00(ra3, (int) ((1.0f - f) * ra3.A00));
        }
    }

    @Override // X.H4B
    public void A0e(DF2 df2, boolean z) {
        super.A0e(df2, z);
        Ra3 ra3 = this.A02.A08.A02;
        if (ra3 != null) {
            ra3.A01(!z);
        }
    }

    @Override // X.H4B
    public void A0f(MigColorScheme migColorScheme) {
        super.A0f(migColorScheme);
        if (Objects.equal(this.A03, migColorScheme)) {
            return;
        }
        this.A03 = migColorScheme;
        BIc bIc = this.A02;
        if (bIc == null || Objects.equal(bIc.A0A, migColorScheme)) {
            return;
        }
        bIc.A0A = migColorScheme;
        CEq cEq = bIc.A07;
        if (cEq != null) {
            FbUserSession A0C = 4YV.A0C(bIc.getContext());
            MigColorScheme migColorScheme2 = bIc.A0A;
            if (!Objects.equal(cEq.A01, migColorScheme2)) {
                cEq.A01 = migColorScheme2;
                CEq.A00(A0C, cEq);
            }
        }
        COe cOe = bIc.A08;
        if (cOe != null) {
            cOe.A04 = bIc.A0A;
            COe.A01(cOe);
        }
        RNm rNm = bIc.A06;
        if (rNm != null) {
            MigColorScheme migColorScheme3 = bIc.A0A;
            if (Objects.equal(rNm.A02, migColorScheme3)) {
                return;
            }
            rNm.A02 = migColorScheme3;
            SwipeableSavedRepliesTrayCreationView swipeableSavedRepliesTrayCreationView = rNm.A01;
            if (swipeableSavedRepliesTrayCreationView == null || Objects.equal(swipeableSavedRepliesTrayCreationView.A09, migColorScheme3)) {
                return;
            }
            swipeableSavedRepliesTrayCreationView.A09 = migColorScheme3;
            SwipeableSavedRepliesTrayCreationView.A01(swipeableSavedRepliesTrayCreationView);
        }
    }

    @Override // X.H4B
    public boolean A0l() {
        return this.A02.A0X();
    }
}
