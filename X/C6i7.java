package X;

import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.google.common.collect.ImmutableSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: X.6i7, reason: invalid class name */
/* loaded from: 6i7.class */
public final class C6i7 extends 2Y2 {
    public long A00;
    public 1BY A01;
    public ThreadSummary A02;
    public String A03;
    public Set A04;
    public boolean A05;
    public final C00i A06;

    public C6i7(RecyclerView recyclerView, 1BO r303) {
        super(recyclerView, (ScheduledExecutorService) 1Bi.A03(16464));
        this.A06 = new 1BV((1BY) null, 68033);
        this.A00 = -1;
        this.A01 = new 1BY(r303);
    }

    public long A0d() {
        return this.A05 ? 3000L : 1000L;
    }

    public 2Y6 A0e() {
        this.A04 = new LinkedHashSet();
        return new 2Y6() { // from class: X.6i8
            public /* bridge */ /* synthetic */ void add(Object obj) {
                C6i7 c6i7 = C6i7.this;
                ImmutableSet immutableSet = 2Y2.A05;
                c6i7.A04.add(obj);
            }

            public void clear() {
                C6i7 c6i7 = C6i7.this;
                ImmutableSet immutableSet = 2Y2.A05;
                c6i7.A04.clear();
            }

            public boolean isEmpty() {
                C6i7 c6i7 = C6i7.this;
                ImmutableSet immutableSet = 2Y2.A05;
                return c6i7.A04.isEmpty();
            }
        };
    }

    public /* bridge */ /* synthetic */ String A0f() {
        FbUserSession A05 = 1Fw.A05(this.A01);
        StringBuilder A0k = AnonymousClass001.A0k();
        Set set = this.A04;
        Message[] messageArr = (Message[]) set.toArray(new Message[set.size()]);
        int length = messageArr.length;
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 >= length) {
                return A0k.toString();
            }
            Message message = messageArr[i2];
            7Y4 r0 = (7Y4) this.A06.get();
            ThreadSummary threadSummary = this.A02;
            C2cd.A07(r0.A01(A05, message, threadSummary == null ? null : threadSummary.BF2(), false), A0k, true);
            i = i2 + 1;
        }
    }

    public boolean A0h(int i) {
        if (2Y2.A05.contains(Integer.valueOf(i))) {
            return this.A05 || !this.A04.isEmpty();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001f, code lost:
    
        if (com.google.common.base.Objects.equal(r0.A1V, r301.A03) != false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ boolean A0i(java.lang.Object r302) {
        /*
            r301 = this;
            r0 = r302
            com.facebook.messaging.model.messages.Message r0 = (com.facebook.messaging.model.messages.Message) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L22
            r0 = r302
            java.lang.String r0 = r0.A1V
            r303 = r0
            r0 = r301
            java.lang.String r0 = r0.A03
            r304 = r0
            r0 = r303
            r1 = r304
            boolean r0 = com.google.common.base.Objects.equal(r0, r1)
            r305 = r0
            r0 = 1
            r306 = r0
            r0 = r305
            if (r0 == 0) goto L27
        L22:
            r0 = 0
            r306 = r0
            r0 = 0
            r304 = r0
        L27:
            r0 = r306
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C6i7.A0i(java.lang.Object):boolean");
    }

    public void A0j(Message message) {
        super.A0g(message);
        if (this.A04.contains(message)) {
            this.A03 = message.A1V;
        }
    }
}
