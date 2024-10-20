package com.fasterxml.jackson.datatype.guava.deser;

import X.0Pz;
import X.1U9;
import X.AnonymousClass001;
import X.C1U8;
import X.C27T;
import com.fasterxml.jackson.databind.deser.std.FromStringDeserializer;
import com.google.common.base.Preconditions;
import java.util.Locale;

/* loaded from: HashCodeDeserializer.class */
public class HashCodeDeserializer extends FromStringDeserializer {
    public static final HashCodeDeserializer A00 = new HashCodeDeserializer();
    public static final long serialVersionUID = 1;

    public HashCodeDeserializer() {
        super(1U9.class);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.FromStringDeserializer
    public /* bridge */ /* synthetic */ Object A14(C27T c27t, String str) {
        int i;
        int i2;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        int length = lowerCase.length();
        Preconditions.checkArgument(length >= 2, "input string (%s) must have at least 2 characters", lowerCase);
        Preconditions.checkArgument(length % 2 == 0, "input string (%s) must have an even number of characters", lowerCase);
        byte[] bArr = new byte[length / 2];
        for (int i3 = 0; i3 < length; i3 += 2) {
            char charAt = lowerCase.charAt(i3);
            if (charAt >= '0') {
                if (charAt <= '9') {
                    i = charAt - '0';
                } else if (charAt >= 'a' && charAt <= 'f') {
                    i = (charAt - 'a') + 10;
                }
                int i4 = i << 4;
                char charAt2 = lowerCase.charAt(i3 + 1);
                if (charAt2 >= '0') {
                    if (charAt2 <= '9') {
                        i2 = charAt2 - '0';
                    } else if (charAt2 >= 'a' && charAt2 <= 'f') {
                        i2 = (charAt2 - 'a') + 10;
                    }
                    bArr[i3 / 2] = (byte) (i4 + i2);
                }
                throw AnonymousClass001.A0L(0Pz.A0J("Illegal hexadecimal character: ", charAt2));
            }
            throw AnonymousClass001.A0L(0Pz.A0J("Illegal hexadecimal character: ", charAt));
        }
        return new C1U8(bArr);
    }
}
