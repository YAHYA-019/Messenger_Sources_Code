package com.facebook.messaging.model.threads;

import X.0Q8;
import X.11T;
import X.1BK;
import X.1BL;
import X.1Du;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbE;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C24b;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4E6;
import X.C4V6;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLBizInboxUnifiedTags;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.RegularImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: RelatedPageThreadData.class */
public final class RelatedPageThreadData implements Parcelable {
    public static volatile ImmutableList A06;
    public static volatile ImmutableList A07;
    public static volatile ImmutableMap A08;
    public static final Parcelable.Creator CREATOR = new CSV(70);
    public final ThreadPageMessageAssignedAdmin A00;
    public final String A01;
    public final ImmutableList A02;
    public final ImmutableList A03;
    public final ImmutableMap A04;
    public final Set A05;

    /* loaded from: RelatedPageThreadData$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            ImmutableMap immutableMap = null;
            String str = null;
            ImmutableList immutableList = null;
            ThreadPageMessageAssignedAdmin threadPageMessageAssignedAdmin = null;
            ImmutableList immutableList2 = null;
            HashSet A0v = AnonymousClass001.A0v();
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        switch (A1C.hashCode()) {
                            case -1674528845:
                                if (A1C.equals("thread_biz_inbox_tags")) {
                                    immutableList = AbstractC11224vw.A00(abstractC01033pi, c27t, GraphQLBizInboxUnifiedTags.class);
                                    C1pq.A08("threadBizInboxTags", immutableList);
                                    A0v = 4YV.A10("threadBizInboxTags", A0v);
                                    break;
                                }
                                break;
                            case -389045295:
                                if (A1C.equals("thread_page_message_assigned_admin")) {
                                    threadPageMessageAssignedAdmin = (ThreadPageMessageAssignedAdmin) AbstractC11224vw.A02(abstractC01033pi, c27t, ThreadPageMessageAssignedAdmin.class);
                                    break;
                                }
                                break;
                            case -292760761:
                                if (A1C.equals("thread_page_message_customer_tags")) {
                                    immutableList2 = AbstractC11224vw.A00(abstractC01033pi, c27t, ThreadPageMessageCustomerTag.class);
                                    C1pq.A08("threadPageMessageCustomerTags", immutableList2);
                                    A0v = 4YV.A10("threadPageMessageCustomerTags", A0v);
                                    break;
                                }
                                break;
                            case 209069228:
                                if (A1C.equals("last_message_client_tags")) {
                                    immutableMap = (ImmutableMap) AbstractC11224vw.A01(abstractC01033pi, c27t, C4E6.A00(C24b.A01(String.class), C24b.A01(String.class)));
                                    C1pq.A08("lastMessageClientTags", immutableMap);
                                    A0v = 4YV.A10("lastMessageClientTags", A0v);
                                    break;
                                }
                                break;
                            case 1089809220:
                                if (A1C.equals("page_comm_item_id")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, RelatedPageThreadData.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new RelatedPageThreadData(threadPageMessageAssignedAdmin, immutableList, immutableList2, immutableMap, str, A0v);
        }
    }

    /* loaded from: RelatedPageThreadData$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            RelatedPageThreadData relatedPageThreadData = (RelatedPageThreadData) obj;
            r302.A0b();
            AbstractC11224vw.A05(r302, c26c, relatedPageThreadData.A02(), "last_message_client_tags");
            AbstractC11224vw.A0D(r302, "page_comm_item_id", relatedPageThreadData.A01);
            AbstractC11224vw.A06(r302, c26c, "thread_biz_inbox_tags", relatedPageThreadData.A00());
            AbstractC11224vw.A05(r302, c26c, relatedPageThreadData.A00, "thread_page_message_assigned_admin");
            AbstractC11224vw.A06(r302, c26c, "thread_page_message_customer_tags", relatedPageThreadData.A01());
            r302.A0Y();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RelatedPageThreadData(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        int i = 0;
        ImmutableList immutableList = null;
        if (parcel.readInt() == 0) {
            this.A04 = null;
        } else {
            HashMap A0u = AnonymousClass001.A0u();
            int readInt = parcel.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                A0u.put(parcel.readString(), parcel.readString());
            }
            this.A04 = ImmutableMap.copyOf((Map) A0u);
        }
        if (parcel.readInt() == 0) {
            this.A01 = null;
        } else {
            this.A01 = parcel.readString();
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            int readInt2 = parcel.readInt();
            GraphQLBizInboxUnifiedTags[] graphQLBizInboxUnifiedTagsArr = new GraphQLBizInboxUnifiedTags[readInt2];
            for (int i3 = 0; i3 < readInt2; i3++) {
                graphQLBizInboxUnifiedTagsArr[i3] = GraphQLBizInboxUnifiedTags.values()[parcel.readInt()];
            }
            this.A02 = ImmutableList.copyOf(graphQLBizInboxUnifiedTagsArr);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = (ThreadPageMessageAssignedAdmin) parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() != 0) {
            int readInt3 = parcel.readInt();
            ThreadPageMessageCustomerTag[] threadPageMessageCustomerTagArr = new ThreadPageMessageCustomerTag[readInt3];
            for (int i4 = 0; i4 < readInt3; i4++) {
                threadPageMessageCustomerTagArr[i4] = parcel.readParcelable(classLoader);
            }
            immutableList = ImmutableList.copyOf(threadPageMessageCustomerTagArr);
        }
        this.A03 = immutableList;
        HashSet hashSet = new HashSet();
        int readInt4 = parcel.readInt();
        while (i < readInt4) {
            i = C3o5.A02(parcel, hashSet, i);
        }
        this.A05 = Collections.unmodifiableSet(hashSet);
    }

    public RelatedPageThreadData(ThreadPageMessageAssignedAdmin threadPageMessageAssignedAdmin, ImmutableList immutableList, ImmutableList immutableList2, ImmutableMap immutableMap, String str, Set set) {
        this.A04 = immutableMap;
        this.A01 = str;
        this.A02 = immutableList;
        this.A00 = threadPageMessageAssignedAdmin;
        this.A03 = immutableList2;
        this.A05 = Collections.unmodifiableSet(set);
    }

    public ImmutableList A00() {
        if (this.A05.contains(AbE.A00(753))) {
            return this.A02;
        }
        if (A06 == null) {
            synchronized (this) {
                if (A06 == null) {
                    A06 = 1BK.A0b();
                }
            }
        }
        return A06;
    }

    public ImmutableList A01() {
        if (this.A05.contains(AbE.A00(754))) {
            return this.A03;
        }
        if (A07 == null) {
            synchronized (this) {
                if (A07 == null) {
                    A07 = 1BK.A0b();
                }
            }
        }
        return A07;
    }

    public ImmutableMap A02() {
        if (this.A05.contains(AbE.A00(568))) {
            return this.A04;
        }
        if (A08 == null) {
            synchronized (this) {
                if (A08 == null) {
                    ImmutableMap immutableMap = RegularImmutableMap.A03;
                    11T.A0A(immutableMap);
                    A08 = immutableMap;
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
            if (!(obj instanceof RelatedPageThreadData)) {
                return false;
            }
            RelatedPageThreadData relatedPageThreadData = (RelatedPageThreadData) obj;
            if (!11T.A0O(A02(), relatedPageThreadData.A02()) || !11T.A0O(this.A01, relatedPageThreadData.A01) || !11T.A0O(A00(), relatedPageThreadData.A00()) || !11T.A0O(this.A00, relatedPageThreadData.A00) || !11T.A0O(A01(), relatedPageThreadData.A01())) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(A01(), C1pq.A04(this.A00, C1pq.A04(A00(), C1pq.A04(this.A01, C1pq.A03(A02())))));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ImmutableMap immutableMap = this.A04;
        if (immutableMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(immutableMap.size());
            1Du it = immutableMap.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A0z = AnonymousClass001.A0z(it);
                parcel.writeString(AnonymousClass001.A0j(A0z));
                parcel.writeString((String) A0z.getValue());
            }
        }
        1BL.A13(parcel, this.A01);
        ImmutableList immutableList = this.A02;
        if (immutableList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b = 1BL.A0b(parcel, immutableList);
            while (A0b.hasNext()) {
                parcel.writeInt(((GraphQLBizInboxUnifiedTags) A0b.next()).ordinal());
            }
        }
        C3o5.A0d(parcel, this.A00, i);
        ImmutableList immutableList2 = this.A03;
        if (immutableList2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            1Du A0b2 = 1BL.A0b(parcel, immutableList2);
            while (A0b2.hasNext()) {
                parcel.writeParcelable((ThreadPageMessageCustomerTag) A0b2.next(), i);
            }
        }
        Iterator A0S = C3o5.A0S(parcel, this.A05);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
