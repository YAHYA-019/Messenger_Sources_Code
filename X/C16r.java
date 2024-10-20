package X;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Queue;

/* renamed from: X.16r, reason: invalid class name */
/* loaded from: 16r.class */
public final class C16r {
    public boolean A00;
    public Notification.Builder A02;
    public Queue A04;
    public final Context A05;
    public final int A06;
    public final NotificationManager A07;
    public final String A08;
    public final String A09;
    public String A03 = "";
    public int A01 = 0;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x011e, code lost:
    
        if (r0 != false) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C16r(android.content.Context r302, X.AnonymousClass094 r303, java.lang.String r304, boolean r305) {
        /*
            Method dump skipped, instructions count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16r.<init>(android.content.Context, X.094, java.lang.String, boolean):void");
    }

    private Notification.InboxStyle A00() {
        Notification.InboxStyle summaryText = new Notification.InboxStyle().setBigContentTitle(0Pz.A0j("[", this.A08, "]")).setSummaryText(this.A09);
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            summaryText.addLine((CharSequence) it.next());
        }
        return summaryText;
    }

    public void A01(String str) {
        int i;
        int i2;
        if (!this.A00) {
            try {
                this.A07.cancel("MqttDiagnosticNotification", this.A06);
                return;
            } catch (RuntimeException unused) {
                return;
            }
        }
        synchronized (this) {
            this.A01 = 0;
            this.A03 = str;
            if ("CONNECTED".equals(str)) {
                i = 17301611;
                i2 = -16711936;
            } else {
                i = 17301608;
                i2 = -65536;
                if ("CONNECTING".equals(str)) {
                    i = 17301607;
                    i2 = -256;
                }
            }
            Bundle bundle = new Bundle();
            bundle.putBoolean("vrshell_aui_persist", false);
            Context context = this.A05;
            Notification.Builder smallIcon = new Notification.Builder(context).setChannelId("debug_channel").setSmallIcon(i);
            05X r0 = new 05X();
            ((05Y) r0).A0D = true;
            Notification.Builder extras = smallIcon.setContentIntent(r0.A01(context, 0, 0)).setContentTitle(0Pz.A0j("[", this.A08, "]")).setContentText(str).setExtras(bundle);
            this.A02 = extras;
            extras.setColor(i2);
            this.A02.setStyle(A00());
            this.A07.notify("MqttDiagnosticNotification", this.A06, this.A02.getNotification());
            0fH.A0g(str, "MqttDiagnosticNotification", "notify %s");
        }
    }

    public void A02(String str) {
        if (!this.A00) {
            try {
                this.A07.cancel("MqttDiagnosticNotification", this.A06);
                return;
            } catch (RuntimeException unused) {
                return;
            }
        }
        if (this.A02 != null) {
            synchronized (this) {
                Notification.Builder builder = this.A02;
                int i = this.A01 + 1;
                this.A01 = i;
                builder.setSubText(String.valueOf(i));
                String A0j = 0Pz.A0j(new SimpleDateFormat("h:mm:ss a").format(new Date()), " ", str);
                Queue queue = this.A04;
                queue.add(A0j);
                if (queue.size() > 8) {
                    queue.poll();
                }
                this.A02.setContentText(this.A03);
                this.A02.setStyle(A00());
                this.A07.notify("MqttDiagnosticNotification", this.A06, this.A02.getNotification());
                0fH.A0g(A0j, "MqttDiagnosticNotification", "notify %s");
            }
        }
    }
}
