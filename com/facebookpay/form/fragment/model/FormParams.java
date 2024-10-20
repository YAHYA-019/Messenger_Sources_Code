package com.facebookpay.form.fragment.model;

import X.11T;
import X.1BL;
import X.4YW;
import X.C3o5;
import X.DKE;
import X.JR0;
import X.JR1;
import X.KOm;
import X.LGp;
import X.QuE;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.form.cell.CellParams;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: FormParams.class */
public final class FormParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGp.A00(85);
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final CellParams A07;
    public final FeatureConfiguration A08;
    public final FormLoggingEvents A09;
    public final ListCellParams A0A;
    public final QuE A0B;
    public final KOm A0C;
    public final Integer A0D;
    public final Integer A0E;
    public final Integer A0F;
    public final Integer A0G;
    public final String A0H;
    public final ArrayList A0I;
    public final List A0J;
    public final Function1 A0K;
    public final boolean A0L;

    public FormParams(CellParams cellParams, FeatureConfiguration featureConfiguration, FormLoggingEvents formLoggingEvents, ListCellParams listCellParams, QuE quE, KOm kOm, Integer num, Integer num2, Integer num3, Integer num4, String str, ArrayList arrayList, List list, Function1 function1, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        11T.A0F(arrayList, 6);
        this.A04 = i;
        this.A0H = str;
        this.A06 = i2;
        this.A0F = num;
        this.A0E = num2;
        this.A0I = arrayList;
        this.A09 = formLoggingEvents;
        this.A0B = quE;
        this.A03 = i3;
        this.A00 = i4;
        this.A02 = i5;
        this.A01 = i6;
        this.A0A = listCellParams;
        this.A08 = featureConfiguration;
        this.A0G = num3;
        this.A0J = list;
        this.A07 = cellParams;
        this.A0D = num4;
        this.A05 = i7;
        this.A0C = kOm;
        this.A0L = z;
        this.A0K = function1;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A04);
        parcel.writeString(this.A0H);
        parcel.writeInt(this.A06);
        C3o5.A0f(parcel, this.A0F);
        C3o5.A0f(parcel, this.A0E);
        Iterator A13 = JR1.A13(parcel, this.A0I);
        while (A13.hasNext()) {
            JR0.A17(parcel, A13, i);
        }
        FormLoggingEvents formLoggingEvents = this.A09;
        if (formLoggingEvents == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formLoggingEvents.writeToParcel(parcel, i);
        }
        QuE quE = this.A0B;
        if (quE == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, quE);
        }
        parcel.writeInt(this.A03);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        ListCellParams listCellParams = this.A0A;
        if (listCellParams == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            listCellParams.writeToParcel(parcel, i);
        }
        FeatureConfiguration featureConfiguration = this.A08;
        if (featureConfiguration == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            featureConfiguration.writeToParcel(parcel, i);
        }
        C3o5.A0f(parcel, this.A0G);
        List list = this.A0J;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A09 = 4YW.A09(parcel, list);
            while (A09.hasNext()) {
                parcel.writeInt(DKE.A0F(A09));
            }
        }
        parcel.writeParcelable(this.A07, i);
        Integer num = this.A0D;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(1 - num.intValue() != 0 ? "ECP_ADD_ADDRESS" : "ECP_EDIT_ADDRESS");
        }
        parcel.writeInt(this.A05);
        KOm kOm = this.A0C;
        if (kOm == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, kOm);
        }
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeSerializable((Serializable) this.A0K);
    }
}
