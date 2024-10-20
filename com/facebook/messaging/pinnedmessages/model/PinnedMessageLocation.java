package com.facebook.messaging.pinnedmessages.model;

import X.7zU;
import X.AbL;
import X.C00t;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PinnedMessageLocation.class */
public final class PinnedMessageLocation implements Parcelable {
    public static final Map A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ PinnedMessageLocation[] A02;
    public static final PinnedMessageLocation A03;
    public static final PinnedMessageLocation A04;
    public static final PinnedMessageLocation A05;
    public static final Parcelable.Creator CREATOR;
    public final Integer value;

    static {
        PinnedMessageLocation pinnedMessageLocation = new PinnedMessageLocation(null, "UNSET", 0);
        A05 = pinnedMessageLocation;
        PinnedMessageLocation pinnedMessageLocation2 = new PinnedMessageLocation(0, "THREAD_DETAILS_ONLY", 1);
        A03 = pinnedMessageLocation2;
        PinnedMessageLocation pinnedMessageLocation3 = new PinnedMessageLocation(1, "THREAD_VIEW_AND_DETAILS", 2);
        A04 = pinnedMessageLocation3;
        PinnedMessageLocation[] pinnedMessageLocationArr = {pinnedMessageLocation, pinnedMessageLocation2, pinnedMessageLocation3};
        A02 = pinnedMessageLocationArr;
        A01 = C00t.A00(pinnedMessageLocationArr);
        CREATOR = CSS.A00(13);
        PinnedMessageLocation[] values = values();
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbL.A00(values.length));
        for (PinnedMessageLocation pinnedMessageLocation4 : values) {
            linkedHashMap.put(pinnedMessageLocation4.value, pinnedMessageLocation4);
        }
        A00 = linkedHashMap;
    }

    public PinnedMessageLocation(Integer num, String str, int i) {
        this.value = num;
    }

    public static PinnedMessageLocation valueOf(String str) {
        return (PinnedMessageLocation) Enum.valueOf(PinnedMessageLocation.class, str);
    }

    public static PinnedMessageLocation[] values() {
        return (PinnedMessageLocation[]) A02.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        7zU.A11(parcel, this);
    }
}
