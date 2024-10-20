package X;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import com.facebook.common.appjobs.ondemand.AppJobsListenableWorker;
import com.facebook.common.tempfile.TempFileDelayedWorker;
import com.facebook.inject.FbInjector;
import com.google.common.base.Absent;
import com.google.common.base.Optional;
import java.io.File;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* renamed from: X.536, reason: invalid class name */
/* loaded from: 536.class */
public final class AnonymousClass536 {
    public static final AnonymousClass537 A0E = AnonymousClass537.ONE_DAY;
    public I4a A00;
    public I4a A01;
    public java.util.Map A02;
    public I4a A03;
    public I4a A04;
    public Optional A05;
    public Optional A06;
    public final C00i A0B = new 1BQ(49456);
    public final C00i A0A = new 1BQ(100173);
    public final C00i A08 = FbInjector.A00;
    public final C00i A0D = new 1BQ(16385);
    public final C00i A09 = new 1BV(116371);
    public final C00i A07 = new 1BQ(98404);
    public final C00i A0C = new 1BQ(16853);

    public AnonymousClass536() {
        Absent absent = Absent.INSTANCE;
        this.A06 = absent;
        this.A05 = absent;
        this.A02 = new EnumMap(AnonymousClass537.class);
    }

    private I4a A00() {
        Optional optional = this.A05;
        if (!optional.isPresent()) {
            C00i c00i = this.A09;
            c00i.get();
            synchronized (0LL.class) {
            }
            optional = Optional.of(new I4a((Hkm) c00i.get(), new File(Environment.getExternalStorageDirectory(), "fb_temp_old")));
            this.A05 = optional;
        }
        return (I4a) optional.get();
    }

    private I4a A01() {
        Optional optional = this.A06;
        if (!optional.isPresent()) {
            C00i c00i = this.A09;
            c00i.get();
            c00i.get();
            synchronized (0LL.class) {
            }
            optional = Optional.of(new I4a((Hkm) c00i.get(), new File(new File(Environment.getExternalStorageDirectory(), (String) this.A0A.get()), "fb_temp")));
            this.A06 = optional;
        }
        return (I4a) optional.get();
    }

    private I4a A02() {
        I4a i4a = this.A03;
        if (i4a == null) {
            Context context = (Context) this.A08.get();
            C00i c00i = this.A09;
            c00i.get();
            i4a = new I4a((Hkm) c00i.get(), new File(context.getCacheDir(), "fb_temp_old"));
            this.A03 = i4a;
        }
        return i4a;
    }

    private I4a A03() {
        I4a i4a = this.A04;
        if (i4a == null) {
            i4a = new I4a((Hkm) this.A09.get(), ((1MC) this.A07.get()).AUU(1734111267));
            this.A04 = i4a;
        }
        return i4a;
    }

    public static I4a A04(AnonymousClass537 anonymousClass537, AnonymousClass536 anonymousClass536, Integer num) {
        if (num == 0S2.A00) {
            return anonymousClass536.A03();
        }
        if (num == 0S2.A01) {
            return anonymousClass536.A01();
        }
        if (num != 0S2.A0C) {
            throw new IllegalArgumentException();
        }
        java.util.Map map = anonymousClass536.A02;
        if (map.get(anonymousClass537) == null) {
            File AUU = ((1MC) anonymousClass536.A07.get()).AUU(1224554173);
            StringBuilder sb = new StringBuilder("fb_temp");
            if (anonymousClass537 != A0E) {
                sb.append("_");
                sb.append(anonymousClass537.mFileDirSuffix);
            }
            C00i c00i = anonymousClass536.A09;
            c00i.get();
            c00i.get();
            map.put(anonymousClass537, new I4a((Hkm) c00i.get(), new File(new File(AUU, (String) anonymousClass536.A0A.get()), sb.toString())));
        }
        Object obj = map.get(anonymousClass537);
        obj.getClass();
        return (I4a) obj;
    }

    /* JADX WARN: Type inference failed for: r0v23, types: [X.1wJ, X.7ct] */
    private void A05(AnonymousClass537 anonymousClass537) {
        Integer num;
        if (!((2yD) this.A0D.get()).AZk(36313153918801757L)) {
            ((51Q) this.A0B.get()).A01(TempFileDelayedWorker.class, TimeUnit.SECONDS.convert(anonymousClass537.mLengthMs, TimeUnit.MILLISECONDS));
            return;
        }
        ?? r0 = new 1wJ();
        r0.A00 = -1;
        ((1wJ) r0).A02 = 1000002;
        r0.A00 = anonymousClass537.mLengthMs;
        C7cu c7cu = new C7cu(r0);
        C1vh c1vh = (C1vh) this.A0C.get();
        5GG r02 = (5GG) c1vh.A06.get();
        C00i c00i = r02.A01;
        5GF r03 = (5GF) c00i.get();
        int i = ((1wN) c7cu).A00;
        if (r03.A00(i) == null) {
            throw AnonymousClass001.A0L(0Pz.A0d("OnDemandJob for id: ", " doesn't exist.", i));
        }
        C4Kd c4Kd = new C4Kd();
        java.util.Map map = c4Kd.A00;
        Integer valueOf = Integer.valueOf(i);
        map.put("com.facebook.common.appjobs.ondemand.JOB_ID", valueOf);
        C4Kc A00 = c4Kd.A00();
        long j = c7cu.A00;
        if (j < 0) {
            c00i.get();
            j = 0;
        }
        JRa jRa = new JRa(AppJobsListenableWorker.class);
        C1w2[] A02 = ((5GF) c00i.get()).A02(i);
        3OA r04 = new 3OA();
        for (C1w2 c1w2 : A02) {
            switch (c1w2.ordinal()) {
                case 0:
                    r04.A04 = true;
                    continue;
                case 11:
                case 15:
                case 16:
                case 18:
                case 19:
                    break;
                case 12:
                    num = 0S2.A01;
                    break;
                case 13:
                    num = 0S2.A0Y;
                    break;
                case 14:
                    num = 0S2.A0C;
                    break;
                case 24:
                    r04.A03 = true;
                    continue;
                case 25:
                    r04.A02 = true;
                    continue;
                default:
                    0fH.A14("OnDemandJobDelegateImpl", "Unknown hint for WorkManager constraint: %s", new Object[]{c1w2});
                    continue;
            }
            11T.A0F(num, 0);
            r04.A00 = num;
        }
        C4Ke A002 = r04.A00();
        C4Kf c4Kf = jRa.A00;
        c4Kf.A0B = A002;
        c4Kf.A0C = A00;
        c4Kf.A05 = TimeUnit.MILLISECONDS.toMillis(j);
        if (Long.MAX_VALUE - System.currentTimeMillis() <= jRa.A00.A05) {
            throw AnonymousClass001.A0L("The given initial delay is too large and will cause an overflow!");
        }
        JRe A003 = jRa.A00();
        String A0T = 0Pz.A0T("com.facebook.common.AppJobs.Worker#", i);
        4IU A004 = 4IU.A00(1BK.A04(r02.A00));
        new JRf(A004, 0S2.A00, A0T, Collections.singletonList(A003), (List) null).A02();
        2FT A01 = 2FP.A01(new Lex(r02, 0), new C4Wf(A004, A003.A02));
        1wV r05 = new 1wV(c7cu);
        r05.A00(A01);
        c1vh.A07.put(valueOf, r05);
    }

    public long A06() {
        File file = A03().A01;
        return file.getParentFile() == null ? -1 : file.getParentFile().getFreeSpace();
    }

    public long A07() {
        File file = A03().A01;
        return file.getParentFile() == null ? -1 : file.getParentFile().getTotalSpace();
    }

    public long A08() {
        File file = A03().A01;
        return file.getParentFile() == null ? -1 : file.getParentFile().getUsableSpace();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0093, code lost:
    
        if ((r0 != null ? r0.length() : 0) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0023, code lost:
    
        if (r302 == X.AnonymousClass536.A0E) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.File A09(X.AnonymousClass537 r302, java.lang.Integer r303, java.lang.String r304, java.lang.String r305) {
        /*
            Method dump skipped, instructions count: 419
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass536.A09(X.537, java.lang.Integer, java.lang.String, java.lang.String):java.io.File");
    }

    public File A0A(Integer num, String str, String str2) {
        return A09(A0E, num, str, str2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        if ((r0 != null ? r0.length() : 0) == 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.File A0B(java.lang.String r302, java.lang.String r303) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass536.A0B(java.lang.String, java.lang.String):java.io.File");
    }

    public final File A0C(String str, String str2) {
        return A0A(0S2.A00, str, str2);
    }

    public void A0D() {
        HashSet hashSet = new HashSet();
        boolean A02 = Build.VERSION.SDK_INT < 30 ? false | A01().A02(A0E.mLengthMs) : false;
        I4a A03 = A03();
        AnonymousClass537 anonymousClass537 = A0E;
        if (A03.A02(anonymousClass537.mLengthMs) | A02 | A02().A02(anonymousClass537.mLengthMs) | A00().A02(anonymousClass537.mLengthMs)) {
            hashSet.add(anonymousClass537);
        }
        1Bi.A03(83603);
        java.util.Map map = this.A02;
        for (AnonymousClass537 anonymousClass5372 : map.keySet()) {
            Object obj = map.get(anonymousClass5372);
            obj.getClass();
            if (((I4a) obj).A02(anonymousClass5372.mLengthMs)) {
                hashSet.add(anonymousClass5372);
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            A05((AnonymousClass537) it.next());
        }
    }

    public void A0E(String str) {
        if (Build.VERSION.SDK_INT < 30) {
            A01().A01(str);
        }
        A03().A01(str);
        I4a i4a = this.A01;
        if (i4a == null) {
            i4a = new I4a((Hkm) this.A09.get(), ((1MC) this.A07.get()).AUU(1224554173));
            this.A01 = i4a;
        }
        i4a.A01(str);
        I4a i4a2 = this.A00;
        if (i4a2 == null) {
            this.A08.get();
            i4a2 = new I4a((Hkm) this.A09.get(), ((1MC) this.A07.get()).AUU(299406435));
            this.A00 = i4a2;
        }
        i4a2.A01(str);
        A02().A01(str);
        A00().A01(str);
        Iterator A1A = 1BK.A1A(this.A02);
        while (A1A.hasNext()) {
            ((I4a) A1A.next()).A01(str);
        }
    }

    public boolean A0F(File file) {
        Integer[] A00 = 0S2.A00(3);
        int length = A00.length;
        int i = 0;
        loop0: while (true) {
            int i2 = i;
            if (i2 >= length) {
                File parentFile = ((C3RB) ((HnB) 1Lo.A06(1Fw.A04((1EZ) 1Bn.A0A(16428)), 99907)).A01.get()).A01(UUID.randomUUID().toString(), 594169501).getParentFile();
                File parentFile2 = file.getParentFile();
                return parentFile2 != null && parentFile2.equals(parentFile) && file.exists();
            }
            Integer num = A00[i2];
            if (num == 0S2.A0C) {
                Iterator it = this.A02.values().iterator();
                while (it.hasNext()) {
                    if (((I4a) it.next()).A03(file)) {
                        break loop0;
                    }
                }
            }
            if (A04(A0E, this, num).A03(file)) {
                break;
            }
            i = i2 + 1;
        }
        return true;
    }
}
