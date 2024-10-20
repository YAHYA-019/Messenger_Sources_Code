package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.cowatch.intent.model.CowatchShareModel;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.rtc.meetups.speakeasy.model.CallLinkModel;
import com.facebook.messaging.rtc.meetups.speakeasy.model.SpeakeasyShareSheetModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.ContactShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.CowatchShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.ForwardIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.InviteLinkShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.intent.model.MediaShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.logging.BroadcastFlowMnetItem;
import com.facebook.messaging.sharing.broadcastflow.model.BroadcastFlowRealTimeFetchParam;
import com.facebook.messaging.sharing.broadcastflow.model.BroadcastFlowUIConfigModel;
import com.facebook.messaging.sharing.broadcastflow.model.ContactShareModel;
import com.facebook.messaging.sharing.broadcastflow.model.SendButtonStates;
import com.facebook.messaging.sharing.broadcastflow.model.SendState;
import com.facebook.messaging.sharing.broadcastflow.model.rooms.SpeakeasyRoomShareIntentModel;
import com.facebook.messaging.sharing.broadcastflow.view.rooms.SpeakeasyDeleteRoomDialogFragment;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.ui.media.attachments.model.MediaResource;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.HashSet;

/* renamed from: X.Alm, reason: case insensitive filesystem */
/* loaded from: Alm.class */
public final class C1567Alm extends 1pK implements 1pN {
    public static final String __redex_internal_original_name = "BroadcastFlowFragment";
    public Intent A00;
    public MenuItem A01;
    public MenuItem A02;
    public MenuItem A03;
    public MenuItem A04;
    public Toolbar A05;
    public FbUserSession A06;
    public 1pH A07;
    public C00i A08;
    public C00i A09;
    public C00i A0A;
    public ThreadKey A0B;
    public Cc3 A0C;
    public Bhb A0D;
    public BroadcastFlowIntentModel A0E;
    public CNK A0F;
    public BroadcastFlowUIConfigModel A0G;
    public CtF A0H;
    public DHW A0I;
    public COg A0J;
    public Bxj A0K;
    public String A0L;
    public String A0M;
    public String A0N;
    public final C00i A0c = 1BV.A00(147749);
    public final C00i A0e = 1BQ.A02(99950);
    public final C00i A0q = new 1HH(this, 65728);
    public final C00i A0i = 1BV.A00(84120);
    public final C00i A0T = 1BV.A00(84107);
    public final C00i A0Z = 1BV.A00(83796);
    public final C00i A0d = AbH.A0Q();
    public final C00i A0W = AbH.A0c(this);
    public final C00i A0p = AbF.A0S(this, 16980);
    public final C00i A0g = 1BV.A00(84102);
    public final C00i A0V = AbF.A0S(this, 115390);
    public final C00i A0a = AbF.A0S(this, 83912);
    public final C00i A0h = 1BQ.A02(66655);
    public final CPX A0o = (CPX) 1Bi.A03(83793);
    public final C00i A0f = 1BQ.A02(84105);
    public final C00i A0Y = 1BQ.A02(82513);
    public final C00i A0U = 1BQ.A02(49736);
    public final C00i A0R = 1BQ.A02(68470);
    public final C00i A0b = 1BQ.A02(83798);
    public final C00i A0X = AbH.A0J();
    public final C00i A0S = AbF.A0S(this, 84125);
    public final View.OnClickListener A0P = CZF.A00(this, 66);
    public final MHn A0Q = new CZe(this, 1);
    public final MenuItem.OnActionExpandListener A0O = new CYc(this);
    public final Bhg A0j = new Bhg(this);
    public final Bhh A0k = new Bhh(this);
    public final Bhi A0l = new Bhi(this);
    public final Bhj A0m = new Bhj(this);
    public final Bhk A0n = new Bhk(this);

    public static int A03(C1567Alm c1567Alm) {
        boolean A0G = c1567Alm.A0G();
        MigColorScheme A08 = A08(c1567Alm);
        return A0G ? A08.AjC() : A08.BDl();
    }

    private ThreadKey A06() {
        BroadcastFlowIntentModel broadcastFlowIntentModel = this.A0E;
        if (broadcastFlowIntentModel instanceof ForwardIntentModel) {
            return ((ForwardIntentModel) broadcastFlowIntentModel).A00.A0V;
        }
        if (!(broadcastFlowIntentModel instanceof MediaShareIntentModel) || ((MediaShareIntentModel) broadcastFlowIntentModel).A02.isEmpty()) {
            return null;
        }
        return ((MediaResource) 1BK.A0r(((MediaShareIntentModel) this.A0E).A02)).A0J;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0028, code lost:
    
        if (r302 == null) goto L6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final X.BMK A07(android.content.Intent r301) {
        /*
            r0 = r301
            r1 = 0
            X.11T.A0F(r0, r1)
            java.lang.Class<com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel> r0 = com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r302 = r0
            r0 = r301
            r1 = r302
            r0.setExtrasClassLoader(r1)
            r0 = r301
            java.lang.String r1 = "extra_share_model"
            android.os.Parcelable r0 = r0.getParcelableExtra(r1)
            com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel r0 = (com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel) r0
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L2b
            r0 = r302
            X.BMK r0 = r0.BAL()
            r302 = r0
            r0 = r302
            if (r0 != 0) goto L37
        L2b:
            r0 = r301
            android.os.Bundle r0 = r0.getExtras()
            X.BMK r0 = X.BWC.A00(r0)
            r302 = r0
            r0 = r302
            X.11T.A0A(r0)
        L37:
            r0 = r302
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567Alm.A07(android.content.Intent):X.BMK");
    }

    public static MigColorScheme A08(C1567Alm c1567Alm) {
        return AbF.A0p(c1567Alm.A0G() ? c1567Alm.A0p : c1567Alm.A0W);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void A09(CallLinkModel callLinkModel, int i) {
        String str = callLinkModel.A06;
        String str2 = callLinkModel.A04;
        2Ov speakeasyDeleteRoomDialogFragment = new SpeakeasyDeleteRoomDialogFragment();
        Bundle A05 = 1BK.A05();
        A05.putBoolean("key_can_copy_link", true);
        A05.putString("key_room_link_url", str);
        A05.putString("key_room_id", str2);
        A05.putInt("key_discard_room_text", i);
        speakeasyDeleteRoomDialogFragment.setArguments(A05);
        speakeasyDeleteRoomDialogFragment.A15(getChildFragmentManager(), "ROOM_DELETION_DIALOG_FRAGMENT");
        C00i c00i = this.A0A;
        if (c00i != null) {
            1UG A08 = 1BK.A08(1Br.A02(((CPV) c00i.get()).A00), "room_dialog_impression");
            if (A08.isSampled()) {
                A08.A5c(BOd.A06, "sheet_type");
                A08.A5c(BNw.A01, "dialog_type");
                A08.BZL();
            }
        }
    }

    public static void A0A(C1567Alm c1567Alm) {
        DHW dhw = c1567Alm.A0I;
        if (dhw != null) {
            dhw.close();
            return;
        }
        1pH r0 = c1567Alm.A07;
        if (r0.BVa()) {
            r0.CeH(__redex_internal_original_name);
        }
    }

    public static void A0B(C1567Alm c1567Alm) {
        C00i c00i = c1567Alm.A09;
        if (c00i != null) {
            C4Ni c4Ni = (C4Ni) c00i.get();
            BO3 bo3 = BO3.A02;
            c4Ni.A06(BOq.A01, BOP.A02, bo3, null, null);
        }
    }

    public static void A0C(C1567Alm c1567Alm, Integer num) {
        BroadcastFlowIntentModel broadcastFlowIntentModel = c1567Alm.A0E;
        if (broadcastFlowIntentModel == null || !(broadcastFlowIntentModel instanceof ContactShareIntentModel)) {
            return;
        }
        ContactShareModel contactShareModel = ((ContactShareIntentModel) broadcastFlowIntentModel).A00;
        if (!contactShareModel.A07 || contactShareModel.A05 == null) {
            return;
        }
        ((CNm) 1Bn.A0A(82553)).A07(num, contactShareModel.A00, contactShareModel.A08);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0061, code lost:
    
        if (r301.A0F() == false) goto L8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0D(X.C1567Alm r301, boolean r302) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567Alm.A0D(X.Alm, boolean):void");
    }

    public static void A0E(C1567Alm c1567Alm, boolean z) {
        if (c1567Alm.A0H()) {
            c1567Alm.A02.setVisible(z);
        }
        if (c1567Alm.A04 == null || !CCJ.A00(c1567Alm.A0Z.get())) {
            return;
        }
        c1567Alm.A04.setVisible(!z);
    }

    private boolean A0F() {
        CowatchShareModel cowatchShareModel;
        BroadcastFlowIntentModel broadcastFlowIntentModel = this.A0E;
        boolean z = false;
        if ((broadcastFlowIntentModel instanceof CowatchShareIntentModel) && (cowatchShareModel = ((CowatchShareIntentModel) broadcastFlowIntentModel).A00) != null && cowatchShareModel.A01 == 0S2.A01) {
            z = true;
        }
        return z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        if ("rooms_coplay_incall_invite".equals(r304) != false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0G() {
        /*
            r301 = this;
            r0 = r301
            com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel r0 = r0.A0E
            r302 = r0
            r0 = 0
            r303 = r0
            r0 = 0
            r304 = r0
            r0 = r302
            if (r0 == 0) goto L2e
            r0 = r302
            boolean r0 = r0 instanceof com.facebook.messaging.sharing.broadcastflow.model.rooms.SpeakeasyRoomShareIntentModel
            r305 = r0
            r0 = r305
            if (r0 == 0) goto L2e
            r0 = r302
            com.facebook.messaging.sharing.broadcastflow.model.rooms.SpeakeasyRoomShareIntentModel r0 = (com.facebook.messaging.sharing.broadcastflow.model.rooms.SpeakeasyRoomShareIntentModel) r0
            r302 = r0
            r0 = r302
            com.facebook.messaging.rtc.meetups.speakeasy.model.SpeakeasyShareSheetModel r0 = r0.A00
            r306 = r0
            r0 = r306
            if (r0 == 0) goto L2e
            r0 = r306
            java.lang.String r0 = r0.A0A
            r304 = r0
        L2e:
            java.lang.String r0 = "rooms_lobby_invite"
            r306 = r0
            r0 = r306
            r1 = r304
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L64
            java.lang.String r0 = "rooms_incall_invite"
            r306 = r0
            r0 = r306
            r1 = r304
            boolean r0 = r0.equals(r1)
            r305 = r0
            r0 = r305
            if (r0 != 0) goto L64
            java.lang.String r0 = "rooms_coplay_incall_invite"
            r1 = r304
            boolean r0 = r0.equals(r1)
            r303 = r0
            r0 = 0
            r305 = r0
            r0 = 0
            r306 = r0
            r0 = r303
            if (r0 == 0) goto L67
        L64:
            r0 = 1
            r305 = r0
        L67:
            r0 = r305
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567Alm.A0G():boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (X.AbJ.A0g(r301.A0h).AZk(2342168231991595492L) == false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0H() {
        /*
            r301 = this;
            r0 = r301
            X.00i r0 = r0.A0Z
            java.lang.Object r0 = r0.get()
            r302 = r0
            r0 = r302
            boolean r0 = X.CCJ.A00(r0)
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L5e
            r0 = r301
            android.view.MenuItem r0 = r0.A02
            r302 = r0
            r0 = r302
            if (r0 == 0) goto L5e
            r0 = r301
            com.facebook.messaging.sharing.broadcastflow.intent.model.BroadcastFlowIntentModel r0 = r0.A0E
            r304 = r0
            r0 = r304
            boolean r0 = r0 instanceof com.facebook.messaging.sharing.broadcastflow.model.rooms.SpeakeasyRoomShareIntentModel
            r303 = r0
            r0 = r303
            if (r0 != 0) goto L5e
            r0 = r304
            boolean r0 = r0 instanceof com.facebook.messaging.sharing.broadcastflow.intent.model.CowatchShareIntentModel
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L3c
            r0 = r301
            boolean r0 = r0.A0F()
            r303 = r0
            r0 = r303
            if (r0 == 0) goto L5e
        L3c:
            r0 = r301
            X.00i r0 = r0.A0h
            r302 = r0
            r0 = r302
            X.1CO r0 = X.AbJ.A0g(r0)
            r305 = r0
            r0 = 2342168231991595492(0x20810d99001051e4, double:4.070014352862071E-152)
            r306 = r0
            r0 = r305
            r1 = r306
            boolean r0 = r0.AZk(r1)
            r308 = r0
            r0 = 1
            r303 = r0
            r0 = r308
            if (r0 != 0) goto L62
        L5e:
            r0 = 0
            r303 = r0
            r0 = 0
            r302 = r0
        L62:
            r0 = r303
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567Alm.A0H():boolean");
    }

    private boolean A0I(BroadcastFlowIntentModel broadcastFlowIntentModel) {
        boolean z = false;
        if ((broadcastFlowIntentModel instanceof InviteLinkShareIntentModel) && ((InviteLinkShareIntentModel) broadcastFlowIntentModel).A00.A04 == C96j.A05) {
            z = 7zR.A1W(1Wi.A00((1Wi) this.A0R.get()), 36320279276567820L);
        }
        return z;
    }

    public void A1F() {
        super.A1F();
        Bxj bxj = this.A0K;
        if (bxj != null) {
            bxj.A00 = null;
            bxj.A01 = null;
            this.A0K = null;
        }
    }

    public void A1G() {
        super.A1G();
        ((1SG) this.A0b.get()).A0I("fragment on destroy");
        CMa cMa = this.A0H.A0C.A0H;
        C1qN c1qN = cMa.A04;
        for (ThreadKey threadKey : c1qN.keySet()) {
            C3e8 c3e8 = (C3e8) c1qN.get(threadKey);
            if (c3e8 != null) {
                boolean isDone = c3e8.isDone();
                c3e8.cancel(true);
                if (!isDone) {
                    String str = (String) cMa.A05.get(threadKey);
                    CMa.A01((1Kq) cMa.A02.get(threadKey), threadKey, (ThreadSummary) cMa.A06.get(threadKey), (BroadcastFlowMnetItem) cMa.A03.get(threadKey), cMa, (User) cMa.A07.get(threadKey), str, true);
                }
            }
        }
        CtW ctW = this.A0H.A08;
        ctW.A00.Ceg(ctW.A01);
        CtV ctV = this.A0H.A07;
        ctV.A0E.Cf9(ctV.A0D);
        CtF ctF = this.A0H;
        ctF.A02.A00 = null;
        ctF.A03.A00 = null;
        Cc3 cc3 = this.A0C;
        if (cc3 != null) {
            cc3.AEC();
        }
    }

    public void A1H() {
        CJ8 cj8;
        super.A1H();
        Bxj bxj = this.A0K;
        if (bxj == null || (cj8 = bxj.A00) == null) {
            return;
        }
        cj8.A05(Long.valueOf(1BL.A09(bxj.A03)));
    }

    public void A1O(boolean z, boolean z2) {
        super.A1O(z, z2);
        this.A0J.A0D.A0r(z, false);
        Bxj bxj = this.A0K;
        if (bxj != null) {
            EIg eIg = bxj.A05;
            if (z) {
                eIg.A00();
            } else {
                eIg.A01();
            }
        }
    }

    public 1iF A1R() {
        return AbF.A0C(1231747217564692L);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstructorVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r321v14 ??, still in use, count: 7, list:
          (r321v14 ??) from 0x0e22: PHI (r321v9 ??) = (r321v8 ??), (r321v14 ??) binds: [B:504:0x0ecf, B:240:0x0e1d] A[DONT_GENERATE, DONT_INLINE]
          (r321v14 ?? I:X.BwD) from 0x0dd9: IPUT (r0v1154 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A00 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0de7: IPUT (r0v1157 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A01 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0df5: IPUT (r0v1160 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A02 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0e03: IPUT (r0v1163 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A03 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0e11: IPUT (r0v1166 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A04 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0e1f: IPUT (r0v1169 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A05 java.lang.String
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
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r321v14 ??, still in use, count: 7, list:
          (r321v14 ??) from 0x0e22: PHI (r321v9 ??) = (r321v8 ??), (r321v14 ??) binds: [B:504:0x0ecf, B:240:0x0e1d] A[DONT_GENERATE, DONT_INLINE]
          (r321v14 ?? I:X.BwD) from 0x0dd9: IPUT (r0v1154 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A00 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0de7: IPUT (r0v1157 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A01 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0df5: IPUT (r0v1160 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A02 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0e03: IPUT (r0v1163 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A03 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0e11: IPUT (r0v1166 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A04 java.lang.String
          (r321v14 ?? I:X.BwD) from 0x0e1f: IPUT (r0v1169 ?? I:java.lang.String), (r321v14 ?? I:X.BwD) A[Catch: Exception -> 0x119b] X.BwD.A05 java.lang.String
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

    public void A1X(ThreadSummary threadSummary) {
        String str;
        String str2;
        String str3;
        String str4;
        int i;
        String str5;
        String str6;
        CtF ctF = this.A0H;
        String str7 = this.A0N;
        11T.A0F(str7, 1);
        CtI ctI = ctF.A05;
        ThreadKey A0f = AbF.A0f(threadSummary);
        DJZ djz = ctI.A03;
        BzA Ay1 = djz.Ay1();
        BroadcastFlowRealTimeFetchParam broadcastFlowRealTimeFetchParam = Ay1.A0A;
        Long l = null;
        if (broadcastFlowRealTimeFetchParam != null) {
            str = broadcastFlowRealTimeFetchParam.A05;
            str2 = broadcastFlowRealTimeFetchParam.A04;
            str3 = broadcastFlowRealTimeFetchParam.A01;
            str4 = broadcastFlowRealTimeFetchParam.A00;
        } else {
            str = null;
            str2 = null;
            str3 = null;
            str4 = null;
        }
        HashSet A0v = AnonymousClass001.A0v();
        C15h c15h = ctI.A06;
        String str8 = ((C5U) c15h.get()).A03;
        String str9 = Ay1.A0Z;
        String str10 = ctI.A00;
        ImmutableMap A00 = BWD.A00(threadSummary.A1L);
        String str11 = ((C5U) c15h.get()).A02.analyticsName;
        C1pq.A08("shareSource", str11);
        BOR bor = BOR.A01;
        String str12 = Ay1.A0Y;
        String A002 = ((C1p) 1Br.A0B(ctI.A02)).A00(ctI.A01, threadSummary);
        long j = A0f.A03;
        BOi bOi = BOi.A0O;
        HashSet A0z = 4YV.A0z("rankSection", A0v, A0v);
        Long A0n = (!djz.Ay1().A0G.A0E || (str6 = djz.Ay1().A0G.A08) == null) ? null : 1BK.A0n(str6);
        ContactShareModel contactShareModel = djz.Ay1().A0C;
        if (contactShareModel != null && (str5 = contactShareModel.A06) != null) {
            l = 1BK.A0n(str5);
        }
        ThreadKey A0f2 = AbF.A0f(threadSummary);
        if (A0f2.A0z()) {
            i = 1;
        } else {
            i = 3;
            if (A0f2.A19()) {
                i = 2;
            }
        }
        ctI.A05.Cks(1Kq.A03, A0f, threadSummary, new BroadcastFlowMnetItem(bOi, bor, A00, null, l, A0n, str, str7, str8, str9, str2, str10, null, str3, str4, "create_group_null_state", null, str11, str12, null, A002, null, A0z, 0, 0, 0, i, j), (User) null, "create_group_null_state");
        Bz9 Ay4 = djz.Ay4();
        Ay4.A0I = SendButtonStates.A00(A0f, djz.Ay1().A0I, SendState.SENT);
        DJZ.A00(Ay4, djz);
        ImmutableList immutableList = djz.Ay1().A0O;
        Bz9 Ay42 = djz.Ay4();
        ImmutableList.Builder builder = ImmutableList.builder();
        builder.m11011add((Object) new Csv(bOi, threadSummary, "create_group_null_state"));
        Ay42.A0O = AbG.A0y(builder, immutableList);
        DJZ.A00(Ay42, djz);
        ctI.A04.BYz(djz.Ay1().A0J);
    }

    public boolean A1Y(String str) {
        if (!this.A04.isVisible()) {
            this.A0f.get();
            if (!1BL.A1R()) {
                return false;
            }
        }
        CtF ctF = this.A0H;
        11T.A0F(str, 0);
        Ctl ctl = ctF.A0B;
        CFe cFe = ctl.A01;
        int length = str.length();
        CFe.A00(length == 0 ? BLQ.A02 : BLQ.A04, cFe);
        cFe.A06.A0H(str, false);
        C5U c5u = (C5U) cFe.A09.get();
        c5u.A01 = Math.max(length, c5u.A01);
        DJZ djz = ctl.A04;
        Bz9 Ay4 = djz.Ay4();
        Ay4.A0c = str;
        DJZ.A00(Ay4, djz);
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x0414, code lost:
    
        if (java.lang.Math.abs(r0 - r0) < java.util.concurrent.TimeUnit.MINUTES.toMillis(1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x0430, code lost:
    
        r0 = r0.A02;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0439, code lost:
    
        if (r0 == null) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0447, code lost:
    
        if (r0.A03 != r322) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0455, code lost:
    
        if (r0.A02 != r323) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0463, code lost:
    
        if (r0.A01 == r311) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0469, code lost:
    
        r0.get();
        r0 = r0.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0478, code lost:
    
        if (r0 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x047b, code lost:
    
        r0 = r0.A01();
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0483, code lost:
    
        if (r0 == null) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x048d, code lost:
    
        if (r0 == X.0S2.A0C) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0497, code lost:
    
        if (r0 != X.0S2.A0j) goto L132;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x049a, code lost:
    
        r303 = X.0S2.A01;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x04a1, code lost:
    
        if (r318 != r303) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x04a4, code lost:
    
        r311 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x04b6, code lost:
    
        r303 = X.0S2.A00;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x04b3, code lost:
    
        if (r0.A08 == false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x042a, code lost:
    
        if (r0 < r0.A00) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x04da, code lost:
    
        if (r312.A08 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x019f, code lost:
    
        if (r303 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0340, code lost:
    
        if (r0 == X.0S2.A0j) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0343, code lost:
    
        r318 = X.0S2.A01;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0236  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean Bkd() {
        /*
            Method dump skipped, instructions count: 1921
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567Alm.Bkd():boolean");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        ThreadSummary threadSummary;
        if (i == 1 && i2 == -1 && intent != null && (threadSummary = (ThreadSummary) intent.getParcelableExtra("thread_summary_key")) != null) {
            A1X(threadSummary);
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttach(Context context) {
        super.onAttach(context);
        this.A06 = 1BL.A0G(this);
        this.A0F = (CNK) 1Bn.A0A(84111);
        this.A08 = AbI.A0L();
        FbUserSession fbUserSession = this.A06;
        this.A09 = AbF.A09(fbUserSession, 68275);
        this.A0A = new 1MV(fbUserSession, 84148);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = 0FI.A02(-1957154481);
        View A08 = AbG.A08(layoutInflater, viewGroup, 2132541614);
        ((ViewGroup) A08.requireViewById(2131362632)).addView(this.A0J.A0D);
        0FI.A08(1945381913, A02);
        return A08;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onPause() {
        int A02 = 0FI.A02(-1056668123);
        super/*androidx.fragment.app.Fragment*/.onPause();
        3QF.A00((3QF) 7zO.A0m(this, 84139), (short) 4);
        ((1SG) this.A0b.get()).A0I("fragment on pause");
        0FI.A08(-1979491023, A02);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        AbF.A1I(bundle, this.A0N);
        bundle.putString("media_type", this.A0L);
        bundle.putString("source_thread_id", this.A0M);
        bundle.putParcelable("source_thread_key", this.A0B);
        bundle.putParcelable("extra_share_model", this.A0E);
        bundle.putParcelable("fragment_host_intent", this.A00);
        CNK cnk = this.A0F;
        cnk.getClass();
        bundle.putParcelable("SEND_STATES", cnk.A00.A0I);
        bundle.putParcelable("extra_config_ui_model", this.A0G);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStart() {
        C00i c00i;
        int A02 = 0FI.A02(1789048726);
        super/*androidx.fragment.app.Fragment*/.onStart();
        BroadcastFlowIntentModel broadcastFlowIntentModel = this.A0E;
        if ((broadcastFlowIntentModel instanceof SpeakeasyRoomShareIntentModel) && (c00i = this.A0A) != null) {
            SpeakeasyShareSheetModel speakeasyShareSheetModel = ((SpeakeasyRoomShareIntentModel) broadcastFlowIntentModel).A00;
            CPV cpv = (CPV) c00i.get();
            String str = speakeasyShareSheetModel.A0D;
            String str2 = speakeasyShareSheetModel.A0C;
            ImmutableList immutableList = speakeasyShareSheetModel.A05;
            int size = 09K.A00(immutableList) ? immutableList.size() : 0;
            BOc bOc = speakeasyShareSheetModel.A00;
            11T.A0H(str, str2);
            11T.A0F(bOc, 3);
            1UG A08 = 1BK.A08(1Br.A02(cpv.A00), "room_share_sheet_impression");
            if (A08.isSampled()) {
                0DA r0 = new 0DA();
                String A00 = Hmi.A00(cpv);
                if (A00 == null) {
                    throw 1BK.A0h();
                }
                r0.A07("tray_session_id", CPV.A03(r0, cpv, A00));
                A08.A7T(r0, "session_ids");
                A08.A7R("room_url", str2);
                A08.A6H("num_room_participants", 1BK.A0l(size));
                AbK.A1H(bOc, A08);
                A08.A5c(BOd.A06, "sheet_type");
                A08.A7R("link_hash_id", str);
                A08.A5c(BOG.A03, "creation_version");
                A08.BZL();
            }
        }
        0FI.A08(-1649941063, A02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onStop() {
        int A02 = 0FI.A02(1428595607);
        super/*androidx.fragment.app.Fragment*/.onStop();
        0FI.A08(1573604351, A02);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:?, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x076c A[Catch: all -> 0x07f5, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:61:0x076c, B:53:0x0782), top: B:49:0x02fe }] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0843  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03b1  */
    /* JADX WARN: Type inference failed for: r0v382, types: [java.lang.Throwable, X.96j] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onViewCreated(android.view.View r302, android.os.Bundle r303) {
        /*
            Method dump skipped, instructions count: 2274
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1567Alm.onViewCreated(android.view.View, android.os.Bundle):void");
    }
}
