package com.facebook.messaging.montage.viewer;

import X.03Y;
import X.09K;
import X.0D2;
import X.0FI;
import X.0S2;
import X.0WH;
import X.0fH;
import X.1BK;
import X.1BL;
import X.1BQ;
import X.1BV;
import X.1BY;
import X.1Bi;
import X.1Bn;
import X.1Br;
import X.1HH;
import X.1JF;
import X.1Js;
import X.1Kd;
import X.1Kh;
import X.1Lo;
import X.1hM;
import X.1iF;
import X.1tJ;
import X.23F;
import X.2Oc;
import X.2Ov;
import X.2Tc;
import X.2Wo;
import X.2qZ;
import X.2yD;
import X.48N;
import X.4YU;
import X.4iI;
import X.53R;
import X.5L4;
import X.5Pz;
import X.5Q1;
import X.5Rq;
import X.5Su;
import X.5zC;
import X.6KV;
import X.6Nq;
import X.6RU;
import X.6hT;
import X.6zV;
import X.6zX;
import X.7Ax;
import X.7BI;
import X.7FI;
import X.7Mg;
import X.7zN;
import X.7zU;
import X.8uM;
import X.8uN;
import X.9I0;
import X.AZP;
import X.AbF;
import X.AbG;
import X.AbH;
import X.AbI;
import X.AbstractC2395Gbx;
import X.AnonymousClass001;
import X.AnonymousClass823;
import X.C00i;
import X.C00j;
import X.C03073x0;
import X.C0A2;
import X.C2396Gby;
import X.C2397Gbz;
import X.C2398Gc0;
import X.C2794GoU;
import X.C2798Gob;
import X.C2799Goc;
import X.C2800God;
import X.C2803Gog;
import X.C2rv;
import X.C2rx;
import X.C3m1;
import X.C48H;
import X.C5S5;
import X.C5ct;
import X.C5sv;
import X.C6r6;
import X.C6x1;
import X.C6x5;
import X.C7c;
import X.DKC;
import X.DKE;
import X.DLP;
import X.EBv;
import X.EWd;
import X.FjE;
import X.GJe;
import X.GOn;
import X.GOo;
import X.GOp;
import X.GOq;
import X.GY8;
import X.H6A;
import X.HAG;
import X.HGG;
import X.HIP;
import X.HMM;
import X.HOI;
import X.HTm;
import X.Haz;
import X.Hg9;
import X.Hot;
import X.Hq6;
import X.HxC;
import X.I3U;
import X.I3e;
import X.I5N;
import X.I5R;
import X.I8O;
import X.IAR;
import X.ICj;
import X.ICk;
import X.IGb;
import X.IPw;
import X.IXA;
import X.IXB;
import X.IXC;
import X.IXE;
import X.IXG;
import X.IlV;
import X.Inh;
import X.InterfaceC00713oe;
import X.Ir4;
import X.JFK;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.common.ui.keyboard.CustomKeyboardLayout;
import com.facebook.litho.LithoView;
import com.facebook.messaging.media.mediapicker.mediapickerenvironment.MediaPickerEnvironment;
import com.facebook.messaging.model.attachment.Attachment;
import com.facebook.messaging.model.attachment.AttachmentImageMap;
import com.facebook.messaging.model.attachment.ImageData;
import com.facebook.messaging.model.attachment.ImageUrl;
import com.facebook.messaging.model.messages.Message;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.composer.model.MontageComposerFragmentParams;
import com.facebook.messaging.montage.model.MontageBucket;
import com.facebook.messaging.montage.model.MontageBucketPreview;
import com.facebook.messaging.montage.model.MontageCard;
import com.facebook.messaging.montage.model.MontageViewerContent;
import com.facebook.messaging.montage.viewer.replystatus.MontageViewerReplyStatusView;
import com.facebook.messaging.montage.viewer.swipeablemediapicker.MontageViewerSwipeableMediaPickerView;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.video.exoserviceclient.FbVpsController;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: MontageViewerFragment.class */
public class MontageViewerFragment extends 2Ov implements 2Oc {
    public static final long A1a = TimeUnit.SECONDS.toMillis(4);
    public long A03;
    public long A04;
    public Context A06;
    public FbUserSession A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public C00i A0B;
    public C00i A0C;
    public C00i A0D;
    public 9I0 A0E;
    public ThreadSummary A0F;
    public IAR A0G;
    public C2803Gog A0H;
    public H6A A0I;
    public HAG A0J;
    public HGG A0L;
    public ICk A0M;
    public IPw A0N;
    public EBv A0O;
    public NavigationTrigger A0P;
    public AnonymousClass823 A0Q;
    public 2Wo A0R;
    public 2Wo A0S;
    public 2Wo A0T;
    public 2Wo A0U;
    public 2Wo A0V;
    public 6RU A0W;
    public C2rx A0X;
    public String A0Z;
    public String A0a;
    public boolean A0e;
    public boolean A0g;
    public boolean A0h;
    public boolean A0i;
    public 6Nq A0k;
    public 6KV A0l;
    public C00i A0m;
    public C00i A0n;
    public C00i A0o;
    public C00i A0p;
    public GJe A0q;
    public DLP A0r;
    public String A0s;
    public String A0t;
    public String A0u;
    public boolean A0v;
    public ImmutableList.Builder A0Y = 4YU.A0h();
    public final C00i A10 = 1BQ.A01();
    public final C00i A1Q = 1BQ.A02(67918);
    public final C00i A1U = new 1HH(this, 67720);
    public final C00i A0x = AbH.A0a();
    public final C00i A1R = AbF.A0S(this, 695);
    public final C00i A1S = AbF.A0S(this, 696);
    public final C00i A16 = 1BV.A00(116016);
    public final C00i A1C = 1BQ.A02(16461);
    public final C00i A17 = AbH.A0L();
    public final C00i A1B = new 1HH(this, 99435);
    public final C00i A1V = 1BV.A00(65571);
    public final C00i A13 = GOo.A0K();
    public final C00i A15 = 1BQ.A02(67927);
    public final C00i A14 = AbF.A0S(this, 84064);
    public final C00i A12 = 1BQ.A02(49965);
    public final C00i A1L = 1BQ.A02(68543);
    public final C00i A1P = 1BQ.A02(68457);
    public final C00i A1M = 1BQ.A02(32976);
    public final C00i A0z = AbF.A0S(this, 49963);
    public final C00i A19 = 1BV.A00(99879);
    public final C00i A1D = AbF.A0S(this, 114924);
    public final C00i A1O = AbF.A0S(this, 114940);
    public final C00i A18 = new 1HH(this, 65898);
    public final C00i A1A = 1BV.A00(49882);
    public final C00i A11 = AbH.A0S();
    public final C00i A0w = GOo.A0J();
    public final C5S5 A1W = (C5S5) 1Bi.A03(67922);
    public final C03073x0 A1X = (C03073x0) 1Bi.A03(68571);
    public final 2Tc A1F = (2Tc) 1Bi.A03(67919);
    public final C00i A1T = 1BQ.A02(67262);
    public final C00i A0y = 1BV.A00(68304);
    public final C00i A1N = new 1HH(this, 100189);
    public int A01 = 0;
    public long A05 = 0;
    public boolean A0d = false;
    public boolean A0c = false;
    public boolean A0f = false;
    public final InterfaceC00713oe A1E = new 53R();
    public final C3m1 A1Y = new IlV(this);
    public final AZP A1I = new IXG(this);
    public final Set A1K = new 0WH(0);
    public int A02 = 0;
    public int A00 = 0;
    public final Set A1J = new 0WH(0);
    public 7Mg A0K = 7Mg.A0R;
    public String A0b = "";
    public final AtomicBoolean A1Z = DKC.A1E(false);
    public int A0j = 1;
    public final HTm A1G = new HTm(this);
    public final HxC A1H = new HxC(this);

    public static Uri A05(MontageBucket montageBucket) {
        ImageData imageData;
        AttachmentImageMap attachmentImageMap;
        MontageCard A0o = GOn.A0o(montageBucket);
        if (A0o != null && A0o.A01() != null && !A0o.A01().isEmpty() && (imageData = ((Attachment) 1BK.A0r(A0o.A01())).A07) != null && (attachmentImageMap = imageData.A03) != null) {
            48N r0 = 48N.A02;
            ImmutableMap immutableMap = attachmentImageMap.A01;
            if (immutableMap.get(r0) != null) {
                try {
                    return C0A2.A03(((ImageUrl) immutableMap.get(r0)).A02);
                } catch (SecurityException unused) {
                    return null;
                }
            }
        }
        return null;
    }

    public static Fragment A06(MontageViewerFragment montageViewerFragment) {
        H6A h6a = montageViewerFragment.A0I;
        if (h6a == null) {
            return null;
        }
        return GY8.A00(h6a, GOn.A08(montageViewerFragment));
    }

    public static MontageComposerFragmentParams A07(ThreadKey threadKey, MontageBucket montageBucket, MontageViewerFragment montageViewerFragment) {
        6zX r0 = new 6zX();
        boolean z = true;
        r0.A0N = true;
        r0.A0K = true;
        r0.A00 = threadKey;
        MediaPickerEnvironment mediaPickerEnvironment = new MediaPickerEnvironment(r0);
        Uri A05 = A05(montageBucket);
        MontageComposerFragmentParams.Builder builder = new MontageComposerFragmentParams.Builder();
        builder.A0C = C6x5.A02;
        builder.A04 = threadKey;
        C00i c00i = montageViewerFragment.A13;
        builder.A04(6zV.A04((5Q1) c00i.get()));
        builder.A09 = C6x1.A02;
        5Q1 r02 = (5Q1) c00i.get();
        C6r6 c6r6 = C6r6.A0S;
        builder.A03(6zV.A05(r02, c6r6));
        MontageCard A0o = GOn.A0o(montageBucket);
        builder.A0P = A0o == null ? null : A0o.A0E;
        if (C2rx.A03 != montageViewerFragment.A0X) {
            z = false;
        }
        builder.A0V = z;
        builder.A01 = mediaPickerEnvironment;
        builder.A0D = c6r6;
        if (A05 == null) {
            A05 = Uri.EMPTY;
        }
        builder.A00 = A05;
        return builder.A00();
    }

    public static C2397Gbz A08(MontageViewerFragment montageViewerFragment) {
        Object A06 = A06(montageViewerFragment);
        if (A06 instanceof C2397Gbz) {
            return (C2397Gbz) A06;
        }
        return null;
    }

    private String A0C(Bundle bundle) {
        String str;
        MontageBucketPreview montageBucketPreview;
        long j;
        if (bundle == null) {
            return null;
        }
        String str2 = this.A0s;
        if (str2 == null) {
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("thread_infos");
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("montage_viewer_content_infos");
            ArrayList<String> stringArrayList = bundle.getStringArrayList("bucket_ids");
            ArrayList<String> stringArrayList2 = bundle.getStringArrayList("viewer_content_ids");
            MontageCard montageCard = (MontageCard) bundle.getParcelable("archived_card");
            if (!09K.A01(stringArrayList) || !09K.A01(parcelableArrayList) || !09K.A01(parcelableArrayList2) || !09K.A01(stringArrayList2)) {
                if (09K.A00(parcelableArrayList2)) {
                    int i = bundle.getInt("starting_index", 0);
                    if (((MontageViewerContent) parcelableArrayList2.get(i)).A00 != null) {
                        montageBucketPreview = ((MontageViewerContent) parcelableArrayList2.get(i)).A00;
                        j = montageBucketPreview.A02.A00;
                        str = String.valueOf(j);
                    } else {
                        this.A0s = null;
                    }
                } else if (09K.A00(parcelableArrayList)) {
                    montageBucketPreview = (MontageBucketPreview) parcelableArrayList.get(bundle.getInt("starting_index", 0));
                    j = montageBucketPreview.A02.A00;
                    str = String.valueOf(j);
                } else if (09K.A00(stringArrayList2)) {
                    str = String.valueOf(stringArrayList2.get(bundle.getInt("starting_index", 0)));
                } else if (09K.A00(stringArrayList)) {
                    str = stringArrayList.get(0);
                }
                this.A0s = str;
            } else if (montageCard != null) {
                j = montageCard.A03;
                str = String.valueOf(j);
                this.A0s = str;
            }
            str2 = this.A0s;
        }
        return str2;
    }

    private void A0E() {
        LithoView lithoView;
        if (this.A0U != null) {
            boolean AZk = 1Br.A07(HMM.A00).AZk(36323637934050124L);
            2Wo r0 = this.A0U;
            if (!AZk) {
                lithoView = (LithoView) r0.A01();
                if (lithoView == null) {
                    return;
                }
            } else if (r0.A00 == null) {
                return;
            } else {
                lithoView = (LithoView) r0.A01();
            }
            lithoView.A0i();
            lithoView.A0w();
        }
    }

    private void A0F() {
        if (this.A0U.A05()) {
            A0M(this);
        }
        this.A0W = null;
        A0E();
    }

    private void A0G() {
        MontageBucket montageBucket;
        IAR iar = this.A0G;
        GOq.A0Y(this).A0A((iar == null || (montageBucket = iar.A02) == null) ? null : GOo.A0v(montageBucket), "exit_viewer", "tap");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0359  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0H(int r302, java.util.List r303, java.util.List r304, java.util.List r305) {
        /*
            Method dump skipped, instructions count: 1121
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.MontageViewerFragment.A0H(int, java.util.List, java.util.List, java.util.List):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x00d1, code lost:
    
        if (r0.equalsIgnoreCase("NEWSFEED") == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x043c, code lost:
    
        if (((X.1XZ) X.1Br.A0B(((X.I8O) r304.A16.get()).A05)).BX3(r0) == false) goto L49;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0I(android.content.Context r301, X.5Pz r302, com.facebook.messaging.model.messages.Message r303, com.facebook.messaging.montage.viewer.MontageViewerFragment r304) {
        /*
            Method dump skipped, instructions count: 1364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.MontageViewerFragment.A0I(android.content.Context, X.5Pz, com.facebook.messaging.model.messages.Message, com.facebook.messaging.montage.viewer.MontageViewerFragment):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0J(Context context, 5Pz r302, Message message, MontageViewerFragment montageViewerFragment, UserKey userKey) {
        IAR iar = montageViewerFragment.A0G;
        User user = null;
        if (iar != null && iar.A02 != null && montageViewerFragment.getContext() != null) {
            UserKey userKey2 = montageViewerFragment.A0G.A02.A02;
            FbUserSession fbUserSession = montageViewerFragment.A07;
            fbUserSession.getClass();
            23F r0 = (23F) 7zN.A0m(montageViewerFragment, fbUserSession, 33102);
            if (r0 != null) {
                user = r0.A00(userKey2);
            }
        }
        MontageViewerReplyStatusView montageViewerReplyStatusView = (MontageViewerReplyStatusView) montageViewerFragment.A0T.A01();
        montageViewerReplyStatusView.A08.A07(0.0d);
        montageViewerReplyStatusView.A06.setText(2131960789);
        if (user == null) {
            montageViewerReplyStatusView.A0A.A07(0.0d);
        } else {
            montageViewerReplyStatusView.A0B.A03(2qZ.A01(user));
            montageViewerReplyStatusView.A0A.A04();
        }
        montageViewerReplyStatusView.A09.A04();
        montageViewerReplyStatusView.removeCallbacks(montageViewerReplyStatusView.A0C);
        montageViewerReplyStatusView.A01 = false;
        if (message.A0V == null) {
            ((MontageViewerReplyStatusView) montageViewerFragment.A0T.A01()).A0E();
            GOo.A1K(AbF.A0v(montageViewerFragment.A1B), 2131967253);
            return;
        }
        IXC ixc = new IXC(r302, message, montageViewerFragment, user, userKey);
        IAR iar2 = montageViewerFragment.A0G;
        boolean z = true;
        Preconditions.checkState(AnonymousClass001.A1T(iar2));
        MontageBucket montageBucket = iar2.A02;
        if (montageBucket == null) {
            z = false;
        }
        Preconditions.checkState(z);
        A0K(context, montageBucket, new IXA(message, ixc, montageViewerFragment), montageViewerFragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.google.common.util.concurrent.ListenableFuture] */
    public static void A0K(Context context, MontageBucket montageBucket, final JFK jfk, MontageViewerFragment montageViewerFragment) {
        UserKey userKey;
        Object obj;
        Executor A1E = 1BK.A1E(montageViewerFragment.A1C);
        if (montageBucket == null || (userKey = montageBucket.A02) == null) {
            final Haz haz = new Haz(null, null);
            A1E.execute(new Runnable() { // from class: X.Iwd
                public static final String __redex_internal_original_name = "MontageViewerFragment$$ExternalSyntheticLambda10";

                @Override // java.lang.Runnable
                public final void run() {
                    jfk.CI0(haz);
                }
            });
            return;
        }
        C5sv c5sv = (C5sv) 1Bn.A0A(83790);
        C7c c7c = (C7c) 1Bn.A0E(context, (1BY) null, 82653);
        Haz haz2 = new Haz(4iI.A00((4iI) montageViewerFragment.A1U.get(), userKey), null);
        if (c5sv.A00()) {
            1Js r0 = userKey.type;
            1Js r02 = 1Js.A03;
            Preconditions.checkArgument(AnonymousClass001.A1W(r0, r02));
            1Kh r03 = new 1Kh();
            r03.A02(r02, userKey.id);
            r03.A0t = montageBucket.A04;
            User user = new User(r03);
            FbUserSession fbUserSession = montageViewerFragment.A07;
            fbUserSession.getClass();
            obj = c7c.A01(fbUserSession, user);
        } else {
            obj = 1hM.A01;
        }
        1Kd.A0F(new Inh(6, jfk, haz2, montageViewerFragment), obj, A1E);
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
    /* JADX WARN: Not initialized variable reg: 325, insn: 0x02b5: MOVE (r0 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r325 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]), block:B:98:0x02b5 */
    private void A0L(com.facebook.messaging.montage.model.MontageBucket r302, java.lang.Integer r303, java.lang.String r304, int r305, boolean r306) {
        /*
            Method dump skipped, instructions count: 699
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.MontageViewerFragment.A0L(com.facebook.messaging.montage.model.MontageBucket, java.lang.Integer, java.lang.String, int, boolean):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0M(MontageViewerFragment montageViewerFragment) {
        montageViewerFragment.A0U.A02();
        montageViewerFragment.A01 = 0;
        6RU r0 = montageViewerFragment.A0W;
        if (r0 != null) {
            7FI.A02(r0, 7Ax.A02);
        }
        montageViewerFragment.A0R.A02();
        montageViewerFragment.A0S.A02();
        C2397Gbz A08 = A08(montageViewerFragment);
        if (A08 != null) {
            A08.A1i(false);
        }
        A0Q(montageViewerFragment);
        if (montageViewerFragment.mView == null || !1BK.A0N(montageViewerFragment.A0w).AZk(72341130599141818L)) {
            return;
        }
        ((InputMethodManager) montageViewerFragment.A1N.get()).hideSoftInputFromWindow(montageViewerFragment.mView.getWindowToken(), 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0516  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0N(final com.facebook.messaging.montage.viewer.MontageViewerFragment r301) {
        /*
            Method dump skipped, instructions count: 1600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.MontageViewerFragment.A0N(com.facebook.messaging.montage.viewer.MontageViewerFragment):void");
    }

    public static void A0O(MontageViewerFragment montageViewerFragment) {
        int i;
        IAR A06;
        ICk iCk;
        MontageBucket montageBucket;
        if (montageViewerFragment.A0J == HAG.A05) {
            montageViewerFragment.A0F();
            int A08 = GOn.A08(montageViewerFragment);
            ICk iCk2 = montageViewerFragment.A0M;
            if (iCk2 != null) {
                IAR A062 = iCk2.A06(A08);
                IAR iar = montageViewerFragment.A0G;
                boolean z = false;
                if (iar == null || A062 == null) {
                    i = A08;
                } else {
                    i = montageViewerFragment.A0M.A05(iar);
                    if (A08 < i) {
                        z = true;
                    }
                }
                String str = null;
                if (montageViewerFragment.A00 == 1 && montageViewerFragment.A02 == 2) {
                    MontageBucket montageBucket2 = A062 == null ? null : A062.A02;
                    if (z) {
                        montageViewerFragment.A0L(montageBucket2, 0S2.A0j, "prev_bucket", A08, montageViewerFragment.A0b(i));
                        A0U(montageViewerFragment, "EDGE_SWIPE_BACKWARD");
                    } else {
                        montageViewerFragment.A0L(montageBucket2, 0S2.A0Y, "next_bucket", A08, montageViewerFragment.A0b(i));
                        A0U(montageViewerFragment, "EDGE_SWIPE_FORWARD");
                    }
                }
                montageViewerFragment.A0G = A062;
                ICj A0Y = GOq.A0Y(montageViewerFragment);
                if (A062 != null && (montageBucket = A062.A02) != null) {
                    str = GOo.A0v(montageBucket);
                }
                A0Y.A08(str, "onCurrentMontageChanged");
                Integer num = !montageViewerFragment.A0f ? 0S2.A00 : 0S2.A0C;
                IPw iPw = montageViewerFragment.A0N;
                if (iPw != null) {
                    FbUserSession fbUserSession = montageViewerFragment.A07;
                    fbUserSession.getClass();
                    iPw.A03(fbUserSession, num, A08, A0c(montageViewerFragment));
                }
                if (A08 != 2 || (A06 = montageViewerFragment.A0M.A06(1)) == null || A06.A00 != 5 || (iCk = montageViewerFragment.A0M) == null || iCk.A06(1) == null || montageViewerFragment.A0M.A06(1).A00 != 5) {
                    return;
                }
                montageViewerFragment.A0M.A09.remove(1);
                montageViewerFragment.A0M.A07();
                H6A h6a = montageViewerFragment.A0I;
                if (h6a instanceof C2794GoU) {
                    C2794GoU c2794GoU = (C2794GoU) h6a;
                    c2794GoU.A00 = true;
                    new Handler().postDelayed(new Ir4(c2794GoU), 500L);
                }
                montageViewerFragment.A0I.A09();
                montageViewerFragment.A0O.A0Q(1, false);
            }
        }
    }

    public static void A0P(MontageViewerFragment montageViewerFragment) {
        Object A06 = A06(montageViewerFragment);
        if (A06 != null) {
            if (A06 instanceof C2397Gbz) {
                C2397Gbz c2397Gbz = (C2397Gbz) A06;
                C2397Gbz.A0j(c2397Gbz);
                C2397Gbz.A0i(c2397Gbz);
                return;
            }
            if (A06 instanceof C2398Gc0) {
                C2398Gc0 c2398Gc0 = (C2398Gc0) A06;
                I5N i5n = c2398Gc0.A0H;
                i5n.A09 = c2398Gc0.A0K.A1C();
                I5N.A00(i5n);
                return;
            }
            if (A06 instanceof C2396Gby) {
                C2396Gby c2396Gby = (C2396Gby) A06;
                MontageViewerFragment montageViewerFragment2 = c2396Gby.A08;
                if (montageViewerFragment2 == null || !montageViewerFragment2.A1C()) {
                    c2396Gby.A1Y(C2396Gby.A03(c2396Gby));
                    return;
                } else {
                    c2396Gby.A1X();
                    return;
                }
            }
            if ((A06 instanceof C2803Gog) || (A06 instanceof 8uN) || (A06 instanceof 8uM)) {
                AbstractC2395Gbx abstractC2395Gbx = (AbstractC2395Gbx) A06;
                MontageViewerFragment montageViewerFragment3 = abstractC2395Gbx.A02;
                if (montageViewerFragment3 == null || !montageViewerFragment3.A1C()) {
                    7zU.A1P(abstractC2395Gbx);
                } else {
                    abstractC2395Gbx.A1e();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r301.A1K.isEmpty() == false) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0Q(com.facebook.messaging.montage.viewer.MontageViewerFragment r301) {
        /*
            r0 = r301
            X.EBv r0 = r0.A0O
            r302 = r0
            r0 = r301
            X.2Wo r0 = r0.A0U
            r303 = r0
            r0 = r303
            boolean r0 = r0.A05()
            r304 = r0
            r0 = r304
            if (r0 != 0) goto L27
            r0 = r301
            java.util.Set r0 = r0.A1K
            r303 = r0
            r0 = r303
            boolean r0 = r0.isEmpty()
            r305 = r0
            r0 = 1
            r304 = r0
            r0 = r305
            if (r0 != 0) goto L2b
        L27:
            r0 = 0
            r304 = r0
            r0 = 0
            r303 = r0
        L2b:
            r0 = r302
            r1 = r304
            r0.A02 = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.MontageViewerFragment.A0Q(com.facebook.messaging.montage.viewer.MontageViewerFragment):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0R(MontageViewerFragment montageViewerFragment, UserKey userKey) {
        if (montageViewerFragment.A0L != null) {
            if (montageViewerFragment.requireArguments().getInt("extra_render_destination", 1) != 2) {
                A0X(montageViewerFragment, true);
            }
            HashMap A0u = AnonymousClass001.A0u();
            A0u.put("mt", montageViewerFragment.A0a() ? "unseen" : "seen");
            ((I8O) montageViewerFragment.A16.get()).A01(montageViewerFragment.A0G, A0u);
            montageViewerFragment.A0L.A0A(userKey, montageViewerFragment.A0a, A0u);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0S(MontageViewerFragment montageViewerFragment, Integer num) {
        C2397Gbz A08;
        MontageBucket montageBucket;
        int i;
        int i2;
        ICk iCk;
        IAR A06;
        IAR iar;
        MontageBucket montageBucket2;
        if (montageViewerFragment.A0I != null) {
            montageViewerFragment.A0F();
            HAG hag = montageViewerFragment.A0J;
            HAG hag2 = HAG.A05;
            if (hag != hag2 || (iar = montageViewerFragment.A0G) == null || montageViewerFragment.A0M == null || (montageBucket2 = iar.A02) == null || montageBucket2.A00() <= 0 || montageViewerFragment.A0G.A02.A04()) {
                if (montageViewerFragment.A0J != HAG.A01) {
                    HGG hgg = montageViewerFragment.A0L;
                    if (hgg != null) {
                        03Y A062 = hgg.A06(num);
                        if (AnonymousClass001.A1V(A062.first)) {
                            0fH.A0g(hgg, "MontageViewerFragment", "Moving to next card of the last story clip is successfully handled by MontageViewerFragmentListener implementation:%s.");
                            return;
                        }
                        0fH.A0g(A062.second, "MontageViewerFragment", "Moving to next card of the last story clip is failed by: %s");
                    }
                    if (HIP.A00(montageViewerFragment)) {
                        num.getClass();
                        if (montageViewerFragment.A0I == null) {
                            return;
                        }
                        montageViewerFragment.A0F();
                        if (montageViewerFragment.A0J != hag2) {
                            return;
                        }
                        IAR iar2 = montageViewerFragment.A0G;
                        if (iar2 == null || montageViewerFragment.A0M == null || (montageBucket = iar2.A02) == null || (montageBucket.A03 != null && montageBucket.A00 == 0)) {
                            if (GOn.A08(montageViewerFragment) != 0 || (A08 = A08(montageViewerFragment)) == null) {
                                return;
                            }
                            A08.A1d();
                            return;
                        }
                        montageViewerFragment.A0L(montageBucket, num, "first_thread", GOn.A08(montageViewerFragment), montageViewerFragment.A0b(GOn.A08(montageViewerFragment)));
                        ICk iCk2 = montageViewerFragment.A0M;
                        long j = montageViewerFragment.A0G.A02.A01.A00;
                        String str = num.intValue() != 0 ? "SWIPE_FORWARD" : "AUTO_PLAY";
                        boolean A0c = A0c(montageViewerFragment);
                        C00j.A05("MontageViewerDataManager.setCurrentCardIndex", 77775072);
                        try {
                            AbI.A1N(iCk2.A05);
                            IAR A063 = iCk2.A06(iCk2.A04(j));
                            if (A063 != null) {
                                MontageBucket montageBucket3 = A063.A02;
                                if (montageBucket3 != null && montageBucket3.A00() != 0 && 0 < montageBucket3.A00()) {
                                    ICk.A02(montageBucket3.A01(0), iCk2, 0S2.A0N, str, false, A0c);
                                    i2 = -399048144;
                                }
                            }
                            i2 = -1185271415;
                        } catch (Throwable th) {
                            th = th;
                            i = 718065547;
                            C00j.A01(i);
                            throw th;
                        }
                    } else {
                        if (montageViewerFragment.A0U.A05()) {
                            A0M(montageViewerFragment);
                        }
                        int A082 = GOn.A08(montageViewerFragment);
                        if (montageViewerFragment.A0J == hag2 && (iCk = montageViewerFragment.A0M) != null && iCk.A06(A082 + 1) != null) {
                            int A083 = GOn.A08(montageViewerFragment) + 1;
                            ICk iCk3 = montageViewerFragment.A0M;
                            MontageBucket montageBucket4 = null;
                            if (iCk3 != null && (A06 = iCk3.A06(A083)) != null) {
                                montageBucket4 = A06.A02;
                            }
                            montageViewerFragment.A0L(montageBucket4, num, "next_bucket", A083, montageViewerFragment.A0b(GOn.A08(montageViewerFragment)));
                            A0U(montageViewerFragment, num.intValue() != 0 ? "SWIPE_FORWARD" : "AUTO_PLAY");
                            montageViewerFragment.A0O.A0Q(A083, true);
                            return;
                        }
                        A0U(montageViewerFragment, num.intValue() != 0 ? "SWIPE_FORWARD" : "AUTO_PLAY");
                    }
                }
                ((0D2) montageViewerFragment).A07 = false;
                A0X(montageViewerFragment, false);
                return;
            }
            montageViewerFragment.A0L(montageViewerFragment.A0G.A02, num, "next_thread", GOn.A08(montageViewerFragment), montageViewerFragment.A0b(GOn.A08(montageViewerFragment)));
            ICk iCk4 = montageViewerFragment.A0M;
            long j2 = montageViewerFragment.A0G.A02.A01.A00;
            String str2 = num.intValue() != 0 ? "SWIPE_FORWARD" : "AUTO_PLAY";
            boolean A0c2 = A0c(montageViewerFragment);
            C00j.A05("MontageViewerDataManager.incrementCurrentCardIndex", 1823739227);
            try {
                AbI.A1N(iCk4.A05);
                IAR A064 = iCk4.A06(iCk4.A04(j2));
                if (A064 != null) {
                    MontageBucket montageBucket5 = A064.A02;
                    if (montageBucket5 != null && montageBucket5.A00() != 0 && !montageBucket5.A04()) {
                        ICk.A02(montageBucket5.A01(montageBucket5.A00 + 1), iCk4, 0S2.A0C, str2, false, A0c2);
                        i2 = 841014688;
                    }
                }
                i2 = 1328611096;
            } catch (Throwable th2) {
                th = th2;
                i = -589253426;
                C00j.A01(i);
                throw th;
            }
            C00j.A01(i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0044, code lost:
    
        if (com.google.common.base.Objects.equal(java.lang.Long.valueOf(r303), java.lang.Long.valueOf(r0.A01.A00)) == false) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0T(com.facebook.messaging.montage.viewer.MontageViewerFragment r301, java.lang.Integer r302, long r303) {
        /*
            Method dump skipped, instructions count: 540
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.MontageViewerFragment.A0T(com.facebook.messaging.montage.viewer.MontageViewerFragment, java.lang.Integer, long):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:148:0x0950, code lost:
    
        if (com.google.common.base.Objects.equal(r0.A0E, r0) == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00d5, code lost:
    
        if (r0.A0p == false) goto L18;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:91:0x127a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x128c  */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.Gbz, androidx.fragment.app.Fragment] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0U(com.facebook.messaging.montage.viewer.MontageViewerFragment r301, java.lang.String r302) {
        /*
            Method dump skipped, instructions count: 4809
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.MontageViewerFragment.A0U(com.facebook.messaging.montage.viewer.MontageViewerFragment, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0V(MontageViewerFragment montageViewerFragment, String str) {
        IAR iar;
        MontageBucket montageBucket;
        Preconditions.checkState(AnonymousClass001.A1W(montageViewerFragment.A0J, HAG.A05));
        C2397Gbz A08 = A08(montageViewerFragment);
        if (A08 == null || (iar = montageViewerFragment.A0G) == null || (montageBucket = iar.A02) == null || montageBucket.A02 == null) {
            return;
        }
        MontageCard A0o = GOn.A0o(montageBucket);
        Capabilities capabilities = (A0o == null || !C48H.A00(A0o.A0H)) ? 1Br.A07(HMM.A00).AZk(36323637933984587L) ? HOI.A03 : HOI.A00 : HOI.A02;
        Context requireContext = montageViewerFragment.requireContext();
        A0K(requireContext, montageViewerFragment.A0G.A02, new IXE(A08, montageViewerFragment, capabilities, requireContext, str, 0), montageViewerFragment);
    }

    public static void A0W(MontageViewerFragment montageViewerFragment, String str) {
        C2397Gbz A08 = A08(montageViewerFragment);
        if (A08 != null) {
            Hg9 hg9 = GOo.A0Q(A08).A05;
            if (str.isEmpty()) {
                hg9.A03.setText(2131960788);
            } else {
                hg9.A03.setText(str);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void A0X(MontageViewerFragment montageViewerFragment, boolean z) {
        montageViewerFragment.A0G();
        ((I3U) 4YU.A0p(montageViewerFragment.A0p)).A01();
        C5ct c5ct = (C5ct) montageViewerFragment.A1P.get();
        FbUserSession fbUserSession = montageViewerFragment.A07;
        fbUserSession.getClass();
        c5ct.A04 = false;
        C5ct.A03(fbUserSession, c5ct);
        5L4 r0 = ((FbVpsController) montageViewerFragment.A1M.get()).A0S;
        if (r0 != null) {
            r0.A0C();
        }
        if (montageViewerFragment.mFragmentManager != null) {
            super/*X.0D2*/.A0p();
        }
        montageViewerFragment.A0Z(z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:92:0x0118, code lost:
    
        if (r0 == X.HAG.A01) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0Y(com.facebook.messaging.montage.viewer.MontageViewerFragment r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.MontageViewerFragment.A0Y(com.facebook.messaging.montage.viewer.MontageViewerFragment, boolean):void");
    }

    private void A0Z(boolean z) {
        MontageBucket montageBucket;
        MontageCard A0o;
        if (this.A0L == null || GOp.A1a(this.A1Z)) {
            return;
        }
        HGG hgg = this.A0L;
        IAR iar = this.A0G;
        hgg.A03((iar == null || (montageBucket = iar.A02) == null || (A0o = GOn.A0o(montageBucket)) == null) ? 0L : A0o.A03, z, this.A0v);
    }

    private boolean A0a() {
        MontageBucket montageBucket;
        MontageCard A0o;
        if (!this.A0i) {
            IAR iar = this.A0G;
            boolean z = false;
            if (iar != null && (montageBucket = iar.A02) != null && (A0o = GOn.A0o(montageBucket)) != null) {
                if (!this.A1J.contains(A0o.A0E)) {
                    z = A0o.A0N;
                }
            }
            return z;
        }
        return true;
    }

    private boolean A0b(int i) {
        H6A h6a = this.A0I;
        boolean z = false;
        if (h6a != null) {
            Object A00 = GY8.A00(h6a, i);
            if (A00 instanceof C2397Gbz) {
                C2397Gbz c2397Gbz = (C2397Gbz) A00;
                if (!c2397Gbz.A0o && !c2397Gbz.A0p) {
                    z = true;
                }
            }
        }
        return z;
    }

    public static boolean A0c(MontageViewerFragment montageViewerFragment) {
        2yD A07;
        long j;
        int ordinal = montageViewerFragment.A0K.ordinal();
        boolean z = true;
        if (ordinal != 26) {
            if (ordinal == 10) {
                A07 = 1Br.A07(montageViewerFragment.A1X.A00);
                j = 36324831935615106L;
            }
            return z;
        }
        A07 = 1Br.A07(montageViewerFragment.A1X.A00);
        j = 2342167841149243521L;
        z = A07.AZk(j);
        return z;
    }

    public Dialog A0n(Bundle bundle) {
        int i = 2132608335;
        if (this.A1W.A00.AZk(72341323872473684L)) {
            i = 2132608336;
        }
        A0g(2, i);
        Dialog A0n = super.A0n(bundle);
        A0n.setCanceledOnTouchOutside(false);
        A0n.setOnKeyListener(new IGb(this, 1));
        return A0n;
    }

    public void A0o() {
        A0X(this, false);
    }

    public void A0p() {
        A0X(this, false);
    }

    public 1iF A17() {
        return AbF.A0C(1567251216773138L);
    }

    public boolean A1C() {
        boolean z = true;
        if (this.A02 != 1) {
            AnonymousClass823 anonymousClass823 = this.A0Q;
            if (!anonymousClass823.A09 && Math.abs((int) anonymousClass823.A0E.getTranslationY()) == 0 && !this.A0U.A05()) {
                z = false;
            }
        }
        return z;
    }

    public CustomKeyboardLayout AgH() {
        return (CustomKeyboardLayout) this.A0R.A01();
    }

    /* JADX WARN: Type inference failed for: r0v58, types: [X.Gby, androidx.fragment.app.Fragment] */
    public boolean Bkd() {
        I5R A06;
        String str;
        String str2;
        long A0H;
        MontageViewerSwipeableMediaPickerView montageViewerSwipeableMediaPickerView;
        MontageViewerSwipeableMediaPickerView montageViewerSwipeableMediaPickerView2;
        if (this.A0U.A05()) {
            A0M(this);
        } else {
            Object A062 = A06(this);
            if (A062 == null || !(A062 instanceof C2396Gby) || (montageViewerSwipeableMediaPickerView = ((C2396Gby) A062).A0D) == null || montageViewerSwipeableMediaPickerView.A03.getParent() != montageViewerSwipeableMediaPickerView.A04) {
                if (A06(this) instanceof C2398Gc0) {
                    C2398Gc0 c2398Gc0 = (C2398Gc0) A06(this);
                    if (c2398Gc0.A0H.A00) {
                        FjE fjE = c2398Gc0.A0B;
                        5Rq r0 = fjE.A08.A06;
                        if (fjE.A06 != null && r0 != null) {
                            r0.A04(false);
                            fjE.A05.A02(false);
                            return true;
                        }
                    }
                }
                A0U(this, "BACK_PRESS");
                A0G();
                ((I3U) 4YU.A0p(this.A0p)).A01();
                C5ct c5ct = (C5ct) this.A1P.get();
                FbUserSession fbUserSession = this.A07;
                fbUserSession.getClass();
                c5ct.A04 = false;
                C5ct.A03(fbUserSession, c5ct);
                A0Z(false);
                8uN A063 = A06(this);
                if (A063 == null) {
                    return false;
                }
                if (A063 instanceof C2396Gby) {
                    ?? r02 = (C2396Gby) A063;
                    A06 = C2396Gby.A06(r02);
                    str = r02.A0I;
                    A0H = GOq.A0H((Fragment) r02);
                    str2 = "gallery";
                } else {
                    if (!(A063 instanceof 8uN)) {
                        return false;
                    }
                    8uN r03 = A063;
                    A06 = 8uN.A06(r03);
                    str = r03.A04;
                    str2 = r03.A05;
                    A0H = GOq.A0H(r03);
                }
                A06.A01(A0H, str, str2, "hard_back_press");
                return false;
            }
            Object A064 = A06(this);
            if (A064 != null && (A064 instanceof C2396Gby) && (montageViewerSwipeableMediaPickerView2 = ((C2396Gby) A064).A0D) != null) {
                montageViewerSwipeableMediaPickerView2.A0W(true);
                return true;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        IAR iar;
        MontageBucket montageBucket;
        MontageCard A0o;
        super.onActivityResult(i, i2, intent);
        if (intent != null && i == 2 && i2 == -1) {
            Message message = (Message) intent.getParcelableExtra("message");
            if (this.A0L != null && message != null && (iar = this.A0G) != null && (montageBucket = iar.A02) != null && (A0o = GOn.A0o(montageBucket)) != null && A0o.A0E != null && this.A0G.A02.A02 != null && !message.A0z.isEmpty()) {
                MontageCard A0o2 = GOn.A0o(this.A0G.A02);
                String str = A0o2 == null ? null : A0o2.A0E;
                Context requireContext = requireContext();
                A0K(requireContext, this.A0G.A02, new IXB(requireContext, message, this, str), this);
            }
        }
        6RU r0 = this.A0W;
        if (r0 != null) {
            7FI.A02(r0, new 7BI(i, i2, intent));
        }
    }

    public void onAttach(Context context) {
        super/*X.0D2*/.onAttach(context);
        this.A0X = C2rv.A00(context);
        this.A06 = context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachFragment(Fragment fragment) {
        AbstractC2395Gbx abstractC2395Gbx;
        if (fragment instanceof C2397Gbz) {
            C2397Gbz c2397Gbz = (C2397Gbz) fragment;
            c2397Gbz.A0Q = this;
            c2397Gbz.A0W = this.A0K;
            c2397Gbz.A0m = this.A0b;
            c2397Gbz.A0f = this.A0P;
            c2397Gbz.A0X = new C2800God(this);
            if (this.A0g) {
                this.A0g = false;
                c2397Gbz.A10 = true;
            }
            if (1JF.A0B(this.A0Z)) {
                return;
            }
            c2397Gbz.A0l = this.A0Z;
            this.A0Z = null;
            return;
        }
        if (fragment instanceof C2398Gc0) {
            C2398Gc0 c2398Gc0 = (C2398Gc0) fragment;
            c2398Gc0.A0K = this;
            c2398Gc0.A0L = new C2798Gob(this);
            return;
        }
        if (fragment instanceof C2396Gby) {
            C2396Gby c2396Gby = (C2396Gby) fragment;
            c2396Gby.A08 = this;
            c2396Gby.A0B = new C2799Goc(this);
            return;
        }
        if (fragment instanceof 8uN) {
            abstractC2395Gbx = (AbstractC2395Gbx) fragment;
            abstractC2395Gbx.A02 = this;
        } else {
            if (fragment instanceof C2803Gog) {
                C2803Gog c2803Gog = (C2803Gog) fragment;
                ((AbstractC2395Gbx) c2803Gog).A02 = this;
                ((AbstractC2395Gbx) c2803Gog).A03 = new C2799Goc(this);
                c2803Gog.A03 = this;
                this.A0H = c2803Gog;
                return;
            }
            if (!(fragment instanceof 8uM)) {
                return;
            }
            abstractC2395Gbx = (8uM) fragment;
            abstractC2395Gbx.A02 = this;
            ((8uM) abstractC2395Gbx).A06 = this.A0P;
        }
        abstractC2395Gbx.A03 = new C2799Goc(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        int A02 = 0FI.A02(-305981639);
        super.onCreate(bundle);
        FbUserSession A0G = 1BL.A0G(this);
        this.A07 = A0G;
        this.A0D = 1Lo.A02(A0G, this, 49712);
        this.A0m = 1Lo.A02(this.A07, this, 85200);
        this.A0B = 1Lo.A02(this.A07, this, 116010);
        this.A0p = 1Lo.A02(this.A07, this, 116013);
        this.A08 = 1Lo.A02(this.A07, this, 67417);
        this.A0n = 1Lo.A02(this.A07, this, 116003);
        this.A0o = 1Lo.A02(this.A07, this, 116009);
        this.A0A = 1Lo.A02(this.A07, this, 115947);
        this.A09 = 1Lo.A02(this.A07, this, 115946);
        this.A0C = 1Lo.A02(this.A07, this, 17145);
        String A0C = A0C(this.mArguments);
        I3U i3u = (I3U) 4YU.A0p(this.A0p);
        synchronized (i3u) {
            if (i3u.A01 != 0) {
                AbG.A0r(i3u.A02).flowEndFail(i3u.A01, "attempt_to_start_session_with_active_session", null);
            }
            i3u.A00 = A0C == null ? 0L : Long.parseLong(A0C);
            C00i c00i = i3u.A02;
            i3u.A01 = AbG.A0r(c00i).generateNewFlowId(60500227);
            AbI.A1U(AbG.A0r(c00i), "story_viewer_launched", i3u.A01, true);
        }
        GOq.A0Y(this).A09(A0C, "viewer_fragment_on_create_start");
        7Mg serializable = requireArguments().getSerializable("launch_source");
        serializable.getClass();
        this.A0K = serializable;
        C00i c00i2 = this.A19;
        ((I3e) c00i2.get()).A02(HxC.class, this.A1H);
        ((I3e) c00i2.get()).A02(HTm.class, this.A1G);
        ((I3e) c00i2.get()).A02(EWd.class, 1Bn.A0A(99759));
        ((I3e) c00i2.get()).A02(Hot.class, this.A1D.get());
        HGG hgg = this.A0L;
        if (hgg != null) {
            hgg.A02();
        }
        ((5zC) this.A1A.get()).Cn0(((5Su) this.A1L.get()).A00());
        C5ct c5ct = (C5ct) this.A1P.get();
        c5ct.A04 = true;
        DKE.A0K(c5ct.A08).removeCallbacksAndMessages(null);
        c5ct.A0H.A00.removeCallbacksAndMessages(null);
        GOq.A0Y(this).A09(A0C, "viewer_fragment_on_create_end");
        0FI.A08(-521777436, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        int A02 = 0FI.A02(1074661044);
        String A0C = A0C(this.mArguments);
        GOq.A0Y(this).A09(A0C, "viewer_fragment_on_create_view_start");
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.addFlags(EditorInfoCompat.IME_FLAG_NO_PERSONALIZED_LEARNING);
            int i = 16;
            if (1BK.A0N(this.A0w).AZk(72341130599207355L)) {
                i = 48;
            }
            window.setSoftInputMode(i);
        }
        View inflate = layoutInflater.inflate(2132542717, viewGroup, false);
        if (HIP.A00(this)) {
            inflate.setFitsSystemWindows(false);
        }
        GOq.A0Y(this).A09(A0C, "viewer_fragment_on_create_view_end");
        0FI.A08(-1499783129, A02);
        return inflate;
    }

    public void onDestroy() {
        int A02 = 0FI.A02(-565296591);
        6KV r0 = this.A0l;
        if (r0 != null) {
            r0.A04();
        }
        IPw iPw = this.A0N;
        if (iPw != null && this.A0M != null && this.A0J == HAG.A05) {
            Iterator it = iPw.A0E.iterator();
            while (it.hasNext()) {
                ((Future) it.next()).cancel(false);
            }
            this.A0M.A0A.remove(null);
        }
        Hq6 hq6 = (Hq6) 4YU.A0p(this.A0o);
        hq6.A02 = null;
        hq6.A03 = false;
        hq6.A01 = 1;
        hq6.A00 = 0;
        hq6.A04.clear();
        A0Z(false);
        C00i c00i = this.A08;
        if (c00i != null) {
            ((6hT) c00i.get()).A02();
        }
        this.A0e = true;
        super.onDestroy();
        0FI.A08(893765591, A02);
    }

    public void onDestroyView() {
        GJe gJe;
        int A02 = 0FI.A02(-1025450236);
        A0E();
        DLP dlp = this.A0r;
        if (dlp != null && (gJe = this.A0q) != null) {
            dlp.A03(gJe);
        }
        super.onDestroyView();
        0FI.A08(76989044, A02);
    }

    public void onDetach() {
        int A02 = 0FI.A02(-349137405);
        super/*X.0D2*/.onDetach();
        this.A0X = null;
        0FI.A08(-32240863, A02);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        HGG hgg = this.A0L;
        if (hgg != null) {
            hgg.A09();
        }
        if (dialogInterface != null) {
            super/*X.0D2*/.onDismiss(dialogInterface);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onResume() {
        IAR A06;
        MontageBucket montageBucket;
        int A02 = 0FI.A02(-464104075);
        super/*androidx.fragment.app.Fragment*/.onResume();
        Dialog dialog = ((0D2) this).A01;
        if (dialog != null && dialog.getWindow() != null) {
            Window window = dialog.getWindow();
            window.getClass();
            1tJ.A04(window, 5381);
        }
        if (this.A0N != null && this.A0J == HAG.A05) {
            ICk iCk = this.A0M;
            String str = null;
            if (iCk != null && (A06 = iCk.A06(GOn.A08(this))) != null && (montageBucket = A06.A02) != null) {
                str = GOo.A0v(montageBucket);
            }
            GOq.A0Y(this).A08(str, "onResume");
            Integer num = !this.A0f ? 0S2.A00 : 0S2.A0C;
            IPw iPw = this.A0N;
            FbUserSession fbUserSession = this.A07;
            fbUserSession.getClass();
            iPw.A03(fbUserSession, num, GOn.A08(this), A0c(this));
        }
        0FI.A08(2010709164, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x008a, code lost:
    
        if (X.C2rY.A00(getContext()) == false) goto L6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 1933
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.messaging.montage.viewer.MontageViewerFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
