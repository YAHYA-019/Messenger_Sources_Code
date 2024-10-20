package X;

import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.contactstab.FriendsTabFragment;
import com.facebook.messaging.contactstab.intf.FriendsSubTabTag;
import com.google.common.collect.ImmutableList;

/* renamed from: X.9sa, reason: invalid class name */
/* loaded from: 9sa.class */
public final class C9sa implements 67O {
    public static final String __redex_internal_original_name = "FriendsTabFragment$7$1";
    public final /* synthetic */ long A00;
    public final /* synthetic */ 9wM A01;
    public final /* synthetic */ C3Z5 A02;

    public C9sa(9wM r302, C3Z5 c3z5, long j) {
        this.A01 = r302;
        this.A02 = c3z5;
        this.A00 = j;
    }

    public void Bml(Object obj) {
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, com.facebook.messaging.contactstab.FriendsTabFragment] */
    public void BqY(Object obj) {
        6uV r307;
        String valueOf;
        FbUserSession fbUserSession;
        String str;
        ?? r0 = this.A01.A00;
        ((2BQ) r0.A0j.get()).A01(1BJ.A00(47));
        C3Z5 c3z5 = this.A02;
        if (c3z5.A09 == 3E3.A02) {
            C3Z6 c3z6 = (C3Z6) r0.A0h.get();
            FbUserSession fbUserSession2 = r0.A03;
            fbUserSession2.getClass();
            AbstractC01593ro A3u = 8EQ.A00((C1kw) c3z6.A01.get()).A00.A3u(1BJ.A00(1422), false);
            if (A3u.A0B()) {
                A3u.A01(C3Z6.A02(c3z5), "i");
                A3u.A06("pigeon_reserved_keyword_module", "inbox2");
                A3u.A0A();
            }
            3yB r02 = (3yB) c3z6.A00.get();
            long j = c3z5.A08;
            String str2 = c3z5.A07;
            if (((C1gb) r02.A03.get()).A0B()) {
                3yB.A02(fbUserSession2, r02, Long.valueOf(j), "tab", "story", str2, 4, -1);
            }
        }
        FriendsSubTabTag friendsSubTabTag = r0.A0H;
        if (friendsSubTabTag != null && (friendsSubTabTag == FriendsSubTabTag.A02 || friendsSubTabTag == FriendsSubTabTag.A05)) {
            r0.A1Y(r0.A1X(), this.A00);
            return;
        }
        C9Jr c9Jr = r0.A0Q;
        if (c9Jr != null) {
            C9Mn c9Mn = c9Jr.A00.A00;
            int andIncrement = C1Y6.A04.getAndIncrement();
            1YC r03 = c9Mn.A00;
            r03.A08("com.facebook.messaging.montage.viewer.plugins.interfaces.launcher.MontageViewerLauncherSpec", "messaging.montage.viewer.launcher.MontageViewerLauncherSpec", "canLaunchViewer", andIncrement);
            r03.A06("messaging.montage.viewer.launcher.MontageViewerLauncherSpec", "canLaunchViewer", andIncrement);
        }
        long j2 = this.A00;
        String str3 = c3z5.A07;
        7Mg A1X = r0.A1X();
        6BY AyI = r0.A0K.AyI();
        ImmutableList of = AyI != null ? AyI.A00.A00 : ImmutableList.of();
        if (09K.A01(of)) {
            r307 = (6uV) r0.A13.get();
            valueOf = String.valueOf(j2);
            fbUserSession = r0.A03;
            fbUserSession.getClass();
            str = "empty ranked items";
        } else {
            3Kl A00 = ((C3Qj) r0.A14.get()).A00(of, j2);
            ImmutableList immutableList = A00.A01;
            if (!immutableList.isEmpty()) {
                if (r0.A0X) {
                    return;
                }
                r0.A0X = true;
                6uV r04 = (6uV) r0.A13.get();
                FbUserSession fbUserSession3 = r0.A03;
                fbUserSession3.getClass();
                IAa A02 = r04.A02(fbUserSession3, A1X);
                A02.A0G = immutableList;
                A02.A01 = A00.A00;
                A02.A0B = str3;
                A02.A02 = r0.A1G;
                8uK r306 = r0.A0P;
                if (r306 == null) {
                    r306 = new 8uK((FriendsTabFragment) r0);
                    r0.A0P = r306;
                }
                A02.A05 = r306;
                A02.A03(r0.getChildFragmentManager());
                return;
            }
            r307 = (6uV) r0.A13.get();
            valueOf = String.valueOf(j2);
            fbUserSession = r0.A03;
            fbUserSession.getClass();
            str = "empty play queue";
        }
        r307.A03(fbUserSession, A1X, valueOf, str);
    }
}
