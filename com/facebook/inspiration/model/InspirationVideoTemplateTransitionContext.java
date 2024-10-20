package com.facebook.inspiration.model;

import X.0Q8;
import X.11T;
import X.28Q;
import X.4YU;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbI;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLFBInspirationVideoTemplateTransitionType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationVideoTemplateTransitionContext.class */
public final class InspirationVideoTemplateTransitionContext implements Parcelable {
    public static volatile GraphQLFBInspirationVideoTemplateTransitionType A04;
    public static final Parcelable.Creator CREATOR = FKf.A01(79);
    public final GraphQLFBInspirationVideoTemplateTransitionType A00;
    public final Integer A01;
    public final Integer A02;
    public final Set A03;

    /* loaded from: InspirationVideoTemplateTransitionContext$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            GraphQLFBInspirationVideoTemplateTransitionType graphQLFBInspirationVideoTemplateTransitionType = null;
            HashSet A0v = AnonymousClass001.A0v();
            Integer A0k = 4YU.A0k();
            Integer num = A0k;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode == -1973557276) {
                            if (A1C.equals("transition_type")) {
                                graphQLFBInspirationVideoTemplateTransitionType = (GraphQLFBInspirationVideoTemplateTransitionType) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLFBInspirationVideoTemplateTransitionType.class);
                                C1pq.A08("transitionType", graphQLFBInspirationVideoTemplateTransitionType);
                                A0v = 4YV.A10("transitionType", A0v);
                            }
                            abstractC01033pi.A20();
                        } else if (hashCode != -798784899) {
                            if (hashCode == 467410100 && A1C.equals("out_clip_index")) {
                                num = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                            }
                            abstractC01033pi.A20();
                        } else {
                            if (A1C.equals("in_clip_index")) {
                                A0k = (Integer) AbstractC11224vw.A02(abstractC01033pi, c27t, Integer.class);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationVideoTemplateTransitionContext.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationVideoTemplateTransitionContext(graphQLFBInspirationVideoTemplateTransitionType, A0k, num, A0v);
        }
    }

    /* loaded from: InspirationVideoTemplateTransitionContext$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationVideoTemplateTransitionContext inspirationVideoTemplateTransitionContext = (InspirationVideoTemplateTransitionContext) obj;
            r302.A0b();
            AbstractC11224vw.A0B(r302, inspirationVideoTemplateTransitionContext.A01, "in_clip_index");
            AbstractC11224vw.A0B(r302, inspirationVideoTemplateTransitionContext.A02, "out_clip_index");
            AbstractC11224vw.A05(r302, c26c, inspirationVideoTemplateTransitionContext.A00(), "transition_type");
            r302.A0Y();
        }
    }

    public InspirationVideoTemplateTransitionContext(Parcel parcel) {
        GraphQLFBInspirationVideoTemplateTransitionType graphQLFBInspirationVideoTemplateTransitionType = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = AbI.A0z(parcel);
        }
        if (parcel.readInt() == 0) {
            this.A02 = null;
        } else {
            this.A02 = AbI.A0z(parcel);
        }
        this.A00 = parcel.readInt() != 0 ? GraphQLFBInspirationVideoTemplateTransitionType.values()[parcel.readInt()] : graphQLFBInspirationVideoTemplateTransitionType;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x006d, code lost:
    
        if (r0 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0070, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0068, code lost:
    
        if (r0 != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0059, code lost:
    
        if (r0 != 3) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public InspirationVideoTemplateTransitionContext(com.facebook.graphql.enums.GraphQLFBInspirationVideoTemplateTransitionType r302, java.lang.Integer r303, java.lang.Integer r304, java.util.Set r305) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r304
            r0.A02 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            r0 = r305
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            r306 = r0
            r0 = r301
            r1 = r306
            r0.A03 = r1
            r0 = r301
            com.facebook.graphql.enums.GraphQLFBInspirationVideoTemplateTransitionType r0 = r0.A00()
            r306 = r0
            r0 = r301
            java.lang.Integer r0 = r0.A01
            r307 = r0
            r0 = r301
            java.lang.Integer r0 = r0.A02
            r308 = r0
            r0 = r306
            if (r0 == 0) goto L5c
            r0 = r306
            int r0 = r0.ordinal()
            r309 = r0
            r0 = 2
            r310 = r0
            r0 = r309
            r1 = r310
            if (r0 == r1) goto L66
            r0 = 1
            r310 = r0
            r0 = r309
            r1 = r310
            if (r0 == r1) goto L60
            r0 = 3
            r310 = r0
            r0 = r309
            r1 = r310
            if (r0 == r1) goto L6b
        L5c:
            java.lang.IllegalStateException r0 = X.1BK.A0g()
            throw r0
        L60:
            r0 = r307
            if (r0 == 0) goto L5c
            return
        L66:
            r0 = r307
            if (r0 == 0) goto L5c
        L6b:
            r0 = r308
            if (r0 == 0) goto L5c
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.inspiration.model.InspirationVideoTemplateTransitionContext.<init>(com.facebook.graphql.enums.GraphQLFBInspirationVideoTemplateTransitionType, java.lang.Integer, java.lang.Integer, java.util.Set):void");
    }

    public GraphQLFBInspirationVideoTemplateTransitionType A00() {
        if (this.A03.contains("transitionType")) {
            return this.A00;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = GraphQLFBInspirationVideoTemplateTransitionType.A02;
                }
            }
        }
        return A04;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationVideoTemplateTransitionContext)) {
                return false;
            }
            InspirationVideoTemplateTransitionContext inspirationVideoTemplateTransitionContext = (InspirationVideoTemplateTransitionContext) obj;
            if (!11T.A0O(this.A01, inspirationVideoTemplateTransitionContext.A01) || !11T.A0O(this.A02, inspirationVideoTemplateTransitionContext.A02) || A00() != inspirationVideoTemplateTransitionContext.A00()) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A042 = C1pq.A04(this.A02, C1pq.A03(this.A01));
        return (A042 * 31) + C3o5.A03(A00());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0f(parcel, this.A01);
        C3o5.A0f(parcel, this.A02);
        C3o5.A0e(parcel, this.A00);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
