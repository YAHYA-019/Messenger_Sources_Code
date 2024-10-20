package X;

import com.facebook.common.util.TriState;
import com.facebook.messaging.profilepicture.protocol.GetLoggedInUserProfilePicGraphQlResult;
import com.facebook.user.profilepic.PicSquare;
import com.facebook.user.profilepic.PicSquareUrlWithSize;

/* renamed from: X.Ape, reason: case insensitive filesystem */
/* loaded from: Ape.class */
public final class C1672Ape extends C4r3 {
    public static final String __redex_internal_original_name = "GetLoggedInUserProfilePicGraphQlMethod";
    public final 1qF A00;

    public C1672Ape() {
        super(AbI.A0G(), AbI.A0s());
        this.A00 = (1qF) 1Bi.A03(16824);
    }

    @Override // X.C4r4
    public /* bridge */ /* synthetic */ 2Jf A06(Object obj) {
        C30G A0H = AbF.A0H(82);
        1qF r0 = this.A00;
        A0H.A06("square_profile_pic_size_small", AbK.A01(r0));
        A0H.A06("square_profile_pic_size_big", AbK.A02(r0));
        A0H.A06("square_profile_pic_size_huge", AbK.A03(r0));
        return A0H;
    }

    @Override // X.C4r3
    public /* bridge */ /* synthetic */ Object A07(Object obj, Object obj2) {
        PicSquareUrlWithSize picSquareUrlWithSize = null;
        2JY r0 = (2JY) obj2;
        2JY A0B = 1BK.A0B(r0, 2JX.class, 3480, 1537606371);
        2JY r02 = (C10334t7) A0B.A0L(-424480887, C10334t7.class, 537206042);
        PicSquareUrlWithSize picSquareUrlWithSize2 = null;
        PicSquareUrlWithSize picSquareUrlWithSize3 = r02 != null ? new PicSquareUrlWithSize(r02.getIntValue(113126854), r02.getUri()) : null;
        2JY r03 = (C10334t7) A0B.A0L(-1998221310, C10334t7.class, 537206042);
        if (r03 != null) {
            picSquareUrlWithSize = new PicSquareUrlWithSize(r03.getIntValue(113126854), r03.getUri());
        }
        2JY r04 = (C10334t7) A0B.A0L(-1815128087, C10334t7.class, 537206042);
        if (r04 != null) {
            picSquareUrlWithSize2 = new PicSquareUrlWithSize(r04.getIntValue(113126854), r04.getUri());
        }
        return new GetLoggedInUserProfilePicGraphQlResult(TriState.valueOf(r0.A0L(3480, 2JX.class, 1537606371).getBooleanValue(-2143630922)), new PicSquare(picSquareUrlWithSize3, picSquareUrlWithSize, picSquareUrlWithSize2));
    }
}
