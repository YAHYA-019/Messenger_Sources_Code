package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadlist.plugins.core.threadsnippet.lastmessage.LastMessageSnippetImpl;
import com.facebook.messaging.wellbeing.selfremediation.plugins.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3We, reason: invalid class name */
/* loaded from: 3We.class */
public final class C3We implements 2mR {
    public LastMessageSnippetImpl A00;
    public BlockedUserThreadSnippetImplementation A01;
    public Object A02;
    public Object A03;
    public final Context A04;
    public final FbUserSession A05;
    public final 1YC A06 = 1YC.A03;

    public C3We(Context context, FbUserSession fbUserSession) {
        this.A04 = context;
        this.A05 = fbUserSession;
    }

    public 2nJ BFI(0Da r302, ThreadSummary threadSummary) {
        2nH r327;
        String str;
        Exception exc;
        boolean A1V;
        String str2;
        int i;
        Object obj;
        Object obj2;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A06;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadsnippet.ThreadSnippetInterfaceSpec", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement);
        Exception e = null;
        try {
            if (this.A03 == null) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                str = "messaging.wellbeing.selfremediation.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation";
                r0.A0B("com.facebook.messaging.wellbeing.selfremediation.plugins.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation", "messaging.wellbeing.selfremediation.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadsnippet.ThreadSnippetInterfaceSpec", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.plugins.groupprotections.WellbeingSelfremediationGroupprotectionsKillSwitch", andIncrement2);
                exc = null;
                try {
                    try {
                        if (C2mu.A01(r0, atomicInteger)) {
                            this.A01 = new BlockedUserThreadSnippetImplementation(this.A04);
                            obj2 = C1Y6.A02;
                        } else {
                            obj2 = C1Y6.A03;
                        }
                        this.A03 = obj2;
                        r0.A07("messaging.wellbeing.selfremediation.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", andIncrement2, 1BK.A1V(obj2, C1Y6.A03));
                    } catch (Exception e2) {
                        this.A03 = C1Y6.A03;
                        try {
                            throw e2;
                        } catch (Throwable th) {
                            th = th;
                            exc = e2;
                            A1V = 1BK.A1V(this.A03, C1Y6.A03);
                            str2 = "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec";
                            i = andIncrement2;
                            r0.A03(exc, str, str2, i, A1V);
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    A1V = 1BK.A1V(this.A03, C1Y6.A03);
                    str2 = "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec";
                    i = andIncrement2;
                    r0.A03(exc, str, str2, i, A1V);
                    throw th;
                }
            }
            Object obj3 = this.A03;
            Object obj4 = C1Y6.A03;
            if (obj3 != obj4) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                r0.A0A("com.facebook.messaging.wellbeing.selfremediation.plugins.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation", "messaging.wellbeing.selfremediation.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation", "com.facebook.messaging.threadlist.plugins.interfaces.threadsnippet.ThreadSnippetInterfaceSpec", andIncrement3, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "com.facebook.messaging.wellbeing.selfremediation.plugins.groupprotections.WellbeingSelfremediationGroupprotectionsKillSwitch", "getThreadSnippet");
                try {
                    try {
                        r327 = this.A01.A00(threadSummary);
                        if (r302.test(r327)) {
                            r0.A09("messaging.wellbeing.selfremediation.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement3);
                            r0.A02((Exception) null, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement);
                            return r327;
                        }
                        r0.A09("messaging.wellbeing.selfremediation.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement3);
                    } catch (Throwable th3) {
                        th = th3;
                        r0.A04(e, "messaging.wellbeing.selfremediation.groupprotections.threadsnippet.BlockedUserThreadSnippetImplementation", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement3);
                        throw th;
                    }
                } catch (Exception e3) {
                    e = e3;
                    throw e;
                }
            }
            if (this.A02 == null) {
                int andIncrement4 = atomicInteger.getAndIncrement();
                str = "messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl";
                r0.A0B("com.facebook.messaging.threadlist.plugins.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "com.facebook.messaging.threadlist.plugins.interfaces.threadsnippet.ThreadSnippetInterfaceSpec", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "com.facebook.messaging.threadlist.plugins.core.ThreadlistCoreKillSwitch", andIncrement4);
                exc = null;
                try {
                    try {
                        if (2Uk.A01(r0, atomicInteger)) {
                            this.A00 = new LastMessageSnippetImpl(this.A04, this.A05);
                            obj = C1Y6.A02;
                        } else {
                            obj = obj4;
                        }
                        this.A02 = obj;
                        r0.A07("messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", andIncrement4, 1BK.A1V(obj, obj4));
                    } catch (Throwable th4) {
                        th = th4;
                        A1V = 1BK.A1V(this.A02, obj4);
                        str2 = "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec";
                        i = andIncrement4;
                        r0.A03(exc, str, str2, i, A1V);
                        throw th;
                    }
                } catch (Exception e4) {
                    this.A02 = obj4;
                    try {
                        throw e4;
                    } catch (Throwable th5) {
                        th = th5;
                        exc = e4;
                        A1V = 1BK.A1V(this.A02, obj4);
                        str2 = "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec";
                        i = andIncrement4;
                        r0.A03(exc, str, str2, i, A1V);
                        throw th;
                    }
                }
            }
            if (this.A02 != obj4) {
                int andIncrement5 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.threadlist.plugins.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "com.facebook.messaging.threadlist.plugins.interfaces.threadsnippet.ThreadSnippetInterfaceSpec", andIncrement5, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "com.facebook.messaging.threadlist.plugins.core.ThreadlistCoreKillSwitch", "getThreadSnippet");
                    try {
                        r327 = this.A00.A00(threadSummary);
                        if (r302.test(r327)) {
                            r0.A09("messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement5);
                            r0.A02((Exception) null, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement);
                            return r327;
                        }
                        r0.A09("messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement5);
                    } catch (Exception e5) {
                        throw e5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    r0.A04((Exception) null, "messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement5);
                    throw th;
                }
            }
            r327 = null;
            r0.A02((Exception) null, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement);
            return r327;
        } catch (Throwable th7) {
            r0.A02(e, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement);
            throw th7;
        }
    }
}
