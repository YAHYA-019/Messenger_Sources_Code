package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;

/* renamed from: X.49A, reason: invalid class name */
/* loaded from: 49A.class */
public final class C49A implements C49B, CallerContextable {
    public static final String __redex_internal_original_name = "ThreadListMenuController";
    public 3Jl A00;
    public C8t A01;
    public final Context A02;
    public final 06Z A03;
    public final FbUserSession A04;
    public final CallerContext A05;
    public final String A0A;
    public final C00i A06 = new 1BQ(17012);
    public final C00i A07 = new 1BQ(16766);
    public final C00i A09 = new 1BV(67632);
    public final C00i A08 = new 1BV(67674);

    public C49A(Context context, 06Z r303, FbUserSession fbUserSession, CallerContext callerContext, String str) {
        this.A0A = str;
        this.A02 = context;
        this.A03 = r303;
        this.A05 = callerContext;
        this.A04 = fbUserSession;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0290, code lost:
    
        if (r311 == null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A00(com.facebook.messaging.inbox.units.InboxTrackableItem r301, com.facebook.messaging.model.threads.ThreadSummary r302, X.2SI r303, X.C49A r304) {
        /*
            Method dump skipped, instructions count: 750
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49A.A00(com.facebook.messaging.inbox.units.InboxTrackableItem, com.facebook.messaging.model.threads.ThreadSummary, X.2SI, X.49A):void");
    }

    public void A01(C2gi c2gi) {
        A00(c2gi.Auq(), c2gi.A01, c2gi.A02, this);
    }

    @Override // X.C49B
    public void dismiss() {
        C8t c8t = this.A01;
        if (c8t != null) {
            c8t.A00();
            this.A01 = null;
        }
        3Jl r0 = this.A00;
        if (r0 != null) {
            r0.A00.A00.ANc();
        }
    }
}
