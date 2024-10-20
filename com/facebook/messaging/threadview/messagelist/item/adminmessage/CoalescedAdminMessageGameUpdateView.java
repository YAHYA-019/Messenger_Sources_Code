package com.facebook.messaging.threadview.messagelist.item.adminmessage;

import X.0FI;
import X.1BK;
import X.1Hv;
import X.6Fc;
import X.7zL;
import X.C00i;
import X.C09s;
import X.C53;
import X.C62i;
import X.C62n;
import X.C6eZ;
import X.DKC;
import X.DKG;
import X.DOB;
import X.DOD;
import X.FjP;
import X.Fjy;
import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.drawee.fbpipeline.FbDraweeView;
import com.facebook.fbui.widget.text.ImageWithTextView;
import com.facebook.widget.CustomLinearLayout;
import com.facebook.widget.text.BetterTextView;

/* loaded from: CoalescedAdminMessageGameUpdateView.class */
public class CoalescedAdminMessageGameUpdateView extends CustomLinearLayout implements CallerContextable {
    public static final CallerContext A0C = CallerContext.A06(CoalescedAdminMessageGameUpdateView.class);
    public LinearLayout A00;
    public FbDraweeView A01;
    public ImageWithTextView A02;
    public C00i A03;
    public C53 A04;
    public C6eZ A05;
    public 6Fc A06;
    public Fjy A07;
    public BetterTextView A08;
    public BetterTextView A09;
    public final C62n A0A;
    public final C62i A0B;

    public CoalescedAdminMessageGameUpdateView(Context context) {
        this(context, null, 0);
    }

    public CoalescedAdminMessageGameUpdateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CoalescedAdminMessageGameUpdateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        FjP fjP = new FjP(this, 1);
        this.A0B = fjP;
        this.A0A = new C62n(fjP, null);
        Context context2 = getContext();
        this.A04 = (C53) 1Hv.A02(context2, 83530);
        this.A03 = 7zL.A0R(context2, 84968);
        this.A05 = (C6eZ) 1Hv.A02(context2, 84358);
        setGravity(1);
        A0D(2132542914);
        this.A02 = (ImageWithTextView) C09s.A01(this, 2131363068);
        this.A00 = (LinearLayout) C09s.A01(this, 2131363071);
        this.A01 = DKC.A0M(this, 2131363067);
        this.A08 = DKC.A0g(this, 2131363070);
        this.A09 = DKC.A0g(this, 2131363069);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.widget.TextView, android.view.View, com.facebook.fbui.widget.text.ImageWithTextView] */
    public static void A00(FbUserSession fbUserSession, CoalescedAdminMessageGameUpdateView coalescedAdminMessageGameUpdateView) {
        if (coalescedAdminMessageGameUpdateView.A07 != null) {
            ?? r0 = coalescedAdminMessageGameUpdateView.A02;
            r0.setVisibility(8);
            coalescedAdminMessageGameUpdateView.A00.setVisibility(8);
            SpannableString spannableString = new SpannableString(coalescedAdminMessageGameUpdateView.A07.A00.A09);
            Resources resources = coalescedAdminMessageGameUpdateView.getResources();
            String string = resources.getString(2131954265, DKG.A1b(spannableString, 1BK.A0k(coalescedAdminMessageGameUpdateView.A07.A02.A00)));
            int indexOf = string.indexOf(spannableString.toString());
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
            spannableStringBuilder.setSpan(new DOB(coalescedAdminMessageGameUpdateView, 5), indexOf, spannableString.length() + indexOf, 34);
            spannableStringBuilder.append((CharSequence) " ");
            int i = 2131954267;
            if (coalescedAdminMessageGameUpdateView.A07.A03) {
                i = 2131954266;
            }
            SpannableString spannableString2 = new SpannableString(resources.getString(i));
            spannableString2.setSpan(new DOD(coalescedAdminMessageGameUpdateView, fbUserSession, 5), 0, spannableString2.length(), 34);
            spannableStringBuilder.append((CharSequence) spannableString2);
            r0.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
            DKC.A1N(r0.A05, coalescedAdminMessageGameUpdateView.getContext().getColor(2132213810));
            float f = 0.7f;
            double d = 1.0f / r0.A03;
            double abs = Math.abs(0.699999988079071d - 1.0d);
            if (abs < d) {
                f = 1.0f;
            }
            if (Float.compare(r0.A00, f) != 0) {
                r0.A00 = f;
                r0.invalidate();
            }
            float f2 = 0.7f;
            if (abs < 1.0f / r0.A02) {
                f2 = 1.0f;
            }
            if (Float.compare(r0.A01, f2) != 0) {
                r0.A01 = f2;
                r0.invalidate();
            }
            DKC.A1P((TextView) r0);
            r0.setVisibility(0);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        int A06 = 0FI.A06(-877931617);
        super.onAttachedToWindow();
        this.A0A.A00();
        0FI.A0C(-964754492, A06);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        int A06 = 0FI.A06(864661670);
        super.onDetachedFromWindow();
        this.A0A.A01();
        0FI.A0C(841203129, A06);
    }
}
