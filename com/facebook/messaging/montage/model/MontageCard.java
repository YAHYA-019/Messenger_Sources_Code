package com.facebook.messaging.montage.model;

import X.1Mu;
import X.48J;
import X.C4Ny;
import X.C53v;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attribution.ContentAppAttribution;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.montage.model.cards.MontageFeedbackOverlay;
import com.facebook.messaging.montage.model.montageattribution.MontageAttributionData;
import com.facebook.messaging.montage.model.montagemetadata.MontageMetadata;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.EmptyImmutableListMultimap;
import com.google.common.collect.HashMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: MontageCard.class */
public final class MontageCard implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C4Ny(23);
    public ContentAppAttribution A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final Message A06;
    public final 48J A07;
    public final MontageUser A08;
    public final MontageAttributionData A09;
    public final MontageMetadata A0A;
    public final ImmutableList A0B;
    public final ImmutableMap A0C;
    public final Long A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final ImmutableList A0O;
    public final ImmutableList A0P;
    public final ImmutableList A0Q;
    public final 1Mu A0R;
    public final boolean A0S;

    public MontageCard(Parcel parcel) {
        48J A07 = C53v.A07(parcel, 48J.class);
        A07.getClass();
        this.A07 = A07;
        boolean A0S = C53v.A0S(parcel);
        this.A0L = A0S;
        boolean A0S2 = C53v.A0S(parcel);
        this.A0S = A0S2;
        Message message = (Message) parcel.readParcelable(Message.class.getClassLoader());
        this.A06 = message;
        if (!A0S && !A0S2) {
            message.getClass();
        }
        this.A08 = (MontageUser) parcel.readParcelable(MontageUser.class.getClassLoader());
        this.A03 = parcel.readLong();
        this.A01 = parcel.readInt();
        this.A0E = parcel.readString();
        this.A05 = parcel.readLong();
        HashMultimap hashMultimap = new HashMultimap();
        C53v.A0F(parcel, hashMultimap);
        this.A0R = ImmutableListMultimap.A02(hashMultimap);
        this.A0H = parcel.readString();
        this.A0G = parcel.readString();
        Parcelable.Creator creator = MontageFeedbackOverlay.CREATOR;
        ArrayList arrayList = new ArrayList();
        parcel.readTypedList(arrayList, creator);
        this.A0Q = ImmutableList.copyOf((Collection) arrayList);
        this.A0A = (MontageMetadata) parcel.readParcelable(MontageMetadata.class.getClassLoader());
        this.A09 = (MontageAttributionData) parcel.readParcelable(MontageAttributionData.class.getClassLoader());
        Parcelable.Creator creator2 = Attachment.CREATOR;
        ArrayList arrayList2 = new ArrayList();
        parcel.readTypedList(arrayList2, creator2);
        this.A0O = ImmutableList.copyOf((Collection) arrayList2);
        Parcelable.Creator creator3 = MediaResource.CREATOR;
        ArrayList arrayList3 = new ArrayList();
        parcel.readTypedList(arrayList3, creator3);
        this.A0P = ImmutableList.copyOf((Collection) arrayList3);
        this.A0I = parcel.readString();
        this.A0F = parcel.readString();
        this.A0K = parcel.readString();
        this.A02 = parcel.readInt();
        this.A0D = parcel.readInt() == 1 ? Long.valueOf(parcel.readLong()) : null;
        this.A0J = parcel.readString();
        this.A00 = (ContentAppAttribution) parcel.readParcelable(ContentAppAttribution.class.getClassLoader());
        this.A0N = C53v.A0S(parcel);
        this.A04 = parcel.readLong();
        Parcelable.Creator creator4 = MontageUser.CREATOR;
        ArrayList arrayList4 = new ArrayList();
        parcel.readTypedList(arrayList4, creator4);
        this.A0B = ImmutableList.copyOf((Collection) arrayList4);
        this.A0M = C53v.A0S(parcel);
        this.A0C = C53v.A05(parcel);
    }

    public MontageCard(ContentAppAttribution contentAppAttribution, Message message, 48J r304, MontageUser montageUser, MontageAttributionData montageAttributionData, MontageMetadata montageMetadata, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, ImmutableMap immutableMap, 1Mu r313, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, int i2, long j, long j2, long j3, boolean z, boolean z2, boolean z3, boolean z4) {
        ImmutableList immutableList5 = immutableList4;
        r304.getClass();
        this.A0L = z3;
        this.A0S = z4;
        if (!z3 && !z4) {
            message.getClass();
        }
        Preconditions.checkArgument(j3 >= 0);
        this.A07 = r304;
        this.A06 = message;
        this.A08 = montageUser;
        this.A03 = j;
        this.A0E = str;
        this.A05 = j2;
        this.A0R = r313;
        this.A0H = str2;
        this.A0G = str3;
        this.A0Q = immutableList;
        this.A0A = montageMetadata;
        this.A09 = montageAttributionData;
        this.A0O = immutableList2;
        this.A0P = immutableList3;
        this.A0I = str4;
        this.A0F = str5;
        this.A0K = str6;
        this.A02 = i;
        this.A0D = l;
        this.A0J = str7;
        this.A00 = contentAppAttribution;
        this.A04 = j3;
        this.A0N = z;
        this.A0B = immutableList4 == null ? ImmutableList.of() : immutableList5;
        this.A0M = z2;
        this.A0C = immutableMap;
        this.A01 = i2;
    }

    public static boolean A00(List list, List list2) {
        if (list != list2) {
            if (list != null && list2 != null && list.size() == list2.size()) {
                int i = 0;
                while (true) {
                    int i2 = i;
                    if (i2 >= list.size()) {
                        break;
                    }
                    if (!list.get(i2).equals(list2.get(i2))) {
                        return false;
                    }
                    i = i2 + 1;
                }
            } else {
                return false;
            }
        }
        return true;
    }

    public ImmutableList A01() {
        ImmutableList immutableList = this.A0O;
        if (immutableList == null) {
            immutableList = ImmutableList.builder().build();
        }
        return immutableList;
    }

    public ImmutableList A02() {
        ImmutableList immutableList = this.A0P;
        if (immutableList == null) {
            immutableList = ImmutableList.builder().build();
        }
        return immutableList;
    }

    public ImmutableList A03() {
        ImmutableList immutableList = this.A0Q;
        if (immutableList == null) {
            immutableList = ImmutableList.builder().build();
        }
        return immutableList;
    }

    public 1Mu A04() {
        EmptyImmutableListMultimap emptyImmutableListMultimap = this.A0R;
        if (emptyImmutableListMultimap == null) {
            emptyImmutableListMultimap = ImmutableListMultimap.A00();
        }
        return emptyImmutableListMultimap;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return hashCode();
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            MontageCard montageCard = (MontageCard) obj;
            if (this.A07 != montageCard.A07 || !Objects.equal(this.A0E, montageCard.A0E) || this.A05 != montageCard.A05 || this.A03 != montageCard.A03 || this.A01 != montageCard.A01 || !Objects.equal(Integer.valueOf(this.A02), Integer.valueOf(montageCard.A02)) || this.A0N != montageCard.A0N || !Objects.equal(this.A0B, montageCard.A0B) || !Objects.equal(Boolean.valueOf(this.A0M), Boolean.valueOf(montageCard.A0M)) || !Objects.equal(this.A0Q, montageCard.A0Q)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A0E, Long.valueOf(this.A05), Long.valueOf(this.A03), Boolean.valueOf(this.A0N), Boolean.valueOf(this.A0M), this.A0B, Integer.valueOf(this.A01), this.A0Q});
    }

    public String toString() {
        return StringFormatUtil.formatStrLocaleSafe("%s card %s of bucketId %d", this.A07.name(), this.A0E, Long.valueOf(this.A03));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C53v.A0J(parcel, this.A07);
        parcel.writeInt(this.A0L ? 1 : 0);
        parcel.writeInt(this.A0S ? 1 : 0);
        parcel.writeParcelable(this.A06, i);
        parcel.writeParcelable(this.A08, i);
        parcel.writeLong(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeString(this.A0E);
        parcel.writeLong(this.A05);
        EmptyImmutableListMultimap emptyImmutableListMultimap = this.A0R;
        if (emptyImmutableListMultimap == null) {
            emptyImmutableListMultimap = ImmutableListMultimap.A00();
        }
        C53v.A0H(parcel, emptyImmutableListMultimap);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0G);
        parcel.writeTypedList(this.A0Q);
        parcel.writeParcelable(this.A0A, i);
        parcel.writeParcelable(this.A09, i);
        parcel.writeTypedList(this.A0O);
        parcel.writeTypedList(this.A0P);
        parcel.writeString(this.A0I);
        parcel.writeString(this.A0F);
        parcel.writeString(this.A0K);
        parcel.writeInt(this.A02);
        C53v.A0L(parcel, this.A0D);
        parcel.writeString(this.A0J);
        parcel.writeParcelable(this.A00, i);
        parcel.writeInt(this.A0N ? 1 : 0);
        parcel.writeLong(this.A04);
        parcel.writeTypedList(this.A0B);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeMap(this.A0C);
    }
}
