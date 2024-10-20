package com.facebook.messaging.notify.type;

import X.1BL;
import X.4rH;
import X.5QH;
import X.5QJ;
import X.82M;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.C1Y6;
import X.C1yg;
import X.C50c;
import X.C53v;
import X.C5ao;
import X.C5ap;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.dextricks.LogcatReader;
import com.facebook.messaging.accountswitch.model.MessengerAccountType;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.push.flags.ServerMessageAlertFlags;
import com.facebook.push.constants.PushProperty;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;

/* loaded from: NewMessageNotification.class */
public final class NewMessageNotification extends MessagingNotification {
    public FbUserSession A00;
    public MessengerAccountType A01;
    public ThreadSummary A02;
    public ProductExtras A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final int A0G;
    public final Message A0H;
    public final C50c A0I;
    public final C5ao A0J;
    public final ServerMessageAlertFlags A0K;
    public final String A0L;
    public final boolean A0M;
    public static final int[] A0O = {10072, LogcatReader.DEFAULT_WAIT_TIME};
    public static final 5QJ A0N = new 5QJ((5QH) C1Y6.A00(null, "com_facebook_messaging_notify_plugins_interfaces_notificationbuilder_NewMessageNotificationBuilderSpec", "All", new Object[0]));
    public static final Parcelable.Creator CREATOR = new 82M(75);

    public NewMessageNotification(Parcel parcel) {
        super(parcel);
        this.A0H = (Message) 1BL.A0C(parcel, Message.class);
        this.A0J = (C5ao) parcel.readSerializable();
        this.A0K = (ServerMessageAlertFlags) 1BL.A0C(parcel, ServerMessageAlertFlags.class);
        this.A0I = null;
        this.A0M = C53v.A0S(parcel);
        this.A0E = C53v.A0S(parcel);
        this.A0G = parcel.readInt();
        this.A0L = parcel.readString();
        this.A09 = parcel.readString();
        this.A08 = parcel.readString();
        this.A06 = parcel.readString();
        this.A07 = parcel.readString();
        this.A05 = parcel.readString();
    }

    public NewMessageNotification(FbUserSession fbUserSession, MessengerAccountType messengerAccountType, Message message, ThreadSummary threadSummary, C50c c50c, C5ao c5ao, ProductExtras productExtras, ServerMessageAlertFlags serverMessageAlertFlags, PushProperty pushProperty, Long l, String str, String str2, String str3, String str4, String str5, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        super(z2 ? C5ap.A13 : C5ap.A2R, pushProperty);
        this.A0H = message;
        this.A0J = c5ao;
        this.A0I = c50c;
        this.A0M = z;
        this.A0K = serverMessageAlertFlags;
        this.A0E = z2;
        ThreadKey threadKey = message.A0V;
        this.A0G = A0N.A00(threadKey);
        this.A0L = threadKey != null ? threadKey.A0u() : null;
        this.A09 = str;
        this.A00 = fbUserSession;
        this.A02 = threadSummary;
        this.A0F = z3;
        this.A0D = z4;
        this.A03 = productExtras;
        this.A08 = str2;
        this.A07 = str4;
        this.A05 = str5;
        this.A0A = z5;
        this.A01 = messengerAccountType;
        this.A06 = str3;
        this.A0B = z6;
        this.A04 = l;
    }

    public NewMessageNotification(FbUserSession fbUserSession, Message message, ThreadSummary threadSummary, C5ao c5ao, ServerMessageAlertFlags serverMessageAlertFlags, PushProperty pushProperty) {
        super(C5ap.A2R, pushProperty);
        this.A0H = message;
        this.A0J = c5ao;
        this.A0I = null;
        this.A0M = false;
        this.A0K = serverMessageAlertFlags;
        this.A0E = false;
        ThreadKey threadKey = message.A0V;
        this.A0G = A0N.A00(threadKey);
        this.A0L = threadKey != null ? threadKey.A0u() : null;
        this.A09 = null;
        this.A00 = fbUserSession;
        this.A02 = threadSummary;
        this.A0F = false;
        this.A0D = false;
    }

    public boolean A04() {
        4rH r0 = super.A02.A04;
        if (r0 != 4rH.A0D && r0 != 4rH.A0L) {
            return true;
        }
        ServerMessageAlertFlags serverMessageAlertFlags = this.A0K;
        return serverMessageAlertFlags != null && serverMessageAlertFlags.A03;
    }

    public boolean A05() {
        ThreadKey threadKey = this.A0H.A0V;
        boolean z = false;
        if (threadKey != null && threadKey.A06 == C1yg.ONE_TO_ONE && threadKey.A02 == 389917088531093L) {
            z = true;
        }
        return z;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NewMessageNotification newMessageNotification = (NewMessageNotification) obj;
        if (this.A0M == newMessageNotification.A0M && this.A0E == newMessageNotification.A0E && this.A0G == newMessageNotification.A0G && Objects.equal(this.A0L, newMessageNotification.A0L) && this.A0H.equals(newMessageNotification.A0H) && this.A0J == newMessageNotification.A0J && Objects.equal(this.A09, newMessageNotification.A09) && Objects.equal(this.A0I, newMessageNotification.A0I) && Objects.equal(this.A08, newMessageNotification.A08) && Objects.equal(this.A06, newMessageNotification.A06) && Objects.equal(this.A07, newMessageNotification.A07) && Objects.equal(this.A05, newMessageNotification.A05)) {
            return this.A0K.equals(newMessageNotification.A0K);
        }
        return false;
    }

    public int hashCode() {
        int i = 0;
        int A05 = (((((((((((((AnonymousClass002.A05(this.A0K, (((AnonymousClass002.A05(this.A0J, 1BL.A03(this.A0H)) + AnonymousClass002.A04(this.A0I)) * 31) + (this.A0M ? 1 : 0)) * 31) + (this.A0E ? 1 : 0)) * 31) + this.A0G) * 31) + 1BL.A06(this.A0L)) * 31) + 1BL.A06(this.A09)) * 31) + 1BL.A06(this.A08)) * 31) + 1BL.A06(this.A06)) * 31) + 1BL.A06(this.A07)) * 31;
        String str = this.A05;
        if (str != null) {
            i = str.hashCode();
        }
        return A05 + i;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        Preconditions.checkState(AnonymousClass001.A1U(this.A0I));
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A0H, i);
        parcel.writeSerializable(this.A0J);
        parcel.writeParcelable(this.A0K, i);
        parcel.writeInt(this.A0M ? 1 : 0);
        parcel.writeInt(this.A0E ? 1 : 0);
        parcel.writeInt(this.A0G);
        parcel.writeString(this.A0L);
        parcel.writeString(this.A09);
        parcel.writeString(this.A08);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A05);
    }
}
