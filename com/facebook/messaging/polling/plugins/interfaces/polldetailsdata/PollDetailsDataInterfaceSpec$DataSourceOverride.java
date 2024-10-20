package com.facebook.messaging.polling.plugins.interfaces.polldetailsdata;

import X.7zU;
import X.C00t;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PollDetailsDataInterfaceSpec$DataSourceOverride.class */
public final class PollDetailsDataInterfaceSpec$DataSourceOverride implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PollDetailsDataInterfaceSpec$DataSourceOverride[] A01;
    public static final PollDetailsDataInterfaceSpec$DataSourceOverride A02;
    public static final PollDetailsDataInterfaceSpec$DataSourceOverride A03;
    public static final Parcelable.Creator CREATOR;

    static {
        PollDetailsDataInterfaceSpec$DataSourceOverride pollDetailsDataInterfaceSpec$DataSourceOverride = new PollDetailsDataInterfaceSpec$DataSourceOverride("POLLS_V2", 0);
        A03 = pollDetailsDataInterfaceSpec$DataSourceOverride;
        PollDetailsDataInterfaceSpec$DataSourceOverride pollDetailsDataInterfaceSpec$DataSourceOverride2 = new PollDetailsDataInterfaceSpec$DataSourceOverride("NONE", 1);
        A02 = pollDetailsDataInterfaceSpec$DataSourceOverride2;
        PollDetailsDataInterfaceSpec$DataSourceOverride[] pollDetailsDataInterfaceSpec$DataSourceOverrideArr = {pollDetailsDataInterfaceSpec$DataSourceOverride, pollDetailsDataInterfaceSpec$DataSourceOverride2};
        A01 = pollDetailsDataInterfaceSpec$DataSourceOverrideArr;
        A00 = C00t.A00(pollDetailsDataInterfaceSpec$DataSourceOverrideArr);
        CREATOR = CSS.A00(19);
    }

    public PollDetailsDataInterfaceSpec$DataSourceOverride(String str, int i) {
    }

    public static PollDetailsDataInterfaceSpec$DataSourceOverride valueOf(String str) {
        return (PollDetailsDataInterfaceSpec$DataSourceOverride) Enum.valueOf(PollDetailsDataInterfaceSpec$DataSourceOverride.class, str);
    }

    public static PollDetailsDataInterfaceSpec$DataSourceOverride[] values() {
        return (PollDetailsDataInterfaceSpec$DataSourceOverride[]) A01.clone();
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
