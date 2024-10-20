package com.facebook.presence.note.audience.util;

import X.7zU;
import X.C00t;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: NotesAudienceListType.class */
public final class NotesAudienceListType implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ NotesAudienceListType[] A01;
    public static final NotesAudienceListType A02;
    public static final NotesAudienceListType A03;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        NotesAudienceListType notesAudienceListType = new NotesAudienceListType("ALLOWLIST", 0, 1);
        A02 = notesAudienceListType;
        NotesAudienceListType notesAudienceListType2 = new NotesAudienceListType("BLOCKLIST", 1, 2);
        A03 = notesAudienceListType2;
        NotesAudienceListType[] notesAudienceListTypeArr = {notesAudienceListType, notesAudienceListType2};
        A01 = notesAudienceListTypeArr;
        A00 = C00t.A00(notesAudienceListTypeArr);
        CREATOR = new FKW(54);
    }

    public NotesAudienceListType(String str, int i, int i2) {
        this.value = i2;
    }

    public static NotesAudienceListType valueOf(String str) {
        return (NotesAudienceListType) Enum.valueOf(NotesAudienceListType.class, str);
    }

    public static NotesAudienceListType[] values() {
        return (NotesAudienceListType[]) A01.clone();
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
