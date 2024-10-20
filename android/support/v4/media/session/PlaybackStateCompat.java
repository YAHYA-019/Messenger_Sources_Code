package android.support.v4.media.session;

import X.1BL;
import X.AnonymousClass001;
import X.LGo;
import X.Qwl;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* loaded from: PlaybackStateCompat.class */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator CREATOR = LGo.A00(8);
    public List A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final long A08;
    public final Bundle A09;
    public final CharSequence A0A;

    /* loaded from: PlaybackStateCompat$CustomAction.class */
    public final class CustomAction implements Parcelable {
        public static final Parcelable.Creator CREATOR = LGo.A00(9);
        public final int A00;
        public final Bundle A01;
        public final CharSequence A02;
        public final String A03;

        public CustomAction(Parcel parcel) {
            this.A03 = parcel.readString();
            this.A02 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.A00 = parcel.readInt();
            this.A01 = parcel.readBundle(Qwl.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            StringBuilder A0k = AnonymousClass001.A0k();
            A0k.append("Action:mName='");
            A0k.append((Object) this.A02);
            A0k.append(", mIcon=");
            A0k.append(this.A00);
            A0k.append(", mExtras=");
            return AnonymousClass001.A0a(this.A01, A0k);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.A03);
            TextUtils.writeToParcel(this.A02, parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeBundle(this.A01);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.A03 = parcel.readInt();
        this.A07 = parcel.readLong();
        this.A01 = parcel.readFloat();
        this.A08 = parcel.readLong();
        this.A06 = parcel.readLong();
        this.A04 = parcel.readLong();
        this.A0A = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A00 = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.A05 = parcel.readLong();
        this.A09 = parcel.readBundle(Qwl.class.getClassLoader());
        this.A02 = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o("PlaybackState {");
        A0o.append("state=");
        A0o.append(this.A03);
        A0o.append(", position=");
        A0o.append(this.A07);
        A0o.append(", buffered position=");
        A0o.append(this.A06);
        A0o.append(", speed=");
        A0o.append(this.A01);
        A0o.append(", updated=");
        A0o.append(this.A08);
        A0o.append(", actions=");
        A0o.append(this.A04);
        A0o.append(", error code=");
        A0o.append(this.A02);
        A0o.append(", error message=");
        A0o.append(this.A0A);
        A0o.append(", custom actions=");
        A0o.append(this.A00);
        A0o.append(", active item id=");
        A0o.append(this.A05);
        return 1BL.A0v(A0o);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A03);
        parcel.writeLong(this.A07);
        parcel.writeFloat(this.A01);
        parcel.writeLong(this.A08);
        parcel.writeLong(this.A06);
        parcel.writeLong(this.A04);
        TextUtils.writeToParcel(this.A0A, parcel, i);
        parcel.writeTypedList(this.A00);
        parcel.writeLong(this.A05);
        parcel.writeBundle(this.A09);
        parcel.writeInt(this.A02);
    }
}
