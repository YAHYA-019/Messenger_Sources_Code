package com.facebook.messaging.communitymessaging.communitycreation.communitycreationmodel;

import X.11T;
import X.1BL;
import X.4YV;
import X.7zN;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.BMB;
import X.C04v;
import X.C3o5;
import X.CSW;
import X.EnumC3499Mfu;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.common.dextricks.Constants;
import com.facebook.messaging.communitymessaging.model.CommunityCreationStatus;
import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import com.facebook.ui.media.attachments.model.MediaResource;
import java.util.Iterator;
import java.util.List;

/* loaded from: CommunityCreationState.class */
public final class CommunityCreationState extends C04v implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSW.A00(63);
    public final EnumC3499Mfu A00;
    public final BMB A01;
    public final CommunityCreationStatus A02;
    public final MediaResource A03;
    public final Long A04;
    public final Long A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final List A0C;
    public final boolean A0D;
    public final Long A0E;

    public CommunityCreationState(EnumC3499Mfu enumC3499Mfu, BMB bmb, CommunityCreationStatus communityCreationStatus, MediaResource mediaResource, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, List list, boolean z) {
        1BL.A1F(str, communityCreationStatus);
        11T.A0F(enumC3499Mfu, 14);
        this.A08 = str;
        this.A02 = communityCreationStatus;
        this.A07 = str2;
        this.A04 = l;
        this.A05 = l2;
        this.A0E = l3;
        this.A0B = str3;
        this.A01 = bmb;
        this.A09 = str4;
        this.A03 = mediaResource;
        this.A0C = list;
        this.A0D = z;
        this.A06 = l4;
        this.A00 = enumC3499Mfu;
        this.A0A = str5;
    }

    public static /* synthetic */ CommunityCreationState A00(EnumC3499Mfu enumC3499Mfu, CommunityCreationState communityCreationState, BMB bmb, CommunityCreationStatus communityCreationStatus, MediaResource mediaResource, Long l, Long l2, Long l3, Long l4, String str, String str2, String str3, String str4, String str5, List list, int i, boolean z) {
        String str6 = str5;
        String str7 = str;
        CommunityCreationStatus communityCreationStatus2 = communityCreationStatus;
        boolean z2 = z;
        String str8 = str2;
        Long l5 = l;
        Long l6 = l2;
        Long l7 = l3;
        String str9 = str3;
        BMB bmb2 = bmb;
        String str10 = str4;
        MediaResource mediaResource2 = mediaResource;
        List list2 = list;
        Long l8 = l4;
        if ((i & 1) != 0) {
            str7 = communityCreationState.A08;
        }
        if ((i & 2) != 0) {
            communityCreationStatus2 = communityCreationState.A02;
        }
        if ((i & 4) != 0) {
            str8 = communityCreationState.A07;
        }
        if ((i & 8) != 0) {
            l5 = communityCreationState.A04;
        }
        if ((i & 16) != 0) {
            l6 = communityCreationState.A05;
        }
        if ((i & 32) != 0) {
            l7 = communityCreationState.A0E;
        }
        if ((i & 64) != 0) {
            str9 = communityCreationState.A0B;
        }
        if ((i & 128) != 0) {
            bmb2 = communityCreationState.A01;
        }
        if ((i & 256) != 0) {
            str10 = communityCreationState.A09;
        }
        if ((i & 512) != 0) {
            mediaResource2 = communityCreationState.A03;
        }
        if ((i & 1024) != 0) {
            list2 = communityCreationState.A0C;
        }
        if ((i & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
            z2 = communityCreationState.A0D;
        }
        if ((i & RequestDefragmentingOutputStream.BODY_BUFFER_SIZE) != 0) {
            l8 = communityCreationState.A06;
        }
        if ((i & 8192) != 0) {
            enumC3499Mfu = communityCreationState.A00;
        }
        if ((i & Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET) != 0) {
            str6 = communityCreationState.A0A;
        }
        11T.A0H(str7, communityCreationStatus2);
        11T.A0F(list2, 10);
        11T.A0F(enumC3499Mfu, 13);
        return new CommunityCreationState(enumC3499Mfu, bmb2, communityCreationStatus2, mediaResource2, l5, l6, l7, l8, str7, str8, str9, str10, str6, list2, z2);
    }

    public static /* synthetic */ CommunityCreationState A01(EnumC3499Mfu enumC3499Mfu, CommunityCreationState communityCreationState, String str, int i) {
        return A00(enumC3499Mfu, communityCreationState, null, null, null, null, null, null, null, null, null, str, null, null, null, i, false);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof CommunityCreationState)) {
                return false;
            }
            CommunityCreationState communityCreationState = (CommunityCreationState) obj;
            if (!11T.A0O(this.A08, communityCreationState.A08) || this.A02 != communityCreationState.A02 || !11T.A0O(this.A07, communityCreationState.A07) || !11T.A0O(this.A04, communityCreationState.A04) || !11T.A0O(this.A05, communityCreationState.A05) || !11T.A0O(this.A0E, communityCreationState.A0E) || !11T.A0O(this.A0B, communityCreationState.A0B) || this.A01 != communityCreationState.A01 || !11T.A0O(this.A09, communityCreationState.A09) || !11T.A0O(this.A03, communityCreationState.A03) || !11T.A0O(this.A0C, communityCreationState.A0C) || this.A0D != communityCreationState.A0D || !11T.A0O(this.A06, communityCreationState.A06) || this.A00 != communityCreationState.A00 || !11T.A0O(this.A0A, communityCreationState.A0A)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A05(this.A00, (((AnonymousClass002.A05(this.A0C, (((((((((((((((AnonymousClass002.A05(this.A02, 4YV.A02(this.A08)) + 1BL.A05(this.A07)) * 31) + AnonymousClass001.A02(this.A04)) * 31) + AnonymousClass001.A02(this.A05)) * 31) + AnonymousClass001.A02(this.A0E)) * 31) + 1BL.A05(this.A0B)) * 31) + AnonymousClass001.A02(this.A01)) * 31) + 1BL.A05(this.A09)) * 31) + AnonymousClass001.A02(this.A03)) * 31) + AnonymousClass002.A00(this.A0D ? 1 : 0)) * 31) + AnonymousClass001.A02(this.A06)) * 31) + 7zN.A05(this.A0A);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        C3o5.A0g(parcel, this.A04);
        C3o5.A0g(parcel, this.A05);
        C3o5.A0g(parcel, this.A0E);
        parcel.writeString(this.A0B);
        BMB bmb = this.A01;
        if (bmb == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1BL.A12(parcel, bmb);
        }
        parcel.writeString(this.A09);
        parcel.writeParcelable(this.A03, i);
        List list = this.A0C;
        parcel.writeInt(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((ChatTemplate) it.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A0D ? 1 : 0);
        C3o5.A0g(parcel, this.A06);
        1BL.A12(parcel, this.A00);
        parcel.writeString(this.A0A);
    }
}
