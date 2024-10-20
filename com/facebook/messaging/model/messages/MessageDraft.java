package com.facebook.messaging.model.messages;

import X.C2xc;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.google.common.base.Objects;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* loaded from: MessageDraft.class */
public final class MessageDraft implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C2xc(24);
    public final int A00;
    public final ImmutableList A01;
    public final Long A02;
    public final String A03;
    public final List A04;

    public MessageDraft(Parcel parcel) {
        this.A03 = parcel.readString();
        this.A01 = ImmutableList.copyOf((Collection) parcel.readArrayList(ProfileRange.class.getClassLoader()));
        this.A00 = parcel.readInt();
        this.A04 = parcel.readArrayList(MediaResource.class.getClassLoader());
        this.A02 = Long.valueOf(parcel.readLong());
    }

    public MessageDraft(ImmutableList immutableList, String str, List list, int i, long j) {
        list.getClass();
        this.A03 = str;
        this.A01 = immutableList == null ? ImmutableList.of() : immutableList;
        this.A00 = i;
        this.A04 = list;
        this.A02 = Long.valueOf(j);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = true;
        if (this != obj) {
            if (!(obj instanceof MessageDraft)) {
                return false;
            }
            MessageDraft messageDraft = (MessageDraft) obj;
            if (Objects.equal(this.A03, messageDraft.A03) && Objects.equal(this.A04, messageDraft.A04) && this.A00 == messageDraft.A00) {
                return true;
            }
            z = false;
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A03, this.A04, Integer.valueOf(this.A00)});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A03);
        parcel.writeList(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A04);
        parcel.writeLong(this.A02.longValue());
    }
}
