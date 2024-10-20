package com.facebook.iabeventlogging.model;

import X.AnonymousClass001;
import X.DKH;
import X.KOk;
import android.os.Parcel;

/* loaded from: IABHistoryInteractionEvent.class */
public final class IABHistoryInteractionEvent extends IABEvent {
    public final Integer A00;
    public final String A01;

    public IABHistoryInteractionEvent(Integer num, String str, String str2, long j, long j2) {
        super(KOk.A0A, str, j, j2);
        this.A00 = num;
        this.A01 = str2;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 0:
                return "SETTINGS_CLEAR_ERROR";
            case 1:
                return "SETTINGS_CLEAR_CANCEL_CLICKED";
            case 2:
                return "SETTINGS_CLEAR_CLICKED";
            case 3:
                return "SETTINGS_CLEAR_CONFIRM_CLICKED";
            case 4:
                return "SETTINGS_DATA_POLICY_CLICKED";
            case 5:
                return "SETTINGS_LINK_HISTORY_SWITCH_TOGGLED_OFF_CLICKED";
            case 6:
                return "SETTINGS_LINK_HISTORY_SWITCH_TOGGLED_ON_CLICKED";
            case 7:
                return "VIEW_LINK_HISTORY_OVERFLOW_ITEM_CLICKED";
            case 8:
                return "VIEW_LINK_HISTORY_FOOTER_ICON_CLICKED";
            case 9:
                return "OPT_IN_UI_SHOW";
            case 10:
                return "OPT_IN_NUX_UI_SKIP";
            case 11:
                return "TOOLTIP_SHOWN";
            case 12:
                return "TOOLTIP_DISMISSED";
            case 13:
                return "OPT_IN_UI_STATUS_READ_STARTED";
            case 14:
                return "OPT_IN_UI_STATUS_READ_FINISHED";
            case 15:
                return "OPT_IN_UI_STATUS_READ_ERROR";
            case 16:
                return "HISTORY_WRITE_STARTED";
            case 17:
                return "HISTORY_WRITE_FINISHED";
            case 18:
                return "HISTORY_WRITE_ERROR";
            default:
                return "INCORRECT_TYPE";
        }
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("IABHistoryInteractionEvent{");
        A0o.append("interaction='");
        A0o.append(A00(this.A00));
        A0o.append('\'');
        DKH.A1I(this, ", type=", A0o);
        A0o.append(this.A03);
        A0o.append('\'');
        A0o.append(", eventTs=");
        A0o.append(super.A01);
        A0o.append(", createdAtTs=");
        A0o.append(super.A00);
        A0o.append(", errorMessage=");
        A0o.append(this.A01);
        return AnonymousClass001.A0f(A0o);
    }

    @Override // com.facebook.iabeventlogging.model.IABEvent, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(A00(this.A00));
        parcel.writeString(this.A01);
    }
}
