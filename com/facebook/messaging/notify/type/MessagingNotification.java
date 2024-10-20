package com.facebook.messaging.notify.type;

import X.1BK;
import X.1BL;
import X.1Bi;
import X.C00i;
import X.C01s;
import X.C50c;
import X.C53v;
import X.C5ap;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.rtc.callstatus.notification.MissedCallNotification;
import com.facebook.push.constants.PushProperty;
import java.util.HashMap;

/* loaded from: MessagingNotification.class */
public abstract class MessagingNotification implements Parcelable {
    public boolean A00;
    public final C5ap A01;
    public final PushProperty A02;
    public final C00i A03 = 1Bi.A02(C01s.class, (Class) null);

    public MessagingNotification(C5ap c5ap, PushProperty pushProperty) {
        this.A02 = pushProperty;
        this.A01 = c5ap;
    }

    public MessagingNotification(Parcel parcel) {
        PushProperty pushProperty;
        try {
            pushProperty = (PushProperty) 1BL.A0C(parcel, PushProperty.class);
        } catch (BadParcelableException e) {
            1BK.A09(this.A03).softReport("MessagingNotification", e);
            pushProperty = null;
        }
        this.A02 = pushProperty;
        this.A01 = C5ap.A00(parcel.readString());
        this.A00 = C53v.A0S(parcel);
    }

    public C50c A02() {
        if (this instanceof NewMessageNotification) {
            return ((NewMessageNotification) this).A0I;
        }
        if (this instanceof MissedCallNotification) {
            return ((MissedCallNotification) this).A03;
        }
        return null;
    }

    public HashMap A03() {
        HashMap hashMap = new HashMap();
        hashMap.put("client_notif_type", this.A01.toString());
        PushProperty pushProperty = this.A02;
        if (pushProperty != null) {
            hashMap.putAll(pushProperty.A00());
        }
        return hashMap;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A01.stringValue);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
