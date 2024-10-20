package com.facebook.messaging.litho.memory;

import X.11T;
import X.1Bq;
import X.1Br;
import X.2Et;
import X.2yD;
import X.2zJ;
import X.45Z;

/* loaded from: MessengerLithoMemoryTrimmer.class */
public final class MessengerLithoMemoryTrimmer implements 2Et {
    public final 1Br A00 = 1Bq.A00(16385);

    public void D5F(45Z r302) {
        2yD A07;
        long j;
        11T.A0F(r302, 0);
        switch (r302.ordinal()) {
            case 0:
                A07 = 1Br.A07(this.A00);
                j = 36325244251754990L;
                break;
            case 1:
            case 2:
                A07 = (2yD) this.A00.A00.get();
                j = 36325244251820527L;
                break;
            case 3:
                A07 = (2yD) this.A00.A00.get();
                j = 36325244251886064L;
                break;
            case 4:
            default:
                return;
            case 5:
                A07 = (2yD) this.A00.A00.get();
                j = 36325244251951601L;
                break;
            case 6:
                A07 = 1Br.A07(this.A00);
                j = 36325244252017138L;
                break;
            case 7:
                A07 = 1Br.A07(this.A00);
                j = 36325244252082675L;
                break;
            case 8:
                A07 = 1Br.A07(this.A00);
                j = 36325244252148212L;
                break;
            case 9:
                A07 = 1Br.A07(this.A00);
                j = 36325244252213749L;
                break;
        }
        if (A07.AZk(j)) {
            synchronized (2zJ.A01) {
                2zJ.A02.clear();
                2zJ.A04.clear();
                2zJ.A03.clear();
            }
        }
    }
}
