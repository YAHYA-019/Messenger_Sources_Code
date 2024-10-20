package com.facebook.fbpay.platforms.messenger.config;

import X.0fH;
import X.11T;
import X.1BP;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1ED;
import X.4fE;
import X.4fW;
import X.4fY;
import X.AnonymousClass546;
import X.C05884fO;
import X.C05894fT;
import X.C05904fV;
import X.C05964ff;
import X.C05974fg;
import X.C06004fj;
import X.C06014fk;
import X.C15h;
import X.DBP;
import X.DKZ;
import X.G7G;
import X.J5i;
import android.content.Context;
import com.facebook.inject.FbInjector;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.reliability.UserFlowLogger;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: FBPayMessengerConfig.class */
public final class FBPayMessengerConfig {
    public final 1BP A04 = FbInjector.A00;
    public final 1Br A02 = 1Bq.A00(16432);
    public final 1Br A01 = 1Bq.A00(16467);
    public final 1Br A00 = 1Bq.A00(16442);
    public final AtomicReference A03 = new AtomicReference();

    /* JADX WARN: Type inference failed for: r0v70, types: [X.4fV, X.15h, java.lang.Object] */
    public void A00() {
        try {
            AtomicReference atomicReference = this.A03;
            if (atomicReference.get() == null) {
                synchronized (this) {
                    try {
                        if (atomicReference.get() == null) {
                            final 4fE r0 = (4fE) 1Bn.A0A(68126);
                            C05894fT c05894fT = new C05894fT((C05884fO) 1Bn.A0A(82204), r0, (Executor) this.A02.A00.get(), (Executor) this.A01.A00.get());
                            final ?? obj = new Object();
                            obj.A00 = c05894fT;
                            obj.A01 = false;
                            Context context = FbInjector.A03;
                            context.getClass();
                            Context applicationContext = context.getApplicationContext();
                            Context context2 = FbInjector.A03;
                            11T.A0A(context2);
                            C15h A00 = C05904fV.A00((C15h) new 4fW(context2));
                            final Context context3 = FbInjector.A03;
                            final 1ED r02 = (1ED) this.A00.A00.get();
                            final G7G g7g = new G7G(new DKZ(0), 28);
                            4fY r03 = 4fY.A00;
                            r03.getClass();
                            final G7G g7g2 = new G7G(r03, 29);
                            final G7G g7g3 = new G7G(FbInjector.A03, 6);
                            C15h A002 = C05904fV.A00(new C15h(context3, r0, r02, obj, g7g, g7g2, g7g3) { // from class: X.4fd
                                public final Context A00;
                                public final 4fE A01;
                                public final 1ED A02;
                                public final C15h A03;
                                public final C15h A04;
                                public final C15h A05;
                                public final C15h A06;

                                {
                                    this.A00 = context3;
                                    this.A04 = obj;
                                    this.A02 = r02;
                                    this.A01 = r0;
                                    this.A05 = g7g;
                                    this.A03 = g7g2;
                                    this.A06 = g7g3;
                                }

                                @Override // X.C15h
                                public /* bridge */ /* synthetic */ Object get() {
                                    C15h c15h = this.A04;
                                    F4T f4t = (F4T) c15h.get();
                                    1ED r04 = this.A02;
                                    4fE r05 = this.A01;
                                    Context context4 = this.A00;
                                    F8v f8v = new F8v(new EpO(context4, r05, r04), C06014fk.A0C(), f4t);
                                    Fur fur = new Fur(context4);
                                    EuV euV = new EuV(context4, fur);
                                    c15h.get();
                                    FHn fHn = new FHn(new Ehf(euV), (Ect) this.A06.get(), fur);
                                    Esb esb = (Esb) this.A05.get();
                                    return new FAC(context4, fHn, fHn, euV, fur, (F4S) this.A03.get(), f8v, esb, C06014fk.A0C(), (F4T) c15h.get());
                                }
                            });
                            final Context context4 = FbInjector.A03;
                            11T.A0A(context4);
                            C15h A003 = C05904fV.A00(new C15h(context4) { // from class: X.4fe
                                public final Context A00;
                                public final String A01 = 0Pz.A0W(C1ic.A18, "payments/paypal_close/");

                                {
                                    this.A00 = context4;
                                }

                                @Override // X.C15h
                                public /* bridge */ /* synthetic */ Object get() {
                                    04J A0B = 4YV.A0B();
                                    UserFlowLogger userFlowLogger = (UserFlowLogger) 1Bi.A03(16705);
                                    QuickPerformanceLogger quickPerformanceLogger = (QuickPerformanceLogger) 1Bi.A03(16520);
                                    Context context5 = this.A00;
                                    DKZ dkz = new DKZ(23);
                                    DKZ dkz2 = new DKZ(24);
                                    LZv lZv = new LZv(A0B, quickPerformanceLogger);
                                    KpW kpW = new KpW(userFlowLogger);
                                    LZu lZu = new LZu(A0B);
                                    String str = this.A01;
                                    11T.A0F(str, 0);
                                    return new Ks7(context5, lZv, kpW, lZu, dkz, dkz2, C05904fV.A00(new LuC(str)));
                                }
                            });
                            C15h A004 = C05904fV.A00((C15h) new G7G(FbInjector.A03, 8));
                            Context context5 = FbInjector.A03;
                            11T.A0A(context5);
                            C15h A005 = C05904fV.A00((C15h) new G7G(context5, 3));
                            C15h A006 = C05904fV.A00(new J5i(FbInjector.A03, 2));
                            Context context6 = FbInjector.A03;
                            11T.A0A(context6);
                            C15h A007 = C05904fV.A00((C15h) new G7G(context6, 7));
                            C15h A008 = C05904fV.A00(new C05964ff(FbInjector.A03, obj));
                            C15h A009 = C05904fV.A00((C15h) new G7G(FbInjector.A03, 5));
                            Context context7 = FbInjector.A03;
                            11T.A0A(context7);
                            C15h A0010 = C05904fV.A00((C15h) new G7G(context7, 2));
                            11T.A0A(FbInjector.A03);
                            C15h A0011 = C05904fV.A00(C05974fg.A00);
                            Context context8 = FbInjector.A03;
                            11T.A0A(context8);
                            G7G g7g4 = new G7G(context8, 4);
                            Context context9 = FbInjector.A03;
                            11T.A0A(context9);
                            DBP dbp = new DBP(context9, 3);
                            Context context10 = FbInjector.A03;
                            11T.A0A(context10);
                            C15h A0012 = C05904fV.A00((C15h) new G7G(context10, 18));
                            11T.A0A(FbInjector.A03);
                            C15h A0013 = C05904fV.A00(new C15h() { // from class: X.4fh
                                @Override // X.C15h
                                public /* bridge */ /* synthetic */ Object get() {
                                    return new Object();
                                }
                            });
                            11T.A0A(FbInjector.A03);
                            C15h A0014 = C05904fV.A00(new C15h() { // from class: X.4fi
                                @Override // X.C15h
                                public /* bridge */ /* synthetic */ Object get() {
                                    return new Object();
                                }
                            });
                            Context context11 = FbInjector.A03;
                            11T.A0A(context11);
                            atomicReference.set(new C06004fj(applicationContext, A002, A00, A003, A004, A005, A006, A007, A008, A009, obj, A0010, A0011, g7g4, dbp, A0012, A0013, A0014, new J5i(context11, 1)));
                        }
                    } catch (Throwable th) {
                        th = th;
                        throw th;
                    }
                }
            }
            C06004fj c06004fj = (C06004fj) atomicReference.get();
            if (c06004fj != null) {
                synchronized (C06014fk.class) {
                    try {
                        if (!C06014fk.A0E().A01) {
                            C06014fk A0E = C06014fk.A0E();
                            A0E.A01 = true;
                            A0E.A00 = c06004fj;
                        } else if (!C06014fk.A0E().A00.equals(c06004fj)) {
                            throw new Exception();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            }
        } catch (AnonymousClass546 e) {
            0fH.A0r("FBPayMessengerConfig", "FBPay config object is already initialized!", e);
        }
    }
}
