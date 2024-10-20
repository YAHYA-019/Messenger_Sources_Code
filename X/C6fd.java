package X;

import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.6fd, reason: invalid class name */
/* loaded from: 6fd.class */
public abstract class C6fd {
    public static int A00 = 255;
    public static Boolean A01;

    public static boolean A00(1YC r301, AtomicInteger atomicInteger, int i) {
        if (A01 == null || A00 != i) {
            int andIncrement = atomicInteger.getAndIncrement();
            r301.A05("com.facebook.messaging.composer.avatar.plugins.stickersuggestions.StickerSuggestionsKillSwitch", "messaging.composer.avatar.stickersuggestions.StickerSuggestionsKillSwitch", andIncrement);
            try {
                try {
                    Boolean valueOf = Boolean.valueOf(((C6fe) 1Bn.A0A(66486)).A00().AZk(36321898472162205L));
                    A01 = valueOf;
                    A00 = i;
                    r301.A01(valueOf, (Exception) null, "messaging.composer.avatar.stickersuggestions.StickerSuggestionsKillSwitch", andIncrement);
                } catch (Exception e) {
                    throw e;
                }
            } catch (Throwable th) {
                r301.A01(A01, (Exception) null, "messaging.composer.avatar.stickersuggestions.StickerSuggestionsKillSwitch", andIncrement);
                throw th;
            }
        }
        return A01.booleanValue();
    }
}
