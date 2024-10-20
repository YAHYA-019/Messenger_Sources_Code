package com.facebook.messaging.polling.plugins.interfaces.pollmutation;

import X.7zU;
import X.C00t;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: PollMutationHandlerInterfaceSpec$MutationHandlerOverride.class */
public final class PollMutationHandlerInterfaceSpec$MutationHandlerOverride implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ PollMutationHandlerInterfaceSpec$MutationHandlerOverride[] A01;
    public static final PollMutationHandlerInterfaceSpec$MutationHandlerOverride A02;
    public static final PollMutationHandlerInterfaceSpec$MutationHandlerOverride A03;
    public static final Parcelable.Creator CREATOR;

    static {
        PollMutationHandlerInterfaceSpec$MutationHandlerOverride pollMutationHandlerInterfaceSpec$MutationHandlerOverride = new PollMutationHandlerInterfaceSpec$MutationHandlerOverride("MSYS", 0);
        A03 = pollMutationHandlerInterfaceSpec$MutationHandlerOverride;
        PollMutationHandlerInterfaceSpec$MutationHandlerOverride pollMutationHandlerInterfaceSpec$MutationHandlerOverride2 = new PollMutationHandlerInterfaceSpec$MutationHandlerOverride("GRAPHQL", 1);
        A02 = pollMutationHandlerInterfaceSpec$MutationHandlerOverride2;
        PollMutationHandlerInterfaceSpec$MutationHandlerOverride[] pollMutationHandlerInterfaceSpec$MutationHandlerOverrideArr = {pollMutationHandlerInterfaceSpec$MutationHandlerOverride, pollMutationHandlerInterfaceSpec$MutationHandlerOverride2};
        A01 = pollMutationHandlerInterfaceSpec$MutationHandlerOverrideArr;
        A00 = C00t.A00(pollMutationHandlerInterfaceSpec$MutationHandlerOverrideArr);
        CREATOR = CSS.A00(20);
    }

    public PollMutationHandlerInterfaceSpec$MutationHandlerOverride(String str, int i) {
    }

    public static PollMutationHandlerInterfaceSpec$MutationHandlerOverride valueOf(String str) {
        return (PollMutationHandlerInterfaceSpec$MutationHandlerOverride) Enum.valueOf(PollMutationHandlerInterfaceSpec$MutationHandlerOverride.class, str);
    }

    public static PollMutationHandlerInterfaceSpec$MutationHandlerOverride[] values() {
        return (PollMutationHandlerInterfaceSpec$MutationHandlerOverride[]) A01.clone();
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
