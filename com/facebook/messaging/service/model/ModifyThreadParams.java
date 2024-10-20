package com.facebook.messaging.service.model;

import X.1BL;
import X.1JF;
import X.7zS;
import X.AbK;
import X.AbM;
import X.AnonymousClass001;
import X.C53v;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.NotificationSetting;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Objects;
import java.util.Arrays;

/* loaded from: ModifyThreadParams.class */
public final class ModifyThreadParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(5);
    public final long A00;
    public final long A01;
    public final ThreadKey A02;
    public final NotificationSetting A03;
    public final ThreadCustomization A04;
    public final NicknamePair A05;
    public final MediaResource A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;

    /* loaded from: ModifyThreadParams$NicknamePair.class */
    public final class NicknamePair implements Parcelable {
        public static final Parcelable.Creator CREATOR = CSU.A00(6);
        public String A00;
        public String A01;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                if (obj == null || getClass() != obj.getClass()) {
                    return false;
                }
                NicknamePair nicknamePair = (NicknamePair) obj;
                if (!this.A01.equals(nicknamePair.A01) || !this.A00.equals(nicknamePair.A00)) {
                    return false;
                }
            }
            return true;
        }

        public int hashCode() {
            return AbM.A05(this.A01, this.A00);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A01);
            parcel.writeString(this.A00);
        }
    }

    public ModifyThreadParams(Parcel parcel) {
        this.A02 = AbK.A0X(parcel);
        this.A09 = parcel.readString();
        this.A0D = AnonymousClass001.A1N(parcel.readInt());
        this.A07 = parcel.readString();
        this.A0F = 7zS.A1Z(parcel);
        this.A06 = (MediaResource) 1BL.A0C(parcel, MediaResource.class);
        this.A0E = 7zS.A1Z(parcel);
        this.A03 = (NotificationSetting) 1BL.A0C(parcel, NotificationSetting.class);
        this.A0B = 7zS.A1Z(parcel);
        this.A04 = (ThreadCustomization) 1BL.A0C(parcel, ThreadCustomization.class);
        this.A0C = C53v.A0S(parcel);
        this.A00 = parcel.readLong();
        this.A01 = parcel.readLong();
        this.A08 = parcel.readString();
        this.A05 = (NicknamePair) 1BL.A0C(parcel, NicknamePair.class);
        this.A0A = AbM.A1V(parcel);
    }

    public ModifyThreadParams(ThreadKey threadKey, NotificationSetting notificationSetting, ThreadCustomization threadCustomization, NicknamePair nicknamePair, MediaResource mediaResource, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A02 = threadKey;
        this.A09 = null;
        this.A0D = z4;
        this.A07 = str;
        this.A0F = z6;
        this.A06 = mediaResource;
        this.A0E = z5;
        this.A03 = notificationSetting;
        this.A0B = z2;
        this.A05 = nicknamePair;
        this.A04 = threadCustomization;
        this.A08 = str2;
        this.A0C = z3;
        this.A00 = 0L;
        this.A01 = 0L;
        this.A0A = z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ModifyThreadParams modifyThreadParams = (ModifyThreadParams) obj;
            if (this.A02 != modifyThreadParams.A02 || !this.A09.equals(modifyThreadParams.A09) || this.A0D != modifyThreadParams.A0D || !1JF.A0C(this.A07, modifyThreadParams.A07) || this.A0F != modifyThreadParams.A0F || !Objects.equal(this.A06, modifyThreadParams.A06) || this.A0E != modifyThreadParams.A0E || !Objects.equal(this.A03, modifyThreadParams.A03) || this.A0B != modifyThreadParams.A0B || !Objects.equal(this.A04, modifyThreadParams.A04) || this.A0C != modifyThreadParams.A0C || this.A00 != modifyThreadParams.A00 || this.A01 != modifyThreadParams.A01 || !1JF.A0C(this.A08, modifyThreadParams.A08) || !Objects.equal(this.A05, modifyThreadParams.A05) || !Objects.equal(Boolean.valueOf(this.A0A), Boolean.valueOf(modifyThreadParams.A0A))) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A02, this.A09, Boolean.valueOf(this.A0D), this.A07, Boolean.valueOf(this.A0F), this.A06, Boolean.valueOf(this.A0E), this.A03, Boolean.valueOf(this.A0B), this.A04, Boolean.valueOf(this.A0C), Long.valueOf(this.A00), Long.valueOf(this.A01), this.A08, this.A05, Boolean.valueOf(this.A0A)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A09);
        parcel.writeInt(this.A0D ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeParcelable(this.A06, i);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeParcelable(this.A03, i);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeInt(this.A0C ? 1 : 0);
        parcel.writeLong(this.A00);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A05, i);
        parcel.writeInt(this.A0A ? 1 : 0);
    }
}
