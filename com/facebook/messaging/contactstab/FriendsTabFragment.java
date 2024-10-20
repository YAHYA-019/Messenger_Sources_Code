package com.facebook.messaging.contactstab;

import X.04J;
import X.06Z;
import X.0FI;
import X.0NL;
import X.0PY;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BO;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bf;
import X.1Bi;
import X.1Bn;
import X.1HH;
import X.1NK;
import X.1UD;
import X.1UG;
import X.1ZG;
import X.1fF;
import X.1iF;
import X.1pI;
import X.1pK;
import X.1vD;
import X.1vZ;
import X.2Og;
import X.2Qw;
import X.2R0;
import X.2S1;
import X.2Wo;
import X.2YJ;
import X.6Bf;
import X.6uV;
import X.7Mg;
import X.8Cl;
import X.8HC;
import X.8uK;
import X.9Hw;
import X.9Hx;
import X.9Hy;
import X.9I0;
import X.9Ve;
import X.9Zd;
import X.9aH;
import X.9tC;
import X.9wM;
import X.9zS;
import X.AXj;
import X.AYQ;
import X.Aa0;
import X.Aa5;
import X.Aa6;
import X.Aaj;
import X.Aav;
import X.AbE;
import X.AbstractC00603o4;
import X.Bv2;
import X.C00i;
import X.C04I;
import X.C09s;
import X.C1560Ale;
import X.C1F6;
import X.C1sy;
import X.C1ub;
import X.C2fx;
import X.C2rx;
import X.C2xg;
import X.C3Z5;
import X.C3Z6;
import X.C3lu;
import X.C4s1;
import X.C5cv;
import X.C5d0;
import X.C7k7;
import X.C7nw;
import X.C8c;
import X.C8rM;
import X.C9Jr;
import X.C9gB;
import X.C9kj;
import X.C9kr;
import X.C9u3;
import X.C9vk;
import X.C9vp;
import X.C9x6;
import X.CJ7;
import X.Ctn;
import X.Cto;
import X.Ctp;
import X.DEh;
import X.DEi;
import X.DJb;
import X.HGG;
import X.IAa;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import androidx.viewpager.widget.ViewPager;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.contactstab.FriendsTabFragment;
import com.facebook.messaging.contactstab.intf.FriendsSubTabTag;
import com.facebook.messaging.highlightstab.logging.HTSessionManager;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharing.contentdiscovery.bottomsheet.LifeEventsBottomSheetDialogFragment;
import com.facebook.prefs.shared.FbSharedPreferences;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* loaded from: FriendsTabFragment.class */
public final class FriendsTabFragment extends 1pK implements 2Og, 2S1, 1vZ, CallerContextable {
    public ViewPager A02;
    public FbUserSession A03;
    public 1pI A04;
    public 1BY A05;
    public C00i A06;
    public C00i A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public C00i A0B;
    public C00i A0C;
    public C00i A0D;
    public C00i A0E;
    public 2YJ A0G;
    public FriendsSubTabTag A0H;
    public AXj A0I;
    public Aav A0J;
    public C3lu A0M;
    public 2R0 A0N;
    public 9Zd A0O;
    public HGG A0P;
    public C9Jr A0Q;
    public Bv2 A0R;
    public CJ7 A0S;
    public C2rx A0T;
    public ImmutableList A0U;
    public C00i A0Y;
    public C00i A0Z;
    public 8Cl A0a;
    public C7k7 A0b;
    public C8rM A0c;
    public final C00i A0e;
    public final C00i A0f;
    public final C00i A0l;
    public final C00i A0t;
    public final C00i A0u;
    public final C00i A0w;
    public final C00i A0y;
    public final C00i A13;
    public final C00i A14;
    public final C00i A18;
    public final C00i A19;
    public final C00i A1D;
    public final C00i A1E;
    public final C00i A1N;
    public final C00i A1R;
    public final C00i A1S;
    public Aa0 mListener;
    public final C00i A10 = new 1BQ(68045);
    public final C00i A1P = new 1BQ(67634);
    public final C00i A0h = new 1BQ(68563);
    public final C00i A1A = new 1HH(this, 67720);
    public final C00i A0s = new 1BQ(68675);
    public final C00i A11 = new 1BQ(84065);
    public final C00i A0k = new 1BV(this, 32840);
    public final C00i A0z = new 1BQ(67920);
    public final C00i A0o = new 1BQ(68561);
    public final C00i A1Q = new 1BQ(49322);
    public final C00i A0j = new 1BQ(16922);
    public final C00i A1M = new 1BQ(99390);
    public final C00i A12 = new 1BV(this, 82653);
    public final C00i A1C = new 1BQ(16461);
    public final C00i A0i = new 1BQ(33013);
    public final C00i A0v = new 1BQ(16385);
    public final C00i A0x = new 1BV(this, 68455);
    public final C00i A16 = new 1BQ(65723);
    public final C00i A17 = new 1BQ(67984);
    public final C00i A0g = new 1BV(this, 68674);
    public final C00i A1B = new 1BQ(16456);
    public final C00i A1O = new 1BQ(16511);
    public final C00i A0r = new 1BQ(84184);
    public final C00i A0q = new 1BQ(84188);
    public final C00i A0n = new 1BQ(68110);
    public final C00i A0m = new 1BQ(68355);
    public final 1fF A1I = (1fF) 1Bi.A03(66655);
    public final C00i A0p = new 1BQ(84183);
    public final C00i A15 = new 1BQ(16477);
    public final C00i A0d = new 1BQ(16458);
    public final 9Hx A1W = new 9Hx(this);
    public final 0PY A1L = new 0PY() { // from class: X.9r4
        public void CAd(int i) {
        }

        public void CAe(int i, float f, int i2) {
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment, X.1pK] */
        public void CAf(int i) {
            ?? r0 = FriendsTabFragment.this;
            FriendsSubTabTag friendsSubTabTag = (FriendsSubTabTag) r0.A0U.get(i);
            r0.A0H = friendsSubTabTag;
            FriendsSubTabTag friendsSubTabTag2 = FriendsSubTabTag.A06;
            6Bf r02 = (6Bf) r0.A0C.get();
            if (friendsSubTabTag == friendsSubTabTag2) {
                r02.A03(r0.A1P(), r0.A0V == 0S2.A01 ? AbstractC00603o4.A00(305) : "friends_tab", ((9aH) r0.A10.get()).A01(r0.getContext(), FriendsTabFragment.A03(r0)));
            } else {
                r02.A01();
            }
            FriendsTabFragment.A09(r0);
            AXj aXj = r0.A0I;
            if (aXj != null) {
                aXj.CJI();
            }
        }
    };
    public final AXj A1Z = new AXj() { // from class: X.9tu
        @Override // X.AXj
        public void CJI() {
            AXj aXj = FriendsTabFragment.this.A0I;
            if (aXj != null) {
                aXj.CJI();
            }
        }
    };
    public final AYQ A1d = new 9zS(this);
    public final 9Hy A1X = new 9Hy(this);
    public final C9kr A1F = new C9kr(this);
    public final Aa5 A1H = new 9wM(this);
    public final 9I0 A1G = new 9I0(this);
    public final DJb A1c = new Ctp(this);
    public final Map A1K = new HashMap();
    public final Map A1J = new HashMap();
    public C9gB A0L = null;
    public int A01 = 0;
    public C2xg A0F = new C2xg((LifecycleOwner) this, (9Ve) null, false);
    public C9u3 A0K = new C9u3(new C9kj());
    public boolean A0X = false;
    public ArrayList A0W = new ArrayList();
    public int A00 = -1;
    public final C5cv A1Y = new C5cv() { // from class: X.9ts
        /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
        @Override // X.C5cv
        public void CGE() {
            ?? r0 = FriendsTabFragment.this;
            if (r0.mDetached) {
                return;
            }
            7zT.A1P((FriendsTabFragment) r0);
        }
    };
    public final 9Hw A1V = new 9Hw(this);
    public final C1sy A1e = new C1sy() { // from class: X.9zc
        /* JADX WARN: Code restructure failed: missing block: B:4:0x004f, code lost:
        
            if (r0.get() != r0.A06.get()) goto L6;
         */
        @Override // X.C1sy
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void CfN() {
            /*
                r301 = this;
                r0 = r301
                com.facebook.messaging.contactstab.FriendsTabFragment r0 = com.facebook.messaging.contactstab.FriendsTabFragment.this
                r302 = r0
                r0 = 16979(0x4253, float:2.3793E-41)
                r303 = r0
                r0 = r302
                X.1BY r0 = r0.A05
                r1 = r303
                X.1BV r0 = X.1BV.A01(r0, r1)
                r304 = r0
                r0 = r302
                X.00i r0 = r0.A0v
                r305 = r0
                r0 = r305
                X.2yD r0 = X.1BK.A0N(r0)
                r306 = r0
                r0 = 36325922856719425(0x810e3c00035441, double:3.035998115115485E-306)
                r307 = r0
                r0 = r306
                r1 = r307
                boolean r0 = r0.AZk(r1)
                r309 = r0
                r0 = r309
                if (r0 == 0) goto L52
                r0 = r304
                java.lang.Object r0 = r0.get()
                r306 = r0
                r0 = r302
                X.00i r0 = r0.A06
                java.lang.Object r0 = r0.get()
                r310 = r0
                r0 = 0
                r309 = r0
                r0 = 0
                r305 = r0
                r0 = r306
                r1 = r310
                if (r0 == r1) goto L55
            L52:
                r0 = 1
                r309 = r0
            L55:
                r0 = r302
                r1 = r304
                r0.A06 = r1
                r0 = r309
                if (r0 == 0) goto L63
                r0 = r302
                com.facebook.messaging.contactstab.FriendsTabFragment.A09(r0)
            L63:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C9zc.CfN():void");
        }
    };
    public final DEh A1T = new DEh() { // from class: X.9t9
        @Override // X.DEh
        public final void C2d(8LD r302, ThreadKey threadKey, int i) {
            1vZ r0 = FriendsTabFragment.this;
            11T.A0F(r302, 0);
            C9d9.A00(r0.getContext(), r0.mFragmentManager, r302, threadKey, r302.A0C ? 0S2.A15 : r302.A0B ? 0S2.A1G : 0S2.A0u, i);
        }
    };
    public final Aaj A1a = new C9vk(this);
    public final DEi A1U = new 9tC(this);
    public final Aa6 A1b = new C9x6(this);
    public Integer A0V = null;

    /* JADX WARN: Multi-variable type inference failed */
    public FriendsTabFragment(1BO r302) {
        this.A1S = new 1BV(this.A05, 902);
        this.A0w = new 1BV(this.A05, 115056);
        this.A0y = new 1BV(this.A05, 115935);
        this.A14 = new 1BV(this.A05, 68367);
        this.A0e = new 1BV(this.A05, 68559);
        this.A0u = new 1BV(this.A05, 907);
        this.A1E = new 1BV(this.A05, 98449);
        this.A1D = new 1BV(this.A05, 66170);
        this.A1R = new 1BV(this.A05, 903);
        this.A0t = new 1BV(this.A05, 66804);
        this.A19 = new 1BV(this.A05, 82461);
        this.A13 = new 1BV(this.A05, 50185);
        this.A0l = new 1BV(this.A05, 68564);
        this.A0f = new 1BV(this.A05, 65954);
        this.A18 = new 1BV(this.A05, 68357);
        this.A1N = new 1BV(this.A05, 68096);
        this.A06 = new 1BV(this.A05, 16979);
        this.A05 = new 1BY(r302);
    }

    public static int A03(FriendsTabFragment friendsTabFragment) {
        ViewPager viewPager = friendsTabFragment.A02;
        return viewPager != null ? viewPager.getWidth() : ((C4s1) friendsTabFragment.A1Q.get()).A08();
    }

    public static void A06(FriendsTabFragment friendsTabFragment) {
        Integer num = friendsTabFragment.A0V;
        if (num == 0S2.A01 || ((num == 0S2.A0C && ((C2fx) friendsTabFragment.A0z.get()).A01()) || (friendsTabFragment.A0V == 0S2.A0N && C1ub.A05()))) {
            ((C5d0) friendsTabFragment.A0x.get()).A01(friendsTabFragment.A1Y);
        }
    }

    public static void A07(FriendsTabFragment friendsTabFragment) {
        Aav aav = friendsTabFragment.A0J;
        if (aav != null) {
            aav.D2b(friendsTabFragment.A03);
        } else {
            C9gB c9gB = friendsTabFragment.A0L;
            if (c9gB != null) {
                C9gB.A00(c9gB).A00.A00.stop();
            }
        }
        Integer num = friendsTabFragment.A0V;
        if (num == 0S2.A01 || ((num == 0S2.A0C && ((C2fx) friendsTabFragment.A0z.get()).A01()) || (friendsTabFragment.A0V == 0S2.A0N && C1ub.A05()))) {
            ((C5d0) friendsTabFragment.A0x.get()).A00();
        }
        friendsTabFragment.A0G.A05(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A08(FriendsTabFragment friendsTabFragment) {
        ((6Bf) friendsTabFragment.A0C.get()).A03(friendsTabFragment.A1P(), friendsTabFragment.A0V == 0S2.A01 ? AbstractC00603o4.A00(305) : "friends_tab", ((9aH) friendsTabFragment.A10.get()).A01(friendsTabFragment.getContext(), A03(friendsTabFragment)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0079, code lost:
    
        if (r0 != X.0S2.A0Y) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0743  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x07c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x07df A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A09(com.facebook.messaging.contactstab.FriendsTabFragment r301) {
        /*
            Method dump skipped, instructions count: 2909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.contactstab.FriendsTabFragment.A09(com.facebook.messaging.contactstab.FriendsTabFragment):void");
    }

    public static void A0A(FriendsTabFragment friendsTabFragment, int i) {
        if (i < 0 || friendsTabFragment.A0U.size() <= i) {
            return;
        }
        friendsTabFragment.A02.A0Q(i, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0B(FriendsTabFragment friendsTabFragment, C3Z5 c3z5, ThreadKey threadKey) {
        if (friendsTabFragment.mListener == null || friendsTabFragment.getContext() == null) {
            return;
        }
        friendsTabFragment.mListener.C9z(threadKey, NavigationTrigger.A06(c3z5.A03 != null ? "friends_tab_recently_active_trigger" : "friends_tab_active_thread", C3Z6.A04(c3z5)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1H() {
        super.A1H();
        ((HTSessionManager) this.A0Y.get()).A00(getContext());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1O(boolean z, boolean z2) {
        super.A1O(z, z2);
        if (this.A0H == FriendsSubTabTag.A04) {
            if (z) {
                HTSessionManager hTSessionManager = (HTSessionManager) this.A0Y.get();
                Context context = getContext();
                C3lu c3lu = this.A0M;
                if (c3lu == null) {
                    c3lu = new C9vp(this);
                }
                hTSessionManager.A01(context, c3lu);
            }
            if (C1ub.A00().AZk(36321636494754440L)) {
                C8rM c8rM = this.A0c;
                c8rM.A00 = z;
                if (z) {
                    c8rM.A08(false);
                }
            } else if (C1ub.A00().AZk(36321636488266336L)) {
                2Qw r0 = (2Qw) this.A1P.get();
                r0.A00 = z;
                if (z) {
                    2Qw.A00(r0, false);
                }
            }
        }
        CJ7 cj7 = this.A0S;
        if (cj7 == null || this.A0H != FriendsSubTabTag.A02) {
            return;
        }
        boolean z3 = false;
        if (cj7.A01 != null) {
            z3 = true;
        }
        if (!z) {
            if (z3) {
                cj7.A05(0S2.A00);
                return;
            }
            return;
        }
        if (z3) {
            return;
        }
        boolean A04 = this.A1I.A04();
        synchronized (cj7) {
            if (cj7.A01 != null) {
                cj7.A05(0S2.A0N);
            }
            cj7.A02 = A04;
            cj7.A01 = C04I.A00().toString();
            1UG A00 = 1UD.A00((04J) cj7.A03.A00.get(), 1ZG.A01, 1BJ.A00(1209));
            if (A00.isSampled()) {
                String str = cj7.A01;
                if (str == null) {
                    throw 1BK.A0h();
                }
                A00.A7R("session_id", str);
                A00.A5q("entry_point", 1);
                A00.BZL();
            }
            C7nw c7nw = cj7.A00;
            if (c7nw != null) {
                FriendsTabFragment friendsTabFragment = c7nw.A00;
                Bv2 bv2 = friendsTabFragment.A0R;
                if (bv2 != null) {
                    bv2.A03.A00();
                    friendsTabFragment.A0R.A02.A02();
                    ((C8c) friendsTabFragment.A0p.get()).A00 = friendsTabFragment.A0S;
                }
            }
        }
    }

    public 1iF A1R() {
        return new 1iF(1567251216773138L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v16 ??, still in use, count: 2, list:
          (r309v16 ??) from 0x05a1: PHI (r309v15 ??) = (r309v14 ??), (r309v16 ??) binds: [B:111:0x058b, B:115:0x059b] A[DONT_GENERATE, DONT_INLINE]
          (r309v16 ?? I:java.lang.Object) from 0x059d: INVOKE (r0v201 ?? I:X.0QO), (r0v203 ?? I:java.lang.Object), (r309v16 ?? I:java.lang.Object) VIRTUAL call: X.0QO.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x06bb]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:34)
        */
    public void A1S(
    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r309v16 ??, still in use, count: 2, list:
          (r309v16 ??) from 0x05a1: PHI (r309v15 ??) = (r309v14 ??), (r309v16 ??) binds: [B:111:0x058b, B:115:0x059b] A[DONT_GENERATE, DONT_INLINE]
          (r309v16 ?? I:java.lang.Object) from 0x059d: INVOKE (r0v201 ?? I:X.0QO), (r0v203 ?? I:java.lang.Object), (r309v16 ?? I:java.lang.Object) VIRTUAL call: X.0QO.put(java.lang.Object, java.lang.Object):java.lang.Object A[Catch: all -> 0x06bb]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1107)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1118)
        	at jadx.core.utils.BlockUtils.replaceInsn(BlockUtils.java:1156)
        	at jadx.core.dex.visitors.ConstructorVisitor.removeAssignChain(ConstructorVisitor.java:180)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:80)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:51)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r302v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:237)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:285)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:151)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:174)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:636)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:80)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:118)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:400)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:388)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:338)
        */

    public 7Mg A1X() {
        Integer num = this.A0V;
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 1) {
                return 7Mg.A0L;
            }
            if (intValue == 3) {
                return 7Mg.A07;
            }
        }
        return 7Mg.A06;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1Y(7Mg r302, long j) {
        this.A0X = true;
        6uV r0 = (6uV) this.A13.get();
        FbUserSession fbUserSession = this.A03;
        fbUserSession.getClass();
        IAa A02 = r0.A02(fbUserSession, r302);
        A02.A0F = ImmutableList.of((Object) String.valueOf(j));
        8uK r307 = this.A0P;
        if (r307 == null) {
            r307 = new 8uK(this);
            this.A0P = r307;
        }
        A02.A05 = r307;
        A02.A03(getChildFragmentManager());
    }

    public boolean A1Z() {
        8HC r0 = (8HC) this.A1K.get(this.A0H);
        if (r0 == null) {
            return false;
        }
        return r0.A1e();
    }

    public boolean BVq() {
        8HC r0 = (8HC) this.A1K.get(this.A0H);
        if (r0 == null) {
            return true;
        }
        return r0.BVq();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public 06Z BdK() {
        if (isAdded()) {
            return getChildFragmentManager();
        }
        return null;
    }

    public void Cju() {
        8HC r0 = (8HC) this.A1K.get(this.A0H);
        if (r0 != null) {
            r0.Cju();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x03fb, code lost:
    
        if (X.1BJ.A00(224).equals(r0) != false) goto L47;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x02f7  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x036e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onAttach(android.content.Context r302) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.contactstab.FriendsTabFragment.onAttach(android.content.Context):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        super.onAttachFragment(fragment);
        if (fragment instanceof LifeEventsBottomSheetDialogFragment) {
            LifeEventsBottomSheetDialogFragment lifeEventsBottomSheetDialogFragment = (LifeEventsBottomSheetDialogFragment) fragment;
            boolean A04 = this.A1I.A04();
            Context requireContext = requireContext();
            FbUserSession fbUserSession = this.A03;
            lifeEventsBottomSheetDialogFragment.A01 = A04 ? new Ctn(requireContext, fbUserSession) : new Cto(requireContext, fbUserSession);
        }
        if (fragment instanceof 8HC) {
            8HC r0 = (8HC) fragment;
            FriendsSubTabTag A1X = r0.A1X();
            r0.A1c(this.A1Z);
            r0.A1b(this.A1X);
            this.A1K.put(A1X, r0);
            ImmutableList immutableList = this.A0U;
            r0.A1d(immutableList);
            r0.A1Z(immutableList.indexOf(A1X));
            A09(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v44, types: [X.7k7, java.lang.Object] */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(342042281);
        View inflate = layoutInflater.inflate(2132542048, viewGroup, false);
        this.A02 = (ViewPager) C09s.A01(inflate, 2131363335);
        Aav aav = this.A0J;
        if (aav != null) {
            aav.Bs2();
        } else {
            C9gB c9gB = this.A0L;
            if (c9gB != null) {
                C9gB.A00(c9gB).A00.A00.Bs2();
            }
        }
        if (this.A0U.size() > 1) {
            2Wo A00 = 2Wo.A00((ViewStub) C09s.A01(inflate, 2131367263));
            C1F6 c1f6 = (C1F6) this.A1R.get();
            AYQ ayq = this.A1d;
            Context A002 = 1Bf.A00(c1f6);
            try {
                ?? obj = new Object();
                obj.A02 = A00;
                obj.A00 = ayq;
                1Bn.A0K();
                FbInjector.A04(A002);
                this.A0b = obj;
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A002);
                throw th;
            }
        }
        0FI.A08(500432654, A02);
        return inflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(-1734480857);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        if (this.A0S != null) {
            Activity A1P = A1P();
            if (A1P != null && !A1P.isChangingConfigurations()) {
                this.A0S.A05(0S2.A0C);
                ((C8c) this.A0p.get()).A00 = null;
            }
            this.A0S.A00 = null;
        }
        ((FbSharedPreferences) this.A0i.get()).edit().putBoolean(1NK.A3G, FriendsSubTabTag.A06.equals(this.A0U.get(0))).commit();
        this.mListener = null;
        this.A0I = null;
        0FI.A08(1832653861, A02);
    }

    public void onDetach() {
        int A02 = 0FI.A02(1442433072);
        super.onDetach();
        this.A0T = null;
        0FI.A08(383483341, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(1047491004);
        super/*androidx.fragment.app.Fragment*/.onPause();
        this.A0G.A04(false);
        0FI.A08(1108472434, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1145812311);
        super/*androidx.fragment.app.Fragment*/.onResume();
        this.A0G.A04(true);
        0FI.A08(-1065413230, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        FriendsSubTabTag friendsSubTabTag = this.A0H;
        if (friendsSubTabTag != null) {
            bundle.putParcelable("friends_selected_tab", friendsSubTabTag);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        C1F6 c1f6 = (C1F6) this.A1S.get();
        06Z childFragmentManager = getChildFragmentManager();
        ImmutableList immutableList = this.A0U;
        9Hx r0 = this.A1W;
        Context A01 = FbInjector.A01();
        FbInjector.A04(c1f6.B92().Aqm());
        1Bn.A0M(c1f6);
        try {
            0NL r02 = new 8Cl(childFragmentManager, r0, immutableList);
            1Bn.A0K();
            FbInjector.A04(A01);
            this.A0a = r02;
            this.A02.A0R(r02);
            this.A02.A0L(2);
            this.A02.A0S(this.A1L);
            this.A04 = 1vD.A00(view);
            Bv2 bv2 = this.A0R;
            if (bv2 != null) {
                11T.A0F(view, 0);
                bv2.A04.A04(view, bv2.A03);
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    06Z BDe = activity.BDe();
                    String A00 = AbE.A00(296);
                    if (BDe.A0b(A00) != null) {
                        C1560Ale c1560Ale = (C1560Ale) getActivity().BDe().A0b(A00);
                        Bv2 bv22 = this.A0R;
                        11T.A0F(bv22, 0);
                        c1560Ale.A02 = bv22;
                    }
                }
            }
            9Zd r03 = this.A0O;
            if (r03 != null) {
                r03.A00(view);
            }
        } catch (Throwable th) {
            1Bn.A0K();
            FbInjector.A04(A01);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewStateRestored(Bundle bundle) {
        int A02 = 0FI.A02(-1616223115);
        super/*androidx.fragment.app.Fragment*/.onViewStateRestored(bundle);
        int indexOf = this.A0U.indexOf(this.A0H);
        this.A0a.A02[indexOf] = true;
        A0A(this, indexOf);
        0FI.A08(-1987168525, A02);
    }
}
