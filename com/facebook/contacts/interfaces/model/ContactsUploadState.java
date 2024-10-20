package com.facebook.contacts.interfaces.model;

import X.1BL;
import X.AnonymousClass001;
import X.DKF;
import X.ELG;
import X.FKX;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;

/* loaded from: ContactsUploadState.class */
public final class ContactsUploadState implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKX.A00(24);
    public final int A00;
    public final int A01;
    public final int A02;
    public final ELG A03;
    public final OperationResult A04;
    public final ServiceException A05;

    public ContactsUploadState(ELG elg, OperationResult operationResult, ServiceException serviceException, int i, int i2, int i3) {
        elg.getClass();
        this.A03 = elg;
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A04 = operationResult;
        this.A05 = serviceException;
    }

    public ContactsUploadState(Parcel parcel) {
        this.A03 = Enum.valueOf(ELG.class, parcel.readString());
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A02 = parcel.readInt();
        this.A04 = (OperationResult) 1BL.A0C(parcel, OperationResult.class);
        this.A05 = (ServiceException) 1BL.A0C(parcel, ServiceException.class);
    }

    public static ContactsUploadState A00(int i, int i2, int i3) {
        return new ContactsUploadState(ELG.A03, null, null, i, i2, i3);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ContactsUploadState (");
        A0k.append(this.A03);
        A0k.append(") (processed/matched/total): ");
        A0k.append(this.A01);
        A0k.append("/");
        A0k.append(this.A00);
        A0k.append("/");
        A0k.append(this.A02);
        return A0k.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        DKF.A1E(parcel, this.A03);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A02);
        parcel.writeParcelable(this.A04, 0);
        parcel.writeParcelable(this.A05, 0);
    }
}
