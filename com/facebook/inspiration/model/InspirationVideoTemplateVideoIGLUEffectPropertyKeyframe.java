package com.facebook.inspiration.model;

import X.11T;
import X.AbM;
import X.AnonymousClass001;
import X.C1pq;
import X.C3o5;
import X.DKH;
import X.FKf;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.graphql.enums.GraphQLXFBInspirationVideoTemplateAnimationCurve;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe.class */
public final class InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe implements Parcelable {
    public static volatile GraphQLXFBInspirationVideoTemplateAnimationCurve A04;
    public static final Parcelable.Creator CREATOR = FKf.A01(84);
    public final float A00;
    public final GraphQLXFBInspirationVideoTemplateAnimationCurve A01;
    public final Float A02;
    public final Set A03;

    public InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe(Parcel parcel) {
        Float f = null;
        if (C3o5.A01(parcel, this) == 0) {
            this.A01 = null;
        } else {
            this.A01 = GraphQLXFBInspirationVideoTemplateAnimationCurve.values()[parcel.readInt()];
        }
        this.A00 = parcel.readFloat();
        this.A02 = parcel.readInt() != 0 ? Float.valueOf(parcel.readFloat()) : f;
        HashSet A0v = AnonymousClass001.A0v();
        int readInt = parcel.readInt();
        int i = 0;
        while (i < readInt) {
            i = C3o5.A02(parcel, A0v, i);
        }
        this.A03 = Collections.unmodifiableSet(A0v);
    }

    public InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe(GraphQLXFBInspirationVideoTemplateAnimationCurve graphQLXFBInspirationVideoTemplateAnimationCurve, Float f, Set set, float f2) {
        this.A01 = graphQLXFBInspirationVideoTemplateAnimationCurve;
        this.A00 = f2;
        this.A02 = f;
        this.A03 = Collections.unmodifiableSet(set);
    }

    public GraphQLXFBInspirationVideoTemplateAnimationCurve A00() {
        if (this.A03.contains("animationCurve")) {
            return this.A01;
        }
        if (A04 == null) {
            synchronized (this) {
                if (A04 == null) {
                    A04 = GraphQLXFBInspirationVideoTemplateAnimationCurve.A01;
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
            if (!(obj instanceof InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe)) {
                return false;
            }
            InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe inspirationVideoTemplateVideoIGLUEffectPropertyKeyframe = (InspirationVideoTemplateVideoIGLUEffectPropertyKeyframe) obj;
            if (A00() != inspirationVideoTemplateVideoIGLUEffectPropertyKeyframe.A00() || this.A00 != inspirationVideoTemplateVideoIGLUEffectPropertyKeyframe.A00 || !11T.A0O(this.A02, inspirationVideoTemplateVideoIGLUEffectPropertyKeyframe.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return C1pq.A04(this.A02, AbM.A00(C3o5.A03(A00()) + 31, this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        C3o5.A0e(parcel, this.A01);
        parcel.writeFloat(this.A00);
        DKH.A12(parcel, this.A02);
        Iterator A0S = C3o5.A0S(parcel, this.A03);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
    }
}
