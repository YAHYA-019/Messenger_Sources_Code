package com.facebook.messaging.model.threads;

import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BL;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.AnonymousClass217;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C2xc;
import X.C42h;
import X.C4V6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebookpay.offsite.models.message.OffsiteInitAvailabilityRequestKt;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ThreadRtcRoomInfoData.class */
public final class ThreadRtcRoomInfoData implements Parcelable, AnonymousClass217 {
    public static volatile String A06;
    public static volatile String A07;
    public static final Parcelable.Creator CREATOR = new C2xc(36);
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final Set A05;

    /* loaded from: ThreadRtcRoomInfoData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            int i = 0;
            String str = null;
            String str2 = null;
            int i2 = 0;
            HashSet A0v = AnonymousClass001.A0v();
            String str3 = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        switch (A1Y.hashCode()) {
                            case -1407711492:
                                if (A1Y.equals("room_expiration_timestamp_sec")) {
                                    i = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                            case -172978165:
                                if (A1Y.equals("room_url")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("roomUrl", str3);
                                    break;
                                }
                                break;
                            case 544397849:
                                if (A1Y.equals("room_thread_use_case")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    String A00 = 1BJ.A00(221);
                                    C1pq.A08(A00, str2);
                                    A0v = 4YV.A10(A00, A0v);
                                    break;
                                }
                                break;
                            case 1269913645:
                                if (A1Y.equals("room_state")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("roomState", str);
                                    A0v = 4YV.A10("roomState", A0v);
                                    break;
                                }
                                break;
                            case 1460342422:
                                if (A1Y.equals("show_cta_until_timestamp_sec")) {
                                    i2 = abstractC01033pi.A1y();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ThreadRtcRoomInfoData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ThreadRtcRoomInfoData(str, str2, str3, A0v, i, i2);
        }
    }

    /* loaded from: ThreadRtcRoomInfoData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ThreadRtcRoomInfoData threadRtcRoomInfoData = (ThreadRtcRoomInfoData) obj;
            r302.A0b();
            int i = threadRtcRoomInfoData.A00;
            r302.A0o("room_expiration_timestamp_sec");
            r302.A0f(i);
            AbstractC11224vw.A0D(r302, "room_state", threadRtcRoomInfoData.A00());
            AbstractC11224vw.A0D(r302, "room_thread_use_case", threadRtcRoomInfoData.A01());
            AbstractC11224vw.A0D(r302, "room_url", threadRtcRoomInfoData.A02);
            int i2 = threadRtcRoomInfoData.A01;
            r302.A0o("show_cta_until_timestamp_sec");
            r302.A0f(i2);
            r302.A0Y();
        }
    }

    public ThreadRtcRoomInfoData(Parcel parcel) {
        getClass().getClassLoader();
        this.A00 = parcel.readInt();
        String str = null;
        if (parcel.readInt() == 0) {
            this.A03 = null;
        } else {
            this.A03 = parcel.readString();
        }
        this.A04 = parcel.readInt() != 0 ? parcel.readString() : str;
        this.A02 = parcel.readString();
        this.A01 = parcel.readInt();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A0v.add(parcel.readString());
        }
        this.A05 = Collections.unmodifiableSet(A0v);
    }

    public ThreadRtcRoomInfoData(String str, String str2, String str3, Set set, int i, int i2) {
        this.A00 = i;
        this.A03 = str;
        this.A04 = str2;
        C1pq.A08("roomUrl", str3);
        this.A02 = str3;
        this.A01 = i2;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A05.contains("roomState")) {
            return this.A03;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                }
            }
        }
        return A06;
    }

    public String A01() {
        if (this.A05.contains("roomThreadUseCase")) {
            return this.A04;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = OffsiteInitAvailabilityRequestKt.DEFAULT_PARTNER_ID;
                }
            }
        }
        return A07;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadRtcRoomInfoData)) {
                return false;
            }
            ThreadRtcRoomInfoData threadRtcRoomInfoData = (ThreadRtcRoomInfoData) obj;
            if (this.A00 != threadRtcRoomInfoData.A00 || !11T.A0O(A00(), threadRtcRoomInfoData.A00()) || !11T.A0O(A01(), threadRtcRoomInfoData.A01()) || !11T.A0O(this.A02, threadRtcRoomInfoData.A02) || this.A01 != threadRtcRoomInfoData.A01) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return (C1pq.A04(this.A02, C1pq.A04(A01(), C1pq.A04(A00(), this.A00 + 31))) * 31) + this.A01;
    }

    public String toString() {
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("ThreadRtcRoomInfoData{roomExpirationTimestampSec=");
        A0k.append(this.A00);
        A0k.append(", roomState=");
        A0k.append(A00());
        A0k.append(", roomThreadUseCase=");
        A0k.append(A01());
        A0k.append(", roomUrl=");
        A0k.append(this.A02);
        A0k.append(", showCtaUntilTimestampSec=");
        A0k.append(this.A01);
        return 1BL.A0v(A0k);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00);
        1BL.A13(parcel, this.A03);
        1BL.A13(parcel, this.A04);
        parcel.writeString(this.A02);
        parcel.writeInt(this.A01);
        Set set = this.A05;
        parcel.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            parcel.writeString(AnonymousClass001.A0i(it));
        }
    }
}
