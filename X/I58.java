package X;

import android.content.Context;
import android.os.Bundle;
import com.facebook.messaging.montage.composer.plugins.fbstorieseditor.impl.MontageFbStoriesEditorLauncherImpl;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: I58.class */
public final class I58 {
    public final HPR A00;

    public I58(HPR hpr) {
        this.A00 = hpr;
    }

    public static I58 A00(Context context) {
        return new I58((HPR) C1Y6.A00(context, "com_facebook_messaging_montage_composer_plugins_interfaces_fbstorieseditor_MontageFbStoriesEditorLauncherSpec", "All", AnonymousClass001.A1Z()));
    }

    public void A01(Context context, Bundle bundle, Runnable runnable, String str) {
        Hym hym = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hym.A02;
        r0.A08("com.facebook.messaging.montage.composer.plugins.interfaces.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "onOpenMusicPickerFromEndCard", andIncrement);
        try {
            if (Hym.A00(hym)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1C = GOp.A1C(r0, "onOpenMusicPickerFromEndCard", andIncrement2);
                try {
                    try {
                        MontageFbStoriesEditorLauncherImpl montageFbStoriesEditorLauncherImpl = hym.A00;
                        11T.A0H(context, str);
                        MontageFbStoriesEditorLauncherImpl.A00(context, montageFbStoriesEditorLauncherImpl, new J0a(context, bundle, str), runnable, str);
                        r0.A09(A1C, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "onOpenMusicPickerFromEndCard", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A1C, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "onOpenMusicPickerFromEndCard", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "onOpenMusicPickerFromEndCard", andIncrement);
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "onOpenMusicPickerFromEndCard", andIncrement);
            throw th2;
        }
    }

    public boolean A02() {
        Hym hym = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hym.A02;
        r0.A08("com.facebook.messaging.montage.composer.plugins.interfaces.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isFbStoriesEditorEnabled", andIncrement);
        boolean z = false;
        Exception e = null;
        try {
            if (Hym.A00(hym)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1C = GOp.A1C(r0, "isFbStoriesEditorEnabled", andIncrement2);
                try {
                    try {
                        z = 2yD.A03(1Br.A06(hym.A00.A00), 36315335762649819L);
                        r0.A09(A1C, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isFbStoriesEditorEnabled", andIncrement2);
                    } catch (Exception e2) {
                        e = e2;
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04(e, A1C, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isFbStoriesEditorEnabled", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isFbStoriesEditorEnabled", andIncrement);
            return z;
        } catch (Throwable th2) {
            r0.A02(e, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isFbStoriesEditorEnabled", andIncrement);
            throw th2;
        }
    }

    public boolean A03(Context context) {
        Hym hym = this.A00.A00;
        AtomicInteger atomicInteger = C1Y6.A04;
        int andIncrement = atomicInteger.getAndIncrement();
        1YC r0 = hym.A02;
        r0.A08("com.facebook.messaging.montage.composer.plugins.interfaces.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isVoltronModuleLoaded", andIncrement);
        boolean z = false;
        try {
            if (Hym.A00(hym)) {
                int andIncrement2 = atomicInteger.getAndIncrement();
                String A1C = GOp.A1C(r0, "isVoltronModuleLoaded", andIncrement2);
                try {
                    try {
                        MontageFbStoriesEditorLauncherImpl montageFbStoriesEditorLauncherImpl = hym.A00;
                        11T.A0F(context, 0);
                        z = ((EyT) 1Bn.A0E(context, (1BY) null, 82175)).A02(1Br.A06(montageFbStoriesEditorLauncherImpl.A00).Av9(1GD.A07, 36596810740075716L));
                        r0.A09(A1C, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isVoltronModuleLoaded", andIncrement2);
                    } catch (Exception e) {
                        throw e;
                    }
                } catch (Throwable th) {
                    r0.A04((Exception) null, A1C, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isVoltronModuleLoaded", andIncrement2);
                    throw th;
                }
            }
            r0.A02((Exception) null, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isVoltronModuleLoaded", andIncrement);
            return z;
        } catch (Throwable th2) {
            r0.A02((Exception) null, "messaging.montage.composer.fbstorieseditor.MontageFbStoriesEditorLauncherSpec", "isVoltronModuleLoaded", andIncrement);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        if (X.2yD.A03(X.1Br.A06(r0.A00), 36315335763632864L) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean A04(android.content.Context r302, X.C6r6 r303) {
        /*
            Method dump skipped, instructions count: 228
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I58.A04(android.content.Context, X.6r6):boolean");
    }
}
