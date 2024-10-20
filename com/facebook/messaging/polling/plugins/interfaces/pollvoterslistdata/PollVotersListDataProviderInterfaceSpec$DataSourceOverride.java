package com.facebook.messaging.polling.plugins.interfaces.pollvoterslistdata;

import X.7zU;
import X.C00t;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PollVotersListDataProviderInterfaceSpec$DataSourceOverride.class */
public final class PollVotersListDataProviderInterfaceSpec$DataSourceOverride implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PollVotersListDataProviderInterfaceSpec$DataSourceOverride[] A01;
    public static final PollVotersListDataProviderInterfaceSpec$DataSourceOverride A02;
    public static final PollVotersListDataProviderInterfaceSpec$DataSourceOverride A03;
    public static final Parcelable.Creator CREATOR;

    static {
        PollVotersListDataProviderInterfaceSpec$DataSourceOverride pollVotersListDataProviderInterfaceSpec$DataSourceOverride = new PollVotersListDataProviderInterfaceSpec$DataSourceOverride("POLLS_V2", 0);
        A03 = pollVotersListDataProviderInterfaceSpec$DataSourceOverride;
        PollVotersListDataProviderInterfaceSpec$DataSourceOverride pollVotersListDataProviderInterfaceSpec$DataSourceOverride2 = new PollVotersListDataProviderInterfaceSpec$DataSourceOverride("NONE", 1);
        A02 = pollVotersListDataProviderInterfaceSpec$DataSourceOverride2;
        PollVotersListDataProviderInterfaceSpec$DataSourceOverride[] pollVotersListDataProviderInterfaceSpec$DataSourceOverrideArr = {pollVotersListDataProviderInterfaceSpec$DataSourceOverride, pollVotersListDataProviderInterfaceSpec$DataSourceOverride2};
        A01 = pollVotersListDataProviderInterfaceSpec$DataSourceOverrideArr;
        A00 = C00t.A00(pollVotersListDataProviderInterfaceSpec$DataSourceOverrideArr);
        CREATOR = CSS.A00(21);
    }

    public PollVotersListDataProviderInterfaceSpec$DataSourceOverride(String str, int i) {
    }

    public static PollVotersListDataProviderInterfaceSpec$DataSourceOverride valueOf(String str) {
        return (PollVotersListDataProviderInterfaceSpec$DataSourceOverride) Enum.valueOf(PollVotersListDataProviderInterfaceSpec$DataSourceOverride.class, str);
    }

    public static PollVotersListDataProviderInterfaceSpec$DataSourceOverride[] values() {
        return (PollVotersListDataProviderInterfaceSpec$DataSourceOverride[]) A01.clone();
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
