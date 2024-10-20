package com.facebookpay.form.cell.checkbox;

import X.0CU;
import X.0Q8;
import X.11T;
import X.1BL;
import X.4YU;
import X.7zM;
import X.C06014fk;
import X.DPh;
import X.KOv;
import X.L93;
import X.L9O;
import X.MFp;
import X.Q1B;
import X.QX7;
import android.content.Context;
import android.graphics.drawable.StateListDrawable;
import android.os.Parcel;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebookpay.form.cell.CellParams;
import com.mapbox.mapboxsdk.R;

/* loaded from: CheckboxCellParams.class */
public final class CheckboxCellParams extends CellParams {
    public int A00;
    public int A01;
    public String A02;
    public boolean A03;
    public boolean A04;

    @Override // com.facebookpay.form.cell.CellParams
    public MFp A00(Context context, ViewGroup.LayoutParams layoutParams) {
        DPh dPh;
        String str;
        boolean A1X = 1BL.A1X(context, layoutParams);
        String str2 = this.A02;
        if (str2 != null && !0CU.A0O(str2)) {
            dPh = new FrameLayout(context, null, 0);
            ((Q1B) dPh).A05 = A1X;
            View.inflate(context, 2132541885, dPh);
            ((Q1B) dPh).A00 = 7zM.A0H(dPh, 2131362981);
            TextView textView = (TextView) 7zM.A0H(dPh, 2131366672);
            ((Q1B) dPh).A02 = textView;
            if (textView == null) {
                str = "primaryTextView";
            } else {
                L9O.A01(textView, KOv.A0q);
                TextView textView2 = (TextView) 7zM.A0H(dPh, 2131367209);
                ((Q1B) dPh).A03 = textView2;
                if (textView2 == null) {
                    str = "secondaryTextView";
                } else {
                    L9O.A01(textView2, KOv.A12);
                    ImageView imageView = (ImageView) 7zM.A0H(dPh, R.id.image);
                    ((Q1B) dPh).A01 = imageView;
                    if (imageView == null) {
                        str = "imageView";
                    }
                }
            }
            11T.A0L(str);
            throw 0Q8.createAndThrow();
        }
        C06014fk.A04();
        dPh = new DPh(new ContextThemeWrapper(context, 2132607399), (AttributeSet) null);
        L9O.A01(dPh, KOv.A0B);
        new StateListDrawable();
        C06014fk.A04().A03(4YU.A08(dPh), 23, 9);
        throw 0Q8.createAndThrow();
    }

    @Override // com.facebookpay.form.cell.CellParams
    public /* bridge */ /* synthetic */ L93 A01() {
        int i = super.A02;
        boolean z = this.A05;
        boolean z2 = this.A03;
        return new QX7(this.A02, i, this.A01, this.A00, z, z2, this.A04);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebookpay.form.cell.CellParams, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeByte(this.A03 ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
