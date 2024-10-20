package X;

import java.nio.ByteBuffer;
import kotlin.jvm.functions.Function2;

/* loaded from: MK9.class */
public interface MK9 {
    void init(MFk mFk, Function2 function2);

    boolean start();

    void stop();

    void write(int i, int i2, ByteBuffer byteBuffer, int i3);
}
