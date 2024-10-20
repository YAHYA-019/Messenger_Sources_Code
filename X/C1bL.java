package X;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import android.os.UserManager;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.1bL, reason: invalid class name */
/* loaded from: 1bL.class */
public final class C1bL {
    public final Context A00;
    public final 1bA A01;
    public final C1c3 A02;
    public final 1dD A03;
    public final String A04;
    public static final Object A09 = new Object();
    public static final Executor A0B = new Object();
    public static final java.util.Map A0A = new 0QO(0);
    public final AtomicBoolean A07 = new AtomicBoolean(false);
    public final AtomicBoolean A08 = new AtomicBoolean();
    public final List A05 = new CopyOnWriteArrayList();
    public final List A06 = new CopyOnWriteArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0181 A[LOOP:0: B:11:0x0173->B:13:0x0181, LOOP_END] */
    /* JADX WARN: Type inference failed for: r0v37, types: [com.google.firebase.components.ComponentRegistrar, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v66, types: [X.1dD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r308v1 */
    /* JADX WARN: Type inference failed for: r308v3 */
    /* JADX WARN: Type inference failed for: r308v4, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C1bL(android.content.Context r302, X.1bA r303, java.lang.String r304) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1bL.<init>(android.content.Context, X.1bA, java.lang.String):void");
    }

    public static C1bL A00() {
        C1bL c1bL;
        synchronized (A09) {
            c1bL = (C1bL) A0A.get("[DEFAULT]");
            if (c1bL == null) {
                String str = KSH.A00;
                if (str == null) {
                    str = Application.getProcessName();
                    KSH.A00 = str;
                }
                throw 0Pz.A07("Default FirebaseApp is not initialized in this process ", str, ". Make sure to call FirebaseApp.initializeApp(Context) first.");
            }
        }
        return c1bL;
    }

    public static void A01(C1bL c1bL) {
        AbstractC00481b7.A09(!c1bL.A08.get(), "FirebaseApp was deleted");
    }

    public static void A02(C1bL c1bL) {
        HashMap hashMap;
        Context context = c1bL.A00;
        if (!((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked()) {
            A01(c1bL);
            android.util.Log.i("FirebaseApp", 0Pz.A0W("Device in Direct Boot Mode: postponing initialization of Firebase APIs for app ", c1bL.A04));
            AtomicReference atomicReference = C32j.A01;
            if (atomicReference.get() == null) {
                C32j c32j = new C32j(context);
                if (1MG.A00(atomicReference, (Object) null, c32j)) {
                    context.registerReceiver(c32j, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                    return;
                }
                return;
            }
            return;
        }
        A01(c1bL);
        String str = c1bL.A04;
        android.util.Log.i("FirebaseApp", 0Pz.A0W("Device unlocked: initializing all Firebase APIs for app ", str));
        C1c3 c1c3 = c1bL.A02;
        A01(c1bL);
        if (1MG.A00(c1c3.A04, (Object) null, Boolean.valueOf("[DEFAULT]".equals(str)))) {
            synchronized (c1c3) {
                hashMap = new HashMap(c1c3.A01);
            }
            C1c3.A00(c1c3, hashMap);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1bL)) {
            return false;
        }
        String str = this.A04;
        C1bL c1bL = (C1bL) obj;
        A01(c1bL);
        return str.equals(c1bL.A04);
    }

    public int hashCode() {
        return this.A04.hashCode();
    }

    public String toString() {
        3OO r0 = new 3OO(this);
        r0.A00(this.A04, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        r0.A00(this.A01, "options");
        return r0.toString();
    }
}
