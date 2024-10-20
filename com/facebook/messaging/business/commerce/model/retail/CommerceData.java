package com.facebook.messaging.business.commerce.model.retail;

import X.CSW;
import X.HvM;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: CommerceData.class */
public final class CommerceData implements Parcelable {
    public static final Parcelable.Creator CREATOR = new CSW(16);
    public final CommerceBubbleModel A00;

    public CommerceData(Parcel parcel) {
        Class cls;
        ClassLoader classLoader;
        switch (HvM.A00(parcel.readInt()).intValue()) {
            case 1:
                cls = Receipt.class;
                classLoader = cls.getClassLoader();
                break;
            case 2:
                cls = ReceiptCancellation.class;
                classLoader = cls.getClassLoader();
                break;
            case 3:
            case 9:
                cls = Shipment.class;
                classLoader = cls.getClassLoader();
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
                cls = ShipmentTrackingEvent.class;
                classLoader = cls.getClassLoader();
                break;
            case 11:
                cls = AgentItemSuggestion.class;
                classLoader = cls.getClassLoader();
                break;
            default:
                classLoader = null;
                break;
        }
        this.A00 = (CommerceBubbleModel) parcel.readParcelable(classLoader);
    }

    public CommerceData(CommerceBubbleModel commerceBubbleModel) {
        this.A00 = commerceBubbleModel;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r305 == null) goto L6;
     */
    @Override // android.os.Parcelable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void writeToParcel(android.os.Parcel r302, int r303) {
        /*
            r301 = this;
            r0 = r302
            r1 = 0
            X.11T.A0F(r0, r1)
            r0 = r301
            com.facebook.messaging.business.commerce.model.retail.CommerceBubbleModel r0 = r0.A00
            r304 = r0
            r0 = r304
            if (r0 == 0) goto L1b
            r0 = r304
            java.lang.Integer r0 = r0.BHe()
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L20
        L1b:
            java.lang.Integer r0 = X.0S2.A00
            r305 = r0
        L20:
            r0 = r305
            int r0 = X.C7kk.A00(r0)
            r306 = r0
            r0 = r302
            r1 = r306
            r0.writeInt(r1)
            r0 = r302
            r1 = r304
            r2 = 0
            r0.writeParcelable(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.business.commerce.model.retail.CommerceData.writeToParcel(android.os.Parcel, int):void");
    }
}
