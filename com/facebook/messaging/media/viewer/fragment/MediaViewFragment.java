package com.facebook.messaging.media.viewer.fragment;

import X.04J;
import X.06Z;
import X.0D2;
import X.0FI;
import X.0K6;
import X.0Pz;
import X.0S2;
import X.11T;
import X.1BJ;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1FV;
import X.1HH;
import X.1Lo;
import X.1MV;
import X.1P9;
import X.1PA;
import X.1UG;
import X.1XU;
import X.1iF;
import X.1lN;
import X.1pK;
import X.1tC;
import X.1uZ;
import X.2Oc;
import X.2Ov;
import X.2S0;
import X.2Wo;
import X.4YU;
import X.53S;
import X.53U;
import X.5P7;
import X.5Su;
import X.5zC;
import X.5zD;
import X.60U;
import X.6FW;
import X.6KV;
import X.6OJ;
import X.6QS;
import X.6xE;
import X.7HH;
import X.7V1;
import X.7zK;
import X.7zL;
import X.7zP;
import X.7zQ;
import X.82O;
import X.9EZ;
import X.9M2;
import X.9Xk;
import X.9Xm;
import X.9dK;
import X.9fZ;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbJ;
import X.AbK;
import X.AbL;
import X.AbR;
import X.AbstractC03573yf;
import X.AbstractC2326GOr;
import X.AbstractC2327GOs;
import X.AnonymousClass001;
import X.AnonymousClass086;
import X.AnonymousClass956;
import X.C00673oa;
import X.C00i;
import X.C00m;
import X.C06c;
import X.C07n;
import X.C08664ng;
import X.C0Ad;
import X.C0T0;
import X.C0T2;
import X.C0et;
import X.C2381Gbi;
import X.C2609Giy;
import X.C2yk;
import X.C5Pr;
import X.C5g1;
import X.C5xl;
import X.C62h;
import X.C6jQ;
import X.C6kc;
import X.C6r6;
import X.C6tC;
import X.C6x1;
import X.C6x5;
import X.C7t0;
import X.C87p;
import X.C9lG;
import X.CHy;
import X.CfG;
import X.DKG;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.GY9;
import X.H5s;
import X.H5u;
import X.HI0;
import X.HJN;
import X.HSH;
import X.HSI;
import X.HSK;
import X.HSP;
import X.HSQ;
import X.He7;
import X.HjL;
import X.HjM;
import X.Hqe;
import X.I43;
import X.I7J;
import X.IDV;
import X.IDn;
import X.IFw;
import X.IG3;
import X.IGb;
import X.ILT;
import X.IPt;
import X.IV3;
import X.IVj;
import X.IVk;
import X.IVl;
import X.IVm;
import X.IVw;
import X.IgM;
import X.IgO;
import X.Ilo;
import X.J5y;
import X.JK2;
import X.JLe;
import X.JLf;
import X.JLg;
import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.common.network.FbNetworkManager;
import com.facebook.common.ui.keyboard.CustomKeyboardLayout;
import com.facebook.inject.FbInjector;
import com.facebook.messaging.media.viewer.MediaPagerAdapter$MediaSaveState;
import com.facebook.messaging.media.viewer.MediaViewPager;
import com.facebook.messaging.media.viewer.communityhighlights.model.CommunityHighlightsMediaViewerArgs;
import com.facebook.messaging.media.viewer.fragment.MediaViewFragment;
import com.facebook.messaging.media.viewer.sharedalbum.model.SharedAlbumMediaViewerArgs;
import com.facebook.messaging.media.viewer.theme.MediaViewerTheme;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadCustomization;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.composer.MontageComposerFragment;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.photos.service.MediaMessageItem;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.sharedimage.sharedmediareactions.SharedMediaWithReactions;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.xapp.messaging.reactions.sendbar.colorstrategy.ReactionsBarColorStrategyParams;
import com.facebook.xapp.messaging.reactions.sendbar.fragment.ReactionsBarParams;
import com.facebook.xapp.messaging.threadview.theme.custom.model.ThreadThemeInfo;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.RegularImmutableSet;
import com.google.common.collect.SingletonImmutableSet;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: MediaViewFragment.class */
public class MediaViewFragment extends 2Ov implements 1lN, 2S0, 2Oc, CallerContextable {
    public float A00;
    public int A01;
    public Context A05;
    public View A06;
    public View A07;
    public View A08;
    public FbUserSession A09;
    public 6KV A0A;
    public C0et A0B;
    public AbR A0C;
    public AbR A0D;
    public C00i A0E;
    public IDV A0F;
    public MediaViewPager A0G;
    public IDn A0H;
    public Hqe A0I;
    public C9lG A0J;
    public HjL A0K;
    public HI0 A0L;
    public HjM A0M;
    public I7J A0N;
    public CommunityHighlightsMediaViewerArgs A0O;
    public HSI A0P;
    public JLe A0Q;
    public C2381Gbi A0R;
    public IPt A0S;
    public I43 A0T;
    public JK2 A0U;
    public SharedAlbumMediaViewerArgs A0V;
    public MediaViewerTheme A0W;
    public ThreadKey A0X;
    public MontageComposerFragment A0Z;
    public C08664ng A0a;
    public MediaMessageItem A0c;
    public MediaMessageItem A0d;
    public C5Pr A0e;
    public 53U A0f;
    public 53S A0g;
    public 2Wo A0h;
    public Integer A0k;
    public Executor A0n;
    public boolean A0o;
    public boolean A0q;
    public boolean A0r;
    public boolean A0s;
    public boolean A0u;
    public AbR A0v;
    public HSQ A0x;
    public 9M2 A0y;
    public final C00673oa A1Q = (C00673oa) 1Bi.A03(32771);
    public final C00i A19 = 1BQ.A02(66270);
    public final C00i A11 = 1BQ.A01();
    public final C00i A17 = 1BQ.A02(50098);
    public final C00i A1P = AbH.A0c(this);
    public final C00i A1C = 7zL.A0R(getContext(), 68143);
    public final C00i A1B = 7zL.A0R(getContext(), 67698);
    public final C00i A1F = 7zL.A0R(getContext(), 68596);
    public final C00i A1O = 1BV.A00(691);
    public final C00i A1G = 1BQ.A02(67528);
    public final C00i A1D = AbF.A0S(this, 65937);
    public final C00i A1E = 1BV.A00(68433);
    public final C00i A18 = 1BV.A00(66570);
    public final C00i A14 = 1BQ.A02(68024);
    public final C00i A16 = 1BV.A00(66557);
    public final C00i A13 = 1BQ.A02(66556);
    public final C00i A1I = AbH.A0F();
    public final C00i A1H = new 1HH(this, 99435);
    public final C00i A1M = AbH.A0N();
    public final C00i A10 = AbF.A0S(this, 82277);
    public final C00i A12 = 1BQ.A02(32888);
    public final C00i A1L = 1BQ.A02(47);
    public final C00i A1A = 7zL.A0R(getContext(), 67683);
    public final C00i A15 = 1BQ.A02(49965);
    public final QuickPerformanceLogger A1R = QuickPerformanceLoggerProvider.getQPLInstance();
    public final C00i A1N = 1BV.A00(68079);
    public final C00i A1K = 1BV.A00(68538);
    public final C00i A0z = GOo.A0J();
    public final HashSet A1J = AnonymousClass001.A0v();
    public ImmutableSet A0j = RegularImmutableSet.A05;
    public String A0l = null;
    public boolean A0t = false;
    public String A0m = null;
    public int A02 = 0;
    public int A04 = 0;
    public int A03 = 0;
    public boolean A0p = false;
    public MediaMessageItem A0b = null;
    public 5zD A0w = null;
    public ThreadThemeInfo A0i = null;
    public ThreadSummary A0Y = null;

    public static Bundle A05(MediaViewerTheme mediaViewerTheme, ThreadKey threadKey, MediaMessageItem mediaMessageItem, Integer num, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        Bundle A05 = 1BK.A05();
        A05.putParcelable("media_message_item", mediaMessageItem);
        A05.putString("media_viewer_entry_point", A07(num));
        A05.putBoolean("show_only_initial", z);
        A05.putParcelable("thread_key", threadKey);
        A05.putBoolean("should_hide_edit_button", z2);
        A05.putBoolean("should_hide_forward_button", z3);
        A05.putInt("video_starting_position_ms", i);
        A05.putBoolean("should_make_media_viewer_read_only", z4);
        A05.putBoolean("should_block_screenshots", z5);
        A05.putParcelable("MEDIA_VIEWER_THEME", mediaViewerTheme);
        if (str != null) {
            A05.putString("MEDIA_VIEWER_TITLE", str);
        }
        return A05;
    }

    public static CfG A06(MediaViewFragment mediaViewFragment) {
        if (((9Xk) mediaViewFragment.A1N.get()).A00()) {
            return ((CHy) 1Bn.A0E(mediaViewFragment.A05, (1BY) null, 82650)).A01(mediaViewFragment.A05, 2131960006);
        }
        return null;
    }

    public static String A07(Integer num) {
        switch (num.intValue()) {
            case 1:
                return "THREAD_SETTINGS";
            case 2:
                return "MEDIA_VIEWER_TO_SHARED_CONTENT";
            case 3:
                return "SHARED_ALBUMS";
            case 4:
                return "MEDIA_STACK_GRID_VIEW";
            case 5:
                return "COMMUNITY_HIGHLIGHTS";
            default:
                return "THREAD";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v139, types: [com.facebook.messaging.photos.service.MediaMessageItem] */
    /* JADX WARN: Type inference failed for: r0v37, types: [X.06c] */
    /* JADX WARN: Type inference failed for: r0v86, types: [com.facebook.xapp.messaging.reactions.sendbar.fragment.ReactionsBarFragment, androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r302v0, types: [androidx.fragment.app.Fragment, java.lang.Object, com.facebook.messaging.media.viewer.fragment.MediaViewFragment] */
    public static void A08(MotionEvent motionEvent, final MediaViewFragment mediaViewFragment) {
        if (mediaViewFragment.A0k == 0S2.A0N && ((C6jQ) mediaViewFragment.A1D.get()).A0A) {
            SharedMediaWithReactions sharedMediaWithReactions = null;
            IDn iDn = mediaViewFragment.A0H;
            if (iDn != null) {
                sharedMediaWithReactions = iDn.A05();
            }
            if (sharedMediaWithReactions instanceof SharedMediaWithReactions) {
                SharedMediaWithReactions sharedMediaWithReactions2 = sharedMediaWithReactions;
                final String str = sharedMediaWithReactions2.A02;
                long j = sharedMediaWithReactions2.A00;
                final Long valueOf = Long.valueOf(j);
                ?? A09 = AbJ.A09((Fragment) mediaViewFragment);
                String str2 = sharedMediaWithReactions2.A03;
                if (str2 == null) {
                    str2 = "";
                }
                Context context = mediaViewFragment.getContext();
                FbUserSession fbUserSession = mediaViewFragment.A09;
                ThreadKey threadKey = mediaViewFragment.A0X;
                06Z childFragmentManager = mediaViewFragment.getChildFragmentManager();
                C00i c00i = mediaViewFragment.A1P;
                7HH A00 = 9dK.A00(context, childFragmentManager, fbUserSession, threadKey, AbF.A0p(c00i));
                List A01 = 9dK.A01(mediaViewFragment.getContext(), A00);
                int rawY = (int) motionEvent.getRawY();
                Integer num = 0S2.A0C;
                ReactionsBarColorStrategyParams reactionsBarColorStrategyParams = new ReactionsBarColorStrategyParams(AbF.A0p(c00i).Abp(), AbF.A0p(c00i).B9e());
                EnumMap enumMap = new EnumMap(AnonymousClass956.class);
                boolean A002 = ((9Xm) mediaViewFragment.A1K.get()).A00();
                boolean A1Y = 7zP.A1Y(A01);
                SingletonImmutableSet singletonImmutableSet = new SingletonImmutableSet(str2);
                11T.A0D(singletonImmutableSet);
                ?? A003 = 9EZ.A00(new ReactionsBarParams(reactionsBarColorStrategyParams, num, str, enumMap, A01, singletonImmutableSet, rawY, A1Y ? 1 : 0, A1Y, A1Y, A002));
                C00i c00i2 = mediaViewFragment.A1F;
                9fZ r0 = (9fZ) c00i2.get();
                ThreadKey threadKey2 = mediaViewFragment.A0X;
                SharedAlbumMediaViewerArgs sharedAlbumMediaViewerArgs = mediaViewFragment.A0V;
                long j2 = sharedAlbumMediaViewerArgs != null ? sharedAlbumMediaViewerArgs.A00 : 0L;
                J5y j5y = new J5y(mediaViewFragment, 4);
                11T.A0F(threadKey2, A1Y ? 1 : 0);
                A003.A03 = new Ilo(r0, threadKey2, j5y, j2, j);
                A003.A05 = A00;
                A003.A0A = new C00m() { // from class: X.J60
                    @Override // X.C00m
                    public final Object invoke() {
                        MediaViewFragment mediaViewFragment2 = MediaViewFragment.this;
                        String str3 = str;
                        Long l = valueOf;
                        if (mediaViewFragment2.A0V != null) {
                            9fZ r02 = (9fZ) mediaViewFragment2.A1F.get();
                            ThreadKey threadKey3 = mediaViewFragment2.A0X;
                            long j3 = mediaViewFragment2.A0V.A00;
                            long parseLong = Long.parseLong(str3);
                            long longValue = l.longValue();
                            11T.A0F(threadKey3, 0);
                            7zQ.A0j(r02.A00).A0A(threadKey3, j3, parseLong, longValue, true);
                        }
                        return 04S.A00;
                    }
                };
                A09.A0O(A003, 1BJ.A00(1959));
                A09.A04();
                if (mediaViewFragment.A0V != null) {
                    9fZ r02 = (9fZ) c00i2.get();
                    ThreadKey threadKey3 = mediaViewFragment.A0X;
                    long j3 = mediaViewFragment.A0V.A00;
                    long parseLong = Long.parseLong(str);
                    11T.A0F(threadKey3, A1Y ? 1 : 0);
                    7zQ.A0j(r02.A00).A0C(threadKey3, "MEDIA_VIEWER", j3, parseLong, j);
                }
            }
            View view = mediaViewFragment.mView;
            if (view != null) {
                view.performHapticFeedback(0);
            }
        }
    }

    public static void A0C(final MediaViewPager mediaViewPager, final MediaViewFragment mediaViewFragment, int i, boolean z) {
        final ViewGroup.LayoutParams layoutParams;
        ValueAnimator ofInt;
        int i2;
        if (mediaViewPager == null || (layoutParams = mediaViewPager.getLayoutParams()) == null) {
            return;
        }
        View findViewById = mediaViewPager.getRootView().findViewById(R.id.content);
        int translationY = (int) mediaViewPager.getTranslationY();
        int height = findViewById == null ? 0 : findViewById.getHeight();
        View view = mediaViewFragment.A08;
        if (view != null && view.getVisibility() == 0) {
            height -= mediaViewFragment.A08.getHeight();
        }
        int[] A1b = GOn.A1b();
        A1b[0] = translationY;
        if (z) {
            A1b[1] = height;
            ofInt = ValueAnimator.ofInt(A1b);
            ofInt.setDuration(i + 250);
            final int i3 = height;
            final int i4 = 0;
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(i3, i4, layoutParams, mediaViewPager, mediaViewFragment) { // from class: X.9nd
                public final int A00;
                public final int A01;
                public final Object A02;
                public final Object A03;
                public final Object A04;

                {
                    this.A00 = i4;
                    this.A02 = mediaViewFragment;
                    this.A04 = mediaViewPager;
                    this.A01 = i3;
                    this.A03 = layoutParams;
                }

                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    if (this.A00 == 0) {
                        int A03 = AnonymousClass001.A03(valueAnimator.getAnimatedValue());
                        View view2 = (View) this.A04;
                        view2.setTranslationY(A03);
                        if (A03 == this.A01) {
                            ((ViewGroup.LayoutParams) this.A03).height = 0;
                            view2.requestLayout();
                            return;
                        }
                        return;
                    }
                    11T.A0F(valueAnimator, 0);
                    float A01 = 7zV.A01(valueAnimator);
                    C1rn c1rn = (C1rn) this.A03;
                    96X r0 = ((C8fb) this.A04).A00;
                    float f = r0.multiplier * (1.0f - A01);
                    float f2 = this.A01;
                    7zN.A1G(c1rn, f * f2);
                    7zN.A1G((C1rn) this.A02, r0.multiplier * (-A01) * f2);
                }
            });
            i2 = 6;
        } else {
            A1b[1] = 0;
            ofInt = ValueAnimator.ofInt(A1b);
            ofInt.setDuration(i + 100);
            ofInt.addUpdateListener(new IG3(mediaViewFragment, mediaViewPager, 1));
            i2 = 7;
        }
        ofInt.addListener(new IFw(mediaViewFragment, i2));
        0K6.A00(ofInt);
    }

    public static void A0E(MediaViewFragment mediaViewFragment) {
        Message Ax8;
        MediaMessageItem mediaMessageItem = mediaViewFragment.A0c;
        if (mediaMessageItem != null && (Ax8 = mediaMessageItem.Ax8()) != null && Ax8.A0V != null) {
            7V1 r0 = (7V1) 4YU.A0p(mediaViewFragment.A0E);
            r0.A00 = null;
            r0.A01 = null;
            r0.mMediaMessageListeners.clear();
            I43 i43 = mediaViewFragment.A0T;
            i43.getClass();
            i43.A01();
        }
        mediaViewFragment.A0p();
    }

    public static void A0F(MediaViewFragment mediaViewFragment) {
        C00i c00i = mediaViewFragment.A18;
        if (AbstractC2327GOs.A12(c00i, mediaViewFragment)) {
            A0H(mediaViewFragment);
        }
        IDV idv = mediaViewFragment.A0F;
        if (idv != null) {
            idv.A0I.setVisibility(8);
        }
        A0G(mediaViewFragment);
        if (AbstractC2327GOs.A11(c00i, mediaViewFragment)) {
            mediaViewFragment.A1C(-16777216, -16777216);
        }
    }

    public static void A0G(MediaViewFragment mediaViewFragment) {
        IDn iDn = mediaViewFragment.A0H;
        if (iDn != null) {
            if (iDn.A0F.A0A) {
                iDn.A09(iDn.A04);
            }
            mediaViewFragment.A0H.A06();
        }
        DKG.A1J(mediaViewFragment.A08);
        C9lG c9lG = mediaViewFragment.A0J;
        if (c9lG != null) {
            c9lG.A03();
        }
        mediaViewFragment.A07.setPadding(0, 0, 0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0H(MediaViewFragment mediaViewFragment) {
        Dialog dialog = ((0D2) mediaViewFragment).A01;
        if (dialog == null || dialog.getWindow() == null || AbstractC2326GOr.A0D(mediaViewFragment) == null) {
            return;
        }
        ((0D2) mediaViewFragment).A01.getWindow().addFlags(512);
        WindowManager.LayoutParams attributes = ((0D2) mediaViewFragment).A01.getWindow().getAttributes();
        if (HJN.A00(AbstractC2326GOr.A0D(mediaViewFragment))) {
            int i = 1;
            if (AbstractC2326GOr.A05(mediaViewFragment) == 2) {
                i = 0;
            }
            attributes.layoutInDisplayCutoutMode = i;
            ((0D2) mediaViewFragment).A01.getWindow().setAttributes(attributes);
        }
        C0T2 A06 = C0Ad.A06(AbstractC2326GOr.A0D(mediaViewFragment));
        if (A06 != null) {
            C0T0 c0t0 = A06.A00;
            c0t0.A01(2);
            c0t0.A00(7);
        }
    }

    public static void A0I(MediaViewFragment mediaViewFragment) {
        MediaViewerTheme mediaViewerTheme;
        if (mediaViewFragment.A0J == null || mediaViewFragment.A0w == null || !GOn.A0l(mediaViewFragment.A18).A02(mediaViewFragment.A0X)) {
            return;
        }
        ThreadSummary threadSummary = mediaViewFragment.A0Y;
        ThreadCustomization BF2 = threadSummary != null ? threadSummary.BF2() : mediaViewFragment.A0w.AgN();
        5zD r0 = mediaViewFragment.A0w;
        ThreadThemeInfo threadThemeInfo = mediaViewFragment.A0i;
        if (threadThemeInfo == null) {
            threadThemeInfo = r0.BEz();
        }
        r0.Cnr(mediaViewFragment.A0X, BF2, threadThemeInfo);
        C9lG c9lG = mediaViewFragment.A0J;
        5zD r02 = mediaViewFragment.A0w;
        C00i c00i = c9lG.A0H;
        ((5zC) c00i.get()).Cnq(r02.AgN(), r02.BEz());
        6QS r03 = c9lG.A01;
        if (r03 != null) {
            r03.A1u((5zD) c00i.get());
            if (((5zC) c00i.get()).AdM() == -1 && (mediaViewerTheme = c9lG.A04) != null) {
                AbH.A1K((View) c9lG.A01.A0A, mediaViewerTheme.A00);
            }
            C6kc A0l = GOn.A0l(c9lG.A0F);
            ThreadKey threadKey = c9lG.A0K;
            if (A0l.A02(threadKey)) {
                c9lG.A01.A1y(((6OJ) c9lG.A0G.get()).A00(threadKey, ((5Su) c9lG.A0D.get()).A01(), ((5zC) c00i.get()).A00.A07));
            }
        }
        C00i c00i2 = c9lG.A0E;
        if (c00i2 != null) {
            ((C62h) c00i2.get()).A06.A02(r02);
        }
    }

    public static void A0J(MediaViewFragment mediaViewFragment) {
        IDV idv = mediaViewFragment.A0F;
        if (idv != null) {
            if (idv.A0H.getVisibility() != 0) {
                mediaViewFragment.A0F.A0H.setVisibility(0);
            }
            mediaViewFragment.A0F.A0I.setVisibility(0);
        }
    }

    public static void A0K(MediaViewFragment mediaViewFragment) {
        IDn iDn = mediaViewFragment.A0H;
        if (iDn != null) {
            if (!iDn.A0F.A0A) {
                iDn.A09(iDn.A04);
            }
            mediaViewFragment.A0H.A07();
        }
        View view = mediaViewFragment.A08;
        if (view != null) {
            view.setVisibility(0);
        }
        C9lG c9lG = mediaViewFragment.A0J;
        if (c9lG != null) {
            c9lG.A04();
        }
        mediaViewFragment.A07.setPadding(0, mediaViewFragment.A02, mediaViewFragment.A04, mediaViewFragment.A03);
    }

    public static void A0L(MediaViewFragment mediaViewFragment) {
        Dialog dialog = ((0D2) mediaViewFragment).A01;
        if (dialog == null || dialog.getWindow() == null || AbstractC2326GOr.A0D(mediaViewFragment) == null) {
            return;
        }
        ((0D2) mediaViewFragment).A01.getWindow().clearFlags(512);
        C0T2 A06 = C0Ad.A06(AbstractC2326GOr.A0D(mediaViewFragment));
        if (A06 != null) {
            C0T0 c0t0 = A06.A00;
            c0t0.A01(2);
            c0t0.A02(7);
        }
    }

    public static void A0M(MediaViewFragment mediaViewFragment) {
        IDV idv = mediaViewFragment.A0F;
        if (idv != null) {
            View view = idv.A0I;
            int i = 0;
            if (view.getVisibility() == 0) {
                i = 8;
            }
            view.setVisibility(i);
        }
        IDn iDn = mediaViewFragment.A0H;
        if (iDn != null) {
            iDn.A09(Boolean.valueOf(mediaViewFragment.A0p));
        }
        View view2 = mediaViewFragment.A08;
        if (view2 != null) {
            int i2 = 8;
            if (view2.getVisibility() == 8) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
        C9lG c9lG = mediaViewFragment.A0J;
        if (c9lG != null) {
            if (c9lG.A08) {
                c9lG.A04();
            } else {
                c9lG.A03();
            }
        }
        C00i c00i = mediaViewFragment.A18;
        if (AbstractC2327GOs.A11(c00i, mediaViewFragment)) {
            if (mediaViewFragment.A0F.A0I.getVisibility() == 0) {
                MediaViewerTheme mediaViewerTheme = mediaViewFragment.A0W;
                mediaViewFragment.A1C(mediaViewerTheme.A01, mediaViewerTheme.A00);
            } else {
                mediaViewFragment.A1C(-16777216, -16777216);
            }
        }
        if (AbstractC2327GOs.A12(c00i, mediaViewFragment)) {
            if (mediaViewFragment.A0F.A0I.getVisibility() == 0) {
                A0L(mediaViewFragment);
                mediaViewFragment.A07.setPadding(0, mediaViewFragment.A02, mediaViewFragment.A04, mediaViewFragment.A03);
            } else {
                A0H(mediaViewFragment);
                mediaViewFragment.A07.setPadding(0, 0, 0, 0);
            }
        }
    }

    public static void A0N(MediaViewFragment mediaViewFragment, Boolean bool, String str) {
        IDn iDn = mediaViewFragment.A0H;
        MediaMessageItem A05 = iDn != null ? iDn.A05() : null;
        IDn iDn2 = mediaViewFragment.A0H;
        Object A01 = iDn2 != null ? IDn.A01(iDn2) : null;
        if (A05 != null && str.equals(A05.Aw7()) && (A01 instanceof H5u)) {
            ((H5u) A01).A02(A05, null, bool.booleanValue());
        }
    }

    public static void A0O(MediaViewFragment mediaViewFragment, Integer num) {
        MediaMessageItem mediaMessageItem;
        04J r305;
        int i;
        1UG A08;
        boolean z;
        I7J i7j = mediaViewFragment.A0N;
        if (i7j == null || (mediaMessageItem = mediaViewFragment.A0d) == null) {
            return;
        }
        ThreadKey threadKey = mediaViewFragment.A0X;
        Message Ax8 = mediaMessageItem.Ax8();
        Long valueOf = Long.valueOf(mediaMessageItem.AwL().A08);
        11T.A0F(threadKey, 1);
        switch (num.intValue()) {
            case 0:
                r305 = i7j.A02;
                i = 1962;
                break;
            case 1:
                String str = null;
                String str2 = null;
                A08 = 1BK.A08(i7j.A02, 1BJ.A00(1967));
                if (A08.isSampled()) {
                    String str3 = null;
                    if (Ax8 == null || !(60U.A06(Ax8) || C5g1.A02(Ax8))) {
                        z = false;
                    } else {
                        str2 = 60U.A04(Ax8);
                        str = 60U.A03(Ax8);
                        z = true;
                    }
                    A08.A7R("error_message", (String) null);
                    A08.A6H(TraceFieldType.ErrorCode, (Long) null);
                    A08.A7R("connection_quality", (String) null);
                    A08.A5c((C07n) null, "source_click_category");
                    I7J.A00(A08, i7j);
                    A08.A6H("duration", valueOf);
                    A08.A5c(AbstractC03573yf.A00(threadKey), "thread_type");
                    String str4 = null;
                    if (z) {
                        str4 = str2;
                    }
                    A08.A7R("media_source", str4);
                    if (z) {
                        str3 = str;
                    }
                    A08.A7R("creation_interface", str3);
                    A08.BZL();
                }
                return;
            case 2:
                r305 = i7j.A02;
                i = 1968;
                break;
            case 3:
                r305 = i7j.A02;
                i = 1961;
                break;
            case 4:
                r305 = i7j.A02;
                i = 1960;
                break;
            case 5:
                r305 = i7j.A02;
                i = 1963;
                break;
            default:
                return;
        }
        A08 = 1BK.A08(r305, 1BJ.A00(i));
        if (A08.isSampled()) {
            A08.A7R("error_message", (String) null);
            A08.A6H(TraceFieldType.ErrorCode, (Long) null);
            A08.A7R("connection_quality", (String) null);
            A08.A5c((C07n) null, "source_click_category");
            I7J.A00(A08, i7j);
            A08.A6H("duration", valueOf);
            A08.BZL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0P(MediaViewFragment mediaViewFragment, String str) {
        Dialog dialog = ((0D2) mediaViewFragment).A01;
        if (dialog != null && dialog.getWindow() != null) {
            ((0D2) mediaViewFragment).A01.getWindow().setSoftInputMode(32);
        }
        if (mediaViewFragment.A0d == null) {
            1BK.A09(mediaViewFragment.A11).D0v("MediaViewFragment", 0Pz.A0W("SelectedMediaItem is null when try to open ", str));
            return;
        }
        MontageComposerFragmentParams.Builder builder = new MontageComposerFragmentParams.Builder();
        if (!"Add to story".equals(str)) {
            builder.A04 = mediaViewFragment.A0X;
            builder.A02(mediaViewFragment.A0j);
        }
        builder.A09 = C6x1.A05;
        builder.A0a = true;
        builder.A04(AnonymousClass001.A0s());
        MediaMessageItem mediaMessageItem = mediaViewFragment.A0d;
        builder.A0F = mediaMessageItem.AwL();
        builder.A0C = C6x5.A06;
        builder.A03 = mediaMessageItem.Ax8();
        builder.A0D = !str.equals("Remix") ? !str.equals("Add to story") ? C6r6.A10 : C6r6.A0I : C6r6.A09;
        builder.A0L = Integer.valueOf(mediaViewFragment.A07.getPaddingLeft());
        builder.A0N = Integer.valueOf(mediaViewFragment.A07.getPaddingTop());
        builder.A0M = Integer.valueOf(mediaViewFragment.A07.getPaddingRight());
        builder.A0K = Integer.valueOf(mediaViewFragment.A07.getPaddingBottom());
        C7t0.A01(mediaViewFragment.getChildFragmentManager(), builder.A00(), NavigationTrigger.A03("messenger_photo_view"), 2131365551);
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x01ac, code lost:
    
        if (r310.equals(r302) == false) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0Q(com.facebook.messaging.media.viewer.fragment.MediaViewFragment r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.viewer.fragment.MediaViewFragment.A0Q(com.facebook.messaging.media.viewer.fragment.MediaViewFragment, java.lang.String):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x004c, code lost:
    
        if (r0[0] <= 1.0f) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0R(com.facebook.messaging.media.viewer.fragment.MediaViewFragment r301) {
        /*
            r0 = r301
            X.IDn r0 = r0.A0H
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L4f
            r0 = r302
            android.view.View r0 = X.IDn.A01(r0)
            r302 = r0
            r0 = r302
            boolean r0 = r0 instanceof X.H5u
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L4f
            r0 = r301
            X.IDn r0 = r0.A0H
            android.view.View r0 = X.IDn.A01(r0)
            X.H5u r0 = (X.H5u) r0
            com.facebook.samples.zoomable.ZoomableDraweeView r0 = r0.A0H
            X.IDm r0 = r0.A00
            r301 = r0
            r0 = r301
            X.11T.A0A(r0)
            r0 = r301
            android.graphics.Matrix r0 = r0.A04
            r302 = r0
            r0 = r301
            float[] r0 = r0.A09
            r301 = r0
            r0 = r302
            r1 = r301
            r0.getValues(r1)
            r0 = 0
            r302 = r0
            r0 = r301
            r1 = 0
            r0 = r0[r1]
            r304 = r0
            r0 = r304
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r305 = r0
            r0 = 1
            r303 = r0
            r0 = r305
            if (r0 > 0) goto L53
        L4f:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L53:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.viewer.fragment.MediaViewFragment.A0R(com.facebook.messaging.media.viewer.fragment.MediaViewFragment):boolean");
    }

    public Dialog A0n(Bundle bundle) {
        Activity A16;
        Window window;
        C00i c00i = this.A18;
        int i = 16973830;
        if (!AbstractC2327GOs.A12(c00i, this) && ((A16 = A16()) == null || (window = A16.getWindow()) == null || !HJN.A00(window.getDecorView()))) {
            i = 16973831;
        }
        A0g(2, i);
        Dialog A0n = super.A0n(bundle);
        A0n.setCanceledOnTouchOutside(false);
        A0n.setOnKeyListener(new IGb(this, 0));
        if (A0n.getWindow() != null) {
            A0n.getWindow().setBackgroundDrawableResource(R.color.transparent);
            C2yk.A00(A0n.getWindow(), -16777216);
        }
        C6kc A0l = GOn.A0l(c00i);
        ThreadKey threadKey = this.A0X;
        if ((C6kc.A00(A0l).AZk(36310469564367116L) || C6kc.A01(threadKey)) && A0n.getWindow() != null) {
            A0n.getWindow().getAttributes().windowAnimations = 2132608893;
        }
        return A0n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void A0p() {
        if (this.mFragmentManager != null) {
            super/*X.0D2*/.A0p();
        }
    }

    public 1iF A17() {
        return AbF.A0C(308851093610228L);
    }

    public void A1C(int i, int i2) {
        IDn iDn = this.A0H;
        if (iDn != null) {
            iDn.A07.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i2, i}));
        }
        HSI hsi = this.A0P;
        if (hsi != null) {
            MediaViewFragment mediaViewFragment = hsi.A00;
            Dialog dialog = ((0D2) mediaViewFragment).A01;
            if (dialog != null && dialog.getWindow() != null) {
                1Bn.A0A(16838);
                1tC.A01(((0D2) mediaViewFragment).A01.getWindow(), i, i2);
            }
        }
        if (this.A06 != null) {
            this.A06.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{i2, i}));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A1D(com.facebook.messaging.media.viewer.theme.MediaViewerTheme r302) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.viewer.fragment.MediaViewFragment.A1D(com.facebook.messaging.media.viewer.theme.MediaViewerTheme):void");
    }

    public String AWg() {
        return "messenger_photo_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CustomKeyboardLayout AgH() {
        2Wo r302 = this.A0h;
        if (r302 == null) {
            r302 = GOq.A0w(AbK.A0v(this.mView, 2131368396).A01(), 2131363502);
            this.A0h = r302;
        }
        return (CustomKeyboardLayout) r302.A01();
    }

    public Long Am7() {
        return 308851093610228L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean Bkd() {
        1pK r0 = this.A0R;
        if (r0 != null && r0.isAdded()) {
            C06c A09 = AbJ.A09(this);
            A09.A0I(this.A0R);
            A09.A05();
            return true;
        }
        2S0 r02 = this.A0Z;
        if (r02 != null && r02.isAdded()) {
            r02.Bkd();
            return true;
        }
        MediaViewPager mediaViewPager = this.A0G;
        if (mediaViewPager == null) {
            return false;
        }
        A0C(mediaViewPager, this, 0, true);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [java.lang.Object, X.JD0] */
    public void onAttachFragment(Fragment fragment) {
        6KV r0;
        if (fragment instanceof MontageComposerFragment) {
            if (!this.A0o && (r0 = this.A0A) != null) {
                6KV.A00(r0, 1);
            }
            MontageComposerFragment montageComposerFragment = (MontageComposerFragment) fragment;
            this.A0Z = montageComposerFragment;
            montageComposerFragment.A06 = new IVw(this);
            montageComposerFragment.A05 = new Object();
            montageComposerFragment.A01 = new HSP(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r305v55, types: [X.IVk, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        Integer num;
        IVl iVl;
        int A02 = 0FI.A02(931505735);
        super.onCreate(bundle);
        this.A05 = new 6FW(getContext(), 2132607926);
        this.A09 = 1BL.A0G(this);
        this.A0g = (53S) 1Bn.A0E(this.A05, (1BY) null, 49478);
        this.A0n = (Executor) 1Bi.A03(16467);
        this.A0S = (IPt) 1Bn.A0E(this.A05, (1BY) null, 68316);
        this.A0B = AbJ.A0E();
        this.A0v = (AbR) 1Bn.A0E(this.A05, (1BY) null, 692);
        this.A0A = ((82O) 1Bn.A0A(65571)).A00(this.A05);
        this.A0a = (C08664ng) 1Bn.A0A(49262);
        this.A0C = (AbR) 1Bn.A0E(this.A05, (1BY) null, 689);
        this.A0D = (AbR) 1Bn.A0E(this.A05, (1BY) null, 690);
        this.A0L = (HI0) 1Bn.A0A(115918);
        this.A0E = 1Lo.A02(this.A09, this, 50208);
        this.A0T = (I43) 1Lo.A04(this.A05, this.A09, (1BY) null, 115448);
        this.A0e = (C5Pr) 1Lo.A04(this.A05, this.A09, (1BY) null, 49712);
        this.A0X = (ThreadKey) AbG.A07(requireArguments(), "thread_key");
        this.A0c = (MediaMessageItem) AbG.A07(requireArguments(), "media_message_item");
        this.A0l = requireArguments().getString(7zK.A00(310));
        ArrayList A01 = AnonymousClass086.A01(requireArguments(), MediaMessageItem.class, 7zK.A00(377));
        this.A0W = AbstractC2327GOs.A11(this.A18, this) ? (MediaViewerTheme) AbG.A07(requireArguments(), "MEDIA_VIEWER_THEME") : new MediaViewerTheme(-16777216, -16777216, -1);
        String string = requireArguments().getString("media_viewer_entry_point");
        string.getClass();
        if (string.equals("THREAD")) {
            num = 0S2.A00;
        } else if (string.equals("THREAD_SETTINGS")) {
            num = 0S2.A01;
        } else if (string.equals("MEDIA_VIEWER_TO_SHARED_CONTENT")) {
            num = 0S2.A0C;
        } else if (string.equals("SHARED_ALBUMS")) {
            num = 0S2.A0N;
        } else if (string.equals("MEDIA_STACK_GRID_VIEW")) {
            num = 0S2.A0Y;
        } else {
            if (!string.equals("COMMUNITY_HIGHLIGHTS")) {
                throw AnonymousClass001.A0L(string);
            }
            num = 0S2.A0j;
        }
        this.A0k = num;
        I43 i43 = this.A0T;
        ThreadKey threadKey = this.A0X;
        threadKey.getClass();
        if (!threadKey.equals(i43.A02)) {
            i43.A01();
            i43.A02 = threadKey;
        }
        if (this.A0k != 0S2.A01) {
            I43 i432 = this.A0T;
            if (i432.A02 != null && !i432.A06) {
                boolean z = false;
                if (((1uZ) i432.A0A.get()).A07(i432.A02) || i432.A02.A0y()) {
                    z = true;
                }
                if (z) {
                    i432.A06 = true;
                    i432.A02(new IVj(i432), i432.A02);
                } else {
                    ThreadKey threadKey2 = i432.A02;
                    if (threadKey2.A0z()) {
                        i432.A06 = true;
                        1FV A00 = 5P7.A00((5P7) 1Br.A0B(i432.A0B.A00), 0, threadKey2.A01, -1);
                        i432.A03 = A00;
                        I43.A00(i432, A00);
                    }
                }
            }
        }
        ((7V1) this.A0E.get()).A02(this.A0X);
        if (this.A0k == 0S2.A0j) {
            this.A0p = true;
            this.A0W = new MediaViewerTheme(-1, -1, -16777216);
        }
        if (!requireArguments().getBoolean("show_only_initial", false)) {
            AbR abR = this.A0v;
            ThreadKey threadKey3 = this.A0X;
            Context A012 = FbInjector.A01();
            AbL.A0y(abR);
            try {
                new IVm(abR, threadKey3);
                1Bn.A0K();
                FbInjector.A04(A012);
            } catch (Throwable th) {
                1Bn.A0K();
                FbInjector.A04(A012);
                throw th;
            }
        } else if (A01 == null || A01.isEmpty()) {
            MediaMessageItem mediaMessageItem = this.A0c;
            ?? obj = new Object();
            ((IVk) obj).A00 = mediaMessageItem;
            iVl = obj;
        } else {
            iVl = new IVl(A01);
        }
        this.A0U = iVl;
        setHasOptionsMenu(true);
        this.A0q = requireArguments().getBoolean("should_hide_edit_button", false);
        this.A0r = requireArguments().getBoolean("should_hide_forward_button", false);
        this.A0s = requireArguments().getBoolean("should_make_media_viewer_read_only", false);
        if (requireArguments().getBoolean("should_block_screenshots", false)) {
            this.A0y = new 9M2();
        }
        this.A0o = requireArguments().getBoolean(7zK.A00(293), false);
        this.A0P = new HSI(this);
        this.A01 = requireArguments().getInt("video_starting_position_ms", 0);
        this.A0M = new HjM(this.A05, this.A0X);
        this.A0V = (SharedAlbumMediaViewerArgs) requireArguments().getParcelable(7zK.A00(350));
        this.A0O = (CommunityHighlightsMediaViewerArgs) requireArguments().getParcelable(7zK.A00(285));
        this.A0w = (5zD) 1Bn.A0E(this.A05, (1BY) null, 67704);
        this.A0m = requireArguments().getString("MEDIA_VIEWER_TITLE");
        ((C5xl) this.A1G.get()).ASY(this.A0X).observe(this, new ILT(this, 2));
        0FI.A08(-111279397, A02);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(1794611029);
        View A08 = AbG.A08(LayoutInflater.from(this.A05), viewGroup, 2132542521);
        0FI.A08(-1268280757, A02);
        return A08;
    }

    public void onDestroy() {
        IDn iDn;
        int A02 = 0FI.A02(-142816576);
        super.onDestroy();
        I43 i43 = this.A0T;
        i43.getClass();
        i43.A01 = null;
        this.A1J.clear();
        Activity A16 = A16();
        if ((A16 == null || !A16.isChangingConfigurations()) && (iDn = this.A0H) != null) {
            7V1 r0 = (7V1) 1Lo.A04((Context) null, iDn.A08, iDn.A01, 50208);
            r0.A00 = null;
            r0.A01 = null;
            r0.mMediaMessageListeners.clear();
        }
        0FI.A08(267413509, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        6QS r0;
        super/*X.0D2*/.onDismiss(dialogInterface);
        JLe jLe = this.A0Q;
        if (jLe != null) {
            jLe.Bti();
        }
        C9lG c9lG = this.A0J;
        if (c9lG == null || (r0 = c9lG.A01) == null) {
            return;
        }
        r0.A1b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        Activity A16;
        6KV r0;
        int A02 = 0FI.A02(701077969);
        super/*androidx.fragment.app.Fragment*/.onPause();
        if (!1XU.A00(getContext()) && (((A16 = A16()) == null || !A16.isChangingConfigurations()) && !this.A0o && (r0 = this.A0A) != null)) {
            6KV.A00(r0, 1);
        }
        IDV idv = this.A0F;
        if (idv != null) {
            JLf jLf = idv.A0B;
            if (jLf != null) {
                jLf.BdI();
            }
            JLf jLf2 = idv.A0A;
            if (jLf2 != null) {
                jLf2.BdI();
            }
        }
        0FI.A08(1845936680, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        6KV r0;
        int A02 = 0FI.A02(1540700819);
        super/*androidx.fragment.app.Fragment*/.onResume();
        9M2 r02 = this.A0y;
        if (r02 != null) {
            Dialog dialog = ((0D2) this).A01;
            r02.A00.A02(dialog != null ? dialog.getWindow() : null);
        }
        if (!this.A0o && (r0 = this.A0A) != null) {
            6KV.A00(r0, -1);
        }
        if (this.A0F.A0I.getVisibility() != 0) {
            A1C(-16777216, -16777216);
        }
        if (this.A0c.BTC()) {
            C00i c00i = this.A16;
            C6tC c6tC = (C6tC) c00i.get();
            if (((6xE) this.A13.get()).A01(this.A0X) && !C6tC.A02 && ((FbNetworkManager) 1Br.A0B(c6tC.A01)).A0N()) {
                ((C6tC) c00i.get()).A00 = new IV3(this);
                ((C6tC) c00i.get()).A00(getContext(), true, false);
            }
        }
        0FI.A08(-1285111428, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        MediaPagerAdapter$MediaSaveState mediaPagerAdapter$MediaSaveState;
        super/*X.0D2*/.onSaveInstanceState(bundle);
        IDn iDn = this.A0H;
        if (iDn != null) {
            Activity A16 = A16();
            if (A16 == null || !A16.isChangingConfigurations()) {
                mediaPagerAdapter$MediaSaveState = null;
            } else {
                GY9 gy9 = iDn.A0F;
                He7 he7 = gy9.A02;
                mediaPagerAdapter$MediaSaveState = null;
                if (he7 != null) {
                    MediaMessageItem A0I = gy9.A0I(he7.A00);
                    String Awv = A0I != null ? A0I.Awv() : null;
                    He7 he72 = gy9.A02;
                    H5s h5s = he72.A02;
                    C87p c87p = h5s != null ? h5s.A03 : null;
                    KeyEvent.Callback callback = he72.A01;
                    C2609Giy BJi = callback instanceof JLg ? ((JLg) callback).BJi() : null;
                    if (Awv != null && (BJi != null || c87p != null)) {
                        mediaPagerAdapter$MediaSaveState = new MediaPagerAdapter$MediaSaveState(c87p, BJi, Awv);
                    }
                }
            }
            bundle.putParcelable("VIEW_PAGER_STATE", mediaPagerAdapter$MediaSaveState);
            bundle.putBoolean("controls_visible", AnonymousClass001.A1O(this.A0F.A0I.getVisibility()));
            bundle.putInt("view_pager_position", this.A0H.A07.A0G());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        int i;
        int A02 = 0FI.A02(-1067100005);
        super/*X.0D2*/.onStart();
        QuickPerformanceLogger quickPerformanceLogger = this.A1R;
        if (quickPerformanceLogger != null) {
            quickPerformanceLogger.markerPoint(872953662, "warm_start_initialization");
        }
        if (this.A0U.isEmpty()) {
            A0E(this);
            i = 1253912312;
        } else {
            HSI hsi = this.A0P;
            if (hsi != null) {
                MediaViewerTheme mediaViewerTheme = this.A0W;
                int i2 = mediaViewerTheme.A01;
                int i3 = mediaViewerTheme.A00;
                MediaViewFragment mediaViewFragment = hsi.A00;
                Dialog dialog = ((0D2) mediaViewFragment).A01;
                if (dialog != null && dialog.getWindow() != null) {
                    1Bn.A0A(16838);
                    1tC.A01(((0D2) mediaViewFragment).A01.getWindow(), i2, i3);
                }
            }
            HjL hjL = this.A0K;
            if (hjL == null) {
                this.A0L.getClass();
                Context requireContext = requireContext();
                FbUserSession fbUserSession = this.A09;
                fbUserSession.getClass();
                hjL = new HjL(requireContext, fbUserSession, this.A0X);
                this.A0K = hjL;
                hjL.A02 = new HSK(this);
                hjL.A01 = new HSH(this);
            }
            1PA r306 = hjL.A00;
            if (r306 == null) {
                1MV A00 = 1Lo.A00(hjL.A03, hjL.A04, 50208);
                1P9 r0 = new 1P9(hjL.A05);
                r0.A05(new IgM(hjL), 1BJ.A00(6));
                r306 = 1P9.A01(r0, new IgO(A00, hjL), "com.facebook.orca.ACTION_MESSAGE_EXPIRED_FOR_UI");
                hjL.A00 = r306;
            }
            r306.A00();
            i = -516426913;
        }
        0FI.A08(i, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        1PA r0;
        Activity A16;
        6KV r309;
        int i;
        6KV r02;
        int A02 = 0FI.A02(1142511115);
        super/*X.0D2*/.onStop();
        if (!1XU.A00(getContext()) && ((A16 = A16()) == null || !A16.isChangingConfigurations())) {
            C00i c00i = this.A18;
            if (!GOp.A0k(c00i).AZk(36322559897126553L)) {
                boolean AZk = GOp.A0k(c00i).AZk(36322559897192090L);
                boolean z = this.A0o;
                if (AZk) {
                    if (!z && (r02 = this.A0A) != null) {
                        r02.A03();
                    }
                } else if (!z) {
                    r309 = this.A0A;
                    if (r309 != null) {
                        i = -1;
                        6KV.A00(r309, i);
                    }
                }
            } else if (!this.A0o) {
                r309 = this.A0A;
                if (r309 != null) {
                    i = 1;
                    6KV.A00(r309, i);
                }
            }
        }
        HjL hjL = this.A0K;
        if (hjL != null && (r0 = hjL.A00) != null && r0.A03()) {
            hjL.A00.A01();
        }
        0FI.A08(-1359569936, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x012c, code lost:
    
        if (X.C6tC.A03 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x03df, code lost:
    
        if (r308 == false) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v373, types: [X.2qQ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v583, types: [X.9Jb] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 2925
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.media.viewer.fragment.MediaViewFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
