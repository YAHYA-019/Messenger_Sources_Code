package com.facebook.messaging.notify;

import X.1BK;
import X.1BL;
import X.1BQ;
import X.4YV;
import X.C00i;
import X.CST;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.messaging.push.flags.ServerMessageAlertFlags;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.push.constants.PushProperty;
import com.google.common.base.MoreObjects;

/* loaded from: TalkMessagingNotification.class */
public final class TalkMessagingNotification extends SimpleMessageNotification {
    public static final Parcelable.Creator CREATOR = CST.A00(87);
    public final Uri A00;
    public final ServerMessageAlertFlags A01;
    public final C00i A02;

    public TalkMessagingNotification(Parcel parcel) {
        super(parcel);
        ServerMessageAlertFlags serverMessageAlertFlags;
        this.A02 = 1BQ.A01();
        this.A00 = (Uri) 1BL.A0C(parcel, Uri.class);
        try {
            serverMessageAlertFlags = (ServerMessageAlertFlags) 1BL.A0C(parcel, ServerMessageAlertFlags.class);
        } catch (BadParcelableException e) {
            1BK.A09(this.A02).softReport("TalkServerMessageAlertFlags", e);
            serverMessageAlertFlags = null;
        }
        this.A01 = serverMessageAlertFlags;
    }

    public String toString() {
        MoreObjects.ToStringHelper stringHelper = MoreObjects.toStringHelper(this);
        stringHelper.add("messageText", ((SimpleMessageNotification) this).A00);
        PushProperty pushProperty = super.A02;
        stringHelper.add("pushProperty", pushProperty == null ? null : pushProperty.A00());
        stringHelper.add(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, super.A01);
        stringHelper.add(TraceFieldType.Uri, this.A00);
        return 4YV.A0s(stringHelper, this.A01, "serverMessageAlertFlags");
    }

    @Override // com.facebook.messaging.notify.SimpleMessageNotification, com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A00, 0);
        ServerMessageAlertFlags serverMessageAlertFlags = this.A01;
        if (serverMessageAlertFlags != null) {
            parcel.writeParcelable(serverMessageAlertFlags, 0);
        }
    }
}
