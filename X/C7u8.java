package X;

import com.facebook.messaging.model.messages.Message;

/* renamed from: X.7u8, reason: invalid class name */
/* loaded from: 7u8.class */
public final class C7u8 {
    public static final C7u8 A00 = new Object();

    public final boolean A00(6G3 r302, AnonymousClass624 anonymousClass624) {
        11T.A0F(anonymousClass624, 0);
        if (!(anonymousClass624 instanceof AnonymousClass622)) {
            return false;
        }
        AnonymousClass622 anonymousClass622 = (AnonymousClass622) anonymousClass624;
        if ((anonymousClass622.A00() != C1q8.A0N && anonymousClass622.A00() != C1q8.A0M) || anonymousClass622.A0k) {
            return false;
        }
        String str = r302.BFT().AgN().A02;
        Message message = anonymousClass622.A03;
        return str == null ? 6Bl.A04(message.A1m) : str.equals(4YU.A0x(message));
    }
}
