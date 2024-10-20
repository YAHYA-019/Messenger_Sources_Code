package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.acra.constants.ActionId;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.threadview.plugins.quickpromotion.triggers.mediasend.ThreadViewMediaSendTrigger;
import com.facebook.messaging.wellbeing.enforcementfairness.plugins.hintcard.featurelimits.ReadOnlyFeatureLimitHintCardImplementation;
import com.facebook.messaging.wellbeing.reportingenforcement.plugins.featurelimit.inboxlifecyclesuspense.FeatureLimitsInboxLifecycleSuspenseListener;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.rtc.logging.persistence.impl.LogPersistenceAppJob;
import com.facebook.video.exoserviceclient.FbVpsController;
import com.facebook.xapp.messaging.map.HeterogeneousMap;
import com.google.common.collect.ImmutableList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.82y, reason: invalid class name */
/* loaded from: 82y.class */
public final class C82y extends C00q implements C00m {
    public final int A00;
    public final Object A01;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C82y(Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v627, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, X.1fL] */
    @Override // X.C00m
    public /* bridge */ /* synthetic */ Object invoke() {
        2yD r303;
        long j;
        String BD0;
        switch (this.A00) {
            case 0:
                return new AAw((9MS) ((6rM) this.A01).A0C.getValue(), (6oP) 1Bn.A0A(67790));
            case 1:
                6rM r0 = (6rM) this.A01;
                Context AWp = r0.AWp();
                74R r02 = (74R) 1Bu.A06(AWp, 65955);
                75Q r03 = (75Q) 1Bu.A06(AWp, 65934);
                Object value = r0.A0F.getValue();
                11T.A0A(value);
                return new C75c(r03, (74V) value, r0.AbO(), 74S.A00, (C74a) r0.Aum().getValue(), r02, r0.BF7().A0z());
            case 2:
                1Bn.A0A(67164);
                6rM r04 = (6rM) this.A01;
                Context AWp2 = r04.AWp();
                FbUserSession Alj = r04.Alj();
                return new AnonymousClass770(AWp2, Alj, r04.BF7(), r04.AbO(), r04.Ad4(), r04.Aoc(), r04.AwD(), new AVH(new C78n(AWp2, Alj), r04, 42));
            case 3:
                Object obj = this.A01;
                AVH avh = new AVH(C01g.A01(new AKO(obj, 30)), obj, 43);
                7Kt r05 = new 7Kt();
                avh.invoke(r05);
                return new 7LC(r05.A01, r05.A00);
            case 4:
                6rM r06 = (6rM) this.A01;
                MigColorScheme Ad3 = r06.Ad3();
                return new 72C(Ad3, r06.A06, r06.AwD(), r06.A0K, Ad3.B9T(), r06.BAl());
            case 5:
                6zO r07 = (6zO) this.A01;
                final 74E r08 = new 75N(r07.AxD());
                1pK Alf = r07.Alf();
                11T.A0F(Alf, 0);
                final C5xd c5xd = new C5xd((Fragment) Alf);
                final ThreadKey BF7 = r07.BF7();
                final HeterogeneousMap BF6 = r07.BF6();
                final 2Of AbO = r07.AbO();
                C75h c75h = new C75h(new 74E(c5xd, BF7, AbO, BF6, r08) { // from class: X.75f
                    public final 1pI A00;
                    public final ThreadKey A01;
                    public final 2Of A02;
                    public final HeterogeneousMap A03;
                    public final 74E A04;

                    {
                        11T.A0F(BF7, 2);
                        11T.A0F(BF6, 3);
                        11T.A0F(AbO, 4);
                        this.A00 = c5xd;
                        this.A01 = BF7;
                        this.A03 = BF6;
                        this.A02 = AbO;
                        this.A04 = r08;
                    }

                    public boolean BQh(5vW r302) {
                        11T.A0F(r302, 0);
                        5gC r09 = ((5vV) r302).A00;
                        boolean z = false;
                        if (r09 instanceof 5gC) {
                            String str = r09.A03;
                            if (C65h.A04.A05(str) != null || (((C22a) ((C1q7) C65h.A01.A00.get()).A01.get()).BXB(str) && C65h.A02(str) && C65h.A02(str))) {
                                z = true;
                            }
                        }
                        return z;
                    }

                    /* JADX WARN: Type inference failed for: r0v49, types: [X.34s, androidx.fragment.app.Fragment] */
                    public void BoE(Context context, View view, 5vW r304) {
                        11T.A0F(context, 0);
                        11T.A0G(view, 1, r304);
                        5gC r09 = ((5vV) r304).A00;
                        if (r09 instanceof 5gC) {
                            String str = r09.A03;
                            C65h c65h = C65h.A04;
                            String str2 = null;
                            boolean z = true;
                            if (!C65h.A00(c65h, this.A01, this.A03, str, true)) {
                                74E r010 = this.A04;
                                if (r010.BQh(r304)) {
                                    r010.BoE(context, view, r304);
                                    return;
                                }
                                return;
                            }
                            C5fu c5fu = (C5fu) r09;
                            String str3 = c5fu.A09;
                            String A07 = c65h.A07(str);
                            if (A07 != null) {
                                Integer A05 = c65h.A05(str);
                                if (A05 == null) {
                                    z = false;
                                }
                                String str4 = null;
                                if (z) {
                                    C5fr c5fr = c5fu.A05;
                                    str2 = c5fr.A0A;
                                    if (str2 == null) {
                                        str2 = c5fr.A07;
                                        11T.A0A(str2);
                                    }
                                }
                                if (!c5fu.A0H) {
                                    C5fr c5fr2 = c5fu.A05;
                                    str4 = c5fr2.A0A;
                                    if (str4 == null) {
                                        str4 = c5fr2.A07;
                                        11T.A0A(str4);
                                    }
                                }
                                ?? A00 = 3Gc.A00(z ? 3EW.A01 : 3EW.A02, A05, A07, str3, str2, str4, false);
                                A00.A0W = this.A02;
                                this.A00.Czy((Fragment) A00, "emoji_pong_fragment_tag");
                            }
                        }
                    }
                }, r08);
                C01i Awt = r07.Awt();
                return new 74F(c75h, Awt != null ? (C75c) Awt.getValue() : null, false, false, false);
            case 6:
                return new 7Js((7Jr) 1Bi.A03(66530), (C70i) ((C6yq) this.A01).A01.getValue());
            case 7:
                final C70z c70z = new C70z(((Context) this.A01).getResources().getDimensionPixelSize(2132279320));
                final C70z c70z2 = new C70z(0);
                final AnonymousClass710 anonymousClass710 = AnonymousClass710.A00;
                final AnonymousClass711 anonymousClass711 = new AnonymousClass711();
                return new AnonymousClass713(c70z, c70z2, anonymousClass710, anonymousClass711) { // from class: X.712
                    public final C2pe A00;
                    public final C2pe A01;
                    public final AnonymousClass710 A02;
                    public final AnonymousClass711 A03;

                    {
                        11T.A0F(anonymousClass710, 3);
                        this.A00 = c70z;
                        this.A01 = c70z2;
                        this.A02 = anonymousClass710;
                        this.A03 = anonymousClass711;
                    }

                    @Override // X.AnonymousClass713
                    public int Chw(Resources resources, C5fv c5fv, 5vW r304, List list, int i) {
                        C2pe c2pe;
                        11T.A0H(resources, c5fv);
                        11T.A0F(list, 3);
                        if (!5vA.A00(c5fv)) {
                            5vA.A00(c5fv);
                            if (!this.A03.A01(c5fv, i)) {
                                c2pe = this.A01;
                                return c2pe.Chq(resources);
                            }
                        }
                        c2pe = this.A00;
                        return c2pe.Chq(resources);
                    }
                };
            case 8:
                return 1Fw.A04((1EZ) 1Bn.A0E((Context) null, ((C6od) this.A01).A00.A00, 16428)).A02;
            case 9:
                ((5eN) this.A01).Biv();
                return 04S.A00;
            case 10:
                r303 = (2yD) ((C9J9) ((C6mh) this.A01).A00.A00.get()).A00.A00.get();
                j = 36322117515560033L;
                break;
            case 11:
                r303 = (2yD) ((C9J9) ((C6mh) this.A01).A00.A00.get()).A00.A00.get();
                j = 36322117515494496L;
                break;
            case 12:
                return 1Fw.A04((1EZ) 1Bn.A0E((Context) null, ((7KO) this.A01).A01.A00, 16428)).A02;
            case 13:
                54D r09 = (54D) this.A01;
                C00m c00m = r09.A03;
                if (c00m != null) {
                    c00m.invoke();
                }
                r09.A00 = null;
                ((2JN) r09.A04.A00.get()).A02(r09.A05);
                return 04S.A00;
            case 14:
                return Boolean.valueOf(((2yD) ((5yX) this.A01).A00.A00.get()).AZk(36326502677108384L));
            case 15:
                return Boolean.valueOf(((2yD) ((5yX) this.A01).A00.A00.get()).AZk(36326502677173921L));
            case 16:
                5I9 r010 = (5I9) this.A01;
                Future future = r010.A00;
                if (future == null || future.isDone()) {
                    r010.A00 = ((ExecutorService) r010.A03.A00.get()).submit((Runnable) new 5IB(r010));
                }
                return 04S.A00;
            case 17:
                return new KfE((4gB) this.A01);
            case 18:
                return new KfF((4gB) this.A01);
            case 19:
                return new HWB((4gB) this.A01);
            case 20:
                return new KfG((4gB) this.A01);
            case 21:
                return new HrL((4gB) this.A01);
            case 22:
                return new HWC((4gB) this.A01);
            case 23:
                return new Kol((4gB) this.A01);
            case 24:
                AbR abR = (AbR) 1Bn.A0A(1144);
                6Kp r011 = (6Kp) this.A01;
                return abR.A0w(r011.A06, r011.A02);
            case 25:
                6Hm r012 = (6Hm) this.A01;
                Set set = 6Hm.A0M;
                Context context = r012.A0D;
                1Bu.A06(context, 66683);
                return new C2j8(context, r012.A0E);
            case 26:
                return new 7OZ((ThreadViewMediaSendTrigger) this.A01);
            case 27:
                7WP r013 = (7WP) this.A01;
                return 7WP.A0L((C88P) null, r013, r013.A05, r013.A01, r013.A07);
            case 28:
                return this.A01;
            case 29:
                1Bn.A0A(67154);
                ReadOnlyFeatureLimitHintCardImplementation readOnlyFeatureLimitHintCardImplementation = (ReadOnlyFeatureLimitHintCardImplementation) this.A01;
                List list = ReadOnlyFeatureLimitHintCardImplementation.A0D;
                return new 6CD(readOnlyFeatureLimitHintCardImplementation.A01);
            case 30:
                return 2Zl.A00((2Zl) ((FeatureLimitsInboxLifecycleSuspenseListener) this.A01).A03.A00.get()).AZk(36318453909172833L) ? 1Bi.A03(16520) : new Object();
            case 31:
                7Fo r014 = (7Fo) this.A01;
                Context context2 = r014.A01;
                return ((C07474jz) 1Lm.A05(context2, 1Fw.A04((1EZ) 1Bu.A06(context2, 16428)), 65870)).A00(r014.A06);
            case 32:
                C6ns c6ns = (C6ns) this.A01;
                c6ns.A01.flowEndSuccess(c6ns.A00);
                c6ns.A00 = 0L;
                return 04S.A00;
            case 33:
                return new C3X2(((C6gg) this.A01).A00.AP5(), true);
            case 34:
                Object value2 = ((C6gc) this.A01).A03.getValue();
                11T.A0A(value2);
                1Fi A00 = C6ge.A00((Context) value2).A00("BizAppBusinessScopingAsset");
                11T.A0A(A00);
                return new C6gg(A00);
            case 35:
                Object value3 = ((C6gc) this.A01).A03.getValue();
                11T.A0A(value3);
                1Fi A002 = C6ge.A00((Context) value3).A00("BizAppConfig");
                11T.A0A(A002);
                return new C6gg(A002);
            case 36:
                Object value4 = ((C6gc) this.A01).A03.getValue();
                11T.A0A(value4);
                1Fi A003 = C6ge.A00((Context) value4).A00("BizAppBusinessScopingGlobalScope");
                11T.A0A(A003);
                return new C6gg(A003);
            case 37:
                Object value5 = ((C6gc) this.A01).A03.getValue();
                11T.A0A(value5);
                1Fi A004 = C6ge.A00((Context) value5).A00("BizAppMbsTools");
                11T.A0A(A004);
                return new C6gg(A004);
            case 38:
                return ((C6gR) this.A01).A03;
            case 39:
                return ((C6gR) this.A01).A04;
            case 40:
                return new 51L((04J) ((LogPersistenceAppJob) this.A01).A03.A00.get());
            case 41:
                BD0 = ((FbSharedPreferences) ((FbVpsController) this.A01).A0B.A00.get()).BD0((1G2) 1G0.A04.A0D("language_switcher/").A0D("application_locale"));
                if (BD0 == null) {
                    BD0 = "";
                }
                if (BD0.length() == 0) {
                    String language = Resources.getSystem().getConfiguration().locale.getLanguage();
                    11T.A0A(language);
                    return language;
                }
                return BD0;
            case 42:
                return Boolean.valueOf(!((FbSharedPreferences) 9Ev.A00.A00.get()).AZn(9GT.A08, true));
            case 43:
                return Integer.valueOf((int) (((C4A7) ((FbVpsController) this.A01).A05.A00.get()).A01() * 100.0f));
            case ActionId.ON_FRAGMENT_CREATE_END /* 44 */:
                int intValue = ((C4A7) ((FbVpsController) this.A01).A05.A00.get()).A02().intValue();
                boolean z = true;
                if (intValue != 4 && intValue != 3 && intValue != 5 && intValue != 6) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ActionId.ON_CREATE_VIEW_END /* 45 */:
                return Double.valueOf(((float) ((C08424mw) ((FbVpsController) this.A01).A08.A00.get()).A00().A01.availMem) / 8);
            case 46:
                ?? obj2 = new Object();
                obj2.A04(((FbVpsController) this.A01).A01);
                return obj2;
            case ActionId.ON_START_END /* 47 */:
                return new AE7((6Un) this.A01);
            case ActionId.QUEUED /* 48 */:
                ImmutableList.Builder builder = ImmutableList.builder();
                7H8 r015 = (7H8) this.A01;
                11T.A0D(builder);
                r015.A00(builder);
                return builder.build();
            default:
                6xF r016 = (6xF) this.A01;
                Thread thread = 6xF.A0K;
                BD0 = Boolean.valueOf(((2yD) r016.A04.A00.get()).AZk(36324084610649529L));
                return BD0;
        }
        return r303.AZr(1GD.A07, j) ? "MSYS" : "GQL";
    }
}
