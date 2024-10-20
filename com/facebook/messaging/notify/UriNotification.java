package com.facebook.messaging.notify;

import X.1BK;
import X.1BL;
import X.4iI;
import X.AbI;
import X.C0A2;
import X.C53v;
import X.C5ap;
import X.CST;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.messaging.push.flags.ServerMessageAlertFlags;
import com.facebook.user.model.UserFbidIdentifier;
import java.util.List;

/* loaded from: UriNotification.class */
public final class UriNotification extends MessagingNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(88);
    public boolean A00;
    public final ServerMessageAlertFlags A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;

    public UriNotification(Parcel parcel) {
        super(parcel);
        this.A06 = parcel.readString();
        this.A02 = parcel.readString();
        this.A05 = parcel.readString();
        this.A07 = parcel.readString();
        this.A03 = parcel.readString();
        this.A04 = parcel.readString();
        this.A00 = C53v.A0S(parcel);
        this.A01 = (ServerMessageAlertFlags) 1BL.A0C(parcel, ServerMessageAlertFlags.class);
    }

    public UriNotification(ServerMessageAlertFlags serverMessageAlertFlags, String str, String str2, String str3, String str4, String str5, String str6) {
        super(C5ap.A2i, null);
        this.A06 = str;
        this.A02 = str2;
        this.A05 = str3;
        this.A07 = str4;
        this.A03 = str5;
        this.A04 = str6;
        this.A01 = serverMessageAlertFlags;
    }

    public ThreadKey A04(4iI r302) {
        Uri uri = null;
        try {
            uri = C0A2.A03(this.A07);
        } catch (SecurityException unused) {
        }
        ThreadKey threadKey = null;
        if (uri != null) {
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments.size() == 1) {
                String str = (String) 1BK.A0r(pathSegments);
                String authority = uri.getAuthority();
                if (authority.equals("groupthreadfbid")) {
                    return AbI.A0Y(str);
                }
                if (authority.equals(PublicKeyCredentialControllerUtility.JSON_KEY_USER)) {
                    threadKey = r302.A03(new UserFbidIdentifier(str));
                }
            }
        }
        return threadKey;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A02);
        parcel.writeString(this.A05);
        parcel.writeString(this.A07);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeInt(this.A00 ? 1 : 0);
        parcel.writeParcelable(this.A01, i);
    }
}
