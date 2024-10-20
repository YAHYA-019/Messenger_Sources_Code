package com.facebook.messaging.model.threads;

import X.0Q8;
import X.11T;
import X.28Q;
import X.4YV;
import X.4YW;
import X.5BB;
import X.AbG;
import X.AbK;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ThreadConnectivityContextParam.class */
public final class ThreadConnectivityContextParam implements Parcelable {
    public static volatile String A03;
    public static final Parcelable.Creator CREATOR = CSV.A00(74);
    public final String A00;
    public final String A01;
    public final Set A02;

    /* loaded from: ThreadConnectivityContextParam$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            HashSet A0v = AnonymousClass001.A0v();
            String str2 = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != 3575610) {
                            if (hashCode == 111972721 && A1C.equals("value")) {
                                str2 = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("value", str2);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
                                A0v = 4YV.A10(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0v);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ThreadConnectivityContextParam.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ThreadConnectivityContextParam(str, str2, A0v);
        }
    }

    /* loaded from: ThreadConnectivityContextParam$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ThreadConnectivityContextParam threadConnectivityContextParam = (ThreadConnectivityContextParam) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, threadConnectivityContextParam.A00());
            AbstractC11224vw.A0D(r302, "value", threadConnectivityContextParam.A00);
            r302.A0Y();
        }
    }

    public ThreadConnectivityContextParam(Parcel parcel) {
        this.A01 = AbK.A15(parcel, C3o5.A01(parcel, this));
        this.A00 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A02 = Collections.unmodifiableSet(A0v);
    }

    public ThreadConnectivityContextParam(String str, String str2, Set set) {
        this.A01 = str;
        C1pq.A08("value", str2);
        this.A00 = str2;
        this.A02 = Collections.unmodifiableSet(set);
    }

    public String A00() {
        if (this.A02.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
            return this.A01;
        }
        if (A03 == null) {
            synchronized (this) {
                if (A03 == null) {
                    A03 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE";
                }
            }
        }
        return A03;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadConnectivityContextParam)) {
                return false;
            }
            ThreadConnectivityContextParam threadConnectivityContextParam = (ThreadConnectivityContextParam) obj;
            if (!11T.A0O(A00(), threadConnectivityContextParam.A00()) || !11T.A0O(this.A00, threadConnectivityContextParam.A00)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A00, C1pq.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        4YW.A0E(parcel, this.A01);
        parcel.writeString(this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A02);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
