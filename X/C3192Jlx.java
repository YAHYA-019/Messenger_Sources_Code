package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.Jlx, reason: case insensitive filesystem */
/* loaded from: Jlx.class */
public final class C3192Jlx extends G6Y {
    public static final String __redex_internal_original_name = "CollectiveAuthOperationListenerImpl$58";
    public final /* synthetic */ Ezc A00;
    public final /* synthetic */ EnC A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3192Jlx(Ezc ezc, EnC enC, QuickPerformanceLogger quickPerformanceLogger, Class cls, AtomicInteger atomicInteger) {
        super(quickPerformanceLogger, cls, "BeforeLogout", "PageGlobalNotificationPrefsSynchronizer", "beforeLogout", PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, atomicInteger, 9699331, true);
        this.A00 = ezc;
        this.A01 = enC;
    }

    public void A02() {
        LAA laa = (LAA) this.A00.A0l.get();
        synchronized (laa) {
            try {
                if (laa.A07 != null || laa.A06 != null || laa.A05 != null) {
                    laa.A09 = true;
                    if (LAA.A02(laa)) {
                        0fH.A0C(LAA.class, "Running scheduled operation immediately since user is logging out.");
                        laa.A03();
                    }
                    ListenableFuture listenableFuture = laa.A05;
                    if (listenableFuture != null) {
                        try {
                            listenableFuture.get();
                            0fH.A0C(LAA.class, "Waiting on global mute network operation before logging out.");
                        } catch (InterruptedException e) {
                            0fH.A0G(LAA.class, "Waiting on global mute operation future interrupted", e);
                        } catch (ExecutionException e2) {
                            0fH.A0G(LAA.class, "Waiting on global mute operation future failed", e2);
                        }
                    }
                    ListenableFuture listenableFuture2 = laa.A06;
                    if (listenableFuture2 != null) {
                        try {
                            try {
                                listenableFuture2.get();
                                0fH.A0C(LAA.class, "Waiting on notification dot network operation before logging out.");
                            } catch (InterruptedException e3) {
                                0fH.A0G(LAA.class, "Waiting on notification dot operation future interrupted", e3);
                            }
                        } catch (ExecutionException e4) {
                            0fH.A0G(LAA.class, "Waiting on notification dot operation future failed", e4);
                        }
                    }
                    laa.A09 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
