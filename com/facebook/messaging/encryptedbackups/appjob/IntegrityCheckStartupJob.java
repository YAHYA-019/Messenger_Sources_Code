package com.facebook.messaging.encryptedbackups.appjob;

import X.0fH;
import X.11T;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1NK;
import X.4yB;
import X.4yD;
import X.7sJ;
import X.C00i;
import X.C0dp;
import X.C1ud;
import X.C1wg;
import X.C1wi;
import X.C1wj;
import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.prefs.shared.FbSharedPreferences;

/* loaded from: IntegrityCheckStartupJob.class */
public final class IntegrityCheckStartupJob {
    public final 1Br A03;
    public final 1Br A06;
    public final Context A07;
    public final 1Br A04 = 1Bu.A00(66121);
    public final 1Br A05 = 1Bq.A00(65997);
    public final 1Br A00 = 1Bu.A00(68919);
    public final 1Br A01 = 1Bq.A00(68885);
    public final 1Br A02 = 1Bu.A00(67246);

    public IntegrityCheckStartupJob() {
        Context A00 = FbInjector.A00();
        11T.A0A(A00);
        this.A07 = A00;
        this.A03 = 1Bq.A00(99390);
        this.A06 = 1Bu.A00(66644);
    }

    private final 4yD A00() {
        C00i c00i = this.A04.A00;
        long A00 = ((4yB) c00i.get()).A00();
        C00i c00i2 = this.A05.A00;
        C1ud c1ud = (C1ud) c00i2.get();
        if (A00 >= C1ud.A00(c1ud).Av9(c1ud.A02, 36597901672320823L)) {
            0fH.A0j("IntegrityCheckStartupJob", "[cancelled] reached retry limit");
            return 4yD.A0C;
        }
        long now = ((C0dp) this.A03.A00.get()).now();
        4yB r0 = (4yB) c00i.get();
        long Av1 = now - ((FbSharedPreferences) r0.A01.A00.get()).Av1(C1wg.A03(1NK.A4Q, (C1wg) r0.A02.A00.get()), 0L);
        C1ud c1ud2 = (C1ud) c00i2.get();
        if (Av1 <= C1ud.A00(c1ud2).Av9(c1ud2.A02, 36597901672386360L) * 60 * 1000) {
            0fH.A0j("IntegrityCheckStartupJob", "[cancelled] in cooldown");
            return 4yD.A08;
        }
        if (((C1wi) this.A01.A00.get()).A00() != C1wj.A04) {
            0fH.A0j("IntegrityCheckStartupJob", "[cancelled] device is not onboarded");
            return 4yD.A03;
        }
        if (((7sJ) this.A06.A00.get()).A00(this.A07)) {
            return null;
        }
        0fH.A0j("IntegrityCheckStartupJob", "[cancelled] no internet");
        return 4yD.A09;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Enum A01(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 516
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob.A01(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob, X.0DR):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Enum A02(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob.A02(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob, X.0DR):java.lang.Enum");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A03(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 716
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob.A03(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A04(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob.A04(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A05(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob.A05(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A06(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 443
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob.A06(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob, X.0DR):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A07(com.facebook.auth.usersession.FbUserSession r301, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob r302, X.0DR r303) {
        /*
            Method dump skipped, instructions count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob.A07(com.facebook.auth.usersession.FbUserSession, com.facebook.messaging.encryptedbackups.appjob.IntegrityCheckStartupJob, X.0DR):java.lang.Object");
    }
}
