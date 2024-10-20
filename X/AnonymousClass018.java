package X;

import com.facebook.fury.context.ReqContext;
import com.facebook.fury.context.ReqContextExtensions;
import com.facebook.fury.context.ReqContextLifecycleCallbacks;
import com.facebook.fury.context.ReqContextLog;
import com.facebook.fury.context.ReqContextsCallbacks;
import com.facebook.fury.context.ReqContextsPlugin;
import com.facebook.fury.context.ThreadIdProvider;
import com.facebook.fury.props.ReqPropsProvider;
import com.facebook.privacy.acs.falco.FalcoACSProvider;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.018, reason: invalid class name */
/* loaded from: 018.class */
public final class AnonymousClass018 implements ReqContextsCallbacks {
    public static final ReqContextsCallbacks A00;
    public static final AtomicReference A01;
    public static final ThreadIdProvider A02;
    public static volatile ReqContextExtensions A03;
    public static volatile ReqContextLifecycleCallbacks A04;
    public static volatile ReqContextLog A05;
    public static volatile ThreadIdProvider A06;
    public static volatile ReqPropsProvider A07;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.facebook.fury.context.ReqContextsCallbacks] */
    static {
        ?? obj = new Object();
        A00 = obj;
        A01 = new AtomicReference(new 01A((ReqContextsCallbacks) obj));
        01C r0 = new 01C();
        A02 = r0;
        A06 = r0;
    }

    public static ReqContext A00() {
        return ((ReqContextsPlugin) A01.get()).getActive();
    }

    public static ReqContext A01(ReqContext reqContext, String str, int i) {
        ReqPropsProvider reqPropsProvider;
        ReqContext reqContext2 = reqContext;
        A06(reqContext, "ReqContext");
        A06(str, FalcoACSProvider.TAG);
        ReqContextsPlugin reqContextsPlugin = (ReqContextsPlugin) A01.get();
        if (reqContext instanceof C01b) {
            reqContext2 = ((C01b) reqContext).A00;
        }
        if (!reqContextsPlugin.accepts(reqContext2)) {
            return A04(reqContext2.getTag(), i);
        }
        C0jw A002 = C0jy.A00();
        if (A002 == C0jw.NONE) {
            return 01E.A00;
        }
        ReqContext A003 = A00();
        return (A003 == null || A002 == C0jw.FINE || !reqContext2.hasSameProps(A003) || !((reqPropsProvider = A07) == null || (reqPropsProvider.canEnhanceCurrentScope(A003, 1, i) ^ true))) ? reqContextsPlugin.continueReqContext(reqContext2, str, 1, i, A002) : new C01b(A003);
    }

    public static ReqContext A02(ReqContext reqContext, String str, int i) {
        ReqPropsProvider reqPropsProvider;
        ReqContext reqContext2 = reqContext;
        A06(reqContext, "ReqContext");
        A06(str, FalcoACSProvider.TAG);
        ReqContextsPlugin reqContextsPlugin = (ReqContextsPlugin) A01.get();
        if (reqContext instanceof C01b) {
            reqContext2 = ((C01b) reqContext).A00;
        }
        if (!reqContextsPlugin.accepts(reqContext2)) {
            ReqContextLog reqContextLog = A05;
            if (reqContextLog != null) {
                reqContextLog.d("ReqContexts", "continueFromIndirect() replaced by create()");
            }
            return A04(reqContext2.getTag(), i);
        }
        C0jw A002 = C0jy.A00();
        if (A002 == C0jw.NONE) {
            return 01E.A00;
        }
        ReqContext A003 = A00();
        return (A003 == null || A002 == C0jw.FINE || !reqContext2.hasSameProps(A003) || !((reqPropsProvider = A07) == null || (reqPropsProvider.canEnhanceCurrentScope(A003, 1, i) ^ true))) ? reqContextsPlugin.continueReqContext(reqContext2, str, 0, i, A002) : new C01b(A003);
    }

    public static ReqContext A03(String str, int i) {
        A06(str, FalcoACSProvider.TAG);
        ReqContext A042 = A04(str, i);
        A042.close();
        return A042;
    }

    public static ReqContext A04(String str, int i) {
        ReqPropsProvider reqPropsProvider;
        A06(str, FalcoACSProvider.TAG);
        C0jw A002 = C0jy.A00();
        if (A002 == C0jw.NONE) {
            return 01E.A00;
        }
        ReqContext A003 = A00();
        return (A003 == null || C0jy.A00() == C0jw.FINE || !((reqPropsProvider = A07) == null || (reqPropsProvider.canEnhanceCurrentScope(A003, 3, i) ^ true))) ? ((ReqContextsPlugin) A01.get()).create(str, i, A002) : new C01b(A003);
    }

    public static void A05(ReqContext reqContext, Throwable th) {
        A06(reqContext, "ReqContext");
        ReqContextsPlugin reqContextsPlugin = (ReqContextsPlugin) A01.get();
        if (reqContext instanceof C01b) {
            reqContext = ((C01b) reqContext).A00;
        }
        if (reqContextsPlugin.accepts(reqContext)) {
            reqContextsPlugin.fail(reqContext, th);
            return;
        }
        ReqContextLog reqContextLog = A05;
        if (reqContextLog != null) {
            reqContextLog.w("ReqContexts", "fail() skipped");
        }
    }

    public static void A06(Object obj, String str) {
        if (obj == null) {
            throw AnonymousClass001.A0L(String.format("%s cannot be null.", str));
        }
    }

    @Override // com.facebook.fury.context.ReqContextsCallbacks
    public long getCurrentThreadId() {
        return A06.getCurrentThreadId();
    }

    @Override // com.facebook.fury.context.ReqContextsCallbacks
    public int getTrackingPolicy() {
        return C0jy.A00().mValue;
    }

    @Override // com.facebook.fury.context.ReqContextsCallbacks
    public ReqContextLifecycleCallbacks provideLifecycleCallbacks() {
        return A04;
    }

    @Override // com.facebook.fury.context.ReqContextsCallbacks
    public ReqContextExtensions provideReqContextExtensions() {
        return A03;
    }

    @Override // com.facebook.fury.context.ReqContextsCallbacks
    public ReqPropsProvider provideReqPropsProvider() {
        return A07;
    }
}
