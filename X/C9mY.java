package X;

import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.PrivacyContextCoding;

/* renamed from: X.9mY, reason: invalid class name */
/* loaded from: 9mY.class */
public final class C9mY {
    public final PrivacyContext A00;
    public final boolean A01;
    public final 1pQ A02;

    public C9mY() {
        1pQ A0h = 7zQ.A0h();
        this.A02 = A0h;
        this.A01 = 1pQ.A00(A0h).AZk(36324595713265479L);
        PrivacyContext newPrivacyContextNative = PrivacyContextCoding.newPrivacyContextNative(null, "FBLegacyBroker", "1065372051377103");
        11T.A0A(newPrivacyContextNative);
        this.A00 = newPrivacyContextNative;
    }

    public static final AnonymousClass539 A00(long j) {
        return j == 1 ? AnonymousClass539.A49 : j == 0 ? AnonymousClass539.A4C : j == ((long) 4) ? AnonymousClass539.A4D : j == ((long) 5) ? AnonymousClass539.A4B : AnonymousClass539.A48;
    }

    public static final void A01(C9mY c9mY, long j, long j2, long j3) {
        9kE.A01(c9mY.A00, Long.valueOf(j3), (String) null, j2, j);
    }

    public static final void A02(C9mY c9mY, MemoryViewModel memoryViewModel, Long l, long j, boolean z) {
        Integer num;
        ThreadKey threadKey;
        ThreadKey threadKey2;
        if (!z || c9mY.A01) {
            PrivacyContext privacyContext = c9mY.A00;
            Long l2 = null;
            String str = memoryViewModel != null ? memoryViewModel.A0G : null;
            if (z) {
                str = null;
            }
            String A0y = (memoryViewModel == null || (threadKey2 = memoryViewModel.A07) == null) ? null : 4YU.A0y(threadKey2);
            if (z) {
                A0y = null;
            }
            Long A0e = 0CW.A0e(String.valueOf((memoryViewModel == null || (threadKey = memoryViewModel.A07) == null) ? null : threadKey.A06));
            if (z) {
                A0e = null;
            }
            long j2 = memoryViewModel != null ? memoryViewModel.A04 : 6;
            String str2 = memoryViewModel != null ? memoryViewModel.A0M : null;
            if (z) {
                str2 = null;
            }
            Long valueOf = memoryViewModel != null ? Long.valueOf(memoryViewModel.A05) : null;
            if (z) {
                valueOf = null;
            }
            String valueOf2 = String.valueOf(memoryViewModel != null ? memoryViewModel.A0C : null);
            if (z) {
                valueOf2 = null;
            }
            if (memoryViewModel != null && (num = memoryViewModel.A08) != null) {
                l2 = 7zP.A0g(num);
            }
            if (z) {
                l2 = null;
            }
            9kE.A00(privacyContext, A0e, (Long) null, valueOf, l2, l, 4YV.A0j(), str, A0y, str2, valueOf2, j2, j);
        }
    }

    public static final void A03(C9mY c9mY, Long l, Long l2, long j) {
        9kE.A00(c9mY.A00, (Long) null, (Long) null, l, (Long) null, l2, 4YV.A0j(), (String) null, (String) null, (String) null, (String) null, 10, j);
    }

    public final void A04(String str, boolean z) {
        String str2 = str;
        long j = 3;
        11T.A0F(str, 0);
        long j2 = 25;
        if (!z || this.A01) {
            PrivacyContext privacyContext = this.A00;
            if (z) {
                str2 = null;
            }
            9kE.A01(privacyContext, (Long) null, str2, j, j2);
        }
    }
}
