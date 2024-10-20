package com.meta.flytrap.attachment.model;

import X.0Q8;
import X.11T;
import X.5Yt;
import X.5Yu;
import X.7mU;
import X.AnonymousClass001;
import X.JQz;
import X.JR0;
import X.JR1;
import X.LGm;
import X.LwP;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: AttachmentCounter.class */
public final class AttachmentCounter implements Parcelable {
    public static final SerialDescriptor A01;
    public final ArrayList A00;
    public static final Companion Companion = new Object();
    public static final Parcelable.Creator CREATOR = LGm.A00(89);

    /* loaded from: AttachmentCounter$Companion.class */
    public final class Companion {
        public static final AttachmentCounter A00() {
            SerialDescriptor serialDescriptor = AttachmentCounter.A01;
            return new AttachmentCounter(AnonymousClass001.A0s());
        }

        public final 5Yu serializer(5Yu r302) {
            11T.A0F(r302, 0);
            return new LwP(r302);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.meta.flytrap.attachment.model.AttachmentCounter$Companion] */
    static {
        PluginGeneratedSerialDescriptor A11 = JR0.A11("com.meta.flytrap.attachment.model.AttachmentCounter", (5Yt) null);
        A11.A01("stack", false);
        A01 = A11;
    }

    public AttachmentCounter(ArrayList arrayList) {
        this.A00 = arrayList;
    }

    public /* synthetic */ AttachmentCounter(ArrayList arrayList, int i) {
        if (1 != (i & 1)) {
            7mU.A00(A01, i, 1);
            throw 0Q8.createAndThrow();
        }
        this.A00 = arrayList;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return JQz.A0p("AttachmentCounter(count=", this.A00.size());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        Iterator A13 = JR1.A13(parcel, this.A00);
        while (A13.hasNext()) {
            JR0.A17(parcel, A13, i);
        }
    }
}
