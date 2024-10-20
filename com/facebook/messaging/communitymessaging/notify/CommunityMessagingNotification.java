package com.facebook.messaging.communitymessaging.notify;

import X.C5ap;
import android.os.Parcelable;
import com.facebook.messaging.communitymessaging.notify.survey.CommunityMessagingNotificationSurveyData;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.notify.type.MessagingNotification;
import com.facebook.push.constants.PushProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: CommunityMessagingNotification.class */
public abstract class CommunityMessagingNotification extends MessagingNotification implements Parcelable {
    public CommunityMessagingNotificationSurveyData A00;
    public Map A01;
    public final String A02;
    public final String A03;
    public final ThreadKey A04;
    public final PushProperty A05;
    public final Integer A06;
    public final boolean A07;

    public CommunityMessagingNotification(ThreadKey threadKey, C5ap c5ap, PushProperty pushProperty, Integer num, String str, String str2, boolean z) {
        super(c5ap, pushProperty);
        this.A04 = threadKey;
        this.A05 = pushProperty;
        this.A02 = str;
        this.A06 = num;
        this.A03 = str2;
        this.A07 = z;
    }

    @Override // com.facebook.messaging.notify.type.MessagingNotification
    public HashMap A03() {
        HashMap A03 = super.A03();
        Map map = this.A01;
        if (map != null) {
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry entry : map.entrySet()) {
                arrayList.add(A03.put(entry.getKey(), entry.getValue()));
            }
        }
        return A03;
    }

    public ThreadKey A04() {
        return this instanceof MessengerCommunityChatNotification ? ((MessengerCommunityChatNotification) this).A03 : this.A04;
    }

    public Integer A05() {
        return this.A06;
    }

    public String A06() {
        return ((MessengerCommunityChatNotification) this).A04;
    }

    public String A07() {
        return ((MessengerCommunityChatNotification) this).A05;
    }

    public String A08() {
        return ((MessengerCommunityChatNotification) this).A06;
    }

    public String A09() {
        return ((MessengerCommunityChatNotification) this).A07;
    }

    public String A0A() {
        return ((MessengerCommunityChatNotification) this).A08;
    }

    public String A0B() {
        return ((MessengerCommunityChatNotification) this).A0A;
    }

    public String A0C() {
        return ((MessengerCommunityChatNotification) this).A0D;
    }

    public String A0D() {
        return ((MessengerCommunityChatNotification) this).A0F;
    }

    public String A0E() {
        return ((MessengerCommunityChatNotification) this).A0G;
    }

    public String A0F() {
        return ((MessengerCommunityChatNotification) this).A0H;
    }

    public boolean A0G() {
        return this instanceof MessengerCommunityChatNotification ? ((MessengerCommunityChatNotification) this).A0I : this.A07;
    }

    public boolean A0H() {
        return ((MessengerCommunityChatNotification) this).A0M;
    }

    public boolean A0I() {
        return ((MessengerCommunityChatNotification) this).A0K;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }
}
