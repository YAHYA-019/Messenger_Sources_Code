package X;

import android.app.Activity;
import android.content.Context;
import android.database.Cursor;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.inbox.impressiontracker.model.InboxSourceLoggingData;
import com.facebook.messaging.inbox.units.StaticUnitConfig;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Set;

/* renamed from: X.2xd, reason: invalid class name */
/* loaded from: 2xd.class */
public final class C2xd extends C1F6 {
    public C2xd(1BO r302, int i) {
        super(r302);
    }

    public C1tf A00(Fragment fragment) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            C1tf c1tf = new C1tf(fragment);
            1Bn.A0K();
            FbInjector.A04(A01);
            return c1tf;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public C1vj A01(boolean z) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            C1vj c1vj = new C1vj(z);
            1Bn.A0K();
            FbInjector.A04(A01);
            return c1vj;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public BKW A02(Cursor cursor) {
        Context A00 = 1BO.A00(this);
        try {
            BKW bkw = new BKW(cursor);
            1Bn.A0K();
            FbInjector.A04(A00);
            return bkw;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    public 1Ph A03(1Pa r302) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            1Ph r0 = new 1Ph(r302, this);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2T6 A04(Context context, FbUserSession fbUserSession) {
        Context A00 = 1BO.A00(this);
        try {
            StaticUnitConfig staticUnitConfig = 2T6.A0E;
            2T6 r0 = new 2T6(context, fbUserSession, new 1De(this, new int[0]));
            1Bn.A0K();
            FbInjector.A04(A00);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A00);
            throw th;
        }
    }

    public 2YP A05(Context context, RecyclerView recyclerView, FbUserSession fbUserSession, 2S4 r305, 2S9 r306, 1Va r307) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2YP r0 = new 2YP(context, recyclerView, fbUserSession, r305, r306, r307);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2Y7 A06(Context context, RecyclerView recyclerView, FbUserSession fbUserSession, 1pK r305, 2S4 r306) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2Y7 r0 = new 2Y7(context, recyclerView, fbUserSession, r305, r306);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2YF A07(Context context, FbUserSession fbUserSession, 2YD r304, 2SI r305) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2YF r0 = new 2YF(context, fbUserSession, r304, r305);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2YH A08(2YG r302, 2YE r303) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2YH r0 = new 2YH(r302, r303);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2YD A09(InboxSourceLoggingData inboxSourceLoggingData) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2YD r0 = new 2YD(inboxSourceLoggingData);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2SZ A0A(Context context, 06Z r303, 2OO r304) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2SZ r0 = new 2SZ(context, r303, r304);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2Sc A0B(Context context, FbUserSession fbUserSession, 1pK r304, 2S4 r305, 1Va r306, List list) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2Sc r0 = new 2Sc(context, fbUserSession, r304, r305, r306, list);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2Pg A0C(Context context, FbUserSession fbUserSession, ThreadKey threadKey) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2Pg r0 = new 2Pg(context, fbUserSession, this, threadKey);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 8uJ A0D(Context context, 06Z r303, AY0 ay0, 7Mg r305) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            8uJ r0 = new 8uJ(context, r303, new 1De(this, new int[0]), ay0, r305);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2Lz A0E(Context context, 06Z r303, FbUserSession fbUserSession, 2LT r305) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2Lz r0 = new 2Lz(context, r303, fbUserSession, r305);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.3x1] */
    public C03083x1 A0F(final FbUserSession fbUserSession, final InterfaceC03063wz interfaceC03063wz) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            final 1De r0 = new 1De(this, new int[0]);
            ?? r02 = new C2iz(fbUserSession, r0, interfaceC03063wz) { // from class: X.3x1
                public final FbUserSession A00;
                public final 1Br A01;
                public final 1Br A02;
                public final 1Br A03;
                public final InterfaceC03063wz A04;
                public final 1De A05;

                {
                    11T.A0F(interfaceC03063wz, 2);
                    this.A05 = r0;
                    this.A00 = fbUserSession;
                    this.A01 = 1Bq.A00(17085);
                    this.A03 = 1Bu.A03(r0.A00, 33135);
                    this.A02 = 1Bq.A00(68571);
                    this.A04 = interfaceC03063wz;
                }

                public final void A00() {
                    ((C2j0) this.A01.A00.get()).A02(this);
                    ((C2dw) this.A03.A00.get()).A01(new 4OP(this));
                }

                public final void A01() {
                    ((C2j0) this.A01.A00.get()).A03(this);
                    ((C2dw) this.A03.A00.get()).A00();
                }

                public final void A02(String str, boolean z) {
                    0fH.A0g(str, "MontageRefreshOrchestrator", "refreshMontage [%s]");
                    if ("on_resume".equals(str)) {
                        0fH.A0g(str, "MontageRefreshOrchestrator", "Delaying load for [%s]");
                        return;
                    }
                    0fH.A0g(str, "MontageRefreshOrchestrator", "Start immediate load for [%s]");
                    InterfaceC03063wz interfaceC03063wz2 = this.A04;
                    this.A02.A00.get();
                    interfaceC03063wz2.D1t(new 5rA(this.A00, C5ah.PREFETCH_STORIES_ONLY, z, true));
                }

                @Override // X.C2iz
                public void AU9(C2j1 c2j1) {
                    11T.A0F(c2j1, 0);
                    c2j1.A00(33);
                    c2j1.A00(32);
                }

                @Override // X.C2iz
                public void AUA(C2mq c2mq) {
                    int i;
                    int i2;
                    11T.A0F(c2mq, 0);
                    int AU8 = c2mq.AU8();
                    if (AU8 == 32) {
                        C00j.A05("MontageRefreshOrchestrator.onRefreshMontageBusEvent", 1215271381);
                        try {
                            0fH.A0j("MontageRefreshOrchestrator", "onRefreshMontageBusEvent MontageOmnistoreInitializedEvent");
                            A02("initialize_omnistore", true);
                            i2 = 1342941754;
                        } catch (Throwable th) {
                            th = th;
                            i = 1676066245;
                            C00j.A01(i);
                            throw th;
                        }
                    } else {
                        if (AU8 != 33) {
                            return;
                        }
                        C00j.A05("MontageRefreshOrchestrator.onMontageThreadListUpdate", -1941248888);
                        try {
                            0fH.A0j("MontageRefreshOrchestrator", "onMontageThreadListUpdate MontageThreadListUpdateEvent");
                            A02("montage_thread_list_update", true);
                            i2 = 799242067;
                        } catch (Throwable th2) {
                            th = th2;
                            i = -271387422;
                            C00j.A01(i);
                            throw th;
                        }
                    }
                    C00j.A01(i2);
                }
            };
            1Bn.A0K();
            FbInjector.A04(A01);
            return r02;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2TJ A0G(Context context, FbUserSession fbUserSession) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2TJ r0 = new 2TJ(context, fbUserSession);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2Uu A0H(FbUserSession fbUserSession, 2Uq r303) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            Set set = 2Uu.A07;
            2Uu r0 = new 2Uu(fbUserSession, new 1De(this, new int[0]), r303);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2V5 A0I(Context context, FbUserSession fbUserSession, 2SI r304) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2V5 r0 = new 2V5(context, fbUserSession, r304);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 2Ur A0J(FbUserSession fbUserSession) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            2Ur r0 = new 2Ur(this, fbUserSession);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public BD0 A0K(DG6 dg6, DG7 dg7, ImmutableList immutableList, int i) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            BD0 bd0 = new BD0(this, dg6, dg7, immutableList, i);
            1Bn.A0K();
            FbInjector.A04(A01);
            return bd0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 1P5 A0L(1Og r302, 1OZ r303, C1Oc c1Oc) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            1P5 r0 = new 1P5(this, r302, r303, c1Oc);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 53T A0M(Activity activity) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            53T r0 = new 53T(activity);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    public 1Q7 A0N(String str) {
        Context A01 = FbInjector.A01();
        FbInjector.A04(this.A00.B92().Aqm());
        1Bn.A0M(this);
        try {
            1Q7 r0 = new 1Q7(str);
            1Bn.A0K();
            FbInjector.A04(A01);
            return r0;
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }
}
