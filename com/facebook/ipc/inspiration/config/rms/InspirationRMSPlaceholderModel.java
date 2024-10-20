package com.facebook.ipc.inspiration.config.rms;

import X.0Q8;
import X.11T;
import X.28Q;
import X.4YV;
import X.5BB;
import X.AbG;
import X.AbM;
import X.AbstractC01033pi;
import X.AbstractC11224vw;
import X.AnonymousClass001;
import X.C1pq;
import X.C26c;
import X.C27T;
import X.C3o5;
import X.C42h;
import X.C4V6;
import X.CSR;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.graphql.enums.GraphQLXFBUEGMediaPlaceholderIconName;
import com.facebook.graphql.enums.GraphQLXFBUEGMediaPlaceholderIconSize;
import com.facebook.graphql.enums.GraphQLXFBUEGMediaPlaceholderIconVariant;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationRMSPlaceholderModel.class */
public final class InspirationRMSPlaceholderModel implements Parcelable {
    public static volatile GraphQLXFBUEGMediaPlaceholderIconName A0A;
    public static volatile GraphQLXFBUEGMediaPlaceholderIconSize A0B;
    public static volatile GraphQLXFBUEGMediaPlaceholderIconVariant A0C;
    public static final Parcelable.Creator CREATOR = new CSR(38);
    public final float A00;
    public final float A01;
    public final float A02;
    public final float A03;
    public final float A04;
    public final String A05;
    public final GraphQLXFBUEGMediaPlaceholderIconName A06;
    public final GraphQLXFBUEGMediaPlaceholderIconSize A07;
    public final GraphQLXFBUEGMediaPlaceholderIconVariant A08;
    public final Set A09;

    /* loaded from: InspirationRMSPlaceholderModel$Deserializer.class */
    public class Deserializer extends JsonDeserializer {
        @Override // com.fasterxml.jackson.databind.JsonDeserializer
        public /* bridge */ /* synthetic */ Object A0M(AbstractC01033pi abstractC01033pi, C27T c27t) {
            float f = 0.0f;
            GraphQLXFBUEGMediaPlaceholderIconName graphQLXFBUEGMediaPlaceholderIconName = null;
            GraphQLXFBUEGMediaPlaceholderIconSize graphQLXFBUEGMediaPlaceholderIconSize = null;
            GraphQLXFBUEGMediaPlaceholderIconVariant graphQLXFBUEGMediaPlaceholderIconVariant = null;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            float f5 = 0.0f;
            HashSet A0v = AnonymousClass001.A0v();
            String str = "";
            do {
                try {
                    if (abstractC01033pi.A1J() == C42h.A03) {
                        String A1Y = abstractC01033pi.A1Y();
                        abstractC01033pi.A1K();
                        switch (A1Y.hashCode()) {
                            case -1817104942:
                                if (A1Y.equals("left_percentage")) {
                                    f2 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -1390460921:
                                if (A1Y.equals("icon_size")) {
                                    graphQLXFBUEGMediaPlaceholderIconSize = (GraphQLXFBUEGMediaPlaceholderIconSize) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBUEGMediaPlaceholderIconSize.class);
                                    A0v = 4YV.A10("iconSize", A0v);
                                    break;
                                }
                                break;
                            case -361805646:
                                if (A1Y.equals("height_percentage")) {
                                    f = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case -130389313:
                                if (A1Y.equals("icon_variant")) {
                                    graphQLXFBUEGMediaPlaceholderIconVariant = (GraphQLXFBUEGMediaPlaceholderIconVariant) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBUEGMediaPlaceholderIconVariant.class);
                                    A0v = 4YV.A10("iconVariant", A0v);
                                    break;
                                }
                                break;
                            case -40300674:
                                if (A1Y.equals("rotation")) {
                                    f3 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 3226745:
                                if (A1Y.equals(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
                                    graphQLXFBUEGMediaPlaceholderIconName = (GraphQLXFBUEGMediaPlaceholderIconName) AbstractC11224vw.A02(abstractC01033pi, c27t, GraphQLXFBUEGMediaPlaceholderIconName.class);
                                    A0v = 4YV.A10(PublicKeyCredentialControllerUtility.JSON_KEY_ICON, A0v);
                                    break;
                                }
                                break;
                            case 110371416:
                                if (A1Y.equals("title")) {
                                    str = AbstractC11224vw.A03(abstractC01033pi);
                                    C1pq.A08("title", str);
                                    break;
                                }
                                break;
                            case 720621508:
                                if (A1Y.equals("top_percentage")) {
                                    f4 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                            case 770040499:
                                if (A1Y.equals("width_percentage")) {
                                    f5 = abstractC01033pi.A13();
                                    break;
                                }
                                break;
                        }
                        abstractC01033pi.A20();
                    }
                } catch (Exception e) {
                    C4V6.A01(abstractC01033pi, InspirationRMSPlaceholderModel.class, e);
                    throw 0Q8.createAndThrow();
                }
            } while (5BB.A00(abstractC01033pi) != C42h.A02);
            return new InspirationRMSPlaceholderModel(graphQLXFBUEGMediaPlaceholderIconName, graphQLXFBUEGMediaPlaceholderIconSize, graphQLXFBUEGMediaPlaceholderIconVariant, str, A0v, f, f2, f3, f4, f5);
        }
    }

    /* loaded from: InspirationRMSPlaceholderModel$Serializer.class */
    public class Serializer extends JsonSerializer {
        @Override // com.fasterxml.jackson.databind.JsonSerializer
        public /* bridge */ /* synthetic */ void A0A(28Q r302, C26c c26c, Object obj) {
            InspirationRMSPlaceholderModel inspirationRMSPlaceholderModel = (InspirationRMSPlaceholderModel) obj;
            r302.A0b();
            float f = inspirationRMSPlaceholderModel.A00;
            r302.A0o("height_percentage");
            r302.A0e(f);
            AbstractC11224vw.A05(r302, c26c, inspirationRMSPlaceholderModel.A00(), PublicKeyCredentialControllerUtility.JSON_KEY_ICON);
            AbstractC11224vw.A05(r302, c26c, inspirationRMSPlaceholderModel.A01(), "icon_size");
            AbstractC11224vw.A05(r302, c26c, inspirationRMSPlaceholderModel.A02(), "icon_variant");
            float f2 = inspirationRMSPlaceholderModel.A01;
            r302.A0o("left_percentage");
            r302.A0e(f2);
            float f3 = inspirationRMSPlaceholderModel.A02;
            r302.A0o("rotation");
            r302.A0e(f3);
            AbstractC11224vw.A0D(r302, "title", inspirationRMSPlaceholderModel.A05);
            float f4 = inspirationRMSPlaceholderModel.A03;
            r302.A0o("top_percentage");
            r302.A0e(f4);
            float f5 = inspirationRMSPlaceholderModel.A04;
            r302.A0o("width_percentage");
            r302.A0e(f5);
            r302.A0Y();
        }
    }

    public InspirationRMSPlaceholderModel(Parcel parcel) {
        AbG.A1X(this);
        this.A00 = parcel.readFloat();
        GraphQLXFBUEGMediaPlaceholderIconVariant graphQLXFBUEGMediaPlaceholderIconVariant = null;
        if (parcel.readInt() == 0) {
            this.A06 = null;
        } else {
            this.A06 = GraphQLXFBUEGMediaPlaceholderIconName.values()[parcel.readInt()];
        }
        if (parcel.readInt() == 0) {
            this.A07 = null;
        } else {
            this.A07 = GraphQLXFBUEGMediaPlaceholderIconSize.values()[parcel.readInt()];
        }
        this.A08 = parcel.readInt() != 0 ? GraphQLXFBUEGMediaPlaceholderIconVariant.values()[parcel.readInt()] : graphQLXFBUEGMediaPlaceholderIconVariant;
        this.A01 = parcel.readFloat();
        this.A02 = parcel.readFloat();
        this.A05 = parcel.readString();
        this.A03 = parcel.readFloat();
        this.A04 = parcel.readFloat();
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A09 = Collections.unmodifiableSet(A0v);
    }

    public InspirationRMSPlaceholderModel(GraphQLXFBUEGMediaPlaceholderIconName graphQLXFBUEGMediaPlaceholderIconName, GraphQLXFBUEGMediaPlaceholderIconSize graphQLXFBUEGMediaPlaceholderIconSize, GraphQLXFBUEGMediaPlaceholderIconVariant graphQLXFBUEGMediaPlaceholderIconVariant, String str, Set set, float f, float f2, float f3, float f4, float f5) {
        this.A00 = f;
        this.A06 = graphQLXFBUEGMediaPlaceholderIconName;
        this.A07 = graphQLXFBUEGMediaPlaceholderIconSize;
        this.A08 = graphQLXFBUEGMediaPlaceholderIconVariant;
        this.A01 = f2;
        this.A02 = f3;
        C1pq.A08("title", str);
        this.A05 = str;
        this.A03 = f4;
        this.A04 = f5;
        this.A09 = Collections.unmodifiableSet(set);
    }

    public GraphQLXFBUEGMediaPlaceholderIconName A00() {
        if (this.A09.contains(PublicKeyCredentialControllerUtility.JSON_KEY_ICON)) {
            return this.A06;
        }
        if (A0A == null) {
            synchronized (this) {
                if (A0A == null) {
                    A0A = GraphQLXFBUEGMediaPlaceholderIconName.PHOTO;
                }
            }
        }
        return A0A;
    }

    public GraphQLXFBUEGMediaPlaceholderIconSize A01() {
        if (this.A09.contains("iconSize")) {
            return this.A07;
        }
        if (A0B == null) {
            synchronized (this) {
                if (A0B == null) {
                    A0B = GraphQLXFBUEGMediaPlaceholderIconSize.DP20;
                }
            }
        }
        return A0B;
    }

    public GraphQLXFBUEGMediaPlaceholderIconVariant A02() {
        if (this.A09.contains("iconVariant")) {
            return this.A08;
        }
        if (A0C == null) {
            synchronized (this) {
                if (A0C == null) {
                    A0C = GraphQLXFBUEGMediaPlaceholderIconVariant.FILLED;
                }
            }
        }
        return A0C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof InspirationRMSPlaceholderModel)) {
                return false;
            }
            InspirationRMSPlaceholderModel inspirationRMSPlaceholderModel = (InspirationRMSPlaceholderModel) obj;
            if (this.A00 != inspirationRMSPlaceholderModel.A00 || A00() != inspirationRMSPlaceholderModel.A00() || A01() != inspirationRMSPlaceholderModel.A01() || A02() != inspirationRMSPlaceholderModel.A02() || this.A01 != inspirationRMSPlaceholderModel.A01 || this.A02 != inspirationRMSPlaceholderModel.A02 || !11T.A0O(this.A05, inspirationRMSPlaceholderModel.A05) || this.A03 != inspirationRMSPlaceholderModel.A03 || this.A04 != inspirationRMSPlaceholderModel.A04) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int i = -1;
        int floatToIntBits = ((((Float.floatToIntBits(this.A00) + 31) * 31) + C3o5.A03(A00())) * 31) + C3o5.A03(A01());
        GraphQLXFBUEGMediaPlaceholderIconVariant A02 = A02();
        if (A02 != null) {
            i = A02.ordinal();
        }
        return AbM.A00(AbM.A00(C1pq.A04(this.A05, AbM.A00(AbM.A00((floatToIntBits * 31) + i, this.A01), this.A02)), this.A03), this.A04);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.A00);
        C3o5.A0e(parcel, this.A06);
        C3o5.A0e(parcel, this.A07);
        C3o5.A0e(parcel, this.A08);
        parcel.writeFloat(this.A01);
        parcel.writeFloat(this.A02);
        parcel.writeString(this.A05);
        parcel.writeFloat(this.A03);
        parcel.writeFloat(this.A04);
        Iterator A0S = C3o5.A0S(parcel, this.A09);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
