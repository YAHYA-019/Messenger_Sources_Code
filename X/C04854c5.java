package X;

import com.facebook.stash.core.FileStash;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.4c5, reason: invalid class name and case insensitive filesystem */
/* loaded from: 4c5.class */
public final class C04854c5 extends 2Js {
    public final List A00;
    public final List A01;
    public final List A02;

    /* JADX WARN: Multi-variable type inference failed */
    public C04854c5(FileStash fileStash, List list) {
        super(fileStash);
        this.A01 = new LinkedList();
        this.A00 = new LinkedList();
        this.A02 = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            InterfaceC04704bq interfaceC04704bq = (InterfaceC04704bq) it.next();
            interfaceC04704bq.AAw(this);
            if (interfaceC04704bq.BTb(2)) {
                this.A01.add(interfaceC04704bq);
            }
            if (interfaceC04704bq.BTb(1)) {
                this.A00.add(interfaceC04704bq);
            }
            if (interfaceC04704bq.BTb(4)) {
                this.A02.add(interfaceC04704bq);
            }
        }
    }

    private void A00(String str, int i) {
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            ((InterfaceC04714br) it.next()).C0R(str, i, null);
        }
    }

    private void A01(String str, int i) {
        Iterator it = this.A01.iterator();
        while (it.hasNext()) {
            ((InterfaceC04714br) it.next()).C1w(str, i, null);
        }
    }

    private boolean A02(String str, int i) {
        List list = this.A02;
        boolean isEmpty = list.isEmpty();
        boolean remove = ((2Js) this).A00.remove(str, i);
        if (!isEmpty) {
            int i2 = 1;
            if (remove) {
                i2 = 2;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((InterfaceC04714br) it.next()).CGM(i, i2, str, null);
            }
        }
        return remove;
    }

    public File getFile(String str) {
        if (this.A00.isEmpty()) {
            return ((2Js) this).A00.getFile(str);
        }
        try {
            FileStash fileStash = ((2Js) this).A00;
            File file = fileStash.getFile(str);
            int i = 1;
            if (fileStash.hasKey(str)) {
                i = 6;
            }
            A00(str, i);
            return file;
        } catch (Throwable th) {
            A00(str, 0);
            throw th;
        }
    }

    public File insertFile(String str) {
        boolean isEmpty = this.A01.isEmpty();
        FileStash fileStash = ((2Js) this).A00;
        if (isEmpty) {
            return fileStash.insertFile(str);
        }
        int i = 0;
        if (fileStash.hasKey(str)) {
            i = 8;
        }
        try {
            return fileStash.insertFile(str);
        } finally {
            A01(str, i | 4 | 2);
        }
    }

    public InputStream read(String str) {
        if (this.A00.isEmpty()) {
            return ((2Js) this).A00.read(str);
        }
        try {
            InputStream read = ((2Js) this).A00.read(str);
            int i = 1;
            if (read != null) {
                i = 6;
            }
            A00(str, i);
            return read;
        } catch (Throwable th) {
            A00(str, 0);
            throw th;
        }
    }

    public byte[] readResourceToMemory(String str) {
        if (this.A00.isEmpty()) {
            return ((2Js) this).A00.readResourceToMemory(str);
        }
        int i = 0;
        int i2 = 1;
        try {
            byte[] readResourceToMemory = ((2Js) this).A00.readResourceToMemory(str);
            if (readResourceToMemory != null) {
                i2 = 2;
            }
            A00(str, i2);
            return readResourceToMemory;
        } catch (IOException e) {
            try {
                throw e;
            } catch (Throwable th) {
                th = th;
                i = 1;
                A00(str, i);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            A00(str, i);
            throw th;
        }
    }

    public boolean remove(String str) {
        return A02(str, 0);
    }

    public boolean remove(String str, int i) {
        return A02(str, i);
    }

    public OutputStream write(String str) {
        if (this.A01.isEmpty()) {
            return ((2Js) this).A00.write(str);
        }
        int i = 1;
        int i2 = 0;
        try {
            FileStash fileStash = ((2Js) this).A00;
            if (fileStash.hasKey(str)) {
                i2 = 8;
            }
            OutputStream write = fileStash.write(str);
            if (write != null) {
                i = i2 | 4 | 2;
            }
            A01(str, i);
            return write;
        } catch (IOException e) {
            try {
                throw e;
            } catch (Throwable th) {
                th = th;
                i2 = 1;
                A01(str, i2);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            A01(str, i2);
            throw th;
        }
    }

    public void write(String str, byte[] bArr) {
        boolean isEmpty = this.A01.isEmpty();
        FileStash fileStash = ((2Js) this).A00;
        if (isEmpty) {
            fileStash.write(str, bArr);
            return;
        }
        int i = 0;
        if (fileStash.hasKey(str)) {
            i = 8;
        }
        try {
            try {
                fileStash.write(str, bArr);
                A01(str, i | 2);
            } catch (IOException e) {
                int i2 = i | 1;
                throw e;
            }
        } catch (Throwable th) {
            A01(str, i);
            throw th;
        }
    }
}
