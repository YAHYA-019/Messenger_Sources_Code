package X;

import com.facebook.assistant.stella.ipc.common.model.StellaContact;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import java.util.HashMap;

/* renamed from: X.AjL, reason: case insensitive filesystem */
/* loaded from: AjL.class */
public final class C1498AjL extends StellaContact {
    public final /* synthetic */ ThreadSummary A00;
    public final /* synthetic */ B9t A01;
    public final /* synthetic */ CEK A02;

    public C1498AjL(ThreadSummary threadSummary, B9t b9t, CEK cek) {
        String A16;
        Class cls;
        String str;
        String str2;
        this.A01 = b9t;
        this.A00 = threadSummary;
        this.A02 = cek;
        this.isGroup = true;
        String str3 = threadSummary.A20;
        this.fullName = str3 == null ? "" : str3;
        ThreadKey threadKey = threadSummary.A0n;
        boolean A0z = threadKey.A0z();
        this.isE2ee = A0z;
        long A0r = A0z ? threadKey.A01 : threadKey.A0r();
        this.threadId = String.valueOf(A0r);
        if (A0z) {
            HashMap hashMap = cek.A00;
            Long valueOf = Long.valueOf(A0r);
            if (hashMap.containsKey(valueOf)) {
                A16 = 4YU.A16(valueOf, hashMap);
                CallerContext callerContext = B9t.A07;
                cls = B9t.class;
                str = this.fullName;
                str2 = "Replacing e2ee group name %s with %s";
                0fH.A0V(str, cls, str2, A16);
                this.fullName = A16;
                this.groupChatParticipant = AnonymousClass001.A0s();
                this.userRank = threadSummary.A00;
                this.relationship = null;
                this.nickName = null;
            }
        }
        if (!this.isE2ee) {
            HashMap hashMap2 = cek.A01;
            Long valueOf2 = Long.valueOf(A0r);
            if (hashMap2.containsKey(valueOf2)) {
                A16 = 4YU.A16(valueOf2, hashMap2);
                CallerContext callerContext2 = B9t.A07;
                cls = B9t.class;
                str = this.fullName;
                str2 = "Replacing %s with %s";
                0fH.A0V(str, cls, str2, A16);
                this.fullName = A16;
                this.groupChatParticipant = AnonymousClass001.A0s();
                this.userRank = threadSummary.A00;
                this.relationship = null;
                this.nickName = null;
            }
        }
        CallerContext callerContext3 = B9t.A07;
        0fH.A0T(B9t.class, "Raw group name lookup failed for thread id %s. Will keep %s as name %d %d", new Object[]{this.threadId, this.fullName, Integer.valueOf(cek.A00.size()), Integer.valueOf(cek.A01.size())});
        this.groupChatParticipant = AnonymousClass001.A0s();
        this.userRank = threadSummary.A00;
        this.relationship = null;
        this.nickName = null;
    }
}
