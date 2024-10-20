package com.facebook.messaging.memories.viewer;

import X.06Z;
import X.0BY;
import X.0FI;
import X.0Gm;
import X.0Q8;
import X.0fH;
import X.11T;
import X.1BK;
import X.1BM;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1ED;
import X.1Gh;
import X.1Lo;
import X.1Um;
import X.1pI;
import X.1pQ;
import X.1tJ;
import X.1vD;
import X.2MX;
import X.2Op;
import X.2Ov;
import X.2UF;
import X.4YU;
import X.53S;
import X.53U;
import X.7zL;
import X.7zN;
import X.7zP;
import X.7zQ;
import X.7zS;
import X.7zU;
import X.7zV;
import X.8D8;
import X.8Vd;
import X.8Ve;
import X.8fI;
import X.9F9;
import X.9Vf;
import X.9WL;
import X.9lM;
import X.A0B;
import X.A1V;
import X.AQd;
import X.AQr;
import X.AXg;
import X.AnonymousClass001;
import X.C00g;
import X.C01i;
import X.C1s0;
import X.C2yk;
import X.C3o5;
import X.C8h1;
import X.C96y;
import X.C9Jf;
import X.C9dL;
import X.C9kn;
import X.C9mY;
import X.C9qn;
import X.C9qp;
import X.PzY;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Color;
import android.graphics.RenderEffect;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.litho.LithoView;
import com.facebook.messaging.memories.model.MemoryMessageModel;
import com.facebook.messaging.memories.model.MemoryViewModel;
import com.facebook.messaging.memories.viewer.MemoryViewerFragment;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.montage.viewer.progressindicator.MontageProgressIndicatorView;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* loaded from: MemoryViewerFragment.class */
public final class MemoryViewerFragment extends 2Ov implements C00g, 2Op {
    public static final 9WL A0R = new Object();
    public FbUserSession A00;
    public 1pI A01;
    public LithoView A02;
    public LithoView A03;
    public LithoView A04;
    public LithoView A05;
    public PzY A06;
    public C9kn A07;
    public MemoryViewModel A08;
    public 9lM A09;
    public MontageProgressIndicatorView A0A;
    public 2MX A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public MemoryMessageModel A0F;
    public 53U A0G;
    public final C01i A0Q;
    public final 1Br A0I = 1Bu.A02(this, 16980);
    public final 1Br A0K = 1Bu.A02(this, 16981);
    public final 1Br A0H = 7zN.A0I(this);
    public final 1ED A0P = (1ED) 1Bi.A03(16470);
    public final 1Br A0J = 1Bq.A00(16508);
    public final 1Br A0L = 1Bu.A00(68214);
    public final 1pQ A0O = 7zQ.A0h();
    public final 1Br A0M = 1Bq.A00(84488);
    public final 1Br A0N = 1Bu.A02(this, 49478);

    public MemoryViewerFragment() {
        0BY A18 = 7zL.A18(8D8.class);
        this.A0Q = 7zU.A0F(new AQr(this, 32), new AQr(this, 33), new AQd(null, this, 25), A18);
    }

    private final void A05() {
        LithoView lithoView = this.A02;
        if (lithoView != null) {
            lithoView.setRenderEffect(RenderEffect.createBlurEffect(100.0f, 100.0f, Shader.TileMode.MIRROR));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void A06() {
        Window window;
        FragmentActivity activity = getActivity();
        if (activity == null || (window = activity.getWindow()) == null) {
            return;
        }
        1tJ.A06(window, 0);
        C2yk.A00(window, Color.argb(1, 0, 0, 0));
        LithoView lithoView = this.A02;
        if (lithoView != null) {
            A08(lithoView, window, true);
        }
        LithoView lithoView2 = this.A04;
        if (lithoView2 != null) {
            A08(lithoView2, window, true);
        }
    }

    public static final void A07(Context context, MemoryViewerFragment memoryViewerFragment) {
        LithoView lithoView;
        8fI r312;
        LithoView lithoView2 = memoryViewerFragment.A02;
        if (lithoView2 != null) {
            MemoryViewModel memoryViewModel = memoryViewerFragment.A08;
            if (memoryViewModel != null) {
                C96y A00 = C9dL.A00(memoryViewModel.A03);
                1pQ r0 = memoryViewerFragment.A0O;
                r312 = ((7zV.A1C(r0) || 1pQ.A00(r0).AZk(36324595714969431L)) && A00 != null) ? new 8Ve(A00, memoryViewModel.A0D) : new 8fI(memoryViewModel.A0D, AnonymousClass001.A1R(Build.VERSION.SDK_INT, 31));
            } else {
                r312 = null;
            }
            lithoView2.A0y(r312);
        }
        if (Build.VERSION.SDK_INT >= 31) {
            memoryViewerFragment.A05();
        }
        LithoView lithoView3 = memoryViewerFragment.A03;
        if (lithoView3 != null) {
            C1s0 c1s0 = new C1s0(7zL.A0W(context));
            c1s0.A01(false);
            7zQ.A1I(c1s0, lithoView3);
        }
        LithoView lithoView4 = memoryViewerFragment.A03;
        if (lithoView4 != null) {
            MemoryViewModel memoryViewModel2 = memoryViewerFragment.A08;
            C8h1 c8h1 = null;
            if (memoryViewModel2 != null) {
                MigColorScheme A0m = 7zQ.A0m(memoryViewerFragment.A0I);
                boolean z = memoryViewerFragment.A0C;
                9lM r02 = memoryViewerFragment.A09;
                if (r02 == null) {
                    11T.A0L("listener");
                    throw 0Q8.createAndThrow();
                }
                c8h1 = new C8h1(lithoView4, (C9mY) 1Br.A0B(memoryViewerFragment.A0L), memoryViewModel2, new C9Jf(memoryViewerFragment), r02, A0m, z);
            }
            lithoView4.A0y(c8h1);
        }
        if (!1pQ.A00(memoryViewerFragment.A0O).AZk(36324595713593162L) && (lithoView = memoryViewerFragment.A05) != null) {
            lithoView.setVisibility(8);
            lithoView.A10(null, true);
        }
        memoryViewerFragment.A06();
    }

    public static final void A08(View view, Window window, boolean z) {
        if (Build.VERSION.SDK_INT >= 30) {
            if (z) {
                window.setDecorFitsSystemWindows(false);
                return;
            } else {
                window.setDecorFitsSystemWindows(true);
                return;
            }
        }
        int systemUiVisibility = view.getSystemUiVisibility();
        int i = systemUiVisibility | 512;
        if (!z) {
            i = systemUiVisibility & (-513);
        }
        view.setSystemUiVisibility(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A0C(MemoryViewerFragment memoryViewerFragment) {
        ContentObserver contentObserver;
        MemoryViewModel memoryViewModel = memoryViewerFragment.A08;
        if (memoryViewModel == null || !memoryViewModel.A0R || (contentObserver = memoryViewerFragment.A06) == null) {
            return;
        }
        try {
            memoryViewerFragment.requireContext().getContentResolver().unregisterContentObserver(contentObserver);
        } catch (Throwable th) {
            0fH.A0s("memory_viewer_fragment", "Failed to unregister screenshot content observer", th);
        }
    }

    public void CpV(2MX r302) {
        this.A0B = r302;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-987839164);
        super.onCreate(bundle);
        this.A00 = 1BM.A01(this);
        0FI.A08(-321590771, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(437459044);
        11T.A0F(layoutInflater, 0);
        super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(2132542541, viewGroup, false);
        this.A02 = 7zL.A0b(inflate, 2131365584);
        this.A05 = 7zL.A0b(inflate, 2131365587);
        this.A04 = 7zL.A0b(inflate, 2131365586);
        this.A03 = 7zL.A0b(inflate, 2131365585);
        this.A0A = (MontageProgressIndicatorView) inflate.findViewById(2131366709);
        this.A0G = ((53S) 1Br.A0B(this.A0N)).A01(this);
        0FI.A08(936047158, A02);
        return inflate;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(1709011497);
        super.onDestroyView();
        MutableLiveData mutableLiveData = ((8D8) this.A0Q.getValue()).A01;
        11T.A0F(mutableLiveData, 0);
        7zS.A1C(mutableLiveData, 9F9.A00, (Object) null);
        this.A0A = null;
        this.A02 = null;
        this.A04 = null;
        this.A03 = null;
        this.A05 = null;
        0FI.A08(-1642068136, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(2129444388);
        super/*androidx.fragment.app.Fragment*/.onPause();
        A0C(this);
        MontageProgressIndicatorView montageProgressIndicatorView = this.A0A;
        if (montageProgressIndicatorView != null) {
            montageProgressIndicatorView.A01();
        }
        0FI.A08(1701611686, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        MemoryViewModel memoryViewModel;
        int A02 = 0FI.A02(-27615456);
        super/*androidx.fragment.app.Fragment*/.onResume();
        A06();
        MontageProgressIndicatorView montageProgressIndicatorView = this.A0A;
        if (montageProgressIndicatorView != null) {
            montageProgressIndicatorView.A02();
        }
        if (this.A07 == null) {
            11T.A0L("memoryViewModelFetcher");
            throw 0Q8.createAndThrow();
        }
        if (!this.A0E && (memoryViewModel = this.A08) != null && memoryViewModel.A0R) {
            HandlerThread A022 = ((1Gh) 1Br.A0B(this.A0J)).A02("memories_screenshot_content_observer");
            11T.A0A(A022);
            A022.start();
            ContentObserver pzY = new PzY(requireContext(), new Handler(A022.getLooper()), new AXg() { // from class: X.9tb
                @Override // X.AXg
                public void CJ3() {
                    MemoryViewerFragment memoryViewerFragment = MemoryViewerFragment.this;
                    MemoryViewerFragment.A0C(memoryViewerFragment);
                    memoryViewerFragment.A0E = true;
                    MemoryViewModel memoryViewModel2 = memoryViewerFragment.A08;
                    if (memoryViewModel2 != null) {
                        9lM r0 = memoryViewerFragment.A09;
                        if (r0 != null) {
                            C9mY.A02(r0.A05, memoryViewModel2, null, 26, false);
                            9lM r02 = memoryViewerFragment.A09;
                            if (r02 != null) {
                                r02.A03(memoryViewModel2);
                                return;
                            }
                        }
                        11T.A0L("listener");
                        throw 0Q8.createAndThrow();
                    }
                }
            });
            this.A06 = pzY;
            requireContext().getContentResolver().registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, pzY);
        }
        0FI.A08(228355878, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        Window window;
        int A02 = 0FI.A02(-86813271);
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            LithoView lithoView = this.A02;
            if (lithoView != null) {
                A08(lithoView, window, false);
            }
            LithoView lithoView2 = this.A04;
            if (lithoView2 != null) {
                A08(lithoView2, window, false);
            }
        }
        super/*X.0D2*/.onStop();
        0FI.A08(-1535259269, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Parcelable.Creator creator;
        LiveData liveData;
        Observer c9qp;
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        LithoView lithoView = this.A05;
        if (lithoView != null) {
            lithoView.A0y(new 8Vd(7zQ.A0m(this.A0K)));
        }
        this.A01 = 1vD.A00(view);
        06Z BDe = requireActivity().BDe();
        11T.A0A(BDe);
        1pI r0 = this.A01;
        Parcelable parcelable = null;
        if (r0 == null) {
            str = "contentViewManager";
        } else {
            53U r02 = this.A0G;
            if (r02 == null) {
                str = "runtimePermissionsManager";
            } else {
                this.A09 = new 9lM(view, BDe, r0, (C9mY) 1Br.A0B(this.A0L), this.A0A, r02);
                FbUserSession fbUserSession = this.A00;
                if (fbUserSession != null) {
                    Context A08 = 4YU.A08(view);
                    this.A07 = (C9kn) 1Lo.A04(A08, fbUserSession, (1BY) null, 68215);
                    Bundle bundle2 = this.mArguments;
                    if (bundle2 != null) {
                        parcelable = bundle2.getParcelable("arg_memory_message_model");
                    }
                    MemoryMessageModel memoryMessageModel = (MemoryMessageModel) ((Parcelable) 0Gm.A01(MemoryMessageModel.A03, parcelable, MemoryMessageModel.class));
                    this.A0F = memoryMessageModel;
                    if (memoryMessageModel == null) {
                        AQd aQd = new AQd(view, this, 24);
                        Bundle bundle3 = this.mArguments;
                        if (bundle3 != null) {
                            Object A0q = 7zN.A0q("CREATOR", MemoryViewModel.class);
                            if (!(A0q instanceof Parcelable.Creator) || (creator = (Parcelable.Creator) A0q) == null) {
                                throw 7zS.A0v(MemoryViewModel.class);
                            }
                            MemoryViewModel memoryViewModel = (MemoryViewModel) 7zQ.A0K(bundle3, creator, MemoryViewModel.class, "arg_memory_view_model");
                            if (memoryViewModel != null) {
                                this.A08 = memoryViewModel;
                                int i = memoryViewModel.A03;
                                String str2 = memoryViewModel.A0F;
                                String str3 = memoryViewModel.A0G;
                                ThreadKey threadKey = memoryViewModel.A07;
                                String str4 = memoryViewModel.A0H;
                                long j = memoryViewModel.A05;
                                String str5 = memoryViewModel.A0D;
                                String str6 = memoryViewModel.A0E;
                                Long l = memoryViewModel.A09;
                                int i2 = memoryViewModel.A02;
                                int i3 = memoryViewModel.A01;
                                List list = memoryViewModel.A0N;
                                List list2 = memoryViewModel.A0O;
                                long j2 = memoryViewModel.A06;
                                String str7 = memoryViewModel.A0I;
                                String str8 = memoryViewModel.A0K;
                                Long l2 = memoryViewModel.A0A;
                                String str9 = memoryViewModel.A0J;
                                String str10 = memoryViewModel.A0L;
                                List list3 = memoryViewModel.A0P;
                                boolean z = memoryViewModel.A0R;
                                boolean z2 = memoryViewModel.A0T;
                                String str11 = memoryViewModel.A0M;
                                long j3 = memoryViewModel.A04;
                                Long l3 = memoryViewModel.A0C;
                                Integer num = memoryViewModel.A08;
                                Long l4 = memoryViewModel.A0B;
                                boolean z3 = memoryViewModel.A0U;
                                List list4 = memoryViewModel.A0Q;
                                11T.A0F(str2, 0);
                                C3o5.A0k(str3, 1, str5);
                                7zP.A1O(list, 10, list2);
                                7zP.A1R(str10, 17, list3);
                                11T.A0F(list4, 28);
                                this.A08 = new MemoryViewModel(threadKey, num, l, l2, l3, l4, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, list, list2, list3, list4, i2, i3, i, j, j2, j3, z, z2, z3);
                                aQd.invoke();
                            }
                        }
                        throw 1BK.A0h();
                    }
                    if (memoryMessageModel.A02) {
                        AQd aQd2 = new AQd(view, this, 22);
                        C9kn c9kn = this.A07;
                        if (c9kn == null) {
                            str = "memoryViewModelFetcher";
                        } else {
                            liveData = c9kn.A06;
                            c9qp = new C9qn(aQd2, this, 14);
                        }
                    } else {
                        AQd aQd3 = new AQd(view, this, 23);
                        9Vf r03 = (9Vf) 1Bn.A0A(68209);
                        FbUserSession fbUserSession2 = this.A00;
                        if (fbUserSession2 != null) {
                            String str12 = memoryMessageModel.A01;
                            11T.A0F(str12, 1);
                            if (!r03.A00) {
                                r03.A00 = true;
                                2UF r04 = (2UF) 1Lo.A08(fbUserSession2, 67249);
                                1Um A0O = 1BK.A0O(r04, 0);
                                MailboxFutureImpl A0P = 1BK.A0P(A0O);
                                1Um.A02(A0O, new A1V(r04, A0P, str12, 7), A0P, false);
                                A0P.addResultCallback(new A0B(str12, r03, 1));
                            }
                            liveData = r03.A03;
                            c9qp = new C9qp(1, memoryMessageModel, aQd3, this);
                        }
                    }
                    liveData.observe(this, c9qp);
                    if (7zV.A1C(this.A0O)) {
                        C9qn.A00(getViewLifecycleOwner(), ((8D8) this.A0Q.getValue()).A00, A08, this, 16);
                        return;
                    }
                    return;
                }
                str = "fbUserSession";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
