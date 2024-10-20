package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.rtc.links.api.VideoChatLink;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;

/* loaded from: B7i.class */
public final class B7i extends GS2 {
    public final 1Br A00;
    public final 1Br A01;
    public final 1Br A02;
    public final 1Br A03;
    public final 1Br A04;
    public final 1qP A05;
    public final Context A06;
    public final FbUserSession A07;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B7i(FbUserSession fbUserSession, Context context) {
        super("VideoChatLinkMeetupPresenter");
        11T.A0F(context, 2);
        this.A07 = fbUserSession;
        this.A06 = context;
        this.A05 = new B7W(this, 1);
        this.A03 = 1Lm.A00(context, fbUserSession, 17016);
        this.A00 = 1Lm.A00(context, fbUserSession, 67965);
        this.A01 = 1Bu.A01(context, 83329);
        this.A04 = 1Bq.A00(16909);
        this.A02 = 1Bq.A00(67518);
    }

    /* JADX WARN: Type inference failed for: r307v2, types: [java.lang.Object, X.RO7] */
    public static final void A00(B7i b7i) {
        RO7 ro7;
        String A00;
        int i;
        Object[] objArr;
        StringBuilder A0n;
        ImmutableList build;
        User user;
        1Br r0 = b7i.A03;
        VideoChatLink videoChatLink = AbJ.A0X(r0).A06;
        String A03 = (videoChatLink == null || (user = videoChatLink.A0B) == null) ? null : ((C28o) 1Br.A0B(b7i.A04)).A03(user);
        if (b7i.A0V().isPresent()) {
            RrF rrF = (RrF) b7i.A0V().get();
            ?? obj = new Object();
            rrF.getClass();
            ((RO7) obj).A03 = rrF.A03;
            ((RO7) obj).A04 = rrF.A04;
            ((RO7) obj).A05 = rrF.A05;
            ((RO7) obj).A00 = rrF.A00;
            ((RO7) obj).A01 = rrF.A01;
            ((RO7) obj).A02 = rrF.A02;
            ro7 = obj;
        } else {
            ro7 = new RO7();
        }
        if (AbM.A1Z(b7i)) {
            CCG ccg = (CCG) 1Br.A0B(b7i.A01);
            Resources A0C = 4YU.A0C(((DK2) b7i.A0W().get()).getContext());
            String str = null;
            if (AbJ.A0X(r0).A06 != null) {
                VideoChatLink videoChatLink2 = AbJ.A0X(r0).A06;
                11T.A0D(videoChatLink2);
                String str2 = videoChatLink2.A0I;
                VideoChatLink videoChatLink3 = AbJ.A0X(r0).A06;
                11T.A0D(videoChatLink3);
                String str3 = videoChatLink3.A0Q;
                if (str2 != null) {
                    if (((2rX) 1Br.A0B(b7i.A02)).A01()) {
                        A0n = AnonymousClass001.A0n(str3);
                        A0n.append(' ');
                        A0n.append(str2);
                    } else {
                        A0n = AnonymousClass001.A0n(str2);
                        A0n.append(' ');
                        A0n.append(str3);
                    }
                    str = A0n.toString();
                } else if (str3 != null) {
                    str = str3;
                }
            }
            if (AbJ.A0X(r0).A0P()) {
                if (str != null && str.length() != 0) {
                    1Br.A0C(((Bgx) 1Br.A0B(ccg.A00)).A00);
                    i = 2131965045;
                    objArr = new Object[]{str};
                } else if (A03 == null || A03.length() == 0) {
                    1Br.A0C(ccg.A00);
                    A00 = A0C.getString(2131965043);
                } else {
                    1Br.A0C(((Bgx) 1Br.A0B(ccg.A00)).A00);
                    i = 2131965046;
                    objArr = new Object[]{A03};
                }
                A00 = A0C.getString(i, objArr);
            } else {
                A00 = CCG.A00(A0C, ccg, str, A03);
            }
        } else {
            A00 = null;
        }
        ro7.A01 = A00;
        if (AbM.A1Z(b7i)) {
            ImmutableList.Builder builder = ImmutableList.builder();
            if (A03 != null && A03.length() != 0) {
                builder.m11011add((Object) 1BK.A0v(((DK2) b7i.A0W().get()).getContext(), A03, 2131965044));
            }
            String A0A = AbJ.A0X(r0).A0A();
            if (A0A != null && A0A.length() != 0) {
                builder.m11011add((Object) A0A);
            }
            build = builder.build();
        } else {
            build = ImmutableList.of();
        }
        11T.A0A(build);
        ro7.A00 = build;
        ro7.A02 = AbJ.A0X(r0).A0A();
        ro7.A03 = AbJ.A0X(r0).A0N();
        boolean z = true;
        ro7.A04 = !(AbJ.A0X(r0).A06 == null ? false : r0.A0W);
        if (AbJ.A0X(r0).A06 != null) {
            z = false;
        }
        ro7.A05 = z;
        b7i.A0Z(new RrF(ro7));
    }

    public void A0b() {
        IFc A0b = AbM.A0b(this.A00);
        1Br r0 = this.A03;
        String A0A = AbJ.A0X(r0).A0A();
        AbN.A1G(A0b, "close_meetup_scrim", A0A);
        4zI.A03.A05("VideoChatLinksAnalyticsLogger", "Event: %s. Link: %s.", new Object[]{"close_meetup_scrim", A0A});
        AbJ.A0X(r0).A0V.remove(this.A05);
    }

    public /* bridge */ /* synthetic */ void A0c(JFq jFq) {
        11T.A0F(jFq, 0);
        IFc A0b = AbM.A0b(this.A00);
        1Br r0 = this.A03;
        String A0A = AbJ.A0X(r0).A0A();
        AbN.A1H(A0b, "open_meetup_scrim", A0A, GOm.A00(203));
        4zI.A03.A05("VideoChatLinksAnalyticsLogger", "Event: %s. Link: %s.", new Object[]{"open_meetup_scrim", A0A});
        AbJ.A0X(r0).A0V.add(this.A05);
        A00(this);
    }
}
