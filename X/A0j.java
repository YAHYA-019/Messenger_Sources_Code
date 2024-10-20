package X;

import com.facebook.messaging.analytics.perf.MessagingPerformanceLogger;
import com.facebook.messaging.model.messages.Message;
import com.facebook.msys.mca.MailboxCallback;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* loaded from: A0j.class */
public final class A0j implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final boolean A06;

    public A0j(Message message, C5fm c5fm, C5ft c5ft, String str, String str2, int i, boolean z) {
        this.A00 = i;
        this.A01 = c5fm;
        this.A02 = message;
        this.A04 = str;
        this.A06 = z;
        this.A05 = str2;
        this.A03 = c5ft;
    }

    @Override // com.facebook.msys.mca.MailboxCallback
    public final void onCompletion(Object obj) {
        int i = this.A00;
        C5fm c5fm = (C5fm) this.A01;
        Message message = (Message) this.A02;
        if (i == 0) {
            String str = this.A04;
            boolean z = this.A06;
            String str2 = this.A05;
            C5fu c5fu = (C5fu) this.A03;
            List list = ((9Lk) obj).A00;
            MessagingPerformanceLogger messagingPerformanceLogger = (MessagingPerformanceLogger) c5fm.A0M.get();
            String str3 = message.A1W;
            messagingPerformanceLogger.A0l(str3, "send_api_end");
            C5fm.A0D(c5fm, "Something's wrong with sending image message", list != null ? (String) 1BK.A0r(list) : null);
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    C5fm.A0A(message.A0V, c5fm, c5fu, (String) it.next(), str, "image", str2, z);
                }
                if (str3 != null) {
                    Iterator it2 = ((5gV) c5fm.A0R.get()).A00.iterator();
                    while (it2.hasNext()) {
                        ((6QW) it2.next()).CWT(str3, list);
                    }
                    return;
                }
                return;
            }
            return;
        }
        String str4 = this.A04;
        boolean z2 = this.A06;
        String str5 = this.A05;
        C5fu c5fu2 = (C5fu) this.A03;
        9Pa r0 = (9Pa) obj;
        String str6 = r0.A00;
        C5fm.A08(message, c5fm, "send_api_end");
        C5fm.A0D(c5fm, r0.A01, str6);
        String str7 = message.A1W;
        if (str6 != null) {
            C5fm.A0A(message.A0V, c5fm, c5fu2, str6, str4, "image", str5, z2);
            if (str7 != null) {
                5gV r02 = (5gV) c5fm.A0R.get();
                List asList = Arrays.asList(str6);
                11T.A0F(asList, 1);
                Iterator it3 = r02.A00.iterator();
                while (it3.hasNext()) {
                    ((6QW) it3.next()).CWT(str7, asList);
                }
            }
        }
    }
}
