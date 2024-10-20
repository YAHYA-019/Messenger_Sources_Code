package com.facebook.messaging.publicchats.memberlist.model;

import X.7zU;
import X.C00t;
import X.CSS;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: ParticipantsListSource.class */
public final class ParticipantsListSource implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ ParticipantsListSource[] A01;
    public static final ParticipantsListSource A02;
    public static final ParticipantsListSource A03;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        ParticipantsListSource participantsListSource = new ParticipantsListSource("MEMBER_LIST", 0, 0);
        A03 = participantsListSource;
        ParticipantsListSource participantsListSource2 = new ParticipantsListSource("ADMIN_LIST", 1, 1);
        A02 = participantsListSource2;
        ParticipantsListSource[] participantsListSourceArr = {participantsListSource, participantsListSource2};
        A01 = participantsListSourceArr;
        A00 = C00t.A00(participantsListSourceArr);
        CREATOR = CSS.A00(33);
    }

    public ParticipantsListSource(String str, int i, int i2) {
        this.value = i2;
    }

    public static ParticipantsListSource valueOf(String str) {
        return (ParticipantsListSource) Enum.valueOf(ParticipantsListSource.class, str);
    }

    public static ParticipantsListSource[] values() {
        return (ParticipantsListSource[]) A01.clone();
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
