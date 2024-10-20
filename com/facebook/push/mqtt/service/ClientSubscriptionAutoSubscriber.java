package com.facebook.push.mqtt.service;

import X.0WH;
import X.0fH;
import X.1BQ;
import X.1Bi;
import X.1Hv;
import X.1I7;
import X.1Xa;
import X.2Ss;
import X.3dW;
import X.5Cg;
import X.C00i;
import X.C1mV;
import X.C1md;
import X.C1my;
import X.C1n3;
import X.C1u9;
import X.C2e5;
import android.content.Context;
import android.os.Handler;
import com.facebook.inject.FbInjector;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps$EntryFunction;
import java.util.Collection;
import java.util.Set;

/* loaded from: ClientSubscriptionAutoSubscriber.class */
public final class ClientSubscriptionAutoSubscriber implements 1Xa {
    public Context A00;
    public boolean A01;
    public final Handler A02;
    public final 1I7 A03;
    public final C00i A04;
    public final C00i A05;
    public final Set A06;
    public final C00i A07;

    public ClientSubscriptionAutoSubscriber() {
        Context A00 = FbInjector.A00();
        this.A00 = A00;
        this.A03 = (1I7) 1Hv.A02(A00, 65728);
        this.A04 = new 1BQ(16840);
        this.A02 = (Handler) 1Bi.A03(32826);
        1BQ r0 = new 1BQ(16791);
        this.A07 = r0;
        this.A05 = new 1BQ(100254);
        0WH r02 = new 0WH(0);
        this.A06 = r02;
        r02.addAll(((C1mV) r0.get()).A00());
    }

    private void A00(Boolean bool) {
        synchronized (this) {
            ImmutableMap A01 = ((C1mV) this.A07.get()).A01();
            C1md c1md = this.A01 ? C1md.A03 : C1md.A02;
            0fH.A0g(c1md, "ClientSubscriptionAutoSubscriber", "Minimum persistence needed for topics to be subscribed: %s");
            Set<K> keySet = C1my.A04(new Predicates.CompositionPredicate(new 3dW(c1md, 2), Maps$EntryFunction.A01), A01).keySet();
            Set set = this.A06;
            C2e5 A03 = C1n3.A03(keySet, set);
            C2e5 A032 = C1n3.A03(set, keySet);
            0fH.A0c(bool, A03, A032, "ClientSubscriptionAutoSubscriber", "applyAppActiveAndInjectedSubscriptions, %b, %s: %s ");
            if (bool != null) {
                final C1u9 c1u9 = (C1u9) this.A04.get();
                final boolean booleanValue = bool.booleanValue();
                final ImmutableList copyOf = ImmutableList.copyOf((Collection) A03);
                final ImmutableList copyOf2 = ImmutableList.copyOf((Collection) A032);
                0fH.A04(C1u9.class, Boolean.valueOf(booleanValue), A03, A032, "updateForegroundAndSubscriptionSync %b, %s, %s");
                if (2Ss.A00((2Ss) c1u9.A03.get()).AZk(72340198593006893L)) {
                    c1u9.A02.execute(new 5Cg(c1u9));
                }
                c1u9.A02.execute(new Runnable() { // from class: X.2e8
                    public static final String __redex_internal_original_name = "ClientSubscriptionManager$2";

                    @Override // java.lang.Runnable
                    public void run() {
                        C1u9 c1u92 = C1u9.this;
                        c1u92.A01 = booleanValue;
                        ImmutableList immutableList = copyOf;
                        ImmutableList immutableList2 = copyOf2;
                        C1u9.A00(c1u92, immutableList, immutableList2);
                        C1lp c1lp = c1u92.A00;
                        if (c1lp != null) {
                            c1lp.D6Y(immutableList, immutableList2, c1u92.A01);
                        } else {
                            0fH.A0A(C1u9.class, "MqttPushService is not ready.");
                        }
                    }
                });
            } else {
                final C1u9 c1u92 = (C1u9) this.A04.get();
                final ImmutableList copyOf3 = ImmutableList.copyOf((Collection) A03);
                final ImmutableList copyOf4 = ImmutableList.copyOf((Collection) A032);
                c1u92.A02.D3B(new Runnable() { // from class: X.2zs
                    public static final String __redex_internal_original_name = "ClientSubscriptionManager$3";

                    @Override // java.lang.Runnable
                    public void run() {
                        C1u9 c1u93 = C1u9.this;
                        ImmutableList immutableList = copyOf3;
                        ImmutableList immutableList2 = copyOf4;
                        C1u9.A00(c1u93, immutableList, immutableList2);
                        boolean z = c1u93.A01;
                        C1lp c1lp = c1u93.A00;
                        if (c1lp == null) {
                            if (immutableList.isEmpty()) {
                                return;
                            }
                            0fH.A0V(AnonymousClass001.A0X(c1u93), C1u9.class, "Pending %s subscriptions: %s", 2Ri.A0E(immutableList));
                        } else {
                            0fH.A04(C1u9.class, AnonymousClass001.A0X(c1u93), 2Ri.A0E(immutableList), 2Ri.A0E(immutableList2), "Sending %s subscriptions: +%s, -%s");
                            if (immutableList.isEmpty() && immutableList2.isEmpty()) {
                                return;
                            }
                            c1lp.D6Y(immutableList, immutableList2, z);
                        }
                    }
                });
            }
            set.clear();
            set.addAll(keySet);
        }
    }

    public void A01() {
        synchronized (this) {
            0fH.A0m("ClientSubscriptionAutoSubscriber", "applyInjectedSubscriptions");
            A00(null);
        }
    }

    public void onAppActive() {
        synchronized (this) {
            this.A01 = true;
            0fH.A0m("ClientSubscriptionAutoSubscriber", "onAppActive");
            A00(true);
        }
    }

    public void onAppPaused() {
    }

    public void onAppStopped() {
        synchronized (this) {
            this.A01 = false;
            0fH.A0m("ClientSubscriptionAutoSubscriber", "onAppStopped");
            A00(false);
        }
    }

    public void onDeviceActive() {
        synchronized (this) {
            0fH.A0m("ClientSubscriptionAutoSubscriber", "onDeviceActive");
            A01();
        }
    }

    public void onDeviceStopped() {
        synchronized (this) {
            0fH.A0m("ClientSubscriptionAutoSubscriber", "onDeviceStopped");
            A01();
        }
    }
}
