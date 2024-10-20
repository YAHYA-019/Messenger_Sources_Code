package com.facebook.auth.viewercontext;

import X.1Ef;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.base.Preconditions;

/* loaded from: ViewerContext.class */
public final class ViewerContext implements Parcelable {
    public static final ViewerContext A01;
    public static final ThreadLocal A02 = new 1Ef();
    public static final Parcelable.Creator CREATOR;
    public final String A00;
    public final String mAuthToken;
    public final boolean mIsContextualProfileContext;
    public final boolean mIsGroupsAnonymousVoice;
    public final boolean mIsPPlusContinuityModeContext;
    public final boolean mIsPageContext;
    public final boolean mIsRoomGuestContext;
    public final boolean mIsTimelineViewAsContext;
    public final String mSessionCookiesString;
    public final String mSessionKey;
    public final String mSessionSecret;
    public final String mUserId;
    public final String mUsername;

    static {
        A01 = ConstantsKt.CAMERA_ID_FRONT.length() == 0 ? null : new ViewerContext(null, "", null, null, null, ConstantsKt.CAMERA_ID_FRONT, null, false, false, false, false, false, false);
        CREATOR = new C2xc(2);
    }

    public ViewerContext() {
        this.mUserId = null;
        this.mAuthToken = null;
        this.mSessionCookiesString = null;
        this.mIsPageContext = false;
        this.mIsTimelineViewAsContext = false;
        this.mIsContextualProfileContext = false;
        this.mIsPPlusContinuityModeContext = false;
        this.mSessionSecret = null;
        this.mSessionKey = null;
        this.mUsername = null;
        this.A00 = null;
        this.mIsRoomGuestContext = false;
        this.mIsGroupsAnonymousVoice = false;
    }

    public ViewerContext(Parcel parcel) {
        this.mUserId = parcel.readString();
        this.mAuthToken = parcel.readString();
        this.mSessionCookiesString = parcel.readString();
        boolean z = false;
        this.mIsPageContext = parcel.readInt() == 1;
        this.mIsTimelineViewAsContext = parcel.readInt() == 1;
        this.mIsContextualProfileContext = parcel.readInt() == 1;
        this.mIsPPlusContinuityModeContext = parcel.readInt() == 1;
        this.mSessionSecret = parcel.readString();
        this.mSessionKey = parcel.readString();
        this.mUsername = parcel.readString();
        this.A00 = parcel.readString();
        this.mIsRoomGuestContext = parcel.readInt() == 1;
        this.mIsGroupsAnonymousVoice = parcel.readInt() == 1 ? true : z;
    }

    public ViewerContext(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Preconditions.checkArgument(!(str6.length() == 0));
        this.mUserId = str6;
        str2.getClass();
        this.mAuthToken = str2;
        this.mSessionCookiesString = str3;
        this.mIsPageContext = z4;
        this.mIsTimelineViewAsContext = z6;
        this.mIsContextualProfileContext = z;
        this.mIsPPlusContinuityModeContext = z3;
        this.mSessionSecret = str5;
        this.mSessionKey = str4;
        this.mUsername = str7;
        this.A00 = str;
        this.mIsRoomGuestContext = z5;
        this.mIsGroupsAnonymousVoice = z2;
    }

    public String A00() {
        return this.mAuthToken;
    }

    public String A01() {
        return this.mUserId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ViewerContext viewerContext = (ViewerContext) obj;
            if (this.mIsPageContext != viewerContext.mIsPageContext || this.mIsTimelineViewAsContext != viewerContext.mIsTimelineViewAsContext || this.mIsContextualProfileContext != viewerContext.mIsContextualProfileContext || this.mIsPPlusContinuityModeContext != viewerContext.mIsPPlusContinuityModeContext || this.mIsRoomGuestContext != viewerContext.mIsRoomGuestContext || this.mIsGroupsAnonymousVoice != viewerContext.mIsGroupsAnonymousVoice) {
                return false;
            }
            String str = this.mUserId;
            String str2 = viewerContext.mUserId;
            if (str != null) {
                if (!str.equals(str2)) {
                    return false;
                }
            } else if (str2 != null) {
                return false;
            }
            String str3 = this.mAuthToken;
            String str4 = viewerContext.mAuthToken;
            if (str3 != null) {
                if (!str3.equals(str4)) {
                    return false;
                }
            } else if (str4 != null) {
                return false;
            }
            String str5 = this.mSessionCookiesString;
            String str6 = viewerContext.mSessionCookiesString;
            if (str5 != null) {
                if (!str5.equals(str6)) {
                    return false;
                }
            } else if (str6 != null) {
                return false;
            }
            String str7 = this.mSessionSecret;
            String str8 = viewerContext.mSessionSecret;
            if (str7 != null) {
                if (!str7.equals(str8)) {
                    return false;
                }
            } else if (str8 != null) {
                return false;
            }
            String str9 = this.mSessionKey;
            String str10 = viewerContext.mSessionKey;
            if (str9 != null) {
                if (!str9.equals(str10)) {
                    return false;
                }
            } else if (str10 != null) {
                return false;
            }
            String str11 = this.A00;
            String str12 = viewerContext.A00;
            if (str11 != null) {
                if (!str11.equals(str12)) {
                    return false;
                }
            } else if (str12 != null) {
                return false;
            }
            String str13 = this.mUsername;
            String str14 = viewerContext.mUsername;
            if (str13 != null) {
                return str13.equals(str14);
            }
            if (str14 != null) {
                z = false;
            }
        }
        return z;
    }

    public int hashCode() {
        String str = this.mUserId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.mAuthToken;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mSessionCookiesString;
        int hashCode3 = (((((((((((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.mIsPageContext ? 1 : 0)) * 31) + (this.mIsTimelineViewAsContext ? 1 : 0)) * 31) + (this.mIsContextualProfileContext ? 1 : 0)) * 31) + (this.mIsPPlusContinuityModeContext ? 1 : 0)) * 31) + (this.mIsRoomGuestContext ? 1 : 0)) * 31) + (this.mIsGroupsAnonymousVoice ? 1 : 0)) * 31;
        String str4 = this.mSessionSecret;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.mSessionKey;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.mUsername;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.A00;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode6 + i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mUserId);
        parcel.writeString(this.mAuthToken);
        parcel.writeString(this.mSessionCookiesString);
        parcel.writeInt(this.mIsPageContext ? 1 : 0);
        parcel.writeInt(this.mIsTimelineViewAsContext ? 1 : 0);
        parcel.writeInt(this.mIsContextualProfileContext ? 1 : 0);
        parcel.writeInt(this.mIsPPlusContinuityModeContext ? 1 : 0);
        parcel.writeString(this.mSessionSecret);
        parcel.writeString(this.mSessionKey);
        parcel.writeString(this.mUsername);
        parcel.writeString(this.A00);
        parcel.writeInt(this.mIsRoomGuestContext ? 1 : 0);
        parcel.writeInt(this.mIsGroupsAnonymousVoice ? 1 : 0);
    }
}
