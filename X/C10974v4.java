package X;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.Map;

/* renamed from: X.4v4, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4v4.class */
public final class C10974v4 implements C4v5 {
    public Context A00;
    public final C00i A01;
    public final C00i A02;
    public final C00i A03 = new 1BQ(17011);
    public final C00i A04;
    public final C00i A05;
    public final C00i A06;

    public C10974v4() {
        Context context = (Context) 1Bn.A0A(83719);
        this.A00 = context;
        this.A05 = new 1HH(context, 100188);
        this.A01 = new 1BQ(32907);
        this.A02 = new 1BQ(66936);
        this.A04 = new 1BQ(49797);
        this.A06 = new 1BQ(83228);
    }

    private NotificationChannel A00(ThreadKey threadKey) {
        NotificationChannelGroup A0C;
        if (threadKey == null || (A0C = ((2Pj) this.A03.get()).A0C("messenger_orca_05_group_conversations")) == null) {
            return null;
        }
        for (NotificationChannel notificationChannel : A0C.getChannels()) {
            this.A01.get();
            java.util.Map map = AnonymousClass463.A0G;
            if (notificationChannel.getId() != null && notificationChannel.getId().startsWith(threadKey.A0u())) {
                return notificationChannel;
            }
        }
        return null;
    }

    private void A01() {
        if (((2Pj) this.A03.get()).A0C("messenger_orca_05_group_conversations") == null) {
            ((NotificationManager) this.A05.get()).createNotificationChannelGroup(new NotificationChannelGroup("messenger_orca_05_group_conversations", 1BK.A04(((AnonymousClass463) this.A01.get()).A06).getString(2131960821)));
        }
    }

    @Override // X.C4v5
    public void ABB() {
        C00i c00i = this.A03;
        NotificationChannelGroup A0C = ((2Pj) c00i.get()).A0C("messenger_orca_05_group_conversations");
        if (A0C != null) {
            for (NotificationChannel notificationChannel : A0C.getChannels()) {
                if (!TextUtils.isEmpty(notificationChannel.getId())) {
                    ((5IG) this.A02.get()).A02(notificationChannel.getId(), String.valueOf(notificationChannel.getName()));
                    ((2Pj) c00i.get()).A0G(notificationChannel, "deleteCustomThreadChannels");
                }
            }
        }
        ((5IG) this.A02.get()).A00 = null;
    }

    @Override // X.C4v5
    public NotificationChannel ASU(ThreadSummary threadSummary) {
        NotificationChannel A00;
        if (threadSummary == null) {
            A00 = null;
        } else {
            A00 = A00(threadSummary.A0n);
            String A09 = ((5bF) this.A04.get()).A09(threadSummary);
            if (A00 != null && !TextUtils.isEmpty(A00.getId()) && !2Go.A00(A09, A00.getName())) {
                A00.setName(A09);
                ((NotificationManager) this.A05.get()).createNotificationChannel(A00);
                ((5IG) this.A02.get()).A02(A00.getId(), A09);
                return A00;
            }
        }
        return A00;
    }

    @Override // X.C4v5
    public NotificationChannel ASu(ThreadSummary threadSummary) {
        ThreadKey threadKey = threadSummary.A0n;
        NotificationChannel A00 = A00(threadKey);
        if (A00 != null) {
            return A00;
        }
        Uri A002 = ((C5qI) this.A06.get()).A00(threadKey);
        if (A002 == null) {
            return null;
        }
        String A09 = ((5bF) this.A04.get()).A09(threadSummary);
        if (threadKey == null) {
            return null;
        }
        A01();
        NotificationChannel A05 = ((AnonymousClass463) this.A01.get()).A05(A09, threadKey.A0u());
        if (A05 == null) {
            return null;
        }
        A05.setSound(A002, Notification.AUDIO_ATTRIBUTES_DEFAULT);
        NotificationChannel A08 = ((2Pj) this.A03.get()).A08(A05);
        if (A08.getId() != null) {
            ((5IG) this.A02.get()).A02(A08.getId(), A09);
            return A08;
        }
        0fH.A18("ThreadChannelManager", "not able to add channel map in FbSharedPreferences for %s", new Object[]{threadKey.A0u()});
        return A08;
    }

    @Override // X.C4v5
    public void CiJ() {
        NotificationChannel notificationChannel;
        String str;
        java.util.Map A00 = 5IG.A00((5IG) this.A02.get());
        if (A00 != null) {
            java.util.Map A0D = 04R.A0D(A00);
            if (A0D.isEmpty()) {
                return;
            }
            A01();
            for (Map.Entry entry : A0D.entrySet()) {
                String str2 = (String) entry.getKey();
                C00i c00i = this.A03;
                try {
                    notificationChannel = ((NotificationManager) ((2Pj) c00i.get()).A0A.get()).getNotificationChannel(str2);
                } catch (NullPointerException e) {
                    0fH.A0r(1BJ.A00(805), "Unexpected NullPointerException from NotificationManager.getNotificationChannel(String)", e);
                    notificationChannel = null;
                }
                if (notificationChannel != null) {
                    str = "Thread channel %s has been already restored";
                } else {
                    NotificationChannel A05 = ((AnonymousClass463) this.A01.get()).A05(1BK.A16(entry), str2);
                    if (A05 == null) {
                        0fH.A14("ThreadChannelManager", "Couldn't restore conversation channel %s.", new Object[]{str2});
                    } else {
                        ((2Pj) c00i.get()).A0F(A05);
                        str = "Thread channel %s was successfully restored";
                    }
                }
                0fH.A0g(str2, "ThreadChannelManager", str);
            }
        }
    }

    @Override // X.C4v5
    public boolean CyP() {
        return true;
    }
}
