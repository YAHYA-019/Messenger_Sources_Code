package com.facebook.messaging.professionalservices.booking.ui;

import X.1BQ;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1JF;
import X.2MR;
import X.2Me;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbR;
import X.BmM;
import X.C00i;
import X.C09s;
import X.C1uu;
import X.C63p;
import X.C9S;
import X.DEL;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.fbui.widget.layout.ImageBlockLayout;
import com.facebook.widget.CustomLinearLayout;
import java.util.TimeZone;

/* loaded from: BookingAttachmentLinearLayout.class */
public class BookingAttachmentLinearLayout extends CustomLinearLayout {
    public LayoutInflater A00;
    public ViewerContext A01;
    public ImageBlockLayout A02;
    public AbR A03;
    public C00i A04;
    public DEL A05;
    public BmM A06;
    public C63p A07;
    public C9S A08;
    public TimeZone A09;
    public C00i A0A;

    public BookingAttachmentLinearLayout(Context context) {
        super(context);
        this.A09 = TimeZone.getDefault();
        A01();
    }

    public BookingAttachmentLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A09 = TimeZone.getDefault();
        A01();
    }

    public BookingAttachmentLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A09 = TimeZone.getDefault();
        A01();
    }

    public static View A00(BookingAttachmentLinearLayout bookingAttachmentLinearLayout, String str, String str2, String str3, int i) {
        int i2 = 0;
        View inflate = bookingAttachmentLinearLayout.A00.inflate(2132541513, (ViewGroup) bookingAttachmentLinearLayout, false);
        ImageView imageView = (ImageView) inflate.findViewById(2131362072);
        TextView A06 = AbF.A06(inflate, 2131362075);
        TextView A062 = AbF.A06(inflate, 2131362074);
        TextView A063 = AbF.A06(inflate, 2131362073);
        Context context = bookingAttachmentLinearLayout.getContext();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(2132279298);
        imageView.setImageDrawable(((C1uu) bookingAttachmentLinearLayout.A0A.get()).A01(i, 2Me.A02.A03(context, 2MR.A28)));
        imageView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        A06.setText(str);
        A062.setText(str2);
        if (str3 == null) {
            i2 = 8;
        }
        A063.setVisibility(i2);
        A063.setText(str3);
        bookingAttachmentLinearLayout.addView(inflate);
        return inflate;
    }

    private void A01() {
        this.A0A = 1BQ.A02(66388);
        this.A04 = AbH.A0a();
        Context context = getContext();
        this.A03 = AbF.A0O(context, 791);
        this.A01 = (ViewerContext) 1Bn.A0E(context, (1BY) null, 83431);
        this.A08 = (C9S) 1Bn.A0E(context, (1BY) null, 83348);
        this.A07 = (C63p) 1Bi.A03(85240);
        A0D(2132541596);
        this.A00 = LayoutInflater.from(context);
        this.A02 = (ImageBlockLayout) C09s.A01(this, 2131365613);
    }

    public static void A02(View view, int i) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), view.getPaddingBottom() + i);
    }

    public static void A03(BookingAttachmentLinearLayout bookingAttachmentLinearLayout, String str, String str2) {
        if (1JF.A0B(str2)) {
            return;
        }
        bookingAttachmentLinearLayout.A00.inflate(2132541594, (ViewGroup) bookingAttachmentLinearLayout, true);
        View A08 = AbG.A08(bookingAttachmentLinearLayout.A00, bookingAttachmentLinearLayout, 2132541597);
        AbF.A06(A08, 2131367039).setText(str);
        AbF.A06(A08, 2131367040).setText(str2);
        bookingAttachmentLinearLayout.addView(A08);
    }
}
