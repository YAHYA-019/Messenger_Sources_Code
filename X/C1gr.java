package X;

import android.content.Context;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1gr, reason: invalid class name */
/* loaded from: 1gr.class */
public final class C1gr {
    public final File A00;

    public C1gr(Context context) {
        File dir = context.getDir("light_prefs", 0);
        this.A00 = dir == null ? AnonymousClass001.A0D(1MH.A01(context), "app_light_prefs") : dir;
    }

    public final HashMap A00(String str, boolean z) {
        1Zj r310;
        11T.A0F(str, 0);
        HashMap hashMap = new HashMap();
        File[] listFiles = this.A00.listFiles();
        if (listFiles == null) {
            listFiles = new File[0];
        }
        ArrayList arrayList = new ArrayList();
        for (File file : listFiles) {
            if (file.isDirectory()) {
                arrayList.add(file);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            File[] listFiles2 = ((File) it.next()).listFiles();
            11T.A0A(listFiles2);
            0QU.A0t(listFiles2.length == 0 ? C0ty.A00 : new C0rw(listFiles2), arrayList2);
        }
        ArrayList<File> arrayList3 = new ArrayList();
        for (Object obj : arrayList2) {
            if (((File) obj).isFile()) {
                arrayList3.add(obj);
            }
        }
        for (File file2 : arrayList3) {
            String name = file2.getName();
            if (z) {
                11T.A0A(name);
                if (0CV.A0b(name, "lsp", false)) {
                    String name2 = file2.getName();
                    11T.A0A(name2);
                    List A0M = 0CU.A0M(name2, new String[]{"."}, 4);
                    if (A0M.size() == 4 && 11T.A0O(A0M.get(0), "lsp") && 11T.A0O(A0M.get(3), str)) {
                        r310 = new 1Zj(1BK.A14(A0M, 2), 1BK.A14(A0M, 1));
                        hashMap.put(file2, r310);
                    }
                }
            } else if (str.equals(name)) {
                r310 = 1Zj.A02;
                hashMap.put(file2, r310);
            }
        }
        return hashMap;
    }
}
