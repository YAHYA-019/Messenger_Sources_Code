package com.facebook.messaging.service.model;

import X.AbK;
import X.AbN;
import X.CSU;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.UserKey;
import com.google.common.collect.ImmutableList;

/* loaded from: RemoveAdminsFromGroupParams.class */
public final class RemoveAdminsFromGroupParams implements Parcelable {
    public static final Parcelable.Creator CREATOR = CSU.A00(8);
    public final ThreadKey A00;
    public final ImmutableList A01;

    public RemoveAdminsFromGroupParams(Parcel parcel) {
        this.A01 = AbN.A0e(parcel, UserKey.class);
        this.A00 = AbK.A0X(parcel);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (r302.A11() != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public RemoveAdminsFromGroupParams(com.facebook.messaging.model.threadkey.ThreadKey r302, com.google.common.collect.ImmutableList r303) {
        /*
            r301 = this;
            r0 = r301
            r0.<init>()
            r0 = r302
            java.lang.Class r0 = r0.getClass()
            r0 = r302
            boolean r0 = r0.A1F()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L22
            r0 = r302
            boolean r0 = r0.A11()
            r305 = r0
            r0 = 0
            r304 = r0
            r0 = 0
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L24
        L22:
            r0 = 1
            r304 = r0
        L24:
            r0 = r304
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r303
            boolean r0 = X.7zM.A1b(r0)
            r304 = r0
            r0 = r304
            com.google.common.base.Preconditions.checkArgument(r0)
            r0 = r303
            X.1Du r0 = r0.iterator()
            r307 = r0
        L37:
            r0 = r307
            boolean r0 = r0.hasNext()
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L61
            r0 = r307
            com.facebook.user.model.UserKey r0 = X.AbG.A0v(r0)
            X.1Js r0 = r0.type
            r308 = r0
            X.1Js r0 = X.1Js.A03
            r306 = r0
            r0 = r308
            r1 = r306
            boolean r0 = X.AnonymousClass001.A1W(r0, r1)
            r304 = r0
            r0 = r304
            com.google.common.base.Preconditions.checkArgument(r0)
            goto L37
        L61:
            r0 = r301
            r1 = r303
            r0.A01 = r1
            r0 = r301
            r1 = r302
            r0.A00 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.service.model.RemoveAdminsFromGroupParams.<init>(com.facebook.messaging.model.threadkey.ThreadKey, com.google.common.collect.ImmutableList):void");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A01);
        parcel.writeParcelable(this.A00, i);
    }
}
