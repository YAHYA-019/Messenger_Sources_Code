package com.facebookpay.form.cell;

import X.1BL;
import X.AnonymousClass001;
import X.Kle;
import X.L93;
import X.MFp;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import com.facebookpay.form.cell.logging.FormCellLoggingEvents;

/* loaded from: CellParams.class */
public abstract class CellParams implements Parcelable {
    public L93 A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final FormCellLoggingEvents A04;
    public final boolean A05;
    public final boolean A06;

    public CellParams(int i) {
        this.A03 = 0;
        this.A02 = i;
        this.A06 = false;
        this.A05 = true;
        this.A01 = 1.0f;
        this.A04 = null;
    }

    public CellParams(Kle kle) {
        this.A03 = kle.A01;
        this.A02 = kle.A05;
        this.A06 = kle.A04;
        this.A05 = kle.A03;
        this.A01 = kle.A00;
        this.A04 = kle.A02;
    }

    public CellParams(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A02 = parcel.readInt();
        boolean z = true;
        this.A06 = AnonymousClass001.A1N(parcel.readByte());
        this.A05 = parcel.readByte() == 0 ? false : z;
        this.A01 = parcel.readFloat();
        this.A04 = (FormCellLoggingEvents) 1BL.A0C(parcel, FormCellLoggingEvents.class);
    }

    public CellParams(FormCellLoggingEvents formCellLoggingEvents, float f, int i, int i2, boolean z, boolean z2) {
        this.A03 = 0;
        this.A02 = i;
        this.A06 = true;
        this.A05 = true;
        this.A01 = 1.0f;
        this.A04 = null;
    }

    public abstract MFp A00(Context context, ViewGroup.LayoutParams layoutParams);

    public abstract L93 A01();

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A02);
        parcel.writeByte(this.A06 ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.A05 ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.A01);
        parcel.writeParcelable(this.A04, i);
    }
}
