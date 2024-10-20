package com.facebook.messaging.model.messagemetadata;

import X.11T;
import X.1BL;
import X.24X;
import X.4YU;
import X.4YV;
import X.AnonymousClass244;
import X.BLw;
import X.C01s;
import X.CAh;
import X.CSV;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.messagemetadata.common.MessageMetadata;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: MessageMetadataAtTextRange.class */
public final class MessageMetadataAtTextRange implements Parcelable {
    public static ImmutableMap A04;
    public static final CAh A05 = new Object();
    public static final Parcelable.Creator CREATOR = CSV.A00(47);
    public final int A00;
    public final int A01;
    public final BLw A02;
    public final MessageMetadata A03;

    public MessageMetadataAtTextRange(BLw bLw, MessageMetadata messageMetadata, int i, int i2) {
        this.A02 = bLw;
        this.A01 = i;
        this.A00 = i2;
        this.A03 = messageMetadata;
    }

    public MessageMetadataAtTextRange(Parcel parcel) {
        Object obj;
        int readInt = parcel.readInt();
        Iterator it = BLw.A00.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((BLw) obj).value == readInt) {
                    break;
                }
            }
        }
        BLw bLw = (BLw) obj;
        this.A02 = bLw == null ? BLw.A04 : bLw;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
        this.A03 = (MessageMetadata) 1BL.A0C(parcel, MessageMetadata.class);
    }

    public static final ImmutableList A00(C01s c01s, AnonymousClass244 anonymousClass244, String str) {
        ImmutableList of;
        Object obj;
        boolean A1X = 1BL.A1X(anonymousClass244, c01s);
        if (str == null || str.length() == 0) {
            of = ImmutableList.of();
        } else {
            ImmutableList.Builder builder = ImmutableList.builder();
            try {
                24X A0I = anonymousClass244.A0I(str);
                if (A0I != null) {
                    Iterator it = A0I.iterator();
                    while (it.hasNext()) {
                        24X r0 = (24X) it.next();
                        11T.A0D(r0);
                        11T.A0F(r0, A1X ? 1 : 0);
                        int A01 = 4YU.A01(r0, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, 0);
                        Iterator it2 = BLw.A00.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it2.next();
                            if (((BLw) obj).value == A01) {
                                break;
                            }
                        }
                        BLw bLw = (BLw) obj;
                        if (bLw == null) {
                            bLw = BLw.A04;
                        }
                        MessageMetadata A00 = CAh.A00(c01s, r0.A0D("data"));
                        if (A00 != null) {
                            builder.m11011add((Object) new MessageMetadataAtTextRange(bLw, A00, 4YU.A01(r0, "offset", 0), 4YU.A01(r0, "length", 0)));
                        }
                    }
                }
            } catch (IOException e) {
                c01s.softReport("MessageMetadataAtTextRange", "Error while parsing MessageMetadataAtTextRange", e);
            }
            of = builder.build();
        }
        11T.A0A(of);
        return of;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj != null && (obj instanceof MessageMetadataAtTextRange)) {
            MessageMetadataAtTextRange messageMetadataAtTextRange = (MessageMetadataAtTextRange) obj;
            if (this.A02.value == messageMetadataAtTextRange.A02.value && this.A01 == messageMetadataAtTextRange.A01 && this.A00 == messageMetadataAtTextRange.A00) {
                z = 4YV.A1a(this.A03, messageMetadataAtTextRange.A03, false);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A02.value), Integer.valueOf(this.A01), Integer.valueOf(this.A00), this.A03});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        parcel.writeInt(this.A02.value);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
    }
}
