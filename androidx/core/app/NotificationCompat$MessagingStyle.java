package androidx.core.app;

import X.4vI;
import X.5Ud;
import X.AnonymousClass001;
import X.C5rv;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.List;

/* loaded from: NotificationCompat$MessagingStyle.class */
public final class NotificationCompat$MessagingStyle extends 4vI {
    public 5Ud A00;
    public Boolean A01;
    public CharSequence A02;
    public final List A03;
    public final List A04;

    public NotificationCompat$MessagingStyle() {
        this.A04 = AnonymousClass001.A0s();
        this.A03 = AnonymousClass001.A0s();
    }

    public NotificationCompat$MessagingStyle(5Ud r302) {
        this.A04 = new ArrayList();
        this.A03 = new ArrayList();
        if (TextUtils.isEmpty(r302.A01)) {
            throw AnonymousClass001.A0L("User's name must not be empty.");
        }
        this.A00 = r302;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0055. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A03(android.os.Bundle r302) {
        /*
            Method dump skipped, instructions count: 565
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.NotificationCompat$MessagingStyle.A03(android.os.Bundle):void");
    }

    public void A04(Bundle bundle) {
        super.A04(bundle);
        bundle.remove("android.messagingStyleUser");
        bundle.remove("android.selfDisplayName");
        bundle.remove("android.conversationTitle");
        bundle.remove("android.hiddenConversationTitle");
        bundle.remove("android.messages");
        bundle.remove("android.messages.historic");
        bundle.remove("android.isGroupConversation");
    }

    public void A05(Bundle bundle) {
        super.A05(bundle);
        List list = this.A04;
        list.clear();
        this.A00 = bundle.containsKey("android.messagingStyleUser") ? 5Ud.A00(bundle.getBundle("android.messagingStyleUser")) : new 5Ud((IconCompat) null, bundle.getString("android.selfDisplayName"), (String) null, (String) null, false, false);
        CharSequence charSequence = bundle.getCharSequence("android.conversationTitle");
        this.A02 = charSequence;
        if (charSequence == null) {
            this.A02 = bundle.getCharSequence("android.hiddenConversationTitle");
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("android.messages");
        if (parcelableArray != null) {
            list.addAll(C5rv.A00(parcelableArray));
        }
        Parcelable[] parcelableArray2 = bundle.getParcelableArray("android.messages.historic");
        if (parcelableArray2 != null) {
            this.A03.addAll(C5rv.A00(parcelableArray2));
        }
        if (bundle.containsKey("android.isGroupConversation")) {
            this.A01 = Boolean.valueOf(bundle.getBoolean("android.isGroupConversation"));
        }
    }

    public void A08(C5rv c5rv) {
        if (c5rv != null) {
            List list = this.A04;
            list.add(c5rv);
            if (list.size() > 25) {
                list.remove(0);
            }
        }
    }
}
