package com.facebook.payments.p2p.model;

import X.C41w;
import X.C53v;
import X.FKZ;
import X.GJU;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.MoreObjects;

/* loaded from: Sender.class */
public class Sender implements Parcelable, GJU, C41w {
    public static final Sender A00 = new Sender(ConstantsKt.CAMERA_ID_FRONT, "", 0, false);
    public static final Parcelable.Creator CREATOR = FKZ.A00(96);
    public String mId;
    public final boolean mIsMessengerUser;
    public String mName;
    public int mThumbnailResId;

    public Sender() {
        this.mId = null;
        this.mName = null;
        this.mIsMessengerUser = false;
        this.mThumbnailResId = 0;
    }

    public Sender(Parcel parcel) {
        this.mId = parcel.readString();
        this.mName = parcel.readString();
        this.mIsMessengerUser = C53v.A0S(parcel);
        this.mThumbnailResId = parcel.readInt();
        String str = this.mId;
        this.mId = str == null ? ConstantsKt.CAMERA_ID_FRONT : str;
        String str2 = this.mName;
        this.mName = str2 == null ? "" : str2;
    }

    public Sender(String str, String str2, int i, boolean z) {
        this.mId = str;
        this.mName = str2;
        this.mIsMessengerUser = z;
        this.mThumbnailResId = i;
        this.mId = str == null ? ConstantsKt.CAMERA_ID_FRONT : str;
        this.mName = str2 == null ? "" : str2;
    }

    public int BFc() {
        return this.mThumbnailResId;
    }

    @Override // X.C41w
    public /* bridge */ /* synthetic */ Object CY7() {
        String str = this.mId;
        if (str == null) {
            str = ConstantsKt.CAMERA_ID_FRONT;
        }
        this.mId = str;
        String str2 = this.mName;
        if (str2 == null) {
            str2 = "";
        }
        this.mName = str2;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.mId;
    }

    public String getName() {
        return this.mName;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.mId);
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.mName);
        stringHelper.add("is_messenger_user", this.mIsMessengerUser);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mId);
        parcel.writeString(this.mName);
        parcel.writeInt(this.mIsMessengerUser ? 1 : 0);
        parcel.writeInt(this.mThumbnailResId);
    }
}
