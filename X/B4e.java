package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.ComponentTree;
import com.facebook.litho.LithoView;
import com.facebook.messaging.contactstab.intf.FriendsSubTabTag;
import com.facebook.messaging.graph.plugins.lifecycle.contactmanagement.ContactManagementObserverImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.mig.scheme.schemes.LightColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: B4e.class */
public final class B4e extends 8HC {
    public static final String __redex_internal_original_name = "AllContactsFragment";
    public View A00;
    public FbUserSession A01;
    public 1PA A02;
    public 1PA A03;
    public C01s A04;
    public LithoView A05;
    public LithoView A06;
    public InterfaceC00713oe A07;
    public 2TS A08;
    public AXj A09;
    public AeX A0A;
    public C0e A0B;
    public C8y A0C;
    public CG6 A0D;
    public MigColorScheme A0E;
    public 2Wo A0F;
    public 2Wo A0G;
    public 2Wo A0H;
    public String A0K;
    public HashSet A0L;
    public HashSet A0M;
    public java.util.Map A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public Context A0S;
    public 2TR A0T;
    public final B2Y A0a;
    public final Runnable A0d;
    public final InterfaceC00733og A0f;
    public final FriendsSubTabTag A0g;
    public final C1sy A0i;
    public final Bds A0h = new Bds(this);
    public final Runnable A0e = new D5h(this);
    public final 1Br A0W = 1Bu.A02(this, 84417);
    public final 1Br A0Z = 1Bu.A00(16430);
    public final 1Br A0Y = 7zM.A0S();
    public final 1Br A0V = 1HG.A01(this, 65728);
    public final 1Br A0U = 1Bu.A00(16830);
    public final 1Br A0X = 1Bq.A00(85048);
    public List A0N = C0ty.A00;
    public String A0J = "A";
    public ImmutableList A0I = 1BK.A0b();
    public final C02l A0c = new D0U(this, 14);
    public final C02l A0b = new D0U(this, 13);

    /* JADX WARN: Multi-variable type inference failed */
    public B4e() {
        2TS r0 = 2TS.A0O;
        11T.A0B(r0);
        this.A08 = r0;
        this.A0E = LightColorScheme.A00();
        this.A0i = new CxA(this, 3);
        this.A0a = new C2kx();
        this.A0d = new D5g(this);
        this.A0f = new C9sj(this, 6);
        this.A0g = FriendsSubTabTag.A03;
    }

    /*  JADX ERROR: Types fix failed
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:183)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:242)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    /* JADX WARN: Failed to calculate best type for var: r324v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r324v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Failed to calculate best type for var: r325v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:156)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:133)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:238)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:221)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
     */
    /* JADX WARN: Failed to calculate best type for var: r325v0 ??
    java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "changeArg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:439)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:232)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:212)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:183)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:112)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:83)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:56)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:145)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:123)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1597)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:101)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Not initialized variable reg: 324, insn: 0x0387: MOVE (r5 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r324 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) A[TRY_ENTER], block:B:225:0x0387 */
    /* JADX WARN: Not initialized variable reg: 325, insn: 0x0371: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r325 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:224:0x0369 */
    public static final void A03(X.B4e r301) {
        /*
            Method dump skipped, instructions count: 1506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B4e.A03(X.B4e):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0358, code lost:
    
        if (android.text.TextUtils.isEmpty(r331) == false) goto L73;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A06(X.B4e r301) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B4e.A06(X.B4e):void");
    }

    public static final void A07(B4e b4e) {
        LithoView lithoView;
        C8y c8y;
        if (!b4e.A0Q || (lithoView = b4e.A06) == null || (c8y = b4e.A0C) == null) {
            return;
        }
        int i = 0;
        if (c8y.A01.A02 == BKm.A01) {
            i = 8;
        }
        lithoView.setVisibility(i);
    }

    public 1iF A1R() {
        return AbF.A0C(859494138010234L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A1S(Bundle bundle) {
        this.A0D = CG6.A00(requireContext());
        this.A0Q = requireArguments().getBoolean("should_update_search_bar_visibility");
        this.A0P = requireArguments().getBoolean("should_show_index_rail");
        this.A0K = requireArguments().getString("thread_nav_trigger", null);
        this.A0S = new ContextThemeWrapper(getContext(), 2132607920);
        1Bi.A03(17024);
        7zP.A0e(this.A0Y).markerStart(5511668);
        2TR A02 = 2TN.A02(EnumSet.of(2TP.A01), -1, true);
        this.A0T = A02;
        A02.A06 = true;
        A02.A05 = true;
        A02.A01 = new Cbt(this, 1);
        this.A0M = AnonymousClass001.A0v();
        C00i c00i = this.A0V.A00;
        1PA A01 = 1P9.A01(1P9.A00(c00i), this.A0c, "REMOVED_CONTACT_IN_INFO_DIALOG");
        this.A03 = A01;
        A01.A00();
        this.A0L = AnonymousClass001.A0v();
        1PA A012 = 1P9.A01(1P9.A00(c00i), this.A0b, 1BJ.A00(86));
        this.A02 = A012;
        A012.A00();
        ((C1sx) 1Bi.A03(33085)).A01(this, this.A0i);
        this.A01 = 1BM.A01(this);
        this.A0A = (AeX) 7zO.A0l(this, 82710);
        this.A04 = 4YV.A0G();
        this.A07 = new 53R();
        C1t6.A00(this, new Ckh(this, 0));
    }

    public FriendsSubTabTag A1X() {
        return this.A0g;
    }

    public void A1Y() {
        Resources A0E;
        2Wo r0 = this.A0H;
        if (r0 != null) {
            View A01 = r0.A01();
            11T.A0A(A01);
            LithoView lithoView = (LithoView) A01;
            1Iw r02 = lithoView.A09;
            C5yw A0b = 7zN.A0b(r02, false);
            A0b.A2a(2131962922);
            A0b.A2Y();
            A0b.A2b(this.A0E);
            CxE.A01(A0b, this, 43);
            A0b.A0w(1.0f);
            C5yv A2V = A0b.A2V();
            ComponentTree componentTree = lithoView.A00;
            if (componentTree == null) {
                AbN.A1A(r02, lithoView);
            } else {
                componentTree.A0O(A2V);
            }
        }
        A06(this);
        2Wo r03 = this.A0G;
        if (r03 == null || !this.A0Q) {
            return;
        }
        String str = null;
        LithoView lithoView2 = (LithoView) r03.A01();
        this.A06 = lithoView2;
        1Iw r303 = lithoView2 != null ? lithoView2.A09 : null;
        C2ze A00 = 2hU.A00(r303);
        7zM.A1O(A00, this.A0E);
        A00.A2Y(BWx.A00(this.A0E));
        if (r303 != null && (A0E = 4YU.A0E(r303)) != null) {
            str = A0E.getString(2131965529);
        }
        A00.A01.A0B = str;
        A00.A17(this.A0H == null ? 0.0f : 7zM.A01());
        A00.A2X(new CpS(this, 3));
        1LI A2W = A00.A2W();
        LithoView lithoView3 = this.A06;
        if (lithoView3 != null) {
            ComponentTree componentTree2 = lithoView3.A00;
            if (componentTree2 == null) {
                AbN.A19(A2W, r303, lithoView3);
            } else {
                componentTree2.A0O(A2W);
            }
        }
    }

    public void A1c(AXj aXj) {
        this.A09 = aXj;
    }

    public boolean BVq() {
        return this.A0a.A02;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityCreated(Bundle bundle) {
        int A02 = 0FI.A02(-1254637985);
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        ((Handler) 1Br.A0B(this.A0Z)).postDelayed(this.A0e, 500L);
        7zP.A0e(this.A0Y).markerPoint(5511668, "contacts_load_start");
        CG6 cg6 = this.A0D;
        if (cg6 != null) {
            CDl cDl = cg6.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = cDl.A02;
            r0.A08("com.facebook.messaging.graph.plugins.interfaces.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onContactLoadingStart", andIncrement);
            try {
                if (CDl.A00(cDl)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    try {
                        r0.A0A("com.facebook.messaging.graph.plugins.lifecycle.contactmanagement.ContactManagementObserverImplementation", "messaging.graph.lifecycle.contactmanagement.ContactManagementObserverImplementation", "com.facebook.messaging.graph.plugins.interfaces.contactmanagement.ContactManagementLifeCycleInterfaceSpec", andIncrement2, "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", 4YT.A00(2), "onContactLoadingStart");
                        try {
                            ContactManagementObserverImplementation.A00(cDl.A00).A00("contact_load_start", null);
                            r0.A09("messaging.graph.lifecycle.contactmanagement.ContactManagementObserverImplementation", "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onContactLoadingStart", andIncrement2);
                        } catch (Exception e) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        r0.A04((Exception) null, "messaging.graph.lifecycle.contactmanagement.ContactManagementObserverImplementation", "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onContactLoadingStart", andIncrement2);
                        throw th;
                    }
                }
                r0.A02((Exception) null, "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onContactLoadingStart", andIncrement);
            } catch (Throwable th2) {
                r0.A02((Exception) null, "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onContactLoadingStart", andIncrement);
                throw th2;
            }
        }
        2TR r02 = this.A0T;
        if (r02 != null) {
            r02.A08();
        }
        0FI.A08(-188367653, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1303227730);
        11T.A0F(layoutInflater, 0);
        View A0G = 7zM.A0G(layoutInflater.cloneInContext(this.A0S), viewGroup, 2132541760, false);
        this.A00 = A0G;
        this.A05 = (LithoView) C09s.A01(A0G, 2131363323);
        View view = this.A00;
        if (view != null) {
            this.A0G = AbK.A0v(view, 2131362022);
            if (requireArguments().getBoolean("should_show_title_bar")) {
                View view2 = this.A00;
                if (view2 != null) {
                    this.A0H = AbK.A0v(view2, 2131368070);
                }
            }
            View view3 = this.A00;
            if (view3 != null) {
                MigColorScheme.A00(view3, this.A0E);
                View view4 = this.A00;
                if (view4 != null) {
                    0FI.A08(2007808427, A02);
                    return view4;
                }
            }
        }
        11T.A0L("rootView");
        throw 0Q8.createAndThrow();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDestroy() {
        int A02 = 0FI.A02(1200778032);
        super/*androidx.fragment.app.Fragment*/.onDestroy();
        CG6 cg6 = this.A0D;
        if (cg6 != null) {
            CDl cDl = cg6.A00.A00;
            AtomicInteger atomicInteger = C1Y6.A04;
            int andIncrement = atomicInteger.getAndIncrement();
            1YC r0 = cDl.A02;
            r0.A08("com.facebook.messaging.graph.plugins.interfaces.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onDestroy", andIncrement);
            Exception e = null;
            try {
                if (CDl.A00(cDl)) {
                    int andIncrement2 = atomicInteger.getAndIncrement();
                    r0.A0A("com.facebook.messaging.graph.plugins.lifecycle.contactmanagement.ContactManagementObserverImplementation", "messaging.graph.lifecycle.contactmanagement.ContactManagementObserverImplementation", "com.facebook.messaging.graph.plugins.interfaces.contactmanagement.ContactManagementLifeCycleInterfaceSpec", andIncrement2, "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", 4YT.A00(2), "onDestroy");
                    try {
                        try {
                            C2n A00 = ContactManagementObserverImplementation.A00(cDl.A00);
                            if (A00.A00 != 0) {
                                4YV.A0Z(A00.A01).flowEndCancel(A00.A00, "Contact Management Dismissed");
                                A00.A00 = 0L;
                            }
                            r0.A09("messaging.graph.lifecycle.contactmanagement.ContactManagementObserverImplementation", "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onDestroy", andIncrement2);
                        } catch (Exception e2) {
                            e = e2;
                            throw e;
                        }
                    } catch (Throwable th) {
                        r0.A04(e, "messaging.graph.lifecycle.contactmanagement.ContactManagementObserverImplementation", "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onDestroy", andIncrement2);
                        throw th;
                    }
                }
                r0.A02((Exception) null, "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onDestroy", andIncrement);
            } catch (Throwable th2) {
                r0.A02(e, "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onDestroy", andIncrement);
                throw th2;
            }
        }
        2TR r02 = this.A0T;
        if (r02 != null) {
            r02.AEC();
        }
        ((Handler) 1Br.A0B(this.A0Z)).removeCallbacks(this.A0e);
        HashSet hashSet = this.A0M;
        if (hashSet != null) {
            hashSet.clear();
        }
        HashSet hashSet2 = this.A0L;
        if (hashSet2 != null) {
            hashSet2.clear();
        }
        1PA r03 = this.A03;
        if (r03 != null) {
            r03.A01();
        }
        1PA r04 = this.A02;
        if (r04 != null) {
            r04.A01();
        }
        0FI.A08(-838864756, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        CbQ cbQ;
        int A02 = 0FI.A02(-96050328);
        super/*androidx.fragment.app.Fragment*/.onPause();
        CG6 cg6 = this.A0D;
        if (cg6 != null) {
            CDl cDl = cg6.A00.A00;
            int A00 = 1BK.A00();
            1YC r0 = cDl.A02;
            r0.A08("com.facebook.messaging.graph.plugins.interfaces.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onPause", A00);
            r0.A06("messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onPause", A00);
        }
        C8y c8y = this.A0C;
        if (c8y != null && (cbQ = c8y.A00.A01) != null) {
            cbQ.A01();
        }
        0FI.A08(-1523961239, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-650073672);
        super/*androidx.fragment.app.Fragment*/.onResume();
        CG6 cg6 = this.A0D;
        if (cg6 != null) {
            CDl cDl = cg6.A00.A00;
            int A00 = 1BK.A00();
            1YC r0 = cDl.A02;
            r0.A08("com.facebook.messaging.graph.plugins.interfaces.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onResume", A00);
            r0.A06("messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onResume", A00);
        }
        A07(this);
        LithoView lithoView = this.A05;
        if (lithoView == null) {
            11T.A0L("contactsListView");
            throw 0Q8.createAndThrow();
        }
        lithoView.A03 = this.A0f;
        0FI.A08(-829553058, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super/*X.1pK*/.onViewCreated(view, bundle);
        this.A0R = false;
        CG6 cg6 = this.A0D;
        if (cg6 != null) {
            CDl cDl = cg6.A00.A00;
            int A00 = 1BK.A00();
            1YC r0 = cDl.A02;
            r0.A08("com.facebook.messaging.graph.plugins.interfaces.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onViewCreated", A00);
            r0.A06("messaging.graph.contactmanagement.ContactManagementLifeCycleInterfaceSpec", "onViewCreated", A00);
        }
        getParentFragmentManager().A1L(new CZl(this, 1));
        A1Y();
    }
}
