package X;

import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.Lifecycle;
import com.facebook.auth.usersession.FbUserSession;
import com.facebook.distribgw.client.regionhint.DGWRegionHintManager;
import com.facebook.user.model.User;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.ListenableFuture;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;

/* loaded from: DB2.class */
public final class DB2 implements Callable {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public DB2(int i, Object obj, Object obj2, boolean z) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101, types: [androidx.lifecycle.Lifecycle, X.2sa, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v124, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.Object, java.util.Comparator] */
    /* JADX WARN: Type inference failed for: r308v2, types: [com.google.common.util.concurrent.ListenableFuture] */
    @Override // java.util.concurrent.Callable
    public /* bridge */ /* synthetic */ Object call() {
        ImmutableList A0b;
        if (this.A00 != 0) {
            CM2 cm2 = (CM2) this.A02;
            com.facebook.xapp.messaging.threadview.model.doc.Doc doc = (com.facebook.xapp.messaging.threadview.model.doc.Doc) this.A01;
            boolean z = this.A03;
            Uri uri = doc.A02;
            11T.A0A(uri);
            Object obj = new Object();
            if (11T.A0O(uri.getScheme(), DGWRegionHintManager.SERVICE_KEY_MSYS)) {
                ((C4Eo) 1Br.A0B(cm2.A02)).A00(uri).A03(new 9rY(5, doc, obj, cm2));
            } else if (z) {
                String str = doc.A05;
                11T.A0A(str);
                CM2.A00(uri, cm2, str);
            } else {
                CM2.A01(doc, cm2, cm2.A00.getContentResolver().openInputStream(uri));
            }
            return 04S.A00;
        }
        Bxl bxl = (Bxl) this.A02;
        FbUserSession fbUserSession = (FbUserSession) this.A01;
        boolean z2 = this.A03;
        1BY r0 = bxl.A01.A00;
        BpW bpW = (BpW) 1Bn.A0E((Context) null, r0, 67548);
        try {
            CCc cCc = bpW.A01;
            C00i c00i = bpW.A00;
            Object A03 = 1Bi.A03(66234);
            Integer num = 0S2.A0C;
            ?? r02 = C2sa.A00;
            1BL.A1H(cCc, c00i, A03);
            11T.A0F((Object) r02, 11);
            int i = 0;
            C1z1 c1z1 = C1z1.NOT_BLOCKED;
            if (z2) {
                i = 262144;
            }
            ?? A00 = CCc.A00(cCc, c1z1, num, (Long) null, i);
            ListenableFuture listenableFuture = A00;
            if (!r02.equals(r02)) {
                listenableFuture = BTa.A00((Lifecycle) r02, (ListenableFuture) A00);
            }
            Object obj2 = 47F.A00(c00i, listenableFuture, "OpFetchOrcaContactList failed", "OpFetchOrcaContactList failed", new AK5(A03, 10)).get();
            11T.A0A(obj2);
            A0b = (Collection) obj2;
        } catch (InterruptedException | ExecutionException e) {
            0fH.A0u("BlockedPeopleFetcher", "Cannot fetch contacts using msys", e);
            A0b = 1BK.A0b();
        }
        List A0b2 = 0QD.A0b(1BK.A17(A0b), (Comparator) new Object());
        ImmutableList.Builder A0h = 4YU.A0h();
        ArrayList A0s = AnonymousClass001.A0s();
        23F r03 = (23F) 1Lm.A07(fbUserSession, r0, 33102);
        Iterator it = A0b2.iterator();
        while (it.hasNext()) {
            User A0t = AbG.A0t(it);
            String str2 = A0t.A13;
            if (AbK.A0t(r03, str2) == null) {
                A0s.add(A0t);
            }
            String A1E = AbI.A1E(DateFormat.getDateInstance(), A0t.A0J);
            HashSet A0v = AnonymousClass001.A0v();
            String A13 = 7zL.A13(A0t);
            AbF.A1U(A13);
            boolean A0D = A0t.A0D();
            C1z1 A02 = A0t.A02();
            11T.A0A(A02);
            int ordinal = A02.ordinal();
            Integer num2 = ordinal != 2 ? ordinal != 1 ? 0S2.A00 : 0S2.A0C : 0S2.A01;
            HashSet A0z = 4YV.A0z("blockedType", A0v, A0v);
            C1pq.A08("blockedDate", A1E);
            A0h.m11011add((Object) new CIQ(num2, A1E, str2, A13, A0t.A1M, A0t.A1N, A0z, A0D, A0t.A29, A0t.A0E(), z2));
        }
        r03.A03(A0s);
        return 1Fj.A01(A0h);
    }
}
