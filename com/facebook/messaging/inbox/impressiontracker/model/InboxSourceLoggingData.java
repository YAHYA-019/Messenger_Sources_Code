package com.facebook.messaging.inbox.impressiontracker.model;

import X.0Pz;
import X.0S2;
import X.11T;
import X.1BL;
import X.2DM;
import X.AbE;
import X.C04v;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: InboxSourceLoggingData.class */
public final class InboxSourceLoggingData extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(19);
    public final Integer A00;
    public final String A01;
    public final String A02;

    public InboxSourceLoggingData() {
        this(null, null, null);
    }

    public InboxSourceLoggingData(String str, Integer num, String str2) {
        this.A02 = str;
        this.A00 = num;
        this.A01 = str2;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "SEE_MORE";
            case 2:
                return "PLATFORM_TAB";
            case 3:
                return "PLATFORM_TAB_CATEGORY";
            case 4:
                return "DISCOVER_TAB_M4";
            case 5:
                return "GROUPS_TAB";
            case 6:
                return "WORKCHAT_DISCOVERY_TAB";
            case 7:
                return "MORE_DRAWER_BROWSE";
            case 8:
                return "RECENT_THREAD_LIST";
            case 9:
                return "BUSINESS_TAB";
            case 10:
                return "MESSAGE_REQUEST_LIST";
            case 11:
                return "FILTERED_REQUEST_LIST";
            case 12:
                return "FOLDER_THREAD_LIST";
            default:
                return "THREAD_LIST";
        }
    }

    public final void A01(2DM r302) {
        String str;
        r302.A0o("st", "MESSENGER_INBOX2");
        Integer num = 0S2.A00;
        Integer num2 = this.A00;
        if (num == num2 || num2 == null) {
            return;
        }
        switch (num2.intValue()) {
            case 1:
                str = "SEE_MORE";
                break;
            case 2:
                str = "PLATFORM_TAB";
                break;
            case 3:
                str = "PLATFORM_TAB_CATEGORY";
                break;
            case 4:
                str = "DISCOVER_TAB_M4";
                break;
            case 5:
                str = "GROUPS_TAB";
                break;
            case 6:
                str = "WORKCHAT_DISCOVERY_TAB";
                break;
            case 7:
                str = "MORE_DRAWER_BROWSE";
                break;
            case 8:
                str = "RECENT_THREAD_LIST";
                break;
            case 9:
                str = "BUSINESS_TAB";
                break;
            case 10:
                str = "MESSAGE_REQUEST_LIST";
                break;
            case 11:
                str = "FILTERED_REQUEST_LIST";
                break;
            case 12:
                str = "FOLDER_THREAD_LIST";
                break;
            default:
                str = "THREAD_LIST";
                break;
        }
        r302.A0o("src", str);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InboxSourceLoggingData)) {
                return false;
            }
            InboxSourceLoggingData inboxSourceLoggingData = (InboxSourceLoggingData) obj;
            if (!11T.A0O(this.A02, inboxSourceLoggingData.A02) || this.A00 != inboxSourceLoggingData.A00 || !11T.A0O(this.A01, inboxSourceLoggingData.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        int A05 = 1BL.A05(this.A02) * 31;
        Integer num = this.A00;
        int hashCode = (A05 + (num == null ? 0 : A00(num).hashCode() + num.intValue())) * 31;
        String str = this.A01;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        String str = this.A02;
        String A00 = AbE.A00(224);
        Integer num = this.A00;
        return 0Pz.A11("InboxSourceLoggingData(serviceType=", str, A00, num != null ? A00(num) : "null", ", categoryId=", this.A01);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A02);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(A00(num));
        }
        parcel.writeString(this.A01);
    }
}
