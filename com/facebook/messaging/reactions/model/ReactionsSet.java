package com.facebook.messaging.reactions.model;

import X.11T;
import X.1BK;
import X.1BL;
import X.5Yu;
import X.5ZL;
import X.C04v;
import X.C0uA;
import X.C3o5;
import X.CSS;
import X.KZ3;
import X.M9j;
import X.SFm;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;

/* loaded from: ReactionsSet.class */
public final class ReactionsSet extends C04v implements Parcelable {
    public static final 5Yu[] A02;
    public final Set A00;
    public final Set A01;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = new CSS(41);

    /* loaded from: ReactionsSet$Companion.class */
    public final class Companion {
        public final 5Yu serializer() {
            return SFm.A00;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.messaging.reactions.model.ReactionsSet$Companion] */
    static {
        5ZL r0 = 5ZL.A01;
        A02 = new 5Yu[]{new M9j(r0), new M9j(KZ3.A00(r0))};
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ReactionsSet() {
        /*
            r301 = this;
            X.0uA r0 = X.C0uA.A00
            r302 = r0
            r0 = r301
            r1 = r302
            r2 = r302
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.model.ReactionsSet.<init>():void");
    }

    public ReactionsSet(Set set, Set set2) {
        this.A00 = set;
        this.A01 = set2;
    }

    public /* synthetic */ ReactionsSet(Set set, Set set2, int i) {
        this.A00 = (i & 1) == 0 ? C0uA.A00 : set;
        if ((i & 2) == 0) {
            this.A01 = C0uA.A00;
        } else {
            this.A01 = set2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r301.A01.isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A00() {
        /*
            r301 = this;
            r0 = r301
            java.util.Set r0 = r0.A00
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L22
            r0 = r301
            java.util.Set r0 = r0.A01
            r302 = r0
            r0 = r302
            boolean r0 = r0.isEmpty()
            r304 = r0
            r0 = 1
            r303 = r0
            r0 = r304
            if (r0 != 0) goto L26
        L22:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L26:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.model.ReactionsSet.A00():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r301.A01.contains(r302) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean A01(java.lang.String r302) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            java.util.Set r0 = r0.A00
            r303 = r0
            r0 = r303
            r1 = r302
            boolean r0 = r0.contains(r1)
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2b
            r0 = r301
            java.util.Set r0 = r0.A01
            r1 = r302
            boolean r0 = r0.contains(r1)
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
            r0 = r305
            if (r0 == 0) goto L2d
        L2b:
            r0 = 1
            r304 = r0
        L2d:
            r0 = r304
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.reactions.model.ReactionsSet.A01(java.lang.String):boolean");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ReactionsSet)) {
                return false;
            }
            ReactionsSet reactionsSet = (ReactionsSet) obj;
            if (!11T.A0O(this.A00, reactionsSet.A00) || !11T.A0O(this.A01, reactionsSet.A01)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return 1BK.A03(this.A01, 1BL.A03(this.A00));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Iterator A0S = C3o5.A0S(parcel, this.A00);
        while (A0S.hasNext()) {
            C3o5.A0h(parcel, A0S);
        }
        Iterator A0S2 = C3o5.A0S(parcel, this.A01);
        while (A0S2.hasNext()) {
            C3o5.A0h(parcel, A0S2);
        }
    }
}
