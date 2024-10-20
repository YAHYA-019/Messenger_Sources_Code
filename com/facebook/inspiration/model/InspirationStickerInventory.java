package com.facebook.inspiration.model;

import X.0Q8;
import X.11T;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbI;
import X.AbL;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.DKG;
import X.EpV;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ipc.stories.model.reactionsticker.ReactionStickerModel;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;

/* loaded from: InspirationStickerInventory.class */
public final class InspirationStickerInventory implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKf.A01(66);
    public final SubscribeStickerModel A00;
    public final ImmutableList A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final ImmutableList A04;
    public final ImmutableList A05;

    /* loaded from: InspirationStickerInventory$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            EpV epV = new EpV();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1959446301:
                                if (A1C.equals("weekday_fun_sticker_models")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationWeekdayStickerModel.class);
                                    epV.A04 = A00;
                                    C1pq.A08("weekdayFunStickerModels", A00);
                                    break;
                                }
                                break;
                            case -1387480669:
                                if (A1C.equals("weekday_sticker_models")) {
                                    ImmutableList A002 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationWeekdayStickerModel.class);
                                    epV.A05 = A002;
                                    C1pq.A08("weekdayStickerModels", A002);
                                    break;
                                }
                                break;
                            case -885512803:
                                if (A1C.equals("static_sticker_models")) {
                                    ImmutableList A003 = AbstractC11224vw.A00(abstractC01033pi, c27t, InspirationStaticStickerModel.class);
                                    epV.A03 = A003;
                                    C1pq.A08("staticStickerModels", A003);
                                    break;
                                }
                                break;
                            case -860198030:
                                if (A1C.equals("subscribe_sticker_model")) {
                                    epV.A00 = (SubscribeStickerModel) AbstractC11224vw.A02(abstractC01033pi, c27t, SubscribeStickerModel.class);
                                    break;
                                }
                                break;
                            case 170970242:
                                if (A1C.equals("reaction_sticker_models")) {
                                    ImmutableList A004 = AbstractC11224vw.A00(abstractC01033pi, c27t, ReactionStickerModel.class);
                                    epV.A02 = A004;
                                    C1pq.A08("reactionStickerModels", A004);
                                    break;
                                }
                                break;
                            case 1576248878:
                                if (A1C.equals("live_bloks_stickers_models")) {
                                    epV.A01 = AbstractC11224vw.A00(abstractC01033pi, c27t, LiveBloksStickersModel.class);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationStickerInventory.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationStickerInventory(epV);
        }
    }

    /* loaded from: InspirationStickerInventory$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationStickerInventory inspirationStickerInventory = (InspirationStickerInventory) obj;
            r302.A0b();
            AbstractC11224vw.A06(r302, c26c, "live_bloks_stickers_models", inspirationStickerInventory.A01);
            AbstractC11224vw.A06(r302, c26c, "reaction_sticker_models", inspirationStickerInventory.A02);
            AbstractC11224vw.A06(r302, c26c, "static_sticker_models", inspirationStickerInventory.A03);
            AbstractC11224vw.A05(r302, c26c, inspirationStickerInventory.A00, "subscribe_sticker_model");
            AbstractC11224vw.A06(r302, c26c, "weekday_fun_sticker_models", inspirationStickerInventory.A04);
            AbstractC11224vw.A06(r302, c26c, "weekday_sticker_models", inspirationStickerInventory.A05);
            r302.A0Y();
        }
    }

    public InspirationStickerInventory(EpV epV) {
        this.A01 = epV.A01;
        ImmutableList immutableList = epV.A02;
        C1pq.A08("reactionStickerModels", immutableList);
        this.A02 = immutableList;
        ImmutableList immutableList2 = epV.A03;
        C1pq.A08("staticStickerModels", immutableList2);
        this.A03 = immutableList2;
        this.A00 = epV.A00;
        ImmutableList immutableList3 = epV.A04;
        C1pq.A08("weekdayFunStickerModels", immutableList3);
        this.A04 = immutableList3;
        ImmutableList immutableList4 = epV.A05;
        C1pq.A08("weekdayStickerModels", immutableList4);
        this.A05 = immutableList4;
    }

    public InspirationStickerInventory(Parcel parcel) {
        ClassLoader A0e = 4YV.A0e(this);
        SubscribeStickerModel subscribeStickerModel = null;
        int i = 0;
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            int readInt = parcel.readInt();
            LiveBloksStickersModel[] liveBloksStickersModelArr = new LiveBloksStickersModel[readInt];
            int i2 = 0;
            while (i2 < readInt) {
                i2 = AbI.A01(parcel, A0e, liveBloksStickersModelArr, i2);
            }
            this.A01 = ImmutableList.copyOf(liveBloksStickersModelArr);
        }
        int readInt2 = parcel.readInt();
        ReactionStickerModel[] reactionStickerModelArr = new ReactionStickerModel[readInt2];
        int i3 = 0;
        while (i3 < readInt2) {
            i3 = DKG.A02(parcel, ReactionStickerModel.CREATOR, reactionStickerModelArr, i3);
        }
        this.A02 = ImmutableList.copyOf(reactionStickerModelArr);
        int readInt3 = parcel.readInt();
        InspirationStaticStickerModel[] inspirationStaticStickerModelArr = new InspirationStaticStickerModel[readInt3];
        int i4 = 0;
        while (i4 < readInt3) {
            i4 = AbI.A01(parcel, A0e, inspirationStaticStickerModelArr, i4);
        }
        this.A03 = ImmutableList.copyOf(inspirationStaticStickerModelArr);
        this.A00 = parcel.readInt() != 0 ? (SubscribeStickerModel) parcel.readParcelable(A0e) : subscribeStickerModel;
        int readInt4 = parcel.readInt();
        InspirationWeekdayStickerModel[] inspirationWeekdayStickerModelArr = new InspirationWeekdayStickerModel[readInt4];
        int i5 = 0;
        while (i5 < readInt4) {
            i5 = AbI.A01(parcel, A0e, inspirationWeekdayStickerModelArr, i5);
        }
        this.A04 = ImmutableList.copyOf(inspirationWeekdayStickerModelArr);
        int readInt5 = parcel.readInt();
        InspirationWeekdayStickerModel[] inspirationWeekdayStickerModelArr2 = new InspirationWeekdayStickerModel[readInt5];
        while (i < readInt5) {
            i = AbI.A01(parcel, A0e, inspirationWeekdayStickerModelArr2, i);
        }
        this.A05 = ImmutableList.copyOf(inspirationWeekdayStickerModelArr2);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationStickerInventory)) {
                return false;
            }
            InspirationStickerInventory inspirationStickerInventory = (InspirationStickerInventory) obj;
            if (!11T.A0O(this.A01, inspirationStickerInventory.A01) || !11T.A0O(this.A02, inspirationStickerInventory.A02) || !11T.A0O(this.A03, inspirationStickerInventory.A03) || !11T.A0O(this.A00, inspirationStickerInventory.A00) || !11T.A0O(this.A04, inspirationStickerInventory.A04) || !11T.A0O(this.A05, inspirationStickerInventory.A05)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A05, C1pq.A04(this.A04, C1pq.A04(this.A00, C1pq.A04(this.A03, C1pq.A04(this.A02, C1pq.A03(this.A01))))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableList immutableList = this.A01;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            1Du A0Y = AbL.A0Y(parcel, immutableList);
            while (A0Y.hasNext()) {
                parcel.writeParcelable((LiveBloksStickersModel) A0Y.next(), i);
            }
        }
        1Du A0b = 1BL.A0b(parcel, this.A02);
        while (A0b.hasNext()) {
            ((ReactionStickerModel) A0b.next()).writeToParcel(parcel, i);
        }
        1Du A0b2 = 1BL.A0b(parcel, this.A03);
        while (A0b2.hasNext()) {
            parcel.writeParcelable((InspirationStaticStickerModel) A0b2.next(), i);
        }
        C3o5.A0d(parcel, this.A00, i);
        1Du A0b3 = 1BL.A0b(parcel, this.A04);
        while (A0b3.hasNext()) {
            parcel.writeParcelable((InspirationWeekdayStickerModel) A0b3.next(), i);
        }
        1Du A0b4 = 1BL.A0b(parcel, this.A05);
        while (A0b4.hasNext()) {
            parcel.writeParcelable((InspirationWeekdayStickerModel) A0b4.next(), i);
        }
    }
}
