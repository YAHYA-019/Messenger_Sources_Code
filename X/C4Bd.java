package X;

import com.facebook.prefs.shared.FbSharedPreferences;

/* renamed from: X.4Bd, reason: invalid class name */
/* loaded from: 4Bd.class */
public final class C4Bd implements C4Ah {
    public static final String __redex_internal_original_name = "DiskSizeReporterConditionalWorkerInfo";
    public final C15h A01 = new C15h() { // from class: X.4Be
        @Override // X.C15h
        public /* bridge */ /* synthetic */ Object get() {
            return 1Bn.A0A(98682);
        }
    };
    public final 1Br A00 = 1Bu.A00(49268);

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A01;
    }

    @Override // X.C4Ah
    public long Aro() {
        return 86400000L;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(2290718554416090L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        return new C4Ak().A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        4oS r0 = (4oS) this.A00.A00.get();
        boolean z = false;
        if (((2yD) r0.A00.get()).Auy(36593220149970065L) == 2 && ((FbSharedPreferences) r0.A01.get()).Av1(4oS.A02, 0L) != System.currentTimeMillis() / 86400000) {
            z = true;
        }
        return z;
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return "DiskSizeReporterWorker";
    }
}
