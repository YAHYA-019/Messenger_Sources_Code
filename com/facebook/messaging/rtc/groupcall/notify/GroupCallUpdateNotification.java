package com.facebook.messaging.rtc.groupcall.notify;

import X.0Pz;
import X.11T;
import X.1BY;
import X.1Bn;
import X.4YT;
import X.AbJ;
import X.AbK;
import X.AnonymousClass001;
import X.C4n;
import X.C53v;
import X.C82;
import X.CSS;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import java.util.HashMap;

/* loaded from: GroupCallUpdateNotification.class */
public final class GroupCallUpdateNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CSS.A00(51);
    public boolean A00;
    public final ThreadKey A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06;
    public final String A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x011a, code lost:
    
        if (r0.equals(r307) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x013c, code lost:
    
        r0 = r301.A03;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0144, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0150, code lost:
    
        if (r0.length() != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0153, code lost:
    
        A01(r302, "MissingServerInfoData", "validateNotificationAndLogError", X.0Pz.A0W("UpdateType: ", r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0139, code lost:
    
        if (r0.equals("participants_joined") != false) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public GroupCallUpdateNotification(android.content.Context r302, com.facebook.push.constants.PushProperty r303, X.24X r304, java.lang.String r305, java.lang.String r306) {
        /*
            Method dump skipped, instructions count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification.<init>(android.content.Context, com.facebook.push.constants.PushProperty, X.24X, java.lang.String, java.lang.String):void");
    }

    public GroupCallUpdateNotification(Parcel parcel) {
        super(parcel);
        String readString = parcel.readString();
        if (readString == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A04 = readString;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            throw AnonymousClass001.A0N("Required value was null.");
        }
        this.A02 = readString2;
        this.A05 = A00(null, parcel.readString(), "parcel constructor");
        this.A06 = C53v.A0S(parcel);
        this.A07 = parcel.readString();
        this.A01 = AbK.A0X(parcel);
        this.A03 = parcel.readString();
        this.A00 = C53v.A0S(parcel);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0087, code lost:
    
        if (r304.equals(r306) == false) goto L6;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0011. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A00(android.content.Context r301, java.lang.String r302, java.lang.String r303) {
        /*
            r0 = r302
            if (r0 == 0) goto L3c
            r0 = r302
            java.lang.String r0 = X.1BK.A13(r0)
            r304 = r0
            r0 = r304
            int r0 = r0.hashCode()
            r305 = r0
            r0 = r305
            switch(r0) {
                case -1798866744: goto L58;
                case 612276834: goto L6b;
                case 1505216578: goto L72;
                case 1832981686: goto L79;
                default: goto L3c;
            }
        L3c:
            r0 = r301
            if (r0 == 0) goto L53
            java.lang.String r0 = "UpdateType: "
            r1 = r302
            java.lang.String r0 = X.0Pz.A0W(r0, r1)
            r304 = r0
            java.lang.String r0 = "UpdateType is unknown"
            r306 = r0
            r0 = r301
            r1 = r306
            r2 = r303
            r3 = r304
            A01(r0, r1, r2, r3)
        L53:
            java.lang.String r0 = "unknown"
            r304 = r0
        L56:
            r0 = r304
            return r0
        L58:
            java.lang.String r0 = "participants_joined"
            r306 = r0
            r0 = r304
            r1 = r306
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L3c
            r0 = r304
            return r0
        L6b:
            java.lang.String r0 = "group_ongoing_call"
            r306 = r0
            goto L7d
        L72:
            java.lang.String r0 = "missed_group_call"
            r306 = r0
            goto L7d
        L79:
            java.lang.String r0 = "incoming_group_call_ringout"
            r306 = r0
        L7d:
            r0 = r304
            r1 = r306
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L56
            goto L3c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification.A00(android.content.Context, java.lang.String, java.lang.String):java.lang.String");
    }

    public static final void A01(Context context, String str, String str2, String str3) {
        C82 A00 = ((C4n) 1Bn.A0E(context, (1BY) null, 82173)).A00("error");
        A00.A01("feature", "GroupCallUpdateNotification");
        A00.A01("handler", str2);
        A00.A01("errortype", str);
        if (str3 != null) {
            A00.A01("extra", str3);
        }
        A00.A00();
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification
    public HashMap A03() {
        HashMap A03 = super.A03();
        A03.put(4YT.A00(278), 0Pz.A0Y(super.A01.stringValue, AbJ.A1A(this.A05), '_'));
        return A03;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r303.length() != 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String A04(boolean r302) {
        /*
            r301 = this;
            r0 = r302
            if (r0 != 0) goto L16
            r0 = r301
            java.lang.String r0 = r0.A07
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L16
            r0 = r303
            int r0 = r0.length()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L2e
        L16:
            r0 = r301
            com.facebook.messaging.model.threadkey.ThreadKey r0 = r0.A01
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L30
            r0 = r305
            java.lang.Long r0 = X.4YU.A0l(r0)
            r305 = r0
            r0 = r305
            java.lang.String r0 = r0.toString()
            r303 = r0
        L2e:
            r0 = r303
            return r0
        L30:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.rtc.groupcall.notify.GroupCallUpdateNotification.A04(boolean):java.lang.String");
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        11T.A0F(parcel, 0);
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A04);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeInt(this.A06 ? 1 : 0);
        parcel.writeString(this.A07);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        parcel.writeInt(this.A00 ? 1 : 0);
    }
}
