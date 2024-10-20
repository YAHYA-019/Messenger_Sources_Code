package com.facebook.messaging.model.platformmetadata.types.quickreply;

import X.0fH;
import X.1BK;
import X.24X;
import X.2DM;
import X.4YV;
import X.8AJ;
import X.8AN;
import X.8AP;
import X.AnonymousClass001;
import X.C26T;
import X.C3o5;
import X.C9a9;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.util.JSONUtil;
import com.facebook.messaging.business.common.calltoaction.model.CallToAction;
import com.facebook.messaging.composer.quickreply.logging.type.QuickReplyLoggingType;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.user.model.UserKey;
import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: QuickReplyItem.class */
public final class QuickReplyItem implements Parcelable {
    public static final Double A0F = Double.valueOf(-1.0d);
    public static final Parcelable.Creator CREATOR = new 8AP();
    public final CallToAction A00;
    public final QuickReplyLoggingType A01;
    public final 8AN A02;
    public final 8AJ A03;
    public final ThreadKey A04;
    public final UserKey A05;
    public final 24X A06;
    public final Double A07;
    public final Integer A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final boolean A0D;
    public final boolean A0E;

    public QuickReplyItem(C9a9 c9a9) {
        this.A0C = c9a9.A0C;
        this.A02 = c9a9.A02;
        this.A0B = c9a9.A0B;
        this.A0A = c9a9.A0A;
        this.A06 = c9a9.A06;
        this.A03 = c9a9.A03;
        this.A0E = c9a9.A0E;
        this.A04 = c9a9.A04;
        this.A05 = c9a9.A05;
        this.A00 = c9a9.A00;
        this.A08 = c9a9.A08;
        this.A01 = c9a9.A01;
        this.A07 = c9a9.A07;
        this.A09 = c9a9.A09;
        this.A0D = c9a9.A0D;
    }

    public 2DM A00() {
        2DM r0 = new 2DM(C26T.A00);
        String str = this.A0C;
        if (str != null) {
            r0.A0o("title", str);
        }
        8AN r02 = this.A02;
        if (r02 != null) {
            r0.A0o(TraceFieldType.ContentType, r02.dbValue);
        }
        String str2 = this.A0B;
        if (str2 != null) {
            r0.A0o("payload", str2);
        }
        String str3 = this.A0A;
        if (str3 != null) {
            r0.A0o("image_url", str3);
        }
        24X r03 = this.A06;
        if (r03 != null) {
            r0.A0e(r03, "data");
        }
        r0.A0i("view_type", C3o5.A03(this.A03));
        r0.A0p("is_localized", this.A0E);
        return r0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        boolean z = false;
        if (obj instanceof QuickReplyItem) {
            QuickReplyItem quickReplyItem = (QuickReplyItem) obj;
            if (Objects.equal(this.A0C, quickReplyItem.A0C) && Objects.equal(this.A02, quickReplyItem.A02) && Objects.equal(this.A0B, quickReplyItem.A0B) && Objects.equal(this.A0A, quickReplyItem.A0A) && Objects.equal(this.A06, quickReplyItem.A06) && Objects.equal(this.A03, quickReplyItem.A03) && this.A0E == quickReplyItem.A0E && Objects.equal(this.A04, quickReplyItem.A04) && Objects.equal(this.A05, quickReplyItem.A05)) {
                z = 4YV.A1Z(this.A00, quickReplyItem.A00);
            }
        }
        return z;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A0C, this.A02, this.A0B, this.A0A, this.A06, this.A03, Boolean.valueOf(this.A0E), this.A04, this.A05, this.A00, this.A01, this.A07, this.A09});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        String str;
        parcel.writeString(this.A0C);
        8AN r0 = this.A02;
        str = "";
        parcel.writeString(r0 == null ? str : r0.dbValue);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0A);
        24X r02 = this.A06;
        Bundle A05 = 1BK.A05();
        if (r02 instanceof 2DM) {
            Iterator A0M = r02.A0M();
            while (A0M.hasNext()) {
                String A0i = AnonymousClass001.A0i(A0M);
                24X A0D = r02.A0D(A0i);
                if (A0D == null || A0D.A0W() || A0D.A0X() || A0D.A0Y()) {
                    A05.putCharSequence(A0i, JSONUtil.A0H(A0D, null));
                } else {
                    0fH.A14("QuickReplyItem::convertToBundle", "Unexpected value type: %s", new Object[]{A0D.A0F()});
                }
            }
        }
        parcel.writeBundle(A05);
        parcel.writeInt(C3o5.A03(this.A03));
        parcel.writeBoolean(this.A0E);
        parcel.writeParcelable(this.A04, i);
        parcel.writeParcelable(this.A05, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        Double d = this.A07;
        if (d == null) {
            d = A0F;
        }
        parcel.writeDouble(d.doubleValue());
        String str2 = this.A09;
        parcel.writeString(str2 != null ? str2 : "");
        parcel.writeBoolean(this.A0D);
    }
}
