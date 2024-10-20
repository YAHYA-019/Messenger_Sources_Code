package X;

import android.os.Bundle;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.google.android.play.core.splitinstall.internal.zzbm;
import com.google.android.play.core.splitinstall.zzbh;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: K8v.class */
public final class K8v extends C51l {
    public static final String __redex_internal_original_name = "zzan";
    public final /* synthetic */ 4FE A00;
    public final /* synthetic */ 3K6 A01;
    public final /* synthetic */ C2ug A02;
    public final /* synthetic */ Collection A03;
    public final /* synthetic */ Collection A04;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public K8v(4FE r302, 4FE r303, 3K6 r304, C2ug c2ug, Collection collection, Collection collection2) {
        super(r302);
        this.A02 = c2ug;
        this.A03 = collection;
        this.A04 = collection2;
        this.A01 = r304;
        this.A00 = r303;
    }

    @Override // X.C51l
    public final void A00() {
        Collection collection = this.A03;
        ArrayList A01 = C2ug.A01(collection);
        Collection collection2 = this.A04;
        ArrayList A0t = AnonymousClass001.A0t(collection2.size());
        Iterator it = collection2.iterator();
        while (it.hasNext()) {
            String A0i = AnonymousClass001.A0i(it);
            Bundle A05 = 1BK.A05();
            A05.putString("language", A0i);
            A0t.add(A05);
        }
        A01.addAll(A0t);
        try {
            List<KRp> list = this.A01.A00;
            list.add(new K8s(2, System.currentTimeMillis()));
            C2ug c2ug = this.A02;
            IInterface iInterface = c2ug.A00.A01;
            String str = c2ug.A01;
            Bundle A052 = 1BK.A05();
            A052.putInt("playcore_version_code", 11004);
            ArrayList A0s = AnonymousClass001.A0s();
            for (KRp kRp : list) {
                Bundle A053 = 1BK.A05();
                K8s k8s = (K8s) kRp;
                A053.putInt("event_type", k8s.A00);
                A053.putLong("event_timestamp", k8s.A01);
                A0s.add(A053);
            }
            A052.putParcelableArrayList("event_timestamps", 1BK.A17(A0s));
            zzbh zzbhVar = new zzbh(this.A00, c2ug);
            0FI.A09(-904801938, 0FI.A03(1330804082));
            zzbm zzbmVar = (zzbm) iInterface;
            int A03 = 0FI.A03(377966662);
            Parcel A00 = zzbmVar.A00();
            A00.writeString(str);
            A00.writeTypedList(A01);
            JQy.A13(A052, zzbhVar, A00);
            zzbmVar.A01(A00, 2);
            0FI.A09(1854901886, A03);
        } catch (RemoteException e) {
            C2ug.A02.A05(e, 1BJ.A00(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH), collection, collection2);
            this.A00.A02(AnonymousClass001.A0U(e));
        }
    }
}
