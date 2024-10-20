package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.inject.FbInjector;
import com.facebook.user.model.User;

/* renamed from: X.4eW, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4eW.class */
public final class C05584eW {
    public 1BY A00;
    public final C00i A01 = FbInjector.A00;
    public final 1fF A03 = (1fF) 1Bi.A03(66655);
    public final C00i A02 = new 1BQ(16477);

    public C05584eW(1BO r302) {
        this.A00 = new 1BY(r302);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static AnonymousClass491 A00(final C05584eW c05584eW, User user) {
        final ?? obj = new Object();
        1BY r0 = c05584eW.A00;
        final C4ec c4ec = (C4ec) 1Bn.A0E((Context) null, r0, 49191);
        final 2qN r02 = (2qN) 1Bn.A0E((Context) null, r0, 17095);
        r02.A0A((Context) c05584eW.A01.get());
        r02.A0E(true);
        r02.A09(c4ec.A03());
        r02.A0D(2qZ.A01(user));
        r02.A0A = new InterfaceC05694em() { // from class: X.4el
            @Override // X.InterfaceC05694em
            public void CTR() {
                obj.set(c4ec.A05((Drawable) r02.A09));
            }
        };
        return new AnonymousClass491(obj);
    }
}
