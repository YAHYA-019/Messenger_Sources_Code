package X;

import java.io.File;
import java.util.List;

/* loaded from: Kpl.class */
public final class Kpl {
    public final /* synthetic */ C22S A00;
    public final /* synthetic */ C3mD A01;
    public final /* synthetic */ 0CL A02;

    public Kpl(C22S c22s, C3mD c3mD, 0CL r304) {
        this.A02 = r304;
        this.A00 = c22s;
        this.A01 = c3mD;
    }

    public void A00() {
        0CL r0 = this.A02;
        ((C3RC) r0.element).A02("perform_mailbox_action_end");
        C22S c22s = this.A00;
        File A01 = c22s.A05.A01();
        C3mD c3mD = this.A01;
        LVM lvm = new LVM(c3mD);
        ((C3RC) r0.element).A02("file_tree_traversal_start");
        C0L3.A00(lvm, A01);
        ((C3RC) r0.element).A02("file_tree_traversal_end");
        c22s.A04.edit().putLong(1BJ.A00(2083), System.currentTimeMillis()).apply();
        long BHC = c3mD.BHC(lvm.A00);
        String A00 = 1BJ.A00(321);
        long j = 0;
        if (BHC == 0) {
            ((C3RC) r0.element).A02("nothing_to_delete_with_policy");
            0fH.A0j(A00, "Nothing to delete according cache eviction policy");
            ((C3RC) r0.element).A01(0, lvm.A01, 0L, true);
            return;
        }
        List<File> list = lvm.A04;
        LsJ.A00(c22s, list, 7);
        int i = 0;
        for (File file : list) {
            if (j > BHC) {
                break;
            }
            long length = file.length();
            if (file.delete()) {
                j += length;
                i++;
            }
        }
        StringBuilder A0k = AnonymousClass001.A0k();
        A0k.append("Cache Eviction complete. Stats: ");
        A0k.append(i);
        A0k.append(" files deleted, ");
        A0k.append(list.size());
        A0k.append(" files eligible for deletion, ");
        A0k.append(j);
        A0k.append(" bytes trimmed, ");
        A0k.append(BHC);
        A0k.append(" bytes requested by policy, Media Bank Size: ");
        A0k.append(lvm.A01);
        GOp.A1S(" bytes", A00, A0k);
        ((C3RC) r0.element).A01(i, lvm.A01, j, true);
        c22s.A01 = lvm.A01 - j;
    }
}
