package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4K7, reason: invalid class name */
/* loaded from: 4K7.class */
public final class C4K7 implements Runnable {
    public int A00 = 0;
    public final Context A01;
    public final 4IU A02;
    public final C4K5 A03;
    public static final String __redex_internal_original_name = "ForceStopRunnable";
    public static final String A04 = 4IS.A01(__redex_internal_original_name);
    public static final long A05 = TimeUnit.DAYS.toMillis(3650);

    public C4K7(Context context, 4IU r303) {
        this.A01 = context.getApplicationContext();
        this.A02 = r303;
        this.A03 = r303.A05;
    }

    public static void A00(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = 134217728;
        if (Build.VERSION.SDK_INT >= 31) {
            i = 167772160;
        }
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long currentTimeMillis = System.currentTimeMillis() + A05;
        if (alarmManager != null) {
            alarmManager.setExact(0, currentTimeMillis, broadcast);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r310v4 ??, still in use, count: 4, list:
          (r310v4 ??) from 0x0937: PHI (r310v1 ??) = (r310v0 ??), (r310v4 ??) binds: [B:502:0x0929, B:477:0x08d2] A[DONT_GENERATE, DONT_INLINE]
          (r310v4 ??) from 0x092c: PHI (r310v2 ??) = (r310v0 ??), (r310v4 ??), (r310v4 ??) binds: [B:502:0x0929, B:482:0x08ea, B:484:0x08f1] A[DONT_GENERATE, DONT_INLINE]
          (r310v4 ??) from 0x092c: PHI (r310v2 ??) = (r310v0 ??), (r310v4 ??), (r310v4 ??) binds: [B:502:0x0929, B:482:0x08ea, B:484:0x08f1] A[DONT_GENERATE, DONT_INLINE]
          (r310v4 ?? I:java.lang.Throwable) from 0x08f3: INVOKE (r0v79 ?? I:java.lang.String), (r0v75 ?? I:java.lang.String), (r310v4 ?? I:java.lang.Throwable) STATIC call: android.util.Log.d(java.lang.String, java.lang.String, java.lang.Throwable):int A[Catch: all -> 0x093a, MD:(java.lang.String, java.lang.String, java.lang.Throwable):int (c)]
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
    @Override // java.lang.Runnable
    public void run() {
        /*
            Method dump skipped, instructions count: 2374
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4K7.run():void");
    }
}
