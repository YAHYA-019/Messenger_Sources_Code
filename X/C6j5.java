package X;

import com.facebook.messaging.model.threadkey.ThreadKey;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.6j5, reason: invalid class name */
/* loaded from: 6j5.class */
public final class C6j5 {
    public final 1Br A00 = 1Bq.A00(99390);
    public final AtomicInteger A01;
    public final AtomicInteger A02;
    public final AtomicLong A03;
    public final AtomicLong A04;
    public final AtomicLong A05;
    public final AtomicReference A06;
    public final AtomicReference A07;

    public C6j5() {
        C6j6 c6j6 = C6j6.A07;
        this.A07 = new AtomicReference(c6j6);
        this.A06 = new AtomicReference(c6j6);
        this.A05 = new AtomicLong(Long.MAX_VALUE);
        this.A04 = new AtomicLong(Long.MAX_VALUE);
        this.A01 = new AtomicInteger(0);
        this.A02 = new AtomicInteger(-1);
        this.A03 = new AtomicLong(0L);
    }

    public final void A00(1xC r302, ThreadKey threadKey, final C80b c80b, final C07764kq c07764kq, final boolean z) {
        AtomicReference atomicReference;
        AtomicLong atomicLong;
        String str;
        11T.A0F(r302, 3);
        0fH.A0g(z ? "newer" : "older", "MsysThreadViewLoadMoreMessagesController", "loadMoreMessage - %s");
        if (z) {
            atomicReference = this.A06;
            atomicLong = this.A04;
        } else {
            atomicReference = this.A07;
            atomicLong = this.A05;
        }
        long j = atomicLong.get();
        C6j6 c6j6 = (C6j6) atomicReference.get();
        if (c6j6 != null) {
            int ordinal = c6j6.ordinal();
            if (ordinal == 1) {
                0fH.A0l("MsysThreadViewLoadMoreMessagesController", "MessageLoadMoreState.HAS_MORE_LOCAL - start loading more from local");
                9Ch.A00(c80b, c07764kq, z);
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 4) {
                    str = "MessageLoadMoreState.IS_LOADING_MORE_REMOTE - ignoring load more request";
                } else if (ordinal == 3) {
                    str = "MessageLoadMoreState.IS_LOADING_MORE_LOCAL - ignoring load more request";
                } else if (ordinal == 5) {
                    str = "MessageLoadMoreState.FULLY_LOADED - ignoring load more request";
                }
                0fH.A0l("MsysThreadViewLoadMoreMessagesController", str);
                return;
            }
            0fH.A0l("MsysThreadViewLoadMoreMessagesController", "MessageLoadMoreState.HAS_MORE_REMOTE - start loading more from local and remote");
            C80b c80b2 = new C80b(c80b, c07764kq, z) { // from class: X.9wb
                public final C80b A00;
                public final /* synthetic */ C07764kq A01;
                public final /* synthetic */ boolean A02;

                {
                    this.A01 = c07764kq;
                    this.A02 = z;
                    this.A00 = c80b;
                }

                @Override // X.C80b
                public void CAB() {
                    this.A00.CAB();
                }

                @Override // X.C80b
                public void CAC(String str2) {
                    this.A00.CAC(str2);
                }

                @Override // X.C80b
                public void CAD() {
                    this.A00.CAD();
                    9Ch.A00((C80b) null, this.A01, this.A02);
                }
            };
            c80b2.CAB();
            Long valueOf = Long.valueOf(threadKey.A0s());
            Long valueOf2 = Long.valueOf(j);
            int i = -1;
            if (z) {
                i = 1;
            }
            r302.A04(new A1b(c80b2, 21), valueOf, valueOf2, Integer.valueOf(i));
            return;
        }
        0fH.A0k("MsysThreadViewLoadMoreMessagesController", "MessageLoadMoreState.UNKNOWN - ignoring load more request");
    }
}
