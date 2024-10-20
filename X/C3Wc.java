package X;

import android.content.Context;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.threadlist.plugins.core.threadsnippet.lastmessage.LastMessageSnippetImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.3Wc, reason: invalid class name */
/* loaded from: 3Wc.class */
public final class C3Wc implements 2mR {
    public LastMessageSnippetImpl A00;
    public Object A01;
    public final Context A02;
    public final FbUserSession A03;
    public final 1YC A04 = 1YC.A03;

    public C3Wc(Context context, FbUserSession fbUserSession) {
        this.A02 = context;
        this.A03 = fbUserSession;
    }

    public 2nJ BFI(0Da r302, ThreadSummary threadSummary) {
        2nH r321;
        Object obj;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = this.A04;
        r0.A08("com.facebook.messaging.threadlist.plugins.interfaces.threadsnippet.ThreadSnippetInterfaceSpec", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement);
        try {
            if (this.A01 == null) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                r0.A0B("com.facebook.messaging.threadlist.plugins.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "com.facebook.messaging.threadlist.plugins.interfaces.threadsnippet.ThreadSnippetInterfaceSpec", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "com.facebook.messaging.threadlist.plugins.core.ThreadlistCoreKillSwitch", andIncrement2);
                Exception exc = null;
                try {
                    try {
                        if (2Uk.A01(r0, atomicInteger)) {
                            this.A00 = new LastMessageSnippetImpl(this.A02, this.A03);
                            obj = C1Y6.A02;
                        } else {
                            obj = C1Y6.A03;
                        }
                        this.A01 = obj;
                        r0.A07("messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", andIncrement2, 1BK.A1V(obj, C1Y6.A03));
                    } catch (Throwable th) {
                        th = th;
                        r0.A03(exc, "messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", andIncrement2, 1BK.A1V(this.A01, C1Y6.A03));
                        throw th;
                    }
                } catch (Exception e) {
                    this.A01 = C1Y6.A03;
                    try {
                        throw e;
                    } catch (Throwable th2) {
                        th = th2;
                        exc = e;
                        r0.A03(exc, "messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", andIncrement2, 1BK.A1V(this.A01, C1Y6.A03));
                        throw th;
                    }
                }
            }
            if (this.A01 != C1Y6.A03) {
                int andIncrement3 = atomicInteger.getAndIncrement();
                try {
                    r0.A0A("com.facebook.messaging.threadlist.plugins.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "com.facebook.messaging.threadlist.plugins.interfaces.threadsnippet.ThreadSnippetInterfaceSpec", andIncrement3, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "com.facebook.messaging.threadlist.plugins.core.ThreadlistCoreKillSwitch", "getThreadSnippet");
                    try {
                        r321 = this.A00.A00(threadSummary);
                        if (r302.test(r321)) {
                            r0.A09("messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement3);
                            r0.A02((Exception) null, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement);
                            return r321;
                        }
                        r0.A09("messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement3);
                    } catch (Exception e2) {
                        throw e2;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    r0.A04((Exception) null, "messaging.threadlist.core.threadsnippet.lastmessage.LastMessageSnippetImpl", "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement3);
                    throw th;
                }
            }
            r321 = null;
            r0.A02((Exception) null, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement);
            return r321;
        } catch (Throwable th4) {
            r0.A02((Exception) null, "messaging.threadlist.threadsnippet.ThreadSnippetInterfaceSpec", "getThreadSnippet", andIncrement);
            throw th4;
        }
    }
}
