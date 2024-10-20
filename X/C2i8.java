package X;

import android.content.Context;
import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.facebook.messaging.inbox2.activenow.model.Entity;
import com.facebook.messaging.inbox2.activenow.model.GroupPresenceInfo;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.messaging.model.threads.ThreadSummary;
import com.facebook.messaging.montage.composer.MontageComposerActivity;
import com.facebook.messaging.send.trigger.NavigationTrigger;
import com.facebook.messaging.threadview.params.ThreadViewParams;
import com.facebook.presence.api.model.RichStatus;
import com.facebook.presence.note.ui.consumption.NoteSelfViewerFragment;
import com.facebook.user.model.User;
import com.facebook.user.model.UserKey;
import com.facebook.wearable.common.comms.hera.shared.engine.consts.ConstantsKt;
import com.google.common.util.concurrent.SettableFuture;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;

/* renamed from: X.2i8, reason: invalid class name */
/* loaded from: 2i8.class */
public final class C2i8 {
    public final Context A00;
    public final 06Z A01;
    public final FbUserSession A02;
    public final 1pI A03;
    public final 1Br A04;
    public final 1Br A05;
    public final 1Br A06;
    public final 1Br A07;
    public final 1Br A08;
    public final 1Br A09;
    public final 1Br A0A;
    public final 1Br A0B;
    public final 1Br A0C;
    public final 1Br A0D;
    public final 1Br A0E;
    public final 1Br A0F;
    public final 1Br A0G;
    public final 1Br A0H;
    public final 1Br A0I;
    public final 1Br A0J;
    public final 2YD A0K;
    public final 2YQ A0L;
    public final C1gs A0M;
    public final java.util.Map A0N;
    public final 1Br A0O;

    public C2i8(Context context, 06Z r303, FbUserSession fbUserSession, 1pI r305, 2YD r306, 2YQ r307) {
        11T.A0F(context, 1);
        this.A00 = context;
        this.A0K = r306;
        this.A01 = r303;
        this.A03 = r305;
        this.A0L = r307;
        this.A02 = fbUserSession;
        this.A0J = 1HG.A00(context, 67720);
        this.A0M = (C1gs) 1Bn.A0A(66804);
        this.A07 = 1Bu.A01(context, 68290);
        this.A09 = 1Bq.A00(16385);
        this.A06 = 1Bu.A01(context, 32840);
        this.A0O = 1Bu.A00(66725);
        this.A0E = 1Bq.A00(16766);
        this.A0F = 1Bq.A00(16973);
        this.A0G = 1Bq.A00(16467);
        this.A0I = 1Bu.A01(context, 82461);
        this.A04 = 1Bq.A00(16458);
        this.A08 = 1Bu.A01(context, 17157);
        this.A0D = 1Bu.A01(context, 50185);
        this.A0H = 1Bu.A00(68383);
        this.A05 = 1Bq.A00(83479);
        this.A0A = 1Bu.A00(115056);
        this.A0C = 1Bq.A00(84065);
        this.A0B = 1Bu.A00(115935);
        this.A0N = 02J.A01(new 03Y("ch", 1XU.A00(context) ? ConstantsKt.CAMERA_ID_BACK : ConstantsKt.CAMERA_ID_FRONT));
    }

    public static final ThreadKey A00(C2i8 c2i8, 3xR r302) {
        User A04 = r302.A04();
        if (A04 == null) {
            return null;
        }
        return 4iI.A00((4iI) 1Br.A0B(c2i8.A0J), A04.A0k);
    }

    public static final ThreadKey A01(C2i8 c2i8, 37O r302) {
        4iI r0 = (4iI) 1Br.A0B(c2i8.A0J);
        UserKey A0X = 1BK.A0X(r302.A00.A13);
        11T.A0F(A0X, 0);
        return 4iI.A00(r0, A0X);
    }

    public static final 2TI A02(C2i8 c2i8) {
        return (2TI) c2i8.A0O.A00.get();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.1FX, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    public static final SettableFuture A03(C2i8 c2i8, 2tH r302) {
        User user;
        ?? obj = new Object();
        if (!c2i8.A0M.A02() && (user = r302.A02) != null) {
            1Kd.A0F(new C3du(3, r302, obj, c2i8), ((CNa) c2i8.A0I.A00.get()).A03(c2i8.A02, user, false), (Executor) c2i8.A0G.A00.get());
            return obj;
        }
        User user2 = r302.A02;
        obj.set(user2 != null ? 4iI.A00((4iI) 1Br.A0B(c2i8.A0J), user2.A0k) : null);
        return obj;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.1FX, java.lang.Object, com.google.common.util.concurrent.SettableFuture] */
    private final SettableFuture A04(3xR r302) {
        GroupPresenceInfo groupPresenceInfo;
        ThreadSummary threadSummary;
        Entity entity = r302.A01;
        ThreadKey threadKey = (entity.A00 != 5UV.A01 || (groupPresenceInfo = entity.A01) == null || (threadSummary = groupPresenceInfo.A00) == null) ? null : threadSummary.A0n;
        ?? obj = new Object();
        User A04 = r302.A04();
        if (A04 != null && A04.A0C()) {
            4iI r0 = (4iI) 1Br.A0B(this.A0J);
            String str = A04.A13;
            11T.A0A(str);
            threadKey = r0.A01(Long.parseLong(str));
        } else {
            if (!this.A0M.A02() && A04 != null) {
                1Kd.A0F(new C3du(2, r302, obj, this), ((CNa) this.A0I.A00.get()).A03(this.A02, A04, false), (Executor) this.A0G.A00.get());
                return obj;
            }
            if (threadKey == null) {
                threadKey = A00(this, r302);
            }
        }
        obj.set(threadKey);
        return obj;
    }

    public static final void A05(EnumC03533yL enumC03533yL, C2i8 c2i8, 3xR r303) {
        1FV A04 = c2i8.A04(r303);
        c2i8.A0K.A04(r303.Auq(), "tray_note:top_tap", c2i8.A0N);
        1Kd.A0F(new C3dx(1, enumC03533yL, 1Lm.A01(c2i8.A02, 68395), c2i8, r303), A04, (Executor) c2i8.A0G.A00.get());
    }

    public static final void A06(EnumC03533yL enumC03533yL, C2i8 c2i8, 2tH r303) {
        c2i8.A0K.A04(r303.Auq(), "tray_note:top_tap", c2i8.A0N);
        1Br A01 = 1Lm.A01(c2i8.A02, 68395);
        1Kd.A0F(new C3dx(0, enumC03533yL, A01, c2i8, r303), A03(c2i8, r303), (Executor) c2i8.A0G.A00.get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0201, code lost:
    
        if (r302.A11() != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A07(X.C2i8 r301, com.facebook.messaging.model.threadkey.ThreadKey r302, X.3xR r303) {
        /*
            Method dump skipped, instructions count: 596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2i8.A07(X.2i8, com.facebook.messaging.model.threadkey.ThreadKey, X.3xR):void");
    }

    public static final void A08(C2i8 c2i8, ThreadKey threadKey, NavigationTrigger navigationTrigger) {
        C6el A0H = 1BK.A0H(threadKey);
        A0H.A06 = navigationTrigger;
        A0H.A02(5SW.A04);
        ThreadViewParams threadViewParams = new ThreadViewParams(A0H);
        C00i c00i = c2i8.A0H.A00;
        c00i.get();
        if (!7QK.A02()) {
            c2i8.A0L.CWM((C2gi) null, threadViewParams);
            return;
        }
        ((7QK) c00i.get()).A03(c2i8.A00, c2i8.A02, threadKey, C3kb.A00, new AQg(c2i8, threadViewParams, 14));
    }

    public static final void A09(C2i8 c2i8, C2gy c2gy, C03513yC c03513yC, String str) {
        C2xf c2xf = c2gy.A00;
        if (c2xf != null) {
            RichStatus richStatus = (RichStatus) c2xf.A01;
            long j = richStatus.A04;
            c03513yC.A08(EnumC03533yL.AN_TRAY, richStatus.A09, Long.valueOf(j), 1, false, true);
            if (A02(c2i8).A00.AZk(72340842837381362L)) {
                1pI r0 = c2i8.A03;
                if (r0.BVa()) {
                    8Gd r02 = new 8Gd();
                    Bundle A05 = 1BK.A05();
                    A05.putParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER, 0Gm.A00((User) c2xf.A02));
                    A05.putParcelable(7zK.A00(14), new OpaqueParcelable(richStatus));
                    A05.putString("audience_text", str);
                    r02.setArguments(A05);
                    r0.Czz(r02, 0S2.A0j, 7zK.A00(211));
                    return;
                }
            }
            1pI r03 = c2i8.A03;
            0D2 noteSelfViewerFragment = new NoteSelfViewerFragment();
            noteSelfViewerFragment.A01 = r03;
            noteSelfViewerFragment.A03 = str;
            Bundle bundle = new Bundle();
            bundle.putParcelable(PublicKeyCredentialControllerUtility.JSON_KEY_USER, (User) c2xf.A02);
            bundle.putParcelable(7zK.A00(14), richStatus);
            noteSelfViewerFragment.setArguments(bundle);
            06Z r04 = c2i8.A01;
            if (r04.A0b("NoteSelfViewerFragment") == null) {
                noteSelfViewerFragment.A0m(r04, "NoteSelfViewerFragment");
            }
        }
    }

    public void A0A(final 3xR r302) {
        RichStatus A03 = r302.A03();
        String str = (!A02(this).A03() || A03 == null) ? null : "tray_note:bottom_tap";
        if (A02(this).A03() && A03 != null) {
            ((C03513yC) 1Lm.A06(this.A02, 68395)).A09(A03.A09, Long.valueOf(A03.A04));
        }
        ((CGO) 1Lm.A06(this.A02, 83646)).A01(r302.Auq());
        final String str2 = str;
        1Kd.A0F(new 1K9() { // from class: X.3do
            public void onFailure(Throwable th) {
                11T.A0F(th, 0);
                C2i8 c2i8 = C2i8.this;
                c2i8.A0K.A04(r302.Auq(), str2, c2i8.A0N);
                0fH.A0v("FriendsInboxUnitItemListener", "Failed to fetch the thread key.", th);
            }

            public /* bridge */ /* synthetic */ void onSuccess(Object obj) {
                2UQ r303;
                final ThreadKey threadKey = (ThreadKey) obj;
                if (threadKey == null) {
                    C2i8 c2i8 = C2i8.this;
                    c2i8.A0K.A04(r302.Auq(), str2, c2i8.A0N);
                    return;
                }
                final C2i8 c2i82 = C2i8.this;
                if (1Br.A07(c2i82.A09).AZk(36324930719076569L)) {
                    EnumC03583yg A00 = AbstractC03573yf.A00(threadKey);
                    LinkedHashMap A06 = 04R.A06(c2i82.A0N);
                    A06.put("thread_type", A00.toString());
                    2YD r0 = c2i82.A0K;
                    r303 = r302;
                    r0.A04(r303.Auq(), str2, A06);
                } else {
                    2YD r02 = c2i82.A0K;
                    r303 = r302;
                    r02.A04(r303.Auq(), str2, c2i82.A0N);
                }
                final 2UQ r3 = r303;
                ((1GU) 1Br.A0B(c2i82.A04)).Ciz(new Runnable() { // from class: X.3hg
                    public static final String __redex_internal_original_name = "FriendsInboxUnitItemListener$onActiveNowHorizontalTileItemClicked$1$onSuccess$1";

                    @Override // java.lang.Runnable
                    public final void run() {
                        C2i8 c2i83 = C2i8.this;
                        ThreadKey threadKey2 = threadKey;
                        3xR r03 = r3;
                        C2i8.A07(c2i83, threadKey2, r03);
                        3yB r04 = (3yB) 1Br.A0B(c2i83.A06);
                        long A0r = threadKey2.A0r();
                        String str3 = r03.A00.A03;
                        FbUserSession fbUserSession = c2i83.A02;
                        if (((C1gb) r04.A03.get()).A0B()) {
                            3yB.A02(fbUserSession, r04, Long.valueOf(A0r), "inbox", "an", str3, 4, -1);
                        }
                    }
                });
            }
        }, A04(r302), (Executor) this.A0G.A00.get());
    }

    public void A0B(C2gy c2gy) {
        LinkedHashMap A06 = 04R.A06(this.A0N);
        A06.put("item_type", "39");
        this.A0K.A04(c2gy.Auq(), "create_story", A06);
        ((CGO) 1Lm.A06(this.A02, 83646)).A01(c2gy.Auq());
        Context context = this.A00;
        C6r6 c6r6 = C6r6.A0E;
        String A00 = 4YT.A00(1288);
        ((5WA) 1Br.A0B(this.A0A)).A01(true, true);
        1Br.A0C(this.A0C);
        0LS.A0A(context, MontageComposerActivity.A12(context, 6zV.A00(context, (5Q1) 1Br.A0B(this.A0B), HxB.A00(c6r6), c6r6), NavigationTrigger.A03(A00)));
    }
}
