package com.facebook.rapidreporting.ui.friendselector;

import X.1BJ;
import X.1BK;
import X.1BY;
import X.1Bn;
import X.1Ho;
import X.AbH;
import X.AbstractC1365Af8;
import X.Br8;
import X.C0A2;
import X.C5fi;
import X.DKH;
import X.DQX;
import X.GDN;
import X.GGN;
import X.Q1V;
import X.RK4;
import android.content.Context;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbservice.ops.BlueServiceOperationFactory;
import com.facebook.resources.ui.FbAutoCompleteTextView;
import com.facebook.user.model.User;

/* loaded from: FRXFriendsAutoCompleteView.class */
public class FRXFriendsAutoCompleteView extends FbAutoCompleteTextView implements CallerContextable {
    public BlueServiceOperationFactory A00;
    public GGN A01;
    public GDN A02;
    public User A03;
    public Br8 A04;
    public User A05;

    public FRXFriendsAutoCompleteView(Context context) {
        super(context);
        A01();
    }

    public FRXFriendsAutoCompleteView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A01();
    }

    public FRXFriendsAutoCompleteView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A01();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A01() {
        Context context = getContext();
        this.A04 = (Br8) 1Bn.A0E(context, (1BY) null, 84826);
        BlueServiceOperationFactory blueServiceOperationFactory = (BlueServiceOperationFactory) 1Bn.A0E(context, (1BY) null, 33031);
        this.A00 = blueServiceOperationFactory;
        1Ho.A00(blueServiceOperationFactory.newInstance_DEPRECATED(1BJ.A00(561), 1BK.A05(), 1, AbH.A0B(this)), true);
        setInputType(getInputType() & (-65537));
        setAdapter((AbstractC1365Af8) this.A04.A01.get());
        setThreshold(3);
        setSingleLine(true);
    }

    public CharSequence convertSelectionToString(Object obj) {
        User user = (User) obj;
        this.A05 = user;
        return user.A0X.A00();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onEditorAction(int i) {
        if (i == 6) {
            C5fi.A01(this);
            if (this.A03 == null) {
                getEditableText().clear();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0065, code lost:
    
        if (r0.A07 == false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v28, types: [android.widget.TextView, com.facebook.rapidreporting.ui.friendselector.FRXFriendsAutoCompleteView] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onFocusChanged(boolean r302, int r303, android.graphics.Rect r304) {
        /*
            r301 = this;
            r0 = 2016868946(0x7836fa52, float:1.4844924E34)
            r305 = r0
            r0 = r305
            int r0 = X.0FI.A06(r0)
            r306 = r0
            r0 = r301
            r1 = r302
            r2 = r303
            r3 = r304
            super/*android.widget.AutoCompleteTextView*/.onFocusChanged(r1, r2, r3)
            r0 = r301
            X.GDN r0 = r0.A02
            r307 = r0
            r0 = r307
            if (r0 == 0) goto Lc0
            r0 = r307
            X.DQX r0 = (X.DQX) r0
            r307 = r0
            r0 = r307
            android.view.View r0 = r0.A00
            r308 = r0
            r0 = r307
            android.content.Context r0 = r0.getContext()
            r309 = r0
            r0 = r302
            if (r0 == 0) goto Lc8
            X.2MR r0 = X.2MR.A0H
            r310 = r0
            r0 = r309
            r1 = r310
            int r0 = X.7zM.A02(r0, r1)
            r305 = r0
        L44:
            r0 = r308
            r1 = r305
            X.AbH.A1K(r0, r1)
            r0 = r307
            com.facebook.fbui.widget.glyph.GlyphButton r0 = r0.A03
            r308 = r0
            r0 = r302
            if (r0 != 0) goto L68
            r0 = r307
            boolean r0 = r0.A07
            r311 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r310 = r0
            r0 = r311
            if (r0 != 0) goto L6c
        L68:
            r0 = 8
            r305 = r0
        L6c:
            r0 = r308
            r1 = r305
            r0.setVisibility(r1)
            r0 = r302
            if (r0 == 0) goto Lc0
            r0 = r307
            boolean r0 = r0.A07
            r305 = r0
            r0 = r305
            if (r0 == 0) goto Lc0
            r0 = r307
            com.facebook.rapidreporting.ui.friendselector.FRXFriendsAutoCompleteView r0 = r0.A06
            r309 = r0
            r0 = r309
            com.facebook.user.model.User r0 = r0.A03
            r310 = r0
            r0 = r310
            if (r0 == 0) goto La9
            r0 = r309
            X.GGN r0 = r0.A01
            r310 = r0
            r0 = r310
            if (r0 == 0) goto La9
            r0 = r310
            r0.Bzs()
        La9:
            r0 = 0
            r305 = r0
            r0 = r309
            r1 = 0
            r0.A03 = r1
            r0 = r309
            android.text.Editable r0 = r0.getEditableText()
            r310 = r0
            r0 = r310
            r0.clear()
        Lc0:
            r0 = 1189359652(0x46e43024, float:29208.07)
            r1 = r306
            X.0FI.A0C(r0, r1)
            return
        Lc8:
            r0 = r309
            r1 = 2132214112(0x7f170160, float:2.0072057E38)
            int r0 = r0.getColor(r1)
            r305 = r0
            goto L44
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.rapidreporting.ui.friendselector.FRXFriendsAutoCompleteView.onFocusChanged(boolean, int, android.graphics.Rect):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4 && this.A03 == null) {
            getEditableText().clear();
        }
        return super/*android.widget.AutoCompleteTextView*/.onKeyPreIme(i, keyEvent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void performFiltering(CharSequence charSequence, int i) {
        Editable editableText = getEditableText();
        Br8 br8 = this.A04;
        br8.A02.filter(editableText, null);
        setAdapter((AbstractC1365Af8) br8.A01.get());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void replaceText(CharSequence charSequence) {
        User user = this.A05;
        this.A03 = user;
        DQX dqx = this.A01;
        if (dqx != null) {
            DQX dqx2 = dqx;
            dqx2.A02.setVisibility(0);
            dqx2.A04.setVisibility(4);
            dqx2.A02.A0G(C0A2.A03(user.A07()), DQX.A09);
            RK4 rk4 = dqx2.A05;
            if (rk4 != null) {
                String str = user.A13;
                Q1V q1v = rk4.A01;
                DKH.A1R("frx_tag_selection_screen");
                rk4.A00.A03 = str;
                Q1V.A00(q1v);
            }
            dqx2.A03.setVisibility(0);
            dqx2.A07 = true;
        }
        getEditableText().replace(0, getEditableText().length(), charSequence);
        C5fi.A01(this);
    }
}
