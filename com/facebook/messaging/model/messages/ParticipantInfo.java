package com.facebook.messaging.model.messages;

import X.1Kq;
import X.1Ks;
import X.1uP;
import X.C1z1;
import X.C1zA;
import X.C2xc;
import X.C3il;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.secure.secrettypes.SecretString;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.user.model.WorkUserForeignEntityInfo;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.util.Comparator;

/* loaded from: ParticipantInfo.class */
public final class ParticipantInfo implements Parcelable {
    public static final C1zA A0N;
    public static final Comparator A0O;
    public static final Parcelable.Creator CREATOR;
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final 1Kq A07;
    public final SecretString A08;
    public final SecretString A09;
    public final SecretString A0A;
    public final SecretString A0B;
    public final SecretString A0C;
    public final SecretString A0D;
    public final C1z1 A0E;
    public final UserKey A0F;
    public final WorkUserForeignEntityInfo A0G;
    public final Capabilities A0H;
    public final 1Ks A0I;
    public final String A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;

    static {
        Comparator comparator = String.CASE_INSENSITIVE_ORDER;
        comparator.getClass();
        A0N = C1zA.A00(comparator).A02();
        A0O = new C3il(3);
        CREATOR = new C2xc(25);
    }

    public ParticipantInfo(1Kq r302, C1z1 c1z1, UserKey userKey, WorkUserForeignEntityInfo workUserForeignEntityInfo, 1Ks r306, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, long j, long j2, long j3, long j4, long j5, boolean z, boolean z2, boolean z3) {
        Preconditions.checkNotNull(userKey, "Attempting to create ParticipantInfo with a null UserKey");
        this.A0F = userKey;
        this.A09 = new SecretString(str);
        this.A08 = new SecretString(str2);
        this.A0A = new SecretString(str3);
        this.A0J = str4;
        this.A0C = new SecretString(str5);
        this.A0K = z;
        Preconditions.checkNotNull(r302, "Attempting to create ParticipantInfo with a null MessagingActorType");
        this.A07 = r302;
        this.A0G = workUserForeignEntityInfo;
        this.A0M = z2;
        Preconditions.checkNotNull(c1z1, "Attempting to create ParticipantInfo with a null BlockedByViewerStatus");
        this.A0E = c1z1;
        this.A0I = r306;
        this.A01 = i;
        this.A00 = i2;
        this.A06 = j;
        this.A0D = new SecretString(str6);
        this.A0B = new SecretString(str7);
        this.A03 = j2;
        this.A02 = j3;
        this.A04 = j4;
        this.A05 = j5;
        this.A0H = Capabilities.A01.A03(new long[]{j4, j5});
        this.A0L = z3;
    }

    public ParticipantInfo(Parcel parcel) {
        Parcelable readParcelable = parcel.readParcelable(SecretString.class.getClassLoader());
        readParcelable.getClass();
        this.A08 = (SecretString) readParcelable;
        Parcelable readParcelable2 = parcel.readParcelable(SecretString.class.getClassLoader());
        readParcelable2.getClass();
        this.A0A = (SecretString) readParcelable2;
        this.A0J = parcel.readString();
        Parcelable readParcelable3 = parcel.readParcelable(SecretString.class.getClassLoader());
        readParcelable3.getClass();
        this.A0C = (SecretString) readParcelable3;
        Parcelable readParcelable4 = parcel.readParcelable(SecretString.class.getClassLoader());
        readParcelable4.getClass();
        this.A09 = (SecretString) readParcelable4;
        UserKey A02 = UserKey.A02(parcel.readString());
        Preconditions.checkNotNull(A02, "Attempting to create ParticipantInfo with a null UserKey");
        this.A0F = A02;
        this.A0K = C53v.A0S(parcel);
        String readString = parcel.readString();
        readString.getClass();
        this.A07 = 1Kq.valueOf(readString);
        this.A0G = (WorkUserForeignEntityInfo) parcel.readParcelable(WorkUserForeignEntityInfo.class.getClassLoader());
        this.A0M = C53v.A0S(parcel);
        String readString2 = parcel.readString();
        readString2.getClass();
        this.A0E = C1z1.valueOf(readString2);
        this.A0I = 1uP.A00(C53v.A08(parcel));
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A06 = parcel.readLong();
        this.A0D = (SecretString) parcel.readParcelable(SecretString.class.getClassLoader());
        this.A0B = (SecretString) parcel.readParcelable(SecretString.class.getClassLoader());
        this.A03 = parcel.readLong();
        this.A02 = parcel.readLong();
        long readLong = parcel.readLong();
        this.A04 = readLong;
        long readLong2 = parcel.readLong();
        this.A05 = readLong2;
        this.A0H = Capabilities.A01.A03(new long[]{readLong, readLong2});
        this.A0L = C53v.A0S(parcel);
    }

    public ParticipantInfo(User user) {
        this.A0F = user.A0k;
        this.A09 = new SecretString(user.A0X.A00());
        this.A08 = new SecretString(user.A08());
        this.A0A = new SecretString(user.A03() != null ? user.A03().A04 : null);
        User user2 = user.A0f;
        this.A0J = user2 != null ? user2.A13 : null;
        this.A0K = user.A1Z;
        this.A07 = user.A0U;
        this.A0C = new SecretString(user.A1N);
        this.A0G = user.A0m;
        this.A0M = user.A2A;
        this.A0E = user.A02();
        this.A0I = user.A0p;
        this.A01 = user.A0A;
        this.A00 = user.A09;
        this.A06 = user.A0R;
        this.A0D = new SecretString(user.A1O);
        this.A0B = null;
        this.A03 = 0L;
        this.A02 = 0L;
        long j = user.A0K;
        this.A04 = j;
        long j2 = user.A0L;
        this.A05 = j2;
        this.A0H = Capabilities.A01.A03(new long[]{j, j2});
        this.A0L = user.A05;
    }

    public String A00() {
        UserKey userKey = this.A0F;
        return User.A01(userKey.type) ? this.A0J : userKey.id;
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
            ParticipantInfo participantInfo = (ParticipantInfo) obj;
            if (!Objects.equal(this.A08, participantInfo.A08) || !Objects.equal(this.A0A, participantInfo.A0A) || !Objects.equal(this.A0J, participantInfo.A0J) || !Objects.equal(this.A09, participantInfo.A09) || !Objects.equal(this.A0C, participantInfo.A0C) || !Objects.equal(this.A0F, participantInfo.A0F) || !Objects.equal(this.A0D, participantInfo.A0D) || !Objects.equal(this.A0B, participantInfo.A0B) || this.A0K != participantInfo.A0K || this.A07 != participantInfo.A07 || this.A0G != participantInfo.A0G || this.A0M != participantInfo.A0M || this.A0E != participantInfo.A0E || this.A0I != participantInfo.A0I || this.A01 != participantInfo.A01 || this.A00 != participantInfo.A00 || this.A06 != participantInfo.A06) {
                return false;
            }
            long j = this.A03;
            if (j != j || this.A02 != participantInfo.A02 || this.A04 != participantInfo.A04 || this.A05 != participantInfo.A05 || this.A0L != participantInfo.A0L) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        UserKey userKey = this.A0F;
        if (userKey != null) {
            return userKey.hashCode();
        }
        return 0;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(ParticipantInfo.class);
        stringHelper.add("userKey", this.A0F.A05());
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A09);
        stringHelper.add("emailAddress", this.A08);
        stringHelper.add("phoneNumber", this.A0A);
        stringHelper.add("smsParticipantFbid", this.A0J);
        stringHelper.add("username", this.A0C);
        stringHelper.add("isCommerce", this.A0K);
        stringHelper.add("messagingActorType", this.A07.name());
        stringHelper.add("workUserForeignEntityInfo", this.A0G);
        stringHelper.add("isPseudoBlockedByViewer", this.A0M);
        stringHelper.add("blockedByViewerStatus", this.A0E);
        stringHelper.add("restrictionType", this.A0I);
        stringHelper.add("msysContactPK", this.A06);
        stringHelper.add("usernameForProfile", this.A0D);
        stringHelper.add("communityChannelBadges", this.A03);
        stringHelper.add("badgeId", this.A02);
        stringHelper.add("contactCapabilities1", this.A04);
        stringHelper.add("contactCapabilities2", this.A05);
        stringHelper.add("isMSplitUser", this.A0L);
        return stringHelper.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A08, i);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeString(this.A0J);
        parcel.writeParcelable(this.A0C, i);
        parcel.writeParcelable(this.A09, i);
        parcel.writeString(this.A0F.A05());
        parcel.writeInt(this.A0K ? 1 : 0);
        parcel.writeString(this.A07.name());
        parcel.writeParcelable(this.A0G, i);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeString(this.A0E.name());
        C53v.A0K(parcel, this.A0I.dbValue);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeLong(this.A06);
        parcel.writeParcelable(this.A0D, i);
        parcel.writeParcelable(this.A0B, i);
        parcel.writeLong(this.A03);
        parcel.writeLong(this.A02);
        parcel.writeLong(this.A04);
        parcel.writeLong(this.A05);
        parcel.writeInt(this.A0L ? 1 : 0);
    }
}
