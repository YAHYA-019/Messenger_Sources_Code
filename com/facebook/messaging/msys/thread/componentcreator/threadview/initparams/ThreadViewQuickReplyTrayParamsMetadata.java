package com.facebook.messaging.msys.thread.componentcreator.threadview.initparams;

import X.11T;
import X.1BJ;
import X.7zU;
import X.AnonymousClass002;
import X.AnonymousClass207;
import X.C04v;
import X.CST;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.facebook.xapp.messaging.threadview.initparams.model.ThreadInitParamsMetadata;

/* loaded from: ThreadViewQuickReplyTrayParamsMetadata.class */
public final class ThreadViewQuickReplyTrayParamsMetadata extends C04v implements ThreadInitParamsMetadata {
    public static final AnonymousClass207 A02;
    public static final Parcelable.Creator CREATOR = new CST(38);
    public final Integer A00;
    public final boolean A01;

    static {
        Parcelable.Creator creator = HeterogeneousMap.CREATOR;
        A02 = new AnonymousClass207(ThreadViewQuickReplyTrayParamsMetadata.class, null);
    }

    public ThreadViewQuickReplyTrayParamsMetadata(boolean z, Integer num) {
        this.A01 = z;
        this.A00 = num;
    }

    public static String A00(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "PROMINENT_BUBBLE_CARD";
            case 2:
                return "PROMINENT_INTENT_CARD";
            case 3:
                return "STICKY_H_SCROLL";
            default:
                return 1BJ.A00(285);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ThreadViewQuickReplyTrayParamsMetadata)) {
                return false;
            }
            ThreadViewQuickReplyTrayParamsMetadata threadViewQuickReplyTrayParamsMetadata = (ThreadViewQuickReplyTrayParamsMetadata) obj;
            if (this.A01 != threadViewQuickReplyTrayParamsMetadata.A01 || this.A00 != threadViewQuickReplyTrayParamsMetadata.A00) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        int A00 = AnonymousClass002.A00(this.A01 ? 1 : 0) * 31;
        Integer num = this.A00;
        return A00 + (num == null ? 0 : 7zU.A02(num, A00(num)));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A01 ? 1 : 0);
        Integer num = this.A00;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(A00(num));
        }
    }
}
