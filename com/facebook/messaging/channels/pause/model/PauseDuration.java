package com.facebook.messaging.channels.pause.model;

import X.7zU;
import X.C00t;
import X.CSW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PauseDuration.class */
public final class PauseDuration implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PauseDuration[] A01;
    public static final PauseDuration A02;
    public static final PauseDuration A03;
    public static final PauseDuration A04;
    public static final PauseDuration A05;
    public static final PauseDuration A06;
    public static final Parcelable.Creator CREATOR;
    public final int durationHr;
    public final int pauseOrdinal;

    static {
        PauseDuration pauseDuration = new PauseDuration("DURATION_INDEFINITE", 0, -1, -1);
        A06 = pauseDuration;
        PauseDuration pauseDuration2 = new PauseDuration("DURATION_1HR", 1, 1, 1);
        A02 = pauseDuration2;
        PauseDuration pauseDuration3 = new PauseDuration("DURATION_4HRS", 2, 4, 2);
        A04 = pauseDuration3;
        PauseDuration pauseDuration4 = new PauseDuration("DURATION_8HRS", 3, 8, 3);
        A05 = pauseDuration4;
        PauseDuration pauseDuration5 = new PauseDuration("DURATION_24HRS", 4, 24, 4);
        A03 = pauseDuration5;
        PauseDuration[] pauseDurationArr = {pauseDuration, pauseDuration2, pauseDuration3, pauseDuration4, pauseDuration5, new PauseDuration("DURATION_48HRS", 5, 48, 5)};
        A01 = pauseDurationArr;
        A00 = C00t.A00(pauseDurationArr);
        CREATOR = CSW.A00(48);
    }

    public PauseDuration(String str, int i, int i2, int i3) {
        this.durationHr = i2;
        this.pauseOrdinal = i3;
    }

    public static PauseDuration valueOf(String str) {
        return (PauseDuration) Enum.valueOf(PauseDuration.class, str);
    }

    public static PauseDuration[] values() {
        return (PauseDuration[]) A01.clone();
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
