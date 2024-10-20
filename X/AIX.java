package X;

import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeyRestoreApi;
import com.facebook.messaging.montage.composer.magicmod.service.MagicModGenerateImageService;

/* loaded from: AIX.class */
public final class AIX extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public final int A08;
    public final Object A09;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AIX(Object obj, 0DR r303, int i) {
        super(r303);
        this.A08 = i;
        this.A09 = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A08;
        this.A07 = obj;
        this.A00 |= (-1) << (-1);
        Object obj2 = this.A09;
        switch (i) {
            case 0:
                return ((EbPasskeyRestoreApi) obj2).A06(null, null, null, this);
            case 1:
                return ((AI1) obj2).emit(null, this);
            default:
                return ((MagicModGenerateImageService) obj2).A04(null, null, null, this);
        }
    }
}
