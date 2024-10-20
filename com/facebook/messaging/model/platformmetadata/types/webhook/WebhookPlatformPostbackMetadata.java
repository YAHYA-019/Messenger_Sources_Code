package com.facebook.messaging.model.platformmetadata.types.webhook;

import X.24X;
import X.2DM;
import X.2Jz;
import X.4YU;
import X.C5qt;
import X.C7yy;
import X.CSa;
import android.os.Parcel;
import com.facebook.messaging.model.platformmetadata.common.PlatformMetadata;

/* loaded from: WebhookPlatformPostbackMetadata.class */
public final class WebhookPlatformPostbackMetadata extends PlatformMetadata {
    public static final C7yy CREATOR = new CSa(7);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public WebhookPlatformPostbackMetadata(String str, String str2, String str3, String str4, String str5, String str6, boolean z, boolean z2) {
        this.A00 = str;
        this.A05 = str6;
        this.A01 = str2;
        this.A07 = z2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
        this.A06 = z;
    }

    @Override // com.facebook.messaging.model.platformmetadata.common.PlatformMetadata
    public C5qt A00() {
        return C5qt.A0C;
    }

    @Override // com.facebook.messaging.model.platformmetadata.common.PlatformMetadata
    public 24X A01() {
        2DM A0f = 4YU.A0f();
        String str = this.A00;
        A0f.A0o("cta_id", str);
        A0f.A0o("postback_cta_ref_source", this.A02);
        String str2 = this.A05;
        if (str2 != null) {
            A0f.A0o("prev_message_id", str2);
        }
        String str3 = this.A01;
        if (str3 != null) {
            A0f.A0o("ref", str3);
        }
        if (str != null) {
            A0f.A0p("force_handle", this.A07);
        }
        String str4 = this.A03;
        if (str4 != null) {
            A0f.A0o("postback_cta_ref_type", str4);
        }
        String str5 = this.A04;
        if (str5 != null) {
            A0f.A0o("postback_cta_source_id", str5);
        }
        A0f.A0p("disable_thread_bump_and_push_for_biz", this.A06);
        return 2Jz.A00(A0f.toString());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A00);
        parcel.writeString(this.A05);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A06 ? 1 : 0);
    }
}
