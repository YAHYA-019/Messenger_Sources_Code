package X;

import android.content.Context;
import android.content.res.Resources;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.model.messages.MessageRepliedTo;
import com.google.common.base.Preconditions;
import com.mapbox.mapboxsdk.R;

/* renamed from: X.7fy, reason: invalid class name */
/* loaded from: 7fy.class */
public final class C7fy extends C1rj {
    public FbUserSession A00;
    public 5zD A01;
    public C62v A02;
    public AnonymousClass622 A03;

    public C7fy() {
        super("MessageReplyTextComponent");
    }

    public final Object[] A0k() {
        return new Object[]{1BK.A0d(), this.A00, this.A03, this.A02, this.A01};
    }

    @Override // X.C1rj
    public 1LI A0y(1Iw r302) {
        Resources resources;
        int i;
        int i2;
        C2cl c2cl;
        int i3;
        FbUserSession fbUserSession = this.A00;
        AnonymousClass622 anonymousClass622 = this.A03;
        1Bn.A0A(67632);
        Context context = r302.A0D;
        AnonymousClass470 anonymousClass470 = (AnonymousClass470) 1Hv.A02(context, 32912);
        C60i c60i = (C60i) 1Lo.A04(context, fbUserSession, (1BY) null, 49936);
        MessageRepliedTo messageRepliedTo = anonymousClass622.A03.A0F;
        Integer A01 = c60i.A01(messageRepliedTo, null, null);
        Preconditions.checkState(1BK.A1V(A01, 0S2.A15));
        int i4 = -1979711488;
        if (anonymousClass622.A0Z) {
            i4 = -1275068417;
        }
        String str = messageRepliedTo.A0E;
        CharSequence A07 = str != null ? anonymousClass470.A07(str, AnonymousClass470.A00(anonymousClass470)) : null;
        C1rq A012 = C1rg.A01(r302, null, 0);
        2cM A013 = 2cK.A01(r302, (String) null, 0);
        A013.A0S();
        A013.A0z(2.0f);
        A013.A1H(i4);
        A013.A2f(C1ro.FLEX_START);
        A012.A2f(A013.A00);
        int intValue = A01.intValue();
        if (intValue != 2) {
            i2 = intValue != 3 ? 0 : ((C12114ys) c60i.A02.get()).A08(messageRepliedTo);
            switch (intValue) {
                case 1:
                    i3 = 2131959729;
                    A07 = context.getString(i3);
                    break;
                case 2:
                default:
                    A07.getClass();
                    break;
                case 3:
                    resources = context.getResources();
                    i = 2131820654;
                    break;
                case 4:
                case 5:
                    i3 = 2131959726;
                    A07 = context.getString(i3);
                    break;
                case 6:
                    i3 = 2131959574;
                    A07 = context.getString(i3);
                    break;
            }
            3yF A0L = 2KZ.A0L(r302, 0);
            A0L.A3C(false);
            A0L.A3D(false);
            A0L.A3E(false);
            A0L.A3A(A07);
            A0L.A0R();
            A0L.A2x(i4);
            A0L.A01.A0F = i4;
            A0L.A2g();
            A0L.A2u(2);
            A0L.A0a();
            A0L.A2T(1LI.A09(r302, C7fy.class, "MessageReplyTextComponent", -293645914));
            A0L.A2a();
            A012.A2f(A0L.A2W());
            if (A01 != 0S2.A00 || A01 == 0S2.A0u) {
                c2cl = null;
            } else {
                C2cm A00 = C2cl.A00(r302);
                A00.A0M();
                A00.A2a(2132346801);
                A00.A2X(1627389952);
                A00.A0z(18.0f);
                A00.A0l(18.0f);
                A00.A14(15.0f);
                A00.A0J();
                c2cl = A00.A00;
            }
            A012.A2f(c2cl);
            A012.A23(C26z.LEFT);
            A012.A1Z(R.dimen.mapbox_eight_dp);
            return A012.A00;
        }
        resources = context.getResources();
        i = 2131820654;
        i2 = 1;
        A07 = resources.getQuantityString(i, i2);
        3yF A0L2 = 2KZ.A0L(r302, 0);
        A0L2.A3C(false);
        A0L2.A3D(false);
        A0L2.A3E(false);
        A0L2.A3A(A07);
        A0L2.A0R();
        A0L2.A2x(i4);
        A0L2.A01.A0F = i4;
        A0L2.A2g();
        A0L2.A2u(2);
        A0L2.A0a();
        A0L2.A2T(1LI.A09(r302, C7fy.class, "MessageReplyTextComponent", -293645914));
        A0L2.A2a();
        A012.A2f(A0L2.A2W());
        if (A01 != 0S2.A00) {
        }
        c2cl = null;
        A012.A2f(c2cl);
        A012.A23(C26z.LEFT);
        A012.A1Z(R.dimen.mapbox_eight_dp);
        return A012.A00;
    }

    @Override // X.C1rj
    public Object A15(1Im r302, Object obj) {
        int i = r302.A01;
        if (i == -1048037474) {
            1LI.A0J(r302, obj);
            return null;
        }
        if (i != -293645914) {
            return null;
        }
        C7fy c7fy = (C7fy) r302.A00.A01;
        AnonymousClass622 anonymousClass622 = c7fy.A03;
        C62v c62v = c7fy.A02;
        if (c62v == null) {
            return null;
        }
        c62v.CGd(anonymousClass622);
        return null;
    }
}
