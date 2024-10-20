package X;

import com.facebook.zero.sdk.fb4a.ZeroSDKServiceProvider;

/* renamed from: X.4Bt, reason: invalid class name */
/* loaded from: 4Bt.class */
public final class C4Bt implements C4Ah {
    public static final String __redex_internal_original_name = "ZeroSDKPeriodicPingConditionalWorkerInfo";
    public final 1Br A00 = 1Bq.A00(16650);
    public final C15h A01 = new C15h() { // from class: X.4Bu
        @Override // X.C15h
        public /* bridge */ /* synthetic */ Object get() {
            return 1Bn.A0A(98662);
        }
    };

    @Override // X.C4Ah
    public C15h Adc() {
        return this.A01;
    }

    @Override // X.C4Ah
    public long Aro() {
        return 600000L;
    }

    @Override // X.C4Ah
    public 1iF B4u() {
        return new 1iF(453586272481763L);
    }

    @Override // X.C4Ah
    public C4Ao B7c() {
        C4Ak c4Ak = new C4Ak();
        C4Ak.A00(c4Ak, C4Am.FOREGROUND);
        C4Ak.A00(c4Ak, C4Ay.CONNECTED);
        return c4Ak.A01();
    }

    @Override // X.C4Ah
    public 4CA BH6() {
        return 4CA.A01;
    }

    @Override // X.C4Ah
    public boolean Cxb() {
        boolean z = false;
        if (((ZeroSDKServiceProvider) this.A00.A00.get()).A00 != null) {
            z = true;
        }
        return z;
    }

    @Override // X.C4Ah
    public String getFriendlyName() {
        return __redex_internal_original_name;
    }
}
