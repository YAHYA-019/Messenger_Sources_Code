package com.facebook.presence.note.audience.util;

import X.7zU;
import X.C00t;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: NotesAudienceControlType.class */
public final class NotesAudienceControlType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ NotesAudienceControlType[] A01;
    public static final NotesAudienceControlType A02;
    public static final NotesAudienceControlType A03;
    public static final NotesAudienceControlType A04;
    public static final NotesAudienceControlType A05;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        NotesAudienceControlType notesAudienceControlType = new NotesAudienceControlType("FRIENDS", 0, 1);
        A04 = notesAudienceControlType;
        NotesAudienceControlType notesAudienceControlType2 = new NotesAudienceControlType("CONTACTS", 1, 2);
        A02 = notesAudienceControlType2;
        NotesAudienceControlType notesAudienceControlType3 = new NotesAudienceControlType("CUSTOM", 2, 3);
        A03 = notesAudienceControlType3;
        NotesAudienceControlType notesAudienceControlType4 = new NotesAudienceControlType("INTERNAL", 3, 4);
        A05 = notesAudienceControlType4;
        NotesAudienceControlType[] notesAudienceControlTypeArr = {notesAudienceControlType, notesAudienceControlType2, notesAudienceControlType3, notesAudienceControlType4};
        A01 = notesAudienceControlTypeArr;
        A00 = C00t.A00(notesAudienceControlTypeArr);
        CREATOR = new FKW(53);
    }

    public NotesAudienceControlType(String str, int i, int i2) {
        this.value = i2;
    }

    public static NotesAudienceControlType valueOf(String str) {
        return (NotesAudienceControlType) Enum.valueOf(NotesAudienceControlType.class, str);
    }

    public static NotesAudienceControlType[] values() {
        return (NotesAudienceControlType[]) A01.clone();
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
