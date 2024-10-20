package X;

import android.content.Context;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutionException;

/* renamed from: X.10f, reason: invalid class name */
/* loaded from: 10f.class */
public final class C10f implements C4Av {
    public 1BY A00;

    public C10f(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    public static final C10f A00(1BO r301) {
        return new C10f(r301);
    }

    @Override // X.C4Av
    public boolean Ciy(4Yg r302) {
        final SettableFuture create = SettableFuture.create();
        13C r0 = (13C) 1Bn.A0G(this.A00, 50);
        C01s c01s = (C01s) 1Bi.A03(16511);
        C13b c13b = new C13b() { // from class: X.125
            /* JADX INFO: Access modifiers changed from: private */
            @Override // X.C13b
            /* renamed from: A00, reason: merged with bridge method [inline-methods] */
            public void onSuccess(AnonymousClass138 anonymousClass138) {
                0fH.A0d(Integer.valueOf(Collections.unmodifiableSet(anonymousClass138.A00).size()), Integer.valueOf(Collections.unmodifiableSet(anonymousClass138.A02).size()), "PublicKeyDownloadCW", "MobileFBSignedURL public key sync succeeded -- downloaded %d keys, removed %d keys");
                create.set(AnonymousClass001.A0K());
            }

            @Override // X.C13b
            public void onFailure(Throwable th) {
                create.setException(th);
            }
        };
        long currentTimeMillis = System.currentTimeMillis();
        try {
            Set BYL = r0.A02.BYL(null);
            r0.A00.BYM((Context) null, new 19B(c13b, r0, new HashSet(BYL), new HashSet(BYL), currentTimeMillis));
        } catch (IOException e) {
            r0.A01.BaK(e);
            c13b.onFailure(e);
        }
        try {
            return AnonymousClass001.A1V(create.get());
        } catch (InterruptedException | ExecutionException e2) {
            c01s.softReport("PublicKeyDownloadCW", "MobileFBSignedURL public key sync failed", e2);
            return false;
        }
    }
}
