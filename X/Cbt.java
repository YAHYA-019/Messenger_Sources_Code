package X;

import com.facebook.common.callercontext.CallerContext;
import com.facebook.litho.LithoView;
import com.facebook.messaging.nativepagereply.plugins.filters.filtereditemsupplier.FilteredItemSupplierImplementation;
import com.facebook.mig.scheme.interfaces.MigColorScheme;
import com.facebook.widget.listview.EmptyListViewItem;
import com.google.common.util.concurrent.ListenableFuture;

/* loaded from: Cbt.class */
public final class Cbt implements 2TV {
    public final int A00;
    public final Object A01;

    public Cbt(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:88:0x0214, code lost:
    
        if (r307 == null) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void C47(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 904
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cbt.C47(java.lang.Object, java.lang.Object):void");
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v214, types: [androidx.fragment.app.Fragment, X.AlG] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void C4X(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 2214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cbt.C4X(java.lang.Object, java.lang.Object):void");
    }

    public /* bridge */ /* synthetic */ void C4n(ListenableFuture listenableFuture, Object obj) {
        2TV r305;
        switch (this.A00) {
            case 9:
                C1550Al5 c1550Al5 = (C1550Al5) this.A01;
                LithoView lithoView = c1550Al5.A01;
                8TA A00 = C8nk.A00(lithoView.A09);
                MigColorScheme migColorScheme = c1550Al5.A06;
                A00.A2Y(migColorScheme);
                A00.A01.A00 = migColorScheme.B4i();
                lithoView.A0y(A00.A2W());
                r305 = c1550Al5.A00;
                break;
            case 10:
            case 13:
            case 15:
            case 16:
            default:
                return;
            case 11:
                FilteredItemSupplierImplementation filteredItemSupplierImplementation = (FilteredItemSupplierImplementation) this.A01;
                AbU abU = AbU.A02;
                filteredItemSupplierImplementation.A04 = filteredItemSupplierImplementation.A03;
                filteredItemSupplierImplementation.A03 = abU;
                filteredItemSupplierImplementation.A0A.A00("FILTERED_THREAD_LIST", "filtered thread list async loading started");
                return;
            case 12:
                AlL alL = (AlL) this.A01;
                BJ9 bj9 = alL.A07;
                0S2.A00.getClass();
                EmptyListViewItem emptyListViewItem = bj9.A04;
                emptyListViewItem.A0D(2131954897);
                emptyListViewItem.A0F(true);
                emptyListViewItem.setVisibility(0);
                bj9.A03.setVisibility(8);
                r305 = alL.A04;
                break;
            case 14:
                Bmd bmd = ((CM8) this.A01).A01;
                if (bmd != null) {
                    DIe dIe = bmd.A01;
                    B7m b7m = ((CpB) dIe).A00;
                    if (b7m != null) {
                        b7m.A0d(dIe, true);
                        return;
                    }
                    return;
                }
                return;
            case 17:
            case 18:
                AmD amD = (AmD) this.A01;
                AbU abU2 = AbU.A02;
                CallerContext callerContext = AmD.A0V;
                amD.A0C = abU2;
                return;
        }
        if (r305 != null) {
            r305.C4n(listenableFuture, obj);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x02f2, code lost:
    
        if (r0.equals("create_mode") != false) goto L26;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0010. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x07aa  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0b3b  */
    /* JADX WARN: Type inference failed for: r0v467, types: [X.DK4] */
    /* JADX WARN: Type inference failed for: r0v486, types: [X.DK4] */
    /* JADX WARN: Type inference failed for: r0v502, types: [X.DK4] */
    /* JADX WARN: Type inference failed for: r0v518, types: [X.DK4] */
    /* JADX WARN: Type inference failed for: r0v540, types: [X.DK4] */
    /* JADX WARN: Type inference failed for: r304v12, types: [androidx.fragment.app.Fragment, X.Akt] */
    /* JADX WARN: Type inference failed for: r304v14, types: [androidx.fragment.app.Fragment, X.Akt] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* bridge */ /* synthetic */ void C9D(java.lang.Object r302, java.lang.Object r303) {
        /*
            Method dump skipped, instructions count: 3246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Cbt.C9D(java.lang.Object, java.lang.Object):void");
    }
}
