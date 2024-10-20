package com.facebook.inspiration.model.movableoverlay;

import X.11T;
import X.7zO;
import X.AbJ;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.EPI;
import X.FKc;
import X.RaM;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.inspiration.model.movableoverlay.common.InspirationOverlayPosition;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationPollInfo.class */
public final class InspirationPollInfo implements Parcelable {
    public static volatile InspirationOverlayPosition A0K;
    public static final Parcelable.Creator CREATOR = new FKc(36);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final int A05;
    public final int A06;
    public final EPI A07;
    public final InspirationOverlayPosition A08;
    public final Long A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final Set A0H;
    public final boolean A0I;
    public final boolean A0J;

    public InspirationPollInfo(EPI epi, InspirationOverlayPosition inspirationOverlayPosition, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, Set set, float f, float f2, float f3, float f4, float f5, int i, int i2, boolean z, boolean z2) {
        this.A09 = l;
        C1pq.A08("addYoursPromptId", str);
        this.A0A = str;
        C1pq.A08("addYoursPromptText", str2);
        this.A0B = str2;
        this.A05 = i;
        C1pq.A08("firstOptionText", str3);
        this.A0C = str3;
        C1pq.A08("gratitudePrompt", str4);
        this.A0D = str4;
        this.A0I = z;
        this.A0J = z2;
        this.A08 = inspirationOverlayPosition;
        C1pq.A08("pollStyle", str5);
        this.A0E = str5;
        this.A00 = f;
        this.A01 = f2;
        this.A02 = f3;
        this.A03 = f4;
        C1pq.A08("questionText", str6);
        this.A0F = str6;
        this.A04 = f5;
        C1pq.A08("secondOptionText", str7);
        this.A0G = str7;
        this.A07 = epi;
        this.A06 = i2;
        this.A0H = Collections.unmodifiableSet(set);
    }

    public InspirationPollInfo(RaM raM) {
        this.A09 = raM.A09;
        String str = raM.A0A;
        C1pq.A08("addYoursPromptId", str);
        this.A0A = str;
        String str2 = raM.A0B;
        C1pq.A08("addYoursPromptText", str2);
        this.A0B = str2;
        this.A05 = raM.A05;
        String str3 = raM.A0C;
        C1pq.A08("firstOptionText", str3);
        this.A0C = str3;
        String str4 = raM.A0D;
        C1pq.A08("gratitudePrompt", str4);
        this.A0D = str4;
        this.A0I = raM.A0I;
        this.A0J = raM.A0J;
        this.A08 = raM.A08;
        String str5 = raM.A0E;
        C1pq.A08("pollStyle", str5);
        this.A0E = str5;
        this.A00 = raM.A00;
        this.A01 = raM.A01;
        this.A02 = raM.A02;
        this.A03 = raM.A03;
        String str6 = raM.A0F;
        C1pq.A08("questionText", str6);
        this.A0F = str6;
        this.A04 = raM.A04;
        String str7 = raM.A0G;
        C1pq.A08("secondOptionText", str7);
        this.A0G = str7;
        this.A07 = raM.A07;
        this.A06 = raM.A06;
        this.A0H = Collections.unmodifiableSet(raM.A0H);
    }

    public InspirationPollInfo(Parcel parcel) {
        InspirationOverlayPosition inspirationOverlayPosition = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A09 = null;
        } else {
            this.A09 = 7zO.A0j(parcel);
        }
        this.A0A = parcel.readString();
        this.A0B = parcel.readString();
        this.A05 = parcel.readInt();
        this.A0C = parcel.readString();
        this.A0D = parcel.readString();
        int i = 0;
        this.A0I = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A0J = AbJ.A1V(parcel);
        this.A08 = parcel.readInt() != 0 ? (InspirationOverlayPosition) InspirationOverlayPosition.CREATOR.createFromParcel(parcel) : inspirationOverlayPosition;
        this.A0E = parcel.readString();
        this.A00 = parcel.readFloat();
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A03 = parcel.readFloat();
        this.A0F = parcel.readString();
        this.A04 = parcel.readFloat();
        this.A0G = parcel.readString();
        this.A07 = DKH.A0Q(parcel);
        this.A06 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A0H = Collections.unmodifiableSet(A0v);
    }

    public InspirationOverlayPosition A00() {
        if (this.A0H.contains("overlayPosition")) {
            return this.A08;
        }
        if (A0K == null) {
            synchronized (this) {
                if (A0K == null) {
                    A0K = new InspirationOverlayPosition(0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
                }
            }
        }
        return A0K;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationPollInfo)) {
                return false;
            }
            InspirationPollInfo inspirationPollInfo = (InspirationPollInfo) obj;
            if (!11T.A0O(this.A09, inspirationPollInfo.A09) || !11T.A0O(this.A0A, inspirationPollInfo.A0A) || !11T.A0O(this.A0B, inspirationPollInfo.A0B) || this.A05 != inspirationPollInfo.A05 || !11T.A0O(this.A0C, inspirationPollInfo.A0C) || !11T.A0O(this.A0D, inspirationPollInfo.A0D) || this.A0I != inspirationPollInfo.A0I || this.A0J != inspirationPollInfo.A0J || !11T.A0O(A00(), inspirationPollInfo.A00()) || !11T.A0O(this.A0E, inspirationPollInfo.A0E) || this.A00 != inspirationPollInfo.A00 || this.A01 != inspirationPollInfo.A01 || this.A02 != inspirationPollInfo.A02 || this.A03 != inspirationPollInfo.A03 || !11T.A0O(this.A0F, inspirationPollInfo.A0F) || this.A04 != inspirationPollInfo.A04 || !11T.A0O(this.A0G, inspirationPollInfo.A0G) || this.A07 != inspirationPollInfo.A07 || this.A06 != inspirationPollInfo.A06) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A0G, AbM.A00(C1pq.A04(this.A0F, AbM.A00(AbM.A00(AbM.A00(AbM.A00(C1pq.A04(this.A0E, C1pq.A04(A00(), C1pq.A02(C1pq.A02(C1pq.A04(this.A0D, C1pq.A04(this.A0C, (C1pq.A04(this.A0B, C1pq.A04(this.A0A, C1pq.A03(this.A09))) * 31) + this.A05)), this.A0I), this.A0J))), this.A00), this.A01), this.A02), this.A03)), this.A04));
        return (((A04 * 31) + C3o5.A03(this.A07)) * 31) + this.A06;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0g(parcel, this.A09);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0B);
        parcel.writeInt(this.A05);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0D);
        parcel.writeInt(this.A0I ? 1 : 0);
        parcel.writeInt(this.A0J ? 1 : 0);
        DKH.A0z(parcel, this.A08, i);
        parcel.writeString(this.A0E);
        parcel.writeFloat(this.A00);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeFloat(this.A03);
        parcel.writeString(this.A0F);
        parcel.writeFloat(this.A04);
        parcel.writeString(this.A0G);
        C3o5.A0e(parcel, this.A07);
        parcel.writeInt(this.A06);
        Iterator A0S = C3o5.A0S(parcel, this.A0H);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
