package com.facebook.rsys.callinfo.gen;

import X.1BL;
import X.2JQ;
import X.7zN;
import X.AbstractC2326GOr;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.IR0;
import com.facebook.djinni.msys.infra.McfReference;

/* loaded from: UserProfile.class */
public class UserProfile {
    public static 2JQ CONVERTER = IR0.A00(29);
    public static long sMcfTypeId;
    public final String actorId;
    public final boolean authTypeIsAnonymousUser;
    public final int blockedByViewerStatus;
    public final boolean canViewerMessage;
    public final int capabilities;
    public final long capabilities2;
    public final int contactTypeExact;
    public final String firstName;
    public final int friendshipStatus;
    public final boolean isGuest;
    public final String name;
    public final String profilePictureUrl;
    public final long profilePictureUrlExpirationTimestampMs;
    public final String profilePictureUrlFallback;
    public final String secondaryName;
    public final String thirdPartyId;
    public final String userId;
    public final int userProfileState;

    public UserProfile(int i, String str, String str2, String str3, String str4, String str5, String str6, String str7, long j, boolean z, int i2, int i3, String str8, boolean z2, boolean z3, int i4, int i5, long j2) {
        str.getClass();
        this.userProfileState = i;
        this.userId = str;
        this.actorId = str2;
        this.thirdPartyId = str3;
        this.firstName = str4;
        this.name = str5;
        this.profilePictureUrl = str6;
        this.profilePictureUrlFallback = str7;
        this.profilePictureUrlExpirationTimestampMs = j;
        this.isGuest = z;
        this.blockedByViewerStatus = i2;
        this.contactTypeExact = i3;
        this.secondaryName = str8;
        this.canViewerMessage = z2;
        this.authTypeIsAnonymousUser = z3;
        this.friendshipStatus = i4;
        this.capabilities = i5;
        this.capabilities2 = j2;
    }

    public static native UserProfile createFromMcfType(McfReference mcfReference);

    public static native long nativeGetMcfTypeId();

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof UserProfile)) {
                return false;
            }
            UserProfile userProfile = (UserProfile) obj;
            if (this.userProfileState != userProfile.userProfileState || !this.userId.equals(userProfile.userId)) {
                return false;
            }
            String str = this.actorId;
            String str2 = userProfile.actorId;
            if (str == null) {
                if (str2 != null) {
                    return false;
                }
            } else if (!str.equals(str2)) {
                return false;
            }
            String str3 = this.thirdPartyId;
            String str4 = userProfile.thirdPartyId;
            if (str3 == null) {
                if (str4 != null) {
                    return false;
                }
            } else if (!str3.equals(str4)) {
                return false;
            }
            String str5 = this.firstName;
            String str6 = userProfile.firstName;
            if (str5 == null) {
                if (str6 != null) {
                    return false;
                }
            } else if (!str5.equals(str6)) {
                return false;
            }
            String str7 = this.name;
            String str8 = userProfile.name;
            if (str7 == null) {
                if (str8 != null) {
                    return false;
                }
            } else if (!str7.equals(str8)) {
                return false;
            }
            String str9 = this.profilePictureUrl;
            String str10 = userProfile.profilePictureUrl;
            if (str9 == null) {
                if (str10 != null) {
                    return false;
                }
            } else if (!str9.equals(str10)) {
                return false;
            }
            String str11 = this.profilePictureUrlFallback;
            String str12 = userProfile.profilePictureUrlFallback;
            if (str11 == null) {
                if (str12 != null) {
                    return false;
                }
            } else if (!str11.equals(str12)) {
                return false;
            }
            if (this.profilePictureUrlExpirationTimestampMs != userProfile.profilePictureUrlExpirationTimestampMs || this.isGuest != userProfile.isGuest || this.blockedByViewerStatus != userProfile.blockedByViewerStatus || this.contactTypeExact != userProfile.contactTypeExact) {
                return false;
            }
            String str13 = this.secondaryName;
            String str14 = userProfile.secondaryName;
            if (str13 == null) {
                if (str14 != null) {
                    return false;
                }
            } else if (!str13.equals(str14)) {
                return false;
            }
            if (this.canViewerMessage != userProfile.canViewerMessage || this.authTypeIsAnonymousUser != userProfile.authTypeIsAnonymousUser || this.friendshipStatus != userProfile.friendshipStatus || this.capabilities != userProfile.capabilities || this.capabilities2 != userProfile.capabilities2) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A02 = (((((((((((((((AnonymousClass002.A02(this.profilePictureUrlExpirationTimestampMs, (((((((((((AnonymousClass002.A07(this.userId, AbstractC2326GOr.A03(this.userProfileState)) + 1BL.A05(this.actorId)) * 31) + 1BL.A05(this.thirdPartyId)) * 31) + 1BL.A05(this.firstName)) * 31) + 1BL.A05(this.name)) * 31) + 1BL.A05(this.profilePictureUrl)) * 31) + 1BL.A05(this.profilePictureUrlFallback)) * 31) + (this.isGuest ? 1 : 0)) * 31) + this.blockedByViewerStatus) * 31) + this.contactTypeExact) * 31) + 7zN.A05(this.secondaryName)) * 31) + (this.canViewerMessage ? 1 : 0)) * 31) + (this.authTypeIsAnonymousUser ? 1 : 0)) * 31) + this.friendshipStatus) * 31) + this.capabilities) * 31;
        long j = this.capabilities2;
        return A02 + ((int) (j ^ (j >>> 32)));
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("UserProfile{userProfileState=");
        A0k.append(this.userProfileState);
        A0k.append(",userId=");
        A0k.append(this.userId);
        A0k.append(",actorId=");
        A0k.append(this.actorId);
        A0k.append(",thirdPartyId=");
        A0k.append(this.thirdPartyId);
        A0k.append(",firstName=");
        A0k.append(this.firstName);
        A0k.append(",name=");
        A0k.append(this.name);
        A0k.append(",profilePictureUrl=");
        A0k.append(this.profilePictureUrl);
        A0k.append(",profilePictureUrlFallback=");
        A0k.append(this.profilePictureUrlFallback);
        A0k.append(",profilePictureUrlExpirationTimestampMs=");
        A0k.append(this.profilePictureUrlExpirationTimestampMs);
        A0k.append(",isGuest=");
        A0k.append(this.isGuest);
        A0k.append(",blockedByViewerStatus=");
        A0k.append(this.blockedByViewerStatus);
        A0k.append(",contactTypeExact=");
        A0k.append(this.contactTypeExact);
        A0k.append(",secondaryName=");
        A0k.append(this.secondaryName);
        A0k.append(",canViewerMessage=");
        A0k.append(this.canViewerMessage);
        A0k.append(",authTypeIsAnonymousUser=");
        A0k.append(this.authTypeIsAnonymousUser);
        A0k.append(",friendshipStatus=");
        A0k.append(this.friendshipStatus);
        A0k.append(",capabilities=");
        A0k.append(this.capabilities);
        A0k.append(",capabilities2=");
        A0k.append(this.capabilities2);
        return AnonymousClass001.A0d("}", A0k);
    }
}
