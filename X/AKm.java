package X;

import android.content.res.Resources;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.facebook.acra.constants.ActionId;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.presence.api.model.RichStatus;

/* loaded from: AKm.class */
public final class AKm extends C00q implements C00m {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AKm(int i, Object obj, Object obj2, Object obj3, boolean z) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A04 = z;
        this.A01 = obj2;
        this.A03 = obj3;
    }

    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass557 A0p = 7zL.A0p();
                1Iw r0 = (1Iw) this.A01;
                A0p.A08(r0.A0D(2131964714));
                int i = 2131964691;
                if (this.A04) {
                    i = 2131964690;
                }
                A0p.A07(r0.A0D(i));
                A0p.A05((MigColorScheme) this.A02);
                A0p.A01 = new IaR(this.A03, 9);
                AnonymousClass544 A00 = A0p.A00();
                11T.A0A(A00);
                return A00;
            case 1:
                1Iw r02 = (1Iw) this.A01;
                boolean z = this.A04;
                Object obj = this.A03;
                MigColorScheme migColorScheme = (MigColorScheme) this.A02;
                Resources A0E = 4YU.A0E(r02);
                String A0t = 4YU.A0t(A0E, 2131964714);
                int i2 = 2131964712;
                if (z) {
                    i2 = 2131964713;
                }
                return C9iQ.A02(new Cvn(obj, ActionId.APP_DID_FINISH_LAUNCHING), new C59y(migColorScheme, "screen_share_switch_transition_key", z, true), migColorScheme, A0t, null, A0E.getString(i2));
            case 2:
                final boolean z2 = this.A04;
                final C2lh c2lh = (C2lh) this.A01;
                final RichStatus richStatus = (RichStatus) this.A03;
                DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: X.9qf
                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onDestroy(LifecycleOwner lifecycleOwner) {
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public void onPause(LifecycleOwner lifecycleOwner) {
                        11T.A0F(lifecycleOwner, 0);
                        if (z2) {
                            c2lh.A01();
                            C9mK.A01(richStatus);
                        }
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
                    }

                    @Override // androidx.lifecycle.DefaultLifecycleObserver
                    public /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
                    }
                };
                Lifecycle lifecycle = (Lifecycle) this.A02;
                lifecycle.addObserver(defaultLifecycleObserver);
                return 7zL.A0T(AQe.A00(lifecycle, defaultLifecycleObserver, 25));
            default:
                C2k5 c2k5 = (C2k5) this.A02;
                boolean z3 = this.A04;
                final C9i8 c9i8 = (C9i8) this.A01;
                8Yh r03 = (8Yh) this.A03;
                C2sn A0U = 7zQ.A0U(c2k5.A05);
                if (z3) {
                    final F9E f9e = r03.A00;
                    A0U.A00(new 1LH(c9i8, f9e) { // from class: X.8Wf
                        public final C9i8 A00;
                        public final F9E A01;

                        {
                            1BL.A1F(c9i8, f9e);
                            this.A00 = c9i8;
                            this.A01 = f9e;
                        }

                        /* JADX WARN: Code restructure failed: missing block: B:6:0x008a, code lost:
                        
                            if (r0.length() == 0) goto L8;
                         */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public X.1LI A0s(X.C2k5 r302) {
                            /*
                                Method dump skipped, instructions count: 1342
                                To view this dump change 'Code comments level' option to 'DEBUG'
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C8Wf.A0s(X.2k5):X.1LI");
                        }
                    });
                }
                A0U.A00((1LI) r03.A01.invoke(r03.A00));
                return new 2cL((C1ro) null, (C1ro) null, (C1rp) null, (EnumC00743oh) null, A0U.A01, false);
        }
    }
}
