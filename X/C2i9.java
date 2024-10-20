package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.locks.Lock;

/* renamed from: X.2i9, reason: invalid class name */
/* loaded from: 2i9.class */
public final class C2i9 extends C1rj {
    public 06Z A00;
    public FbUserSession A01;
    public C2i8 A02;
    public C2i8 A03;
    public 2YH A04;
    public C2gv A05;
    public C2i7 A06;
    public MigColorScheme A07;
    public 1Va A08;
    public boolean A09;
    public boolean A0A;

    public C2i9() {
        super("FriendsInboxUnitComponent");
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x013f, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0138, code lost:
    
        if (r0 != null) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String A00(X.2UR r301) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2i9.A00(X.2UR):java.lang.String");
    }

    public static final void A01(Context context, FbUserSession fbUserSession, C2i8 c2i8, 2UR r304, 2kL r305, long j) {
        String str;
        ((I2K) 1Lm.A05(context, fbUserSession, 115490)).A00();
        Lock readLock = r305.A0B.readLock();
        readLock.lock();
        try {
            List list = r305.A09;
            readLock.unlock();
            ImmutableList copyOf = ImmutableList.copyOf((Collection) list);
            11T.A0F(copyOf, 0);
            I1X i1x = (I1X) 1Bi.A03(115926);
            I1X.A00(i1x).markerPoint(13248089, "start_play_queue");
            String A00 = GOm.A00(16);
            0fH.A0l(A00, "start_play_queue");
            String str2 = r304.Auq().A0C;
            LinkedHashMap A06 = 04R.A06(c2i8.A0N);
            if (r304 instanceof C2gy) {
                A06.put("item_type", "35");
                str = "story_self";
            } else {
                str = "story_friend";
            }
            c2i8.A0K.A04(r304.Auq(), str, A06);
            3Kl A002 = ((C3Qj) 1Bn.A0A(68367)).A00(copyOf, j);
            ImmutableList immutableList = A002.A01;
            if (immutableList.isEmpty()) {
                I1X.A00(i1x).markerAnnotate(13248089, GOm.A00(276), "empty_play_queue");
                I1X.A00(i1x).markerEnd(13248089, (short) 3);
                0fH.A0k(A00, "marker_end_reason: fail empty_play_queue");
                return;
            }
            06Z r0 = c2i8.A01;
            if (r0.A0b("montage_viewer_fragment") == null) {
                I1X.A00(i1x).markerPoint(13248089, "launch_montage_viewer");
                0fH.A0l(A00, "launch_montage_viewer");
                6uV r02 = (6uV) 1Br.A0B(c2i8.A0D);
                FbUserSession fbUserSession2 = c2i8.A02;
                7Mg r03 = 7Mg.A02;
                IAa A02 = r02.A02(fbUserSession2, r03);
                A02.A0G = immutableList;
                A02.A01 = A002.A00;
                A02.A0B = str2 == null ? "" : str2;
                A02.A06 = 7ND.A01(r304, A00(r304), "thread_list");
                A02.A08 = str2;
                A02.A05 = ((C2xd) 1Br.A0B(c2i8.A08)).A0D(c2i8.A00, r0, new 3ZX(c2i8), r03);
                A02.A03(r0);
            }
        } catch (Throwable th) {
            readLock.unlock();
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A0L(android.content.Context r301, com.facebook.auth.usersession.FbUserSession r302, X.C2i8 r303, X.2UR r304, X.2kL r305, java.lang.Integer r306, java.lang.String r307) {
        /*
            Method dump skipped, instructions count: 838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2i9.A0L(android.content.Context, com.facebook.auth.usersession.FbUserSession, X.2i8, X.2UR, X.2kL, java.lang.Integer, java.lang.String):void");
    }

    public /* bridge */ /* synthetic */ 1LI A0l() {
        return super.A0l();
    }

    /* JADX WARN: Code restructure failed: missing block: B:146:0x072a, code lost:
    
        if (r0.A00 != false) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x04ac, code lost:
    
        if (r0.A00 == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x04f7, code lost:
    
        if (X.2Ss.A00((X.2Ss) r0.A01.get()).Auy(72621673568666024L) <= 0) goto L98;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.C1rj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public X.1LI A0y(X.1Iw r302) {
        /*
            Method dump skipped, instructions count: 4107
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2i9.A0y(X.1Iw):X.1LI");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.2Yv, java.lang.Object] */
    @Override // X.C1rj
    public /* bridge */ /* synthetic */ 2Yv A12() {
        return new Object();
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [X.1Q5, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v34, types: [X.1Q5, java.lang.Object] */
    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        switch (r302.A01) {
            case -1933296085:
                F5R f5r = (F5R) obj;
                1Iw r0 = r302.A00.A00;
                0Cs r02 = f5r.A01;
                View view = f5r.A00;
                AccessibilityNodeInfoCompat accessibilityNodeInfoCompat = f5r.A02;
                1tT r03 = r0.A06;
                r03.getClass();
                boolean z = r03.A00().A02;
                1BL.A1H(r02, view, accessibilityNodeInfoCompat);
                r02.A0a(view, accessibilityNodeInfoCompat);
                if (!z) {
                    return null;
                }
                accessibilityNodeInfoCompat.A05(0Oe.A0H);
                return null;
            case -1048037474:
                1LI.A0J(r302, obj);
                return null;
            case -843172861:
                3M4 r04 = (3M4) obj;
                1Iw r05 = r302.A00.A00;
                View view2 = r04.A02;
                int i = r04.A00;
                Bundle bundle = r04.A01;
                0Cs r06 = r04.A03;
                11T.A0H(r05, view2);
                11T.A0F(r06, 4);
                if (i == 262144 && r05.A02 != null) {
                    r05.A0G(new C2l4(new Object[0], 0), "updateState:FriendsInboxUnitComponent.updateStoriesTrayAccessibleState");
                }
                return Boolean.valueOf(r06.A0X(view2, i, bundle));
            case 1065496236:
                1Va r07 = ((C2i9) r302.A00.A01).A08;
                11T.A0F(r07, 1);
                ((C2j0) 1Bi.A03(17085)).A01(new Object());
                r07.CZm((1Q5) new Object());
                return null;
            case 1590505951:
                1Iw r08 = r302.A00.A00;
                11T.A0F(r08, 0);
                if (r08.A02 == null) {
                    return null;
                }
                r08.A0G(new C2l4(new Object[0], 0), "updateState:FriendsInboxUnitComponent.updateStoriesTrayAccessibleState");
                return null;
            case 1706202311:
                1Va r09 = ((C2i9) r302.A00.A01).A08;
                11T.A0F(r09, 1);
                ((C2j0) 1Bi.A03(17085)).A01(new Object());
                r09.CZm((1Q5) new Object());
                return null;
            default:
                return null;
        }
    }

    @Override // X.C1rj
    public void A1N(1Iw r302, 2Yv r303) {
        2kE r0 = (2kE) r303;
        FbUserSession fbUserSession = this.A01;
        11T.A0F(r302, 0);
        11T.A0F(fbUserSession, 1);
        2kF r02 = new 2kF(0, r302.A0D.getResources().getDimensionPixelSize(2132279309), 0, false);
        ImmutableList of = ImmutableList.of((Object) new 2kH(fbUserSession, r302));
        r0.A02 = true;
        r0.A00 = r02;
        if (of != null) {
            r0.A01 = of;
        }
    }

    @Override // X.C1rj
    public boolean A1U() {
        return true;
    }
}
