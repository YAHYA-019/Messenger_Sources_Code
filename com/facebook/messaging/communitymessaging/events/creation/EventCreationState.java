package com.facebook.messaging.communitymessaging.events.creation;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zM;
import X.7zN;
import X.7zP;
import X.7zR;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.messaging.location.model.NearbyPlace;
import java.util.Calendar;

/* loaded from: EventCreationState.class */
public final class EventCreationState extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(72);
    public final NearbyPlace A00;
    public final Integer A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Calendar A05;
    public final Calendar A06;
    public final Calendar A07;
    public final Calendar A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;

    public EventCreationState(NearbyPlace nearbyPlace, Integer num, String str, String str2, String str3, Calendar calendar, Calendar calendar2, Calendar calendar3, Calendar calendar4, boolean z, boolean z2, boolean z3) {
        1BL.A1F(str, calendar);
        11T.A0F(str3, 12);
        this.A03 = str;
        this.A08 = calendar;
        this.A07 = calendar2;
        this.A01 = num;
        this.A06 = calendar3;
        this.A05 = calendar4;
        this.A00 = nearbyPlace;
        this.A04 = str2;
        this.A0B = z;
        this.A09 = z2;
        this.A0A = z3;
        this.A02 = str3;
    }

    public static /* synthetic */ EventCreationState A00(EventCreationState eventCreationState, NearbyPlace nearbyPlace, Integer num, String str, String str2, String str3, Calendar calendar, Calendar calendar2, Calendar calendar3, Calendar calendar4, int i, boolean z) {
        String str4 = str3;
        boolean z2 = z;
        String str5 = str2;
        NearbyPlace nearbyPlace2 = nearbyPlace;
        Calendar calendar5 = calendar4;
        Calendar calendar6 = calendar3;
        Integer num2 = num;
        Calendar calendar7 = calendar2;
        Calendar calendar8 = calendar;
        String str6 = str;
        if ((i & 1) != 0) {
            str6 = eventCreationState.A03;
        }
        if ((i & 2) != 0) {
            calendar8 = eventCreationState.A08;
        }
        if ((i & 4) != 0) {
            calendar7 = eventCreationState.A07;
        }
        if ((i & 8) != 0) {
            num2 = eventCreationState.A01;
        }
        if ((i & 16) != 0) {
            calendar6 = eventCreationState.A06;
        }
        if ((i & 32) != 0) {
            calendar5 = eventCreationState.A05;
        }
        if ((i & 64) != 0) {
            nearbyPlace2 = eventCreationState.A00;
        }
        if ((i & 128) != 0) {
            str5 = eventCreationState.A04;
        }
        boolean z3 = (i & 256) != 0 ? eventCreationState.A0B : false;
        boolean z4 = (i & 512) != 0 ? eventCreationState.A09 : false;
        if ((i & 1024) != 0) {
            z2 = eventCreationState.A0A;
        }
        if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            str4 = eventCreationState.A02;
        }
        11T.A0H(str6, calendar8);
        7zP.A1O(num2, 3, str4);
        return new EventCreationState(nearbyPlace2, num2, str6, str5, str4, calendar8, calendar7, calendar6, calendar5, z3, z4, z2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof EventCreationState)) {
                return false;
            }
            EventCreationState eventCreationState = (EventCreationState) obj;
            if (!11T.A0O(this.A03, eventCreationState.A03) || !11T.A0O(this.A08, eventCreationState.A08) || !11T.A0O(this.A07, eventCreationState.A07) || this.A01 != eventCreationState.A01 || !11T.A0O(this.A06, eventCreationState.A06) || !11T.A0O(this.A05, eventCreationState.A05) || !11T.A0O(this.A00, eventCreationState.A00) || !11T.A0O(this.A04, eventCreationState.A04) || this.A0B != eventCreationState.A0B || this.A09 != eventCreationState.A09 || this.A0A != eventCreationState.A0A || !11T.A0O(this.A02, eventCreationState.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        String str;
        int A05 = (AnonymousClass002.A05(this.A08, 4YV.A02(this.A03)) + AnonymousClass001.A02(this.A07)) * 31;
        int intValue = this.A01.intValue();
        switch (intValue) {
            case 1:
                str = "LINK";
                break;
            case 2:
                str = "INPUT";
                break;
            default:
                str = "NOT_SHOWING";
                break;
        }
        return 7zM.A05(this.A02, (((((((((((((7zR.A07(str, intValue, A05) + AnonymousClass001.A02(this.A06)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A00)) * 31) + 7zN.A05(this.A04)) * 31) + AnonymousClass002.A00(this.A0B ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A09 ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0A ? 1 : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        11T.A0F(parcel, 0);
        parcel.writeString(this.A03);
        parcel.writeSerializable(this.A08);
        parcel.writeSerializable(this.A07);
        switch (this.A01.intValue()) {
            case 1:
                str = "LINK";
                break;
            case 2:
                str = "INPUT";
                break;
            default:
                str = "NOT_SHOWING";
                break;
        }
        parcel.writeString(str);
        parcel.writeSerializable(this.A06);
        parcel.writeSerializable(this.A05);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A09 ? 1 : 0);
        parcel.writeInt(this.A0A ? 1 : 0);
        parcel.writeString(this.A02);
    }
}
