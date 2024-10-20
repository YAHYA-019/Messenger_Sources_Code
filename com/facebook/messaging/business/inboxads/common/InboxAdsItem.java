package com.facebook.messaging.business.inboxads.common;

import X.11T;
import X.2UP;
import X.2UQ;
import X.2UR;
import X.2hJ;
import X.C1pq;
import X.C2xc;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.business.common.calltoaction.model.AdCallToAction;
import com.facebook.user.model.User;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/* loaded from: InboxAdsItem.class */
public final class InboxAdsItem extends 2UP implements Parcelable {
    public static final ImmutableList A01 = ImmutableList.of();
    public static final Parcelable.Creator CREATOR = new C2xc(12);
    public InboxAdsData A00;

    public 2hJ AsW() {
        return 2hJ.A0a;
    }

    public String BKC() {
        return "MESSENGER_ADS_ITEM";
    }

    public void BP7(int i) {
        super/*X.2UQ*/.BP7(i);
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < this.A00.A07().size(); i2++) {
            InboxAdsMediaInfo inboxAdsMediaInfo = (InboxAdsMediaInfo) this.A00.A07().get(i2);
            inboxAdsMediaInfo.getClass();
            ImmutableList immutableList = inboxAdsMediaInfo.A07;
            String str = inboxAdsMediaInfo.A09;
            String str2 = inboxAdsMediaInfo.A0A;
            String str3 = inboxAdsMediaInfo.A0B;
            String str4 = inboxAdsMediaInfo.A0C;
            long j = inboxAdsMediaInfo.A03;
            ImmutableList immutableList2 = inboxAdsMediaInfo.A08;
            double d = inboxAdsMediaInfo.A00;
            AdCallToAction adCallToAction = inboxAdsMediaInfo.A04;
            String str5 = inboxAdsMediaInfo.A0D;
            String str6 = inboxAdsMediaInfo.A0E;
            int i3 = i2;
            arrayList.add(i3, new InboxAdsMediaInfo(adCallToAction, inboxAdsMediaInfo.A05, inboxAdsMediaInfo.A06, immutableList, immutableList2, str, str2, str3, str4, str5, str6, inboxAdsMediaInfo.A0F, inboxAdsMediaInfo.A0G, inboxAdsMediaInfo.A0H, new HashSet(inboxAdsMediaInfo.A0I), d, i, inboxAdsMediaInfo.A02, j, inboxAdsMediaInfo.A0J));
        }
        InboxAdsData inboxAdsData = this.A00;
        inboxAdsData.getClass();
        Uri uri = inboxAdsData.A00;
        Uri uri2 = inboxAdsData.A01;
        Uri uri3 = inboxAdsData.A02;
        String str7 = inboxAdsData.A0E;
        Uri uri4 = inboxAdsData.A03;
        Uri uri5 = inboxAdsData.A04;
        ImmutableList immutableList3 = inboxAdsData.A08;
        String str8 = inboxAdsData.A0F;
        String str9 = inboxAdsData.A0G;
        Boolean bool = inboxAdsData.A0A;
        Boolean bool2 = inboxAdsData.A0B;
        Boolean bool3 = inboxAdsData.A0C;
        User user = inboxAdsData.A06;
        String str10 = inboxAdsData.A0H;
        ImmutableList immutableList4 = inboxAdsData.A09;
        Boolean bool4 = inboxAdsData.A0D;
        InboxAdsImage inboxAdsImage = inboxAdsData.A05;
        String str11 = inboxAdsData.A0I;
        String str12 = inboxAdsData.A0J;
        HashSet hashSet = new HashSet(inboxAdsData.A0K);
        ImmutableList copyOf = ImmutableList.copyOf((Collection) arrayList);
        C1pq.A08("adMediaInfos", copyOf);
        if (!hashSet.contains("adMediaInfos")) {
            HashSet hashSet2 = new HashSet(hashSet);
            hashSet = hashSet2;
            hashSet2.add("adMediaInfos");
        }
        this.A00 = new InboxAdsData(uri, uri2, uri3, uri4, uri5, inboxAdsImage, user, copyOf, immutableList3, immutableList4, bool, bool2, bool3, bool4, str7, str8, str9, str10, str11, str12, hashSet);
    }

    public boolean BVb(2UR r302) {
        if (r302.getClass() != InboxAdsItem.class) {
            return false;
        }
        return Objects.equal(this.A00.A0E, ((InboxAdsItem) r302).A00.A0E);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeSerializable(((2UQ) this).A00);
        parcel.writeParcelable(Auq(), i);
        parcel.writeParcelable(((2UP) this).A00, i);
        parcel.writeParcelable(this.A00, i);
    }
}
