package com.facebook.platform.opengraph.model;

import X.11T;
import X.AnonymousClass001;
import X.FKW;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* loaded from: OpenGraphActionRobotext.class */
public class OpenGraphActionRobotext implements Parcelable {
    public static final Parcelable.Creator CREATOR = FKW.A00(34);
    public String A00;
    public List A01;

    /* loaded from: OpenGraphActionRobotext$Span.class */
    public final class Span implements Parcelable {
        public static final Parcelable.Creator CREATOR = FKW.A00(35);
        public final int length;
        public final int start;

        public Span() {
            this(0, 0);
        }

        public Span(int i, int i2) {
            this.start = i;
            this.length = i2;
        }

        public Span(Parcel parcel) {
            this.start = parcel.readInt();
            this.length = parcel.readInt();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            11T.A0F(parcel, 0);
            parcel.writeInt(this.start);
            parcel.writeInt(this.length);
        }
    }

    public OpenGraphActionRobotext() {
        this(null, AnonymousClass001.A0s());
    }

    public OpenGraphActionRobotext(String str, List list) {
        11T.A0F(list, 2);
        this.A01 = AnonymousClass001.A0s();
        setRobotext(str);
        this.A01 = list;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void setRobotext(String str) {
        this.A00 = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeList(this.A01);
    }
}
