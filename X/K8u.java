package X;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.zzbm;
import com.google.android.play.core.splitinstall.zzbh;

/* loaded from: K8u.class */
public final class K8u extends C51l {
    public static final String __redex_internal_original_name = "zzav";
    public final /* synthetic */ int A00;
    public final /* synthetic */ 4FE A01;
    public final /* synthetic */ C2ug A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8u(4FE r302, 4FE r303, C2ug c2ug, int i) {
        super(r302);
        this.A02 = c2ug;
        this.A00 = i;
        this.A01 = r303;
    }

    @Override // X.C51l
    public final void A00() {
        try {
            C2ug c2ug = this.A02;
            IInterface iInterface = c2ug.A00.A01;
            String str = c2ug.A01;
            int i = this.A00;
            Bundle A05 = 1BK.A05();
            A05.putInt("playcore_version_code", 11004);
            zzbh zzbhVar = new zzbh(this.A01, c2ug);
            0FI.A09(-1826281722, 0FI.A03(2144096588));
            zzbm zzbmVar = (zzbm) iInterface;
            int A03 = 0FI.A03(676484940);
            Parcel A00 = zzbmVar.A00();
            A00.writeString(str);
            A00.writeInt(i);
            JQy.A13(A05, zzbhVar, A00);
            zzbmVar.A01(A00, 4);
            0FI.A09(-1017211677, A03);
        } catch (RemoteException e) {
            C2ug.A02.A05(e, 1BJ.A00(1092), AnonymousClass001.A1a(this.A00));
            this.A01.A02(AnonymousClass001.A0U(e));
        }
    }
}
