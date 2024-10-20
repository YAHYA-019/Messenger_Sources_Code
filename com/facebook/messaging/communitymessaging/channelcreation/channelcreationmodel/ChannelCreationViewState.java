package com.facebook.messaging.communitymessaging.channelcreation.channelcreationmodel;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zN;
import X.7zP;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C04v;
import X.C3o5;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.communitymessaging.model.CommunityChannelPrivacyType;
import com.facebook.messaging.communitymessaging.model.MessengerApprovalMode;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.util.List;

/* loaded from: ChannelCreationViewState.class */
public final class ChannelCreationViewState extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(58);
    public final ChannelCreationRequestStatus A00;
    public final CommunityChannelPrivacyType A01;
    public final MessengerApprovalMode A02;
    public final Long A03;
    public final Long A04;
    public final Long A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;

    public ChannelCreationViewState(ChannelCreationRequestStatus channelCreationRequestStatus, CommunityChannelPrivacyType communityChannelPrivacyType, MessengerApprovalMode messengerApprovalMode, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, String str6, List list, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        1BL.A1F(str, communityChannelPrivacyType);
        11T.A0F(str2, 6);
        11T.A0F(list, 12);
        11T.A0F(messengerApprovalMode, 16);
        11T.A0F(channelCreationRequestStatus, 17);
        this.A0B = str;
        this.A01 = communityChannelPrivacyType;
        this.A0I = z;
        this.A0J = z2;
        this.A0E = z3;
        this.A0C = str2;
        this.A07 = str3;
        this.A09 = str4;
        this.A04 = l;
        this.A03 = l2;
        this.A08 = str5;
        this.A0D = list;
        this.A0H = z4;
        this.A0F = z5;
        this.A0G = z6;
        this.A02 = messengerApprovalMode;
        this.A00 = channelCreationRequestStatus;
        this.A05 = l3;
        this.A06 = l4;
        this.A0A = str6;
    }

    public static /* synthetic */ ChannelCreationViewState A01(ChannelCreationRequestStatus channelCreationRequestStatus, ChannelCreationViewState channelCreationViewState, CommunityChannelPrivacyType communityChannelPrivacyType, MessengerApprovalMode messengerApprovalMode, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        String str6 = str5;
        Long l5 = l4;
        Long l6 = l3;
        ChannelCreationRequestStatus channelCreationRequestStatus2 = channelCreationRequestStatus;
        MessengerApprovalMode messengerApprovalMode2 = messengerApprovalMode;
        String str7 = str;
        CommunityChannelPrivacyType communityChannelPrivacyType2 = communityChannelPrivacyType;
        boolean z7 = z2;
        boolean z8 = z;
        boolean z9 = z3;
        String str8 = str2;
        String str9 = str3;
        String str10 = str4;
        Long l7 = l;
        boolean z10 = z4;
        Long l8 = l2;
        boolean z11 = z5;
        boolean z12 = z6;
        List list = null;
        if ((i & 1) != 0) {
            str7 = channelCreationViewState.A0B;
        }
        if ((i & 2) != 0) {
            communityChannelPrivacyType2 = channelCreationViewState.A01;
        }
        if ((i & 4) != 0) {
            z8 = channelCreationViewState.A0I;
        }
        if ((i & 8) != 0) {
            z7 = channelCreationViewState.A0J;
        }
        if ((i & 16) != 0) {
            z9 = channelCreationViewState.A0E;
        }
        if ((i & 32) != 0) {
            str8 = channelCreationViewState.A0C;
        }
        if ((i & 64) != 0) {
            str9 = channelCreationViewState.A07;
        }
        if ((i & 128) != 0) {
            str10 = channelCreationViewState.A09;
        }
        if ((i & 256) != 0) {
            l7 = channelCreationViewState.A04;
        }
        if ((i & 512) != 0) {
            l8 = channelCreationViewState.A03;
        }
        String str11 = (i & 1024) != 0 ? channelCreationViewState.A08 : null;
        if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            list = channelCreationViewState.A0D;
        }
        if ((i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
            z10 = channelCreationViewState.A0H;
        }
        if ((i & 8192) != 0) {
            z11 = channelCreationViewState.A0F;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            z12 = channelCreationViewState.A0G;
        }
        if ((32768 & i) != 0) {
            messengerApprovalMode2 = channelCreationViewState.A02;
        }
        if ((65536 & i) != 0) {
            channelCreationRequestStatus2 = channelCreationViewState.A00;
        }
        if ((131072 & i) != 0) {
            l6 = channelCreationViewState.A05;
        }
        if ((262144 & i) != 0) {
            l5 = channelCreationViewState.A06;
        }
        if ((i & Constants.LOAD_RESULT_WITH_VDEX_ODEX) != 0) {
            str6 = channelCreationViewState.A0A;
        }
        11T.A0H(str7, communityChannelPrivacyType2);
        7zP.A1O(str8, 5, list);
        11T.A0F(messengerApprovalMode2, 15);
        11T.A0F(channelCreationRequestStatus2, 16);
        return new ChannelCreationViewState(channelCreationRequestStatus2, communityChannelPrivacyType2, messengerApprovalMode2, l7, l8, l6, l5, str7, str8, str9, str10, str11, str6, list, z8, z7, z9, z10, z11, z12);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ChannelCreationViewState)) {
                return false;
            }
            ChannelCreationViewState channelCreationViewState = (ChannelCreationViewState) obj;
            if (!11T.A0O(this.A0B, channelCreationViewState.A0B) || this.A01 != channelCreationViewState.A01 || this.A0I != channelCreationViewState.A0I || this.A0J != channelCreationViewState.A0J || this.A0E != channelCreationViewState.A0E || !11T.A0O(this.A0C, channelCreationViewState.A0C) || !11T.A0O(this.A07, channelCreationViewState.A07) || !11T.A0O(this.A09, channelCreationViewState.A09) || !11T.A0O(this.A04, channelCreationViewState.A04) || !11T.A0O(this.A03, channelCreationViewState.A03) || !11T.A0O(this.A08, channelCreationViewState.A08) || !11T.A0O(this.A0D, channelCreationViewState.A0D) || this.A0H != channelCreationViewState.A0H || this.A0F != channelCreationViewState.A0F || this.A0G != channelCreationViewState.A0G || this.A02 != channelCreationViewState.A02 || this.A00 != channelCreationViewState.A00 || !11T.A0O(this.A05, channelCreationViewState.A05) || !11T.A0O(this.A06, channelCreationViewState.A06) || !11T.A0O(this.A0A, channelCreationViewState.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return ((((AnonymousClass002.A05(this.A00, AnonymousClass002.A05(this.A02, (((((AnonymousClass002.A05(this.A0D, (((((((((AnonymousClass002.A07(this.A0C, (((((AnonymousClass002.A05(this.A01, 4YV.A02(this.A0B)) + AnonymousClass002.A00(this.A0I ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0J ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0E ? 1 : 0)) * 31) + 1BL.A05(this.A07)) * 31) + 1BL.A05(this.A09)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + 1BL.A05(this.A08)) * 31) + AnonymousClass002.A00(this.A0H ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0F ? 1 : 0)) * 31) + AnonymousClass002.A00(this.A0G ? 1 : 0)) * 31)) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + 7zN.A05(this.A0A);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A0B);
        1BL.A12(parcel, this.A01);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A07);
        parcel.writeString(this.A09);
        C3o5.A0g(parcel, this.A04);
        C3o5.A0g(parcel, this.A03);
        parcel.writeString(this.A08);
        parcel.writeStringList(this.A0D);
        parcel.writeInt(this.A0H ? 1 : 0);
        parcel.writeInt(this.A0F ? 1 : 0);
        parcel.writeInt(this.A0G ? 1 : 0);
        parcel.writeParcelable(this.A02, i);
        this.A00.writeToParcel(parcel, i);
        C3o5.A0g(parcel, this.A05);
        C3o5.A0g(parcel, this.A06);
        parcel.writeString(this.A0A);
    }
}
