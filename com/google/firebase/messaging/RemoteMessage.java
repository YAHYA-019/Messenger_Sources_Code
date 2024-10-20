package com.google.firebase.messaging;

import X.0QO;
import X.4YT;
import X.AbstractC01153q8;
import X.JQx;
import X.LGm;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* loaded from: RemoteMessage.class */
public final class RemoteMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = LGm.A00(84);
    public Bundle A00;
    public Map A01;

    public final int A00() {
        int i;
        Bundle bundle = this.A00;
        String string = bundle.getString("google.delivered_priority");
        if (string == null) {
            if (ConstantsKt.CAMERA_ID_BACK.equals(bundle.getString("google.priority_reduced"))) {
                return 2;
            }
            string = bundle.getString(4YT.A00(1140));
        }
        if ("high".equals(string)) {
            i = 1;
        } else {
            i = 0;
            if ("normal".equals(string)) {
                return 2;
            }
        }
        return i;
    }

    public final Map A01() {
        0QO r302 = this.A01;
        if (r302 == null) {
            Bundle bundle = this.A00;
            r302 = new 0QO(0);
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if ((obj instanceof String) && !str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                    r302.put(str, obj);
                }
            }
            this.A01 = r302;
        }
        return r302;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int A0E = JQx.A0E(parcel);
        AbstractC01153q8.A02(this.A00, parcel, 2);
        AbstractC01153q8.A03(parcel, A0E);
    }
}
