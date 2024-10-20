package com.facebook.messaging.communitymessaging.threadfull.model;

import X.11T;
import X.1BL;
import X.C00t;
import X.C01g;
import X.C01i;
import X.C03i;
import X.C20k;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.MessageAvailabilityResponseId$Companion;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ThreadFullnessState.class */
public final class ThreadFullnessState implements Parcelable {
    public static final C01i A00;
    public static final /* synthetic */ EnumEntries A01;
    public static final /* synthetic */ ThreadFullnessState[] A02;
    public static final ThreadFullnessState A03;
    public static final ThreadFullnessState A04;
    public static final ThreadFullnessState A05;
    public static final ThreadFullnessState A06;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        ThreadFullnessState threadFullnessState = new ThreadFullnessState(MessageAvailabilityResponseId$Companion.AVAILABLE, 0, 0);
        A04 = threadFullnessState;
        ThreadFullnessState threadFullnessState2 = new ThreadFullnessState("ALMOST_FULL", 1, 1);
        A03 = threadFullnessState2;
        ThreadFullnessState threadFullnessState3 = new ThreadFullnessState("MEMBER_FULL", 2, 2);
        A06 = threadFullnessState3;
        ThreadFullnessState threadFullnessState4 = new ThreadFullnessState("FULL", 3, 3);
        A05 = threadFullnessState4;
        ThreadFullnessState[] threadFullnessStateArr = {threadFullnessState, threadFullnessState2, threadFullnessState3, threadFullnessState4};
        A02 = threadFullnessStateArr;
        A01 = C00t.A00(threadFullnessStateArr);
        CREATOR = new C2xc(18);
        A00 = C01g.A00(C03i.A03, C20k.A00);
    }

    public ThreadFullnessState(String str, int i, int i2) {
        this.value = i2;
    }

    public static ThreadFullnessState valueOf(String str) {
        return (ThreadFullnessState) Enum.valueOf(ThreadFullnessState.class, str);
    }

    public static ThreadFullnessState[] values() {
        return (ThreadFullnessState[]) A02.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        1BL.A12(parcel, this);
    }
}
