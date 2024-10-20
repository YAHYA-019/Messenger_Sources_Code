package X;

import android.database.sqlite.SQLiteStatement;
import com.google.common.base.Splitter;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;

/* renamed from: X.3Vx, reason: invalid class name */
/* loaded from: 3Vx.class */
public final class C3Vx implements 0LF {
    public SQLiteStatement A00;
    public boolean A01;
    public final Deque A03 = new ArrayDeque(2);
    public final java.util.Map A02 = AnonymousClass001.A0u();

    public void CY5(File file) {
        Deque deque = this.A03;
        if (deque.isEmpty()) {
            return;
        }
        deque.pop();
    }

    public void CYH(File file) {
        Deque deque = this.A03;
        if (deque.size() >= 2) {
            0fH.A0T(C3Vx.class, "unexpected directory %s", new Object[]{file.getPath()});
        }
        if (this.A01) {
            this.A01 = false;
        } else {
            deque.push(file.getName());
        }
    }

    public void DA4(File file) {
        Class cls;
        Object[] objArr;
        String str;
        Deque deque = this.A03;
        if (deque.size() != 2) {
            cls = C3Vx.class;
            objArr = new Object[]{file.getPath()};
            str = "unexpected file %s";
        } else {
            Splitter on = Splitter.on('.');
            String name = file.getName();
            name.getClass();
            ArrayList A02 = 1JW.A02(new Splitter.AnonymousClass5(name));
            if (A02.size() == 2 && 5R2.A00.get(A02.get(0)) != null) {
                String A0W = 0Pz.A0W((String) deque.getFirst(), (String) A02.get(0));
                java.util.Map map = this.A02;
                if (map.containsKey(A0W)) {
                    long A05 = AnonymousClass001.A05(map.get(A0W));
                    long lastModified = file.lastModified();
                    cls = C3Vx.class;
                    objArr = new Object[]{deque.getFirst(), A02.get(0)};
                    if (A05 > lastModified) {
                        str = "A more recent file was found for sticker id %s asset type %s, using that file.";
                    } else {
                        0fH.A0T(cls, "Replacing less recent file for sticker id %s asset type %s.", objArr);
                    }
                }
                this.A00.clearBindings();
                this.A00.bindString(1, (String) deque.getLast());
                this.A00.bindString(2, (String) deque.getFirst());
                this.A00.bindString(3, (String) A02.get(0));
                this.A00.bindString(4, 0Pz.A0W("image/", (String) A02.get(1)));
                this.A00.bindString(5, file.getPath());
                SQLiteStatement sQLiteStatement = this.A00;
                C01m.A00(288004993);
                sQLiteStatement.execute();
                C01m.A00(14156912);
                0fH.A0T(C3Vx.class, "Inserted %s asset for sticker id %s into db.", new Object[]{A02.get(0), deque.getFirst()});
                AnonymousClass001.A18(A0W, file.lastModified(), map);
                return;
            }
            cls = C3Vx.class;
            objArr = new Object[]{file.getPath()};
            str = "unexpected file name %s";
        }
        0fH.A0T(cls, str, objArr);
    }
}
