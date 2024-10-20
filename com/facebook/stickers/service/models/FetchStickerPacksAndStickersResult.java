package com.facebook.stickers.service.models;

import X.1BK;
import X.AbN;
import X.AnonymousClass001;
import X.FKe;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.Sticker;
import com.facebook.stickers.model.StickerPack;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: FetchStickerPacksAndStickersResult.class */
public final class FetchStickerPacksAndStickersResult implements Parcelable {
    public static final FetchStickerPacksAndStickersResult A02 = new FetchStickerPacksAndStickersResult(null, null);
    public static final Parcelable.Creator CREATOR = new FKe(47);
    public final ImmutableList A00;
    public final ImmutableMap A01;

    public FetchStickerPacksAndStickersResult(Parcel parcel) {
        this.A00 = AbN.A0e(parcel, StickerPack.class);
        HashMap readHashMap = parcel.readHashMap(Sticker.class.getClassLoader());
        ImmutableMap.Builder A0c = 1BK.A0c();
        Iterator A0x = AnonymousClass001.A0x(readHashMap);
        while (A0x.hasNext()) {
            Map.Entry A0z = AnonymousClass001.A0z(A0x);
            A0c.put(A0z.getKey(), ImmutableList.copyOf((Collection) A0z.getValue()));
        }
        this.A01 = A0c.build();
    }

    public FetchStickerPacksAndStickersResult(ImmutableMap immutableMap, List list) {
        this.A00 = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
        this.A01 = immutableMap != null ? ImmutableMap.copyOf((Map) immutableMap) : RegularImmutableMap.A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A00);
        parcel.writeMap(this.A01);
    }
}
