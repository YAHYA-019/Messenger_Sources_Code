package com.facebook.messaging.threadlist.threaditemmenu.plugins.core.deletemenuitem;

import X.06Z;
import X.11T;
import X.1BK;
import X.1BL;
import X.1BY;
import X.1Bn;
import X.1F9;
import X.2SI;
import X.2oI;
import X.4YU;
import X.6Q7;
import X.7EM;
import X.7zR;
import X.7zT;
import X.AbF;
import X.AbI;
import X.AbJ;
import X.BOn;
import X.C1742Arc;
import X.C1u3;
import X.C9T;
import X.CQE;
import X.CQo;
import X.Cn2;
import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.messaging.model.threads.ThreadSummary;

/* loaded from: DeleteMenuItemImplementation.class */
public final class DeleteMenuItemImplementation {
    public static final C9T A00(Context context) {
        11T.A0F(context, 0);
        int i = 2131966905;
        if (AbI.A1b(1BL.A0Q())) {
            i = 2131968161;
        }
        CQE cqe = new CQE();
        cqe.A00 = 33;
        cqe.A06(C1u3.A6a);
        CQE.A04(context, cqe, i);
        CQE.A03(context, cqe, 2131966906);
        return CQE.A01(cqe, "delete");
    }

    public static final void A01(Context context, 06Z r302, FbUserSession fbUserSession, CallerContext callerContext, ThreadSummary threadSummary, C1742Arc c1742Arc, 2SI r307) {
        11T.A0H(context, threadSummary);
        7zT.A11(2, r302, r307, fbUserSession, c1742Arc);
        1F9 r0 = threadSummary.A0g;
        if (r0 != null && r0 == 1F9.A0Q) {
            ((7EM) 1Bn.A0E(context, (1BY) null, 83021)).A01(context, r302, fbUserSession, threadSummary, "pending", 7zR.A0s());
            return;
        }
        if (callerContext == null) {
            callerContext = CallerContext.A0B("DeleteMenuItemImplementation");
        }
        c1742Arc.A00(context, r302, fbUserSession, CallerContext.A03(callerContext, "DeleteMenuItemImplementation")).A00(threadSummary, new Cn2(threadSummary, 4), r307);
        ((6Q7) 1Bn.A0E(context, (1BY) null, 67958)).A08(fbUserSession, AbF.A0f(threadSummary), "entrypoint_thread_list");
    }

    public static final void A02(ThreadSummary threadSummary, boolean z) {
        if (2oI.A07(threadSummary)) {
            AbJ.A0W().A0L(4YU.A0l(threadSummary.A0n), z);
        } else if (2oI.A06(threadSummary)) {
            CQo.A0H(BOn.A0F, 7zR.A0a(), Long.valueOf(threadSummary.A0n.A0r()), 1BK.A1D("is_success", z ? "Y" : "N"), 41, 16, 2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0071, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0074, code lost:
    
        r0 = r302;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x007c, code lost:
    
        if (r0 != X.2SI.A09) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0089, code lost:
    
        if (X.1F9.A0Q.A01() == null) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00a3, code lost:
    
        if (r0.A04 != r0.intValue()) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x00a6, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a8, code lost:
    
        r0 = X.1F9.A0K.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b2, code lost:
    
        if (r0 == null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00b5, code lost:
    
        r0 = (r0.A04 > r0.intValue() ? 1 : (r0.A04 == r0.intValue() ? 0 : -1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00cc, code lost:
    
        if (r0 != null) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00cf, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00d9, code lost:
    
        if (X.AbL.A1L(r301) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00dc, code lost:
    
        r0 = r301.A0l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        if (r0 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
    
        if (r0.A04 != (-18)) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0139, code lost:
    
        if (X.4YU.A1Y(r303, 74) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x013c, code lost:
    
        r0 = (X.2rT) X.1Bi.A03(66266);
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0150, code lost:
    
        if (r0.A02(r0) == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x015b, code lost:
    
        if (r0.A1N() == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x015e, code lost:
    
        r315 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x010d, code lost:
    
        if (r0.A1A() == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0112, code lost:
    
        if (r315 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0115, code lost:
    
        r0 = r301.AxS();
        X.11T.A0A(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        if (X.3GV.A00(r0) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x012e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x004b, code lost:
    
        if (X.11T.A0O(r0, com.facebook.messaging.model.threadkey.ThreadKey.A07(-14)) != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0164, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x016e, code lost:
    
        if (X.2oI.A03(r301) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0177, code lost:
    
        return X.4YU.A1Y(r303, 74);
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x017a, code lost:
    
        return r315;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ff, code lost:
    
        r315 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0063, code lost:
    
        if (r0.A1A() != false) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0056, code lost:
    
        if (r302 != X.2SI.A09) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0059, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0069, code lost:
    
        r0 = r0.A1E() ? 1 : 0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v78, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean A03(com.facebook.messaging.model.threads.ThreadSummary r301, X.2SI r302, com.facebook.xapp.messaging.capability.vector.Capabilities r303) {
        /*
            Method dump skipped, instructions count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.threadlist.threaditemmenu.plugins.core.deletemenuitem.DeleteMenuItemImplementation.A03(com.facebook.messaging.model.threads.ThreadSummary, X.2SI, com.facebook.xapp.messaging.capability.vector.Capabilities):boolean");
    }
}
