package com.facebookpay.form.fragment.model;

import X.11T;
import X.4YW;
import X.LGp;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* loaded from: FormLoggingEvents.class */
public final class FormLoggingEvents implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LGp(83);
    public final FormClickEvent A00;
    public final FormClickEvent A01;
    public final FormClickEvent A02;
    public final FormMutationEvent A03;
    public final FormMutationEvent A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public FormLoggingEvents() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public FormLoggingEvents(FormClickEvent formClickEvent, FormClickEvent formClickEvent2, FormClickEvent formClickEvent3, FormMutationEvent formMutationEvent, FormMutationEvent formMutationEvent2, List list, List list2, List list3, List list4) {
        this.A05 = list;
        this.A06 = list2;
        this.A01 = formClickEvent;
        this.A02 = formClickEvent2;
        this.A00 = formClickEvent3;
        this.A08 = list3;
        this.A07 = list4;
        this.A04 = formMutationEvent;
        this.A03 = formMutationEvent2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        List list = this.A05;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A09 = 4YW.A09(parcel, list);
            while (A09.hasNext()) {
                ((FormDisplayEvent) A09.next()).writeToParcel(parcel, i);
            }
        }
        List list2 = this.A06;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A092 = 4YW.A09(parcel, list2);
            while (A092.hasNext()) {
                ((FormClickEvent) A092.next()).writeToParcel(parcel, i);
            }
        }
        FormClickEvent formClickEvent = this.A01;
        if (formClickEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formClickEvent.writeToParcel(parcel, i);
        }
        FormClickEvent formClickEvent2 = this.A02;
        if (formClickEvent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formClickEvent2.writeToParcel(parcel, i);
        }
        FormClickEvent formClickEvent3 = this.A00;
        if (formClickEvent3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formClickEvent3.writeToParcel(parcel, i);
        }
        List list3 = this.A08;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A093 = 4YW.A09(parcel, list3);
            while (A093.hasNext()) {
                ((FormMutationEvent) A093.next()).writeToParcel(parcel, i);
            }
        }
        List list4 = this.A07;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            Iterator A094 = 4YW.A09(parcel, list4);
            while (A094.hasNext()) {
                ((FormMutationEvent) A094.next()).writeToParcel(parcel, i);
            }
        }
        FormMutationEvent formMutationEvent = this.A04;
        if (formMutationEvent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formMutationEvent.writeToParcel(parcel, i);
        }
        FormMutationEvent formMutationEvent2 = this.A03;
        if (formMutationEvent2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            formMutationEvent2.writeToParcel(parcel, i);
        }
    }
}
