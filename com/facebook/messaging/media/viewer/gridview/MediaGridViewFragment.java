package com.facebook.messaging.media.viewer.gridview;

import X.06Z;
import X.0D2;
import X.0FI;
import X.0Gm;
import X.0Q8;
import X.0S2;
import X.0fH;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BM;
import X.1BV;
import X.1Bn;
import X.1Bq;
import X.1Br;
import X.1Bu;
import X.1FV;
import X.1LH;
import X.1XU;
import X.1tC;
import X.2Ov;
import X.48U;
import X.4YU;
import X.53S;
import X.53T;
import X.5VW;
import X.6KV;
import X.6Ro;
import X.7zL;
import X.7zM;
import X.7zN;
import X.7zO;
import X.82O;
import X.8L1;
import X.91O;
import X.9Ca;
import X.9wE;
import X.9wH;
import X.9wJ;
import X.AVD;
import X.AbR;
import X.AnonymousClass001;
import X.C00i;
import X.C1q7;
import X.C5be;
import X.C66c;
import X.C6kc;
import X.C6yj;
import X.C9K1;
import X.C9oI;
import X.HJN;
import X.IDV;
import X.IDb;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.media.download.params.DownloadPhotosParams;
import com.facebook.messaging.media.viewer.communityhighlights.model.CommunityHighlightsMediaViewerArgs;
import com.facebook.messaging.media.viewer.fragment.MediaViewFragment;
import com.facebook.messaging.media.viewer.sharedalbum.model.SharedAlbumMediaViewerArgs;
import com.facebook.messaging.media.viewer.theme.MediaViewerTheme;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.messaging.rollcall.presentation.viewer.model.ContributionReactionsViewState;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.runtimepermissions.RequestPermissionsConfig;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.SettableFuture;
import com.mapbox.mapboxsdk.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* loaded from: MediaGridViewFragment.class */
public final class MediaGridViewFragment extends 2Ov {
    public View A00;
    public FbUserSession A01;
    public 6KV A02;
    public IDV A03;
    public MediaViewerTheme A04;
    public Message A05;
    public ThreadKey A06;
    public C9K1 A07;
    public ArrayList A08;
    public List A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public LithoView A0D;
    public final 1Br A0E = 7zN.A0I(this);
    public final 1Br A0F = 1Bq.A00(50098);
    public final 1Br A0H = 1Bu.A00(65571);
    public final 1Br A0J = 1Bu.A00(66570);
    public final 1Br A0G = 1Bu.A00(67807);
    public final 9wH A0I = new 9wH(this, 0);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [com.google.common.util.concurrent.ListenableFuture, com.google.common.util.concurrent.SettableFuture] */
    public static final ListenableFuture A05(MediaGridViewFragment mediaGridViewFragment) {
        53T A00 = ((53S) 7zO.A0l(mediaGridViewFragment, 49478)).A00(mediaGridViewFragment.requireContext());
        ArrayList A0s = AnonymousClass001.A0s();
        ArrayList A0s2 = AnonymousClass001.A0s();
        ArrayList arrayList = mediaGridViewFragment.A08;
        1FV r308 = null;
        if (arrayList == null) {
            11T.A0L("mediaMessageItems");
            throw 0Q8.createAndThrow();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaMessageItem mediaMessageItem = (MediaMessageItem) it.next();
            Message Ax8 = mediaMessageItem.Ax8();
            ImmutableList immutableList = C1q7.A07;
            if ((Ax8 == null || !ThreadKey.A0p(Ax8.A0V)) && mediaMessageItem.AwL().A02() != null) {
                1Br.A0C(mediaGridViewFragment.A0F);
                A0s2.add(6Ro.A00(mediaMessageItem));
            } else {
                Uri uri = mediaMessageItem.AwL().A0E;
                11T.A09(uri);
                A0s.add(uri);
            }
        }
        CallerContext A0C = CallerContext.A0C("MediaGridViewFragment", "photo_save_grid_view");
        if (7zM.A1b(A0s)) {
            r308 = ((6Ro) 1Br.A0B(mediaGridViewFragment.A0F)).A08(mediaGridViewFragment.requireContext(), A0C, A00, A0s);
        } else if (7zM.A1b(A0s2)) {
            6Ro r0 = (6Ro) 1Br.A0B(mediaGridViewFragment.A0F);
            Context requireContext = mediaGridViewFragment.requireContext();
            RequestPermissionsConfig requestPermissionsConfig = 6Ro.A06;
            DownloadPhotosParams downloadPhotosParams = new DownloadPhotosParams(ImmutableList.copyOf((Collection) A0s2), 0S2.A00, false, false);
            Bundle A05 = 1BK.A05();
            A05.putParcelable("downloadPhotosParams", downloadPhotosParams);
            int size = downloadPhotosParams.A00.size();
            Integer num = downloadPhotosParams.A01;
            String A002 = 1BJ.A00(210);
            ?? A0j = 4YU.A0j();
            A00.AHQ(6Ro.A06, new 91O(requireContext, A05, A0C, r0, (SettableFuture) A0j, num, A002, size), 48U.A00);
            return A0j;
        }
        return r308;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A06(MediaGridViewFragment mediaGridViewFragment, MediaGridViewFragment mediaGridViewFragment2, Function1 function1, boolean z) {
        IDb iDb = (IDb) 7zO.A0l(mediaGridViewFragment, 67683);
        ArrayList arrayList = mediaGridViewFragment.A08;
        if (arrayList == null) {
            11T.A0L("mediaMessageItems");
            throw 0Q8.createAndThrow();
        }
        ArrayList A0z = 1BL.A0z(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            MediaMessageItem mediaMessageItem = (MediaMessageItem) it.next();
            A0z.add(new 8L1(11T.A02(mediaMessageItem.AqA()), mediaMessageItem.AwL().A0s, mediaMessageItem.Aw7(), 2));
        }
        iDb.A07(mediaGridViewFragment.requireContext(), mediaGridViewFragment2, A0z, function1, z);
    }

    public Dialog A0n(Bundle bundle) {
        C6kc c6kc = (C6kc) this.A0J.get();
        ThreadKey threadKey = this.A06;
        if (threadKey == null) {
            11T.A0L("threadKey");
            throw 0Q8.createAndThrow();
        }
        int i = 16973830;
        if (!c6kc.A05(threadKey) && (!A1B() || !HJN.A00(A16().getWindow().getDecorView()))) {
            i = 16973831;
        }
        A0g(2, i);
        Dialog A0n = super.A0n(bundle);
        A0n.setCanceledOnTouchOutside(false);
        A0n.setOnKeyListener(new C9oI(this, 1));
        return A0n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0p() {
        if (this.mFragmentManager != null) {
            super/*X.0D2*/.A0p();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        11T.A0F(fragment, 0);
        if (fragment instanceof MediaViewFragment) {
            6KV r0 = this.A02;
            if (r0 != null) {
                6KV.A00(r0, 1);
            }
            ((MediaViewFragment) fragment).A0Q = this.A0I;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        IllegalStateException A0N;
        int i;
        ArrayList A0s;
        ArrayList<String> stringArrayList;
        int A02 = 0FI.A02(1903932985);
        super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("media_viewer_theme_key");
        Parcelable.Creator creator = MediaViewerTheme.CREATOR;
        11T.A0B(creator);
        Object A01 = 0Gm.A01(creator, parcelable, MediaViewerTheme.class);
        if (A01 != null) {
            this.A04 = (MediaViewerTheme) A01;
            ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("media_message_items_key");
            if (parcelableArrayList != null) {
                this.A08 = parcelableArrayList;
                Parcelable parcelable2 = requireArguments().getParcelable("thread_key_key");
                Parcelable.Creator creator2 = ThreadKey.CREATOR;
                11T.A0B(creator2);
                Object A012 = 0Gm.A01(creator2, parcelable2, ThreadKey.class);
                if (A012 != null) {
                    this.A06 = (ThreadKey) A012;
                    try {
                        stringArrayList = requireArguments().getStringArrayList("restricted_features_theme_key");
                    } catch (IllegalArgumentException e) {
                        0fH.A0r("MediaGridViewFragment", "Invalid restricted features", e);
                        A0s = AnonymousClass001.A0s();
                    }
                    if (stringArrayList == null) {
                        IllegalArgumentException A0L = AnonymousClass001.A0L("Invalid restricted features in MediaGridViewFragment");
                        0FI.A08(-505812368, A02);
                        throw A0L;
                    }
                    ArrayList A0z = 1BL.A0z(stringArrayList);
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        String A0i = AnonymousClass001.A0i(it);
                        11T.A0D(A0i);
                        A0z.add(5VW.valueOf(A0i));
                    }
                    A0s = 1BK.A17(A0z);
                    this.A09 = A0s;
                    this.A0C = requireArguments().getBoolean("should_hide_forward_button_key", false);
                    this.A0B = requireArguments().getBoolean("should_hide_edit_button_key", false);
                    this.A0A = requireArguments().getBoolean("read_only_key", false);
                    Parcelable parcelable3 = requireArguments().getParcelable("message_key");
                    Parcelable.Creator creator3 = Message.CREATOR;
                    11T.A0B(creator3);
                    this.A05 = (Message) 0Gm.A01(creator3, parcelable3, Message.class);
                    this.A01 = 1BM.A01(this);
                    this.A02 = ((82O) 1Br.A0B(this.A0H)).A00(getActivity());
                    0FI.A08(1393522198, A02);
                    return;
                }
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = 1793553103;
            } else {
                A0N = AnonymousClass001.A0N("Required value was null.");
                i = -1076726800;
            }
        } else {
            A0N = AnonymousClass001.A0N("Required value was null.");
            i = 1145997187;
        }
        0FI.A08(i, A02);
        throw A0N;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-501817153);
        11T.A0F(layoutInflater, 0);
        View inflate = layoutInflater.inflate(2132542494, viewGroup, false);
        this.A00 = inflate.findViewById(2131365493);
        this.A0D = 7zL.A0b(inflate, 2131365492);
        0FI.A08(1305013004, A02);
        return inflate;
    }

    public void onDestroyView() {
        int A02 = 0FI.A02(737007131);
        super.onDestroyView();
        this.A00 = null;
        this.A0D = null;
        0FI.A08(-989389436, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        Activity A16;
        6KV r0;
        int A02 = 0FI.A02(-1075062339);
        super/*androidx.fragment.app.Fragment*/.onPause();
        if (!1XU.A00(getContext()) && (((A16 = A16()) == null || !A16.isChangingConfigurations()) && (r0 = this.A02) != null)) {
            6KV.A00(r0, 1);
        }
        0FI.A08(1575004431, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        int A02 = 0FI.A02(-1246044228);
        super/*androidx.fragment.app.Fragment*/.onResume();
        6KV r0 = this.A02;
        if (r0 != null) {
            6KV.A00(r0, -1);
        }
        0FI.A08(-1744605157, A02);
    }

    public void onStart() {
        Window window;
        int A02 = 0FI.A02(-1062863485);
        super/*X.0D2*/.onStart();
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            1Bn.A0A(16838);
            MediaViewerTheme mediaViewerTheme = this.A04;
            if (mediaViewerTheme == null) {
                11T.A0L("theme");
                throw 0Q8.createAndThrow();
            }
            1tC.A01(window, mediaViewerTheme.A01, mediaViewerTheme.A00);
        }
        0FI.A08(783930391, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        Activity A16;
        6KV r309;
        int i;
        int A02 = 0FI.A02(609290665);
        super/*X.0D2*/.onStop();
        1BV A00 = 1BV.A00(66570);
        if (!1XU.A00(getContext()) && ((A16 = A16()) == null || !A16.isChangingConfigurations())) {
            if (C6kc.A00((C6kc) A00.get()).AZk(36322559897126553L)) {
                r309 = this.A02;
                if (r309 != null) {
                    i = 1;
                    6KV.A00(r309, i);
                }
            } else if (C6kc.A00((C6kc) A00.get()).AZk(36322559897192090L)) {
                6KV r0 = this.A02;
                if (r0 != null) {
                    r0.A03();
                }
            } else {
                r309 = this.A02;
                if (r309 != null) {
                    i = -1;
                    6KV.A00(r309, i);
                }
            }
        }
        0FI.A08(1038550792, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onViewCreated(View view, Bundle bundle) {
        11T.A0F(view, 0);
        super.onViewCreated(view, bundle);
        MediaViewerTheme mediaViewerTheme = this.A04;
        String str = "theme";
        if (mediaViewerTheme != null) {
            int i = mediaViewerTheme.A01;
            int i2 = mediaViewerTheme.A00;
            View view2 = this.A00;
            if (view2 != null) {
                view2.setBackground(new C5be(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{i, i2}));
            }
            Context requireContext = requireContext();
            C00i c00i = this.A0E.A00;
            MigColorScheme A11 = 7zM.A11(c00i);
            ThreadKey threadKey = this.A06;
            str = "threadKey";
            if (threadKey != null) {
                FbUserSession fbUserSession = this.A01;
                if (fbUserSession != null) {
                    9Ca.A00(requireContext, fbUserSession, threadKey, A11, AVD.A01(this, 38));
                    LithoView lithoView = this.A0D;
                    if (lithoView != null) {
                        MigColorScheme A112 = 7zM.A11(c00i);
                        ArrayList arrayList = this.A08;
                        if (arrayList == null) {
                            str = "mediaMessageItems";
                        } else {
                            AVD A01 = AVD.A01(this, 39);
                            ThreadKey threadKey2 = this.A06;
                            if (threadKey2 != null) {
                                boolean A012 = C6yj.A01(threadKey2);
                                C66c c66c = (C66c) 1Br.A0B(this.A0G);
                                ThreadKey threadKey3 = this.A06;
                                if (threadKey3 != null) {
                                    lithoView.A0y(new 1LH(A112, c66c.A00(threadKey3), arrayList, A01, A012) { // from class: X.8at
                                        public final ArrayList A00;
                                        public final Function1 A01;
                                        public final MigColorScheme A02;
                                        public final C66e A03;
                                        public final boolean A04;

                                        {
                                            11T.A0F(A112, 1);
                                            this.A02 = A112;
                                            this.A00 = arrayList;
                                            this.A01 = A01;
                                            this.A04 = A012;
                                            this.A03 = r303;
                                        }

                                        public 1LI A0s(C2k5 c2k5) {
                                            11T.A0F(c2k5, 0);
                                            ArrayList arrayList2 = this.A00;
                                            AaM aaM = (AaM) AQr.A00(c2k5, this, new Object[]{arrayList2, this.A01}, 26);
                                            1Iw r0 = c2k5.A05;
                                            int dimensionPixelSize = 4YU.A0E(r0).getDimensionPixelSize(2132279328);
                                            ArrayList A0z = 1BL.A0z(arrayList2);
                                            Iterator it = arrayList2.iterator();
                                            while (it.hasNext()) {
                                                MediaMessageItem mediaMessageItem = (MediaMessageItem) it.next();
                                                String obj = mediaMessageItem.AqA().toString();
                                                int B0d = mediaMessageItem.B0d();
                                                int B0a = mediaMessageItem.B0a();
                                                Uri BFd = mediaMessageItem.BFd();
                                                if (BFd == null) {
                                                    BFd = mediaMessageItem.AqA();
                                                }
                                                Integer num = 0S2.A00;
                                                11T.A0D(obj);
                                                A0z.add(new 8K8(BFd, (ContributionReactionsViewState) null, num, obj, B0d, B0a, 0L, false));
                                            }
                                            Resources A0J = 7zQ.A0J(c2k5.AeS());
                                            8Lu r02 = new 8Lu(16, A0z, new 8K3((int) 7zO.A00(A0J, A0J.getDimension(2132279327)), (int) 7zO.A00(A0J, A0J.getDimension(2132279309)), (int) 7zO.A00(A0J, A0J.getDimension(R.dimen.mapbox_eight_dp)), (int) 7zO.A00(A0J, A0J.getDimension(2132279311))));
                                            2lQ r03 = 2lO.A02;
                                            return 7zN.A0R(new C8dp(null, r02, null, aaM, (MediaMessageItem) arrayList2.get(0), this.A02, this.A03, false, this.A04), 7zQ.A0U(r0), c2k5, 4YV.A0K((2lO) null, 0S2.A15, 7zO.A0B(dimensionPixelSize)));
                                        }
                                    });
                                }
                            }
                        }
                    }
                    View A0F = 7zL.A0F(this, 2131365556);
                    A0F.setVisibility(0);
                    AbR abR = (AbR) 7zO.A0l(this, 689);
                    Context requireContext2 = requireContext();
                    FbUserSession fbUserSession2 = this.A01;
                    if (fbUserSession2 != null) {
                        06Z childFragmentManager = getChildFragmentManager();
                        ThreadKey threadKey4 = this.A06;
                        if (threadKey4 != null) {
                            List list = this.A09;
                            if (list == null) {
                                str = "restrictedFeatures";
                            } else {
                                ImmutableSet A07 = ImmutableSet.A07(list);
                                MediaViewerTheme mediaViewerTheme2 = this.A04;
                                if (mediaViewerTheme2 == null) {
                                    str = str;
                                } else {
                                    boolean z = this.A0C;
                                    boolean z2 = this.A0A;
                                    if (this.A06 != null) {
                                        IDV A0d = abR.A0d(requireContext2, A0F, childFragmentManager, fbUserSession2, (CommunityHighlightsMediaViewerArgs) null, (SharedAlbumMediaViewerArgs) null, mediaViewerTheme2, threadKey4, A07, 0S2.A00, (String) null, true, z, true, true, z2, false, !r0.A16());
                                        this.A03 = A0d;
                                        str = "overlayController";
                                        A0d.A04();
                                        IDV idv = this.A03;
                                        if (idv != null) {
                                            idv.A0C = new 9wJ(this, this);
                                            idv.A03 = new 9wE(this);
                                            return;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                str = "fbUserSession";
            }
        }
        11T.A0L(str);
        throw 0Q8.createAndThrow();
    }
}
