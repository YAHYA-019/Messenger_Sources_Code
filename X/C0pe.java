package X;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

/* renamed from: X.0pe, reason: invalid class name */
/* loaded from: 0pe.class */
public class C0pe {
    public MappedByteBuffer A00;
    public final File A01;

    public C0pe(File file, int i) {
        if (i > 65536) {
            throw 0Pz.A04("Size too big for file: ", i);
        }
        this.A01 = file;
        RandomAccessFile A0I = AnonymousClass001.A0I(file);
        try {
            FileChannel channel = A0I.getChannel();
            try {
                this.A00 = channel.map(FileChannel.MapMode.READ_WRITE, 0L, i);
                if (channel.tryLock() == null) {
                    throw AnonymousClass001.A0G(String.format("Unable to acquire lock for app state log aslFile: %s", file.getCanonicalPath()));
                }
                channel.close();
                A0I.close();
            } finally {
            }
        } catch (Throwable th) {
            try {
                A0I.close();
                throw th;
            } finally {
                0Ug.A00(th, th);
            }
        }
    }

    public void mlockBuffer() {
    }
}
