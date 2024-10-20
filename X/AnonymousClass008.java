package X;

import com.facebook.proxygen.utils.RequestDefragmentingOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.BufferOverflowException;
import java.nio.MappedByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.008, reason: invalid class name */
/* loaded from: 008.class */
public final class AnonymousClass008 extends 0FA {
    public final AnonymousClass007 A00;
    public final java.util.Map A02 = new ConcurrentHashMap();
    public final java.util.Map A01 = new ConcurrentHashMap();

    public AnonymousClass008(AnonymousClass007 anonymousClass007) {
        this.A00 = anonymousClass007;
    }

    public HashMap A00() {
        HashMap hashMap;
        HashMap hashMap2 = new HashMap();
        hashMap2.putAll(this.A02);
        AnonymousClass007 anonymousClass007 = this.A00;
        synchronized (anonymousClass007.A02) {
            Properties properties = new Properties();
            try {
                MappedByteBuffer mappedByteBuffer = anonymousClass007.A01.A00;
                mappedByteBuffer.position(0);
                InputStream inputStream = new InputStream();
                ((00B) inputStream).A00 = mappedByteBuffer;
                properties.load(inputStream);
            } catch (IOException e) {
                C0iy.A00().Bwu("MappedMapParseAll", e, null);
                0fH.A0v("lacrima", "Cannot parse mmapped values", e);
            }
            HashMap hashMap3 = new HashMap();
            for (C00C c00c : C00C.values()) {
                hashMap3.put(c00c.mShortKey, c00c.name());
            }
            hashMap = new HashMap();
            for (Map.Entry entry : properties.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append("");
                sb.append(hashMap3.get(entry.getKey()));
                String obj = sb.toString();
                StringBuilder sb2 = new StringBuilder();
                sb2.append("");
                sb2.append(entry.getValue());
                hashMap.put(obj, sb2.toString());
            }
        }
        hashMap2.putAll(hashMap);
        return hashMap2;
    }

    public void A01(C0g0 c0g0, C0gq c0gq) {
        String A0j = 0Pz.A0j(c0gq.prefix, "cadm_", c0g0.A00);
        AnonymousClass007 anonymousClass007 = this.A00;
        if (!anonymousClass007.A01(A0j)) {
            this.A02.remove(A0j);
            this.A01.remove(A0j);
            return;
        }
        C00C valueOf = C00C.valueOf(A0j);
        synchronized (anonymousClass007.A02) {
            Integer num = (Integer) anonymousClass007.A04.get(valueOf.mShortKey);
            if (num != null) {
                MappedByteBuffer mappedByteBuffer = anonymousClass007.A01.A00;
                mappedByteBuffer.position(num.intValue());
                mappedByteBuffer.put("#\n".getBytes(AnonymousClass007.A06));
            }
        }
    }

    public void A02(C0g0 c0g0, C0gq c0gq, String str) {
        MappedByteBuffer mappedByteBuffer;
        int i;
        java.util.Map map;
        String str2;
        String str3;
        Object[] objArr;
        String A0j = 0Pz.A0j(c0gq.prefix, "cadm_", c0g0.A00);
        AnonymousClass007 anonymousClass007 = this.A00;
        if (!anonymousClass007.A01(A0j)) {
            this.A02.put(A0j, str);
            return;
        }
        C00C valueOf = C00C.valueOf(A0j);
        synchronized (anonymousClass007.A02) {
            try {
                mappedByteBuffer = anonymousClass007.A01.A00;
                i = valueOf.mMaxLength;
                map = anonymousClass007.A04;
            } catch (BufferOverflowException e) {
                C0iy.A00().Bwu("MappedMapPut", e, null);
                0fH.A11("lacrima", "Cannot save mmapped value: %s", e, new Object[]{valueOf});
            }
            if (map.get(valueOf.mShortKey) == null) {
                String str4 = valueOf.mShortKey;
                int length = str4.length();
                int length2 = str.length();
                int i2 = length + length2 + 4;
                int i3 = anonymousClass007.A00;
                if (i2 > RequestDefragmentingOutputStream.BODY_BUFFER_SIZE - i3) {
                    str2 = "lacrima";
                    str3 = "Cannot save mmapped value: %s";
                    objArr = new Object[]{valueOf};
                } else {
                    map.put(str4, Integer.valueOf(i3));
                    anonymousClass007.A03.put(valueOf.mShortKey, Integer.valueOf(i));
                    if (length2 > i) {
                        str = str.substring(0, i);
                    }
                    AnonymousClass007.A00(valueOf, str, mappedByteBuffer, anonymousClass007.A00);
                    anonymousClass007.A00 = mappedByteBuffer.position();
                    mappedByteBuffer.put("#".getBytes(AnonymousClass007.A06));
                }
            } else {
                Integer num = (Integer) map.get(valueOf.mShortKey);
                C0k4.A00(num);
                int intValue = num.intValue();
                Integer num2 = (Integer) anonymousClass007.A03.get(valueOf.mShortKey);
                C0k4.A00(num2);
                int intValue2 = num2.intValue();
                if (str.length() > intValue2) {
                    str = str.substring(0, intValue2);
                }
                if (valueOf.mShortKey.length() + str.length() + 4 > RequestDefragmentingOutputStream.BODY_BUFFER_SIZE - intValue) {
                    str2 = "lacrima";
                    str3 = "Cannot save mmapped value: %s";
                    objArr = new Object[]{valueOf};
                } else {
                    AnonymousClass007.A00(valueOf, str, mappedByteBuffer, intValue);
                }
            }
            0fH.A17(str2, str3, objArr);
        }
    }
}
