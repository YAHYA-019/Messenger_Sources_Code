package X;

import com.facebook.acra.constants.ErrorReportingConstants;
import com.facebook.messaging.marketplace.plugins.core.eventsconfig.MarketplaceEventsConfigProviderImpl;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.facebook.xapp.messaging.events.common.data.RequestLoadMoreData;
import java.util.ArrayList;

/* loaded from: A78.class */
public final class A78 implements 1VB, 1VC {
    public static final java.util.Map A03 = 04R.A09(new 03Y[]{1BK.A1G("com.facebook.xapp.messaging.events.common.lifecycle.OnDestroy", 7zT.A0t(new 1VD[]{7zL.A0x(0)}, 0)), 1BK.A1G("com.facebook.xapp.messaging.events.common.lifecycle.OnInvisible", 7zT.A0t(new 1VD[]{7zL.A0x(0)}, 0)), 1BK.A1G("com.facebook.xapp.messaging.events.common.lifecycle.OnPause", 7zT.A0t(new 1VD[]{7zL.A0x(0)}, 0)), 1BK.A1G("com.facebook.xapp.messaging.threadlist.events.OnThreadListTailFetchLoading", 7zT.A0t(new 1VD[]{7zL.A0x(0)}, 0)), 1BK.A1G("com.facebook.xapp.messaging.events.common.data.RequestLoadMoreData", 7zT.A0t(new 1VD[]{7zL.A0x(0)}, 0)), 1BK.A1G("com.facebook.xapp.messaging.threadlist.events.OnThreadListRendered", 7zT.A0t(new 1VD[]{7zL.A0x(0)}, 0))});
    public A72 A00;
    public A77 A01;
    public final /* synthetic */ MarketplaceEventsConfigProviderImpl A02;

    public A78(MarketplaceEventsConfigProviderImpl marketplaceEventsConfigProviderImpl) {
        this.A02 = marketplaceEventsConfigProviderImpl;
        A72 a72 = new A72(marketplaceEventsConfigProviderImpl.A00, marketplaceEventsConfigProviderImpl.A01, marketplaceEventsConfigProviderImpl.A02, marketplaceEventsConfigProviderImpl.A03);
        AVD A01 = AVD.A01(marketplaceEventsConfigProviderImpl, 31);
        1VJ r0 = new 1VJ(a72);
        A01.invoke(r0);
        1VH r02 = r0.A00;
        ArrayList arrayList = r0.A02;
        11T.A0I(r02, "null cannot be cast to non-null type com.facebook.messaging.marketplace.plugins.core.eventsconfig.MarketplaceEventsGlobalConfig");
        this.A00 = (A72) r02;
        Object obj = arrayList.get(0);
        11T.A0I(obj, "null cannot be cast to non-null type com.facebook.messaging.marketplace.plugins.core.eventsconfig.MarketplaceUiThreadQueueConfig");
        this.A01 = (A77) obj;
    }

    public 1VO Al1(int i) {
        if (i == 0) {
            return this.A01.A00;
        }
        throw 1BK.A1F();
    }

    public int AoW() {
        return 1;
    }

    public 1VF AvX(String str) {
        11T.A0F(str, 0);
        return (1VF) A03.get(str);
    }

    public int B5i() {
        return 1;
    }

    public 1Vf BfG(int i) {
        if (i == 0) {
            return new 1Vf() { // from class: X.2jc
                public final 1Br A01 = 1Bq.A00(66219);
                public final 1Br A00 = 1Bq.A00(16616);

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                public void BQC(1Q5 r302, 1Vp r303, String str) {
                    1SG r307;
                    String str2;
                    int i2;
                    11T.A0F(r302, 0);
                    11T.A0F(str, 1);
                    switch (str.hashCode()) {
                        case -2099842703:
                            if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnPause")) {
                                0fH.A0j("TailFetchEventHandler", "onInboxFragmentOnPause");
                                r307 = (1SG) this.A01.A00.get();
                                str2 = "fragment_pause";
                                break;
                            }
                            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
                        case -1261602635:
                            if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnDestroy")) {
                                0fH.A0j("TailFetchEventHandler", "onInboxFragmentOnDestroy");
                                r307 = (1SG) this.A01.A00.get();
                                str2 = "fragment_destroy";
                                break;
                            }
                            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
                        case -812952152:
                            if (str.equals("com.facebook.xapp.messaging.events.common.lifecycle.OnInvisible")) {
                                0fH.A0j("TailFetchEventHandler", "onInboxFragmentOnInvisible");
                                1Od r0 = (1Od) this.A00.A00.get();
                                synchronized (r0) {
                                    i2 = r0.A0X;
                                }
                                1SG r02 = (1SG) this.A01.A00.get();
                                if (i2 > 0) {
                                    r02.A0R("leftSurface");
                                    return;
                                } else {
                                    r02.A0Q(ErrorReportingConstants.APP_BACKGROUNDED);
                                    return;
                                }
                            }
                            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
                        case 374703100:
                            if (str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadListTailFetchLoading")) {
                                0fH.A0j("TailFetchEventHandler", "onLoadingSpinnerVisible");
                                r307 = (1SG) this.A01.A00.get();
                                str2 = "loading_spinner_visible";
                                break;
                            }
                            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
                        case 744943903:
                            if (str.equals("com.facebook.xapp.messaging.threadlist.events.OnThreadListRendered")) {
                                0fH.A0j("TailFetchEventHandler", "OnThreadListRendered");
                                final 1Uy r03 = (1Uy) this.A01.A00.get();
                                r03.A05.execute(new Runnable() { // from class: X.2jd
                                    public static final String __redex_internal_original_name = "MPLTailFetchTracker$onThreadListRendered$1";

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        r03.A0M("thread_list");
                                    }
                                });
                                return;
                            }
                            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
                        case 1557027058:
                            if (str.equals("com.facebook.xapp.messaging.events.common.data.RequestLoadMoreData")) {
                                11T.A0F((RequestLoadMoreData) r302, 0);
                                0fH.A0j("TailFetchEventHandler", "onRequestLoadMoreData");
                                1Uy r04 = (1Uy) this.A01.A00.get();
                                if (!r04.A01) {
                                    0fH.A0j("MPLTailFetchTracker", "marker was already initialized!");
                                    return;
                                }
                                r04.A01 = false;
                                r04.A0E(5520569, 0);
                                r04.A0H(new C37q(r04, 0), ((C0dr) r04.A04.A00.get()).now());
                                r04.A0c("did_load_more", true);
                                r04.A0Z(UserFlowLoggerImpl.SOURCE_ANNOTATION, r04.A02 ? "user_scroll" : "auto_triggered");
                                r04.A0d("inbox_subtabs_enabled", ((2yD) r04.A03.A00.get()).AZk(36321795392946964L));
                                return;
                            }
                            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
                        default:
                            throw 0Pz.A05("Internal error, event not handled by this handler: ", str);
                    }
                    r307.A0K(str2);
                }
            };
        }
        throw 1BK.A1F();
    }
}
