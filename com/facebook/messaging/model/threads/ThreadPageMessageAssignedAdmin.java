package com.facebook.messaging.model.threads;

import X.0Q8;
import X.11T;
import X.1BL;
import X.28Q;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;

/* loaded from: ThreadPageMessageAssignedAdmin.class */
public final class ThreadPageMessageAssignedAdmin implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSV.A00(80);
    public final String A00;
    public final String A01;
    public final String A02;

    /* loaded from: ThreadPageMessageAssignedAdmin$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str = null;
            String str2 = null;
            String str3 = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode == -1941445238) {
                            if (A1C.equals("assigned_admin_picture_uri")) {
                                str2 = AbstractC11224vw.A03(abstractC01033pi);
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != -1245436788) {
                            if (hashCode == 570770268 && A1C.equals("assigned_admin_id")) {
                                str3 = AbstractC11224vw.A03(abstractC01033pi);
                                C1pq.A08("assignedAdminId", str3);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("assigned_admin_name")) {
                                str = AbstractC11224vw.A03(abstractC01033pi);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ThreadPageMessageAssignedAdmin.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ThreadPageMessageAssignedAdmin(str3, str, str2);
        }
    }

    /* loaded from: ThreadPageMessageAssignedAdmin$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ThreadPageMessageAssignedAdmin threadPageMessageAssignedAdmin = (ThreadPageMessageAssignedAdmin) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "assigned_admin_id", threadPageMessageAssignedAdmin.A00);
            AbstractC11224vw.A0D(r302, "assigned_admin_name", threadPageMessageAssignedAdmin.A01);
            AbstractC11224vw.A0D(r302, "assigned_admin_picture_uri", threadPageMessageAssignedAdmin.A02);
            r302.A0Y();
        }
    }

    public ThreadPageMessageAssignedAdmin(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readInt() != 0 ? parcel.readString() : null;
        this.A02 = C3o5.A0O(parcel);
    }

    public ThreadPageMessageAssignedAdmin(String str, String str2, String str3) {
        C1pq.A08("assignedAdminId", str);
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadPageMessageAssignedAdmin)) {
                return false;
            }
            ThreadPageMessageAssignedAdmin threadPageMessageAssignedAdmin = (ThreadPageMessageAssignedAdmin) obj;
            if (!11T.A0O(this.A00, threadPageMessageAssignedAdmin.A00) || !11T.A0O(this.A01, threadPageMessageAssignedAdmin.A01) || !11T.A0O(this.A02, threadPageMessageAssignedAdmin.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        1BL.A13(parcel, this.A01);
        1BL.A13(parcel, this.A02);
    }
}
