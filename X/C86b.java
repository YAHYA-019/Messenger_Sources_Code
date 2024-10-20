package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.foa.session.FbMetaSessionImpl;
import com.facebook.messaging.aibot.memu.intent.MemuOnboardingIntentHandler;
import com.facebook.messaging.model.threadkey.ThreadKey;
import com.facebook.user.model.User;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.facebook.xapp.messaging.threadview.model.aigenerated.AIGeneratedMetadata;
import com.facebook.xapp.messaging.threadview.model.botresponse.AIImagineMediaInfo;
import com.facebook.xapp.messaging.threadview.model.botresponse.BotResponseMetadata;
import com.facebook.xapp.messaging.threadview.model.photo.Photo;
import com.google.common.collect.ImmutableList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* renamed from: X.86b, reason: invalid class name */
/* loaded from: 86b.class */
public final class C86b implements 6xM {
    public C00i A00;
    public HashSet A01;
    public boolean A02;
    public final Fragment A03;
    public final FbUserSession A04;
    public final ThreadKey A05;
    public final AWx A06;
    public final 6wV A07;
    public final Function1 A08;

    public C86b(Fragment fragment, FbUserSession fbUserSession, ThreadKey threadKey, AWx aWx, 6wV r306, Function1 function1) {
        this.A03 = fragment;
        this.A05 = threadKey;
        function1.getClass();
        this.A08 = function1;
        this.A06 = aWx;
        this.A07 = r306;
        this.A04 = fbUserSession;
        this.A01 = null;
    }

    private void A00(6RU r302) {
        if (this.A02) {
            return;
        }
        this.A00 = 1Bn.A06(r302.A00, 85F.class, (Class) null);
        this.A02 = true;
    }

    public /* bridge */ /* synthetic */ Set AoU() {
        HashSet hashSet = this.A01;
        if (hashSet == null) {
            hashSet = AnonymousClass001.A0w(new Class[]{A5r.class, A5g.class, A5f.class, 7Ae.class, A5i.class, A5k.class, C86k.class, 7ZV.class, A5q.class});
            this.A01 = hashSet;
        }
        return hashSet;
    }

    public String BGe() {
        return "AiImaginePlugin";
    }

    public void BLY(Capabilities capabilities, C77n c77n, 6RU r304, 6Sh r305) {
        6Sh a5g;
        List list;
        String str;
        C5ft c5ft;
        BotResponseMetadata botResponseMetadata;
        List list2;
        AIImagineMediaInfo aIImagineMediaInfo;
        BotResponseMetadata botResponseMetadata2;
        List list3;
        AIImagineMediaInfo aIImagineMediaInfo2;
        Long l;
        AIImagineMediaInfo aIImagineMediaInfo3;
        String str2;
        if (r305 instanceof A5i) {
            A00(r304);
            ThreadKey threadKey = this.A05;
            A5i a5i = (A5i) r305;
            AWx aWx = this.A06;
            1BK.A1J(r304, 0, a5i);
            7zQ.A0x(9GB.A01).A0W(threadKey, 9GB.A00);
            if (aWx != null) {
                Context context = r304.A00;
                Integer num = a5i.A00;
                String str3 = 9GB.A00;
                AVB A01 = AVB.A01(r304, 43);
                11T.A0F(num, 2);
                83Z A0F = 1BK.A0F();
                if (A0F != null) {
                    A0F.A08(context, (8L1) null, threadKey, (C9i3) null, (CharSequence) null, num, str3, A01, false, false);
                    return;
                }
                return;
            }
            return;
        }
        if (r305 instanceof A5q) {
            A00(r304);
            ThreadKey threadKey2 = this.A05;
            FbUserSession fbUserSession = this.A04;
            AWx aWx2 = this.A06;
            Fragment fragment = this.A03;
            Function1 function1 = this.A08;
            A5q a5q = (A5q) r305;
            11T.A0F(r304, 0);
            11T.A0F(a5q, 6);
            8Jv r0 = a5q.A00;
            String str4 = r0.A04;
            C9i3 c9i3 = new C9i3(str4, str4, false, false, true);
            8Jj r02 = r0.A01;
            String str5 = r02 != null ? r02.A03 : null;
            String str6 = "";
            if (str5 == null) {
                str5 = str6;
            }
            if (r02 != null && (str2 = r02.A02) != null) {
                str6 = str2;
            }
            1Kh r03 = new 1Kh();
            r03.A05(str6);
            r03.A0t = str5;
            User user = new User(r03);
            Context context2 = r304.A00;
            String A0v = 1BK.A0v(context2, str5, 2131966514);
            11T.A0A(A0v);
            7zQ.A0x(9GB.A01).A0W(threadKey2, 9GB.A00);
            if (aWx2 != null) {
                Integer num2 = a5q.A01;
                String str7 = 9GB.A00;
                ARW arw = new ARW(9, fragment, r304, fbUserSession, function1, user);
                11T.A0F(num2, 2);
                83Z A0F2 = 1BK.A0F();
                if (A0F2 != null) {
                    A0F2.A08(context2, (8L1) null, threadKey2, c9i3, A0v, num2, str7, arw, false, false);
                    return;
                }
                return;
            }
            return;
        }
        if (r305 instanceof A5r) {
            A00(r304);
            ThreadKey threadKey3 = this.A05;
            AWx aWx3 = this.A06;
            A5r a5r = (A5r) r305;
            11T.A0F(r304, 0);
            11T.A0F(a5r, 4);
            C5fv c5fv = a5r.A00;
            if (!(c5fv instanceof C5ft) || (c5ft = (C5ft) c5fv) == null) {
                return;
            }
            C5g3 c5g3 = 5mF.A00;
            BotResponseMetadata botResponseMetadata3 = (BotResponseMetadata) c5ft.AxW(c5g3);
            List list4 = botResponseMetadata3 != null ? botResponseMetadata3.A0E : null;
            Long l2 = (list4 == null || (aIImagineMediaInfo3 = (AIImagineMediaInfo) 0QD.A0E(list4)) == null) ? null : aIImagineMediaInfo3.A00;
            ImmutableList immutableList = c5ft.A01;
            if (immutableList.size() > 1 && c5ft.A00 != null) {
                int i = 0;
                Iterator it = immutableList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str8 = ((Photo) it.next()).A0B;
                    Photo photo = c5ft.A00;
                    if (!11T.A0O(str8, photo != null ? photo.A0B : null)) {
                        i++;
                    } else if (i > -1 && (botResponseMetadata2 = (BotResponseMetadata) c5ft.AxW(c5g3)) != null && (list3 = botResponseMetadata2.A0E) != null && (aIImagineMediaInfo2 = (AIImagineMediaInfo) 0QD.A0J(list3, i)) != null && (l = aIImagineMediaInfo2.A00) != null) {
                        l2 = l;
                    }
                }
            }
            if (l2 == null) {
                return;
            }
            long longValue = l2.longValue();
            Photo photo2 = c5ft.A00;
            if (photo2 == null) {
                photo2 = (Photo) 0QD.A0E(immutableList);
                if (photo2 == null) {
                    return;
                }
            }
            String valueOf = String.valueOf(longValue);
            String str9 = photo2.A0E;
            11T.A0A(str9);
            BotResponseMetadata botResponseMetadata4 = (BotResponseMetadata) c5fv.AxW(c5g3);
            String str10 = botResponseMetadata4 != null ? botResponseMetadata4.A0C : null;
            boolean z = false;
            if (C5v6.A05(c5fv) && (botResponseMetadata = (BotResponseMetadata) c5fv.AxW(c5g3)) != null && (list2 = botResponseMetadata.A0E) != null && (aIImagineMediaInfo = (AIImagineMediaInfo) 0QD.A0E(list2)) != null) {
                z = aIImagineMediaInfo.A01;
            }
            8L1 r04 = new 8L1(valueOf, 1, str9, str10, z);
            if (aWx3 != null) {
                Context context3 = r304.A00;
                Integer num3 = a5r.A01;
                String str11 = 9GB.A00;
                AVB A012 = AVB.A01(r304, 44);
                11T.A0F(num3, 2);
                83Z A0F3 = 1BK.A0F();
                if (A0F3 != null) {
                    A0F3.A08(context3, r04, threadKey3, (C9i3) null, (CharSequence) null, num3, str11, A012, false, true);
                    return;
                }
                return;
            }
            return;
        }
        if (r305 instanceof A5k) {
            A00(r304);
            FbUserSession fbUserSession2 = this.A04;
            ThreadKey threadKey4 = this.A05;
            A5k a5k = (A5k) r305;
            1BK.A1J(r304, 0, a5k);
            1qK A0V = 7zR.A0V();
            if (!A0V.A0B()) {
                Context context4 = r304.A00;
                if (1XU.A00(context4)) {
                    0LS.A0B(context4, MemuOnboardingIntentHandler.A00);
                    return;
                } else {
                    F2g.A01(context4, new FbMetaSessionImpl(fbUserSession2), new FAB(EQa.A04, (EQu) null, 0S2.A00, 7zR.A0s(), (String) null, (String) null, (String) null, 1BK.A1D("thread_type", threadKey4.A06.toString()), false, false, false), new ACQ(A0V, 2));
                    return;
                }
            }
            C5fv c5fv2 = a5k.A00;
            if (C5v6.A02(c5fv2)) {
                BotResponseMetadata botResponseMetadata5 = (BotResponseMetadata) c5fv2.AxW(5mF.A00);
                if (botResponseMetadata5 == null) {
                    return;
                } else {
                    str = botResponseMetadata5.A0C;
                }
            } else {
                AIGeneratedMetadata aIGeneratedMetadata = (AIGeneratedMetadata) c5fv2.AxW(C5g2.A00);
                if (aIGeneratedMetadata == null || (list = aIGeneratedMetadata.A03) == null) {
                    return;
                } else {
                    str = (String) 0QD.A0E(list);
                }
            }
            if (str == null) {
                return;
            } else {
                a5g = C9iL.A00(r304.A00, str);
            }
        } else {
            if (r305 instanceof A5f) {
                A00(r304);
                FbUserSession fbUserSession3 = this.A04;
                ThreadKey threadKey5 = this.A05;
                1BK.A1J(r304, 0, r305);
                if (7zR.A0V().A0B()) {
                    F2g.A01(r304.A00, new FbMetaSessionImpl(fbUserSession3), new FAB(EQa.A04, (EQu) null, 0S2.A0C, 7zR.A0s(), (String) null, (String) null, (String) null, 1BK.A1D("thread_type", threadKey5.A06.toString()), false, false, false), new ACN(1));
                    return;
                }
                return;
            }
            if (r305 instanceof C86k) {
                A00(r304);
                11T.A0F(r304, 0);
                a5g = new A5i(0S2.A0N);
            } else {
                if (r305 instanceof 7ZV) {
                    A00(r304);
                    ThreadKey threadKey6 = this.A05;
                    9GB.A00 = 1BK.A0t();
                    7zQ.A0x(9GB.A01).A0X(threadKey6, 9GB.A00);
                    return;
                }
                if (!(r305 instanceof 7Ae)) {
                    if (r305 instanceof A5g) {
                        A00(r304);
                        A5g a5g2 = (A5g) r305;
                        4YV.A1N(c77n.AUP(7Z9.class), a5g2);
                        c77n.ClL(new 7Z9(a5g2.A00));
                        return;
                    }
                    return;
                }
                A00(r304);
                6wV r05 = this.A07;
                85F r06 = (85F) this.A00.get();
                11T.A0G(r304, 0, r06);
                7Sg[] A1a = 7zT.A1a(r05.getText());
                Context context5 = r304.A00;
                int length = A1a.length;
                boolean z2 = false;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    }
                    if (A1a[i2].A00 != C6qi.A03) {
                        i2++;
                    } else if (!1XU.A00(context5)) {
                        z2 = 7zR.A1W(1Br.A07(r06.A00), 72341289512735295L);
                    }
                }
                a5g = new A5g(z2);
            }
        }
        7FI.A02(r304, a5g);
    }

    public void BPN(C77n c77n, 6RU r303, boolean z) {
        if (z) {
            return;
        }
        A00(r303);
    }
}
