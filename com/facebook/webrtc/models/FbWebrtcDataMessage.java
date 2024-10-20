package com.facebook.webrtc.models;

import X.2DM;
import X.2K1;
import X.4YU;
import X.AnonymousClass001;
import X.C03353xs;
import X.C26T;
import X.FKb;
import X.H9Q;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: FbWebrtcDataMessage.class */
public final class FbWebrtcDataMessage implements Parcelable {
    public static final Parcelable.Creator CREATOR = new FKb(33);
    public final FbWebrtcDataMessageHeader A00;
    public final FbWebrtcGenericDataMessage A01;

    public FbWebrtcDataMessage(Parcel parcel) {
        this.A00 = (FbWebrtcDataMessageHeader) FbWebrtcDataMessageHeader.CREATOR.createFromParcel(parcel);
        this.A01 = (FbWebrtcGenericDataMessage) FbWebrtcGenericDataMessage.CREATOR.createFromParcel(parcel);
    }

    public FbWebrtcDataMessage(FbWebrtcDataMessageHeader fbWebrtcDataMessageHeader, FbWebrtcGenericDataMessage fbWebrtcGenericDataMessage) {
        this.A00 = fbWebrtcDataMessageHeader;
        this.A01 = fbWebrtcGenericDataMessage;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toJSONString() {
        C26T c26t = C26T.A00;
        2DM A0g = 4YU.A0g(c26t);
        FbWebrtcDataMessageHeader fbWebrtcDataMessageHeader = this.A00;
        2DM A0g2 = 4YU.A0g(c26t);
        String str = fbWebrtcDataMessageHeader.A00;
        if (str != null) {
            A0g2.A0o("sender", str);
        }
        Collection collection = fbWebrtcDataMessageHeader.A02;
        if (collection != null) {
            C03353xs c03353xs = new C03353xs(c26t);
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                c03353xs.A0e(AnonymousClass001.A0i(it));
            }
            A0g2.A0e(c03353xs, "recipients");
        }
        Collection collection2 = fbWebrtcDataMessageHeader.A01;
        if (collection2 != null) {
            C03353xs c03353xs2 = new C03353xs(c26t);
            Iterator it2 = collection2.iterator();
            while (it2.hasNext()) {
                c03353xs2._children.add(2K1.A00(((H9Q) it2.next()).ordinal()));
            }
            A0g2.A0e(c03353xs2, "serviceRecipients");
        }
        A0g.A0e(A0g2, "header");
        FbWebrtcGenericDataMessage fbWebrtcGenericDataMessage = this.A01;
        2DM A0g3 = 4YU.A0g(c26t);
        2DM A0g4 = 4YU.A0g(c26t);
        A0g4.A0o("topic", fbWebrtcGenericDataMessage.A00);
        A0g4.A0o("body64", Base64.encodeToString(fbWebrtcGenericDataMessage.A01, 2));
        A0g3.A0e(A0g4, "genericMessage");
        A0g.A0e(A0g3, "body");
        return A0g.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        this.A00.writeToParcel(parcel, i);
        this.A01.writeToParcel(parcel, i);
    }
}
