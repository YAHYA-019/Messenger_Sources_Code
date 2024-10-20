package X;

import com.facebook.fbavatar.cdsavatareditor.richavatarretextureview.impl.AvatarRetextureSparkPreviewController;
import com.facebook.messaging.encryptedbackups.passkey.vdapi.EbPasskeySetupApi;

/* loaded from: Lzk.class */
public final class Lzk extends 0DP {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public final int A0A;
    public final Object A0B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Lzk(Object obj, 0DR r303, int i) {
        super(r303);
        this.A0A = i;
        this.A0B = obj;
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.A0A;
        this.A09 = obj;
        this.A00 |= (-1) << (-1);
        Object obj2 = this.A0B;
        return i != 0 ? ((EbPasskeySetupApi) obj2).A06(null, null, null, null, null, this) : ((AvatarRetextureSparkPreviewController) obj2).A01(null, null, null, null, null, this, null);
    }
}
