package X;

import android.content.Context;
import com.facebook.auth.login.ui.AuthFragmentLogoViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.communitymessaging.mobileconfig.observer.GroupMCSubscriptionJob;
import com.facebook.messaging.games.plugins.threadlist.threaditemdata.GamesThreadItemDataImpl;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.notify.plugins.inbox.inboxlifecycle.InboxLifecycleClearNotificationImplementation;
import com.facebook.messaging.tincan.tincanoverwamsys.plugins.clearnotification.msysnotificationinboxlifecycle.MsysNotificationInboxLifecycleImplementation;
import com.facebook.messaging.tincan.tincanoverwamsys.plugins.dozemode.dozemode.AdvancedCryptoTransportDozeModeHandlerImplementation;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.Execution;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.facebook.wearable.common.comms.hera.shared.host.HeraHostSharedImplKt;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import kotlin.jvm.functions.Function1;

/* renamed from: X.4O4, reason: invalid class name */
/* loaded from: 4O4.class */
public abstract class C4O4 {
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0833, code lost:
    
        if (r0.AZk(2342168768862770130L) == false) goto L191;
     */
    /* JADX WARN: Type inference failed for: r0v123, types: [X.4WD, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v212, types: [X.3vX, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v433, types: [java.lang.Object, X.41V] */
    /* JADX WARN: Type inference failed for: r0v798, types: [com.facebook.graphservice.config.GraphQLServiceConfig, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v924, types: [com.facebook.graphservice.config.GraphQLConsistencyConfig, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r310v2, types: [java.lang.Object, X.3rE] */
    /* JADX WARN: Type inference failed for: r311v38, types: [java.lang.Object, X.3rE] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object A00(int r301, final X.1BO r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 5332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4O4.A00(int, X.1BO, java.lang.Object):java.lang.Object");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    public static java.lang.Object A01(int r301, X.1BO r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 30501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C4O4.A01(int, X.1BO, java.lang.Object):java.lang.Object");
    }

    public static Object A02(int i, 1BO r302, Object obj) {
        switch (i & 16383) {
            case 332:
                return Boolean.valueOf(((1vL) 1Bi.A03(99939)).A0X.AZl(36314738761736341L, true));
            case 333:
                return 1Bi.A03(16926);
            case 334:
                return 1Lo.A09((FbUserSession) obj, (1BY) null, 16905);
            case 335:
                return 1Bi.A03(16827);
            case 336:
                return new 2GP((2GO) 1Bn.A0G((1BY) null, 16945));
            case 337:
                return new Object();
            case 338:
                return new 5Gd();
            case 339:
                return new 1sF((1GU) 1Bi.A03(16458));
            case 340:
                return 1Bi.A03(33107);
            case 341:
                return new Object();
            case 342:
                return 1Bi.A03(16947);
            case 343:
                return new C1yc() { // from class: X.21Y
                    {
                        C2zm c2zm = new C15h() { // from class: X.2zm
                            @Override // X.C15h
                            public /* bridge */ /* synthetic */ Object get() {
                                return 1Bn.A0A(83430);
                            }
                        };
                    }

                    @Override // X.C1yc
                    public ThreadKey A06(C1yd c1yd) {
                        String A02 = c1yd.A02();
                        return C21a.A00(c1yd.A00(), c1yd.A01(), A02);
                    }

                    @Override // X.C1yc
                    public String A0A(C1yd c1yd, String str, boolean z) {
                        1qW r0 = c1yd.A01;
                        Boolean nullableBoolean = ((1qX) r0).mResultSet.getNullableBoolean(c1yd.A00, 75);
                        if (nullableBoolean != null && nullableBoolean.booleanValue()) {
                            Context A00 = FbInjector.A00();
                            11T.A0A(A00);
                            String str2 = C22a.A00;
                            if (!z) {
                                return 0CV.A0W(str, C22a.A01, str2);
                            }
                            str = 0Pz.A0j(A00.getString(2131957868), " ", str2);
                            11T.A0A(str);
                        }
                        return str;
                    }

                    @Override // X.C1yc
                    public boolean A0B() {
                        return true;
                    }
                };
            case 344:
                return 1Bn.A0A(33113);
            case 345:
                return new C1u5();
            case 346:
                return new AnonymousClass241(new 1De(r302, new int[0]));
            case 347:
                return new C21f((FbUserSession) obj, new 1De(r302, new int[0]));
            case 348:
                return new InterfaceC01343qr() { // from class: X.3r8
                    public static final String A01 = 09V.A00(179);
                    public MqttNetworkSessionPlugin A00 = MqttNetworkSessionPlugin.get();

                    @Override // X.InterfaceC01343qr
                    public String getHandlerName() {
                        return "MessengerMsysMqttPushHandler";
                    }

                    @Override // X.InterfaceC01343qr
                    public void onMessage(String str, byte[] bArr, int i2, long j, Long l) {
                        11T.A0F(str, 0);
                        11T.A0F(bArr, 1);
                        String A012 = 09V.A01(str);
                        if (A012 == null || !A012.equals(A01)) {
                            return;
                        }
                        0fH.A0d(str, Integer.valueOf(bArr.length), "MessengerMsysMqttPushHandler", "onMessage, topic=%s, len=%d");
                        MqttNetworkSessionPlugin mqttNetworkSessionPlugin = this.A00;
                        11T.A0D(mqttNetworkSessionPlugin);
                        Execution.executeAsync(new 3rL(mqttNetworkSessionPlugin, 09V.A00(179), bArr), null, 3);
                    }
                };
            case 349:
                return new Object();
            case 350:
                return new C1m9((FbUserSession) obj, new 1De(r302, new int[0]));
            case 351:
                return new Object();
            case 352:
                return new 1mL();
            case 353:
                return new C1xu();
            case 354:
                return new 2Tj((FbUserSession) obj, new 1De(r302, new int[0]));
            case 355:
                FbUserSession fbUserSession = (FbUserSession) obj;
                11T.A0F(fbUserSession, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession, (1BY) null, 16686));
            case 356:
                return new C21N((FbUserSession) obj, new 1De(r302, new int[0]));
            case 357:
                FbUserSession fbUserSession2 = (FbUserSession) obj;
                11T.A0F(fbUserSession2, 0);
                return 1Lo.A09(fbUserSession2, (1BY) null, 33129);
            case 358:
                return 1Bi.A03(33130);
            case 359:
                return 1Bi.A03(33131);
            case HeraHostSharedImplKt.DEFAULT_RECV_VIDEO_INIT_WIDTH /* 360 */:
                return new C2en((FbUserSession) obj, new 1De(r302, new int[0]));
            case 361:
                return new C2em((FbUserSession) obj, new 1De(r302, new int[0]));
            case 362:
                return new Object();
            case 363:
                return new Object();
            case 364:
                FbUserSession fbUserSession3 = (FbUserSession) obj;
                11T.A0F(fbUserSession3, 0);
                return 1Lo.A09(fbUserSession3, (1BY) null, 17061);
            case 365:
                return new C2eq((FbUserSession) obj);
            case 366:
                FbUserSession fbUserSession4 = (FbUserSession) obj;
                11T.A0F(fbUserSession4, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession4, (1BY) null, 16686));
            case 367:
                return new C2dw(new 1De(r302, new int[0]));
            case 368:
                return 1Bi.A03(33138);
            case 369:
                return new C1vy();
            case 370:
                return new C1vf();
            case 371:
                return new Object();
            case 372:
                return new Object();
            case 373:
                return new Object();
            case 374:
            case 377:
                return 1Bi.A03(33146);
            case AuthFragmentLogoViewGroup.LOGIN_GROUP_ANIM_DELAY_MS /* 375 */:
                return 1Bi.A03(33147);
            case 376:
                return new 1PZ();
            case 378:
                return new 1PY();
            case 379:
                return new 2qB();
            case 380:
                FbUserSession fbUserSession5 = (FbUserSession) obj;
                11T.A0F(fbUserSession5, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession5, (1BY) null, 16686));
            case 381:
                return new 1xP((FbUserSession) obj);
            case 382:
                return new Object();
            case 383:
                return new 1xU(new 1De(r302, new int[0]));
            case 384:
                return new C1xV(new 1De(r302, new int[0]));
            case 385:
                return new C12034yh();
            case 386:
                return new C1xi();
            case 387:
                return Boolean.valueOf(((FbSharedPreferences) 1Bi.A03(33013)).AZn(C1xg.A01, false));
            case 388:
                return new C2dm();
            case 389:
                return new Object();
            case 390:
                int i2 = 33157;
                if (((C2dl) 1Bn.A0A(66246)).A00()) {
                    i2 = 33156;
                }
                return 1Bi.A03(i2);
            case 391:
                return new 1wS();
            case 392:
                return new AdvancedCryptoTransportDozeModeHandlerImplementation(new 1De(r302, new int[0]));
            case 393:
                return new MsysNotificationInboxLifecycleImplementation(new 1De(r302, new int[0]));
            case 394:
                FbUserSession fbUserSession6 = (FbUserSession) obj;
                11T.A0F(fbUserSession6, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession6, (1BY) null, 16686));
            case 395:
                FbUserSession fbUserSession7 = (FbUserSession) obj;
                11T.A0F(fbUserSession7, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession7, (1BY) null, 16686));
            case 396:
                return new AnonymousClass225((FbUserSession) obj, new 1De(r302, new int[0]));
            case 397:
                return new AnonymousClass222((FbUserSession) obj, new 1De(r302, new int[0]));
            case 398:
                return new AnonymousClass228((FbUserSession) obj, new 1De(r302, new int[0]));
            case 399:
                FbUserSession fbUserSession8 = (FbUserSession) obj;
                11T.A0F(fbUserSession8, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession8, (1BY) null, 16686));
            case 400:
                return new C1zc((FbUserSession) obj, new 1De(r302, new int[0]));
            case 401:
                return new C20l(new 1De(r302, new int[0]));
            case 402:
                return new C20p((FbUserSession) obj, new 1De(r302, new int[0]));
            case 403:
                return new 21U((FbUserSession) obj, new 1De(r302, new int[0]));
            case 404:
                return new 21X((FbUserSession) obj, new 1De(r302, new int[0]));
            case 405:
                FbUserSession fbUserSession9 = (FbUserSession) obj;
                11T.A0F(fbUserSession9, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession9, (1BY) null, 16686));
            case 406:
                return new 22F((FbUserSession) obj, new 1De(r302, new int[0]));
            case 407:
                return new C22G((FbUserSession) obj, new 1De(r302, new int[0]));
            case 408:
                FbUserSession fbUserSession10 = (FbUserSession) obj;
                11T.A0F(fbUserSession10, 0);
                return new MailboxFeature((1Uj) 1Lo.A03((Context) null, fbUserSession10, 16686));
            case 409:
                FbUserSession fbUserSession11 = (FbUserSession) obj;
                11T.A0F(fbUserSession11, 0);
                return new MailboxFeature((1Uj) 1Lo.A03((Context) null, fbUserSession11, 16686));
            case 410:
                return new 20G(new 1De(r302, new int[0]));
            case 411:
                return 1Bn.A0G((1BY) null, 33180);
            case 412:
            case 414:
                return 1Bi.A03(33181);
            case 413:
                return new 20O((08O) 1Bi.A03(6));
            case 415:
                FbUserSession fbUserSession12 = (FbUserSession) obj;
                11T.A0F(fbUserSession12, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession12, (1BY) null, 16686));
            case 416:
                return new Object();
            case 417:
                return new 22J((FbUserSession) obj, new 1De(r302, new int[0]));
            case 418:
                return new GroupMCSubscriptionJob(new 1De(r302, new int[0]));
            case 419:
                FbUserSession fbUserSession13 = (FbUserSession) obj;
                11T.A0F(fbUserSession13, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession13, (1BY) null, 16686));
            case 420:
                return new CNT(new 1De(r302, new int[0]));
            case 421:
                return new 22W(new 1De(r302, new int[0]));
            case 422:
                return new MailboxFeature((1Uj) 1Lm.A07(1Fw.A04((1EZ) 1Bn.A0G((1BY) null, 16428)), (1BY) null, 16686));
            case 423:
                return new 21H((FbUserSession) obj, new 1De(r302, new int[0]));
            case 424:
                FbUserSession fbUserSession14 = (FbUserSession) obj;
                11T.A0F(fbUserSession14, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession14, (1BY) null, 16686));
            case 425:
                FbUserSession fbUserSession15 = (FbUserSession) obj;
                11T.A0F(fbUserSession15, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession15, (1BY) null, 16686));
            case 426:
                return new MailboxFeature((1Uj) 1Lm.A07(1Fw.A04((1EZ) 1Bn.A0G((1BY) null, 16428)), (1BY) null, 16686));
            case 427:
                return 10000L;
            case 428:
                return new C4Ep();
            case 429:
                return new 2SG((FbUserSession) obj);
            case 430:
                return new Object();
            case 431:
                final 1De r0 = new 1De(r302, new int[0]);
                final FbUserSession fbUserSession16 = (FbUserSession) obj;
                return new 2TB(fbUserSession16, r0) { // from class: X.2wo
                    public final 1Br A00;
                    public final FbUserSession A01;
                    public final 1De A02;
                    public final 1Br A03;

                    {
                        11T.A0F(fbUserSession16, 2);
                        this.A02 = r0;
                        this.A01 = fbUserSession16;
                        this.A03 = 1Bq.A00(16467);
                        this.A00 = 1Lm.A03(fbUserSession16, r0.A00, 17145);
                    }

                    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
                    public ListenableFuture BYj(String str) {
                        11T.A0F(str, 0);
                        ?? obj2 = new Object();
                        C2xk c2xk = new C2xk(obj2, 10);
                        Executor executor = (Executor) this.A03.A00.get();
                        C2wp c2wp = (C2wp) this.A00.A00.get();
                        5rL r02 = new 5rL(c2xk);
                        try {
                            2eH A00 = 2FP.A00(new D3a(c2wp, 3), C2wp.A01(c2wp, ((1yC) c2wp.A03.get()).A00((MailboxCallback) null, ImmutableList.of((Object) Long.valueOf(Long.parseLong(str))), ImmutableList.of(), ImmutableList.of(), -1, false)), (Executor) c2wp.A02.get());
                            A00.addListener(new 5rN(r02, c2wp, A00, str), executor);
                            return obj2;
                        } catch (NumberFormatException e) {
                            0fH.A0z(4YT.A00(234), "Could not parse user id \"%s\"!", e, new Object[]{str});
                            r02.C3k(ImmutableList.of());
                            return obj2;
                        }
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.common.util.concurrent.ListenableFuture, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
                    public ListenableFuture BYk(ImmutableList immutableList) {
                        final ?? obj2 = new Object();
                        C2wp c2wp = (C2wp) this.A00.A00.get();
                        C2wr c2wr = new C2wr(this) { // from class: X.2wq
                            public final /* synthetic */ C2wo A00;

                            {
                                this.A00 = this;
                            }

                            @Override // X.C2wr
                            public /* bridge */ /* synthetic */ void C3k(Object obj3) {
                                AbstractCollection abstractCollection = (AbstractCollection) obj3;
                                11T.A0F(abstractCollection, 0);
                                SettableFuture settableFuture = obj2;
                                int A00 = 02J.A00(C1A3.A1D(abstractCollection, 10));
                                if (A00 < 16) {
                                    A00 = 16;
                                }
                                LinkedHashMap linkedHashMap = new LinkedHashMap(A00);
                                Iterator it = abstractCollection.iterator();
                                while (it.hasNext()) {
                                    Object next = it.next();
                                    String str = ((MontageBucketPreview) next).A06.id;
                                    11T.A0A(str);
                                    linkedHashMap.put(Long.valueOf(Long.parseLong(str)), next);
                                }
                                settableFuture.set(ImmutableMap.copyOf((java.util.Map) linkedHashMap));
                            }
                        };
                        ((1yC) c2wp.A03.get()).A00((MailboxCallback) null, immutableList, ImmutableList.of(), ImmutableList.of(), -1, false).addResultCallback((Executor) this.A03.A00.get(), new Cxe(c2wp, c2wr, 8));
                        return obj2;
                    }

                    /* JADX WARN: Type inference failed for: r0v0, types: [X.1FX, java.lang.Object] */
                    public ImmutableList BYl(long j) {
                        ?? obj2 = new Object();
                        C2wp c2wp = (C2wp) this.A00.A00.get();
                        Long valueOf = Long.valueOf(j);
                        c2wp.A03(new 3ZW((Object) obj2, 0), ImmutableList.of((Object) valueOf), (Executor) this.A03.A00.get());
                        Object obj3 = obj2.get();
                        11T.A0A(obj3);
                        return (ImmutableList) obj3;
                    }

                    public void BYm(ImmutableSet immutableSet, Executor executor, Function1 function1) {
                        11T.A0F(executor, 2);
                        ((C2wp) this.A00.A00.get()).A03(new 3ZW(function1, 1), ImmutableList.copyOf((Collection) immutableSet), executor);
                    }
                };
            case 432:
                return new 2TA((FbUserSession) obj, new 1De(r302, new int[0]));
            case 433:
                FbUserSession fbUserSession17 = (FbUserSession) obj;
                11T.A0F(fbUserSession17, 0);
                return 1Lo.A09(fbUserSession17, (1BY) null, 33199);
            case 434:
                return new C2wn((FbUserSession) obj, new 1De(r302, new int[0]));
            case 435:
                FbUserSession fbUserSession18 = (FbUserSession) obj;
                11T.A0F(fbUserSession18, 0);
                return 1Lo.A09(fbUserSession18, (1BY) null, 33200);
            case 436:
                return new 2Tg(new 1De(r302, new int[0]));
            case 437:
                return new 2Tz();
            case 438:
                return new 2UL(new 1De(r302, new int[0]));
            case 439:
                return new 2Vh((FbUserSession) obj, new 1De(r302, new int[0]));
            case 440:
                return new Object();
            case 441:
                return new 2bB();
            case 442:
                return new C2b9() { // from class: X.2b8
                    public boolean A00;
                    public final 1Br A02 = 1BK.A0C();
                    public final 1Br A01 = 1Bq.A00(65837);

                    @Override // X.C2b9
                    public boolean BSv() {
                        return this.A00;
                    }
                };
            case 443:
                return new 2Wp(new 1De(r302, new int[0]));
            case 444:
                return new C4Nl((FbUserSession) obj, new 1De(r302, new int[0]));
            case 445:
                return new 2ZG((FbUserSession) obj, new 1De(r302, new int[0]));
            case 446:
                return new 2VK();
            case 447:
                return 1Bi.A03(17039);
            case 448:
                return 1Bn.A0G((1BY) null, 17041);
            case 449:
                return new 2ZT((FbUserSession) obj, new 1De(r302, new int[0]));
            case 450:
                return new 4Zn((FbUserSession) obj);
            case 451:
                return new InboxLifecycleClearNotificationImplementation(new 1De(r302, new int[0]));
            case 452:
                return new MailboxFeature((1Uj) 1Lm.A07(1Fw.A04((1EZ) 1Bn.A0G((1BY) null, 16428)), (1BY) null, 16686));
            case 453:
                return new Object() { // from class: X.2bw
                    public final 1CO A00 = (1CO) 1Bi.A03(16385);
                };
            case 454:
                FbUserSession fbUserSession19 = (FbUserSession) obj;
                11T.A0F(fbUserSession19, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession19, (1BY) null, 16686));
            case 455:
                return new Object();
            case 456:
                return new 2eC((FbUserSession) obj, new 1De(r302, new int[0]));
            case 457:
                return 1Bn.A0G((1BY) null, 49351);
            case 458:
                return 1Bi.A03(16823);
            case 459:
                return 1Lo.A07((FbUserSession) obj, 98705);
            case 460:
                return new 2hE((FbUserSession) obj, new 1De(r302, new int[0]));
            case 461:
                return new C2ij((FbUserSession) obj, new 1De(r302, new int[0]));
            case 462:
                return new C2j5(new 1De(r302, new int[0]));
            case 463:
                FbUserSession fbUserSession20 = (FbUserSession) obj;
                11T.A0F(fbUserSession20, 0);
                return new MailboxFeature((1Uj) 1Lo.A09(fbUserSession20, (1BY) null, 16686));
            case 464:
                return 1Bn.A0G((1BY) null, 16479);
            case 465:
                final 1De r02 = new 1De(r302, new int[0]);
                return new Object(r02) { // from class: X.2fv
                    public final 1Br A00;
                    public final 1De A01;

                    {
                        this.A01 = r02;
                        this.A00 = 1Bu.A03(r02.A00, 33247);
                    }
                };
            case 466:
                final 1De r03 = new 1De(r302, new int[0]);
                return new Object(r03) { // from class: X.2fw
                    public final 1De A00;
                    public final 1Br A01 = 1Bq.A00(67920);

                    {
                        this.A00 = r03;
                    }
                };
            case 467:
                return new C2fz((FbUserSession) obj, new 1De(r302, new int[0]));
            case 468:
                final 1De r04 = new 1De(r302, new int[0]);
                return new Object(r04) { // from class: X.2g0
                    public final 1De A00;
                    public final C01i A01 = C01g.A01(C2g1.A00);

                    {
                        this.A00 = r04;
                    }
                };
            case 469:
                final 1De r05 = new 1De(r302, new int[0]);
                return new Object(r05) { // from class: X.2g2
                    public final 1Br A00;
                    public final 1De A01;

                    {
                        this.A01 = r05;
                        this.A00 = 1Bu.A03(r05.A00, 33247);
                    }
                };
            case 470:
                return new GamesThreadItemDataImpl(new 1De(r302, new int[0]));
            case 471:
                return new C2g8(new 1De(r302, new int[0]));
            case 472:
                return new 2gG(new 1De(r302, new int[0]));
            case 473:
                return new 2gB(new 1De(r302, new int[0]));
            case 474:
                return new 2gW(new 1De(r302, new int[0]));
            case 475:
                return new C2i7();
            case 476:
                return new C4Sw();
            case 477:
                return new C2mb((FbUserSession) obj);
            case 478:
                return new 2oN((Context) obj);
            case 479:
                return new C2q5(new 1De(r302, new int[0]));
            case 480:
                return new C2rt((FbUserSession) obj);
            case 481:
                return new 4FY();
            case 482:
                return new C4Fs();
            case 483:
                return new C4Fu();
            case 484:
                return new C4Fw();
            case 485:
                return new C4Fx();
            case 486:
                return new 4HD();
            case 487:
                return new 4IL();
            case 488:
                return new Object();
            case 489:
                return 1Bi.A03(33256);
            case 490:
                return new C4Nu(r302, (FbUserSession) obj);
            case 491:
            case 492:
            case 493:
            case 494:
            case 495:
            case 496:
            case 497:
            case 498:
                return new C1F6(r302);
            default:
                throw new RuntimeException(AnonymousClass000.A00(1).concat(String.valueOf(i)));
        }
    }
}
