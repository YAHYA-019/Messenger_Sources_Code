package X;

import com.facebook.common.callercontext.CallerContextable;
import com.facebook.device.DeviceConditionHelper;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.stickers.service.StickersQueue;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.SingletonImmutableSet;

/* renamed from: X.4Bw, reason: invalid class name */
/* loaded from: 4Bw.class */
public final class C4Bw implements C4Ah, CallerContextable {
    public static final 1G2 A09;
    public static final 1G2 A0A;
    public static final 1G2 A0B;
    public static final ImmutableSet A0C;
    public static final C4Ao A0D;
    public static final String __redex_internal_original_name = "StickersAssetsDownloadConditionalWorkerInfo";
    public final C4Bz A00;
    public final C00i A02;
    public final C00i A03;
    public final C00i A04;
    public final C00i A07;
    public final C15h A08;
    public final C00i A01 = new 1BQ(16567);
    public final C15h A05 = new C4Xh(this, 13);
    public final C15h A06 = new C4Xh(this, 14);

    static {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Ax.A01);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        A0D = c4Ak.A01();
        A0C = new SingletonImmutableSet(StickersQueue.class);
        1G2 r0 = C4By.A00;
        A0B = r0.A0D("last_partial_download_time");
        A0A = r0.A0D("last_wifi_connection");
        A09 = r0.A0D("download_complete_time");
    }

    public C4Bw() {
        1BQ r0 = new 1BQ(99390);
        this.A02 = r0;
        this.A07 = new 1BQ(17096);
        this.A03 = new 1BQ(33013);
        this.A08 = new C4Xh(this, 15);
        this.A04 = new 1BV(32985);
        this.A00 = new C4Bz((C0dp) r0.get(), 20, 60000L);
    }

    private boolean A00(boolean z) {
        Class cls;
        String str;
        boolean z2 = false;
        if (((DeviceConditionHelper) this.A07.get()).A03(false)) {
            cls = C4Bw.class;
            str = "on wifi, running.";
        } else {
            if (z) {
                C00i c00i = this.A03;
                FbSharedPreferences fbSharedPreferences = (FbSharedPreferences) c00i.get();
                1G2 r0 = A0A;
                if (!fbSharedPreferences.BNM(r0)) {
                    0fH.A0D(C4Bw.class, "initializing LAST_NOT_WAITED_FOR_WIFI_TIME to now.");
                    1Ql A0V = 1BL.A0V(c00i);
                    A0V.CaH(r0, 1BL.A08(this.A02));
                    A0V.commit();
                }
            }
            FbSharedPreferences fbSharedPreferences2 = (FbSharedPreferences) this.A03.get();
            1G2 r02 = A0A;
            C00i c00i2 = this.A02;
            if (((C0dp) c00i2.get()).now() < fbSharedPreferences2.Av1(r02, ((C0dp) c00i2.get()).now()) + (((2yD) ((4CN) this.A04.get()).A00.get()).Auz(36591978900685032L, 1L) * 86400000)) {
                z2 = true;
                0fH.A09(C4Bw.class, Boolean.valueOf(z2), "should wait for wifi = %s");
                return z2;
            }
            cls = C4Bw.class;
            str = "running off wifi";
        }
        0fH.A0D(cls, str);
        if (z) {
            0fH.A0D(cls, "updating last not wait for wifi time");
            1Ql edit = ((FbSharedPreferences) this.A03.get()).edit();
            edit.CaH(A0A, ((C0dp) this.A02.get()).now());
            edit.commit();
        }
        0fH.A09(C4Bw.class, Boolean.valueOf(z2), "should wait for wifi = %s");
        return z2;
    }

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A08;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    @Override // X.C4Ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public long Aro() {
        /*
            Method dump skipped, instructions count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Bw.Aro():long");
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(313698419837672L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        return A0D;
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0182, code lost:
    
        if ((!A00(true)) == false) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x016f, code lost:
    
        if (((X.C0dp) r0.get()).now() < (((com.facebook.prefs.shared.FbSharedPreferences) r0.get()).Av1(X.C4Bw.A0B, 0) + 1800000)) goto L7;
     */
    @Override // X.C4Ah
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Cxb() {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4Bw.Cxb():boolean");
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}
