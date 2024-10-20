package com.facebook.messaging.nativepagereply.faq.data.model;

import X.0Q8;
import X.11T;
import X.4YV;
import X.5BB;
import X.7zU;
import X.AbG;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.GraphQLPageContentEditorCTA;
import com.fasterxml.jackson.databind.JsonDeserializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: AutomatedResponseButtonModel.class */
public final class AutomatedResponseButtonModel implements Parcelable {
    public static volatile GraphQLPageContentEditorCTA A04;
    public static final Parcelable.Creator CREATOR = new CST(42);
    public final String A00;
    public final String A01;
    public final GraphQLPageContentEditorCTA A02;
    public final Set A03;

    /* loaded from: AutomatedResponseButtonModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            String str;
            String A03;
            GraphQLPageContentEditorCTA graphQLPageContentEditorCTA = null;
            HashSet A0v = AnonymousClass001.A0v();
            String str2 = "";
            String str3 = str2;
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1C = AbG.A1C(abstractC01033pi);
                        int hashCode = A1C.hashCode();
                        if (hashCode != 116079) {
                            if (hashCode != 3575610) {
                                if (hashCode == 951530617) {
                                    str = "content";
                                    if (A1C.equals(str)) {
                                        A03 = AbstractC11224vw.A03(abstractC01033pi);
                                        str2 = A03;
                                        C1pq.A08(str, A03);
                                    }
                                }
                            } else if (A1C.equals(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
                                graphQLPageContentEditorCTA = (GraphQLPageContentEditorCTA) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLPageContentEditorCTA.class);
                                C1pq.A08(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, graphQLPageContentEditorCTA);
                                A0v = 4YV.A10(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, A0v);
                            }
                            abstractC01033pi.A20();
                        } else {
                            str = "url";
                            if (A1C.equals(str)) {
                                A03 = AbstractC11224vw.A03(abstractC01033pi);
                                str3 = A03;
                                C1pq.A08(str, A03);
                            }
                            abstractC01033pi.A20();
                        }
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, AutomatedResponseButtonModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new AutomatedResponseButtonModel(graphQLPageContentEditorCTA, str2, str3, A0v);
        }
    }

    public AutomatedResponseButtonModel(Parcel parcel) {
        this.A00 = 7zU.A0l(parcel, this);
        this.A02 = parcel.readInt() == 0 ? null : GraphQLPageContentEditorCTA.values()[parcel.readInt()];
        this.A01 = parcel.readString();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public AutomatedResponseButtonModel(GraphQLPageContentEditorCTA graphQLPageContentEditorCTA, String str, String str2, Set set) {
        C1pq.A08("content", str);
        this.A00 = str;
        this.A02 = graphQLPageContentEditorCTA;
        C1pq.A08("url", str2);
        this.A01 = str2;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public GraphQLPageContentEditorCTA A00() {
        if (this.A03.contains(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE)) {
            return this.A02;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = GraphQLPageContentEditorCTA.A01;
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
            if (!(obj instanceof AutomatedResponseButtonModel)) {
                return false;
            }
            AutomatedResponseButtonModel automatedResponseButtonModel = (AutomatedResponseButtonModel) obj;
            if (!11T.A0O(this.A00, automatedResponseButtonModel.A00) || A00() != automatedResponseButtonModel.A00() || !11T.A0O(this.A01, automatedResponseButtonModel.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A03 = C1pq.A03(this.A00);
        return C1pq.A04(this.A01, (A03 * 31) + C3o5.A03(A00()));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int ordinal;
        parcel.writeString(this.A00);
        GraphQLPageContentEditorCTA graphQLPageContentEditorCTA = this.A02;
        if (graphQLPageContentEditorCTA == null) {
            ordinal = 0;
        } else {
            parcel.writeInt(1);
            ordinal = graphQLPageContentEditorCTA.ordinal();
        }
        parcel.writeInt(ordinal);
        parcel.writeString(this.A01);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
