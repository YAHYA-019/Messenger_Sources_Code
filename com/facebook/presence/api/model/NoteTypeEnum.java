package com.facebook.presence.api.model;

import X.11T;
import X.C00t;
import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.enums.EnumEntries;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: NoteTypeEnum.class */
public final class NoteTypeEnum implements Parcelable {
    public static final /* synthetic */ EnumEntries A00;
    public static final /* synthetic */ NoteTypeEnum[] A01;
    public static final NoteTypeEnum A02;
    public static final NoteTypeEnum A03;
    public static final NoteTypeEnum A04;
    public static final Parcelable.Creator CREATOR;
    public final int value;

    static {
        NoteTypeEnum noteTypeEnum = new NoteTypeEnum("TEXT", 0, 1);
        A04 = noteTypeEnum;
        NoteTypeEnum noteTypeEnum2 = new NoteTypeEnum("MUSIC_AND_TEXT", 1, 2);
        A02 = noteTypeEnum2;
        NoteTypeEnum noteTypeEnum3 = new NoteTypeEnum("MUSIC_ONLY", 2, 3);
        A03 = noteTypeEnum3;
        NoteTypeEnum[] noteTypeEnumArr = {noteTypeEnum, noteTypeEnum2, noteTypeEnum3};
        A01 = noteTypeEnumArr;
        A00 = C00t.A00(noteTypeEnumArr);
        CREATOR = new C2xc(49);
    }

    public NoteTypeEnum(String str, int i, int i2) {
        this.value = i2;
    }

    public static NoteTypeEnum valueOf(String str) {
        return (NoteTypeEnum) Enum.valueOf(NoteTypeEnum.class, str);
    }

    public static NoteTypeEnum[] values() {
        return (NoteTypeEnum[]) A01.clone();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(name());
    }
}
