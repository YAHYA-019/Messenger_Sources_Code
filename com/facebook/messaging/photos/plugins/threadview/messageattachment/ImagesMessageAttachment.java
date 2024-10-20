package com.facebook.messaging.photos.plugins.threadview.messageattachment;

import X.1Iw;
import X.5zD;
import X.66H;
import X.7Y7;
import X.7Y8;
import X.89Z;
import X.AnonymousClass622;
import X.C62r;
import X.C62u;
import X.C89a;
import com.facebook.auth.usersession.FbUserSession;
import java.util.BitSet;

/* loaded from: ImagesMessageAttachment.class */
public final class ImagesMessageAttachment {
    public static final 89Z A00(FbUserSession fbUserSession, 1Iw r302, 5zD r303, C62r c62r, C62u c62u, 7Y8 r306, 7Y7 r307, AnonymousClass622 anonymousClass622, 66H[] r309, boolean[] zArr, boolean z, boolean z2, boolean z3, boolean z4) {
        C89a c89a = new C89a(r302, new 89Z());
        89Z r0 = c89a.A01;
        r0.A00 = fbUserSession;
        BitSet bitSet = c89a.A02;
        bitSet.set(0);
        r0.A07 = anonymousClass622;
        bitSet.set(3);
        r0.A01 = r303;
        bitSet.set(6);
        r0.A02 = c62r;
        bitSet.set(4);
        r0.A03 = c62u;
        bitSet.set(5);
        r0.A08 = z;
        bitSet.set(1);
        r0.A09 = z2;
        bitSet.set(2);
        r0.A05 = r307;
        r0.A04 = r306;
        r0.A0F = zArr;
        r0.A0E = r309;
        r0.A0D = z3;
        r0.A0C = z4;
        return c89a.A2V();
    }
}
