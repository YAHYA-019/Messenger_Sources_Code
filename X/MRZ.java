package X;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;

/* loaded from: MRZ.class */
public interface MRZ extends MQv, ReadableByteChannel {
    LwX ACc();

    boolean ARO();

    LwX Aa7();

    long BOb(byte b);

    long BOc(Lix lix);

    InputStream BPa();

    byte[] Caw(long j);

    Lix Cax(long j);

    long Cb2();

    int Cb3();

    short CbA();

    String CbC();

    String CbD(long j);

    boolean Cgi(long j);

    void ChH(long j);

    int CkH(LyF lyF);

    void D0k(long j);

    byte readByte();

    int readInt();

    short readShort();
}
