package kotlinx.serialization.encoding;

import X.5Yn;
import X.5Yv;
import X.5Za;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: Encoder.class */
public interface Encoder {
    5Za ABo(SerialDescriptor serialDescriptor);

    void APf(boolean z);

    void APh(byte b);

    void APi(char c);

    void APj(double d);

    void APl(SerialDescriptor serialDescriptor, int i);

    void APm(float f);

    Encoder APo(SerialDescriptor serialDescriptor);

    void APq(int i);

    void APs(long j);

    void APu();

    void APx(Object obj, 5Yv r2);

    void APy(short s);

    void APz(String str);

    5Yn BA6();
}
