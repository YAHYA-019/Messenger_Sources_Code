package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* loaded from: G39.class */
public final class G39 implements Runnable {
    public static final String __redex_internal_original_name = "LogsManager$dumpLogs$1";
    public final /* synthetic */ FIN A00;
    public final /* synthetic */ String A01;

    public G39(FIN fin, String str) {
        this.A00 = fin;
        this.A01 = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v64, types: [java.util.List] */
    @Override // java.lang.Runnable
    public final void run() {
        C0ty c0ty;
        FIN fin = this.A00;
        String str = this.A01;
        FIN fin2 = FIN.A09;
        ArrayList A0s = AnonymousClass001.A0s();
        File file = fin.A04;
        if (file == null) {
            11T.A0L("folder");
            throw 0Q8.createAndThrow();
        }
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            0AR r0 = new 0AR(listFiles);
            while (r0.hasNext()) {
                String name = ((File) r0.next()).getName();
                11T.A0A(name);
                List A03 = new C04t("_").A03(name, 0);
                if (!A03.isEmpty()) {
                    ListIterator A1F = AbH.A1F(A03);
                    while (A1F.hasPrevious()) {
                        if (C3o5.A06(A1F) != 0) {
                            c0ty = C3o5.A0V(A03, A1F);
                            break;
                        }
                    }
                }
                c0ty = C0ty.A00;
                String[] A0n = C3o5.A0n(c0ty);
                if (A0n.length == 2 && 11T.A0O(A0n[0], str)) {
                    A0s.add(A0n[1]);
                }
            }
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            FIN.A02(fin, str, AnonymousClass001.A0i(it), str);
        }
    }
}
