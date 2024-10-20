package X;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.play.core.splitinstall.internal.zzbm;
import com.google.android.play.core.splitinstall.zzbh;
import java.util.ArrayList;
import java.util.List;

/* loaded from: K8t.class */
public final class K8t extends C51l {
    public static final String __redex_internal_original_name = "zzap";
    public final /* synthetic */ 4FE A00;
    public final /* synthetic */ C2ug A01;
    public final /* synthetic */ List A02;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8t(4FE r302, 4FE r303, C2ug c2ug, List list) {
        super(r302);
        this.A01 = c2ug;
        this.A02 = list;
        this.A00 = r303;
    }

    @Override // X.C51l
    public final void A00() {
        try {
            C2ug c2ug = this.A01;
            IInterface iInterface = c2ug.A00.A01;
            String str = c2ug.A01;
            ArrayList A01 = C2ug.A01(this.A02);
            Bundle A05 = 1BK.A05();
            A05.putInt("playcore_version_code", 11004);
            zzbh zzbhVar = new zzbh(this.A00, c2ug);
            0FI.A09(-1474874644, 0FI.A03(892919642));
            zzbm zzbmVar = (zzbm) iInterface;
            int A03 = 0FI.A03(33175400);
            Parcel A00 = zzbmVar.A00();
            A00.writeString(str);
            A00.writeTypedList(A01);
            JQy.A13(A05, zzbhVar, A00);
            zzbmVar.A01(A00, 7);
            0FI.A09(202285664, A03);
        } catch (RemoteException e) {
            C2ug.A02.A05(e, 1BJ.A00(1228), this.A02);
            this.A00.A02(AnonymousClass001.A0U(e));
        }
    }
}
