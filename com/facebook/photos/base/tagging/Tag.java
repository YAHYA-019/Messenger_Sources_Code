package com.facebook.photos.base.tagging;

import X.11T;
import X.1BK;
import X.1BL;
import X.4YU;
import X.7zN;
import X.AnonymousClass001;
import X.C53v;
import X.EM9;
import X.ERy;
import X.FKW;
import X.GK7;
import X.QpA;
import X.QpS;
import X.RCc;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.user.model.Name;
import java.io.Serializable;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: Tag.class */
public final class Tag extends ERy implements Parcelable, GK7 {
    public static final Parcelable.Creator CREATOR = FKW.A00(11);
    public long A00;
    public long A01;
    public TagTarget A02;
    public EM9 A03;
    public Name A04;
    public String A05;
    public boolean A06;
    public long A07;
    public String A08;
    public final QpA A09;
    public final Map A0A;
    public final boolean A0B;

    public Tag(Parcel parcel) {
        this.A09 = QpA.A05;
        Parcelable A0C = 1BL.A0C(parcel, TagTarget.class);
        if (A0C == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = (TagTarget) A0C;
        Parcelable A0C2 = 1BL.A0C(parcel, Name.class);
        if (A0C2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = (Name) A0C2;
        this.A00 = parcel.readLong();
        this.A03 = ((EM9[]) RCc.A00.toArray(new EM9[0]))[parcel.readInt()];
        this.A0B = C53v.A0S(parcel);
        this.A06 = C53v.A0S(parcel);
        this.A0A = new EnumMap(QpS.class);
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            Serializable readSerializable = parcel.readSerializable();
            if (readSerializable == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            this.A0A.put(readSerializable, new PointF(parcel.readFloat(), parcel.readFloat()));
        }
        this.A07 = parcel.readLong();
        this.A05 = parcel.readString();
        this.A08 = parcel.readString();
        this.A01 = parcel.readLong();
    }

    public Tag(TagTarget tagTarget, EM9 em9, Name name, long j, boolean z) {
        11T.A0F(tagTarget, 1);
        this.A09 = QpA.A05;
        this.A02 = tagTarget;
        this.A04 = name;
        this.A00 = j;
        this.A06 = z;
        this.A0B = false;
        this.A03 = em9 == null ? EM9.A0F : em9;
        this.A0A = new EnumMap(QpS.class);
        this.A01 = -1;
    }

    /* JADX WARN: Type inference failed for: r306v1, types: [com.facebook.photos.base.tagging.FaceBoxStub, java.lang.Object] */
    @Override // X.GK7
    public GK7 AGB(PointF pointF, RectF rectF, float f, int i) {
        TagPoint tagPoint;
        TagTarget tagTarget = this.A02;
        if (tagTarget instanceof TagPoint) {
            tagPoint = new TagPoint(new PointF(pointF.x, pointF.y), tagTarget.BEJ());
        } else if (tagTarget instanceof FaceBox) {
            tagPoint = new FaceBox(rectF, tagTarget.BEJ(), ((FaceBox) tagTarget).A01, true);
        } else {
            ?? obj = new Object();
            ((FaceBoxStub) obj).A02 = rectF;
            ((FaceBoxStub) obj).A01 = new PointF(rectF.centerX(), rectF.bottom);
            ((FaceBoxStub) obj).A00 = new PointF(rectF.centerX(), rectF.centerY());
            tagPoint = obj;
        }
        Name name = this.A04;
        long j = this.A00;
        EM9 em9 = this.A03;
        11T.A0F(name, 2);
        Tag tag = new Tag((TagTarget) tagPoint, em9, name, j, false);
        tag.A06 = this.A06;
        Map map = this.A0A;
        11T.A0F(map, 0);
        tag.A0A.putAll(map);
        tag.A07 = this.A07;
        tag.A05 = this.A05;
        tag.A08 = this.A08;
        tag.A01 = this.A01;
        return tag;
    }

    @Override // X.GK7
    public RectF AsO() {
        return this.A02.Aa1();
    }

    @Override // X.GK7
    public PointF AsV() {
        return this.A02.BEN();
    }

    @Override // X.GK7
    public QpA B0t() {
        return this.A09;
    }

    @Override // X.GK7
    public float B8G() {
        return 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0051, code lost:
    
        if (r301.A01 != r0.A01) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean equals(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.photos.base.tagging.Tag
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L54
            r0 = r301
            long r0 = r0.A00
            r304 = r0
            r0 = r302
            com.facebook.photos.base.tagging.Tag r0 = (com.facebook.photos.base.tagging.Tag) r0
            r302 = r0
            r0 = r302
            long r0 = r0.A00
            r306 = r0
            r0 = r304
            r1 = r306
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L54
            r0 = r301
            com.facebook.user.model.Name r0 = r0.A04
            r308 = r0
            r0 = r302
            com.facebook.user.model.Name r0 = r0.A04
            r309 = r0
            r0 = r308
            r1 = r309
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L54
            r0 = r301
            long r0 = r0.A01
            r310 = r0
            r0 = r302
            long r0 = r0.A01
            r312 = r0
            r0 = r310
            r1 = r312
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r314 = r0
            r0 = 1
            r303 = r0
            r0 = r314
            if (r0 == 0) goto L59
        L54:
            r0 = 0
            r303 = r0
            r0 = 0
            r309 = r0
        L59:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.photos.base.tagging.Tag.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        return 4YU.A04(Long.valueOf(this.A00), this.A04, Long.valueOf(this.A01));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeLong(this.A00);
        7zN.A0z(parcel, this.A03);
        parcel.writeInt(this.A0B ? 1 : 0);
        parcel.writeInt(this.A06 ? 1 : 0);
        Map map = this.A0A;
        parcel.writeInt(map.size());
        Iterator A1B = 1BK.A1B(map);
        while (A1B.hasNext()) {
            QpS qpS = (QpS) A1B.next();
            parcel.writeSerializable(qpS);
            Object obj = map.get(qpS);
            if (obj == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            parcel.writeFloat(((PointF) obj).x);
            Object obj2 = map.get(qpS);
            if (obj2 == null) {
                throw AnonymousClass001.A0N("Required value was null.");
            }
            parcel.writeFloat(((PointF) obj2).y);
        }
        parcel.writeLong(this.A07);
        parcel.writeString(this.A05);
        parcel.writeString(this.A08);
        parcel.writeLong(this.A01);
    }
}
