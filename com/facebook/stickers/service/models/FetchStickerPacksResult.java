package com.facebook.stickers.service.models;

import X.1BK;
import X.4YV;
import X.FKe;
import X.H9k;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.stickers.model.StickerPack;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: FetchStickerPacksResult.class */
public final class FetchStickerPacksResult implements Parcelable {
    public final Optional A00;
    public final Optional A01;
    public static final FetchStickerPacksResult A03 = new FetchStickerPacksResult(null, null);
    public static final FetchStickerPacksResult A04 = new FetchStickerPacksResult(null, null);
    public static final FetchStickerPacksResult A02 = new FetchStickerPacksResult(null, null);
    public static final Parcelable.Creator CREATOR = FKe.A00(51);

    public FetchStickerPacksResult(Parcel parcel) {
        Optional optional;
        ArrayList A0y = 4YV.A0y(parcel, StickerPack.class);
        this.A00 = A0y != null ? 1BK.A0a(ImmutableList.copyOf((Collection) A0y)) : Absent.INSTANCE;
        HashMap readHashMap = parcel.readHashMap(H9k.class.getClassLoader());
        if (readHashMap != null) {
            ImmutableMap.Builder A0c = 1BK.A0c();
            A0c.putAll(readHashMap);
            optional = 1BK.A0a(A0c.build());
        } else {
            optional = Absent.INSTANCE;
        }
        this.A01 = optional;
    }

    public FetchStickerPacksResult(List list, Map map) {
        this.A00 = list != null ? 1BK.A0a(ImmutableList.copyOf((Collection) list)) : Absent.INSTANCE;
        this.A01 = map != null ? 1BK.A0a(ImmutableMap.copyOf(map)) : Absent.INSTANCE;
    }

    public Optional A00(StickerPack stickerPack) {
        String str = stickerPack.A0B;
        Optional optional = this.A01;
        return (optional.isPresent() && ((ImmutableMap) optional.get()).containsKey(str)) ? 1BK.A0a(((ImmutableMap) optional.get()).get(str)) : Absent.INSTANCE;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList((List) this.A00.orNull());
        parcel.writeMap((Map) this.A01.orNull());
    }
}
