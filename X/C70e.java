package X;

import com.facebook.graphql.enums.GraphQLStickerType;
import com.facebook.stickers.model.Sticker;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.70e, reason: invalid class name */
/* loaded from: 70e.class */
public final class C70e implements C5g0 {
    public final 1Br A00 = 1Bu.A00(49988);

    @Override // X.C5g0
    public List AmB(C5fv c5fv) {
        Sticker sticker;
        if (!(c5fv instanceof 5gP) || (sticker = ((5gP) c5fv).A00) == null) {
            return C0ty.A00;
        }
        ArrayList A0s = AnonymousClass001.A0s();
        C00i c00i = this.A00.A00;
        c00i.get();
        if (sticker.A0B == GraphQLStickerType.AVATAR) {
            A0s.add(HCE.A03);
        }
        c00i.get();
        if (6Bl.A02(sticker)) {
            A0s.add(HCE.A0X);
        }
        if (6Bl.A00(sticker)) {
            A0s.add(HCE.A01);
            if (6Bl.A03(sticker)) {
                A0s.add(HCE.A02);
            }
        }
        8Nx AxW = c5fv.AxW(7wF.A00);
        if ((AxW != null ? AxW.A01 : null) == 0S2.A00) {
            A0s.add(HCE.A0A);
        }
        return A0s;
    }
}
