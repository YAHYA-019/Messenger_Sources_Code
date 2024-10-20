package com.facebook.messaging.sounds.notification;

import X.1BP;
import X.1Bq;
import X.1Br;
import X.1Bu;
import android.content.ContentResolver;
import com.facebook.inject.FbInjector;

/* loaded from: NotificationSoundInitializer.class */
public final class NotificationSoundInitializer {
    public final 1Br A01 = 1Bq.A00(33013);
    public final 1BP A04 = FbInjector.A00;
    public final 1Br A02 = 1Bq.A00(68025);
    public final 1Br A03 = 1Bu.A00(67043);
    public final ContentResolver A00 = FbInjector.A03.getContentResolver();

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r318v0 ??, still in use, count: 2, list:
          (r318v0 ??) from 0x00de: PHI (r318v1 ??) = (r318v0 ??), (r318v2 ??) binds: [B:155:0x00d7, B:7:0x00cf] A[DONT_GENERATE, DONT_INLINE]
          (r318v0 ?? I:java.util.AbstractCollection) from 0x00b7: INVOKE (r318v0 ?? I:java.util.AbstractCollection), (r0v42 ?? I:java.lang.Object) VIRTUAL call: java.util.AbstractCollection.add(java.lang.Object):boolean A[Catch: all -> 0x00be, MD:(E):boolean (c)]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public final void A00() {
        /*
            Method dump skipped, instructions count: 1088
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.sounds.notification.NotificationSoundInitializer.A00():void");
    }
}
