package com.facebook.messaging.model.threads;

import X.0Q8;
import X.11T;
import X.1BJ;
import X.1BL;
import X.1Du;
import X.28Q;
import X.5BB;
import X.5Un;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4Ny;
import X.C4V6;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ThreadConnectivityData.class */
public final class ThreadConnectivityData implements Parcelable {
    public static volatile String A05;
    public static volatile String A06;
    public static final Parcelable.Creator CREATOR = new C4Ny(20);
    public final ImmutableList A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final Set A04;

    /* loaded from: ThreadConnectivityData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            5Un r0 = new 5Un();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -491008490:
                                if (A1C.equals("context_params")) {
                                    ImmutableList A00 = AbstractC11224vw.A00(abstractC01033pi, c27t, ThreadConnectivityContextParam.class);
                                    r0.A00 = A00;
                                    C1pq.A08("contextParams", A00);
                                    break;
                                }
                                break;
                            case -375826566:
                                if (A1C.equals("connectivity_status")) {
                                    r0.A00(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                            case 1029136534:
                                if (A1C.equals("first_sender_id")) {
                                    String A03 = AbstractC11224vw.A03(abstractC01033pi);
                                    r0.A03 = A03;
                                    C1pq.A08("firstSenderId", A03);
                                    break;
                                }
                                break;
                            case 1116948426:
                                if (A1C.equals("context_type")) {
                                    r0.A01(AbstractC11224vw.A03(abstractC01033pi));
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ThreadConnectivityData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ThreadConnectivityData(r0);
        }
    }

    /* loaded from: ThreadConnectivityData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ThreadConnectivityData threadConnectivityData = (ThreadConnectivityData) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "connectivity_status", threadConnectivityData.A00());
            AbstractC11224vw.A06(r302, c26c, "context_params", threadConnectivityData.A00);
            AbstractC11224vw.A0D(r302, "context_type", threadConnectivityData.A01());
            AbstractC11224vw.A0D(r302, "first_sender_id", threadConnectivityData.A03);
            r302.A0Y();
        }
    }

    public ThreadConnectivityData(5Un r302) {
        this.A01 = r302.A01;
        ImmutableList immutableList = r302.A00;
        C1pq.A08("contextParams", immutableList);
        this.A00 = immutableList;
        this.A02 = r302.A02;
        String str = r302.A03;
        C1pq.A08("firstSenderId", str);
        this.A03 = str;
        this.A04 = Collections.unmodifiableSet(r302.A04);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadConnectivityData(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : null;
        int readInt = parcel.readInt();
        ThreadConnectivityContextParam[] threadConnectivityContextParamArr = new ThreadConnectivityContextParam[readInt];
        int i = 0;
        for (int i2 = 0; i2 < readInt; i2++) {
            threadConnectivityContextParamArr[i2] = parcel.readParcelable(classLoader);
        }
        this.A00 = ImmutableList.copyOf(threadConnectivityContextParamArr);
        this.A02 = C3o5.A0O(parcel);
        this.A03 = parcel.readString();
        HashSet hashSet = new HashSet();
        int readInt2 = parcel.readInt();
        while (i < readInt2) {
            i = C3o5.A02(parcel, hashSet, i);
        }
        this.A04 = Collections.unmodifiableSet(hashSet);
    }

    public String A00() {
        if (this.A04.contains("connectivityStatus")) {
            return this.A01;
        }
        if (A05 == null) {
            synchronized (this) {
                if (A05 == null) {
                    A05 = 1BJ.A00(315);
                }
            }
        }
        return A05;
    }

    public String A01() {
        if (this.A04.contains("contextType")) {
            return this.A02;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = "NONE";
                }
            }
        }
        return A06;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadConnectivityData)) {
                return false;
            }
            ThreadConnectivityData threadConnectivityData = (ThreadConnectivityData) obj;
            if (!11T.A0O(A00(), threadConnectivityData.A00()) || !11T.A0O(this.A00, threadConnectivityData.A00) || !11T.A0O(A01(), threadConnectivityData.A01()) || !11T.A0O(this.A03, threadConnectivityData.A03)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A03, C1pq.A04(A01(), C1pq.A04(this.A00, C1pq.A04(A00(), 1))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        1BL.A13(parcel, this.A01);
        1Du A0b = 1BL.A0b(parcel, this.A00);
        while (A0b.hasNext()) {
            parcel.writeParcelable((ThreadConnectivityContextParam) A0b.next(), i);
        }
        1BL.A13(parcel, this.A02);
        parcel.writeString(this.A03);
        Iterator A0S = C3o5.A0S(parcel, this.A04);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
