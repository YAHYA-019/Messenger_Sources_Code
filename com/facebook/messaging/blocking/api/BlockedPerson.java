package com.facebook.messaging.blocking.api;

import X.1BL;
import X.BKk;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import java.util.Arrays;

/* loaded from: BlockedPerson.class */
public class BlockedPerson implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(2);
    public final String mBlockedDate;
    public final BKk mBlockedType;
    public final String mFbid;
    public final String mName;
    public final String mUserName;

    public BlockedPerson() {
        this.mFbid = null;
        this.mName = null;
        this.mBlockedType = null;
        this.mBlockedDate = null;
        this.mUserName = null;
    }

    public BlockedPerson(Parcel parcel) {
        this.mFbid = parcel.readString();
        this.mName = parcel.readString();
        this.mBlockedType = BKk.valueOf(parcel.readString());
        this.mBlockedDate = parcel.readString();
        this.mUserName = parcel.readString();
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Object obj) {
        String str = ((BlockedPerson) obj).mBlockedDate;
        if (str == null) {
            return -1;
        }
        return str.compareTo(this.mBlockedDate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof BlockedPerson)) {
                return false;
            }
            BlockedPerson blockedPerson = (BlockedPerson) obj;
            if (!this.mBlockedDate.equals(blockedPerson.mBlockedDate) || !this.mFbid.equals(blockedPerson.mFbid) || !this.mBlockedType.equals(blockedPerson.mBlockedType) || !this.mName.equals(blockedPerson.mName)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.mFbid, this.mBlockedDate, this.mBlockedType, this.mName});
    }

    public String toString() {
        return StringFormatUtil.formatStrLocaleSafe("fbid %s, name %s, block_type %s, block_date %s, username %s", this.mFbid, this.mName, this.mBlockedType, this.mBlockedDate, this.mUserName);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mFbid);
        parcel.writeString(this.mName);
        1BL.A12(parcel, this.mBlockedType);
        parcel.writeString(this.mBlockedDate);
        parcel.writeString(this.mUserName);
    }
}
