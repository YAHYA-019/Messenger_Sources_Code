package X;

import android.app.job.JobParameters;
import com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService;

/* loaded from: Lo2.class */
public final class Lo2 implements Runnable {
    public static final String __redex_internal_original_name = "OxygenScheduledInstallerJobService$onStartJob$1";
    public final /* synthetic */ JobParameters A00;
    public final /* synthetic */ OxygenScheduledInstallerJobService A01;

    public Lo2(JobParameters jobParameters, OxygenScheduledInstallerJobService oxygenScheduledInstallerJobService) {
        this.A01 = oxygenScheduledInstallerJobService;
        this.A00 = jobParameters;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r305v3 ??, still in use, count: 2, list:
          (r305v3 ??) from 0x0160: PHI (r305v2 ??) = (r305v1 ??), (r305v3 ??) binds: [B:67:0x014b, B:71:0x015b] A[DONT_GENERATE, DONT_INLINE]
          (r305v3 ?? I:X.QQa) from 0x015d: IPUT (r305v3 ?? I:X.QQa), (r0v1 ?? I:com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService) A[Catch: UnsupportedOperationException -> 0x01d0, all -> 0x01d8, DeadObjectException -> 0x01e6] com.facebook.voltron.download.scheduledinstaller.OxygenScheduledInstallerJobService.A02 X.QQa
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
    public final void run() {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Lo2.run():void");
    }
}
