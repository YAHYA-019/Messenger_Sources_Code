package com.facebook.messaging.model.threads;

import X.0Q8;
import X.11T;
import X.1BM;
import X.28Q;
import X.4YV;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbJ;
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
import com.facebook.graphql.enums.GraphQLXFBPageCustomLabelDataSilo;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ThreadPageMessageCustomerTag.class */
public final class ThreadPageMessageCustomerTag implements Parcelable {
    public static volatile GraphQLXFBPageCustomLabelDataSilo A08;
    public static final Parcelable.Creator CREATOR = CSV.A00(81);
    public final String A00;
    public final String A01;
    public final String A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final GraphQLXFBPageCustomLabelDataSilo A06;
    public final Set A07;

    /* loaded from: ThreadPageMessageCustomerTag$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            GraphQLXFBPageCustomLabelDataSilo graphQLXFBPageCustomLabelDataSilo = null;
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            HashSet A0v = AnonymousClass001.A0v();
            String str = "";
            String str2 = str;
            String str3 = str;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1960017006:
                                if (A1C.equals("is_ai_label")) {
                                    z2 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case -455314595:
                                if (A1C.equals("customer_tag_color")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("customerTagColor", str);
                                    break;
                                }
                                break;
                            case -363404850:
                                if (A1C.equals("data_silo")) {
                                    graphQLXFBPageCustomLabelDataSilo = (GraphQLXFBPageCustomLabelDataSilo) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBPageCustomLabelDataSilo.class);
                                    C1pq.A08("dataSilo", graphQLXFBPageCustomLabelDataSilo);
                                    A0v = 4YV.A10("dataSilo", A0v);
                                    break;
                                }
                                break;
                            case 262721361:
                                if (A1C.equals("customer_tag_name")) {
                                    str3 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("customerTagName", str3);
                                    break;
                                }
                                break;
                            case 680914910:
                                if (A1C.equals("is_detected_outcomes_label")) {
                                    z3 = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                            case 1546640225:
                                if (A1C.equals("customer_tag_id")) {
                                    str2 = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("customerTagId", str2);
                                    break;
                                }
                                break;
                            case 1989867837:
                                if (A1C.equals("is_ad_response_label")) {
                                    z = abstractC01033pi.A1l();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, ThreadPageMessageCustomerTag.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new ThreadPageMessageCustomerTag(graphQLXFBPageCustomLabelDataSilo, str, str2, str3, A0v, z, z2, z3);
        }
    }

    /* loaded from: ThreadPageMessageCustomerTag$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            ThreadPageMessageCustomerTag threadPageMessageCustomerTag = (ThreadPageMessageCustomerTag) obj;
            r302.A0b();
            AbstractC11224vw.A0D(r302, "customer_tag_color", threadPageMessageCustomerTag.A00);
            AbstractC11224vw.A0D(r302, "customer_tag_id", threadPageMessageCustomerTag.A01);
            AbstractC11224vw.A0D(r302, "customer_tag_name", threadPageMessageCustomerTag.A02);
            AbstractC11224vw.A05(r302, c26c, threadPageMessageCustomerTag.A00(), "data_silo");
            boolean z = threadPageMessageCustomerTag.A03;
            r302.A0o("is_ad_response_label");
            r302.A0v(z);
            boolean z2 = threadPageMessageCustomerTag.A04;
            r302.A0o("is_ai_label");
            r302.A0v(z2);
            boolean z3 = threadPageMessageCustomerTag.A05;
            r302.A0o("is_detected_outcomes_label");
            r302.A0v(z3);
            r302.A0Y();
        }
    }

    public ThreadPageMessageCustomerTag(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A01 = parcel.readString();
        this.A02 = parcel.readString();
        this.A06 = parcel.readInt() == 0 ? null : GraphQLXFBPageCustomLabelDataSilo.values()[parcel.readInt()];
        int i = 0;
        this.A03 = AnonymousClass001.A1Q(parcel.readInt(), 1);
        this.A04 = 1BM.A07(parcel);
        this.A05 = AbJ.A1V(parcel);
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A07 = Collections.unmodifiableSet(A0v);
    }

    public ThreadPageMessageCustomerTag(GraphQLXFBPageCustomLabelDataSilo graphQLXFBPageCustomLabelDataSilo, String str, String str2, String str3, Set set, boolean z, boolean z2, boolean z3) {
        C1pq.A08("customerTagColor", str);
        this.A00 = str;
        C1pq.A08("customerTagId", str2);
        this.A01 = str2;
        C1pq.A08("customerTagName", str3);
        this.A02 = str3;
        this.A06 = graphQLXFBPageCustomLabelDataSilo;
        this.A03 = z;
        this.A04 = z2;
        this.A05 = z3;
        this.A07 = Collections.unmodifiableSet(set);
    }

    public GraphQLXFBPageCustomLabelDataSilo A00() {
        if (this.A07.contains("dataSilo")) {
            return this.A06;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    A08 = GraphQLXFBPageCustomLabelDataSilo.A01;
                }
            }
        }
        return A08;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadPageMessageCustomerTag)) {
                return false;
            }
            ThreadPageMessageCustomerTag threadPageMessageCustomerTag = (ThreadPageMessageCustomerTag) obj;
            if (!11T.A0O(this.A00, threadPageMessageCustomerTag.A00) || !11T.A0O(this.A01, threadPageMessageCustomerTag.A01) || !11T.A0O(this.A02, threadPageMessageCustomerTag.A02) || A00() != threadPageMessageCustomerTag.A00() || this.A03 != threadPageMessageCustomerTag.A03 || this.A04 != threadPageMessageCustomerTag.A04 || this.A05 != threadPageMessageCustomerTag.A05) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A04 = C1pq.A04(this.A02, C1pq.A04(this.A01, C1pq.A03(this.A00)));
        return C1pq.A02(C1pq.A02(C1pq.A02((A04 * 31) + C3o5.A03(A00()), this.A03), this.A04), this.A05);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        GraphQLXFBPageCustomLabelDataSilo graphQLXFBPageCustomLabelDataSilo = this.A06;
        if (graphQLXFBPageCustomLabelDataSilo == null) {
            ordinal = 0;
        } else {
            parcel.writeInt(1);
            ordinal = graphQLXFBPageCustomLabelDataSilo.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeInt(this.A03 ? 1 : 0);
        parcel.writeInt(this.A04 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
        Iterator A0S = C3o5.A0S(parcel, this.A07);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
