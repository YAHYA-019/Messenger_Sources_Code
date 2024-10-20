package X;

import android.graphics.drawable.Drawable;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.messaging.communitymessaging.channelimageediting.model.EmojiGradientModel;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ay8, reason: case insensitive filesystem */
/* loaded from: Ay8.class */
public final class C1979Ay8 extends 1LH {
    public final Bcm A00;
    public final DEp A01;
    public final AXh A02;
    public final EmojiGradientModel A03;
    public final MigColorScheme A04;
    public final C2fr A05;
    public final ImmutableList A06;
    public final String A07;
    public final boolean A08;
    public final FbUserSession A09;
    public final BLB A0A;

    public C1979Ay8(FbUserSession fbUserSession, Bcm bcm, BLB blb, DEp dEp, AXh aXh, EmojiGradientModel emojiGradientModel, MigColorScheme migColorScheme, C2fr c2fr, ImmutableList immutableList, String str, boolean z) {
        7zT.A1T(fbUserSession, migColorScheme, blb);
        11T.A0F(immutableList, 6);
        7zP.A1O(aXh, 7, dEp);
        this.A09 = fbUserSession;
        this.A04 = migColorScheme;
        this.A08 = z;
        this.A0A = blb;
        this.A07 = str;
        this.A06 = immutableList;
        this.A02 = aXh;
        this.A00 = bcm;
        this.A05 = c2fr;
        this.A03 = emojiGradientModel;
        this.A01 = dEp;
    }

    private final 2cL A01(C2k6 c2k6, C2fr c2fr) {
        boolean AEo = this.A01.AEo(BLB.A04, c2fr);
        C2pz A00 = C2px.A00(c2k6.AeS());
        A00.A2X(C2q0.A00);
        A00.A2Z(c2fr);
        A00.A2Y(this.A04);
        float f = 95.0f;
        if (this.A08) {
            f = 70.0f;
        }
        A00.A0z(f);
        A00.A0l(f);
        ArrayList A11 = C0s8.A11(A00.A2W());
        if (AEo) {
            A11.add(A0M(c2k6));
        }
        return A0L(c2k6, A11);
    }

    public static final 2cL A0L(C2k6 c2k6, List list) {
        2lQ r0 = 2lO.A02;
        long doubleToRawLongBits = Double.doubleToRawLongBits(15.0d);
        2lO A0L = 4YV.A0L(4YV.A0K(4YV.A0K((2lO) null, 0S2.A04, doubleToRawLongBits), 0S2.A15, doubleToRawLongBits), 0S2.A00, C1ro.CENTER, 0);
        C2sn A0U = 7zQ.A0U(c2k6.AeS());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0U.A00((1LI) it.next());
        }
        return C2so.A02(A0U, c2k6, A0L);
    }

    private final C2cp A0M(C2k6 c2k6) {
        Drawable A0F = 7zO.A0F(C1u3.A1x, 4YV.A0I(), this.A04);
        C2cq A00 = C2cp.A00(c2k6.AeS(), 0);
        A00.A0E("crossIconViewTag");
        A00.A2a(A0F);
        A00.A0c();
        A00.A0M();
        7zR.A1A(A00, new DD3(this, 5));
        A00.A1J(2131953991);
        return A00.A2W();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v106, types: [java.util.List] */
    public 1LI A0s(C2k5 c2k5) {
        ArrayList A11;
        C2fr c2fr;
        11T.A0F(c2k5, 0);
        int ordinal = this.A0A.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                c2fr = this.A05;
            } else {
                if (ordinal != 2) {
                    throw 1BK.A1F();
                }
                FbUserSession fbUserSession = this.A09;
                AXh aXh = this.A02;
                if (aXh instanceof EmojiGradientModel) {
                    if (7zQ.A0e().A08()) {
                        EmojiGradientModel emojiGradientModel = this.A03;
                        String str = emojiGradientModel.emoji;
                        ImmutableList immutableList = emojiGradientModel.integerGradientColors;
                        float f = 95.0f;
                        if (this.A08) {
                            f = 70.0f;
                        }
                        A11 = C0s8.A11(new C8bj(null, this.A04, immutableList, str, f, 0));
                    } else {
                        C2cq A00 = C2cp.A00(c2k5.AeS(), 0);
                        A00.A0E("staticDefaultImageViewTag");
                        A00.A2Z(2132345583);
                        A00.A0L();
                        float f2 = 95.0f;
                        if (this.A08) {
                            f2 = 70.0f;
                        }
                        A00.A0z(f2);
                        A00.A0l(f2);
                        A11 = 11T.A03(A00.A2W());
                    }
                } else {
                    if (!(aXh instanceof Cij)) {
                        throw AnonymousClass001.A0L("Unsupported model");
                    }
                    c2fr = ((2fZ) 7zP.A0h(fbUserSession, c2k5.AeS(), 17067)).A0P(((Cij) aXh).A00);
                }
            }
            return A01(c2k5, c2fr);
        }
        String str2 = this.A07;
        if (str2 == null) {
            str2 = this.A03.emoji;
        }
        ImmutableList immutableList2 = this.A06;
        if (!CJI.A01(immutableList2)) {
            immutableList2 = this.A03.integerGradientColors;
        }
        boolean AEo = this.A01.AEo(BLB.A03, this.A05);
        float f3 = 95.0f;
        if (this.A08) {
            f3 = 70.0f;
        }
        A11 = C0s8.A11(new C8bj(null, this.A04, immutableList2, str2, f3, 0));
        if (AEo) {
            A11.add(A0M(c2k5));
        }
        return A0L(c2k5, A11);
    }
}
