package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.navigation.tabbar.state.NavigationConfig;
import com.facebook.navigation.tabbar.state.TabTag;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: F8M.class */
public final class F8M {
    public NavigationConfig A00;
    public ImmutableList A01;
    public final FbUserSession A02;
    public final C00i A03;
    public final 1De A04;
    public final 1Br A05;
    public final 1Br A06;
    public final ArrayList A07;

    public F8M(FbUserSession fbUserSession, 1De r303) {
        11T.A0F(fbUserSession, 2);
        this.A04 = r303;
        this.A02 = fbUserSession;
        this.A05 = AbG.A0M();
        this.A03 = 1Lm.A03(fbUserSession, r303.A00, 68153);
        this.A06 = 1Bq.A00(83605);
        this.A01 = 1BK.A0b();
        this.A07 = AnonymousClass001.A0s();
        A00();
    }

    private final void A00() {
        NavigationConfig navigationConfig;
        1Ql A08;
        ImmutableList.Builder A0h = 4YU.A0h();
        synchronized (this) {
            navigationConfig = this.A00;
            if (navigationConfig == null || AbL.A1H(this.A06)) {
                navigationConfig = (NavigationConfig) 1De.A00(this.A04, 68155);
                if (this.A02.A07) {
                    1Br.A04(this.A05).D0v("tabs", "NavigationConfig accessed with no user ID available.");
                } else {
                    this.A00 = navigationConfig;
                    if (navigationConfig != null) {
                        C00i c00i = this.A03;
                        if (c00i.get() != null) {
                            NavigationConfig navigationConfig2 = this.A00;
                            if (navigationConfig2 != null) {
                                ImmutableList immutableList = navigationConfig2.A00;
                                HashSet A0v = AnonymousClass001.A0v();
                                1Du it = immutableList.iterator();
                                while (it.hasNext()) {
                                    it.next();
                                    A0v.add(String.valueOf(190055527696468L));
                                }
                                ImmutableSet A07 = ImmutableSet.A07(((F6Z) c00i.get()).A02);
                                11T.A0A(A07);
                                Iterator it2 = A07.iterator();
                                while (it2.hasNext()) {
                                    String A0i = AnonymousClass001.A0i(it2);
                                    if (!A0v.contains(A0i)) {
                                        F6Z f6z = (F6Z) c00i.get();
                                        long parseLong = Long.parseLong(A0i);
                                        synchronized (f6z) {
                                            1G1 r0 = f6z.A00;
                                            if (!r0.A07) {
                                                String valueOf = String.valueOf(parseLong);
                                                Set set = f6z.A02;
                                                set.remove(valueOf);
                                                StringBuilder A0k = AnonymousClass001.A0k();
                                                Iterator it3 = set.iterator();
                                                boolean z = true;
                                                while (it3.hasNext()) {
                                                    String A0i2 = AnonymousClass001.A0i(it3);
                                                    if (z) {
                                                        z = false;
                                                    } else {
                                                        A0i2 = 0Pz.A0K(A0i2, ',');
                                                    }
                                                    A0k.append(A0i2);
                                                }
                                                String A02 = 11T.A02(A0k);
                                                if (A02.length() == 0) {
                                                    A08 = 1Br.A08(f6z.A01);
                                                    A08.Cdj(1G3.A00(F3C.A00(r0.A02), "hidden_tab"));
                                                } else {
                                                    A08 = 1Br.A08(f6z.A01);
                                                    A08.CaL(1G3.A00(F3C.A00(r0.A02), "hidden_tab"), A02);
                                                }
                                                A08.commit();
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        if (navigationConfig != null) {
            ImmutableList immutableList2 = navigationConfig.A00;
            int size = immutableList2.size();
            for (int i = 0; i < size; i++) {
                Object obj = immutableList2.get(i);
                if (!((F6Z) this.A03.get()).A02.contains(String.valueOf(190055527696468L))) {
                    A0h.m11011add(obj);
                }
            }
        }
        synchronized (this) {
            this.A01 = 1Fj.A01(A0h);
        }
    }

    public final TabTag A01(long j) {
        ImmutableList immutableList;
        synchronized (this) {
            if (this.A01.isEmpty()) {
                A00();
            }
            immutableList = this.A01;
        }
        1Du it = immutableList.iterator();
        while (it.hasNext()) {
            TabTag tabTag = (TabTag) it.next();
            if (190055527696468L == j) {
                return tabTag;
            }
        }
        return null;
    }
}
